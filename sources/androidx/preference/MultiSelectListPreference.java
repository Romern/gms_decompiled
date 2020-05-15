package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: g */
    private Set f1569g = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int a = C1164ll.m19309a(context, (int) C0126R.attr.dialogPreferenceStyle, 16842897);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1906f, a, 0);
        C1164ll.m19319c(obtainStyledAttributes, 2, 0);
        C1164ll.m19319c(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1959a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1964d() {
        Parcelable d = super.mo1964d();
        if (this.f1607w) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f1570a = this.f1569g;
        return savedState;
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new anv();

        /* renamed from: a */
        Set f1570a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f1570a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f1570a, strArr);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1570a.size());
            Set set = this.f1570a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
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
        mo1972a(savedState.f1570a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1961a(Object obj) {
        mo1972a(mo1983b((Set) obj));
    }

    /* renamed from: a */
    public final void mo1972a(Set set) {
        this.f1569g.clear();
        this.f1569g.addAll(set);
        if (mo2007k() && !set.equals(mo1983b((Set) null))) {
            SharedPreferences.Editor c = this.f1596l.mo2239c();
            c.putStringSet(this.f1603s, set);
            super.mo1975a(c);
        }
        mo1958b();
    }
}
