package com.obeosoft.etf.trace;

import org.eclipse.jdt.annotation.NonNull;

public enum EtfColumnNames {

    /**
     * The event timestamp
     */
    TIMESTAMP("Timestamp"), //$NON-NLS-1$
    /**
     * The source
     */
    SOURCE("Source"), //$NON-NLS-1$
    /**
     * The source instance
     */
    SOURCE_INSTANCE("Source instance"), //$NON-NLS-1$
    /**
     * The event field name
     */
    EVENT_TYPE("Event type"), //$NON-NLS-1$
    /**
     * The target
     */
    TARGET("Target"), //$NON-NLS-1$
    /**
     * The target instance
     */
    TARGET_INSTANCE("Target instance"), //$NON-NLS-1$
    /**
     * The event
     */
    EVENT("Event"), //$NON-NLS-1$
    /**
     * Notes
     */
    NOTES("Notes"); //$NON-NLS-1$

    private final @NonNull String fField;

    private EtfColumnNames(@NonNull String field) {
        fField = field;
    }

    @Override
    public @NonNull String toString() {
        return fField;
    }
}

