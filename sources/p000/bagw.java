package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: bagw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagw extends cazu {

    /* renamed from: b */
    private final cazn f100841b;

    /* renamed from: c */
    private final cazn f100842c;

    /* renamed from: d */
    private final cazn f100843d;

    /* renamed from: e */
    private final cazn f100844e;

    public bagw(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(bagw.class), cijl);
        this.f100841b = cbac.m127643a(cazn);
        this.f100842c = cbac.m127643a(cazn2);
        this.f100843d = cbac.m127643a(cazn3);
        this.f100844e = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100841b.mo75201b(), this.f100842c.mo75201b(), this.f100843d.mo75201b(), this.f100844e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        byhn byhn;
        List list = (List) obj;
        boolean z = false;
        Account account = (Account) list.get(0);
        bygz bygz = (bygz) list.get(1);
        bafj bafj = (bafj) list.get(2);
        baqq baqq = (baqq) list.get(3);
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm a = byhm.m124816a(byhn.f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        if (a == byhm.SYNC_LATEST_PER_SECONDARY_ID) {
            z = true;
        }
        bmxy.m108596a(z, "Latest Only sync producer called for wrong %s sync variant.", a);
        bafl a2 = bafj.mo55662a(account, byhn.f166481b, byhn.f166482c);
        baqq.mo55888a(a2);
        return bqga.m112775a(a2);
    }
}
