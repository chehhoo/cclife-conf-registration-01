package ws.cccm.registration.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.log4j.Logger;

/**
 * Convenience class for setting and retrieving cookies.
 */
public final class RegistrationUtil {

    private static final Logger logger = Logger.getLogger(RegistrationUtil.class);
    private static Date regularRegistrationDate = new GregorianCalendar(2014, Calendar.NOVEMBER, 10, 23, 59).getTime();
    private static Date lateRegistrationDate = new GregorianCalendar(2014, Calendar.DECEMBER, 1, 23, 59).getTime();

    /**
     * Checkstyle rule: utility classes should not have public constructor
     */
    private RegistrationUtil() {
    }

//    private static void initializeRegistrationDate() {
//        regularRegistrationDate = new GregorianCalendar(2011, 2, 21, 23, 59, 59).getTime();
//        lateRegistrationDate = new GregorianCalendar(2011, 2, 26, 23, 59, 59).getTime();
//    }
    /**
     * Convenience method to get a cookie by name
     *
     * @param request the current request
     * @param name the name of the cookie to find
     *
     * @return the cookie (if found), null if not found
     */
    public static Double getNonAdultRegistrationFee(Date registrationDate) {

        logger.debug("Registration Date:" + registrationDate.toString());
        logger.debug("Regular Registration Date:" + regularRegistrationDate.toString());
        logger.debug("Late Registration Date:" + lateRegistrationDate.toString());

        Double nonAdultRegistrationFee = 10.0;
        if (registrationDate.after(RegistrationUtil.lateRegistrationDate)) {
            nonAdultRegistrationFee = 30.0;
        } else if (registrationDate.after(RegistrationUtil.regularRegistrationDate)) {
            nonAdultRegistrationFee = 20.0;
        }

        return nonAdultRegistrationFee;
    }

    /**
     * Convenience method to get a cookie by name
     *
     * @param request the current request
     * @param name the name of the cookie to find
     *
     * @return the cookie (if found), null if not found
     */
    public static Double getAdultRegistrationFee(Date registrationDate) {

        logger.debug("Registration Date:" + registrationDate.toString());
        logger.debug("Regular Registration Date:" + regularRegistrationDate.toString());
        logger.debug("Late Registration Date:" + lateRegistrationDate.toString());

        Double adultRegistrationFee = 20.0;
        if (registrationDate.after(RegistrationUtil.lateRegistrationDate)) {
            adultRegistrationFee = 60.0;
        } else if (registrationDate.after(RegistrationUtil.regularRegistrationDate)) {
            adultRegistrationFee = 40.0;
        }

        return adultRegistrationFee;
    }
}
