package com.obeosoft.etf.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

import org.osgi.framework.BundleContext;

public class Activator extends Plugin{


	    // ------------------------------------------------------------------------
	    // Attributes
	    // ------------------------------------------------------------------------

	    /**
	     * The plug-in ID
	     */
	    public static final String PLUGIN_ID = "org.eclipse.tracecompass.btf.core"; //$NON-NLS-1$

	    /**
	     * The shared instance
	     */
	    private static Activator fPlugin;

	    // ------------------------------------------------------------------------
	    // Constructors
	    // ------------------------------------------------------------------------

	    /**
	     * Constructor
	     */
	    public Activator() {
	        setDefault(this);
	    }

	    // ------------------------------------------------------------------------
	    // Accessors
	    // ------------------------------------------------------------------------

	    /**
	     * Returns the BTF plug-in instance.
	     *
	     * @return the BTF plug-in instance.
	     */
	    public static Activator getDefault() {
	        return fPlugin;
	    }

	    // Sets plug-in instance
	    private static void setDefault(Activator plugin) {
	        fPlugin = plugin;
	    }

	    // ------------------------------------------------------------------------
	    // Plugin
	    // ------------------------------------------------------------------------

	    @Override
	    public void start(BundleContext context) throws Exception {
	        super.start(context);
	        setDefault(this);
	    }

	    @Override
	    public void stop(BundleContext context) throws Exception {
	        setDefault(null);
	        super.stop(context);
	    }


	    // ------------------------------------------------------------------------
	    // Log an IStatus
	    // ------------------------------------------------------------------------

	    /**
	     * Log an IStatus object directly
	     *
	     * @param status
	     *            The status to log
	     */
	    public static void log(IStatus status) {
	        fPlugin.getLog().log(status);
	    }

	    // ------------------------------------------------------------------------
	    // Log INFO
	    // ------------------------------------------------------------------------

	    /**
	     * Logs a message with severity INFO in the runtime log of the plug-in.
	     *
	     * @param message
	     *            A message to log
	     */
	    public static void logInfo(String message) {
	        fPlugin.getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	    }

	    /**
	     * Logs a message and exception with severity INFO in the runtime log of the
	     * plug-in.
	     *
	     * @param message
	     *            A message to log
	     * @param exception
	     *            The corresponding exception
	     */
	    public static void logInfo(String message, Throwable exception) {
	        fPlugin.getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message, exception));
	    }

	    // ------------------------------------------------------------------------
	    // Log WARNING
	    // ------------------------------------------------------------------------

	    /**
	     * Logs a message and exception with severity WARNING in the runtime log of
	     * the plug-in.
	     *
	     * @param message
	     *            A message to log
	     */
	    public static void logWarning(String message) {
	        fPlugin.getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message));
	    }

	    /**
	     * Logs a message and exception with severity WARNING in the runtime log of
	     * the plug-in.
	     *
	     * @param message
	     *            A message to log
	     * @param exception
	     *            The corresponding exception
	     */
	    public static void logWarning(String message, Throwable exception) {
	        fPlugin.getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message, exception));
	    }

	    // ------------------------------------------------------------------------
	    // Log ERROR
	    // ------------------------------------------------------------------------

	    /**
	     * Logs a message and exception with severity ERROR in the runtime log of
	     * the plug-in.
	     *
	     * @param message
	     *            A message to log
	     */
	    public static void logError(String message) {
	        fPlugin.getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message));
	    }

	    /**
	     * Logs a message and exception with severity ERROR in the runtime log of
	     * the plug-in.
	     *
	     * @param message
	     *            A message to log
	     * @param exception
	     *            The corresponding exception
	     */
	    public static void logError(String message, Throwable exception) {
	        fPlugin.getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message, exception));
	    }
	}
