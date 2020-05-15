package p000;

import com.google.android.gms.languageprofile.LanguagePreference;

/* renamed from: adva */
public final /* synthetic */ class adva implements bmxz {

    /* renamed from: a */
    private final LanguagePreference f62784a;

    /* renamed from: b */
    private final String f62785b;

    public adva(LanguagePreference languagePreference, String str) {
        this.f62784a = languagePreference;
        this.f62785b = str;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        LanguagePreference languagePreference = (LanguagePreference) obj;
        return !languagePreference.equals(this.f62784a) && languagePreference.f79271a.getLanguage().equals(this.f62785b);
    }
}
