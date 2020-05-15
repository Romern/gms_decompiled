package p000;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgk {
    /* renamed from: a */
    public static int m100859a(int i, int i2, float f) {
        return C1165lm.m19351a(C1165lm.m19355b(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: a */
    public static int m100860a(Context context, int i) {
        TypedValue a = bhkx.m101074a(context, i);
        if (a != null) {
            return a.data;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m100861a(Context context, String str) {
        return bhkx.m101072a(context, (int) C0126R.attr.colorSurface, str);
    }
}
