package p000;

import android.text.TextUtils;

/* renamed from: aweu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aweu {
    /* renamed from: a */
    public static int m79811a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m79812a(blzf blzf) {
        if ((blzf.f128339a & 32) == 0) {
            return false;
        }
        blzq blzq = blzf.f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        if (!TextUtils.isEmpty(blzq.f128379o)) {
            return true;
        }
        return false;
    }
}
