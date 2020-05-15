package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EditTextPreference extends DialogPreference {

    /* renamed from: g */
    public String f1561g;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new anq();

        /* renamed from: a */
        String f1562a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1562a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1562a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, int, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      ll.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      ll.a(android.content.res.TypedArray, int, int, boolean):boolean */
    /* JADX WARNING: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a = C1164ll.m19309a(context, (int) C0126R.attr.editTextPreferenceStyle, 16842898);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1904d, a, 0);
        if (C1164ll.m19316a(obtainStyledAttributes, 0, 0, false)) {
            if (anr.f1856a == null) {
                anr.f1856a = new anr();
            }
            mo1979a((aoc) anr.f1856a);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1959a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: c */
    public final boolean mo1963c() {
        return TextUtils.isEmpty(this.f1561g) || super.mo1963c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1964d() {
        Parcelable d = super.mo1964d();
        if (this.f1607w) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f1562a = this.f1561g;
        return savedState;
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
        mo1962a(savedState.f1562a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1961a(Object obj) {
        mo1962a(mo1998e((String) obj));
    }

    /* renamed from: a */
    public final void mo1962a(String str) {
        boolean c = mo1963c();
        this.f1561g = str;
        mo2000f(str);
        boolean c2 = mo1963c();
        if (c2 != c) {
            mo1995d(c2);
        }
        mo1958b();
    }
}
