package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardView extends FrameLayout {

    /* renamed from: e */
    public static final ahp f1473e = new ahp();

    /* renamed from: g */
    private static final int[] f1474g = {16842801};

    /* renamed from: a */
    public boolean f1475a;

    /* renamed from: b */
    public boolean f1476b;

    /* renamed from: c */
    public final Rect f1477c;

    /* renamed from: d */
    public final Rect f1478d;

    /* renamed from: f */
    public final aho f1479f;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public CardView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo1866b() {
        aho aho = this.f1479f;
        ColorStateList valueOf = ColorStateList.valueOf(0);
        ahq ahq = (ahq) aho.f550a;
        ahq.mo712a(valueOf);
        ahq.invalidateSelf();
    }

    /* renamed from: c */
    public final void mo1867c() {
        ahq ahq = (ahq) this.f1479f.f550a;
        if (ahq.f552a != 0.0f) {
            ahq.f552a = 0.0f;
            ahq.mo713a((Rect) null);
            ahq.invalidateSelf();
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.cardViewStyle);
    }

    /* renamed from: a */
    public final float mo1864a() {
        return ahp.m763a(this.f1479f);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        this.f1477c = new Rect();
        this.f1478d = new Rect();
        this.f1479f = new aho(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.f549a, i, C0126R.style.CardView);
        C1280ps.m19886a(this, context, ahn.f549a, attributeSet, obtainStyledAttributes, i, C0126R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1474g);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateList = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C0126R.color.cardview_light_background) : getResources().getColor(C0126R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1475a = obtainStyledAttributes.getBoolean(7, false);
        this.f1476b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f1477c.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.f1477c.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.f1477c.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.f1477c.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        aho aho = this.f1479f;
        ahq ahq = new ahq(colorStateList, dimension);
        aho.f550a = ahq;
        aho.f551b.setBackgroundDrawable(ahq);
        CardView cardView = aho.f551b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        Drawable drawable = aho.f550a;
        boolean a = aho.mo710a();
        boolean b = aho.mo711b();
        ahq ahq2 = (ahq) drawable;
        if (!(dimension3 == ahq2.f553b && ahq2.f554c == a && ahq2.f555d == b)) {
            ahq2.f553b = dimension3;
            ahq2.f554c = a;
            ahq2.f555d = b;
            ahq2.mo713a((Rect) null);
            ahq2.invalidateSelf();
        }
        ahp.m765c(aho);
    }

    /* renamed from: a */
    public void mo1865a(float f) {
        this.f1479f.f551b.setElevation(f);
    }
}
