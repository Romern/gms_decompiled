package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: wda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wda extends cazu {

    /* renamed from: b */
    private final cazn f50527b;

    /* renamed from: c */
    private final cazn f50528c;

    public wda(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(wda.class), cijl);
        this.f50527b = cbac.m127643a(cazn);
        this.f50528c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50527b.mo75201b(), this.f50528c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Account[] accountArr = (Account[]) list.get(0);
        wbg wbg = (wbg) list.get(1);
        bngs j = bngx.m109377j();
        for (Account account : accountArr) {
            cazf.m127594a(account);
            wbg.f50385a = account;
            cazf.m127595a(wbg.f50385a, Account.class);
            j.mo67668c(new wcs(wbg.f50386b, wbg.f50385a).f50503a.mo75201b());
        }
        return bqga.m112774a((Iterable) j.mo67664a());
    }
}
