package p000;

import android.content.Context;

/* renamed from: bcxp */
final /* synthetic */ class bcxp implements bmxj {

    /* renamed from: a */
    private final Context f105106a;

    /* renamed from: b */
    private final String f105107b;

    public bcxp(Context context, String str) {
        this.f105106a = context;
        this.f105107b = str;
    }

    public final Object apply(Object obj) {
        Context context = this.f105106a;
        String str = this.f105107b;
        cbfs cbfs = (cbfs) obj;
        bczm h = bczn.m90361h();
        cbdr cbdr = cbfs.f176968g;
        if (cbdr == null) {
            cbdr = cbdr.f176775f;
        }
        if (cbdr.mo74020aS()) {
            cbdr cbdr2 = cbfs.f176968g;
            if (cbdr2 == null) {
                cbdr2 = cbdr.f176775f;
            }
            h.mo57794a(bclj.m89242a(cbdr2));
        }
        cbdj cbdj = cbfs.f176963b;
        if (cbdj == null) {
            cbdj = cbdj.f176740j;
        }
        bmxv a = bclb.m89215a(context, cbdj, bmxv.m108566b(str), bmxv.m108566b(str));
        if (!a.mo66813a()) {
            return bmvz.f131120a;
        }
        h.mo57795a(cbfs.f176962a);
        h.mo57793a((bcov) a.mo66814b());
        bzrt bzrt = cbfs.f176964c;
        if (bzrt == null) {
            bzrt = bzrt.f171195e;
        }
        h.mo57798c(bclc.m89223a(bzrt));
        bzrt bzrt2 = cbfs.f176965d;
        if (bzrt2 == null) {
            bzrt2 = bzrt.f171195e;
        }
        h.mo57792a(bclc.m89223a(bzrt2));
        bzrt bzrt3 = cbfs.f176966e;
        if (bzrt3 == null) {
            bzrt3 = bzrt.f171195e;
        }
        h.mo57797b(bclc.m89223a(bzrt3));
        h.mo57796a(cbfs.f176967f);
        return bmxv.m108566b(h.mo57791a());
    }
}
