package p000;

import android.accounts.Account;

/* renamed from: bavz */
final /* synthetic */ class bavz implements bqeg {

    /* renamed from: a */
    private final bawq f101957a;

    /* renamed from: b */
    private final baws f101958b;

    public bavz(bawq bawq, baws baws) {
        this.f101957a = bawq;
        this.f101958b = baws;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bawq bawq = this.f101957a;
        baws baws = this.f101958b;
        bxvd da = bavr.f101916f.mo74144da();
        baue baue = (baue) baws;
        String str = baue.f101760a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavr bavr = (bavr) da.f164949b;
        str.getClass();
        bavr.f101918a |= 1;
        bavr.f101919b = str;
        String packageName = bawq.f101992a.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavr bavr2 = (bavr) da.f164949b;
        packageName.getClass();
        bavr2.f101918a |= 2;
        bavr2.f101920c = packageName;
        if (baue.f101761b.mo66813a()) {
            String a = bawv.m87644a((Account) baue.f101761b.mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavr bavr3 = (bavr) da.f164949b;
            a.getClass();
            bavr3.f101918a |= 4;
            bavr3.f101921d = a;
        }
        bbch bbch = bawq.f101994c;
        return bqdx.m112673a(bqdx.m112674a(bbch.mo56063a(), new bbcc(bbch, (bavr) da.mo74062i()), bbch.f102327n), bawh.f101972a, bawq.f101996e);
    }
}
