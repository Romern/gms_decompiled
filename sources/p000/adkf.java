package p000;

import android.accounts.Account;

/* renamed from: adkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adkf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ camj f62003a;

    /* renamed from: b */
    final /* synthetic */ Account f62004b;

    /* renamed from: c */
    final /* synthetic */ boolean f62005c;

    /* renamed from: d */
    final /* synthetic */ adfb f62006d;

    /* renamed from: e */
    final /* synthetic */ adkg f62007e;

    public adkf(adkg adkg, camj camj, Account account, boolean z, adfb adfb) {
        this.f62007e = adkg;
        this.f62003a = camj;
        this.f62004b = account;
        this.f62005c = z;
        this.f62006d = adfb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        btit btit = (btit) obj;
        this.f62007e.f62009b.edit().putInt("optInStatus", this.f62003a.mo3214a()).putString("optInAccount", this.f62004b.name).putLong("optInLastSyncMillis", System.currentTimeMillis()).apply();
        adkg.f62008a.mo33423a("Update complete: status=%s force=%s", this.f62003a, Boolean.valueOf(this.f62005c));
        this.f62006d.mo33409a("UserPrefsUpdater.onSuccess");
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        String format = String.format("Failed updateUserPrefs: status=%s force=%s", this.f62003a, Boolean.valueOf(this.f62005c));
        if (cepl.f183185a.mo6606a().mo79526J() > this.f62007e.f62013f.nextDouble()) {
            adfu.m50331a(this.f62007e.f62012e, format, th, adkg.f62008a);
        } else {
            adkg.f62008a.mo33425a(th, "%s", format);
        }
        this.f62006d.mo33409a("UserPrefsUpdater.onFailure");
    }
}
