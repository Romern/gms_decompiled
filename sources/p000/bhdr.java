package p000;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: bhdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdr implements C1270pi {

    /* renamed from: a */
    final /* synthetic */ AppBarLayout f118343a;

    public bhdr(AppBarLayout appBarLayout) {
        this.f118343a = appBarLayout;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        C1296qh qhVar2;
        AppBarLayout appBarLayout = this.f118343a;
        if (!C1280ps.m19938t(appBarLayout)) {
            qhVar2 = null;
        } else {
            qhVar2 = qhVar;
        }
        if (!C1239oe.m19757a(appBarLayout.f150995c, qhVar2)) {
            appBarLayout.f150995c = qhVar2;
            appBarLayout.mo70972b();
            appBarLayout.requestLayout();
        }
        return qhVar;
    }
}
