package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.ClientLanguageSettings;
import com.google.android.gms.languageprofile.LanguageFluencyParams;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;

/* renamed from: adwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwz extends adwi implements aaai {

    /* renamed from: a */
    private final aaag f62855a;

    /* renamed from: b */
    private final String f62856b;

    public adwz(aaag aaag, String str) {
        this.f62855a = aaag;
        this.f62856b = str;
    }

    @Deprecated
    /* renamed from: a */
    public final String mo33863a() {
        return null;
    }

    /* renamed from: a */
    public final void mo33864a(String str, adwh adwh) {
        this.f62855a.mo16658a(new adxu(adwh, str));
    }

    /* renamed from: a */
    public final void mo33865a(String str, ClientLanguageSettings clientLanguageSettings, rnt rnt) {
        if (cere.m138102c()) {
            this.f62855a.mo16658a(new adxy(rnt, str, this.f62856b, clientLanguageSettings));
        } else {
            rnt.mo11797a(Status.f30107a);
        }
    }

    /* renamed from: a */
    public final void mo33866a(String str, LanguageFluencyParams languageFluencyParams, adwh adwh) {
        this.f62855a.mo16658a(new adxv(adwh, str, this.f62856b, languageFluencyParams));
    }

    /* renamed from: a */
    public final void mo33867a(String str, LanguagePreferenceParams languagePreferenceParams, adwh adwh) {
        this.f62855a.mo16658a(new adxw(adwh, str, this.f62856b, languagePreferenceParams));
    }

    /* renamed from: a */
    public final void mo33868a(String str, rnt rnt) {
        if (cere.m138102c()) {
            this.f62855a.mo16658a(new adxx(rnt, str, this.f62856b));
        } else {
            rnt.mo11797a(Status.f30107a);
        }
    }
}
