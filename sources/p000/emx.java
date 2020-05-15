package p000;

import android.content.Context;

/* renamed from: emx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emx {

    /* renamed from: a */
    private static emw f15317a;

    /* renamed from: a */
    public static synchronized enb m10741a(Context context, emu emu, qon qon) {
        emw emw;
        emr emr;
        synchronized (emx.class) {
            if (f15317a == null) {
                if (emu != null) {
                    emr = emu;
                } else {
                    emr = new emr(context);
                }
                f15317a = new emw(context, emr, new emz(qon.f41879b), new emv(context), qon);
            }
            emw = f15317a;
        }
        return emw;
    }
}
