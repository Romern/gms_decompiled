package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: aon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aon {

    /* renamed from: a */
    public final Context f1882a;

    /* renamed from: b */
    public boolean f1883b;

    /* renamed from: c */
    public PreferenceScreen f1884c;

    /* renamed from: d */
    public aom f1885d;

    /* renamed from: e */
    public aok f1886e;

    /* renamed from: f */
    public aol f1887f;

    /* renamed from: g */
    private long f1888g = 0;

    /* renamed from: h */
    private SharedPreferences f1889h;

    /* renamed from: i */
    private SharedPreferences.Editor f1890i;

    /* renamed from: j */
    private String f1891j;

    public aon(Context context) {
        this.f1882a = context;
        mo2237a(context.getPackageName() + "_preferences");
    }

    /* renamed from: a */
    private final void m1773a(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f1890i) != null) {
            editor.apply();
        }
        this.f1883b = z;
    }

    /* renamed from: a */
    public final void mo2237a(String str) {
        this.f1891j = str;
        this.f1889h = null;
    }

    /* renamed from: b */
    public final SharedPreferences mo2238b() {
        if (this.f1889h == null) {
            this.f1889h = this.f1882a.getSharedPreferences(this.f1891j, 0);
        }
        return this.f1889h;
    }

    /* renamed from: c */
    public final SharedPreferences.Editor mo2239c() {
        if (!this.f1883b) {
            return mo2238b().edit();
        }
        if (this.f1890i == null) {
            this.f1890i = mo2238b().edit();
        }
        return this.f1890i;
    }

    /* renamed from: d */
    public final void mo2240d() {
        this.f1889h = null;
    }

    /* renamed from: a */
    public final long mo2234a() {
        long j;
        synchronized (this) {
            j = this.f1888g;
            this.f1888g = 1 + j;
        }
        return j;
    }

    /* renamed from: a */
    public final Preference mo2235a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f1884c;
        if (preferenceScreen != null) {
            return preferenceScreen.mo2021c(charSequence);
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final PreferenceScreen mo2236a(Context context, int i, PreferenceScreen preferenceScreen) {
        m1773a(true);
        aoj aoj = new aoj(context, this);
        XmlResourceParser xml = aoj.f1878a.getResources().getXml(i);
        try {
            Preference a = aoj.mo2230a(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) a;
            preferenceScreen2.mo1980a(this);
            m1773a(false);
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
