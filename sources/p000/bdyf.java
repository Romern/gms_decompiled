package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: bdyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyf implements bdyc {

    /* renamed from: b */
    private static bdyf f106622b;

    /* renamed from: a */
    public final Context f106623a;

    /* renamed from: c */
    private final ContentObserver f106624c;

    private bdyf() {
        this.f106623a = null;
        this.f106624c = null;
    }

    /* renamed from: a */
    static bdyf m91574a(Context context) {
        bdyf bdyf;
        synchronized (bdyf.class) {
            if (f106622b == null) {
                f106622b = C1145kt.m18540a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0 ? new bdyf() : new bdyf(context);
            }
            bdyf = f106622b;
        }
        return bdyf;
    }

    /* renamed from: b */
    public final String mo58433a(String str) {
        if (this.f106623a == null) {
            return null;
        }
        try {
            return (String) bdya.m91570a(new bdyd(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() == 0 ? new String("Unable to read GServices for: ") : "Unable to read GServices for: ".concat(valueOf), e);
            return null;
        }
    }

    private bdyf(Context context) {
        this.f106623a = context;
        this.f106624c = new bdye();
        context.getContentResolver().registerContentObserver(aymn.f97980a, true, this.f106624c);
    }

    /* renamed from: a */
    static synchronized void m91575a() {
        synchronized (bdyf.class) {
            if (!(f106622b == null || f106622b.f106623a == null || f106622b.f106624c == null)) {
                f106622b.f106623a.getContentResolver().unregisterContentObserver(f106622b.f106624c);
            }
            f106622b = null;
        }
    }
}
