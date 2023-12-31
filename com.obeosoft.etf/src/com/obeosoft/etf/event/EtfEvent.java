package com.obeosoft.etf.event;

import org.eclipse.core.runtime.Platform;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventType;
import org.eclipse.tracecompass.tmf.core.event.TmfEvent;
import org.eclipse.tracecompass.tmf.core.timestamp.ITmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

public class EtfEvent extends TmfEvent{

	private final String fDescription;
    private final String fSource;
    private final String fTarget;

    /**
     * Standard constructor.
     *
     * @param trace
     *            the parent trace
     * @param rank
     *            the event rank
     * @param timestamp
     *            the event timestamp
     * @param source
     *            the event source
     * @param type
     *            the event type
     * @param description
     *            a description of the type
     * @param content
     *            the event content (payload)
     * @param target
     *            the event reference
     */
    public EtfEvent(final ITmfTrace trace,
            final long rank,
            final ITmfTimestamp timestamp,
            final String source,
            final ITmfEventType type,
            final String description,
            final ITmfEventField content,
            final String target) {
        super(trace, rank, timestamp, type, content);
        fDescription = description;
        fSource = source;
        fTarget = target;
    }

    /**
     * Gets a description
     *
     * @return the description
     */
    public String getEventDescription() {
        return fDescription;
    }

    @Override
    public <T> T getAdapter(Class<T> adapterType) {
        // Force loading the adapters otherwise some plugins might not load
        Object adatper = Platform.getAdapterManager().loadAdapter(this, adapterType.getName());
        return adapterType.cast(adatper);
    }

    /**
     * Returns the source of this event.
     *
     * @return This event's source
     */
    public String getSource() {
        return fSource;
    }

    /**
     * Returns the target of this event.
     *
     * @return This event's target
     */
    public String getTarget() {
        return fTarget;
    }
	
}
