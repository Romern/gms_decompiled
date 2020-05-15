package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: a */
    public boolean f1642a;

    /* renamed from: b */
    public boolean f1643b;

    /* renamed from: c */
    private CharSequence f1644c;

    /* renamed from: d */
    private CharSequence f1645d;

    /* renamed from: e */
    private boolean f1646e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aox();

        /* renamed from: a */
        boolean f1647a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1647a = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1647a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1959a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo2031b(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.f1642a && !TextUtils.isEmpty(this.f1644c)) {
                textView.setText(this.f1644c);
            } else if (!this.f1642a && !TextUtils.isEmpty(this.f1645d)) {
                textView.setText(this.f1645d);
            } else {
                CharSequence f = mo1969f();
                if (!TextUtils.isEmpty(f)) {
                    textView.setText(f);
                } else {
                    i = 8;
                }
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo2033c(CharSequence charSequence) {
        this.f1644c = charSequence;
        if (this.f1642a) {
            mo1958b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1964d() {
        Parcelable d = super.mo1964d();
        if (this.f1607w) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f1647a = this.f1642a;
        return savedState;
    }

    /* renamed from: i */
    public final void mo2035i(boolean z) {
        boolean z2 = this.f1642a;
        if (z2 != z || !this.f1646e) {
            this.f1642a = z;
            this.f1646e = true;
            mo2004h(z);
            if (z2 != z) {
                mo1995d(mo1963c());
                mo1958b();
            }
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1957a() {
        boolean z = !this.f1642a;
        if (mo1988b(Boolean.valueOf(z))) {
            mo2035i(z);
        }
    }

    /* renamed from: c */
    public final boolean mo1963c() {
        if (!this.f1643b) {
            if (!this.f1642a) {
                return true;
            }
        } else if (this.f1642a) {
            return true;
        }
        return super.mo1963c();
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
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
        mo2035i(savedState.f1647a);
    }

    /* renamed from: d */
    public final void mo2034d(CharSequence charSequence) {
        this.f1645d = charSequence;
        if (!this.f1642a) {
            mo1958b();
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1961a(Object obj) {
        if (obj == null) {
            obj = false;
        }
        mo2035i(mo1999e(((Boolean) obj).booleanValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo2032b(aoq aoq) {
        mo2031b(aoq.mo2241c(16908304));
    }
}
