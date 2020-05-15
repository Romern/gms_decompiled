package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: baji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baji extends cazu {

    /* renamed from: b */
    private final cazn f101055b;

    /* renamed from: c */
    private final cazn f101056c;

    /* renamed from: d */
    private final cazn f101057d;

    public baji(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(baji.class), cijl);
        this.f101055b = cbac.m127643a(cazn);
        this.f101056c = cbac.m127643a(cazn2);
        this.f101057d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101055b.mo75201b(), this.f101056c.mo75201b(), this.f101057d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        byhn byhn;
        List list = (List) obj;
        boolean z = false;
        Account account = (Account) list.get(0);
        bygz bygz = (bygz) list.get(1);
        bahc bahc = (bahc) list.get(2);
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm a = byhm.m124816a(byhn.f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        if (a == byhm.SYNC_COMBINED) {
            z = true;
        }
        bmxy.m108596a(z, "Combined sync producer called for wrong %s sync variant!", a);
        throw new UnsupportedOperationException("Not yet available");
    }
}
