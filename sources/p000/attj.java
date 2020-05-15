package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Message;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attj extends atue {

    /* renamed from: a */
    public static final srn f90873a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    static final ComponentName f90874b = new ComponentName("com.felicanetworks.mfs", "com.felicanetworks.mfs.MobileFeliCaSettings");

    /* renamed from: c */
    public static boolean f90875c;

    /* renamed from: d */
    public static boolean f90876d;

    /* renamed from: e */
    rjx f90877e;

    public attj(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    private final void m76307a(atsy atsy, int i) {
        if (this.f90877e == null) {
            this.f90877e = rjx.m33697b((Activity) this.f90898f);
        }
        rjx rjx = this.f90877e;
        roz b = rpa.m34196b();
        b.f43472a = new asmt();
        rjx.mo24701a(b.mo24977a()).mo50374a(this.f90898f, new atth(this, atsy, i));
    }

    /* renamed from: b */
    private final void m76308b(atsy atsy) {
        int i;
        try {
            PackageInfo packageInfo = this.f90898f.getPackageManager().getPackageInfo(m76309d(), 4);
            if (!((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
                if (packageInfo.services == null) {
                    bnsl bnsl = (bnsl) f90873a.mo68388c();
                    bnsl.mo68432a("attj", "e", 326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("MFI Client is not installed");
                } else {
                    ServiceInfo[] serviceInfoArr = packageInfo.services;
                    int length = serviceInfoArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        if (!serviceInfoArr[i2].name.equals("com.felicanetworks.mfc.mfi.FelicaAdapter")) {
                            i2++;
                        }
                    }
                    bnsl bnsl2 = (bnsl) f90873a.mo68388c();
                    bnsl2.mo68432a("attj", "e", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("MFI Client does expose have Felica service, needs to be updated");
                }
                atgt a = atgt.m75868a(atsy.f90858u);
                if (a.f90321f == atgs.ID) {
                    i = C0126R.C0127drawable.tp_id_logo_color_199x129dp;
                } else {
                    i = C0126R.C0127drawable.tp_quicpay_logo_inset;
                }
                atqh atqh = new atqh();
                atqh.f90658a = i;
                atqh.f90661d = atsy.f90857t;
                atqh.f90662e = 14;
                TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
                atqh.f90659b = tokenizePanChimeraActivity.getString(C0126R.string.tp_felica_install_mfi_title, new Object[]{a.f90321f.mo49970a(tokenizePanChimeraActivity)});
                atqh.mo50118a(false);
                atqh.f90664g = mo50186b((int) C0126R.string.tp_felica_mfi_client_get_app);
                atqh.mo50117a().show(this.f90898f.getSupportFragmentManager(), "CheckSEInstallMfiDialogTag");
                return;
            }
            try {
                mo50182a(atup.m76401a(atsy.f90857t, atsy.f90861x, mo50185b(), atsy.f90858u));
            } catch (RemoteException e) {
                mo50187b(0, 2);
                mo50178a();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            bnsl bnsl3 = (bnsl) f90873a.mo68388c();
            bnsl3.mo68432a("attj", "e", 319, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("MFI Client is not installed");
        }
    }

    /* renamed from: d */
    private static String m76309d() {
        return !((Boolean) askd.f89119k.mo58455c()).booleanValue() ? "com.felicanetworks.mfm.main" : "com.google.android.gms.tapandpay.issuer.devapp";
    }

    /* renamed from: e */
    private final boolean m76310e() {
        try {
            PackageInfo packageInfo = this.f90898f.getPackageManager().getPackageInfo(m76309d(), 4);
            if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
                return true;
            }
            if (packageInfo.services == null) {
                bnsl bnsl = (bnsl) f90873a.mo68388c();
                bnsl.mo68432a("attj", "e", 326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("MFI Client is not installed");
                return false;
            }
            for (ServiceInfo serviceInfo : packageInfo.services) {
                if (serviceInfo.name.equals("com.felicanetworks.mfc.mfi.FelicaAdapter")) {
                    return true;
                }
            }
            bnsl bnsl2 = (bnsl) f90873a.mo68388c();
            bnsl2.mo68432a("attj", "e", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("MFI Client does expose have Felica service, needs to be updated");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl3 = (bnsl) f90873a.mo68388c();
            bnsl3.mo68432a("attj", "e", 319, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("MFI Client is not installed");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo50172a(int i) {
        if (i == 13 || i == 14) {
            mo50178a();
        }
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i2 != 13 && i2 != 14) {
            return;
        }
        if (i != -1) {
            atsy atsy = this.f90898f.f108906c;
            atsy.f90831W = 5;
            mo50180a(27, atsy);
        } else if (i2 != 13) {
            mo50181a(atvg.m76454a(this.f90898f, m76309d(), null, false), 15);
        } else {
            if (this.f90877e == null) {
                this.f90877e = rjx.m33697b((Activity) this.f90898f);
            }
            rjx rjx = this.f90877e;
            roz b = rpa.m34196b();
            b.f43472a = new asms();
            rjx.mo24732b(b.mo24977a()).mo50374a(this.f90898f, new atti(this));
        }
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i == 15) {
            m76308b(atsy);
        } else if (i == 1010) {
            if (i2 == -1) {
                bnsl bnsl = (bnsl) f90873a.mo68390d();
                bnsl.mo68432a("attj", "a", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Chip initialization succeeded");
                if (cgwn.m147269s()) {
                    mo50180a(31, atsy);
                } else {
                    mo50180a(11, atsy);
                }
            } else {
                bnsl bnsl2 = (bnsl) f90873a.mo68388c();
                bnsl2.mo68432a("attj", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Chip initialization failed");
                mo50189c();
            }
        }
    }

    /* renamed from: a */
    public final void mo50171a(Message message, atsy atsy) {
        if (message.what == 115) {
            bnsl bnsl = (bnsl) f90873a.mo68388c();
            bnsl.mo68432a("attj", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Chip is not initialized");
            f90876d = false;
            m76307a(atsy, 0);
        } else if (message.what == 19001) {
            int i = message.getData().getInt("data_felica_current_default");
            f90876d = true;
            m76307a(atsy, i);
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (!atgf.m75807a(this.f90898f).mo49940a() || !atbq.m75408a(atsy.f90858u)) {
            mo50180a(11, atsy);
        } else if (f90875c) {
            f90875c = false;
        } else {
            m76308b(atsy);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo50174a(aucb aucb) {
        if (aucb.mo50384b()) {
            atsy atsy = this.f90898f.f108906c;
            if (!f90876d) {
                Intent component = new Intent().setComponent(f90874b);
                if (this.f90898f.getPackageManager().queryIntentActivities(component, 0).isEmpty()) {
                    mo50189c();
                    return;
                }
                f90875c = true;
                mo50181a(component, 1010);
            } else if (cgwn.m147269s()) {
                mo50180a(31, atsy);
            } else {
                mo50180a(11, atsy);
            }
        } else {
            bnsl bnsl = (bnsl) f90873a.mo68387b();
            bnsl.mo68432a("attj", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while accepting Felica ToS");
            mo50178a();
        }
    }
}
