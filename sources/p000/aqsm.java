package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqsm implements aqru, aqrv, aqrw, aqsg, aqtc {

    /* renamed from: a */
    public final bziw f86698a;

    /* renamed from: b */
    public boolean f86699b;

    /* renamed from: c */
    public final aqsh f86700c;

    /* renamed from: d */
    public final aqrx f86701d;

    /* renamed from: e */
    public final List f86702e = new ArrayList();

    /* renamed from: f */
    public final aqsb f86703f;

    /* renamed from: g */
    public bhnh f86704g;

    /* renamed from: h */
    public int f86705h;

    /* renamed from: i */
    private bxtx f86706i;

    public aqsm(aqsh aqsh, bziw bziw, aqrx aqrx, aqsb aqsb) {
        this.f86700c = aqsh;
        aqsh.f86688f = this;
        this.f86698a = bziw;
        this.f86701d = aqrx;
        this.f86703f = aqsb;
    }

    /* renamed from: a */
    public final void mo48129a() {
        this.f86700c.f86684b.setVisibility(0);
        this.f86700c.f86692j.setVisibility(4);
        this.f86700c.mo48125a();
        bhnh bhnh = this.f86704g;
        if (bhnh != null) {
            bhnh.mo64021d();
        }
        this.f86704g = null;
        aqrx aqrx = this.f86701d;
        bxtx bxtx = this.f86706i;
        aqwv aqwv = aqrx.f86673a;
        bxvd da = bziq.f170219f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bziq bziq = (bziq) da.f164949b;
        bziq.f170222b = 5;
        bziq.f170221a |= 1;
        bxvd da2 = bzix.f170252c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzix bzix = (bzix) da2.f164949b;
        bxtx.getClass();
        bzix.f170254a |= 1;
        bzix.f170255b = bxtx;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bziq bziq2 = (bziq) da.f164949b;
        bzix bzix2 = (bzix) da2.mo74062i();
        bzix2.getClass();
        bziq2.f170225e = bzix2;
        bziq2.f170221a |= 16;
        aqwv.mo48201a(7, aqrx.m72025a((bziq) da.mo74062i()), new aqrt(this));
    }

    /* renamed from: a */
    public final void mo48130a(Bundle bundle) {
        bundle.putBoolean("mergeCardHasDismissed", this.f86699b);
    }

    /* renamed from: a */
    public final void mo48131a(bxtx bxtx) {
        if (!bxtx.mo73779j()) {
            this.f86706i = bxtx;
        }
    }
}
