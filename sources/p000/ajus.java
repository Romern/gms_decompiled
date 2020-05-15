package p000;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajus extends ajvi {

    /* renamed from: a */
    final /* synthetic */ Drawable f71318a;

    /* renamed from: b */
    final /* synthetic */ ajuv f71319b;

    public ajus(ajuv ajuv, Drawable drawable) {
        this.f71319b = ajuv;
        this.f71318a = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f71319b.f71332u.setIndeterminate(false);
        this.f71319b.mo38944a(this.f71318a);
        if (this.f71319b.f71332u.getTag(C0126R.C0129id.progress_bar) != null) {
            ProgressBar progressBar = this.f71319b.f71332u;
            progressBar.setProgress(((Integer) progressBar.getTag(C0126R.C0129id.progress_bar)).intValue());
        }
        ajwt ajwt = this.f71319b.f71333v;
        ajwt.f71459a = 8000;
        ajwt.mo39023a().setLevel(8000);
        this.f71319b.f71329E = null;
    }
}
