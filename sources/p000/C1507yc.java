package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: yc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1507yc extends C1502xy {

    /* renamed from: b */
    public final SeekBar f27631b;

    /* renamed from: c */
    public Drawable f27632c;

    /* renamed from: d */
    private ColorStateList f27633d = null;

    /* renamed from: e */
    private PorterDuff.Mode f27634e = null;

    /* renamed from: f */
    private boolean f27635f = false;

    /* renamed from: g */
    private boolean f27636g = false;

    public C1507yc(SeekBar seekBar) {
        super(seekBar);
        this.f27631b = seekBar;
    }

    /* renamed from: a */
    private final void m20836a() {
        Drawable drawable = this.f27632c;
        if (drawable == null) {
            return;
        }
        if (this.f27635f || this.f27636g) {
            Drawable mutate = drawable.mutate();
            int i = Build.VERSION.SDK_INT;
            this.f27632c = mutate;
            if (this.f27635f) {
                C1173lt.m19601a(mutate, this.f27633d);
            }
            if (this.f27636g) {
                C1173lt.m19604a(this.f27632c, this.f27634e);
            }
            if (this.f27632c.isStateful()) {
                this.f27632c.setState(this.f27631b.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public final void mo16524a(AttributeSet attributeSet, int i) {
        super.mo16524a(attributeSet, i);
        adr a = adr.m523a(this.f27631b.getContext(), attributeSet, C1390tu.f27198g, i, 0);
        SeekBar seekBar = this.f27631b;
        C1280ps.m19886a(seekBar, seekBar.getContext(), C1390tu.f27198g, attributeSet, a.f290b, i, 0);
        Drawable b = a.mo453b(0);
        if (b != null) {
            this.f27631b.setThumb(b);
        }
        Drawable a2 = a.mo449a(1);
        Drawable drawable = this.f27632c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f27632c = a2;
        if (a2 != null) {
            a2.setCallback(this.f27631b);
            C1173lt.m19608b(a2, C1280ps.m19923h(this.f27631b));
            if (a2.isStateful()) {
                a2.setState(this.f27631b.getDrawableState());
            }
            m20836a();
        }
        this.f27631b.invalidate();
        if (a.mo461f(3)) {
            this.f27634e = C1540zi.m20968a(a.mo448a(3, -1), this.f27634e);
            this.f27636g = true;
        }
        if (a.mo461f(2)) {
            this.f27633d = a.mo459e(2);
            this.f27635f = true;
        }
        a.mo450a();
        m20836a();
    }
}
