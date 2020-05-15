package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Preference implements Comparable {

    /* renamed from: A */
    public int f1571A;

    /* renamed from: B */
    public int f1572B;

    /* renamed from: C */
    public any f1573C;

    /* renamed from: D */
    public PreferenceGroup f1574D;

    /* renamed from: E */
    public aoc f1575E;

    /* renamed from: F */
    private boolean f1576F;

    /* renamed from: G */
    private boolean f1577G;

    /* renamed from: H */
    private boolean f1578H;

    /* renamed from: I */
    private boolean f1579I;

    /* renamed from: J */
    private boolean f1580J;

    /* renamed from: K */
    private List f1581K;

    /* renamed from: L */
    private boolean f1582L;

    /* renamed from: M */
    private aob f1583M;

    /* renamed from: N */
    private final View.OnClickListener f1584N;

    /* renamed from: a */
    private CharSequence f1585a;

    /* renamed from: b */
    private int f1586b;

    /* renamed from: c */
    private Drawable f1587c;

    /* renamed from: d */
    private boolean f1588d;

    /* renamed from: e */
    private boolean f1589e;

    /* renamed from: f */
    private boolean f1590f;

    /* renamed from: g */
    private String f1591g;

    /* renamed from: h */
    private boolean f1592h;

    /* renamed from: i */
    private boolean f1593i;

    /* renamed from: j */
    private boolean f1594j;

    /* renamed from: k */
    public Context f1595k;

    /* renamed from: l */
    public aon f1596l;

    /* renamed from: m */
    public long f1597m;

    /* renamed from: n */
    public boolean f1598n;

    /* renamed from: o */
    public anz f1599o;

    /* renamed from: p */
    public aoa f1600p;

    /* renamed from: q */
    public int f1601q;

    /* renamed from: r */
    public CharSequence f1602r;

    /* renamed from: s */
    public String f1603s;

    /* renamed from: t */
    public Intent f1604t;

    /* renamed from: u */
    public String f1605u;

    /* renamed from: v */
    public Bundle f1606v;

    /* renamed from: w */
    public boolean f1607w;

    /* renamed from: x */
    public Object f1608x;

    /* renamed from: y */
    public boolean f1609y;

    /* renamed from: z */
    public boolean f1610z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new anx();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void mo59572a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                mo59572a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo1959a(TypedArray typedArray, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1957a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1961a(Object obj) {
    }

    /* renamed from: b */
    public final Set mo1983b(Set set) {
        return mo2007k() ? this.f1596l.mo2238b().getStringSet(this.f1603s, set) : set;
    }

    /* renamed from: c */
    public final void mo1989c(int i) {
        mo1976a(C1391tv.m20459b(this.f1595k, i));
        this.f1586b = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f1601q;
        int i2 = preference.f1601q;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f1602r;
        CharSequence charSequence2 = preference.f1602r;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f1602r.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Parcelable mo1964d() {
        this.f1582L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo1996e(int i) {
        return mo2007k() ? this.f1596l.mo2238b().getInt(this.f1603s, i) : i;
    }

    /* renamed from: e */
    public long mo1997e() {
        return this.f1597m;
    }

    /* renamed from: f */
    public CharSequence mo1969f() {
        aoc aoc = this.f1575E;
        return aoc != null ? aoc.mo2209a(this) : this.f1585a;
    }

    /* renamed from: g */
    public final void mo2002g(boolean z) {
        if (this.f1593i == z) {
            this.f1593i = !z;
            mo1995d(mo1963c());
            mo1958b();
        }
    }

    /* renamed from: h */
    public final Drawable mo2003h() {
        int i;
        if (this.f1587c == null && (i = this.f1586b) != 0) {
            this.f1587c = C1391tv.m20459b(this.f1595k, i);
        }
        return this.f1587c;
    }

    /* renamed from: i */
    public boolean mo2005i() {
        return this.f1588d && this.f1592h && this.f1593i;
    }

    /* renamed from: j */
    public final boolean mo2006j() {
        return !TextUtils.isEmpty(this.f1603s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo2007k() {
        return this.f1596l != null && this.f1607w && mo2006j();
    }

    /* renamed from: l */
    public final void mo2008l() {
        Intent intent;
        aom aom;
        if (mo2005i() && this.f1589e) {
            mo1957a();
            aoa aoa = this.f1600p;
            if (aoa == null || !aoa.mo2219a(this)) {
                aon aon = this.f1596l;
                if ((aon == null || (aom = aon.f1885d) == null || !aom.mo2233c(this)) && (intent = this.f1604t) != null) {
                    this.f1595k.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: m */
    public final SharedPreferences mo2009m() {
        aon aon = this.f1596l;
        if (aon != null) {
            return aon.mo2238b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo2010n() {
        any any = this.f1573C;
        if (any != null) {
            any.mo2217b();
        }
    }

    /* renamed from: o */
    public void mo2011o() {
        mo2013q();
    }

    /* renamed from: p */
    public void mo2012p() {
        mo2014r();
    }

    /* renamed from: q */
    public final void mo2013q() {
        if (!TextUtils.isEmpty(this.f1591g)) {
            Preference d = mo1993d(this.f1591g);
            if (d != null) {
                if (d.f1581K == null) {
                    d.f1581K = new ArrayList();
                }
                d.f1581K.add(this);
                mo2001f(d.mo1963c());
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f1591g + "\" not found for preference \"" + this.f1603s + "\" (title: \"" + ((Object) this.f1602r) + "\"");
        }
    }

    /* renamed from: r */
    public final void mo2014r() {
        Preference d;
        List list;
        String str = this.f1591g;
        if (str != null && (d = mo1993d(str)) != null && (list = d.f1581K) != null) {
            list.remove(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo2015s() {
        mo2014r();
    }

    /* renamed from: t */
    public final void mo2016t() {
        if (!this.f1579I) {
            this.f1579I = true;
            mo1958b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1602r;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence f = mo1969f();
        if (!TextUtils.isEmpty(f)) {
            sb.append(f);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo2018u() {
        if (!this.f1580J) {
            this.f1580J = true;
            mo1958b();
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1164ll.m19309a(context, (int) C0126R.attr.preferenceStyle, 16842894));
    }

    /* renamed from: c */
    public final void mo1990c(String str) {
        this.f1603s = str;
        if (this.f1590f && !mo2006j()) {
            if (!TextUtils.isEmpty(this.f1603s)) {
                this.f1590f = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Preference mo1993d(String str) {
        aon aon = this.f1596l;
        if (aon != null) {
            return aon.mo2235a((CharSequence) str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo2000f(String str) {
        if (mo2007k() && !TextUtils.equals(str, mo1998e((String) null))) {
            SharedPreferences.Editor c = this.f1596l.mo2239c();
            c.putString(this.f1603s, str);
            mo1975a(c);
        }
    }

    /* renamed from: h */
    public final void mo2004h(boolean z) {
        if (mo2007k() && z != mo1999e(!z)) {
            SharedPreferences.Editor c = this.f1596l.mo2239c();
            c.putBoolean(this.f1603s, z);
            mo1975a(c);
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1958b() {
        int indexOf;
        any any = this.f1573C;
        if (any != null && (indexOf = ((aoi) any).f1870a.indexOf(this)) != -1) {
            ((abh) any).mo165a(indexOf, this);
        }
    }

    /* renamed from: d */
    public final void mo1994d(int i) {
        mo1966a((CharSequence) this.f1595k.getString(i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, int, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      ll.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      ll.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1601q = Integer.MAX_VALUE;
        this.f1588d = true;
        this.f1589e = true;
        this.f1607w = true;
        this.f1592h = true;
        this.f1593i = true;
        this.f1609y = true;
        this.f1594j = true;
        this.f1576F = true;
        this.f1578H = true;
        this.f1580J = true;
        this.f1571A = C0126R.C0128layout.preference;
        this.f1584N = new anw(this);
        this.f1595k = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1907g, i, i2);
        this.f1586b = C1164ll.m19310a(obtainStyledAttributes, 23, 0, 0);
        this.f1603s = C1164ll.m19314a(obtainStyledAttributes, 26, 6);
        this.f1602r = C1164ll.m19318b(obtainStyledAttributes, 34, 4);
        this.f1585a = C1164ll.m19318b(obtainStyledAttributes, 33, 7);
        this.f1601q = C1164ll.m19320d(obtainStyledAttributes, 28, 8);
        this.f1605u = C1164ll.m19314a(obtainStyledAttributes, 22, 13);
        this.f1571A = C1164ll.m19310a(obtainStyledAttributes, 27, 3, (int) C0126R.C0128layout.preference);
        this.f1572B = C1164ll.m19310a(obtainStyledAttributes, 35, 9, 0);
        this.f1588d = C1164ll.m19316a(obtainStyledAttributes, 21, 2, true);
        this.f1589e = C1164ll.m19316a(obtainStyledAttributes, 30, 5, true);
        this.f1607w = C1164ll.m19316a(obtainStyledAttributes, 29, 1, true);
        this.f1591g = C1164ll.m19314a(obtainStyledAttributes, 19, 10);
        this.f1594j = C1164ll.m19316a(obtainStyledAttributes, 16, 16, this.f1589e);
        this.f1576F = C1164ll.m19316a(obtainStyledAttributes, 17, 17, this.f1589e);
        if (obtainStyledAttributes.hasValue(18)) {
            this.f1608x = mo1959a(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f1608x = mo1959a(obtainStyledAttributes, 11);
        }
        this.f1580J = C1164ll.m19316a(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f1577G = hasValue;
        if (hasValue) {
            this.f1578H = C1164ll.m19316a(obtainStyledAttributes, 32, 14, true);
        }
        this.f1579I = C1164ll.m19316a(obtainStyledAttributes, 24, 15, false);
        this.f1609y = C1164ll.m19316a(obtainStyledAttributes, 25, 25, true);
        this.f1610z = C1164ll.m19316a(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void mo1991c(boolean z) {
        if (this.f1609y != z) {
            this.f1609y = z;
            any any = this.f1573C;
            if (any != null) {
                ((aoi) any).mo2217b();
            }
        }
    }

    /* renamed from: d */
    public void mo1995d(boolean z) {
        List list = this.f1581K;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).mo2001f(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo1998e(String str) {
        return mo2007k() ? this.f1596l.mo2238b().getString(this.f1603s, str) : str;
    }

    /* renamed from: a */
    public final void mo1974a(int i) {
        if (i != this.f1601q) {
            this.f1601q = i;
            mo2010n();
        }
    }

    /* renamed from: f */
    public final void mo2001f(boolean z) {
        if (this.f1592h == z) {
            this.f1592h = !z;
            mo1995d(mo1963c());
            mo1958b();
        }
    }

    /* renamed from: a */
    public final void mo1975a(SharedPreferences.Editor editor) {
        if (!this.f1596l.f1883b) {
            editor.apply();
        }
    }

    /* renamed from: b */
    public final void mo1984b(int i) {
        mo1986b((CharSequence) this.f1595k.getString(i));
    }

    /* renamed from: c */
    public boolean mo1963c() {
        return !mo2005i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo1999e(boolean z) {
        return mo2007k() ? this.f1596l.mo2238b().getBoolean(this.f1603s, z) : z;
    }

    /* renamed from: a */
    public final void mo1976a(Drawable drawable) {
        if (this.f1587c != drawable) {
            this.f1587c = drawable;
            this.f1586b = 0;
            mo1958b();
        }
    }

    /* renamed from: b */
    public void mo1985b(Bundle bundle) {
        Parcelable parcelable;
        if (mo2006j() && (parcelable = bundle.getParcelable(this.f1603s)) != null) {
            this.f1582L = false;
            mo1960a(parcelable);
            if (!this.f1582L) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* renamed from: a */
    public void mo1977a(Bundle bundle) {
        if (mo2006j()) {
            this.f1582L = false;
            Parcelable d = mo1964d();
            if (!this.f1582L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (d != null) {
                bundle.putParcelable(this.f1603s, d);
            }
        }
    }

    /* renamed from: b */
    public final void mo1986b(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f1602r)) {
            this.f1602r = charSequence;
            mo1958b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1960a(Parcelable parcelable) {
        this.f1582L = true;
        if (parcelable != BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: b */
    public final void mo1987b(boolean z) {
        if (this.f1589e != z) {
            this.f1589e = z;
            mo1958b();
        }
    }

    /* renamed from: a */
    public void mo1955a(View view) {
        mo2008l();
    }

    /* renamed from: b */
    public final boolean mo1988b(Object obj) {
        anz anz = this.f1599o;
        return anz == null || anz.mo2218a(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1978a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f1574D == null) {
            this.f1574D = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* renamed from: a */
    public final void mo1979a(aoc aoc) {
        this.f1575E = aoc;
        mo1958b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.Preference.a(boolean, java.lang.Object):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      androidx.preference.Preference.a(android.view.View, boolean):void
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.Preference.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.Object]
     candidates:
      androidx.preference.Preference.a(android.view.View, boolean):void
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo1980a(aon aon) {
        this.f1596l = aon;
        if (!this.f1598n) {
            this.f1597m = aon.mo2234a();
        }
        if (!mo2007k() || !mo2009m().contains(this.f1603s)) {
            Object obj = this.f1608x;
            if (obj != null) {
                mo1982a(false, obj);
                return;
            }
            return;
        }
        mo1982a(true, (Object) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.Preference.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(boolean, java.lang.Object):void
      androidx.preference.Preference.a(android.view.View, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: a */
    public void mo1956a(aoq aoq) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View c;
        boolean z;
        aob aob;
        int i;
        View view = aoq.f201a;
        view.setOnClickListener(this.f1584N);
        view.setId(0);
        TextView textView2 = (TextView) aoq.mo2241c(16908304);
        int i2 = 8;
        if (textView2 != null) {
            CharSequence f = mo1969f();
            if (!TextUtils.isEmpty(f)) {
                textView2.setText(f);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) aoq.mo2241c(16908310);
                if (textView != null) {
                    CharSequence charSequence = this.f1602r;
                    if (!TextUtils.isEmpty(charSequence)) {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.f1577G) {
                            textView.setSingleLine(this.f1578H);
                        }
                        if (!this.f1589e && mo2005i() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    } else {
                        textView.setVisibility(8);
                    }
                }
                imageView = (ImageView) aoq.mo2241c(16908294);
                if (imageView != null) {
                    int i3 = this.f1586b;
                    if (!(i3 == 0 && this.f1587c == null)) {
                        if (this.f1587c == null) {
                            this.f1587c = C1391tv.m20459b(this.f1595k, i3);
                        }
                        Drawable drawable = this.f1587c;
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.f1587c == null) {
                        if (!this.f1579I) {
                            i = 8;
                        } else {
                            i = 4;
                        }
                        imageView.setVisibility(i);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
                c = aoq.mo2241c(C0126R.C0129id.icon_frame);
                if (c == null) {
                    c = aoq.mo2241c(16908350);
                }
                if (c != null) {
                    if (this.f1587c == null) {
                        if (this.f1579I) {
                            i2 = 4;
                        }
                        c.setVisibility(i2);
                    } else {
                        c.setVisibility(0);
                    }
                }
                if (!this.f1580J) {
                    mo59572a(view, mo2005i());
                } else {
                    mo59572a(view, true);
                }
                boolean z2 = this.f1589e;
                view.setFocusable(z2);
                view.setClickable(z2);
                aoq.f1898u = this.f1594j;
                aoq.f1899v = this.f1576F;
                z = this.f1610z;
                if (z && this.f1583M == null) {
                    this.f1583M = new aob(this);
                }
                if (!z) {
                    aob = this.f1583M;
                } else {
                    aob = null;
                }
                view.setOnCreateContextMenuListener(aob);
                view.setLongClickable(z);
                if (z && !z2) {
                    C1280ps.m19890a(view, (Drawable) null);
                    return;
                }
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) aoq.mo2241c(16908310);
        if (textView != null) {
        }
        imageView = (ImageView) aoq.mo2241c(16908294);
        if (imageView != null) {
        }
        c = aoq.mo2241c(C0126R.C0129id.icon_frame);
        if (c == null) {
        }
        if (c != null) {
        }
        if (!this.f1580J) {
        }
        boolean z22 = this.f1589e;
        view.setFocusable(z22);
        view.setClickable(z22);
        aoq.f1898u = this.f1594j;
        aoq.f1899v = this.f1576F;
        z = this.f1610z;
        this.f1583M = new aob(this);
        if (!z) {
        }
        view.setOnCreateContextMenuListener(aob);
        view.setLongClickable(z);
        if (z) {
        }
    }

    /* renamed from: a */
    public void mo1966a(CharSequence charSequence) {
        if (this.f1575E != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f1585a, charSequence)) {
            this.f1585a = charSequence;
            mo1958b();
        }
    }

    /* renamed from: a */
    public final void mo1981a(boolean z) {
        if (this.f1588d != z) {
            this.f1588d = z;
            mo1995d(mo1963c());
            mo1958b();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo1982a(boolean z, Object obj) {
        mo1961a(obj);
    }
}
