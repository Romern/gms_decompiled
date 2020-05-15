package p000;

import android.accounts.Account;

/* renamed from: bavx */
final /* synthetic */ class bavx implements bqeg {

    /* renamed from: a */
    private final bawq f101954a;

    /* renamed from: b */
    private final batz f101955b;

    public bavx(bawq bawq, batz batz) {
        this.f101954a = bawq;
        this.f101955b = batz;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bawq bawq = this.f101954a;
        baub baub = (baub) this.f101955b;
        Object[] objArr = {"MobileDataDownload", baub.f101747a.f101774b, String.valueOf(baub.f101748b.mo66815c())};
        baui baui = baub.f101747a;
        if ((baui.f101773a & 2) == 0) {
            bxvd bxvd = (bxvd) baui.mo74142c(5);
            bxvd.mo73625a((bxvk) baui);
            bauh bauh = (bauh) bxvd;
            String packageName = bawq.f101992a.getPackageName();
            if (bauh.f164950c) {
                bauh.mo74035c();
                bauh.f164950c = false;
            }
            baui baui2 = (baui) bauh.f164949b;
            baui baui3 = baui.f101771e;
            packageName.getClass();
            baui2.f101773a |= 2;
            baui2.f101775c = packageName;
            baui = (baui) bauh.mo74062i();
        } else if (!bawq.f101992a.getPackageName().equals(baui.f101775c)) {
            bbev.m87910b("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", baui.f101774b, bawq.f101992a.getPackageName(), baui.f101775c);
            return bqga.m112775a((Object) false);
        }
        bxvd da = bavr.f101916f.mo74144da();
        String str = baui.f101774b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavr bavr = (bavr) da.f164949b;
        str.getClass();
        int i = bavr.f101918a | 1;
        bavr.f101918a = i;
        bavr.f101919b = str;
        String str2 = baui.f101775c;
        str2.getClass();
        bavr.f101918a = 2 | i;
        bavr.f101920c = str2;
        if (baub.f101748b.mo66813a()) {
            String a = bawv.m87644a((Account) baub.f101748b.mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavr bavr2 = (bavr) da.f164949b;
            a.getClass();
            bavr2.f101918a |= 4;
            bavr2.f101921d = a;
        }
        try {
            return bawq.f101994c.mo56065a((bavr) da.mo74062i(), bbff.m87924a(baui));
        } catch (bxwf e) {
            bbev.m87908a(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
            return bqga.m112775a((Object) false);
        }
    }
}
