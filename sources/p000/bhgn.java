package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;

/* renamed from: bhgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgn {

    /* renamed from: a */
    private final Rect f118605a;

    /* renamed from: b */
    private final ColorStateList f118606b;

    /* renamed from: c */
    private final ColorStateList f118607c;

    /* renamed from: d */
    private final ColorStateList f118608d;

    /* renamed from: e */
    private final int f118609e;

    /* renamed from: f */
    private final bhlx f118610f;

    private bhgn(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, bhlx bhlx, Rect rect) {
        C1244oj.m19765a(rect.left);
        C1244oj.m19765a(rect.top);
        C1244oj.m19765a(rect.right);
        C1244oj.m19765a(rect.bottom);
        this.f118605a = rect;
        this.f118606b = colorStateList2;
        this.f118607c = colorStateList;
        this.f118608d = colorStateList3;
        this.f118609e = i;
        this.f118610f = bhlx;
    }

    /* renamed from: a */
    static bhgn m100862a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, bhhs.f118688b);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList a = bhky.m101077a(context, obtainStyledAttributes, 4);
            ColorStateList a2 = bhky.m101077a(context, obtainStyledAttributes, 9);
            ColorStateList a3 = bhky.m101077a(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            bhlx a4 = bhlx.m101156a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).mo63972a();
            obtainStyledAttributes.recycle();
            return new bhgn(a, a2, a3, dimensionPixelSize, a4, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* renamed from: b */
    public final int mo63740b() {
        return this.f118605a.bottom;
    }

    /* renamed from: a */
    public final int mo63738a() {
        return this.f118605a.top;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void}
     arg types: [android.graphics.drawable.RippleDrawable, int, int, int, int]
     candidates:
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, float, float, float, float):void}
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63739a(TextView textView) {
        bhlr bhlr = new bhlr();
        bhlr bhlr2 = new bhlr();
        bhlr.mo63916a(this.f118610f);
        bhlr2.mo63916a(this.f118610f);
        bhlr.mo63948c(this.f118607c);
        bhlr.mo63941a((float) this.f118609e, this.f118608d);
        textView.setTextColor(this.f118606b);
        int i = Build.VERSION.SDK_INT;
        C1280ps.m19890a(textView, new InsetDrawable((Drawable) new RippleDrawable(this.f118606b.withAlpha(30), bhlr, bhlr2), this.f118605a.left, this.f118605a.top, this.f118605a.right, this.f118605a.bottom));
    }
}
