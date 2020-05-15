package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Random;

/* renamed from: adkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkg implements adkq {

    /* renamed from: a */
    public static final adfs f62008a = new adfs("UserPrefsUpdater");

    /* renamed from: b */
    public final SharedPreferences f62009b;

    /* renamed from: c */
    public final adkr f62010c;

    /* renamed from: d */
    public final adkn f62011d;

    /* renamed from: e */
    public final Context f62012e;

    /* renamed from: f */
    public final Random f62013f;

    /* renamed from: g */
    private final adeo f62014g;

    /* renamed from: h */
    private final adfd f62015h;

    public adkg(SharedPreferences sharedPreferences, adkr adkr, adeo adeo, adkn adkn, Context context, adfd adfd, Random random) {
        this.f62009b = sharedPreferences;
        this.f62010c = adkr;
        this.f62014g = adeo;
        this.f62011d = adkn;
        this.f62012e = context;
        this.f62015h = adfd;
        this.f62013f = random;
        adkr.mo33607a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adkg.a(android.accounts.Account, int, boolean):void
     arg types: [android.accounts.Account, int, int]
     candidates:
      adkg.a(android.accounts.Account, int, int):void
      adkq.a(android.accounts.Account, int, int):void
      adkg.a(android.accounts.Account, int, boolean):void */
    /* renamed from: a */
    public final void mo33598a(Account account, int i, int i2) {
        mo33599a(account, i2, true);
    }

    /* renamed from: a */
    public final void mo33599a(Account account, int i, boolean z) {
        camj camj;
        adfb a = this.f62015h.mo33411a();
        if (account == null) {
            a.mo33409a("UserPrefsUpdater.noAccount");
            return;
        }
        if (i == 0) {
            camj = camj.OPT_IN_REJECTED;
        } else if (i == 1) {
            camj = camj.OPTED_IN;
        } else if (i != 3) {
            camj = camj.UNSET;
        } else {
            camj = camj.OPT_IN_SNOOZED;
        }
        if (!z) {
            if (System.currentTimeMillis() - this.f62009b.getLong("optInLastSyncMillis", 0) > ceow.f183163a.mo6606a().mo79503d()) {
                a.mo33409a("UserPrefsUpdater.tooLongSinceLastSync");
            } else if (this.f62009b.contains("optInStatus") && camj.m126786a(this.f62009b.getInt("optInStatus", 0)) == camj && this.f62009b.getString("optInAccount", "").equals(account.name)) {
                a.mo33409a("UserPrefsUpdater.willNotUpdate");
                Object[] objArr = {camj, account.name, false};
                return;
            }
        }
        bqga.m112781a(this.f62014g.mo33391a(camj, account), new adkf(this, camj, account, z, a), bqfb.INSTANCE);
    }
}
