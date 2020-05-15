package p000;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: bjai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjai implements biyr {

    /* renamed from: a */
    private final TemplateLayout f122418a;

    /* renamed from: b */
    private ColorStateList f122419b;

    public bjai(TemplateLayout templateLayout) {
        this.f122418a = templateLayout;
    }

    /* renamed from: a */
    public final void mo64948a(ColorStateList colorStateList) {
        this.f122419b = colorStateList;
        int i = Build.VERSION.SDK_INT;
        ProgressBar b = mo64951b();
        if (b != null) {
            b.setIndeterminateTintList(colorStateList);
            int i2 = Build.VERSION.SDK_INT;
            b.setProgressBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public final ProgressBar mo64951b() {
        return (ProgressBar) this.f122418a.mo71345b(C0126R.C0129id.sud_layout_progress);
    }

    /* renamed from: a */
    public final void mo64949a(boolean z) {
        if (!z) {
            ProgressBar b = mo64951b();
            if (b != null) {
                b.setVisibility(8);
                return;
            }
            return;
        }
        if (mo64951b() == null) {
            ViewStub viewStub = (ViewStub) this.f122418a.mo71345b(C0126R.C0129id.sud_layout_progress_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            mo64948a(this.f122419b);
        }
        ProgressBar b2 = mo64951b();
        if (b2 != null) {
            b2.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final boolean mo64950a() {
        View b = this.f122418a.mo71345b(C0126R.C0129id.sud_layout_progress);
        return b != null && b.getVisibility() == 0;
    }
}
