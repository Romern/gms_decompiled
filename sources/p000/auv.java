package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: auv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auv extends Drawable.ConstantState {

    /* renamed from: a */
    int f2327a;

    /* renamed from: b */
    auu f2328b;

    /* renamed from: c */
    ColorStateList f2329c;

    /* renamed from: d */
    PorterDuff.Mode f2330d;

    /* renamed from: e */
    boolean f2331e;

    /* renamed from: f */
    Bitmap f2332f;

    /* renamed from: g */
    ColorStateList f2333g;

    /* renamed from: h */
    PorterDuff.Mode f2334h;

    /* renamed from: i */
    int f2335i;

    /* renamed from: j */
    boolean f2336j;

    /* renamed from: k */
    boolean f2337k;

    /* renamed from: l */
    Paint f2338l;

    public auv() {
        this.f2329c = null;
        this.f2330d = aux.f2340a;
        this.f2328b = new auu();
    }

    /* renamed from: a */
    public final void mo2627a(int i, int i2) {
        this.f2332f.eraseColor(0);
        Canvas canvas = new Canvas(this.f2332f);
        auu auu = this.f2328b;
        auu.mo2622a(auu.f2313d, auu.f2310a, canvas, i, i2);
    }

    public int getChangingConfigurations() {
        return this.f2327a;
    }

    public final Drawable newDrawable() {
        return new aux(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new aux(this);
    }

    /* renamed from: a */
    public final boolean mo2628a() {
        auu auu = this.f2328b;
        if (auu.f2320k == null) {
            auu.f2320k = Boolean.valueOf(auu.f2313d.mo2585b());
        }
        return auu.f2320k.booleanValue();
    }

    public auv(auv auv) {
        this.f2329c = null;
        this.f2330d = aux.f2340a;
        if (auv != null) {
            this.f2327a = auv.f2327a;
            this.f2328b = new auu(auv.f2328b);
            Paint paint = auv.f2328b.f2312c;
            if (paint != null) {
                this.f2328b.f2312c = new Paint(paint);
            }
            Paint paint2 = auv.f2328b.f2311b;
            if (paint2 != null) {
                this.f2328b.f2311b = new Paint(paint2);
            }
            this.f2329c = auv.f2329c;
            this.f2330d = auv.f2330d;
            this.f2331e = auv.f2331e;
        }
    }
}
