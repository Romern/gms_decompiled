package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aopj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopj {

    /* renamed from: b */
    private static aopj f78647b;

    /* renamed from: a */
    public final SharedPreferences f78648a;

    public aopj(SharedPreferences sharedPreferences) {
        this.f78648a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized aopj m66274a(Context context) {
        aopj aopj;
        synchronized (aopj.class) {
            if (f78647b == null) {
                f78647b = new aopj(context.getSharedPreferences("gms.reachability", 0));
            }
            aopj = f78647b;
        }
        return aopj;
    }

    /* renamed from: a */
    public final long mo43148a() {
        return this.f78648a.getLong("last_sync_timestamp", 0);
    }
}
