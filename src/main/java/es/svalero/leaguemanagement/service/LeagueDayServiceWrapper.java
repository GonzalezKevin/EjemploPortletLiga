package es.svalero.leaguemanagement.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeagueDayService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDayService
 * @generated
 */
public class LeagueDayServiceWrapper implements LeagueDayService,
    ServiceWrapper<LeagueDayService> {
    private LeagueDayService _leagueDayService;

    public LeagueDayServiceWrapper(LeagueDayService leagueDayService) {
        _leagueDayService = leagueDayService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _leagueDayService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _leagueDayService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _leagueDayService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LeagueDayService getWrappedLeagueDayService() {
        return _leagueDayService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLeagueDayService(LeagueDayService leagueDayService) {
        _leagueDayService = leagueDayService;
    }

    @Override
    public LeagueDayService getWrappedService() {
        return _leagueDayService;
    }

    @Override
    public void setWrappedService(LeagueDayService leagueDayService) {
        _leagueDayService = leagueDayService;
    }
}
