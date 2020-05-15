package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aopu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopu {

    /* renamed from: a */
    public final aorp f78669a;

    /* renamed from: b */
    private final belh f78670b;

    protected aopu(belh belh, aorp aorp) {
        this.f78670b = belh;
        this.f78669a = aorp;
    }

    /* renamed from: a */
    public static aopu m66278a(Context context) {
        aopy aopy = new aopy(context);
        befh a = befi.m94962a(aopy.f78673a);
        a.mo60660a("recaptcha");
        a.mo60663b("token.pb");
        Uri a2 = a.mo60657a();
        bejq g = bejr.m95186g();
        g.mo60762a(a2);
        g.mo60764a(aorw.f78742b);
        return new aopu(aopy.f78674b.mo60765a(g.mo60761a()), aorq.m66329a());
    }

    /* renamed from: b */
    public static String m66279b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final bqgg mo43151a(String str, String str2) {
        AtomicReference atomicReference = new AtomicReference(null);
        return bqdx.m112673a(this.f78670b.mo60778a(bljx.m107266a(new aopp(this, str, str2, atomicReference)), bqfb.INSTANCE), new aopq(atomicReference), bqfb.INSTANCE);
    }
}
