package p000;

import com.google.android.gms.languageprofile.LanguageFluency;

/* renamed from: advb */
public final /* synthetic */ class advb implements bmxz {

    /* renamed from: a */
    private final LanguageFluency f62786a;

    /* renamed from: b */
    private final String f62787b;

    public advb(LanguageFluency languageFluency, String str) {
        this.f62786a = languageFluency;
        this.f62787b = str;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        LanguageFluency languageFluency = (LanguageFluency) obj;
        return !languageFluency.equals(this.f62786a) && languageFluency.f79265a.getLanguage().equals(this.f62787b);
    }
}
