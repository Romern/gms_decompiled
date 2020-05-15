package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import java.lang.ref.WeakReference;

/* renamed from: bhem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhem extends Drawable implements bhke {

    /* renamed from: a */
    public final WeakReference f118388a;

    /* renamed from: b */
    public final bhlr f118389b = new bhlr();

    /* renamed from: c */
    public final bhkf f118390c;

    /* renamed from: d */
    public final BadgeDrawable$SavedState f118391d;

    /* renamed from: e */
    public int f118392e;

    /* renamed from: f */
    public WeakReference f118393f;

    /* renamed from: g */
    public WeakReference f118394g;

    /* renamed from: h */
    private final Rect f118395h = new Rect();

    /* renamed from: i */
    private final float f118396i;

    /* renamed from: j */
    private final float f118397j;

    /* renamed from: k */
    private final float f118398k;

    /* renamed from: l */
    private float f118399l;

    /* renamed from: m */
    private float f118400m;

    /* renamed from: n */
    private float f118401n;

    /* renamed from: o */
    private float f118402o;

    /* renamed from: p */
    private float f118403p;

    public bhem(Context context) {
        bhlc bhlc;
        Context context2;
        this.f118388a = new WeakReference(context);
        bhki.m101057b(context);
        Resources resources = context.getResources();
        this.f118396i = (float) resources.getDimensionPixelSize(C0126R.dimen.mtrl_badge_radius);
        this.f118398k = (float) resources.getDimensionPixelSize(C0126R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f118397j = (float) resources.getDimensionPixelSize(C0126R.dimen.mtrl_badge_with_text_radius);
        bhkf bhkf = new bhkf(this);
        this.f118390c = bhkf;
        bhkf.f118902a.setTextAlign(Paint.Align.CENTER);
        this.f118391d = new BadgeDrawable$SavedState(context);
        Context context3 = (Context) this.f118388a.get();
        if (context3 != null && this.f118390c.f118905d != (bhlc = new bhlc(context3, 2132018452)) && (context2 = (Context) this.f118388a.get()) != null) {
            this.f118390c.mo63897a(bhlc, context2);
            mo63612d();
        }
    }

    /* renamed from: e */
    private final String m100716e() {
        if (mo63610b() <= this.f118392e) {
            return Integer.toString(mo63610b());
        }
        Context context = (Context) this.f118388a.get();
        if (context == null) {
            return "";
        }
        return context.getString(C0126R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f118392e), "+");
    }

    /* renamed from: a */
    public final void mo63608a(View view, ViewGroup viewGroup) {
        this.f118393f = new WeakReference(view);
        this.f118394g = new WeakReference(viewGroup);
        mo63612d();
        invalidateSelf();
    }

    /* renamed from: b */
    public final int mo63610b() {
        if (mo63609a()) {
            return this.f118391d.f151046d;
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo63611c() {
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo63612d() {
        View view;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        Context context = (Context) this.f118388a.get();
        WeakReference weakReference = this.f118393f;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f118395h);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.f118394g;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup == null) {
                int i2 = bhen.f118404a;
            } else {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            int i3 = this.f118391d.f151050h;
            if (i3 == 8388691 || i3 == 8388693) {
                this.f118400m = (float) (rect2.bottom - this.f118391d.f151052j);
            } else {
                this.f118400m = (float) (rect2.top + this.f118391d.f151052j);
            }
            if (mo63610b() <= 9) {
                float f5 = mo63609a() ? this.f118397j : this.f118396i;
                this.f118401n = f5;
                this.f118403p = f5;
                this.f118402o = f5;
            } else {
                float f6 = this.f118397j;
                this.f118401n = f6;
                this.f118403p = f6;
                this.f118402o = (this.f118390c.mo63895a(m100716e()) / 2.0f) + this.f118398k;
            }
            Resources resources = context.getResources();
            if (!mo63609a()) {
                i = C0126R.dimen.mtrl_badge_horizontal_edge_offset;
            } else {
                i = C0126R.dimen.mtrl_badge_text_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            int i4 = this.f118391d.f151050h;
            if (i4 == 8388659 || i4 == 8388691) {
                if (C1280ps.m19923h(view) == 0) {
                    int i5 = rect2.left;
                    f3 = this.f118402o;
                    f4 = (((float) i5) - f3) + ((float) dimensionPixelSize) + ((float) this.f118391d.f151051i);
                } else {
                    int i6 = rect2.right;
                    f3 = this.f118402o;
                    f4 = ((((float) i6) + f3) - ((float) dimensionPixelSize)) - ((float) this.f118391d.f151051i);
                }
                this.f118399l = f2;
            } else {
                if (C1280ps.m19923h(view) == 0) {
                    int i7 = rect2.right;
                    f = this.f118402o;
                    f2 = ((((float) i7) + f) - ((float) dimensionPixelSize)) - ((float) this.f118391d.f151051i);
                } else {
                    int i8 = rect2.left;
                    f = this.f118402o;
                    f2 = (((float) i8) - f) + ((float) dimensionPixelSize) + ((float) this.f118391d.f151051i);
                }
                this.f118399l = f2;
            }
            bhen.m100724a(this.f118395h, f2, this.f118400m, f, this.f118403p);
            this.f118389b.mo63945b(this.f118401n);
            if (!rect.equals(this.f118395h)) {
                this.f118389b.setBounds(this.f118395h);
            }
        }
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f118389b.draw(canvas);
            if (mo63609a()) {
                Rect rect = new Rect();
                String e = m100716e();
                this.f118390c.f118902a.getTextBounds(e, 0, e.length(), rect);
                canvas.drawText(e, this.f118399l, this.f118400m + ((float) (rect.height() / 2)), this.f118390c.f118902a);
            }
        }
    }

    public final int getAlpha() {
        return this.f118391d.f151045c;
    }

    public final int getIntrinsicHeight() {
        return this.f118395h.height();
    }

    public final int getIntrinsicWidth() {
        return this.f118395h.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        this.f118391d.f151045c = i;
        this.f118390c.f118902a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public final boolean mo63609a() {
        return this.f118391d.f151046d != -1;
    }
}
