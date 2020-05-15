package com.google.android.gms.smartdevice.setup.p066ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.smartdevice.setup.ui.AccountChallengeChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChallengeChimeraActivity extends deu implements arwr {

    /* renamed from: c */
    private static final sek f108193c = ascp.m73787a("Setup", "UI", "AccountChallengeChimeraActivity");

    /* renamed from: b */
    gto f108194b;

    /* renamed from: d */
    private arws f108195d;

    /* renamed from: a */
    public final void mo48885a(ArrayList arrayList) {
        int i;
        sek sek = f108193c;
        Object[] objArr = new Object[1];
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        sek.mo25409a("onAccountChallengesCompleted(accounts.size()=%s)", objArr);
        Intent intent = new Intent();
        intent.putExtra("accounts", arrayList);
        this.f108194b.mo12201a("com.google", 1).mo50367a(getContainerActivity(), new arwn(this, intent));
    }

    public final void onBackPressed() {
        boolean z = false;
        f108193c.mo25409a("onBackPressed", new Object[0]);
        arws arws = this.f108195d;
        if (arws.f88377c == null) {
            String str = arws.f88376b;
            if (str != null && str.equals(arws.f88378d.f108250j)) {
                z = true;
            }
            arwp arwp = new arwp(arws);
            Activity activity = arws.getActivity();
            if (activity != null) {
                C1349sg a = arqh.m73304a((Context) activity);
                a.mo15902a(true);
                a.mo15905b((int) C0126R.string.smartdevice_d2d_target_skip_primary_account_alert_title);
                a.mo15906b((int) C0126R.string.common_skip, arwp);
                a.mo15892a((int) C0126R.string.common_cancel, arwp);
                a.mo15894a(new arwq(arws));
                if (z) {
                    a.mo15912d(C0126R.string.smartdevice_d2d_target_skip_primary_account_alert_message);
                }
                arws.f88377c = a.mo15904b();
                arws.f88377c.show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arqh.m73305a((Activity) this);
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        this.f108194b = gsw.m13839a(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("accounts");
        boolean z = false;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            z = true;
        }
        sdo.m34974b(z);
        if (bundle == null) {
            this.f108195d = arws.m73628a(parcelableArrayListExtra, null);
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, this.f108195d, "challengeFragment").commit();
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("challengeFragment");
        sdo.m34959a(findFragmentByTag);
        this.f108195d = (arws) findFragmentByTag;
    }
}
