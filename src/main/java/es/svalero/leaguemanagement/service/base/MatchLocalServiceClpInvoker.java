package es.svalero.leaguemanagement.service.base;

import es.svalero.leaguemanagement.service.MatchLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MatchLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName56;
    private String[] _methodParameterTypes56;
    private String _methodName57;
    private String[] _methodParameterTypes57;

    public MatchLocalServiceClpInvoker() {
        _methodName0 = "addMatch";

        _methodParameterTypes0 = new String[] {
                "es.svalero.leaguemanagement.model.Match"
            };

        _methodName1 = "createMatch";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteMatch";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteMatch";

        _methodParameterTypes3 = new String[] {
                "es.svalero.leaguemanagement.model.Match"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchMatch";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "fetchMatchByUuidAndCompanyId";

        _methodParameterTypes11 = new String[] { "java.lang.String", "long" };

        _methodName12 = "fetchMatchByUuidAndGroupId";

        _methodParameterTypes12 = new String[] { "java.lang.String", "long" };

        _methodName13 = "getMatch";

        _methodParameterTypes13 = new String[] { "long" };

        _methodName14 = "getPersistedModel";

        _methodParameterTypes14 = new String[] { "java.io.Serializable" };

        _methodName15 = "getMatchByUuidAndCompanyId";

        _methodParameterTypes15 = new String[] { "java.lang.String", "long" };

        _methodName16 = "getMatchByUuidAndGroupId";

        _methodParameterTypes16 = new String[] { "java.lang.String", "long" };

        _methodName17 = "getMatchs";

        _methodParameterTypes17 = new String[] { "int", "int" };

        _methodName18 = "getMatchsCount";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "updateMatch";

        _methodParameterTypes19 = new String[] {
                "es.svalero.leaguemanagement.model.Match"
            };

        _methodName56 = "getBeanIdentifier";

        _methodParameterTypes56 = new String[] {  };

        _methodName57 = "setBeanIdentifier";

        _methodParameterTypes57 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return MatchLocalServiceUtil.addMatch((es.svalero.leaguemanagement.model.Match) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return MatchLocalServiceUtil.createMatch(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return MatchLocalServiceUtil.deleteMatch(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return MatchLocalServiceUtil.deleteMatch((es.svalero.leaguemanagement.model.Match) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return MatchLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return MatchLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return MatchLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return MatchLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return MatchLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return MatchLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return MatchLocalServiceUtil.fetchMatch(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return MatchLocalServiceUtil.fetchMatchByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return MatchLocalServiceUtil.fetchMatchByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return MatchLocalServiceUtil.getMatch(((Long) arguments[0]).longValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return MatchLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return MatchLocalServiceUtil.getMatchByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return MatchLocalServiceUtil.getMatchByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            return MatchLocalServiceUtil.getMatchs(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return MatchLocalServiceUtil.getMatchsCount();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            return MatchLocalServiceUtil.updateMatch((es.svalero.leaguemanagement.model.Match) arguments[0]);
        }

        if (_methodName56.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
            return MatchLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName57.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
            MatchLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
