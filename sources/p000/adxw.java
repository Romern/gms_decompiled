package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguagePreference;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: adxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxw extends aaab {

    /* renamed from: a */
    private final String f62882a;

    /* renamed from: b */
    private final String f62883b;

    /* renamed from: c */
    private final LanguagePreferenceParams f62884c;

    /* renamed from: d */
    private final adwh f62885d;

    public adxw(adwh adwh, String str, String str2, LanguagePreferenceParams languagePreferenceParams) {
        super(167, "LanguagePreference");
        this.f62885d = adwh;
        this.f62882a = str;
        this.f62883b = str2;
        this.f62884c = languagePreferenceParams;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, aduw]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, bmxz):java.util.Collection
     arg types: [java.util.ArrayList, adva]
     candidates:
      bnec.a(java.util.Collection, bmxj):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean
      bnec.a(java.util.Collection, bmxz):java.util.Collection */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        advc advc;
        String str = this.f62883b;
        if (str != null) {
            advc a = advc.m51228a(this.f62882a, str);
            adwh adwh = this.f62885d;
            Status status = Status.f30107a;
            LanguagePreferenceParams languagePreferenceParams = this.f62884c;
            aduq a2 = aduq.m51220a();
            a.mo33850a(a2);
            a2.mo33838a(a.f62788a);
            int i = languagePreferenceParams.f79276c;
            int i2 = 6;
            if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? i != 6 ? 4 : 8 : 7;
            }
            ArrayList a3 = bnkn.m109661a();
            advi a4 = advi.m51235a(i2, a2.f62777a);
            for (Locale locale : a4.mo33855a()) {
                float f = 0.0f;
                double d = 0.0d;
                for (advh advh : a4.mo33854a(locale)) {
                    double d2 = (double) (((float) advh.f62802a) * advh.f62803b);
                    Double.isNaN(d2);
                    d += d2;
                    f = Math.max(f, advh.mo33852a());
                }
                a3.add(new LanguagePreference(locale, (float) (d / a4.f62806a), f));
            }
            ArrayList a5 = bnkn.m109661a();
            HashSet a6 = bnpf.m110047a();
            int size = a3.size();
            int i3 = 0;
            while (i3 < size) {
                LanguagePreference languagePreference = (LanguagePreference) a3.get(i3);
                String language = languagePreference.f79271a.getLanguage();
                if (!a6.contains(language)) {
                    Collection<LanguagePreference> a7 = bnec.m109117a((Collection) a3, (bmxz) new adva(languagePreference, language));
                    if (!a7.isEmpty()) {
                        Locale locale2 = languagePreference.f79271a;
                        float f2 = languagePreference.f79272b;
                        float f3 = languagePreference.f79273c;
                        for (LanguagePreference languagePreference2 : a7) {
                            advc advc2 = a;
                            f2 += languagePreference2.f79272b;
                            float f4 = languagePreference2.f79273c;
                            if (f3 < f4) {
                                locale2 = languagePreference2.f79271a;
                                f3 = f4;
                            }
                            a = advc2;
                        }
                        advc = a;
                        languagePreference = new LanguagePreference(locale2, f2, f3);
                    } else {
                        advc = a;
                    }
                    a5.add(languagePreference);
                    a6.add(language);
                } else {
                    advc = a;
                }
                i3++;
                a = advc;
            }
            bnjd.m109580a((Iterable) a5, (bmxz) new aduw(a.mo33849a(languagePreferenceParams.f79274a, languagePreferenceParams.f79275b)));
            Collections.sort(a5, adux.f62781a);
            adwh.mo33861a(status, a5);
            return;
        }
        this.f62885d.mo33861a(Status.f30109c, (List) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f62885d.mo33861a(status, (List) null);
    }
}
