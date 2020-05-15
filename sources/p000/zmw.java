package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: zmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zmw {

    /* renamed from: a */
    static final long f55503a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    public static final bnic f55504b = bnic.m109490a("com.google.android.apps.fitness", "com.google.android.gms");

    /* renamed from: c */
    public final Context f55505c;

    /* renamed from: d */
    public final String f55506d;

    /* renamed from: e */
    public final ytp f55507e;

    /* renamed from: f */
    public final SharedPreferences f55508f;

    /* renamed from: g */
    public final sqv f55509g;

    public zmw(Context context, String str, ytp ytp, sqv sqv) {
        this.f55505c = context;
        this.f55506d = str;
        this.f55507e = ytp;
        String valueOf = String.valueOf(str);
        this.f55508f = context.getSharedPreferences(valueOf.length() == 0 ? new String("DataReadLogger") : "DataReadLogger".concat(valueOf), 0);
        this.f55509g = sqv;
    }
}
