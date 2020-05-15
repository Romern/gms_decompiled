package p000;

import com.google.android.gms.carsetup.frx.SetupFsm$AutoIntroState;

/* renamed from: oxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oxf implements pbu {

    /* renamed from: a */
    final /* synthetic */ SetupFsm$AutoIntroState f38561a;

    public oxf(SetupFsm$AutoIntroState setupFsm$AutoIntroState) {
        this.f38561a = setupFsm$AutoIntroState;
    }

    /* renamed from: a */
    public final void mo22740a(bpeb bpeb, bpea bpea) {
        bxvd da = bped.f137237x.mo74144da();
        int i = bpeb.f137221cE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bped bped = (bped) da.f164949b;
        int i2 = bped.f137239a | 1;
        bped.f137239a = i2;
        bped.f137240b = i;
        int i3 = bpea.f137033jW;
        bped.f137239a = i2 | 2;
        bped.f137241c = i3;
        this.f38561a.f38587c.mo22750a((bped) da.mo74062i());
    }
}
