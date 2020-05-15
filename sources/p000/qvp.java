package p000;

import java.util.List;

/* renamed from: qvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvp {

    /* renamed from: a */
    public static final sek f42249a = qqu.m32672c("EntityManager");

    /* renamed from: b */
    public static final imo f42250b = new qvo();

    /* renamed from: c */
    public final qtr f42251c = qtr.m32879a();

    /* renamed from: d */
    public final qta f42252d = ((qta) qta.f42084i.mo13145b());

    /* renamed from: e */
    public final qtv f42253e = ((qtv) qtv.f42127e.mo13145b());

    /* renamed from: f */
    public final qvn f42254f = ((qvn) qvn.f42243a.mo13145b());

    /* renamed from: g */
    public final qvr f42255g = ((qvr) qvr.f42258a.mo13145b());

    /* renamed from: h */
    public final qwa f42256h = ((qwa) qwa.f42284a.mo13145b());

    /* renamed from: i */
    public final Object f42257i = new Object();

    /* renamed from: a */
    public final bmxv mo24291a(qrj qrj, acyr acyr) {
        return qrj.f41995a ? bmxv.m108566b(this.f42254f.mo24287a(acyr)) : bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo24292a(acyr acyr) {
        qwa qwa = this.f42256h;
        qwb qwb = new qwb();
        qwb.f42296a = acyr;
        qwb.f42297b = 400;
        qwb.f42298c = true;
        qwa.mo24304b(qwb.mo24305a());
    }

    /* renamed from: a */
    public final boolean mo24293a(acyr acyr, int i) {
        boolean z;
        sdo.m34959a(acyr);
        synchronized (this.f42257i) {
            z = !((List) this.f42252d.mo24253a(acyr, qta.m32829d(i))).isEmpty();
        }
        return z;
    }
}
