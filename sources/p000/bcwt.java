package p000;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: bcwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwt implements bboh {

    /* renamed from: a */
    private static WeakReference f105086a = new WeakReference(null);

    /* renamed from: b */
    private final bngx f105087b = bngx.m109356a((Object) 2);

    private bcwt() {
    }

    /* renamed from: b */
    public static synchronized bcwt m90193b() {
        bcwt bcwt;
        synchronized (bcwt.class) {
            bcwt = (bcwt) f105086a.get();
            if (bcwt == null) {
                bcwt = new bcwt();
                f105086a = new WeakReference(bcwt);
            }
        }
        return bcwt;
    }

    /* renamed from: a */
    public final bngx mo56274a() {
        return this.f105087b;
    }

    /* renamed from: a */
    public final List mo56275a(bcjm bcjm, bbyw bbyw, Context context) {
        return Arrays.asList(new bcwu(context));
    }
}
