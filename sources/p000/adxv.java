package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguageFluency;
import com.google.android.gms.languageprofile.LanguageFluencyParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: adxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxv extends aaab {

    /* renamed from: a */
    private final String f62878a;

    /* renamed from: b */
    private final String f62879b;

    /* renamed from: c */
    private final LanguageFluencyParams f62880c;

    /* renamed from: d */
    private final adwh f62881d;

    public adxv(adwh adwh, String str, String str2, LanguageFluencyParams languageFluencyParams) {
        super(167, "LanguageFluency");
        this.f62881d = adwh;
        this.f62878a = str;
        this.f62879b = str2;
        this.f62880c = languageFluencyParams;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, aduy]
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
     arg types: [java.util.ArrayList, advb]
     candidates:
      bnec.a(java.util.Collection, bmxj):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean
      bnec.a(java.util.Collection, bmxz):java.util.Collection */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        advc advc;
        String str = this.f62879b;
        if (str != null) {
            advc a = advc.m51228a(this.f62878a, str);
            adwh adwh = this.f62881d;
            Status status = Status.f30107a;
            LanguageFluencyParams languageFluencyParams = this.f62880c;
            aduq a2 = aduq.m51220a();
            a.mo33850a(a2);
            a2.mo33838a(a.f62788a);
            ArrayList a3 = bnkn.m109661a();
            advi a4 = advi.m51235a(2, a2.f62777a);
            for (Locale locale : a4.mo33855a()) {
                float f = 0.0f;
                for (advh advh : a4.mo33854a(locale)) {
                    f = Math.max(f, advh.mo33852a());
                }
                a3.add(new LanguageFluency(locale, f, f));
            }
            ArrayList a5 = bnkn.m109661a();
            HashSet a6 = bnpf.m110047a();
            int size = a3.size();
            int i = 0;
            while (i < size) {
                LanguageFluency languageFluency = (LanguageFluency) a3.get(i);
                String language = languageFluency.f79265a.getLanguage();
                if (!a6.contains(language)) {
                    Collection<LanguageFluency> a7 = bnec.m109117a((Collection) a3, (bmxz) new advb(languageFluency, language));
                    if (!a7.isEmpty()) {
                        Locale locale2 = languageFluency.f79265a;
                        float f2 = languageFluency.f79266b;
                        float f3 = languageFluency.f79267c;
                        for (LanguageFluency languageFluency2 : a7) {
                            advc advc2 = a;
                            float f4 = languageFluency2.f79267c;
                            if (f3 < f4) {
                                float f5 = languageFluency2.f79266b;
                                locale2 = languageFluency2.f79265a;
                                f2 = f5;
                                f3 = f4;
                            }
                            a = advc2;
                        }
                        advc = a;
                        languageFluency = new LanguageFluency(locale2, f2, f3);
                    } else {
                        advc = a;
                    }
                    a5.add(languageFluency);
                    a6.add(language);
                } else {
                    advc = a;
                }
                i++;
                a = advc;
            }
            bnjd.m109580a((Iterable) a5, (bmxz) new aduy(a.mo33849a(languageFluencyParams.f79268a, languageFluencyParams.f79269b)));
            Collections.sort(a5, aduz.f62783a);
            adwh.mo33862b(status, a5);
            return;
        }
        this.f62881d.mo33862b(Status.f30109c, (List) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f62881d.mo33862b(status, (List) null);
    }
}
