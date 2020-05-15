package p000;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: bcuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcuy implements bboh {

    /* renamed from: b */
    private static WeakReference f104974b = new WeakReference(null);

    /* renamed from: a */
    public bcve f104975a = null;

    /* renamed from: c */
    private final bngx f104976c = bngx.m109356a((Object) 1);

    /* renamed from: d */
    private final String f104977d;

    /* renamed from: e */
    private bcwe f104978e;

    /* renamed from: f */
    private final bcws f104979f;

    private bcuy(String str, bcws bcws) {
        this.f104977d = str;
        this.f104979f = bcws;
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized bcuy m90088a(String str) {
        bcuy b;
        synchronized (bcuy.class) {
            b = m90089b(str);
        }
        return b;
    }

    /* renamed from: b */
    public static synchronized bcuy m90089b(String str) {
        synchronized (bcuy.class) {
            bcuy bcuy = (bcuy) f104974b.get();
            if (bcuy != null) {
                return bcuy;
            }
            bcuy bcuy2 = new bcuy(str, new bcws());
            f104974b = new WeakReference(bcuy2);
            return bcuy2;
        }
    }

    /* renamed from: a */
    public final bngx mo56274a() {
        return this.f104976c;
    }

    /* renamed from: a */
    public final List mo56275a(bcjm bcjm, bbyw bbyw, Context context) {
        this.f104978e = new bcwe(bcjm, context);
        this.f104975a = new bcvt(context, this.f104978e, bbyw, this.f104977d, this.f104979f);
        return Arrays.asList(new bcuz(this.f104975a));
    }
}
