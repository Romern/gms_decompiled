package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.material.internal.NavigationMenuView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NavigationView extends bhjx {

    /* renamed from: g */
    private static final int[] f151215g = {16842912};

    /* renamed from: h */
    private static final int[] f151216h = {-16842910};

    /* renamed from: e */
    public final bhjs f151217e;

    /* renamed from: f */
    public final int[] f151218f;

    /* renamed from: i */
    private final bhji f151219i;

    /* renamed from: j */
    private final int f151220j;

    /* renamed from: k */
    private MenuInflater f151221k;

    /* renamed from: l */
    private ViewTreeObserver.OnGlobalLayoutListener f151222l;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new bhkr();

        /* renamed from: c */
        public Bundle f151223c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f151223c = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f151223c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final ColorStateList m117604a(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList a = C1391tv.m20458a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(C0126R.attr.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a.getDefaultColor();
                return new ColorStateList(new int[][]{f151216h, f151215g, EMPTY_STATE_SET}, new int[]{a.getColorForState(f151216h, defaultColor), i2, defaultColor});
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101141a(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f151222l);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f151220j), JGCastService.FLAG_PRIVATE_DISPLAY);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f151220j, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        this.f151219i.mo16240b(savedState.f151223c);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f151223c = new Bundle();
        this.f151219i.mo16221a(savedState.f151223c);
        return savedState;
    }

    public final void setElevation(float f) {
        int i = Build.VERSION.SDK_INT;
        super.setElevation(f);
        bhls.m101142a(this, f);
    }

    public final void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        bhjs bhjs = this.f151217e;
        if (bhjs != null) {
            bhjs.mo63882a(i);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.navigationViewStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void}
     arg types: [bhlr, int, int, int, int]
     candidates:
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, float, float, float, float):void}
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.material.navigation.NavigationView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.material.internal.NavigationMenuView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019310), attributeSet, i);
        ColorStateList colorStateList;
        boolean z;
        int i2;
        ColorStateList colorStateList2;
        this.f151217e = new bhjs();
        this.f151218f = new int[2];
        Context context2 = getContext();
        this.f151219i = new bhji(context2);
        adr b = bhki.m101056b(context2, attributeSet, bhks.f118919a, i, 2132019310, new int[0]);
        if (b.mo461f(0)) {
            C1280ps.m19890a(this, b.mo449a(0));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            bhlr bhlr = new bhlr();
            if (background instanceof ColorDrawable) {
                bhlr.mo63948c(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            bhlr.mo63942a(context2);
            C1280ps.m19890a(this, bhlr);
        }
        if (b.mo461f(3)) {
            setElevation((float) b.mo456d(3, 0));
        }
        setFitsSystemWindows(b.mo451a(1, false));
        this.f151220j = b.mo456d(2, 0);
        if (b.mo461f(9)) {
            colorStateList = b.mo459e(9);
        } else {
            colorStateList = m117604a(16842808);
        }
        if (b.mo461f(18)) {
            i2 = b.mo460f(18, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        if (b.mo461f(8)) {
            int d = b.mo456d(8, 0);
            bhjs bhjs = this.f151217e;
            if (bhjs.f118867n != d) {
                bhjs.f118867n = d;
                bhjs.f118868o = true;
                bhjs.mo470a(false);
            }
        }
        if (b.mo461f(19)) {
            colorStateList2 = b.mo459e(19);
        } else {
            colorStateList2 = null;
        }
        if (!z && colorStateList2 == null) {
            colorStateList2 = m117604a(16842806);
        }
        Drawable a = b.mo449a(5);
        if (a == null && (b.mo461f(11) || b.mo461f(12))) {
            bhlr bhlr2 = new bhlr(bhlx.m101156a(getContext(), b.mo460f(11, 0), b.mo460f(12, 0)).mo63972a());
            bhlr2.mo63948c(bhky.m101076a(getContext(), b, 13));
            a = new InsetDrawable((Drawable) bhlr2, b.mo456d(16, 0), b.mo456d(17, 0), b.mo456d(15, 0), b.mo456d(14, 0));
        }
        if (b.mo461f(6)) {
            int d2 = b.mo456d(6, 0);
            bhjs bhjs2 = this.f151217e;
            bhjs2.f118865l = d2;
            bhjs2.mo470a(false);
        }
        int d3 = b.mo456d(7, 0);
        int a2 = b.mo448a(10, 1);
        bhjs bhjs3 = this.f151217e;
        bhjs3.f118870q = a2;
        bhjs3.mo470a(false);
        this.f151219i.f27424b = new bhkp();
        bhjs bhjs4 = this.f151217e;
        bhjs4.f118857d = 1;
        bhjs4.mo466a(context2, this.f151219i);
        bhjs bhjs5 = this.f151217e;
        bhjs5.f118863j = colorStateList;
        bhjs5.mo470a(false);
        this.f151217e.mo63882a(getOverScrollMode());
        if (z) {
            bhjs bhjs6 = this.f151217e;
            bhjs6.f118860g = i2;
            bhjs6.f118861h = true;
            bhjs6.mo470a(false);
        }
        bhjs bhjs7 = this.f151217e;
        bhjs7.f118862i = colorStateList2;
        bhjs7.mo470a(false);
        bhjs bhjs8 = this.f151217e;
        bhjs8.f118864k = a;
        bhjs8.mo470a(false);
        bhjs bhjs9 = this.f151217e;
        bhjs9.f118866m = d3;
        bhjs9.mo470a(false);
        this.f151219i.mo16224a(this.f151217e);
        bhjs bhjs10 = this.f151217e;
        if (bhjs10.f118854a == null) {
            bhjs10.f118854a = (NavigationMenuView) bhjs10.f118859f.inflate((int) C0126R.C0128layout.design_navigation_menu, (ViewGroup) this, false);
            NavigationMenuView navigationMenuView = bhjs10.f118854a;
            navigationMenuView.setAccessibilityDelegateCompat(new bhjq(bhjs10, navigationMenuView));
            if (bhjs10.f118858e == null) {
                bhjs10.f118858e = new bhjl(bhjs10);
            }
            int i3 = bhjs10.f118873t;
            if (i3 != -1) {
                bhjs10.f118854a.setOverScrollMode(i3);
            }
            bhjs10.f118855b = (LinearLayout) bhjs10.f118859f.inflate((int) C0126R.C0128layout.design_navigation_item_header, (ViewGroup) bhjs10.f118854a, false);
            bhjs10.f118854a.setAdapter(bhjs10.f118858e);
        }
        addView(bhjs10.f118854a);
        if (b.mo461f(20)) {
            int f = b.mo460f(20, 0);
            this.f151217e.mo63883b(true);
            if (this.f151221k == null) {
                this.f151221k = new C1422uz(getContext());
            }
            this.f151221k.inflate(f, this.f151219i);
            this.f151217e.mo63883b(false);
            this.f151217e.mo470a(false);
        }
        if (b.mo461f(4)) {
            int f2 = b.mo460f(4, 0);
            bhjs bhjs11 = this.f151217e;
            bhjs11.f118855b.addView(bhjs11.f118859f.inflate(f2, (ViewGroup) bhjs11.f118855b, false));
            NavigationMenuView navigationMenuView2 = bhjs11.f118854a;
            navigationMenuView2.setPadding(0, 0, 0, navigationMenuView2.getPaddingBottom());
        }
        b.mo450a();
        this.f151222l = new bhkq(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f151222l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63888a(C1296qh qhVar) {
        bhjs bhjs = this.f151217e;
        int b = qhVar.mo15733b();
        if (bhjs.f118871r != b) {
            bhjs.f118871r = b;
            bhjs.mo63884c();
        }
        NavigationMenuView navigationMenuView = bhjs.f118854a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, qhVar.mo15736d());
        C1280ps.m19904b(bhjs.f118855b, qhVar);
    }
}
