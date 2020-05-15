package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: rg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1322rg {

    /* renamed from: a */
    public final EdgeEffect f26915a;

    @Deprecated
    public C1322rg(Context context) {
        this.f26915a = new EdgeEffect(context);
    }

    /* renamed from: a */
    public static void m20066a(EdgeEffect edgeEffect, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        edgeEffect.onPull(f, f2);
    }
}
