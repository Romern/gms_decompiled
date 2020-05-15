package p000;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: xv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1499xv {

    /* renamed from: a */
    private final ImageView f27619a;

    public C1499xv(ImageView imageView) {
        this.f27619a = imageView;
    }

    /* renamed from: a */
    public final void mo16514a(int i) {
        if (i != 0) {
            Drawable b = C1391tv.m20459b(this.f27619a.getContext(), i);
            if (b != null) {
                C1540zi.m20970a();
            }
            this.f27619a.setImageDrawable(b);
        } else {
            this.f27619a.setImageDrawable(null);
        }
        mo16517b();
    }

    /* renamed from: b */
    public final void mo16517b() {
        Drawable drawable = this.f27619a.getDrawable();
        if (drawable != null) {
            C1540zi.m20970a();
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* renamed from: a */
    public final void mo16515a(AttributeSet attributeSet, int i) {
        int f;
        adr a = adr.m523a(this.f27619a.getContext(), attributeSet, C1390tu.f27197f, i, 0);
        ImageView imageView = this.f27619a;
        C1280ps.m19886a(imageView, imageView.getContext(), C1390tu.f27197f, attributeSet, a.f290b, i, 0);
        try {
            Drawable drawable = this.f27619a.getDrawable();
            if (!(drawable != null || (f = a.mo460f(1, -1)) == -1 || (drawable = C1391tv.m20459b(this.f27619a.getContext(), f)) == null)) {
                this.f27619a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C1540zi.m20970a();
            }
            if (a.mo461f(2)) {
                C1329rn.m20096a(this.f27619a, a.mo459e(2));
            }
            if (a.mo461f(3)) {
                ImageView imageView2 = this.f27619a;
                PorterDuff.Mode a2 = C1540zi.m20968a(a.mo448a(3, -1), null);
                int i2 = Build.VERSION.SDK_INT;
                imageView2.setImageTintMode(a2);
                int i3 = Build.VERSION.SDK_INT;
            }
        } finally {
            a.mo450a();
        }
    }

    /* renamed from: a */
    public final boolean mo16516a() {
        Drawable background = this.f27619a.getBackground();
        int i = Build.VERSION.SDK_INT;
        return !(background instanceof RippleDrawable);
    }
}
