/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.util;

import java.util.logging.*;

/**
 * This class of static methods provides the interface to logging for World Wind components. Logging is performed via
 * {@link java.util.logging}. The default logger name is <code>gov.nasa.worldwind</code>. The logger name is
 * configurable via {@link gov.nasa.worldwind.Configuration}.
 *
 * @author tag
 * @version $Id$
 * @see gov.nasa.worldwind.Configuration
 * @see java.util.logging
 */
public class Logging
{


    private Logging()
    {
    } // Prevent instantiation

    /**
     * Returns the World Wind logger.
     *
     * @return The logger.
     */
    public static Logger logger()
    {
    		return logger(null);
    }

    /**
     * Returns a specific logger. Does not access {@link gov.nasa.worldwind.Configuration} to determine the configured
     * World Wind logger.
     * <p/>
     * This is needed by {@link gov.nasa.worldwind.Configuration} to avoid calls back into itself when its singleton
     * instance is not yet instantiated.
     *
     * @param loggerName the name of the logger to use.
     *
     * @return The logger.
     */
    public static Logger logger(String loggerName)
    {
        return Logger.getLogger(loggerName != null ? loggerName : "");
    }

    /**
     * Retrieves a message from the World Wind message resource bundle.
     *
     * @param property the property identifying which message to retrieve.
     *
     * @return The requested message.
     */
    public static String getMessage(String property)
    {
        return property;
    }

    /**
     * Retrieves a message from the World Wind message resource bundle formatted with a single argument. The argument is
     * inserted into the message via {@link java.text.MessageFormat}.
     *
     * @param property the property identifying which message to retrieve.
     * @param arg      the single argument referenced by the format string identified <code>property</code>.
     *
     * @return The requested string formatted with the argument.
     *
     * @see java.text.MessageFormat
     */
    public static String getMessage(String property, String arg)
    {
        return arg != null ? getMessage(property, (Object) arg) : getMessage(property);
    }

    /**
     * Retrieves a message from the World Wind message resource bundle formatted with specified arguments. The arguments
     * are inserted into the message via {@link java.text.MessageFormat}.
     *
     * @param property the property identifying which message to retrieve.
     * @param args     the arguments referenced by the format string identified <code>property</code>.
     *
     * @return The requested string formatted with the arguments.
     *
     * @see java.text.MessageFormat
     */
    public static String getMessage(String property, Object... args)
    {
        return property;
    }

    /**
     * Indicates the maximum number of times the same log message should be repeated when generated in the same context,
     * such as within a loop over renderables when operations in the loop consistently fail.
     *
     * @return the maximum number of times to repeat a message.
     */
    public static int getMaxMessageRepeatCount()
    {
        return 10;
    }
}
