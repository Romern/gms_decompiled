package p000;

import android.view.ViewTreeObserver;
import com.android.setupwizardlib.TemplateLayout;

/* renamed from: bma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bma implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ TemplateLayout f5154a;

    public bma(TemplateLayout templateLayout) {
        this.f5154a = templateLayout;
    }

    public final boolean onPreDraw() {
        this.f5154a.getViewTreeObserver().removeOnPreDrawListener(this.f5154a.f7204c);
        TemplateLayout templateLayout = this.f5154a;
        templateLayout.setXFraction(templateLayout.f7203b);
        return true;
    }
}
