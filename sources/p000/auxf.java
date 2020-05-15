package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: auxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ auxg f92693a;

    public auxf(auxg auxg) {
        this.f92693a = auxg;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        for (Account account : this.f92693a.mo51013c()) {
            String e = auxi.m78031e(account.name);
            if (!TextUtils.isEmpty(str) && str.equals(e) && this.f92693a.f92699f.getBoolean(e, false)) {
                auxg.f92694a.mo50711a("Account home enabled. Stop PlaceLure.", new Object[0]).mo50708c();
                synchronized (this.f92693a.f92698e) {
                    auxh auxh = this.f92693a.f92697d;
                    if (auxh != null) {
                        auxh.mo51017b();
                        this.f92693a.f92697d.mo51014a();
                        auxg auxg = this.f92693a;
                        auxg.f92697d = null;
                        auxg.mo51010a();
                        this.f92693a.f92699f.edit().putBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", true).apply();
                    }
                }
                return;
            }
        }
    }
}
