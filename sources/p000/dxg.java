package p000;

import android.content.Context;

/* renamed from: dxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxg extends dxd {

    /* renamed from: f */
    private final bxqt f14356f;

    public dxg(Context context, doh doh, bxqt bxqt, dwu dwu, dqb dqb) {
        super(context, "ReadFootprintsContextTask", doh, "readfootprintscontext", 12550, 11, bxiz.f163590d, cdhr.m133452b(), dwu, dqb, null);
        this.f14356f = bxqt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxiz) bxxc).f163592a;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxiy.f163585d.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxiy bxiy = (bxiy) da.f164949b;
        a.getClass();
        bxiy.f163588b = a;
        int i = bxiy.f163587a | 1;
        bxiy.f163587a = i;
        bxqt bxqt = this.f14356f;
        if (bxqt != null) {
            bxqt.getClass();
            bxiy.f163589c = bxqt;
            bxiy.f163587a = i | 2;
        }
        return (bxiy) da.mo74062i();
    }
}
