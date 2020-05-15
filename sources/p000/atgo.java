package p000;

import android.content.Context;

/* renamed from: atgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgo {

    /* renamed from: a */
    public final atam f90306a;

    public atgo(Context context) {
        this.f90306a = new atam(context, null);
    }

    /* renamed from: a */
    public static int m75852a(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 4 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo49963a(int i, int i2) {
        int a = m75852a(i);
        int i3 = i2 - 1;
        int i4 = 6;
        if (i3 == 2) {
            i4 = 3;
        } else if (i3 == 3) {
            i4 = 4;
        } else if (i3 == 4) {
            i4 = 5;
        } else if (i3 != 5) {
            i4 = i3 != 6 ? 8 : 7;
        }
        atam atam = this.f90306a;
        bxvd g = atam.mo49765g(147);
        bxvd da = boyx.f135353e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boyx boyx = (boyx) da.f164949b;
        boyx.f135356b = a - 1;
        int i5 = boyx.f135355a | 1;
        boyx.f135355a = i5;
        boyx.f135357c = 2;
        int i6 = i5 | 2;
        boyx.f135355a = i6;
        boyx.f135358d = i4 - 1;
        boyx.f135355a = i6 | 4;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        boyx boyx2 = (boyx) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boyx2.getClass();
        bpbx.f135652P = boyx2;
        bpbx.f135656b |= 8192;
        atam.mo49741a((bpbx) g.mo74062i());
    }
}
