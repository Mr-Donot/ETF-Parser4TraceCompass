package com.obeosoft.etf.analysis;

import static org.eclipse.tracecompass.common.core.NonNullUtils.checkNotNull;


import org.eclipse.tracecompass.tmf.core.exceptions.TmfAnalysisException;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.TmfStateSystemAnalysisModule;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

import com.obeosoft.etf.trace.EtfTrace;

public class EtfAnalysisModule extends TmfStateSystemAnalysisModule {

    @Override
    public boolean setTrace(ITmfTrace trace) throws TmfAnalysisException {
        if (!(trace instanceof EtfTrace)) {
            return false;
        }
        return super.setTrace(trace);
    }

    /**
     * @since 2.1
     */
    @Override
    public EtfTrace getTrace() {
        return (EtfTrace) super.getTrace();
    }

    @Override
    protected ITmfStateProvider createStateProvider() {
        return new EtfStateProvider(checkNotNull(getTrace()));
    }
}
