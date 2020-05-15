package p000;

import android.view.View;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;

/* renamed from: bkel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkel extends C1287pz {

    /* renamed from: a */
    final int f124087a;

    /* renamed from: b */
    final /* synthetic */ MaterialFieldLayout f124088b;

    public bkel(MaterialFieldLayout materialFieldLayout, int i) {
        this.f124088b = materialFieldLayout;
        this.f124087a = i;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        view.setVisibility(this.f124087a);
        view.setAlpha(1.0f);
        if (this.f124087a == 8) {
            MaterialFieldLayout materialFieldLayout = this.f124088b;
            C1280ps.m19885a(materialFieldLayout, C1280ps.m19925i(materialFieldLayout), this.f124088b.getPaddingTop(), C1280ps.m19927j(this.f124088b), this.f124088b.f152146a);
        }
        this.f124088b.mo72056e();
    }
}
