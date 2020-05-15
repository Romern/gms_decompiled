package com.google.android.gms.smartdevice.magicwand;

import android.accounts.Account;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MagicWandChimeraActivity extends deu implements arzd, aryz, arzw, asas, arsa {

    /* renamed from: b */
    private static final sek f108075b = ascp.m73787a("magicwand", "MagicWandChimeraActivity");

    /* renamed from: c */
    private Account f108076c;

    /* renamed from: d */
    private boolean f108077d;

    /* renamed from: e */
    private String f108078e;

    /* renamed from: f */
    private boolean f108079f;

    /* renamed from: g */
    private boolean f108080g;

    /* renamed from: a */
    private final void m92774a(Fragment fragment) {
        if (fragment.getClass() == arsb.class) {
            getSupportFragmentManager().beginTransaction().add(fragment, "assertion_fragment").commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, fragment).commit();
        }
    }

    /* renamed from: n */
    private final Fragment m92775n() {
        return arzf.m73710a(getString(C0126R.string.smartdevice_magicwand_confirm_signin), getString(C0126R.string.smartdevice_magicwand_lockscreen_verification_text), getString(C0126R.string.smartdevice_magicwand_lockscreen_description), null, C0126R.C0127drawable.googlelogo_standard_color_92x36, true);
    }

    /* renamed from: o */
    private final Fragment m92776o() {
        return arzy.m73719a(getString(C0126R.string.common_choose_account_label), true, false, aqzm.WEAR);
    }

    /* renamed from: p */
    private final Fragment m92777p() {
        return arzy.m73719a(getString(C0126R.string.smartdevice_magicwand_consent_title), true, true, aqzm.WEAR);
    }

    /* renamed from: b */
    public final void mo48785b() {
        f108075b.mo25412b("onAsssertionFailure", new Object[0]);
        m92774a(asat.m73744a(1, getString(C0126R.string.common_login_error_title), getString(C0126R.string.smartdevice_magicwand_error_detail), getString(C0126R.string.common_cancel), true));
    }

    /* renamed from: e */
    public final void mo48956e() {
        f108075b.mo25412b("onFingerprintAuthSuccess", new Object[0]);
        this.f108077d = true;
        m92774a(this.f108076c == null ? m92776o() : m92777p());
    }

    /* renamed from: g */
    public final void mo48960g() {
        f108075b.mo25412b("onScreenUnlocked", new Object[0]);
        this.f108077d = true;
        this.f108079f = false;
        m92774a(this.f108076c == null ? m92776o() : m92777p());
    }

    /* renamed from: h */
    public final void mo48961h() {
        f108075b.mo25412b("onScreenLockFailed", new Object[0]);
        this.f108079f = false;
    }

    /* renamed from: i */
    public final void mo48962i() {
        f108075b.mo25412b("onScreenLockSkipped", new Object[0]);
        this.f108079f = false;
        onBackPressed();
    }

    /* renamed from: j */
    public final void mo48963j() {
        f108075b.mo25412b("onPrepareScreenLock", new Object[0]);
        this.f108079f = true;
    }

    /* renamed from: k */
    public final void mo48957k() {
        f108075b.mo25412b("onFingerprintAuthFail", new Object[0]);
        m92774a(m92775n());
    }

    /* renamed from: l */
    public final void mo48958l() {
        f108075b.mo25412b("onFingerprintCancel", new Object[0]);
        onBackPressed();
    }

    /* renamed from: m */
    public final void mo48980m() {
    }

    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        f108075b.mo25412b("onCreate", new Object[0]);
        if (!cgqi.f187508a.mo6606a().mo84277a()) {
            f108075b.mo25418e("Magic Wand is currently not enabled.", new Object[0]);
            finish();
        }
        setRequestedOrientation(1);
        Uri data = getIntent().getData();
        if (data == null) {
            f108075b.mo25412b("Missing Intent data.", new Object[0]);
            finish();
        } else {
            String scheme = data.getScheme();
            String authority = data.getAuthority();
            String path = data.getPath();
            f108075b.mo25412b(String.format("%s\n\t%s: %s\n\t%s: %s\n\t%s: %s", "Recieved deeplink of form", "scheme", scheme, "authority", authority, "path", path), new Object[0]);
            if (path != null) {
                if ("g.co".equals(authority) && path.startsWith("/auth/1/")) {
                    this.f108078e = path.substring(8);
                } else if ("google.magicwand".equals(scheme) && "1".equals(authority)) {
                    this.f108078e = path.substring(1);
                }
            }
            f108075b.mo25412b(String.format("Received malformed deeplink: %s", data.toString()), new Object[0]);
            finish();
        }
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        if (bundle == null) {
            if (getSupportFragmentManager().findFragmentByTag("assertion_fragment") == null) {
                m92774a(new arsb());
            }
            List a = asbt.m73759a(this);
            if (a.size() == 1) {
                Account account = (Account) a.get(0);
                this.f108076c = account;
                sek sek = f108075b;
                String valueOf = String.valueOf(account.name);
                sek.mo25414c(valueOf.length() == 0 ? new String("Auto selecting only account: ") : "Auto selecting only account: ".concat(valueOf), new Object[0]);
            }
            int i = Build.VERSION.SDK_INT;
            if (aqxm.m72201b() && arza.m73699a(this)) {
                fragment = arza.m73698a(getString(C0126R.string.smartdevice_magicwand_confirm_signin), getString(C0126R.string.smartdevice_magicwand_fingerprint_detail), true);
            } else if (!arze.m73708a(this)) {
                fragment = m92775n();
            } else {
                fragment = this.f108076c == null ? m92776o() : m92777p();
            }
            getSupportFragmentManager().beginTransaction().add((int) C0126R.C0129id.fragment_container, fragment).commit();
        }
    }

    public final void onPause() {
        super.onPause();
        f108075b.mo25412b("onPause", new Object[0]);
        if (!isChangingConfigurations() && !this.f108079f) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo48784a() {
        f108075b.mo25412b("onAssertionSuccess", new Object[0]);
        m92774a(asat.m73744a(0, getString(C0126R.string.common_login_activity_task_title), getString(C0126R.string.smartdevice_magicwand_success_detail), getString(C0126R.string.common_ok), false));
        new adzt().postDelayed(new arsc(this), 2000);
    }

    /* renamed from: b */
    public final void mo48979b(arzx arzx) {
        f108075b.mo25412b("onNoAccountSelected", new Object[0]);
    }

    /* renamed from: a */
    public final void mo49010a(int i) {
        f108075b.mo25412b("onNextButtonClicked", new Object[0]);
        if (i == 1) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo48978a(arzx arzx) {
        f108075b.mo25412b("onAccountSelected", new Object[0]);
        Account account = arzx.f88548a;
        if (account == null) {
            f108075b.mo25412b("No account selected", new Object[0]);
            finish();
        } else if (!this.f108080g) {
            arsb arsb = (arsb) getSupportFragmentManager().findFragmentByTag("assertion_fragment");
            sdo.m34959a(arsb);
            arsb.f88215d = arsb.f88213b.mo25819b(new arry(arsb, this.f108078e, account, this.f108077d));
            bqga.m112781a(arsb.f88215d, new arrz(arsb), new sty(Looper.getMainLooper()));
            this.f108080g = true;
        }
    }
}
