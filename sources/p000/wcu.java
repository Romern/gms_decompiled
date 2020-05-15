package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: wcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wcu extends cazu {

    /* renamed from: b */
    private final cazn f50511b;

    /* renamed from: c */
    private final cazn f50512c;

    public wcu(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(wcu.class), cijl);
        this.f50511b = cbac.m127643a(cazn);
        this.f50512c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50511b.mo75201b(), this.f50512c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        return bqga.m112775a(((iws) list.get(1)).mo13417a((Account) list.get(0)));
    }
}
