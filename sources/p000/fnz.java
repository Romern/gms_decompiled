package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnz {

    /* renamed from: a */
    private static fnz f16993a;

    /* renamed from: b */
    private final SharedPreferences f16994b;

    public fnz(Context context) {
        this.f16994b = context.getSharedPreferences("GoogleAnalyticsPlayLogs", 0);
    }

    /* renamed from: a */
    public static synchronized fnz m12060a(Context context) {
        fnz fnz;
        synchronized (fnz.class) {
            if (f16993a == null) {
                f16993a = new fnz(context.getApplicationContext());
            }
            fnz = f16993a;
        }
        return fnz;
    }

    /* renamed from: b */
    public final synchronized void mo11054b() {
        SharedPreferences.Editor edit = this.f16994b.edit();
        edit.putInt("hitsReceived", this.f16994b.getInt("hitsReceived", 0) + 1);
        edit.commit();
    }

    /* renamed from: a */
    public final synchronized void mo11053a() {
        SharedPreferences.Editor edit = this.f16994b.edit();
        edit.clear();
        edit.commit();
    }
}
