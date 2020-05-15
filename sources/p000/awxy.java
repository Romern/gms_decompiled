package p000;

import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: awxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxy extends biyn {

    /* renamed from: a */
    public Button f95267a;

    /* renamed from: b */
    public Button f95268b;

    /* renamed from: c */
    public awxr f95269c;

    public awxy(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        super(templateLayout, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo52733a(biyp biyp) {
        super.mo52733a(biyp);
        this.f95267a = mo64874a();
    }

    /* renamed from: b */
    public final void mo52735b(biyp biyp) {
        super.mo52735b(biyp);
        this.f95268b = mo64880e();
    }

    /* renamed from: c */
    public final Button mo52736c(biyp biyp) {
        int i = biyp.f122331a;
        if (i == 4) {
            return this.f95267a;
        }
        if (i == 7) {
            return this.f95268b;
        }
        throw new IllegalStateException("invalid FooterButton button type");
    }

    /* renamed from: a */
    public final boolean mo52734a(biyp biyp, Runnable runnable) {
        return mo52736c(biyp).removeCallbacks(runnable);
    }
}
