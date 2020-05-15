package p000;

import android.content.Context;
import android.os.Bundle;

/* renamed from: qcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcw {

    /* renamed from: a */
    private final String f40947a;

    /* renamed from: b */
    private final String f40948b;

    /* renamed from: c */
    private boolean f40949c = false;

    public qcw(Context context, Object obj) {
        Class<?> cls = obj.getClass();
        String packageName = context.getPackageName();
        String canonicalName = cls.getCanonicalName();
        this.f40947a = packageName;
        this.f40948b = canonicalName;
    }

    /* renamed from: a */
    public final Bundle mo23920a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.checkin.EXTRA_CHECKIN_NOW", this.f40949c);
        bundle.putString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE", this.f40947a);
        bundle.putString("com.google.android.gms.checkin.CHECKIN_SOURCE_CLASS", this.f40948b);
        return bundle;
    }

    /* renamed from: b */
    public final void mo23921b() {
        this.f40949c = true;
    }
}
