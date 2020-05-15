package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.view.NavigationBar;

/* renamed from: bjah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjah implements biyr {

    /* renamed from: a */
    private final TemplateLayout f122417a;

    public bjah(TemplateLayout templateLayout) {
        this.f122417a = templateLayout;
    }

    /* renamed from: a */
    public final NavigationBar mo64947a() {
        View b = this.f122417a.mo71345b(C0126R.C0129id.sud_layout_navigation_bar);
        if (b instanceof NavigationBar) {
            return (NavigationBar) b;
        }
        return null;
    }
}
