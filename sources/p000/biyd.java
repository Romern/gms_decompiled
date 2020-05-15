package p000;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: biyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyd implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ TemplateLayout f122256a;

    public biyd(TemplateLayout templateLayout) {
        this.f122256a = templateLayout;
    }

    public final boolean onPreDraw() {
        this.f122256a.getViewTreeObserver().removeOnPreDrawListener(this.f122256a.f151465f);
        TemplateLayout templateLayout = this.f122256a;
        templateLayout.setXFraction(templateLayout.f151464e);
        return true;
    }
}
