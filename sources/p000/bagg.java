package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: bagg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagg extends cazu {

    /* renamed from: b */
    private final cazn f100784b;

    /* renamed from: c */
    private final cazn f100785c;

    /* renamed from: d */
    private final cazn f100786d;

    /* renamed from: e */
    private final cazn f100787e;

    /* renamed from: f */
    private final cazn f100788f;

    /* renamed from: g */
    private final cazn f100789g;

    public bagg(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6) {
        super(cijl2, cbag.m127657a(bagg.class), cijl);
        this.f100784b = cbac.m127643a(cazn);
        this.f100785c = cbac.m127643a(cazn2);
        this.f100786d = cbac.m127643a(cazn3);
        this.f100787e = cbac.m127643a(cazn4);
        this.f100788f = cbac.m127643a(cazn5);
        this.f100789g = cbac.m127643a(cazn6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100784b.mo75201b(), this.f100785c.mo75201b(), this.f100786d.mo75201b(), this.f100787e.mo75201b(), this.f100788f.mo75201b(), this.f100789g.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        bygz bygz = (bygz) list.get(1);
        byjj byjj = (byjj) list.get(2);
        baok baok = (baok) list.get(3);
        babr babr = (babr) list.get(5);
        return ((byik) list.get(4)).mo74382a(bagc.m86829a(account, bygz, byjj, baok, babr.mo32680b(), babr));
    }
}
