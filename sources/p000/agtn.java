package p000;

import android.util.Pair;

/* renamed from: agtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agtn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Pair f66492a;

    /* renamed from: b */
    final /* synthetic */ boolean f66493b;

    /* renamed from: c */
    final /* synthetic */ agto f66494c;

    public agtn(agto agto, Pair pair, boolean z) {
        this.f66494c = agto;
        this.f66492a = pair;
        this.f66493b = z;
    }

    public final void run() {
        int i;
        agta agta = new agta();
        agto agto = this.f66494c;
        agta.f66418a = agto.f66497b;
        agta.f66419b = agto.f66498c.f66261a;
        agta.f66420c = (Long) this.f66492a.first;
        agta.f66421d = (String) this.f66492a.second;
        agta.f66422e = true;
        if (!this.f66493b) {
            i = 6;
        } else {
            i = 3;
        }
        agta.f66425h = i;
        agta.f66423f = this.f66494c.f66496a.f80288f;
        agta.mo36075a().mo36076a();
    }
}
