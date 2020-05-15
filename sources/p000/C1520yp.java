package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: yp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1520yp {

    /* renamed from: a */
    public int f27659a = 0;

    /* renamed from: b */
    public Typeface f27660b;

    /* renamed from: c */
    public boolean f27661c;

    /* renamed from: d */
    private final TextView f27662d;

    /* renamed from: e */
    private adp f27663e;

    /* renamed from: f */
    private adp f27664f;

    /* renamed from: g */
    private adp f27665g;

    /* renamed from: h */
    private adp f27666h;

    /* renamed from: i */
    private adp f27667i;

    /* renamed from: j */
    private adp f27668j;

    /* renamed from: k */
    private final C1521yq f27669k;

    /* renamed from: l */
    private int f27670l = -1;

    public C1520yp(TextView textView) {
        this.f27662d = textView;
        this.f27669k = new C1521yq(this.f27662d);
    }

    /* renamed from: a */
    private static adp m20875a(Context context, C1497xt xtVar, int i) {
        ColorStateList b = xtVar.mo16512b(context, i);
        if (b == null) {
            return null;
        }
        adp adp = new adp();
        adp.f288d = true;
        adp.f285a = b;
        return adp;
    }

    /* renamed from: a */
    private final void m20876a(Context context, adr adr) {
        String d;
        boolean z;
        boolean z2;
        adr adr2 = adr;
        int[] iArr = C1390tu.f27192a;
        this.f27659a = adr2.mo448a(2, this.f27659a);
        int i = Build.VERSION.SDK_INT;
        int a = adr2.mo448a(11, -1);
        this.f27670l = a;
        if (a != -1) {
            this.f27659a &= 2;
        }
        int i2 = 12;
        boolean z3 = false;
        if (adr2.mo461f(10) || adr2.mo461f(12)) {
            Typeface typeface = null;
            this.f27660b = null;
            if (!adr2.mo461f(12)) {
                i2 = 10;
            }
            int i3 = this.f27670l;
            int i4 = this.f27659a;
            if (!context.isRestricted()) {
                C1519yo yoVar = new C1519yo(this, i3, i4, new WeakReference(this.f27662d));
                try {
                    int i5 = this.f27659a;
                    int resourceId = adr2.f290b.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (adr2.f291c == null) {
                            adr2.f291c = new TypedValue();
                        }
                        Context context2 = adr2.f289a;
                        TypedValue typedValue = adr2.f291c;
                        if (!context2.isRestricted()) {
                            typeface = C1163lk.m19266a(context2, resourceId, typedValue, i5, yoVar, true);
                        }
                    }
                    if (typeface != null) {
                        int i6 = Build.VERSION.SDK_INT;
                        if (this.f27670l != -1) {
                            Typeface create = Typeface.create(typeface, 0);
                            int i7 = this.f27670l;
                            if ((this.f27659a & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f27660b = Typeface.create(create, i7, z2);
                        } else {
                            this.f27660b = typeface;
                        }
                    }
                    if (this.f27660b == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f27661c = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            }
            if (this.f27660b == null && (d = adr2.mo457d(i2)) != null) {
                int i8 = Build.VERSION.SDK_INT;
                if (this.f27670l != -1) {
                    Typeface create2 = Typeface.create(d, 0);
                    int i9 = this.f27670l;
                    if ((2 & this.f27659a) != 0) {
                        z3 = true;
                    }
                    this.f27660b = Typeface.create(create2, i9, z3);
                    return;
                }
                this.f27660b = Typeface.create(d, this.f27659a);
            }
        } else if (adr2.mo461f(1)) {
            this.f27661c = false;
            int a2 = adr2.mo448a(1, 1);
            if (a2 == 1) {
                this.f27660b = Typeface.SANS_SERIF;
            } else if (a2 == 2) {
                this.f27660b = Typeface.SERIF;
            } else if (a2 == 3) {
                this.f27660b = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private final void m20877a(Drawable drawable, adp adp) {
        if (drawable != null && adp != null) {
            C1497xt.m20823a(drawable, adp, this.f27662d.getDrawableState());
        }
    }

    /* renamed from: a */
    public final void mo16568a() {
        if (!(this.f27663e == null && this.f27664f == null && this.f27665g == null && this.f27666h == null)) {
            Drawable[] compoundDrawables = this.f27662d.getCompoundDrawables();
            m20877a(compoundDrawables[0], this.f27663e);
            m20877a(compoundDrawables[1], this.f27664f);
            m20877a(compoundDrawables[2], this.f27665g);
            m20877a(compoundDrawables[3], this.f27666h);
        }
        int i = Build.VERSION.SDK_INT;
        if (this.f27667i != null || this.f27668j != null) {
            Drawable[] compoundDrawablesRelative = this.f27662d.getCompoundDrawablesRelative();
            m20877a(compoundDrawablesRelative[0], this.f27667i);
            m20877a(compoundDrawablesRelative[2], this.f27668j);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    /* renamed from: a */
    public final void mo16569a(Context context, int i) {
        String d;
        adr a = adr.m521a(context, i, C1390tu.f27216y);
        if (a.mo461f(14)) {
            mo16571a(a.mo451a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (a.mo461f(0) && a.mo456d(0, -1) == 0) {
            this.f27662d.setTextSize(0, 0.0f);
        }
        m20876a(context, a);
        int i3 = Build.VERSION.SDK_INT;
        if (a.mo461f(13) && (d = a.mo457d(13)) != null) {
            this.f27662d.setFontVariationSettings(d);
        }
        a.mo450a();
        Typeface typeface = this.f27660b;
        if (typeface != null) {
            this.f27662d.setTypeface(typeface, this.f27659a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    /* renamed from: a */
    public final void mo16570a(AttributeSet attributeSet, int i) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i2;
        int i3;
        int resourceId;
        boolean z3;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i;
        Context context = this.f27662d.getContext();
        C1497xt b = C1497xt.m20824b();
        char c = 0;
        adr a = adr.m523a(context, attributeSet2, C1390tu.f27199h, i4, 0);
        TextView textView = this.f27662d;
        C1280ps.m19886a(textView, textView.getContext(), C1390tu.f27199h, attributeSet, a.f290b, i, 0);
        int f4 = a.mo460f(0, -1);
        if (a.mo461f(3)) {
            this.f27663e = m20875a(context, b, a.mo460f(3, 0));
        }
        if (a.mo461f(1)) {
            this.f27664f = m20875a(context, b, a.mo460f(1, 0));
        }
        if (a.mo461f(4)) {
            this.f27665g = m20875a(context, b, a.mo460f(4, 0));
        }
        if (a.mo461f(2)) {
            this.f27666h = m20875a(context, b, a.mo460f(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (a.mo461f(5)) {
            this.f27667i = m20875a(context, b, a.mo460f(5, 0));
        }
        if (a.mo461f(6)) {
            this.f27668j = m20875a(context, b, a.mo460f(6, 0));
        }
        a.mo450a();
        boolean z4 = this.f27662d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (f4 == -1) {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        } else {
            adr a2 = adr.m521a(context, f4, C1390tu.f27216y);
            if (z4) {
                z2 = false;
                z = false;
            } else if (a2.mo461f(14)) {
                z2 = a2.mo451a(14, false);
                z = true;
            } else {
                z2 = false;
                z = false;
            }
            m20876a(context, a2);
            int i6 = Build.VERSION.SDK_INT;
            if (a2.mo461f(15)) {
                str2 = a2.mo457d(15);
            } else {
                str2 = null;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (a2.mo461f(13)) {
                str = a2.mo457d(13);
            } else {
                str = null;
            }
            a2.mo450a();
        }
        adr a3 = adr.m523a(context, attributeSet2, C1390tu.f27216y, i4, 0);
        if (!z4 && a3.mo461f(14)) {
            z2 = a3.mo451a(14, false);
            z = true;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (a3.mo461f(15)) {
            str2 = a3.mo457d(15);
        }
        int i9 = Build.VERSION.SDK_INT;
        String d = a3.mo461f(13) ? a3.mo457d(13) : str;
        int i10 = Build.VERSION.SDK_INT;
        if (a3.mo461f(0) && a3.mo456d(0, -1) == 0) {
            this.f27662d.setTextSize(0, 0.0f);
        }
        m20876a(context, a3);
        a3.mo450a();
        if (!z4 && z) {
            mo16571a(z2);
        }
        Typeface typeface = this.f27660b;
        if (typeface != null) {
            if (this.f27670l == -1) {
                this.f27662d.setTypeface(typeface, this.f27659a);
            } else {
                this.f27662d.setTypeface(typeface);
            }
        }
        if (d != null) {
            this.f27662d.setFontVariationSettings(d);
        }
        if (str2 != null) {
            int i11 = Build.VERSION.SDK_INT;
            this.f27662d.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        C1521yq yqVar = this.f27669k;
        TypedArray obtainStyledAttributes = yqVar.f27678h.obtainStyledAttributes(attributeSet2, C1390tu.f27200i, i4, 0);
        TextView textView2 = yqVar.f27677g;
        C1280ps.m19886a(textView2, textView2.getContext(), C1390tu.f27200i, attributeSet, obtainStyledAttributes, i, 0);
        TypedArray typedArray = obtainStyledAttributes;
        if (typedArray.hasValue(5)) {
            yqVar.f27671a = typedArray.getInt(5, 0);
        }
        if (typedArray.hasValue(4)) {
            f = typedArray.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (typedArray.hasValue(2)) {
            f2 = typedArray.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (typedArray.hasValue(1)) {
            f3 = typedArray.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (typedArray.hasValue(3) && (resourceId = typedArray.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                int i12 = 0;
                while (i12 < length) {
                    iArr[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
                    i12++;
                    c = 0;
                }
                yqVar.f27675e = C1521yq.m20882a(iArr);
                int[] iArr2 = yqVar.f27675e;
                int length2 = iArr2.length;
                if (length2 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                yqVar.f27676f = z3;
                if (z3) {
                    yqVar.f27671a = 1;
                    yqVar.f27673c = (float) iArr2[c];
                    yqVar.f27674d = (float) iArr2[length2 - 1];
                    yqVar.f27672b = -1.0f;
                }
            }
            obtainTypedArray.recycle();
        }
        typedArray.recycle();
        if (!yqVar.mo16572a()) {
            yqVar.f27671a = 0;
        } else if (yqVar.f27671a == 1) {
            if (!yqVar.f27676f) {
                DisplayMetrics displayMetrics = yqVar.f27678h.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    i3 = 2;
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                if (f2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
                } else if (f3 <= f2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
                } else if (f > 0.0f) {
                    yqVar.f27671a = 1;
                    yqVar.f27673c = f2;
                    yqVar.f27674d = f3;
                    yqVar.f27672b = f;
                    yqVar.f27676f = false;
                } else {
                    throw new IllegalArgumentException("The auto-size step granularity (" + f + "px) is less or equal to (0px)");
                }
            }
            if (yqVar.mo16572a() && yqVar.f27671a == 1 && (!yqVar.f27676f || yqVar.f27675e.length == 0)) {
                int floor = ((int) Math.floor((double) ((yqVar.f27674d - yqVar.f27673c) / yqVar.f27672b))) + 1;
                int[] iArr3 = new int[floor];
                for (int i13 = 0; i13 < floor; i13++) {
                    iArr3[i13] = Math.round(yqVar.f27673c + (((float) i13) * yqVar.f27672b));
                }
                yqVar.f27675e = C1521yq.m20882a(iArr3);
            }
        }
        int i14 = C1320re.f26914a;
        C1521yq yqVar2 = this.f27669k;
        if (yqVar2.f27671a != 0) {
            int[] iArr4 = yqVar2.f27675e;
            if (iArr4.length > 0) {
                if (((float) this.f27662d.getAutoSizeStepGranularity()) == -1.0f) {
                    this.f27662d.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                } else {
                    this.f27662d.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f27669k.f27673c), Math.round(this.f27669k.f27674d), Math.round(this.f27669k.f27672b), 0);
                }
            }
        }
        adr a4 = adr.m522a(context, attributeSet2, C1390tu.f27200i);
        int f5 = a4.mo460f(8, -1);
        if (f5 != -1) {
            drawable = b.mo16510a(context, f5);
        } else {
            drawable = null;
        }
        int f6 = a4.mo460f(13, -1);
        if (f6 != -1) {
            drawable2 = b.mo16510a(context, f6);
        } else {
            drawable2 = null;
        }
        int f7 = a4.mo460f(9, -1);
        if (f7 != -1) {
            drawable3 = b.mo16510a(context, f7);
        } else {
            drawable3 = null;
        }
        int f8 = a4.mo460f(6, -1);
        if (f8 != -1) {
            drawable4 = b.mo16510a(context, f8);
        } else {
            drawable4 = null;
        }
        int f9 = a4.mo460f(10, -1);
        if (f9 != -1) {
            drawable5 = b.mo16510a(context, f9);
        } else {
            drawable5 = null;
        }
        int f10 = a4.mo460f(7, -1);
        if (f10 != -1) {
            drawable6 = b.mo16510a(context, f10);
        } else {
            drawable6 = null;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f27662d.getCompoundDrawablesRelative();
            TextView textView3 = this.f27662d;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            int i16 = Build.VERSION.SDK_INT;
            Drawable[] compoundDrawablesRelative2 = this.f27662d.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f27662d.getCompoundDrawables();
                TextView textView4 = this.f27662d;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                TextView textView5 = this.f27662d;
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            }
        }
        if (a4.mo461f(11)) {
            ColorStateList e = a4.mo459e(11);
            TextView textView6 = this.f27662d;
            C1244oj.m19766a(textView6);
            int i17 = Build.VERSION.SDK_INT;
            textView6.setCompoundDrawableTintList(e);
        }
        if (a4.mo461f(12)) {
            PorterDuff.Mode a5 = C1540zi.m20968a(a4.mo448a(12, -1), null);
            TextView textView7 = this.f27662d;
            C1244oj.m19766a(textView7);
            int i18 = Build.VERSION.SDK_INT;
            textView7.setCompoundDrawableTintMode(a5);
        }
        int d2 = a4.mo456d(14, -1);
        int d3 = a4.mo456d(17, -1);
        int d4 = a4.mo456d(18, -1);
        a4.mo450a();
        if (d2 != -1) {
            TextView textView8 = this.f27662d;
            C1244oj.m19765a(d2);
            int i19 = Build.VERSION.SDK_INT;
            textView8.setFirstBaselineToTopHeight(d2);
        }
        if (d3 != -1) {
            TextView textView9 = this.f27662d;
            C1244oj.m19765a(d3);
            Paint.FontMetricsInt fontMetricsInt = textView9.getPaint().getFontMetricsInt();
            int i20 = Build.VERSION.SDK_INT;
            if (textView9.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (d3 > Math.abs(i2)) {
                textView9.setPadding(textView9.getPaddingLeft(), textView9.getPaddingTop(), textView9.getPaddingRight(), d3 - i2);
            }
        }
        if (d4 != -1) {
            C1334rs.m20109c(this.f27662d, d4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16571a(boolean z) {
        this.f27662d.setAllCaps(z);
    }
}
