package p000;

import android.content.Context;
import android.graphics.Color;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhid {

    /* renamed from: a */
    public final boolean f118699a;

    /* renamed from: b */
    public final int f118700b;

    /* renamed from: c */
    private final int f118701c;

    /* renamed from: d */
    private final float f118702d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhkx.a(android.content.Context, int, boolean):boolean
     arg types: [android.content.Context, ?, int]
     candidates:
      bhkx.a(android.content.Context, int, java.lang.String):int
      bhkx.a(android.content.Context, int, boolean):boolean */
    public bhid(Context context) {
        this.f118699a = bhkx.m101075a(context, (int) C0126R.attr.elevationOverlayEnabled, false);
        this.f118701c = bhgk.m100860a(context, (int) C0126R.attr.elevationOverlayColor);
        this.f118700b = bhgk.m100860a(context, (int) C0126R.attr.colorSurface);
        this.f118702d = context.getResources().getDisplayMetrics().density;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final int mo63792a(int i, float f) {
        if (!this.f118699a || C1165lm.m19355b(i, 255) != this.f118700b) {
            return i;
        }
        float f2 = this.f118702d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C1165lm.m19355b(bhgk.m100859a(C1165lm.m19355b(i, 255), this.f118701c, f3), Color.alpha(i));
    }
}
