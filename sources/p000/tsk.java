package p000;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: tsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsk implements tsm {

    /* renamed from: a */
    public adcc f46590a;

    /* renamed from: b */
    public String f46591b;

    /* renamed from: c */
    public int f46592c;

    /* renamed from: d */
    public tsp f46593d;

    /* renamed from: e */
    public Fragment f46594e;

    /* renamed from: f */
    public String f46595f;

    /* renamed from: g */
    public boolean f46596g;

    /* renamed from: d */
    private final void m37435d() {
        tsp tsp = this.f46593d;
        if (tsp.f46600b.mo26760d()) {
            tsp.f46601c.mo2450b((Object) true);
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) tsp.getContext().getSystemService("keyguard");
        if (keyguardManager == null) {
            bnsl bnsl = (bnsl) tsp.f46599a.mo68388c();
            bnsl.mo68432a("tsp", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get the KeyguardManager service.");
            return;
        }
        Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(null, null);
        if (createConfirmDeviceCredentialIntent != null) {
            tsp.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
            return;
        }
        C1349sg sgVar = new C1349sg(tsp.getContext());
        sgVar.mo15912d(C0126R.string.pwm_reset_saved_password_description);
        sgVar.mo15906b((int) C0126R.string.common_settings, new tsn(tsp));
        sgVar.mo15892a((int) C0126R.string.common_cancel, new tso(tsp));
        sgVar.mo15910c();
    }

    /* renamed from: a */
    public final void mo26764a() {
        this.f46596g = true;
        m37435d();
    }

    /* renamed from: b */
    public final void mo26769b() {
        mo26768a(false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r0.equals("PWMHomeScreenFragment") != false) goto L_0x0075;
     */
    /* renamed from: c */
    public final int mo26770c() {
        if (!cdpx.m134644b()) {
            return 1;
        }
        if (this.f46590a.getSupportFragmentManager().getBackStackEntryCount() <= 0) {
            return 8;
        }
        char c = 0;
        String name = this.f46590a.getSupportFragmentManager().getBackStackEntryAt(0).getName();
        switch (name.hashCode()) {
            case -2032272560:
                if (name.equals("PWMPickerScreenFragment")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1607475359:
                break;
            case -1426523134:
                if (name.equals("PWMCredEditScrnFrgmnt")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 833118884:
                if (name.equals("PWMEnhProtScrnFrgmnt")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1129855885:
                if (name.equals("PWMSettingsScreenFrgmnt")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1826972394:
                if (name.equals("PWMSearchScreenFragment")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1931998940:
                if (name.equals("PWMAffiliatedGroupDetailsScreenFragment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new IllegalStateException("The given target screen is undefined.");
        }
    }

    /* renamed from: a */
    public final void mo26765a(int i) {
        mo26766a(i, false);
    }

    /* renamed from: a */
    public final void mo26766a(int i, boolean z) {
        int i2 = i - 1;
        if (i2 == 0) {
            String str = this.f46591b;
            tud tud = new tud();
            Bundle bundle = new Bundle();
            bundle.putString("pwm.DataFieldNames.accountName", str);
            tud.setArguments(bundle);
            this.f46594e = tud;
            this.f46595f = "PWMHomeScreenFragment";
            if (!cdpx.m134644b()) {
                this.f46590a.getSupportFragmentManager().beginTransaction().replace(this.f46592c, this.f46594e, this.f46595f).setTransition(0).commit();
                return;
            }
        } else if (i2 == 1) {
            String str2 = this.f46591b;
            tui tui = new tui();
            Bundle bundle2 = new Bundle();
            bundle2.putString("pwm.DataFieldNames.accountName", str2);
            tui.setArguments(bundle2);
            this.f46594e = tui;
            this.f46595f = "PWMSearchScreenFragment";
        } else if (i2 != 2) {
            if (i2 == 3) {
                String str3 = this.f46591b;
                Bundle bundle3 = new Bundle();
                bundle3.putString("pwm.DataFieldNames.accountName", str3);
                ttb ttb = new ttb();
                ttb.setArguments(bundle3);
                this.f46594e = ttb;
                this.f46595f = "PWMAffiliatedGroupDetailsScreenFragment";
            } else if (i2 == 4) {
                this.f46594e = ttp.m37464a(this.f46591b);
                this.f46595f = "PWMCredEditScrnFrgmnt";
            } else if (i2 != 5) {
                String str4 = this.f46591b;
                Bundle bundle4 = new Bundle();
                bundle4.putString("pwm.DataFieldNames.accountName", str4);
                tts tts = new tts();
                tts.setArguments(bundle4);
                this.f46594e = tts;
                this.f46595f = "PWMEnhProtScrnFrgmnt";
            } else {
                String str5 = this.f46591b;
                tuf tuf = new tuf();
                Bundle bundle5 = new Bundle();
                bundle5.putString("pwm.DataFieldNames.accountName", str5);
                tuf.setArguments(bundle5);
                this.f46594e = tuf;
                this.f46595f = "PWMPickerScreenFragment";
            }
            int i3 = Build.VERSION.SDK_INT;
            m37435d();
            return;
        } else {
            String str6 = this.f46591b;
            tul tul = new tul();
            Bundle bundle6 = new Bundle();
            bundle6.putString("pwm.DataFieldNames.accountName", str6);
            tul.setArguments(bundle6);
            this.f46594e = tul;
            this.f46595f = "PWMSettingsScreenFrgmnt";
        }
        mo26767a(this.f46594e, this.f46595f, z);
    }

    /* renamed from: a */
    public final void mo26767a(Fragment fragment, String str, boolean z) {
        FragmentTransaction addToBackStack = this.f46590a.getSupportFragmentManager().beginTransaction().replace(this.f46592c, fragment, str).addToBackStack(str);
        boolean b = cdpx.m134644b();
        int i = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        if (b && z) {
            i = 0;
        }
        addToBackStack.setTransition(i).commit();
    }

    /* renamed from: a */
    public final void mo26768a(boolean z) {
        int backStackEntryCount = this.f46590a.getSupportFragmentManager().getBackStackEntryCount();
        if (backStackEntryCount != cdpx.m134644b()) {
            Fragment findFragmentByTag = this.f46590a.getSupportFragmentManager().findFragmentByTag(this.f46590a.getSupportFragmentManager().getBackStackEntryAt(backStackEntryCount - 1).getName());
            if (z || !(findFragmentByTag instanceof tut) || !((tut) findFragmentByTag).mo26792a()) {
                this.f46590a.getWindow().setFlags(0, 8192);
                this.f46590a.getSupportFragmentManager().popBackStack();
                return;
            }
            return;
        }
        this.f46590a.setResult(0);
        this.f46590a.finish();
    }
}
