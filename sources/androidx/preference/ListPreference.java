package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListPreference extends DialogPreference {

    /* renamed from: F */
    private boolean f1563F;

    /* renamed from: g */
    private String f1564g;

    /* renamed from: h */
    public CharSequence[] f1565h;

    /* renamed from: i */
    public CharSequence[] f1566i;

    /* renamed from: j */
    public String f1567j;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new ant();

        /* renamed from: a */
        String f1568a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1568a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1568a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1164ll.m19309a(context, (int) C0126R.attr.dialogPreferenceStyle, 16842897));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1959a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: b */
    public final int mo1968b(String str) {
        CharSequence[] charSequenceArr;
        if (!(str == null || (charSequenceArr = this.f1566i) == null)) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.f1566i[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1964d() {
        Parcelable d = super.mo1964d();
        if (this.f1607w) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f1568a = this.f1567j;
        return savedState;
    }

    /* renamed from: f */
    public final CharSequence mo1969f() {
        aoc aoc = this.f1575E;
        if (aoc != null) {
            return aoc.mo2209a(this);
        }
        Object g = mo1970g();
        CharSequence f = super.mo1969f();
        String str = this.f1564g;
        if (str != null) {
            Object[] objArr = new Object[1];
            if (g == null) {
                g = "";
            }
            objArr[0] = g;
            String format = String.format(str, objArr);
            if (!TextUtils.equals(format, f)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return f;
    }

    /* renamed from: g */
    public final CharSequence mo1970g() {
        CharSequence[] charSequenceArr;
        int b = mo1968b(this.f1567j);
        if (b < 0 || (charSequenceArr = this.f1565h) == null) {
            return null;
        }
        return charSequenceArr[b];
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
        mo1967a(savedState.f1568a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, int, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      ll.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      ll.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1905e, i, 0);
        this.f1565h = C1164ll.m19319c(obtainStyledAttributes, 2, 0);
        this.f1566i = C1164ll.m19319c(obtainStyledAttributes, 3, 1);
        if (C1164ll.m19316a(obtainStyledAttributes, 4, 4, false)) {
            if (anu.f1858a == null) {
                anu.f1858a = new anu();
            }
            mo1979a((aoc) anu.f1858a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aor.f1907g, i, 0);
        this.f1564g = C1164ll.m19314a(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void mo1966a(CharSequence charSequence) {
        super.mo1966a(charSequence);
        this.f1564g = charSequence != null ? charSequence.toString() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1961a(Object obj) {
        mo1967a(mo1998e((String) obj));
    }

    /* renamed from: a */
    public final void mo1967a(String str) {
        boolean z = !TextUtils.equals(this.f1567j, str);
        if (z || !this.f1563F) {
            this.f1567j = str;
            this.f1563F = true;
            mo2000f(str);
            if (z) {
                mo1958b();
            }
        }
    }
}
