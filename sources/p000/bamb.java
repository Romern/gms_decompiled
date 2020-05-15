package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: bamb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamb extends cazu {

    /* renamed from: b */
    private final cazn f101248b;

    /* renamed from: c */
    private final cazn f101249c;

    public bamb(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bamb.class), cijl);
        this.f101248b = cbac.m127643a(cazn);
        this.f101249c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101248b.mo75201b(), this.f101249c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        return bqga.m112775a(Long.valueOf(((bakr) list.get(1)).mo55731c((Account) list.get(0))));
    }
}
