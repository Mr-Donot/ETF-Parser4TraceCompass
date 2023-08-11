package com.obeosoft.etf.trace;

import org.eclipse.jdt.annotation.Nullable;

import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.aspect.ITmfEventAspect;
import org.eclipse.tracecompass.tmf.core.event.aspect.TmfBaseAspects;
import org.eclipse.tracecompass.tmf.core.event.aspect.TmfContentFieldAspect;

import com.google.common.collect.ImmutableList;
import com.obeosoft.etf.event.EtfEvent;

public class EtfEventAspects {

	private EtfEventAspects() {}

    private static final Iterable<ITmfEventAspect<?>> BTF_ASPECTS =
            ImmutableList.of(
                    TmfBaseAspects.getTimestampAspect(),
                    new BtfSourceAspect(),
                    new TmfContentFieldAspect(EtfColumnNames.SOURCE_INSTANCE.toString(), EtfColumnNames.SOURCE_INSTANCE.toString()),
                    TmfBaseAspects.getEventTypeAspect(),
                    new BtfTargetAspect(),
                    new TmfContentFieldAspect(EtfColumnNames.TARGET_INSTANCE.toString(), EtfColumnNames.TARGET_INSTANCE.toString()),
                    new TmfContentFieldAspect(EtfColumnNames.EVENT.toString(), EtfColumnNames.EVENT.toString()),
                    new TmfContentFieldAspect(EtfColumnNames.NOTES.toString(), EtfColumnNames.NOTES.toString())
                    );

    /**
     * The "source" aspect, whose value comes from {@link ITmfEvent#getSource()}
     */
    private static class BtfSourceAspect implements ITmfEventAspect<String> {

        @Override
        public String getName() {
            return EtfColumnNames.SOURCE.toString();
        }

        @Override
        public String getHelpText() {
            return EMPTY_STRING;
        }

        @Override
        public @Nullable String resolve(ITmfEvent event) {
            if (!(event instanceof EtfEvent)) {
                return EMPTY_STRING;
            }
            String ret = ((EtfEvent) event).getSource();
            return (ret == null ? EMPTY_STRING : ret);
        }
    }

    /**
     * The "target" aspect, taking its value from
     * {@link ITmfEvent#getTarget()}.
     */
    private static class BtfTargetAspect implements ITmfEventAspect<String> {

        @Override
        public String getName() {
             return EtfColumnNames.TARGET.toString();
        }

        @Override
        public String getHelpText() {
            return EMPTY_STRING;
        }

        @Override
        public @Nullable String resolve(ITmfEvent event) {
            if (!(event instanceof EtfEvent)) {
                return EMPTY_STRING;
            }
            String ret = ((EtfEvent) event).getTarget();
            return (ret == null ? EMPTY_STRING : ret);
        }
    }

    /**
     * Return the event aspects defined for BTF traces.
     *
     * @return The aspects
     */
    public static Iterable<ITmfEventAspect<?>> getAspects() {
        return BTF_ASPECTS;
    }
}
