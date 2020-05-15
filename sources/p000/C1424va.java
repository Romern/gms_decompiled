package p000;

import android.view.View;

/* renamed from: va */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1424va extends C1287pz {

    /* renamed from: a */
    final /* synthetic */ C1425vb f27333a;

    /* renamed from: b */
    private boolean f27334b = false;

    /* renamed from: c */
    private int f27335c = 0;

    public C1424va(C1425vb vbVar) {
        this.f27333a = vbVar;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        int i = this.f27335c + 1;
        this.f27335c = i;
        if (i == this.f27333a.f27336a.size()) {
            C1286py pyVar = this.f27333a.f27337b;
            if (pyVar != null) {
                pyVar.mo484a(null);
            }
            this.f27335c = 0;
            this.f27334b = false;
            this.f27333a.f27338c = false;
        }
    }

    /* renamed from: b */
    public final void mo485b() {
        if (!this.f27334b) {
            this.f27334b = true;
            C1286py pyVar = this.f27333a.f27337b;
            if (pyVar != null) {
                pyVar.mo485b();
            }
        }
    }
}
