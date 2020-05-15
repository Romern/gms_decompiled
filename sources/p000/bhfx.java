package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: bhfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfx {

    /* renamed from: a */
    public static final double f118504a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: s */
    private static final int[] f118505s = {16842912};

    /* renamed from: b */
    public final MaterialCardView f118506b;

    /* renamed from: c */
    public final Rect f118507c = new Rect();

    /* renamed from: d */
    public final bhlr f118508d;

    /* renamed from: e */
    public final bhlr f118509e;

    /* renamed from: f */
    public final int f118510f;

    /* renamed from: g */
    public final int f118511g;

    /* renamed from: h */
    public int f118512h;

    /* renamed from: i */
    public Drawable f118513i;

    /* renamed from: j */
    public Drawable f118514j;

    /* renamed from: k */
    public ColorStateList f118515k;

    /* renamed from: l */
    public ColorStateList f118516l;

    /* renamed from: m */
    public ColorStateList f118517m;

    /* renamed from: n */
    public Drawable f118518n;

    /* renamed from: o */
    public LayerDrawable f118519o;

    /* renamed from: p */
    public bhlr f118520p;

    /* renamed from: q */
    public boolean f118521q = false;

    /* renamed from: r */
    public boolean f118522r;

    /* renamed from: t */
    private bhlx f118523t;

    /* renamed from: u */
    private bhlr f118524u;

    public bhfx(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.f118506b = materialCardView;
        bhlr bhlr = new bhlr(materialCardView.getContext(), attributeSet, i, 2132019481);
        this.f118508d = bhlr;
        bhlr.mo63942a(materialCardView.getContext());
        this.f118508d.mo63968s();
        bhlw b = this.f118508d.mo63954h().mo63980b();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, bhfy.f118525a, i, C0126R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            b.mo63977e(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f118509e = new bhlr();
        mo63683a(b.mo63972a());
        Resources resources = materialCardView.getResources();
        this.f118510f = resources.getDimensionPixelSize(C0126R.dimen.mtrl_card_checked_icon_margin);
        this.f118511g = resources.getDimensionPixelSize(C0126R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static final float m100805a(bhll bhll, float f) {
        if (bhll instanceof bhlv) {
            double d = (double) f;
            Double.isNaN(d);
            return (float) ((1.0d - f118504a) * d);
        } else if (bhll instanceof bhlm) {
            return f / 2.0f;
        } else {
            return 0.0f;
        }
    }

    /* renamed from: i */
    private final bhlr m100806i() {
        return new bhlr(this.f118523t);
    }

    /* renamed from: b */
    public final float mo63684b() {
        return (this.f118506b.mo1864a() * 1.5f) + (mo63687e() ? mo63688f() : 0.0f);
    }

    /* renamed from: c */
    public final float mo63685c() {
        return this.f118506b.mo1864a() + (mo63687e() ? mo63688f() : 0.0f);
    }

    /* renamed from: d */
    public final boolean mo63686d() {
        int i = Build.VERSION.SDK_INT;
        return this.f118508d.mo63967r();
    }

    /* renamed from: e */
    public final boolean mo63687e() {
        return this.f118506b.f1476b && mo63686d() && this.f118506b.f1475a;
    }

    /* renamed from: f */
    public final float mo63688f() {
        return Math.max(Math.max(m100805a(this.f118523t.f119030b, this.f118508d.mo63962n()), m100805a(this.f118523t.f119031c, this.f118508d.mo63963o())), Math.max(m100805a(this.f118523t.f119032d, this.f118508d.mo63966q()), m100805a(this.f118523t.f119033e, this.f118508d.mo63965p())));
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: g */
    public final Drawable mo63689g() {
        RippleDrawable rippleDrawable;
        if (this.f118518n == null) {
            if (bhlg.f118948a) {
                this.f118524u = m100806i();
                rippleDrawable = new RippleDrawable(this.f118515k, null, this.f118524u);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                bhlr i = m100806i();
                this.f118520p = i;
                i.mo63948c(this.f118515k);
                stateListDrawable.addState(new int[]{16842919}, this.f118520p);
                rippleDrawable = stateListDrawable;
            }
            this.f118518n = rippleDrawable;
        }
        if (this.f118519o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f118518n, this.f118509e, mo63690h()});
            this.f118519o = layerDrawable;
            layerDrawable.setId(2, C0126R.C0129id.mtrl_card_checked_layer_id);
        }
        return this.f118519o;
    }

    /* renamed from: h */
    public final Drawable mo63690h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f118514j;
        if (drawable != null) {
            stateListDrawable.addState(f118505s, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: a */
    public final Drawable mo63680a(Drawable drawable) {
        int i;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (this.f118506b.f1475a) {
            int ceil = (int) Math.ceil((double) mo63684b());
            i2 = (int) Math.ceil((double) mo63685c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new bhfw(drawable, i2, i, i2, i);
    }

    /* renamed from: a */
    public final void mo63681a() {
        this.f118508d.mo63949d(this.f118506b.f1479f.f551b.getElevation());
    }

    /* renamed from: a */
    public final void mo63682a(ColorStateList colorStateList) {
        this.f118508d.mo63948c(colorStateList);
    }

    /* renamed from: a */
    public final void mo63683a(bhlx bhlx) {
        this.f118523t = bhlx;
        this.f118508d.mo63916a(bhlx);
        bhlr bhlr = this.f118508d;
        bhlr.f119012x = !bhlr.mo63967r();
        bhlr bhlr2 = this.f118509e;
        if (bhlr2 != null) {
            bhlr2.mo63916a(bhlx);
        }
        bhlr bhlr3 = this.f118524u;
        if (bhlr3 != null) {
            bhlr3.mo63916a(bhlx);
        }
        bhlr bhlr4 = this.f118520p;
        if (bhlr4 != null) {
            bhlr4.mo63916a(bhlx);
        }
    }
}
