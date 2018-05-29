package es.svalero.leaguemanagement.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeagueService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueService
 * @generated
 */
public class LeagueServiceWrapper implements LeagueService,
    ServiceWrapper<LeagueService> {
    private LeagueService _leagueService;

    public LeagueServiceWrapper(LeagueService leagueService) {
        _leagueService = leagueService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _leagueService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _leagueService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _leagueService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LeagueService getWrappedLeagueService() {
        return _leagueService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLeagueService(LeagueService leagueService) {
        _leagueService = leagueService;
    }

    @Override
    public LeagueService getWrappedService() {
        return _leagueService;
    }

    @Override
    public void setWrappedService(LeagueService leagueService) {
        _leagueService = leagueService;
    }
}
