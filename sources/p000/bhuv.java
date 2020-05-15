package p000;

import java.io.IOException;

/* renamed from: bhuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhuv {

    /* renamed from: a */
    final /* synthetic */ bhux f119658a;

    /* renamed from: b */
    private final int f119659b;

    public bhuv(bhux bhux, int i) {
        this.f119658a = bhux;
        this.f119659b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64328a(int i) {
        bhun bhun;
        this.f119658a.f119669e.mo64318a(2, 3, 1, 0);
        if (i != 1) {
            bhuj.m101555a();
        } else {
            bhuj.m101555a();
        }
        bhuj.m101555a();
        bhux bhux = this.f119658a;
        try {
            bhun = bhuo.m101566a((bvmk) ((bxvd) bvmk.f156745e.mo74144da().mo73633b(srz.m36178b(bhux.f119673i.f119675a.f120237a.getResources().getAssets().open("default_inference_model")))).mo74062i());
            bhuj.m101555a();
        } catch (IOException e) {
            bhun = null;
        }
        bhux.f119668d = bhun;
        bhux bhux2 = this.f119658a;
        bhun bhun2 = bhux2.f119668d;
        if (bhun2 != null) {
            int i2 = bhun2.f119647f;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bhux bhux3 = this.f119658a;
                bhux3.f119669e.mo64318a(4, 2, bpnr.m112100a(i3), bhux3.f119668d.f119646e);
                if (cgfo.m145040b() && this.f119659b != 1) {
                    bvpf bvpf = this.f119658a.f119668d.f119643b;
                    bvpf[] bvpfArr = {bvpf};
                    if ((bvpf.f157280a & 1) != 0 && bvpf.f157282c.size() > 0) {
                        this.f119658a.mo64335a(bvpfArr);
                        bhux bhux4 = this.f119658a;
                        bhux4.mo64334a(new bhuv(bhux4, 1));
                    }
                }
            } else {
                throw null;
            }
        } else {
            bhux2.f119669e.mo64318a(4, 3, 1, 0);
        }
        if (this.f119659b != 0) {
            this.f119658a.mo64338e();
        }
    }

    /* renamed from: a */
    public final void mo64329a(bhun bhun) {
        this.f119658a.mo64333a(bhun);
        int i = bhun.f119647f;
        int i2 = i - 1;
        if (i != 0) {
            this.f119658a.f119669e.mo64318a(2, 2, bpnr.m112100a(i2), bhun.f119646e);
            this.f119658a.f119666b = 0;
            return;
        }
        throw null;
    }
}
