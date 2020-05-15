package p000;

import android.content.Context;

/* renamed from: mvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvd {

    /* renamed from: a */
    private final qws f34798a;

    public mvd(Context context) {
        this.f34798a = new qws(context, "ANDROID_BACKUP", null);
    }

    /* renamed from: a */
    public final void mo20267a(int i) {
        bxvd da = msw.f34597c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msw msw = (msw) da.f164949b;
        msw.f34600b = i - 1;
        msw.f34599a |= 1;
        msw msw2 = (msw) da.mo74062i();
        bxvd da2 = mqy.f34367f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        mqy mqy = (mqy) da2.f164949b;
        msw2.getClass();
        mqy.f34371c = msw2;
        int i2 = mqy.f34369a | 2;
        mqy.f34369a = i2;
        mqy.f34372d = 3;
        mqy.f34369a = i2 | 4;
        mo20268a((mqy) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo20268a(mqy mqy) {
        bxvd a = lyu.m24685a();
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqk mqk2 = mqk.f34276G;
        mqy.getClass();
        mqk.f34292i = mqy;
        mqk.f34284a |= 64;
        mqk mqk3 = (mqk) a.mo74062i();
        if (ccmz.m130716d()) {
            qwo a2 = this.f34798a.mo24335a(mqk3.mo73642k());
            a2.mo24328b(5);
            a2.mo24327b();
        }
    }
}
