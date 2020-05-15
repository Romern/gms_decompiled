package p000;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* renamed from: tdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdz {

    /* renamed from: a */
    private static WeakReference f45716a = new WeakReference(null);

    /* renamed from: a */
    public static final List m36795a(String str) {
        if (TextUtils.isEmpty(str)) {
            return bngx.m109376e();
        }
        return bngx.m109368a((Collection) bnkn.m109668a(bmyx.m108640a(',').mo66925c((CharSequence) str), tdy.f45715a));
    }

    /* renamed from: a */
    public static synchronized void m36796a() {
        synchronized (tdz.class) {
            if (((tdz) f45716a.get()) == null) {
                f45716a = new WeakReference(new tdz());
            }
        }
    }

    /* renamed from: a */
    public static final boolean m36797a(cbqy cbqy) {
        int b = cbqx.m128116b(cbqy.f178086d);
        return b != 0 && b == 4;
    }
}
