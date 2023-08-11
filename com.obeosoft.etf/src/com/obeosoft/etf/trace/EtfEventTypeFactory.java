package com.obeosoft.etf.trace;

import static org.eclipse.tracecompass.common.core.NonNullUtils.nullToEmptyString;

import java.util.Map;


import com.google.common.collect.ImmutableMap;
import com.obeosoft.etf.core.Messages;
import com.obeosoft.etf.event.EtfEventType;

public class EtfEventTypeFactory {

	private EtfEventTypeFactory() {}

    private static final Map<String, EtfEventType> TYPES;

    static {
        ImmutableMap.Builder<String, EtfEventType> builder = new ImmutableMap.Builder<>();
        // Environment
        builder.put("STI", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_STIName), Messages.EtfTypeId_STIDescr)); //$NON-NLS-1$
        // Software
        builder.put("T", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_TName), Messages.EtfTypeId_TDescr)); //$NON-NLS-1$
        builder.put("ISR", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_ISRName), Messages.EtfTypeId_ISRDescr)); //$NON-NLS-1$
        builder.put("R", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_RName), Messages.EtfTypeId_RDescr)); //$NON-NLS-1$
        builder.put("IB", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_IBName), Messages.EtfTypeId_IBDescr)); //$NON-NLS-1$
        builder.put("I", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_IName), Messages.EtfTypeId_IDescr)); //$NON-NLS-1$
        // Hardware
        builder.put("ECU", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_ECUName), Messages.EtfTypeId_ECUDescr)); //$NON-NLS-1$
        builder.put("P", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_PName), Messages.EtfTypeId_PDescr)); //$NON-NLS-1$
        builder.put("C", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_CName), Messages.EtfTypeId_CDescr)); //$NON-NLS-1$
        // Operating system
        builder.put("SCHED", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_SCHEDName), Messages.EtfTypeId_SCHEDDescr)); //$NON-NLS-1$
        builder.put("SIG", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_SIGName), Messages.EtfTypeId_SIGDescr)); //$NON-NLS-1$
        builder.put("SEM", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_SEMName), Messages.EtfTypeId_SEMDescr)); //$NON-NLS-1$
        // Information
        builder.put("SIM", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_SIMName), Messages.EtfTypeId_SIMDescr)); //$NON-NLS-1$
        builder.put("SYS", new EtfEventType(nullToEmptyString(Messages.EtfTypeId_SYSName), Messages.EtfTypeId_SYSDescr)); //$NON-NLS-1$
        TYPES = builder.build();
    }

    /**
     * Parse the string and get a type id
     *
     * @param typeName
     *            the string to parse
     * @return a BTF trace type, can be null if the string is invalid.
     */
    public static EtfEventType parse(String typeName) {
        return TYPES.get(typeName);
    }

}