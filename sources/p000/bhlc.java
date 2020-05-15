package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: bhlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlc {

    /* renamed from: a */
    public final float f118933a;

    /* renamed from: b */
    public final ColorStateList f118934b;

    /* renamed from: c */
    public final int f118935c;

    /* renamed from: d */
    public final int f118936d;

    /* renamed from: e */
    public final String f118937e;

    /* renamed from: f */
    public final ColorStateList f118938f;

    /* renamed from: g */
    public final float f118939g;

    /* renamed from: h */
    public final float f118940h;

    /* renamed from: i */
    public final float f118941i;

    /* renamed from: j */
    public Typeface f118942j;

    /* renamed from: k */
    private final int f118943k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f118944l = false;

    public bhlc(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, bhkz.f118927a);
        this.f118933a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f118934b = bhky.m101077a(context, obtainStyledAttributes, 3);
        bhky.m101077a(context, obtainStyledAttributes, 4);
        bhky.m101077a(context, obtainStyledAttributes, 5);
        this.f118935c = obtainStyledAttributes.getInt(2, 0);
        this.f118936d = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f118943k = obtainStyledAttributes.getResourceId(i2, 0);
        this.f118937e = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f118938f = bhky.m101077a(context, obtainStyledAttributes, 6);
        this.f118939g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f118940h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f118941i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private final void m101084b() {
        String str;
        if (this.f118942j == null && (str = this.f118937e) != null) {
            this.f118942j = Typeface.create(str, this.f118935c);
        }
        if (this.f118942j == null) {
            int i = this.f118936d;
            if (i == 1) {
                this.f118942j = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f118942j = Typeface.SERIF;
            } else if (i != 3) {
                this.f118942j = Typeface.DEFAULT;
            } else {
                this.f118942j = Typeface.MONOSPACE;
            }
            this.f118942j = Typeface.create(this.f118942j, this.f118935c);
        }
    }

    /* renamed from: a */
    public final Typeface mo63909a() {
        m101084b();
        return this.f118942j;
    }

    /* renamed from: a */
    public final void mo63910a(Context context, TextPaint textPaint, bhld bhld) {
        int i;
        int i2;
        mo63913b(context, textPaint, bhld);
        ColorStateList colorStateList = this.f118934b;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, this.f118934b.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f118941i;
        float f2 = this.f118939g;
        float f3 = this.f118940h;
        ColorStateList colorStateList2 = this.f118938f;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, this.f118938f.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: a */
    public final void mo63911a(Context context, bhld bhld) {
        m101084b();
        int i = this.f118943k;
        if (i == 0) {
            this.f118944l = true;
        }
        if (!this.f118944l) {
            try {
                C1163lk.m19269a(context, i, new bhla(this, bhld));
            } catch (Resources.NotFoundException e) {
                this.f118944l = true;
                bhld.mo63692a(1);
            } catch (Exception e2) {
                String valueOf = String.valueOf(this.f118937e);
                if (valueOf.length() == 0) {
                    new String("Error loading font ");
                } else {
                    "Error loading font ".concat(valueOf);
                }
                this.f118944l = true;
                bhld.mo63692a(-3);
            }
        } else {
            bhld.mo63693a(this.f118942j, true);
        }
    }

    /* renamed from: b */
    public final void mo63913b(Context context, TextPaint textPaint, bhld bhld) {
        mo63912a(textPaint, mo63909a());
        mo63911a(context, new bhlb(this, textPaint, bhld));
    }

    /* renamed from: a */
    public final void mo63912a(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f118935c;
        if ((style & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        textPaint.setFakeBoldText(z);
        if ((style & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f118933a);
    }
}
