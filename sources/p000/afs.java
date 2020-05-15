package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Objects;

@Deprecated
/* renamed from: afs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afs extends View {

    /* renamed from: a */
    public Layout f455a;

    /* renamed from: b */
    public ColorStateList f456b;

    /* renamed from: c */
    public CharSequence f457c;

    /* renamed from: d */
    public float f458d = 1.0f;

    /* renamed from: e */
    public float f459e = 0.0f;

    /* renamed from: f */
    public float f460f;

    /* renamed from: g */
    public float f461g;

    /* renamed from: h */
    private final TextPaint f462h;

    /* renamed from: i */
    private final float f463i;

    /* renamed from: j */
    private final float f464j;

    /* renamed from: k */
    private int f465k = 8388659;

    /* renamed from: l */
    private int f466l;

    /* renamed from: m */
    private float f467m;

    /* renamed from: n */
    private int f468n = Integer.MAX_VALUE;

    /* renamed from: o */
    private int f469o;

    /* renamed from: a */
    private final Layout m717a(int i, int i2, Layout.Alignment alignment) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        float f = this.f461g;
        this.f467m = f;
        this.f462h.setTextSize(f);
        StaticLayout staticLayout = new StaticLayout(this.f457c, this.f462h, paddingLeft, alignment, this.f458d, this.f459e, true);
        if (staticLayout.getLineCount() > this.f468n) {
            z = true;
        } else {
            z = false;
        }
        if (staticLayout.getLineTop(staticLayout.getLineCount()) > paddingTop) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f462h.getTextSize() > this.f460f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2) {
            while (true) {
                if ((!z && !z2) || !z3) {
                    break;
                }
                float f2 = this.f467m - 4.0f;
                this.f467m = f2;
                this.f462h.setTextSize(f2);
                staticLayout = new StaticLayout(this.f457c, this.f462h, paddingLeft, alignment, this.f458d, this.f459e, true);
                z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > paddingTop;
                z = staticLayout.getLineCount() > this.f468n;
                z3 = this.f462h.getTextSize() > this.f460f;
            }
        }
        this.f469o = Math.min(this.f468n, staticLayout.getLineCount());
        return staticLayout;
    }

    /* renamed from: b */
    public final void mo612b(int i) {
        if (this.f465k != i) {
            this.f465k = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f456b;
        if (colorStateList != null && colorStateList.isStateful()) {
            mo608a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f455a != null) {
            canvas.save();
            this.f462h.setColor(this.f466l);
            this.f462h.drawableState = getDrawableState();
            float paddingLeft = (float) getPaddingLeft();
            int paddingTop = getPaddingTop();
            int height = getHeight() - (getPaddingTop() + getPaddingBottom());
            int lineTop = this.f455a.getLineTop(this.f469o);
            int i2 = this.f465k & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            if (i2 != 16) {
                i = i2 != 48 ? i2 != 80 ? 0 : height - lineTop : 0;
            } else {
                i = (height - lineTop) / 2;
            }
            canvas.translate(paddingLeft, (float) (paddingTop + i));
            canvas.clipRect(0, 0, getWidth() - getPaddingRight(), this.f455a.getLineTop(this.f469o));
            this.f455a.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        Layout.Alignment alignment;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = mode == 1073741824 ? size : -1;
        int i4 = mode2 == 1073741824 ? size2 : -1;
        if (i3 == -1) {
            this.f462h.setTextSize(this.f461g);
            i3 = (int) Math.ceil((double) Layout.getDesiredWidth(this.f457c, this.f462h));
            this.f462h.setTextSize(this.f467m);
        }
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        }
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            int i5 = this.f465k & 8388615;
            if (i5 == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i5 == 3) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i5 == 5) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i5 == 8388611) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i5 != 8388613) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else if (textAlignment == 2) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (textAlignment == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (textAlignment != 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        if (i4 == -1) {
            i4 = mode2 != Integer.MIN_VALUE ? Integer.MAX_VALUE : size2;
        }
        Layout layout = this.f455a;
        if (layout != null) {
            int width = layout.getWidth();
            int height = this.f455a.getHeight();
            if (!(width == i3 && height == i4)) {
                this.f455a = m717a(i3, i4, alignment);
            }
        } else {
            this.f455a = m717a(i3, i4, alignment);
        }
        Layout layout2 = this.f455a;
        if (layout2 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (mode2 != 1073741824) {
            i4 = layout2.getLineTop(layout2.getLineCount());
        }
        if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(i4, size2);
        }
        setMeasuredDimension(i3, i4);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.f455a = null;
        requestLayout();
        invalidate();
    }

    public afs(Context context) {
        super(context, null, 0, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.scaledDensity;
        this.f460f = 10.0f * f2;
        this.f461g = f2 * 60.0f;
        this.f462h = new TextPaint(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, aem.f340a, 0, 0);
        this.f457c = obtainStyledAttributes.getText(4);
        this.f460f = obtainStyledAttributes.getDimension(10, this.f460f);
        this.f461g = obtainStyledAttributes.getDimension(9, this.f461g);
        this.f456b = obtainStyledAttributes.getColorStateList(2);
        this.f468n = obtainStyledAttributes.getInt(5, 2);
        if (this.f456b != null) {
            mo608a();
        }
        this.f462h.setTextSize(this.f461g);
        mo611a(obtainStyledAttributes.getString(8), obtainStyledAttributes.getInt(0, -1), obtainStyledAttributes.getInt(1, -1));
        this.f465k = obtainStyledAttributes.getInt(3, this.f465k);
        this.f464j = (float) obtainStyledAttributes.getDimensionPixelSize(6, (int) this.f464j);
        this.f463i = obtainStyledAttributes.getFloat(7, this.f463i);
        obtainStyledAttributes.recycle();
        if (this.f457c == null) {
            this.f457c = "";
        }
    }

    /* renamed from: a */
    public final void mo608a() {
        int colorForState = this.f456b.getColorForState(getDrawableState(), 0);
        if (colorForState != this.f466l) {
            this.f466l = colorForState;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo609a(int i) {
        if (this.f468n != i) {
            this.f468n = i;
            this.f455a = null;
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo610a(Typeface typeface) {
        if (!Objects.equals(this.f462h.getTypeface(), typeface)) {
            this.f462h.setTypeface(typeface);
            if (this.f455a != null) {
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public final void mo611a(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        int i3;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                mo610a(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface != null) {
                typeface2 = Typeface.create(typeface, i2);
            } else {
                typeface2 = Typeface.defaultFromStyle(i2);
            }
            mo610a(typeface2);
            if (typeface2 != null) {
                i3 = typeface2.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (i3 ^ -1) & i2;
            TextPaint textPaint = this.f462h;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f462h;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f462h.setFakeBoldText(false);
        this.f462h.setTextSkewX(0.0f);
        mo610a(typeface);
    }
}
