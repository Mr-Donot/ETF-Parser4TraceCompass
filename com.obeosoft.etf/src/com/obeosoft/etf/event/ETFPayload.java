package com.obeosoft.etf.event;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.tracecompass.tmf.core.event.TmfEventField;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import com.obeosoft.etf.core.Messages;

public class ETFPayload {
	

    public static final @NonNull String DESCRIPTION = "description"; //$NON-NLS-1$

    private static final Map<String, String> EVENT_DESCRIPTIONS;
    private static final String EMPTY = ""; //$NON-NLS-1$
    private static final Map<String, TmfEventField[]> FIELDS;
    private static final TmfEventField[] EMPTY_DESCRIPTION = new TmfEventField[] { new TmfEventField(DESCRIPTION, EMPTY, null) };

    static {
        ImmutableMap.Builder<String, String> builder = new Builder<>();
        builder.put("activate", Messages.ETFPayload_Activate); //$NON-NLS-1$
        builder.put("start", Messages.ETFPayload_Start); //$NON-NLS-1$
        builder.put("preempt", Messages.ETFPayload_Preempt); //$NON-NLS-1$
        builder.put("resume", Messages.ETFPayload_Resume); //$NON-NLS-1$
        builder.put("terminate", Messages.ETFPayload_Terminate); //$NON-NLS-1$
        builder.put("poll", Messages.ETFPayload_Poll); //$NON-NLS-1$
        builder.put("run", Messages.ETFPayload_Run); //$NON-NLS-1$
        builder.put("park", Messages.ETFPayload_Park); //$NON-NLS-1$
        builder.put("poll_parking", Messages.ETFPayload_PollParking); //$NON-NLS-1$
        builder.put("release_parking", Messages.ETFPayload_ReleaseParking); //$NON-NLS-1$
        builder.put("wait", Messages.ETFPayload_Wait); //$NON-NLS-1$
        builder.put("release", Messages.ETFPayload_Release); //$NON-NLS-1$
        builder.put("deadline", EMPTY); //$NON-NLS-1$
        builder.put("mpalimitexceeded", Messages.ETFPayload_MapLimitExceeded); //$NON-NLS-1$
        builder.put("boundedmigration", Messages.ETFPayload_BoundedMigration); //$NON-NLS-1$
        builder.put("phasemigration", Messages.ETFPayload_PhaseMigration); //$NON-NLS-1$
        builder.put("fullmigration", Messages.ETFPayload_FullMigration); //$NON-NLS-1$
        builder.put("enforcedmigration", Messages.ETFPayload_EnforcedMigration); //$NON-NLS-1$
        // not yet defined
        builder.put("execute_idle", EMPTY); //$NON-NLS-1$
        builder.put("processterminate", EMPTY); //$NON-NLS-1$
        builder.put("idle", EMPTY); //$NON-NLS-1$
        builder.put("schedule", EMPTY); //$NON-NLS-1$
        builder.put("trigger", EMPTY); //$NON-NLS-1$
        builder.put("schedulepoint", EMPTY); //$NON-NLS-1$
        builder.put("requestsemaphore", EMPTY); //$NON-NLS-1$
        builder.put("queued", EMPTY); //$NON-NLS-1$
        builder.put("lock", EMPTY); //$NON-NLS-1$
        builder.put("assigned", EMPTY); //$NON-NLS-1$
        builder.put("unlock", EMPTY); //$NON-NLS-1$
        builder.put("released", EMPTY); //$NON-NLS-1$
        builder.put("ready", EMPTY); //$NON-NLS-1$
        builder.put("free", EMPTY); //$NON-NLS-1$
        builder.put("set_frequence", EMPTY); //$NON-NLS-1$
        builder.put("processactivate", EMPTY); //$NON-NLS-1$
        builder.put("execute", EMPTY); //$NON-NLS-1$
        builder.put("idle_execution", EMPTY); //$NON-NLS-1$
        builder.put("suspend", EMPTY); //$NON-NLS-1$
        builder.put("read", EMPTY); //$NON-NLS-1$
        builder.put("write", EMPTY); //$NON-NLS-1$
        builder.put("processpolling", EMPTY); //$NON-NLS-1$
        builder.put("execute_waiting", EMPTY); //$NON-NLS-1$
        builder.put("wait_postexecution", EMPTY); //$NON-NLS-1$
        builder.put("waiting", EMPTY); //$NON-NLS-1$
        builder.put("overfull", EMPTY); //$NON-NLS-1$
        builder.put("full", EMPTY); //$NON-NLS-1$

        EVENT_DESCRIPTIONS = builder.build();
        ImmutableMap.Builder<String, TmfEventField[]> fieldBuilder = new Builder<>();
        for (Entry<String, String> entry : EVENT_DESCRIPTIONS.entrySet()) {
            fieldBuilder.put(entry.getKey(), new TmfEventField[] { new TmfEventField(DESCRIPTION, entry.getValue(), null) });
        }
        FIELDS = fieldBuilder.build();
    }

    /**
     * gets the description of a field
     *
     * @param key
     *            the field name
     * @return the description
     */
    public static TmfEventField[] getFieldDescription(String key) {
        TmfEventField[] retVal = FIELDS.get(key);
        return (retVal == null) ? EMPTY_DESCRIPTION : retVal;
    }
}