package p000;

import android.content.Context;

/* renamed from: aqjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjy {

    /* renamed from: b */
    public static volatile aqjy f86251b;

    /* renamed from: a */
    public final boolean f86252a;

    public aqjy(Context context) {
        this.f86252a = context.getPackageManager().hasSystemFeature("android.hardware.type.featurephone");
    }
}
