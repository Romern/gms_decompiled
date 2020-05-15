package p000;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: aqjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjx {

    /* renamed from: a */
    private static final Logger f86248a = new Logger("SetupServices", "CountryHelper");

    /* renamed from: b */
    private final TelephonyManager f86249b;

    /* renamed from: c */
    private final SubscriptionManager f86250c;

    public aqjx(TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        this.f86249b = telephonyManager;
        this.f86250c = subscriptionManager;
    }

    /* renamed from: a */
    public final String mo47928a() {
        int i = Build.VERSION.SDK_INT;
        String str = null;
        try {
            List<SubscriptionInfo> activeSubscriptionInfoList = this.f86250c.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null) {
                Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TelephonyManager createForSubscriptionId = this.f86249b.createForSubscriptionId(it.next().getSubscriptionId());
                    if (createForSubscriptionId.getSimState() == 5) {
                        String simCountryIso = createForSubscriptionId.getSimCountryIso();
                        if (f86248a.mo19637a(3)) {
                            Logger Logger = f86248a;
                            String valueOf = String.valueOf(simCountryIso);
                            Logger.mo25412b(valueOf.length() == 0 ? new String("Returning user country using first ready SIM: ") : "Returning user country using first ready SIM: ".concat(valueOf), new Object[0]);
                        }
                        str = simCountryIso;
                    }
                }
            }
        } catch (SecurityException e) {
            Logger logger2 = f86248a;
            String valueOf2 = String.valueOf(e.getMessage());
            logger2.mo25416d(valueOf2.length() == 0 ? new String("Unable to get country from SIM: ") : "Unable to get country from SIM: ".concat(valueOf2), new Object[0]);
        }
        if (str != null) {
            return str.toUpperCase(Locale.US);
        }
        String b = cgli.f187248a.mo6606a().mo84062b();
        if (!TextUtils.isEmpty(b)) {
            if (f86248a.mo19637a(3)) {
                f86248a.mo25412b("Returning user country using Gservices device_country", new Object[0]);
            }
            return b.toUpperCase(Locale.US);
        }
        if (f86248a.mo19637a(3)) {
            f86248a.mo25412b("Returning user country using Locale", new Object[0]);
        }
        return Locale.getDefault().getCountry().toUpperCase(Locale.US);
    }

    /* renamed from: a */
    public final boolean mo47929a(String str) {
        String a = mo47928a();
        if (f86248a.mo19637a(3)) {
            Logger Logger = f86248a;
            String valueOf = String.valueOf(a);
            Logger.mo25412b(valueOf.length() == 0 ? new String("User country is ") : "User country is ".concat(valueOf), new Object[0]);
        }
        return str.equalsIgnoreCase(a);
    }
}
