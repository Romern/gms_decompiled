package p000;

import android.animation.TypeEvaluator;

/* renamed from: azwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azwp implements TypeEvaluator {

    /* renamed from: a */
    public static final azwp f100128a = new azwp();

    private azwp() {
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        int i = (intValue >> 24) & 255;
        int i2 = (intValue >> 16) & 255;
        int i3 = (intValue >> 8) & 255;
        int i4 = intValue & 255;
        int intValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf(((i + ((int) (((float) (((intValue2 >> 24) & 255) - i)) * f))) << 24) | ((i2 + ((int) (((float) (((intValue2 >> 16) & 255) - i2)) * f))) << 16) | ((i3 + ((int) (((float) (((intValue2 >> 8) & 255) - i3)) * f))) << 8) | (i4 + ((int) (f * ((float) ((intValue2 & 255) - i4))))));
    }
}
