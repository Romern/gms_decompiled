package p000;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: mi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1189mi {

    /* renamed from: a */
    private final C1190mj f26674a;

    static {
        m19638a(new Locale[0]);
    }

    private C1189mi(C1190mj mjVar) {
        this.f26674a = mjVar;
    }

    /* renamed from: a */
    public static C1189mi m19637a(LocaleList localeList) {
        return new C1189mi(new C1190mj(localeList));
    }

    /* renamed from: b */
    public final String mo15464b() {
        return this.f26674a.f26675a.toLanguageTags();
    }

    /* renamed from: c */
    public final Locale mo15465c() {
        return this.f26674a.f26675a.get(0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1189mi) && this.f26674a.equals(((C1189mi) obj).f26674a);
    }

    public final int hashCode() {
        return this.f26674a.hashCode();
    }

    public final String toString() {
        return this.f26674a.toString();
    }

    /* renamed from: a */
    public static C1189mi m19638a(Locale... localeArr) {
        int i = Build.VERSION.SDK_INT;
        return m19637a(new LocaleList(localeArr));
    }

    /* renamed from: a */
    public final int mo15463a() {
        return this.f26674a.f26675a.size();
    }
}
