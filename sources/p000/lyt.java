package p000;

import android.content.Context;

/* renamed from: lyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyt {

    /* renamed from: a */
    private final qws f33218a;

    public lyt(Context context) {
        this.f33218a = new qws(context, "ANDROID_BACKUP", null);
    }

    /* renamed from: a */
    public final void mo19760a(int i) {
        bxvd da = msy.f34602c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msy msy = (msy) da.f164949b;
        msy.f34605b = i - 1;
        msy.f34604a |= 1;
        msy msy2 = (msy) da.mo74062i();
        bxvd a = lyu.m24685a();
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqk mqk2 = mqk.f34276G;
        msy2.getClass();
        mqk.f34283F = msy2;
        mqk.f34285b |= 512;
        mqk mqk3 = (mqk) a.mo74062i();
        if (ccmz.m130716d()) {
            qwo a2 = this.f33218a.mo24335a(mqk3.serializeToBytes());
            a2.mo24328b(42);
            a2.mo24327b();
        }
    }
}
