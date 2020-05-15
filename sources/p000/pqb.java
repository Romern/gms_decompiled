package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: pqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqb {

    /* renamed from: a */
    public final Context f40051a;

    /* renamed from: b */
    public final ppq f40052b;

    /* renamed from: c */
    public ppp f40053c;

    /* renamed from: a */
    public final boolean mo23551a() {
        SharedPreferences b = qay.m31785b(this.f40051a);
        if (b.contains("PREF_LAST_SENDER_ACTIVE_TIMESTAMP")) {
            long j = b.getLong("PREF_LAST_SENDER_ACTIVE_TIMESTAMP", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (j > currentTimeMillis) {
                b.edit().remove("PREF_LAST_SENDER_ACTIVE_TIMESTAMP").apply();
                return false;
            } else if (currentTimeMillis - j < cczq.f180312a.mo6606a().mo77107b()) {
                return true;
            }
        }
        return false;
    }

    public pqb(Context context) {
        this.f40051a = context;
        this.f40052b = new ppq(context, sne.m35694a(1, 10));
        pes.m30266a().execute(new pqa(this));
    }
}
