package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoi extends abh implements any {

    /* renamed from: a */
    public List f1870a;

    /* renamed from: d */
    private final PreferenceGroup f1871d;

    /* renamed from: e */
    private List f1872e;

    /* renamed from: f */
    private final List f1873f;

    /* renamed from: g */
    private final Handler f1874g;

    /* renamed from: h */
    private final Runnable f1875h = new aof(this);

    public aoi(PreferenceGroup preferenceGroup) {
        this.f1871d = preferenceGroup;
        this.f1874g = new Handler();
        this.f1871d.f1573C = this;
        this.f1872e = new ArrayList();
        this.f1870a = new ArrayList();
        this.f1873f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f1871d;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            mo170a(((PreferenceScreen) preferenceGroup2).f1620d);
        } else {
            mo170a(true);
        }
        mo2228c();
    }

    /* renamed from: a */
    private final List m1755a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int g = preferenceGroup.mo2023g();
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            Preference g2 = preferenceGroup.mo2024g(i2);
            if (g2.f1609y) {
                if (!m1757b(preferenceGroup) || i < preferenceGroup.f1613c) {
                    arrayList.add(g2);
                } else {
                    arrayList2.add(g2);
                }
                if (g2 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) g2;
                    if (!preferenceGroup2.mo2026w()) {
                        continue;
                    } else if (!m1757b(preferenceGroup) || !m1757b(preferenceGroup2)) {
                        List a = m1755a(preferenceGroup2);
                        int size = a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Preference preference = (Preference) a.get(i3);
                            if (m1757b(preferenceGroup) && i >= preferenceGroup.f1613c) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                } else {
                    i++;
                }
            }
        }
        if (m1757b(preferenceGroup) && i > preferenceGroup.f1613c) {
            ans ans = new ans(preferenceGroup.f1595k, arrayList2, preferenceGroup.mo1997e());
            ans.f1600p = new aog(this, preferenceGroup);
            arrayList.add(ans);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static final boolean m1757b(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f1613c != Integer.MAX_VALUE;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        if (this.f103b) {
            return mo2229f(i).mo1997e();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2228c() {
        List list = this.f1872e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).f1573C = null;
        }
        ArrayList arrayList = new ArrayList(this.f1872e.size());
        this.f1872e = arrayList;
        m1756a(arrayList, this.f1871d);
        this.f1870a = m1755a(this.f1871d);
        mo171aJ();
        List list2 = this.f1872e;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Preference preference = (Preference) list2.get(i2);
        }
    }

    /* renamed from: f */
    public final Preference mo2229f(int i) {
        if (i < 0 || i >= mo161a()) {
            return null;
        }
        return (Preference) this.f1870a.get(i);
    }

    /* renamed from: b */
    public final void mo2217b() {
        this.f1874g.removeCallbacks(this.f1875h);
        this.f1874g.post(this.f1875h);
    }

    /* renamed from: a */
    private final void m1756a(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f1612b);
        }
        int g = preferenceGroup.mo2023g();
        for (int i = 0; i < g; i++) {
            Preference g2 = preferenceGroup.mo2024g(i);
            list.add(g2);
            aoh aoh = new aoh(g2);
            if (!this.f1873f.contains(aoh)) {
                this.f1873f.add(aoh);
            }
            if (g2 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) g2;
                if (preferenceGroup2.mo2026w()) {
                    m1756a(list, preferenceGroup2);
                }
            }
            g2.f1573C = this;
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f1870a.size();
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        aoh aoh = new aoh(mo2229f(i));
        int indexOf = this.f1873f.indexOf(aoh);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f1873f.size();
        this.f1873f.add(aoh);
        return size;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        aoh aoh = (aoh) this.f1873f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, aor.f1901a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C1391tv.m20459b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(aoh.f1867a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C1280ps.m19890a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = aoh.f1868b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new aoq(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        aoq aoq = (aoq) acm;
        Preference f = mo2229f(i);
        Drawable background = aoq.f201a.getBackground();
        Drawable drawable = aoq.f1896s;
        if (background != drawable) {
            C1280ps.m19890a(aoq.f201a, drawable);
        }
        TextView textView = (TextView) aoq.mo2241c(16908310);
        if (!(textView == null || aoq.f1897t == null || textView.getTextColors().equals(aoq.f1897t))) {
            textView.setTextColor(aoq.f1897t);
        }
        f.mo1956a(aoq);
    }
}
