package p000;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: bhed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhed implements bhdz {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f118361a;

    public bhed(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f118361a = collapsingToolbarLayout;
    }

    /* renamed from: a */
    public final void mo10589a(AppBarLayout appBarLayout, int i) {
        int i2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f118361a;
        collapsingToolbarLayout.f151022c = i;
        C1296qh qhVar = collapsingToolbarLayout.f151023d;
        if (qhVar != null) {
            i2 = qhVar.mo15733b();
        } else {
            i2 = 0;
        }
        int childCount = this.f118361a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f118361a.getChildAt(i3);
            bhec bhec = (bhec) childAt.getLayoutParams();
            bhej a = CollapsingToolbarLayout.m117457a(childAt);
            int i4 = bhec.f118359a;
            if (i4 == 1) {
                a.mo63604a(C1183mc.m19626a(-i, 0, this.f118361a.mo71000b(childAt)));
            } else if (i4 == 2) {
                a.mo63604a(Math.round(((float) (-i)) * bhec.f118360b));
            }
        }
        this.f118361a.mo70997a();
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.f118361a;
        if (collapsingToolbarLayout2.f151021b != null && i2 > 0) {
            C1280ps.m19915e(collapsingToolbarLayout2);
        }
        this.f118361a.f151020a.mo63856b(((float) Math.abs(i)) / ((float) ((this.f118361a.getHeight() - C1280ps.m19930l(this.f118361a)) - i2)));
    }
}
