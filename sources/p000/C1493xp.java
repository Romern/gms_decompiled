package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: xp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1493xp {

    /* renamed from: a */
    public adp f27600a;

    /* renamed from: b */
    private final View f27601b;

    /* renamed from: c */
    private final C1497xt f27602c;

    /* renamed from: d */
    private int f27603d = -1;

    /* renamed from: e */
    private adp f27604e;

    /* renamed from: f */
    private adp f27605f;

    public C1493xp(View view) {
        this.f27601b = view;
        this.f27602c = C1497xt.m20824b();
    }

    /* renamed from: a */
    public final void mo16498a() {
        Drawable background = this.f27601b.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f27604e != null) {
                if (this.f27605f == null) {
                    this.f27605f = new adp();
                }
                adp adp = this.f27605f;
                adp.f285a = null;
                adp.f288d = false;
                adp.f286b = null;
                adp.f287c = false;
                ColorStateList x = C1280ps.m19942x(this.f27601b);
                if (x != null) {
                    adp.f288d = true;
                    adp.f285a = x;
                }
                PorterDuff.Mode y = C1280ps.m19943y(this.f27601b);
                if (y != null) {
                    adp.f287c = true;
                    adp.f286b = y;
                }
                if (adp.f288d || adp.f287c) {
                    C1497xt.m20823a(background, adp, this.f27601b.getDrawableState());
                    return;
                }
            }
            adp adp2 = this.f27600a;
            if (adp2 != null) {
                C1497xt.m20823a(background, adp2, this.f27601b.getDrawableState());
                return;
            }
            adp adp3 = this.f27604e;
            if (adp3 != null) {
                C1497xt.m20823a(background, adp3, this.f27601b.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo16502b() {
        this.f27603d = -1;
        mo16500a((ColorStateList) null);
        mo16498a();
    }

    /* renamed from: a */
    public final void mo16499a(int i) {
        ColorStateList colorStateList;
        this.f27603d = i;
        C1497xt xtVar = this.f27602c;
        if (xtVar != null) {
            colorStateList = xtVar.mo16512b(this.f27601b.getContext(), i);
        } else {
            colorStateList = null;
        }
        mo16500a(colorStateList);
        mo16498a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16500a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f27604e == null) {
                this.f27604e = new adp();
            }
            adp adp = this.f27604e;
            adp.f285a = colorStateList;
            adp.f288d = true;
        } else {
            this.f27604e = null;
        }
        mo16498a();
    }

    /* renamed from: a */
    public final void mo16501a(AttributeSet attributeSet, int i) {
        adr a = adr.m523a(this.f27601b.getContext(), attributeSet, C1390tu.f27190B, i, 0);
        View view = this.f27601b;
        C1280ps.m19886a(view, view.getContext(), C1390tu.f27190B, attributeSet, a.f290b, i, 0);
        try {
            if (a.mo461f(0)) {
                this.f27603d = a.mo460f(0, -1);
                ColorStateList b = this.f27602c.mo16512b(this.f27601b.getContext(), this.f27603d);
                if (b != null) {
                    mo16500a(b);
                }
            }
            if (a.mo461f(1)) {
                C1280ps.m19887a(this.f27601b, a.mo459e(1));
            }
            if (a.mo461f(2)) {
                C1280ps.m19888a(this.f27601b, C1540zi.m20968a(a.mo448a(2, -1), null));
            }
        } finally {
            a.mo450a();
        }
    }
}
