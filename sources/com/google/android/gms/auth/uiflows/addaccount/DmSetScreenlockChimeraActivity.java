package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DmSetScreenlockChimeraActivity extends jxx implements bjbh, rrh {

    /* renamed from: a */
    public static final sek f11365a = ght.m13171a("DmSetScreenlockChimeraActivity");

    /* renamed from: b */
    static final imr f11366b = imr.m15727a("account");

    /* renamed from: c */
    rri f11367c;

    /* renamed from: d */
    private final ios f11368d = inl.m15759a(rpr.m34216b());

    /* renamed from: e */
    private final jvo f11369e = jvo.m17402a();

    /* renamed from: a */
    public static Intent m6961a(Context context, Account account, boolean z, rrq rrq) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity");
        ims ims = new ims();
        imr imr = f11366b;
        sdo.m34959a(account);
        ims.mo13148b(imr, account);
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z));
        ims.mo13148b(jwz.f23428i, rrq.mo25045a());
        return className.putExtras(ims.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "DmSetScreenlockActivity";
    }

    /* renamed from: c */
    public final void mo7860c() {
        rri rri = this.f11367c;
        if (rri != null) {
            rri.dismissAllowingStateLoss();
        }
        this.f11367c = rri.m34289a(getString(C0126R.string.auth_device_management_screenlock_skip_message), getString(C0126R.string.auth_common_switch_accounts), getString(C0126R.string.auth_common_go_back), false);
        getSupportFragmentManager().beginTransaction().add(this.f11367c, "skip dialog").commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            mo7874a(-1, (Intent) null);
        }
    }

    public final void onBackPressed() {
        mo7860c();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new adzt();
        int i = Build.VERSION.SDK_INT;
        if (((KeyguardManager) getSystemService("keyguard")).isDeviceSecure()) {
            if (gnv.m13495E()) {
                jvo jvo = this.f11369e;
                synchronized (jvo.f23374b) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = jvo.f23373a;
                    if (j != -1) {
                        if (elapsedRealtime > j + 30000) {
                        }
                    }
                    jvo.f23373a = elapsedRealtime;
                    f11365a.mo25412b("Screenlock present. Initiating CryptAuth Registration.", new Object[0]);
                    aucb a = this.f11368d.mo13178a(9, Arrays.asList("authzen", "PublicKey"), "ForceRegistration", (Account) getIntent().getParcelableExtra(f11366b.f21366a), null);
                    a.mo50373a(new jvt());
                    a.mo50370a(new jvs());
                    a.mo50372a(new jvr());
                }
            }
            mo7874a(2, (Intent) null);
        }
        rrr a2 = rrr.m34310a(this, !rrp.m34306a(mo14203f().f43552a) ? C0126R.C0128layout.auth_device_management_screenlock : C0126R.C0128layout.auth_device_management_screenlock_glif);
        setContentView(a2.mo25046a());
        String string = getString(C0126R.string.common_skip);
        String string2 = getString(C0126R.string.common_next);
        if (a2.mo25046a() instanceof SetupWizardLayout) {
            NavigationBar c = ((SetupWizardLayout) a2.mo25046a()).mo71377c();
            c.mo71422a((bjbh) this);
            Button button = c.f151534b;
            button.setCompoundDrawables(null, null, null, null);
            Button button2 = c.f151533a;
            button.setText(string);
            button.setContentDescription(string);
            button2.setText(string2);
            button2.setContentDescription(string2);
        } else {
            biyn biyn = (biyn) ((GlifLayout) a2.mo25046a().findViewById(C0126R.C0129id.setup_wizard_layout)).mo71342a(biyn.class);
            biyo biyo = new biyo(this);
            biyo.mo64883a(C0126R.string.common_next);
            biyo.f122327b = new jvp(this);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            biyn.mo52733a(biyo.mo64882a());
            biyo biyo2 = new biyo(this);
            biyo2.mo64883a(C0126R.string.common_skip);
            biyo2.f122327b = new jvq(this);
            biyo2.f122328c = 7;
            biyo2.f122329d = 2132018230;
            biyn.mo52735b(biyo2.mo64882a());
        }
        setTitle(((Account) mo14202g().mo13146a(f11366b)).name);
        a2.mo25047a(getTitle());
        rrp.m34302a(a2.mo25046a());
        this.f11367c = (rri) getSupportFragmentManager().findFragmentByTag("skip dialog");
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        mo7860c();
    }

    /* renamed from: a */
    public final void mo7768a() {
        int i = Build.VERSION.SDK_INT;
        startActivityForResult(new Intent("android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD"), 1);
    }

    /* renamed from: a */
    public final void mo7754a(rri rri, int i) {
        if (i == 1 && this.f11367c == rri) {
            mo7874a(1, (Intent) null);
        }
    }
}
