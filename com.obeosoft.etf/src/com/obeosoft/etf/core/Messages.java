package com.obeosoft.etf.core;

import org.eclipse.osgi.util.NLS;


public class Messages {
    private static final String BUNDLE_NAME = "com.obeosoft.etf.core.messages"; //$NON-NLS-1$
    public static String EtfTypeId_CDescr;
    public static String EtfTypeId_CName;
    public static String EtfTypeId_ECUDescr;
    public static String EtfTypeId_ECUName;
    public static String EtfTypeId_IDescr;
    public static String EtfTypeId_IName;
    public static String EtfTypeId_IBDescr;
    public static String EtfTypeId_IBName;
    public static String EtfTypeId_ISRDescr;
    public static String EtfTypeId_ISRName;
    public static String EtfTypeId_PDescr;
    public static String EtfTypeId_PName;
    public static String EtfTypeId_RDescr;
    public static String EtfTypeId_RName;
    public static String EtfTypeId_SCHEDDescr;
    public static String EtfTypeId_SCHEDName;
    public static String EtfTypeId_SEMDescr;
    public static String EtfTypeId_SEMName;
    public static String EtfTypeId_SIGDescr;
    public static String EtfTypeId_SIGName;
    public static String EtfTypeId_SIMDescr;
    public static String EtfTypeId_SIMName;
    public static String EtfTypeId_STIDescr;
    public static String EtfTypeId_STIName;
    public static String EtfTypeId_SYSDescr;
    public static String EtfTypeId_SYSName;
    public static String EtfTypeId_TDescr;
    public static String EtfTypeId_TName;
    public static String ETFPayload_Activate;
    public static String ETFPayload_BoundedMigration;
    public static String ETFPayload_EnforcedMigration;
    public static String ETFPayload_FullMigration;
    public static String ETFPayload_MapLimitExceeded;
    public static String ETFPayload_Park;
    public static String ETFPayload_PhaseMigration;
    public static String ETFPayload_Poll;
    public static String ETFPayload_PollParking;
    public static String ETFPayload_Preempt;
    public static String ETFPayload_Release;
    public static String ETFPayload_ReleaseParking;
    public static String ETFPayload_Resume;
    public static String ETFPayload_Run;
    public static String ETFPayload_Start;
    public static String ETFPayload_Terminate;
    public static String ETFPayload_Wait;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}