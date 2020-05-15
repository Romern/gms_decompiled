package p000;

/* renamed from: cijo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijo extends Thread {

    /* renamed from: a */
    final /* synthetic */ brep f190441a;

    /* renamed from: b */
    final /* synthetic */ cijs f190442b;

    /* renamed from: c */
    final /* synthetic */ String f190443c;

    /* renamed from: d */
    final /* synthetic */ cijs f190444d;

    public cijo(cijs cijs, brep brep, cijs cijs2, String str) {
        this.f190444d = cijs;
        this.f190441a = brep;
        this.f190442b = cijs2;
        this.f190443c = str;
    }

    public final void run() {
        Integer num = cijs.f190456a;
        srn srn = atgf.f90279a;
        cijx a = new cikh().mo86213a(this.f190442b);
        bres bres = a.f190484a;
        if (bres == null || bres.f142689a.mo49933a().equals(cijw.QUICPAY_UNFORMATTED_ERROR.name())) {
            this.f190444d.f142751d.mo69517a(this.f190443c, new cijn(this, (cijv) a.f190485b));
            return;
        }
        String valueOf = String.valueOf(bres.f142689a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("getSecureElementData readDefaultCardData#onError called(error:");
        sb.append(valueOf);
        sb.append(")");
        sb.toString();
        this.f190441a.mo49931a(bres);
    }
}
