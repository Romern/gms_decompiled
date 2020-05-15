package p000;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: bbpy */
final /* synthetic */ class bbpy implements rkl {

    /* renamed from: a */
    private final bbqb f103047a;

    /* renamed from: b */
    private final bqgy f103048b;

    /* renamed from: c */
    private final rkb f103049c;

    public bbpy(bbqb bbqb, bqgy bqgy, rkb rkb) {
        this.f103047a = bbqb;
        this.f103048b = bqgy;
        this.f103049c = rkb;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        bbqb bbqb = this.f103047a;
        bqgy bqgy = this.f103048b;
        rkb rkb = this.f103049c;
        icc icc = (icc) rkk;
        Status status = icc.f20721a;
        if (!status.mo17710c()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Error generating spatula header: ");
            sb.append(valueOf);
            bqgy.mo69136a((Throwable) new Exception(sb.toString()));
            bbqb.f103056c = null;
        } else if (TextUtils.isEmpty(icc.f20722b)) {
            bqgy.mo69136a((Throwable) new Exception("Spatula header is empty"));
        } else {
            bbqb.f103055b = icc.f20722b;
            String valueOf2 = String.valueOf(bbqb.f103055b);
            bbos.m88289a("ClntIntrcptrFctryV12", valueOf2.length() == 0 ? new String("Spatula header: ") : "Spatula header: ".concat(valueOf2));
            bqgy.mo69138b((Object) null);
        }
        rkb.mo24803g();
    }
}
