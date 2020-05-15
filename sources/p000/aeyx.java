package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: aeyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeyx implements aeyq {

    /* renamed from: e */
    private static avua f64023e;

    /* renamed from: a */
    private final Context f64024a;

    /* renamed from: b */
    private final bosx f64025b;

    /* renamed from: c */
    private final aeyv f64026c;

    /* renamed from: d */
    private final PackageManager f64027d;

    public aeyx(Context context, bosx bosx, aeyv aeyv) {
        this.f64024a = context;
        this.f64025b = bosx;
        this.f64026c = aeyv;
        this.f64027d = context.getPackageManager();
    }

    /* renamed from: a */
    public final aeyp mo34658a(long j) {
        return new aeyw(this.f64024a.getSharedPreferences("AppUsageEventWatcher", 0), this.f64026c, this.f64025b, j, this.f64027d);
    }

    /* renamed from: b */
    public final boolean mo34661b() {
        return true;
    }

    /* renamed from: a */
    public final avua mo34659a() {
        if (f64023e == null) {
            f64023e = new aeys();
        }
        return f64023e;
    }

    /* renamed from: a */
    public final String mo34660a(bxxc bxxc) {
        return ((bojt) bxxc).f133341d;
    }
}
