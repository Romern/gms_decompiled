package p000;

import android.os.Bundle;
import android.view.View;

/* renamed from: aoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoo extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ aop f1892b;

    public aoo(aop aop) {
        this.f1892b = aop;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        this.f1892b.f1894e.mo345a(view, qmVar);
        int childAdapterPosition = this.f1892b.f1893d.getChildAdapterPosition(view);
        abh adapter = this.f1892b.f1893d.getAdapter();
        if (adapter instanceof aoi) {
            ((aoi) adapter).mo2229f(childAdapterPosition);
        }
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        return this.f1892b.f1894e.mo346a(view, i, bundle);
    }
}
