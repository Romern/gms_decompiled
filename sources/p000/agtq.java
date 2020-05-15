package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: agtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agtq extends abz {

    /* renamed from: a */
    final /* synthetic */ C1341rz f66510a;

    /* renamed from: b */
    final /* synthetic */ agtr f66511b;

    public agtq(agtr agtr, C1341rz rzVar) {
        this.f66511b = agtr;
        this.f66510a = rzVar;
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        C1341rz rzVar = this.f66510a;
        float f = 0.0f;
        if (!(recyclerView.getChildCount() == 0 || recyclerView.getChildAt(0).getTop() == 0)) {
            f = this.f66511b.f66514c;
        }
        rzVar.mo15839a(f);
    }
}
