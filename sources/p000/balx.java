package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: balx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class balx extends cazu {

    /* renamed from: b */
    private final cazn f101234b;

    /* renamed from: c */
    private final cazn f101235c;

    /* renamed from: d */
    private final cazn f101236d;

    /* renamed from: e */
    private final cazn f101237e;

    public balx(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(balx.class), cijl);
        this.f101234b = cbac.m127643a(cazn);
        this.f101235c = cbac.m127643a(cazn2);
        this.f101236d = cbac.m127643a(cazn3);
        this.f101237e = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101234b.mo75201b(), this.f101235c.mo75201b(), this.f101236d.mo75201b(), this.f101237e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bakr bakr = (bakr) list.get(1);
        byiw byiw = (byiw) list.get(3);
        bakr.mo55729a((Account) list.get(0), ((Long) list.get(2)).longValue());
        return bqga.m112775a(bpyi.f139852o);
    }
}
