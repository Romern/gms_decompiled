package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: akoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akoj {

    /* renamed from: a */
    public static final srn f72353a = srn.m36127a(sgj.GUNS);

    /* renamed from: d */
    private static akoj f72354d;

    /* renamed from: b */
    public final Context f72355b;

    /* renamed from: c */
    public final Random f72356c = new Random(System.currentTimeMillis());

    private akoj(Context context) {
        this.f72355b = context;
    }

    /* renamed from: a */
    public static synchronized akoj m60132a(Context context) {
        akoj akoj;
        synchronized (akoj.class) {
            if (f72354d == null) {
                f72354d = new akoj(context);
            }
            akoj = f72354d;
        }
        return akoj;
    }
}
