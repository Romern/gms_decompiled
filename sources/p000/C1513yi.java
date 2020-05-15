package p000;

import android.support.p002v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;

/* renamed from: yi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1513yi implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C1515yk f27647a;

    public C1513yi(C1515yk ykVar) {
        this.f27647a = ykVar;
    }

    public final void onGlobalLayout() {
        C1515yk ykVar = this.f27647a;
        AppCompatSpinner appCompatSpinner = ykVar.f27653d;
        if (!C1280ps.m19871F(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(ykVar.f27652c)) {
            this.f27647a.mo105d();
            return;
        }
        this.f27647a.mo16565h();
        C1513yi.super.mo101aI();
    }
}
