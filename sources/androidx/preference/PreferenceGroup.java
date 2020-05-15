package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: a */
    public final C1245ok f1611a;

    /* renamed from: b */
    public List f1612b;

    /* renamed from: c */
    public int f1613c;

    /* renamed from: d */
    private final Handler f1614d;

    /* renamed from: e */
    private boolean f1615e;

    /* renamed from: f */
    private int f1616f;

    /* renamed from: g */
    private boolean f1617g;

    /* renamed from: h */
    private final Runnable f1618h;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aoe();

        /* renamed from: a */
        int f1619a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1619a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1619a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1619a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private final void m1588c(Preference preference) {
        synchronized (this) {
            preference.mo2015s();
            if (preference.f1574D == this) {
                preference.mo1978a((PreferenceGroup) null);
            }
            if (this.f1612b.remove(preference)) {
                String str = preference.f1603s;
                if (str != null) {
                    this.f1611a.put(str, Long.valueOf(preference.mo1997e()));
                    this.f1614d.removeCallbacks(this.f1618h);
                    this.f1614d.post(this.f1618h);
                }
                if (this.f1617g) {
                    preference.mo2012p();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1977a(Bundle bundle) {
        super.mo1977a(bundle);
        int g = mo2023g();
        for (int i = 0; i < g; i++) {
            mo2024g(i).mo1977a(bundle);
        }
    }

    /* renamed from: b */
    public final void mo1985b(Bundle bundle) {
        super.mo1985b(bundle);
        int g = mo2023g();
        for (int i = 0; i < g; i++) {
            mo2024g(i).mo1985b(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcelable mo1964d() {
        return new SavedState(super.mo1964d(), this.f1613c);
    }

    /* renamed from: f */
    public final void mo2022f(int i) {
        if (i != Integer.MAX_VALUE && !mo2006j()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f1613c = i;
    }

    /* renamed from: g */
    public final int mo2023g() {
        return this.f1612b.size();
    }

    /* renamed from: v */
    public final void mo2025v() {
        synchronized (this) {
            List list = this.f1612b;
            for (int size = list.size() - 1; size >= 0; size--) {
                m1588c((Preference) list.get(0));
            }
        }
        mo2010n();
    }

    /* renamed from: w */
    public boolean mo2026w() {
        return true;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    /* renamed from: d */
    public final void mo1995d(boolean z) {
        super.mo1995d(z);
        int g = mo2023g();
        for (int i = 0; i < g; i++) {
            mo2024g(i).mo2002g(z);
        }
    }

    /* renamed from: g */
    public final Preference mo2024g(int i) {
        return (Preference) this.f1612b.get(i);
    }

    /* renamed from: o */
    public final void mo2011o() {
        super.mo2013q();
        this.f1617g = true;
        int g = mo2023g();
        for (int i = 0; i < g; i++) {
            mo2024g(i).mo2011o();
        }
    }

    /* renamed from: p */
    public final void mo2012p() {
        mo2014r();
        this.f1617g = false;
        int g = mo2023g();
        for (int i = 0; i < g; i++) {
            mo2024g(i).mo2012p();
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
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.f1611a = new C1245ok();
        this.f1614d = new Handler();
        this.f1615e = true;
        this.f1616f = 0;
        this.f1617g = false;
        this.f1613c = Integer.MAX_VALUE;
        this.f1618h = new aod(this);
        this.f1612b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1908h, i, 0);
        this.f1615e = C1164ll.m19316a(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            mo2022f(C1164ll.m19320d(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1960a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo1960a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f1613c = savedState.f1619a;
        super.mo1960a(savedState.getSuperState());
    }

    /* renamed from: b */
    public final void mo2020b(Preference preference) {
        m1588c(preference);
        mo2010n();
    }

    /* renamed from: c */
    public final Preference mo2021c(CharSequence charSequence) {
        Preference c;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.f1603s, charSequence)) {
            return this;
        } else {
            int g = mo2023g();
            for (int i = 0; i < g; i++) {
                Preference g2 = mo2024g(i);
                if (TextUtils.equals(g2.f1603s, charSequence)) {
                    return g2;
                }
                if ((g2 instanceof PreferenceGroup) && (c = ((PreferenceGroup) g2).mo2021c(charSequence)) != null) {
                    return c;
                }
            }
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo2019a(Preference preference) {
        long j;
        if (!this.f1612b.contains(preference)) {
            if (preference.f1603s != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.f1574D;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.f1603s;
                if (preferenceGroup.mo2021c((CharSequence) str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.f1601q == Integer.MAX_VALUE) {
                if (this.f1615e) {
                    int i = this.f1616f;
                    this.f1616f = i + 1;
                    preference.mo1974a(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).f1615e = this.f1615e;
                }
            }
            int binarySearch = Collections.binarySearch(this.f1612b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.mo2002g(mo1963c());
            synchronized (this) {
                this.f1612b.add(binarySearch, preference);
            }
            aon aon = this.f1596l;
            String str2 = preference.f1603s;
            if (str2 == null || !this.f1611a.containsKey(str2)) {
                j = aon.mo2234a();
            } else {
                j = ((Long) this.f1611a.get(str2)).longValue();
                this.f1611a.remove(str2);
            }
            preference.f1597m = j;
            preference.f1598n = true;
            try {
                preference.mo1980a(aon);
                preference.f1598n = false;
                preference.mo1978a(this);
                if (this.f1617g) {
                    preference.mo2011o();
                }
                mo2010n();
            } catch (Throwable th) {
                preference.f1598n = false;
                throw th;
            }
        }
    }
}
