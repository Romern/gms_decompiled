package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: agde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agde {

    /* renamed from: a */
    public final boolean f65291a;

    public agde(Context context) {
        this.f65291a = m54035a(context);
    }

    /* renamed from: a */
    public static final boolean m54034a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static boolean m54035a(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }
}
