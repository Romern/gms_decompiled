package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SeekBarPreference extends Preference {

    /* renamed from: F */
    private SeekBar.OnSeekBarChangeListener f1621F = new aos(this);

    /* renamed from: G */
    private View.OnKeyListener f1622G = new aot(this);

    /* renamed from: a */
    public int f1623a;

    /* renamed from: b */
    public int f1624b;

    /* renamed from: c */
    public boolean f1625c;

    /* renamed from: d */
    public SeekBar f1626d;

    /* renamed from: e */
    public boolean f1627e;

    /* renamed from: f */
    public boolean f1628f;

    /* renamed from: g */
    private int f1629g;

    /* renamed from: h */
    private int f1630h;

    /* renamed from: i */
    private TextView f1631i;

    /* renamed from: j */
    private boolean f1632j;

    /* renamed from: a */
    private final void m1606a(int i, boolean z) {
        int i2 = this.f1624b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f1629g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f1623a) {
            this.f1623a = i;
            mo2029f(i);
            if (mo2007k() && i != mo1996e(i ^ -1)) {
                SharedPreferences.Editor c = this.f1596l.mo2239c();
                c.putInt(this.f1603s, i);
                super.mo1975a(c);
            }
            if (z) {
                mo1958b();
            }
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
        savedState.f1633a = this.f1623a;
        savedState.f1634b = this.f1624b;
        savedState.f1635c = this.f1629g;
        return savedState;
    }

    /* renamed from: f */
    public final void mo2029f(int i) {
        TextView textView = this.f1631i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aou();

        /* renamed from: a */
        int f1633a;

        /* renamed from: b */
        int f1634b;

        /* renamed from: c */
        int f1635c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1633a = parcel.readInt();
            this.f1634b = parcel.readInt();
            this.f1635c = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1633a);
            parcel.writeInt(this.f1634b);
            parcel.writeInt(this.f1635c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0126R.attr.seekBarPreferenceStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1910j, C0126R.attr.seekBarPreferenceStyle, 0);
        this.f1624b = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.f1624b;
        i = i < i2 ? i2 : i;
        if (i != this.f1629g) {
            this.f1629g = i;
            mo1958b();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f1630h) {
            this.f1630h = Math.min(this.f1629g - this.f1624b, Math.abs(i3));
            mo1958b();
        }
        this.f1627e = obtainStyledAttributes.getBoolean(2, true);
        this.f1632j = obtainStyledAttributes.getBoolean(5, false);
        this.f1628f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo1959a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
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
        this.f1623a = savedState.f1633a;
        this.f1624b = savedState.f1634b;
        this.f1629g = savedState.f1635c;
        mo1958b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.SeekBarPreference.a(int, boolean):void
     arg types: [int, int]
     candidates:
      androidx.preference.SeekBarPreference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(android.view.View, boolean):void
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(boolean, java.lang.Object):void
      androidx.preference.SeekBarPreference.a(int, boolean):void */
    /* renamed from: a */
    public final void mo2028a(SeekBar seekBar) {
        int progress = this.f1624b + seekBar.getProgress();
        if (progress == this.f1623a) {
            return;
        }
        if (mo1988b(Integer.valueOf(progress))) {
            m1606a(progress, false);
            return;
        }
        seekBar.setProgress(this.f1623a - this.f1624b);
        mo2029f(this.f1623a);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        aoq.f201a.setOnKeyListener(this.f1622G);
        this.f1626d = (SeekBar) aoq.mo2241c(C0126R.C0129id.seekbar);
        TextView textView = (TextView) aoq.mo2241c(C0126R.C0129id.seekbar_value);
        this.f1631i = textView;
        if (this.f1632j) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f1631i = null;
        }
        SeekBar seekBar = this.f1626d;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.f1621F);
            this.f1626d.setMax(this.f1629g - this.f1624b);
            int i = this.f1630h;
            if (i != 0) {
                this.f1626d.setKeyProgressIncrement(i);
            } else {
                this.f1630h = this.f1626d.getKeyProgressIncrement();
            }
            this.f1626d.setProgress(this.f1623a - this.f1624b);
            mo2029f(this.f1623a);
            this.f1626d.setEnabled(mo2005i());
            return;
        }
        Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.SeekBarPreference.a(int, boolean):void
     arg types: [int, int]
     candidates:
      androidx.preference.SeekBarPreference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(android.view.View, boolean):void
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(boolean, java.lang.Object):void
      androidx.preference.SeekBarPreference.a(int, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1961a(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m1606a(mo1996e(((Integer) obj).intValue()), true);
    }
}
