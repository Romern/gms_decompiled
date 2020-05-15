package p000;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: bhea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhea implements C1270pi {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f118357a;

    public bhea(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f118357a = collapsingToolbarLayout;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        C1296qh qhVar2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f118357a;
        if (!C1280ps.m19938t(collapsingToolbarLayout)) {
            qhVar2 = null;
        } else {
            qhVar2 = qhVar;
        }
        if (!C1239oe.m19757a(collapsingToolbarLayout.f151023d, qhVar2)) {
            collapsingToolbarLayout.f151023d = qhVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return qhVar.mo15740g();
    }
}
