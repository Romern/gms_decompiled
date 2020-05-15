package com.google.android.gms.trustlet.place.tracker;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HomeAddressChangeTracker$AccountChangedReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxn f109294a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeAddressChangeTracker$AccountChangedReceiver(auxn auxn) {
        super("trustlet_place");
        this.f109294a = auxn;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        auxn.f92725a.mo50711a("Accounts removed.", new Object[0]).mo50708c();
        auxn auxn = this.f109294a;
        for (Account account : gre.m13768b(intent)) {
            String a = auxi.m78022a(account.name, "Home", auxn.f92727c);
            if (!TextUtils.isEmpty(a)) {
                auxi.m78026b(account.name, new aupj(auxn.f92727c));
                if (auxi.m78024a(a, new aupj(auxn.f92727c)).isEmpty()) {
                    auxi.m78029c(a, new aupj(auxn.f92727c));
                }
            }
            if (auxn.f92727c.getString("auth_trust_agent_pref_trusted_place_home_work_account", "").equals(account.name)) {
                auxn.f92728d.remove("auth_trust_agent_pref_trusted_place_home_work_account").remove(auxi.m78032f(account.name)).remove(auxi.m78031e(account.name)).commit();
            }
        }
    }
}
