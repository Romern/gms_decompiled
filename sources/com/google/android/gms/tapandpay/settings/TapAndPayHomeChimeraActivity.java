package com.google.android.gms.tapandpay.settings;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayHomeChimeraActivity extends atex implements auat, atxi, alig {

    /* renamed from: b */
    public static final srn f108675b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public AccountInfo f108676c;

    /* renamed from: d */
    public alif f108677d;

    /* renamed from: e */
    public atlq f108678e;

    /* renamed from: f */
    public rjx f108679f;

    /* renamed from: g */
    private BroadcastReceiver f108680g;

    /* renamed from: h */
    private atlg f108681h;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class AccountChangedReceiver extends aacn {
        public AccountChangedReceiver(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity = TapAndPayHomeChimeraActivity.this;
            srn srn = TapAndPayHomeChimeraActivity.f108675b;
            tapAndPayHomeChimeraActivity.mo59411g();
        }
    }

    /* renamed from: b */
    public static final alif m93124b(AccountInfo accountInfo) {
        alij alij = new alij();
        alie alie = new alie(accountInfo.f108326b, accountInfo.f108325a);
        cazf.m127594a(alie);
        alij.f73533a = alie;
        alid alid = new alid();
        cazf.m127594a(alid);
        alij.f73534b = alid;
        cazf.m127595a(alij.f73533a, alie.class);
        cazf.m127595a(alij.f73534b, alid.class);
        return new alik(alij.f73533a);
    }

    /* renamed from: c */
    private final void m93125c(AccountInfo accountInfo) {
        Fragment fragment;
        this.f108677d = m93124b(accountInfo);
        atlq atlq = this.f108678e;
        Intent intent = getIntent();
        if (intent == null || intent.getAction() == null) {
            fragment = aswe.m74918d();
        } else {
            atlx atlx = (atlx) atlq.f90454a.get(intent.getAction());
            if (atlx != null) {
                fragment = atlx.mo50033a(intent);
            } else {
                fragment = null;
            }
        }
        if (fragment == null) {
            bnsl bnsl = (bnsl) f108675b.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "c", 438, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("No fragment found.");
            finishActivity(0);
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.Root, fragment, "MAIN_VIEW").commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i2 == 2000 && i != -1 && i == -2 && this.f108676c == null) {
            finish();
        }
    }

    /* renamed from: b */
    public final alif mo40362b() {
        return this.f108677d;
    }

    /* renamed from: e */
    public final void mo50301e() {
        String[] a = soz.m35792a(soz.m35801d(this, getPackageName()));
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            arrayList.add(new Account(str, "com.google"));
        }
        Intent a2 = rew.m33486a(new Account(this.f108676c.f108326b, "com.google"), arrayList, new String[]{"com.google"}, true, getResources().getString(C0126R.string.tp_account_picker_description_override), false, 1, 2, null, true);
        if (!a2.hasExtra("realClientPackage")) {
            a2.putExtra("realClientPackage", "com.google.android.gms");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("theme", 1000);
        bundle.putString("title", getResources().getString(C0126R.string.tp_account_picker_title));
        a2.putExtra("first_party_options_bundle", bundle);
        startActivityForResult(a2, 2100);
    }

    /* renamed from: g */
    public final void mo59411g() {
        aucb x = this.f108679f.mo24770x();
        x.mo50376a(this, new atle(this));
        x.mo50372a(new atlf(this));
    }

    /* renamed from: h */
    public final alic mo59412h() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("MAIN_VIEW");
        if (findFragmentByTag instanceof alic) {
            return (alic) findFragmentByTag;
        }
        bnsl bnsl = (bnsl) f108675b.mo68387b();
        bnsl.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "h", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("No fragment found for main view.");
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1300) {
            alic h = mo59412h();
            if (h != null) {
                h.onActivityResult(i, i2, intent);
            }
        } else if (i == 2100 && i2 == -1 && intent != null) {
            mo59409a(intent.getStringExtra("authAccount"));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(2132018962);
        if (bundle != null && bundle.containsKey("KEY_ACCOUNT_INFO")) {
            this.f108677d = m93124b((AccountInfo) bundle.getParcelable("KEY_ACCOUNT_INFO"));
        }
        super.onCreate(bundle);
        this.f108680g = new AccountChangedReceiver(this);
        setContentView((int) C0126R.C0128layout.tp_settings_activity);
        rjx b = rjx.m33696b(alii.m60897b());
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        this.f108679f = b;
        bnha a = bnhe.m109406a(6);
        atlx atlx = atlr.f90455a;
        cazf.m127593a(atlx, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("com.google.android.gms.tapandpay.settings.VIEW_HOME", atlx);
        atlx atlx2 = atls.f90456a;
        cazf.m127593a(atlx2, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("com.google.android.gms.tapandpay.settings.GREEN_PATH_RESULT", atlx2);
        atlx atlx3 = atlt.f90457a;
        cazf.m127593a(atlx3, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("com.google.android.gms.tapandpay.settings.PROMPT_DEFERRED_YELLOW_PATH", atlx3);
        atlx atlx4 = atlu.f90458a;
        cazf.m127593a(atlx4, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("com.google.android.gms.tapandpay.oobe.OOBE", atlx4);
        atlx atlx5 = atlv.f90459a;
        cazf.m127593a(atlx5, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("com.google.android.gms.tapandpay.settings.RED_PATH_RESULT", atlx5);
        atlx atlx6 = atlw.f90460a;
        cazf.m127593a(atlx6, "Cannot return null from a non-@Nullable @Provides method");
        a.mo67695b("com.google.android.gms.tapandpay.oobedebug.OOBE_DEBUG_SCREEN", atlx6);
        this.f108678e = new atlq(a.mo67618b());
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        mo59411g();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        unregisterReceiver(this.f108680g);
        asuw.m74879b(this);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        asuw.m74877a(this);
        registerReceiver(this.f108680g, new IntentFilter("com.google.android.gms.tapandpay.WALLET_CHANGED"));
        Intent intent = getIntent();
        if (intent.getBooleanExtra("global_actions_initiated", false)) {
            intent.removeExtra("global_actions_initiated");
            atam atam = new atam(this, mo49917k().f90210a);
            atam.mo49741a(atam.mo49735a(130, (CardInfo) intent.getParcelableExtra("card_info_extra")));
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        alif alif = this.f108677d;
        if (alif != null) {
            bundle.putParcelable("KEY_ACCOUNT_INFO", new AccountInfo(alif.mo40363a(), this.f108677d.mo40364b()));
        }
    }

    public final void onStart() {
        super.onStart();
        if (!isFinishing()) {
            this.f108681h = new atlg(this);
            rjx b = rjx.m33697b((Activity) this);
            rod a = b.mo24714a(this.f108681h, "tapAndPayDataChangedListener");
            rob rob = a.f43429b;
            sdo.m34966a(rob, "Key must not be null");
            b.mo24699a(new asnd(a, a), new asne(rob));
            rjx b2 = rjx.m33697b((Activity) this);
            android.app.Activity containerActivity = getContainerActivity();
            rkb rkb = b2.f43165D;
            rkb.mo24787a((rle) new asxf(rkb, containerActivity));
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        rpc.m34200a(rjx.m33697b((Activity) this).mo24698a(roe.m34171a(this.f108681h, "tapAndPayDataChangedListener")));
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        alic h = mo59412h();
        if (h != null) {
            h.mo40361a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo59407a(AccountInfo accountInfo) {
        Fragment fragment;
        if (getIntent().hasExtra("authAccount")) {
            String stringExtra = getIntent().getStringExtra("authAccount");
            if (accountInfo == null || !stringExtra.equals(accountInfo.f108326b)) {
                String[] a = soz.m35792a(soz.m35801d(this, getPackageName()));
                int i = 0;
                while (i < a.length) {
                    if (!a[i].equals(stringExtra)) {
                        i++;
                    } else {
                        mo59409a(a[i]);
                        return;
                    }
                }
            }
        }
        if (accountInfo != null) {
            this.f108676c = accountInfo;
            this.f108677d = m93124b(accountInfo);
            atlq atlq = this.f108678e;
            Intent intent = getIntent();
            if (intent == null || intent.getAction() == null) {
                fragment = aswe.m74918d();
            } else {
                atlx atlx = (atlx) atlq.f90454a.get(intent.getAction());
                if (atlx != null) {
                    fragment = atlx.mo50033a(intent);
                } else {
                    fragment = null;
                }
            }
            if (fragment == null) {
                bnsl bnsl = (bnsl) f108675b.mo68387b();
                bnsl.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "c", 438, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("No fragment found.");
                finishActivity(0);
                return;
            }
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.Root, fragment, "MAIN_VIEW").commitNowAllowingStateLoss();
            return;
        }
        String[] a2 = soz.m35792a(soz.m35801d(this, getPackageName()));
        if (a2.length == 0) {
            bnsl bnsl2 = (bnsl) f108675b.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "a", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("No accounts available");
            finish();
        }
        mo59409a(a2[0]);
    }

    /* renamed from: b */
    public final void mo59410b(String str) {
        if (!isFinishing()) {
            auar auar = new auar();
            auar.f91333a = 2000;
            auar.f91341i = this.f108676c;
            auar.f91334b = getString(C0126R.string.tp_account_selection_error_title);
            auar.f91335c = str;
            auar.f91337e = getString(C0126R.string.common_cancel);
            auar.f91336d = getString(C0126R.string.common_try_again);
            auar.f91340h = bpan.SELECT_ACCOUNT_ERROR;
            auar.mo50344a().show(getSupportFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo59408a(Exception exc) {
        bnsl bnsl = (bnsl) f108675b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "a", 429, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Could not retrieve accounts to set up fragment.");
        finish();
    }

    /* renamed from: a */
    public final void mo59409a(String str) {
        this.f108679f.mo24751i(str).mo9458a(new atld(this));
    }
}
