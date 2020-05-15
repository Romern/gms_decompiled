package p000;

import android.os.Bundle;

/* renamed from: mxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mxd extends dns {

    /* renamed from: B */
    public mvd f34882B;

    /* renamed from: e */
    public String mo17249e() {
        return null;
    }

    /* renamed from: f */
    public String mo17250f() {
        return null;
    }

    /* renamed from: g */
    public abstract int mo17251g();

    public void onCreate(Bundle bundle) {
        mvd mvd = new mvd(getActivity());
        this.f34882B = mvd;
        int g = mo17251g();
        bxvd da = mrc.f34385c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mrc mrc = (mrc) da.f164949b;
        int i = g - 1;
        if (g != 0) {
            mrc.f34388b = i;
            mrc.f34387a |= 1;
            mrc mrc2 = (mrc) da.mo74062i();
            bxvd da2 = mqy.f34367f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mqy mqy = (mqy) da2.f164949b;
            mrc2.getClass();
            mqy.f34370b = mrc2;
            int i2 = mqy.f34369a | 1;
            mqy.f34369a = i2;
            mqy.f34372d = 1;
            mqy.f34369a = i2 | 4;
            mvd.mo20268a((mqy) da2.mo74062i());
            super.onCreate(bundle);
            return;
        }
        throw null;
    }
}
