package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: agyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyq {

    /* renamed from: a */
    public static final srn f66880a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    static String m55274a(SubscriptionInfo subscriptionInfo) {
        if (subscriptionInfo == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getMccMncFromSubInfo was passed a null object");
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (TextUtils.isEmpty(subscriptionInfo.getMccString()) || TextUtils.isEmpty(subscriptionInfo.getMncString())) {
            return null;
        }
        String valueOf = String.valueOf(subscriptionInfo.getMccString());
        String valueOf2 = String.valueOf(subscriptionInfo.getMncString());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    public static long m55279b(String str) {
        if (str != null) {
            return bnzi.m110905g().mo68721a(str, bmwy.f131158c).mo68742d() & cfmn.f184389a.mo6606a().mo81505k();
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getSimId was passed a null iccid");
        return -1;
    }

    /* renamed from: c */
    public static boolean m55281c(Context context) {
        return m55277a(context, 1);
    }

    /* renamed from: d */
    public static boolean m55283d(Context context) {
        if (context != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || !activeNetworkInfo.isRoaming()) {
                return false;
            }
            return true;
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.isRoaming was passed a null context");
        return false;
    }

    /* renamed from: e */
    public static boolean m55284e(Context context) {
        if (context != null) {
            NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
            boolean z = false;
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getType() == 0 && networkInfo.isAvailable()) {
                    z = true;
                }
            }
            return z;
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.isCellularAvailable was passed a null context");
        return false;
    }

    /* renamed from: f */
    public static String m55285f(Context context) {
        if (cfmz.m140472c()) {
            return !m55278a(agyv.m55312a()) ? "12300" : agyv.m55312a();
        }
        if (agqg.m54845L().booleanValue()) {
            if (!m55278a(cfmv.m140306e())) {
                return "12300";
            }
            return cfmv.m140306e();
        } else if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getMccMnc was passed a null context");
            return null;
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
            if (telephonyManager == null) {
                f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Telephony Manager system service");
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (cfma.f184331a.mo6606a().mo81444c()) {
                telephonyManager = telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
            }
            String simOperator = telephonyManager.getSimOperator();
            if (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) {
                return null;
            }
            return simOperator;
        }
    }

    /* renamed from: g */
    public static List m55286g(Context context) {
        ArrayList arrayList = new ArrayList();
        if (agqg.m54845L().booleanValue() && m55278a(cfmv.m140306e())) {
            arrayList.add(cfmv.m140306e());
        }
        if (cfmz.m140472c()) {
            arrayList.add(cfmz.m140477h());
        }
        if (context != null) {
            int i = Build.VERSION.SDK_INT;
            SubscriptionManager subscriptionManager = (SubscriptionManager) C1133kh.m17838a(context, SubscriptionManager.class);
            if (subscriptionManager != null) {
                try {
                    if (subscriptionManager.getActiveSubscriptionInfoList() != null) {
                        for (SubscriptionInfo subscriptionInfo : subscriptionManager.getActiveSubscriptionInfoList()) {
                            if (subscriptionInfo != null) {
                                String a = m55274a(subscriptionInfo);
                                if (m55278a(a)) {
                                    arrayList.add(a);
                                }
                            }
                        }
                    }
                } catch (SecurityException e) {
                    bnsl a2 = f66880a.mo26019b(agyt.m55307c());
                    a2.mo68437a(e);
                    a2.mo68405a("Security exception when retrieving SubInfoList.");
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getMccMncList was passed a null context");
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* renamed from: h */
    public static String m55287h(Context context) {
        for (String str : m55286g(context)) {
            if (cfmz.m140474e().f165797a.contains(str) || cfmz.m140475f().f165797a.contains(str) || cfmz.f184503a.mo6606a().mo81608f().f165797a.contains(str)) {
                return str;
            }
            while (r2.hasNext()) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public static String m55288i(Context context) {
        if (!TextUtils.isEmpty(agqg.m54850e())) {
            return agqg.m54850e();
        }
        if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getIccid was passed a null context");
            return "1234567890987654321";
        }
        String j = m55289j(context);
        if (j != null) {
            return j;
        }
        TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
        if (telephonyManager == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Telephony Manager system service");
            return "1234567890987654321";
        }
        try {
            String simSerialNumber = telephonyManager.getSimSerialNumber();
            if (simSerialNumber != null) {
                return simSerialNumber;
            }
            f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to retrieve ICCID. SIM card may be missing.");
            return "1234567890987654321";
        } catch (SecurityException e) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("Security exception when retrieving ICCID.");
            return "1234567890987654321";
        }
    }

    /* renamed from: j */
    static String m55289j(Context context) {
        if (cflx.f184311a.mo6606a().mo81425c()) {
            int i = Build.VERSION.SDK_INT;
            SubscriptionManager subscriptionManager = (SubscriptionManager) C1133kh.m17838a(context, SubscriptionManager.class);
            if (subscriptionManager != null) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    SubscriptionInfo activeSubscriptionInfo = subscriptionManager.getActiveSubscriptionInfo(SubscriptionManager.getDefaultDataSubscriptionId());
                    if (activeSubscriptionInfo != null) {
                        return activeSubscriptionInfo.getIccId();
                    }
                    return null;
                } catch (SecurityException e) {
                    bnsl a = f66880a.mo26019b(agyt.m55307c());
                    a.mo68437a(e);
                    a.mo68405a("Security exception when retrieving data SubInfo");
                    return null;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    bnsl a2 = f66880a.mo26019b(agyt.m55307c());
                    a2.mo68437a(e2);
                    a2.mo68405a("Failed to get data ICCID using reflection");
                    return null;
                }
            } else {
                f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Subscription Manager system service");
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m55290k(Context context) {
        if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.hasSim was passed a null context");
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
        if (telephonyManager == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Telephony Manager system service");
            return false;
        } else if (telephonyManager.getSimState() == 5) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m55291l(Context context) {
        return agqg.m54845L().booleanValue() && !m55290k(context);
    }

    /* renamed from: m */
    public static String m55292m(Context context) {
        String str;
        int i = Build.VERSION.SDK_INT;
        if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getGid1 was passed a null context");
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
        if (telephonyManager != null) {
            try {
                str = telephonyManager.getGroupIdLevel1();
            } catch (SecurityException e) {
                bnsl a = f66880a.mo26019b(agyt.m55307c());
                a.mo68437a(e);
                a.mo68405a("Security exception when retrieving GID1.");
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Telephony Manager system service");
        return "";
    }

    /* renamed from: n */
    public static String m55293n(Context context) {
        String str;
        if (!TextUtils.isEmpty(cfma.m140067e())) {
            return cfma.m140067e();
        }
        if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getImsi was passed a null context");
            return "312580123451234";
        }
        TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
        if (telephonyManager != null) {
            try {
                str = telephonyManager.getSubscriberId();
            } catch (SecurityException e) {
                bnsl a = f66880a.mo26019b(agyt.m55307c());
                a.mo68437a(e);
                a.mo68405a("Security exception when retrieving imsi.");
                str = null;
            }
            if (str != null) {
                return str;
            }
            f66880a.mo26019b(agyt.m55307c()).mo68405a("No available imsi");
            return "312580123451234";
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Telephony Manager system service");
        return "312580123451234";
    }

    /* renamed from: o */
    public static String m55294o(Context context) {
        if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getServiceProviderName was passed a null context");
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
        if (telephonyManager == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("Failed to get Telephony Manager system service");
            return "";
        }
        String simOperatorName = telephonyManager.getSimOperatorName();
        if ((simOperatorName != null || !agqg.m54845L().booleanValue()) && simOperatorName != null) {
            return simOperatorName;
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
    /* renamed from: p */
    public static List m55295p(Context context) {
        TelephonyManager telephonyManager;
        List<SubscriptionInfo> list;
        String e;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (context != null) {
            telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
        } else {
            telephonyManager = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (context == null) {
            f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.getSupportedSimCards was passed a null context");
            return arrayList;
        }
        SubscriptionManager subscriptionManager = (SubscriptionManager) C1133kh.m17838a(context, SubscriptionManager.class);
        if (!(subscriptionManager == null || telephonyManager == null)) {
            try {
                if (subscriptionManager.getActiveSubscriptionInfoList() != null) {
                    list = subscriptionManager.getActiveSubscriptionInfoList();
                    String j = m55289j(context);
                    for (SubscriptionInfo subscriptionInfo : list) {
                        String e2 = !TextUtils.isEmpty(cfmv.m140306e()) ? cfmv.m140306e() : m55274a(subscriptionInfo);
                        if (m55282c(e2)) {
                            String iccId = subscriptionInfo.getIccId();
                            long b = m55279b(iccId);
                            boolean a = sdg.m34949a(j, iccId);
                            if (subscriptionInfo.getCarrierName() != null) {
                                str2 = subscriptionInfo.getCarrierName().toString();
                            } else {
                                str2 = null;
                            }
                            arrayList.add(agzc.m55318a(iccId, e2, b, a, str2));
                        }
                    }
                    if (arrayList.isEmpty() && agqg.m54845L().booleanValue()) {
                        e = m55278a(cfmv.m140306e()) ? "12300" : cfmv.m140306e();
                        if (TextUtils.isEmpty(cfmv.m140305d())) {
                            str = cfmv.m140305d();
                        } else {
                            str = "1234567890987654321";
                        }
                        if (m55282c(e)) {
                            arrayList.add(agzc.m55318a(str, e, m55279b(str), !cfmz.m140471b(), cfmv.m140320s()));
                        }
                    }
                    if (cfmz.m140472c()) {
                        arrayList.add(agzc.m55318a(cfmz.m140476g(), cfmz.m140477h(), m55279b(cfmz.m140476g()), cfmz.m140471b(), cfmz.f184503a.mo6606a().mo81609g()));
                    }
                    return Collections.unmodifiableList(arrayList);
                }
            } catch (SecurityException e3) {
                list = new ArrayList();
            }
        }
        list = new ArrayList();
        String j2 = m55289j(context);
        while (r2.hasNext()) {
        }
        e = m55278a(cfmv.m140306e()) ? "12300" : cfmv.m140306e();
        if (TextUtils.isEmpty(cfmv.m140305d())) {
        }
        if (m55282c(e)) {
        }
        if (cfmz.m140472c()) {
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: q */
    public static boolean m55296q(Context context) {
        for (agzc agzc : m55295p(context)) {
            if (agzc.mo36196d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m55282c(String str) {
        return cfmz.m140474e().f165797a.contains(str) || cfmz.m140475f().f165797a.contains(str);
    }

    /* renamed from: a */
    public static boolean m55275a() {
        return agqg.m54870y().booleanValue() || !TextUtils.isEmpty(agyv.m55312a());
    }

    /* renamed from: b */
    public static boolean m55280b(Context context) {
        return m55277a(context, 0);
    }

    /* renamed from: a */
    public static boolean m55276a(Context context) {
        if (context != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.isConnected was passed a null context");
        return false;
    }

    /* renamed from: a */
    public static boolean m55277a(Context context, int i) {
        if (context != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != i) {
                return false;
            }
            return true;
        }
        f66880a.mo26019b(agyt.m55307c()).mo68405a("ConnectivityHelper.isConnectedOnNetworkType was passed a null context");
        return false;
    }

    /* renamed from: a */
    public static boolean m55278a(String str) {
        return !TextUtils.isEmpty(str) && str.length() >= 5;
    }
}
