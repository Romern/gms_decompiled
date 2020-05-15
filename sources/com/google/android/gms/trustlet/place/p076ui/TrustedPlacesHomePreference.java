package com.google.android.gms.trustlet.place.p076ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.trustlet.place.ui.TrustedPlacesHomePreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustedPlacesHomePreference extends Preference {

    /* renamed from: a */
    public boolean f109298a;

    /* renamed from: b */
    public boolean f109299b;

    /* renamed from: c */
    public TextView f109300c;

    /* renamed from: d */
    public auyq f109301d;

    /* renamed from: e */
    private TextView f109302e;

    /* renamed from: f */
    private TextView f109303f;

    /* renamed from: g */
    private ColorStateList f109304g;

    /* renamed from: h */
    private ColorStateList f109305h;

    /* renamed from: i */
    private ColorStateList f109306i;

    /* renamed from: j */
    private boolean f109307j;

    public TrustedPlacesHomePreference(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1959a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1964d() {
        Parcelable d = super.mo1964d();
        if (this.f1607w) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f109308a = this.f109298a;
        return savedState;
    }

    /* renamed from: g */
    public final void mo59585g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        if (!this.f109298a) {
            colorStateList = this.f109304g.withAlpha(68);
        } else {
            colorStateList = this.f109304g;
        }
        if (!this.f109298a) {
            colorStateList2 = this.f109305h.withAlpha(68);
        } else {
            colorStateList2 = this.f109305h;
        }
        if (!this.f109298a) {
            colorStateList3 = this.f109306i.withAlpha(68);
        } else {
            colorStateList3 = this.f109306i;
        }
        this.f109302e.setTextColor(colorStateList);
        this.f109303f.setTextColor(colorStateList2);
        this.f109300c.setTextColor(colorStateList3);
    }

    /* renamed from: com.google.android.gms.trustlet.place.ui.TrustedPlacesHomePreference$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new auyr();

        /* renamed from: a */
        boolean f109308a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f109308a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f109308a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TrustedPlacesHomePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1960a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo1960a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo1960a(savedState.getSuperState());
        this.f109298a = savedState.f109308a;
    }

    public TrustedPlacesHomePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1571A = C0126R.C0128layout.auth_trusted_places_home_preference;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, eoi.f15406r, 0, 0);
        try {
            this.f109298a = obtainStyledAttributes.getBoolean(0, false);
            try {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842806, typedValue, true);
                obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{16842806});
                try {
                    this.f109304g = ColorStateList.valueOf(obtainStyledAttributes.getColor(0, -1));
                    context.getTheme().resolveAttribute(16842808, typedValue, true);
                    obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{16842808});
                    this.f109305h = ColorStateList.valueOf(obtainStyledAttributes.getColor(0, -1));
                    this.f109306i = ColorStateList.valueOf(context.getResources().getColor(C0126R.color.home_addr_from_color));
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    th = th;
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        int i;
        super.mo1956a(aoq);
        this.f109302e = (TextView) aoq.mo2241c(16908310);
        this.f109303f = (TextView) aoq.mo2241c(16908304);
        TextView textView = (TextView) aoq.mo2241c(C0126R.C0129id.from);
        this.f109300c = textView;
        if (!this.f109299b) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        mo59585g();
        if (!this.f109307j) {
            this.f109307j = true;
            new adzt(Looper.getMainLooper()).post(new auyp(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1982a(boolean z, Object obj) {
        if (!z) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f109298a = booleanValue;
            mo2004h(booleanValue);
            mo59585g();
            return;
        }
        this.f109298a = mo1999e(false);
    }
}
