package p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: vb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1425vb {

    /* renamed from: a */
    public final ArrayList f27336a = new ArrayList();

    /* renamed from: b */
    C1286py f27337b;

    /* renamed from: c */
    public boolean f27338c;

    /* renamed from: d */
    private long f27339d = -1;

    /* renamed from: e */
    private Interpolator f27340e;

    /* renamed from: f */
    private final C1287pz f27341f = new C1424va(this);

    /* renamed from: a */
    public final void mo16125a() {
        if (!this.f27338c) {
            ArrayList arrayList = this.f27336a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1285px pxVar = (C1285px) arrayList.get(i);
                long j = this.f27339d;
                if (j >= 0) {
                    pxVar.mo15709a(j);
                }
                Interpolator interpolator = this.f27340e;
                if (interpolator != null) {
                    pxVar.mo15710a(interpolator);
                }
                if (this.f27337b != null) {
                    pxVar.mo15711a(this.f27341f);
                }
                pxVar.mo15713b();
            }
            this.f27338c = true;
        }
    }

    /* renamed from: a */
    public final void mo16126a(Interpolator interpolator) {
        if (!this.f27338c) {
            this.f27340e = interpolator;
        }
    }

    /* renamed from: a */
    public final void mo16128a(C1286py pyVar) {
        if (!this.f27338c) {
            this.f27337b = pyVar;
        }
    }

    /* renamed from: b */
    public final void mo16129b() {
        if (this.f27338c) {
            ArrayList arrayList = this.f27336a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1285px) arrayList.get(i)).mo15707a();
            }
            this.f27338c = false;
        }
    }

    /* renamed from: c */
    public final void mo16130c() {
        if (!this.f27338c) {
            this.f27339d = 250;
        }
    }

    /* renamed from: a */
    public final void mo16127a(C1285px pxVar) {
        if (!this.f27338c) {
            this.f27336a.add(pxVar);
        }
    }
}
