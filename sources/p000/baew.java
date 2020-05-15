package p000;

import android.accounts.Account;

/* renamed from: baew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baew implements baqk {

    /* renamed from: a */
    public final baex f100575a;

    /* renamed from: b */
    public final cayo f100576b;

    public baew(baex baex) {
        this.f100575a = baex;
        baex.getClass();
        this.f100576b = new baeu(baex);
    }

    /* renamed from: a */
    public final bqgg mo55652a(bygz bygz, Account account, boolean z, boolean z2) {
        badx badx = new badx();
        baex baex = this.f100575a;
        cazf.m127594a(baex);
        badx.f100541c = baex;
        baql baql = new baql(account, bygz);
        cazf.m127594a(baql);
        badx.f100539a = baql;
        baqh baqh = new baqh(z, z2);
        cazf.m127594a(baqh);
        badx.f100540b = baqh;
        cazf.m127595a(badx.f100539a, baql.class);
        cazf.m127595a(badx.f100540b, baqh.class);
        cazf.m127595a(badx.f100541c, baex.class);
        return bqdf.m112620a(new baey(badx.f100539a, badx.f100540b, badx.f100541c).f100656b.mo75201b(), Exception.class, new baev(this), bqfb.INSTANCE);
    }
}
