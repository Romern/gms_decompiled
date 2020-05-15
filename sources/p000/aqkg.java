package p000;

import android.content.Context;

/* renamed from: aqkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqkg {
    /* renamed from: a */
    public static aqje m71752a(Context context, int i, aqkf aqkf) {
        int i2;
        if (aqkf == null) {
            i2 = aqkf.DEFAULT.f86276e;
        } else {
            i2 = aqkf.f86276e;
        }
        CharSequence charSequence = context.getResources().getTextArray(i)[i2];
        bxvd da = bsrz.f146816d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrz bsrz = (bsrz) da.f164949b;
        bsrz.f146818a |= 1;
        bsrz.f146819b = i;
        return new aqje(charSequence, (bsrz) da.mo74062i());
    }
}
