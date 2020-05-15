package p000;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;

/* renamed from: ted */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ted {

    /* renamed from: d */
    private static final Logger f45726d = tea.m36798a("telephony_info_provider");

    /* renamed from: a */
    final tdx f45727a;

    /* renamed from: b */
    final TelephonyManager f45728b;

    /* renamed from: c */
    public final SubscriptionInfo f45729c;

    public ted(tdx tdx, TelephonyManager telephonyManager, SubscriptionInfo subscriptionInfo) {
        this.f45727a = tdx;
        this.f45728b = telephonyManager;
        this.f45729c = subscriptionInfo;
    }

    /* renamed from: a */
    public static ted m36809a(tdx tdx) {
        return new ted(tdx, (TelephonyManager) rpr.m34216b().getSystemService("phone"), null);
    }

    /* renamed from: b */
    public final String mo26422b() {
        return (String) bmxu.m108565a(this.f45728b.getSubscriberId(), "");
    }

    /* renamed from: c */
    public final int mo26423c() {
        return this.f45728b.getPhoneType();
    }

    /* renamed from: d */
    public final String mo26424d() {
        return (String) bmxu.m108565a(this.f45728b.getSimCountryIso(), "");
    }

    /* renamed from: e */
    public final String mo26425e() {
        return (String) bmxu.m108565a(this.f45728b.getSimOperator(), "");
    }

    /* renamed from: a */
    public static ted m36810a(tdx tdx, SubscriptionInfo subscriptionInfo) {
        int i = Build.VERSION.SDK_INT;
        return new ted(tdx, ((TelephonyManager) rpr.m34216b().getSystemService("phone")).createForSubscriptionId(subscriptionInfo.getSubscriptionId()), subscriptionInfo);
    }

    /* renamed from: a */
    public final boolean mo26421a() {
        int i = Build.VERSION.SDK_INT;
        if (C1133kh.m17835a(rpr.m34216b(), "android.permission.READ_PRIVILEGED_PHONE_STATE") != 0) {
            f45726d.logVerbose("Doesn't have carrier id permission.", new Object[0]);
            return false;
        }
        try {
            this.f45728b.getClass().getMethod("getIccAuthentication", Integer.TYPE, Integer.TYPE, String.class);
            return true;
        } catch (Exception e) {
            f45726d.mo25412b("Method %s is missing", "getIccAuthentication");
            try {
                this.f45728b.getClass().getMethod("getIccSimChallengeResponse", Integer.TYPE, String.class);
                return true;
            } catch (Exception e2) {
                f45726d.mo25412b("Method %s is missing", "getIccSimChallengeResponse");
                return false;
            }
        }
    }
}
