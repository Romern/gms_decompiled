package p000;

import android.content.Context;
import java.util.List;

/* renamed from: qvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qvy {

    /* renamed from: a */
    public static final sek f42276a = qqu.m32672c("SyncHelper");

    /* renamed from: b */
    public final qvk f42277b = ((qvk) qvk.f42238a.mo13145b());

    /* renamed from: c */
    public final qvt f42278c = ((qvt) qvt.f42265a.mo13145b());

    /* renamed from: d */
    public final qvr f42279d = ((qvr) qvr.f42258a.mo13145b());

    /* renamed from: e */
    public final qta f42280e = ((qta) qta.f42084i.mo13145b());

    /* renamed from: f */
    public final qtv f42281f = ((qtv) qtv.f42127e.mo13145b());

    /* renamed from: g */
    public final qvd f42282g;

    /* renamed from: h */
    public final qvf f42283h;

    public qvy(Context context) {
        this.f42282g = qvd.m32933a(context);
        this.f42283h = new qvf(context);
    }

    /* renamed from: a */
    public static qtq m32977a(bsth bsth) {
        qtp qtp = new qtp();
        qtp.mo24268a(4);
        qtp.f42106a = bsth.f147010a;
        qtp.f42107b = bsth.mo73639aL();
        qtp.f42108c = bsth.f147011b;
        return qtp.mo24267a();
    }

    /* renamed from: b */
    public final void mo24302b(acyr acyr, int i) {
        this.f42280e.mo24254a(acyr, qta.m32825a(i), true);
        this.f42280e.mo24254a(acyr, qta.m32827b(i), false);
    }

    /* renamed from: a */
    public static qtq m32978a(bsua bsua) {
        qtp qtp = new qtp();
        qtp.mo24268a(2);
        qtp.f42106a = bsua.f147097b;
        qtp.f42107b = bsua.mo73639aL();
        qtp.f42108c = bsua.f147098c;
        return qtp.mo24267a();
    }

    /* renamed from: a */
    public static qtq m32979a(bsud bsud) {
        qtp qtp = new qtp();
        qtp.mo24268a(1);
        qtp.f42106a = bsud.f147109b;
        qtp.f42107b = bsud.mo73639aL();
        qtp.f42108c = bsud.f147110c;
        return qtp.mo24267a();
    }

    /* renamed from: a */
    public final boolean mo24301a(acyr acyr, int i) {
        return !((List) this.f42280e.mo24253a(acyr, qta.m32829d(i))).isEmpty();
    }
}
