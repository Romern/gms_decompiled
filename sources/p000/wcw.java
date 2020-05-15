package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: wcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wcw extends cazu {

    /* renamed from: b */
    private final cazn f50516b;

    /* renamed from: c */
    private final cazn f50517c;

    /* renamed from: d */
    private final cazn f50518d;

    public wcw(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(wcw.class), cijl);
        this.f50516b = cbac.m127643a(cazn);
        this.f50517c = cbac.m127643a(cazn2);
        this.f50518d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50516b.mo75201b(), this.f50517c.mo75201b(), this.f50518d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bqgy c = bqgy.m112818c();
        rke a = ((rjx) list.get(1)).mo24713a(((Account) list.get(0)).name, ((bycs) list.get(2)).f165690i, 0);
        c.getClass();
        a.mo9458a(new wct(c));
        return c;
    }
}
