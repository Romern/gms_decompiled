package p000;

import android.content.SharedPreferences;
import com.google.android.gms.icing.proxy.InternalIcingCorporaChimeraProvider;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;
import java.util.concurrent.Callable;

/* renamed from: acot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acot implements Callable {

    /* renamed from: a */
    private final acne f60372a;

    /* renamed from: b */
    private final SharedPreferences f60373b;

    /* renamed from: c */
    private final String f60374c;

    /* renamed from: d */
    private final String[] f60375d;

    public acot(acne acne, SharedPreferences sharedPreferences, String str, String[] strArr) {
        this.f60372a = acne;
        this.f60373b = sharedPreferences;
        this.f60374c = str;
        this.f60375d = strArr;
    }

    /* renamed from: b */
    private final void m49637b() {
        acnv.m49541a("Starting full update.");
        if (this.f60372a.mo32906a(InternalIcingCorporaChimeraProvider.f79078b, UpdateIcingCorporaIntentOperation.f79084a, null, null) >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(56);
            sb.append("Full contacts update done at time = ");
            sb.append(currentTimeMillis);
            acnv.m49541a(sb.toString());
            this.f60373b.edit().putLong("KEY_LAST_CONTACTS_UPDATE", currentTimeMillis).apply();
            return;
        }
        acnv.m49546b("Full contacts update failed.");
    }

    /* renamed from: a */
    public final Boolean call() {
        int i = acmn.f60160a;
        long longValue = ((Long) abzt.f58895aj.mo58455c()).longValue();
        long currentTimeMillis = System.currentTimeMillis() - this.f60373b.getLong("KEY_LAST_CONTACTS_UPDATE", 0);
        acnv.m49549b("UpdateContactsTask: mode: %s, have_delta: %b, intervalMs: %d, timeSinceFullUpdateMs: %d", this.f60374c, true, Long.valueOf(longValue), Long.valueOf(currentTimeMillis));
        if ("NONE".equals(this.f60374c)) {
            acnv.m49541a("Contacts update none mode.");
            return false;
        } else if ("FORCE_ALL".equals(this.f60374c)) {
            m49637b();
            return true;
        } else if (!"MAYBE".equals(this.f60374c)) {
            if ("DELTA".equals(this.f60374c)) {
                if (this.f60372a.mo32906a(InternalIcingCorporaChimeraProvider.f79078b, UpdateIcingCorporaIntentOperation.f79084a, "delta", null) < 0) {
                    acnv.m49546b("Contacts delta update failed.");
                }
                return true;
            } else if ("SPECIFIC".equals(this.f60374c)) {
                if (this.f60372a.mo32906a(InternalIcingCorporaChimeraProvider.f79078b, UpdateIcingCorporaIntentOperation.f79084a, "ids", this.f60375d) < 0) {
                    acnv.m49546b("Contacts ids update failed.");
                }
                return true;
            } else {
                String valueOf = String.valueOf(this.f60374c);
                acnv.m49546b(valueOf.length() == 0 ? new String("Unknown Contacts update mode: ") : "Unknown Contacts update mode: ".concat(valueOf));
                return false;
            }
        } else if (currentTimeMillis <= longValue) {
            acnv.m49541a("Did full update recently, won't do it now.");
            return false;
        } else {
            m49637b();
            return true;
        }
    }
}
