package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: a */
    public final C1443vt f151068a;

    /* renamed from: b */
    public final bhey f151069b;

    /* renamed from: c */
    public final bhfa f151070c;

    /* renamed from: d */
    public exd f151071d;

    /* renamed from: e */
    private ColorStateList f151072e;

    /* renamed from: f */
    private MenuInflater f151073f;

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101141a(this);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        this.f151068a.mo16240b(savedState.f151074c);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f151074c = new Bundle();
        this.f151068a.mo16221a(savedState.f151074c);
        return savedState;
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        bhls.m101142a(this, f);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.bottomNavigationStyle);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new bhfd();

        /* renamed from: c */
        Bundle f151074c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f151074c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f151074c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019305), attributeSet, i);
        Drawable drawable;
        this.f151070c = new bhfa();
        Context context2 = getContext();
        this.f151068a = new bhew(context2);
        this.f151069b = new bhey(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f151069b.setLayoutParams(layoutParams);
        bhfa bhfa = this.f151070c;
        bhfa.f118459a = this.f151069b;
        bhfa.f118461c = 1;
        this.f151069b.f118448n = bhfa;
        this.f151068a.mo16224a(this.f151070c);
        this.f151070c.mo466a(getContext(), this.f151068a);
        adr b = bhki.m101056b(context2, attributeSet, bhfe.f118464a, i, 2132019305, 8, 7);
        if (b.mo461f(5)) {
            this.f151069b.mo63646a(b.mo459e(5));
        } else {
            bhey bhey = this.f151069b;
            bhey.mo63646a(bhey.mo63649b());
        }
        int d = b.mo456d(4, getResources().getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_icon_size));
        bhey bhey2 = this.f151069b;
        bhey2.f118441g = d;
        bhev[] bhevArr = bhey2.f118438d;
        if (bhevArr != null) {
            for (bhev bhev : bhevArr) {
                bhev.mo63634b(d);
            }
        }
        if (b.mo461f(8)) {
            int f = b.mo460f(8, 0);
            bhey bhey3 = this.f151069b;
            bhey3.f118443i = f;
            bhev[] bhevArr2 = bhey3.f118438d;
            if (bhevArr2 != null) {
                for (bhev bhev2 : bhevArr2) {
                    bhev2.mo63637c(f);
                    ColorStateList colorStateList = bhey3.f118442h;
                    if (colorStateList != null) {
                        bhev2.mo63635b(colorStateList);
                    }
                }
            }
        }
        if (b.mo461f(7)) {
            int f2 = b.mo460f(7, 0);
            bhey bhey4 = this.f151069b;
            bhey4.f118444j = f2;
            bhev[] bhevArr3 = bhey4.f118438d;
            if (bhevArr3 != null) {
                for (bhev bhev3 : bhevArr3) {
                    bhev3.mo63639d(f2);
                    ColorStateList colorStateList2 = bhey4.f118442h;
                    if (colorStateList2 != null) {
                        bhev3.mo63635b(colorStateList2);
                    }
                }
            }
        }
        if (b.mo461f(9)) {
            ColorStateList e = b.mo459e(9);
            bhey bhey5 = this.f151069b;
            bhey5.f118442h = e;
            bhev[] bhevArr4 = bhey5.f118438d;
            if (bhevArr4 != null) {
                for (bhev bhev4 : bhevArr4) {
                    bhev4.mo63635b(e);
                }
            }
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            bhlr bhlr = new bhlr();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                bhlr.mo63948c(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            bhlr.mo63942a(context2);
            C1280ps.m19890a(this, bhlr);
        }
        if (b.mo461f(1)) {
            C1280ps.m19918f(this, (float) b.mo456d(1, 0));
        }
        C1173lt.m19601a(getBackground().mutate(), bhky.m101076a(context2, b, 0));
        int b2 = b.mo452b(10, -1);
        bhey bhey6 = this.f151069b;
        if (bhey6.f118437c != b2) {
            bhey6.f118437c = b2;
            this.f151070c.mo470a(false);
        }
        boolean a = b.mo451a(3, true);
        bhey bhey7 = this.f151069b;
        if (bhey7.f118436b != a) {
            bhey7.f118436b = a;
            this.f151070c.mo470a(false);
        }
        int f3 = b.mo460f(2, 0);
        if (f3 == 0) {
            ColorStateList a2 = bhky.m101076a(context2, b, 6);
            if (this.f151072e != a2) {
                this.f151072e = a2;
                if (a2 != null) {
                    ColorStateList a3 = bhlg.m101094a(a2);
                    int i2 = Build.VERSION.SDK_INT;
                    this.f151069b.mo63647a(new RippleDrawable(a3, null, null));
                } else {
                    this.f151069b.mo63647a((Drawable) null);
                }
            } else if (a2 == null) {
                bhey bhey8 = this.f151069b;
                bhev[] bhevArr5 = bhey8.f118438d;
                if (bhevArr5 != null && bhevArr5.length > 0) {
                    drawable = bhevArr5[0].getBackground();
                } else {
                    drawable = bhey8.f118445k;
                }
                if (drawable != null) {
                    this.f151069b.mo63647a((Drawable) null);
                }
            }
        } else {
            bhey bhey9 = this.f151069b;
            bhey9.f118446l = f3;
            bhev[] bhevArr6 = bhey9.f118438d;
            if (bhevArr6 != null) {
                for (bhev bhev5 : bhevArr6) {
                    bhev5.mo63640e(f3);
                }
            }
        }
        if (b.mo461f(11)) {
            int f4 = b.mo460f(11, 0);
            this.f151070c.f118460b = true;
            if (this.f151073f == null) {
                this.f151073f = new C1422uz(getContext());
            }
            this.f151073f.inflate(f4, this.f151068a);
            bhfa bhfa2 = this.f151070c;
            bhfa2.f118460b = false;
            bhfa2.mo470a(true);
        }
        b.mo450a();
        addView(this.f151069b, layoutParams);
        int i3 = Build.VERSION.SDK_INT;
        this.f151068a.f27424b = new bhfb(this);
        bhkn.m101063a(this, new bhfc());
    }
}
