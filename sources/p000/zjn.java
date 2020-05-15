package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: zjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zjn {

    /* renamed from: a */
    static boolean f55229a = false;

    /* renamed from: b */
    public final SharedPreferences f55230b;

    /* renamed from: c */
    public long f55231c;

    /* renamed from: d */
    private final sqv f55232d;

    public zjn(Context context, sqv sqv) {
        m45602a(context, sqv);
        this.f55232d = sqv;
        SharedPreferences a = m45601a(context);
        this.f55230b = a;
        this.f55231c = a.getLong("bootTimeNanos", 0);
        m45604b();
    }

    /* renamed from: a */
    private static long m45600a(sqv sqv) {
        return TimeUnit.MILLISECONDS.toNanos(sqv.mo20505a() - sqv.mo20506b());
    }

    /* renamed from: b */
    private final void m45604b() {
        if (this.f55231c == 0) {
            long a = m45600a(this.f55232d);
            if (m45603a(a)) {
                this.f55231c = a;
                this.f55230b.edit().putLong("bootTimeNanos", a).apply();
            }
        }
    }

    /* renamed from: a */
    private static SharedPreferences m45601a(Context context) {
        return context.getSharedPreferences("LocalSensorState", 0);
    }

    /* renamed from: a */
    static synchronized void m45602a(Context context, sqv sqv) {
        synchronized (zjn.class) {
            if (!f55229a) {
                long a = m45600a(sqv);
                SharedPreferences.Editor edit = m45601a(context).edit();
                if (m45603a(a)) {
                    edit.putLong("bootTimeNanos", a);
                } else {
                    edit.clear();
                }
                edit.apply();
                f55229a = true;
            }
        }
    }

    /* renamed from: a */
    public static boolean m45603a(long j) {
        return j > cdzd.f182003a.mo6606a().mo78561aa() && j <= TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    /* renamed from: a */
    public final long mo31174a() {
        m45604b();
        return this.f55231c;
    }
}
