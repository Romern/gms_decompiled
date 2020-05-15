package p000;

import android.app.backup.BackupManager;
import android.os.Build;
import android.os.UserHandle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;

/* renamed from: aqhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqhk extends aqiv {

    /* renamed from: a */
    public aqje f86113a;

    /* renamed from: b */
    public aqje f86114b;

    /* renamed from: c */
    public aqje f86115c;

    /* renamed from: d */
    public aqjh f86116d;

    /* renamed from: e */
    final /* synthetic */ GoogleServicesChimeraActivity f86117e;

    /* renamed from: i */
    private bsqi f86118i = bsqi.f146642h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqhk(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_backup, 2, 1);
        this.f86117e = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        boolean booleanExtra = this.f86117e.getIntent().getBooleanExtra("suppress_backup_opt_in", false);
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86117e;
        this.f86116d = new aqjh(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107628f, googleServicesChimeraActivity.f107629g, googleServicesChimeraActivity.mo58959k(), booleanExtra, new BackupManager(this.f86117e));
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84090n());
        a.mo50373a(new aqhg(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84089m());
        a2.mo50373a(new aqhh(this));
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84087k());
        a3.mo50373a(new aqhi(this));
        return aucu.m76781a(a, a2, a3);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        boolean z;
        aqjh aqjh = this.f86116d;
        String l = cgll.f187253a.mo6606a().mo84088l();
        boolean z2 = aqjh.f86204e;
        if ("true".equals(l)) {
            return false;
        }
        if (!"false".equals(l) && z2) {
            return false;
        }
        sre.m36087g(aqjh.f86226g);
        if ((!cgll.f187253a.mo6606a().mo84069E() && aqjh.mo47915a()) || aqjh.f86203d == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (cglc.f187242a.mo6606a().mo84057a()) {
            z = aqjh.f86205f.isBackupServiceActive(UserHandle.of(UserHandle.myUserId()));
        } else {
            z = soz.m35811h(aqjh.f86226g);
        }
        if (!z) {
            return false;
        }
        if (!aqjh.f86201b && !aqjh.f86202c) {
            adyd a = adyd.m51363a(aqjh.f86226g);
            if (a.mo33916a("com.google").length + a.mo33916a("com.google.work").length + a.mo33916a("cn.google").length == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqhj(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        int i;
        GoogleServicesExpandableSwitchItem a = aqiv.m71684a(this.f86117e, C0126R.C0129id.section_backup_and_storage, !cgll.f187253a.mo6606a().mo84092p() ? C0126R.C0127drawable.quantum_ic_backup_vd_theme_24 : C0126R.C0127drawable.quantum_gm_ic_backup_vd_theme_24);
        aqje aqje = this.f86113a;
        if (aqje == null) {
            aqje = aqje.m71717a(this.f86116d.f86226g, !cclf.m130397b() ? C0126R.string.setupservices_google_services_backup_title : C0126R.string.setupservices_google_services_basic_backup_title);
        }
        a.f107646a = aqje;
        aqje aqje2 = this.f86114b;
        if (aqje2 == null) {
            aqjh aqjh = this.f86116d;
            aqjh.mo47920e();
            aqje2 = aqkg.m71752a(aqjh.f86226g, !aqjh.mo47915a() ? C0126R.array.setupservices_google_services_backup_v26_encrypted : C0126R.array.setupservices_google_services_backup_v26_with_photos_encrypted, aqjh.f86200a);
        }
        a.mo58961b(aqje2);
        aqje aqje3 = this.f86115c;
        if (aqje3 == null) {
            aqjh aqjh2 = this.f86116d;
            int i2 = Build.VERSION.SDK_INT;
            if (!aqjh2.mo47915a()) {
                i = C0126R.array.setupservices_google_services_backup_dialog_text;
            } else {
                i = C0126R.array.setupservices_google_services_backup_dialog_text_with_photos_v26;
            }
            aqje a2 = aqkg.m71752a(aqjh2.f86226g, i, aqjh2.f86200a);
            if (aqjh2.f86200a != aqkf.SIDEWINDER) {
                int i3 = Build.VERSION.SDK_INT;
                aqje3 = a2.mo47911a(aqje.m71717a(aqjh2.f86226g, (int) C0126R.string.setupservices_google_services_backup_dialog_text_app_data_v28)).mo47910a("\n\n", aqje.m71717a(aqjh2.f86226g, (int) C0126R.string.setupservices_google_services_backup_dialog_text_turn_off));
            } else {
                aqje3 = new aqje(TextUtils.expandTemplate(a2.f86194a, ""), a2.f86195b);
            }
        }
        a.mo58960a(aqje3);
        this.f86116d.mo47924a(new aqis(a));
        return a;
    }

    /* renamed from: a */
    public final void mo47889a(bsqv bsqv) {
        btuh btuh;
        bsrf bsrf = ((bsqw) bsqv.f164949b).f146701e;
        if (bsrf == null) {
            bsrf = bsrf.f146744d;
        }
        bsrg bsrg = bsrf.f146748c;
        if (bsrg == null) {
            bsrg = bsrg.f146749m;
        }
        bxvd bxvd = (bxvd) bsrg.mo74142c(5);
        bxvd.mo73625a((bxvk) bsrg);
        bsqi bsqi = this.f86118i;
        bxvd bxvd2 = (bxvd) bsqi.mo74142c(5);
        bxvd2.mo73625a((bxvk) bsqi);
        this.f86116d.mo47920e();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bsqi bsqi2 = (bsqi) bxvd2.f164949b;
        bsqi bsqi3 = bsqi.f146642h;
        bsqi2.f146644a |= 32;
        bsqi2.f146650g = true;
        boolean b = this.f86116d.mo47917b();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bsqi bsqi4 = (bsqi) bxvd2.f164949b;
        bsqi4.f146644a |= 4;
        bsqi4.f146647d = b;
        boolean a = this.f86116d.mo47915a();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bsqi bsqi5 = (bsqi) bxvd2.f164949b;
        bsqi5.f146644a |= 16;
        bsqi5.f146649f = a;
        int i = Build.VERSION.SDK_INT;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bsqi bsqi6 = (bsqi) bxvd2.f164949b;
        bsqi6.f146644a |= 2;
        bsqi6.f146646c = true;
        boolean c = this.f86116d.mo47918c();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bsqi bsqi7 = (bsqi) bxvd2.f164949b;
        bsqi7.f146644a |= 8;
        bsqi7.f146648e = c;
        bsqi bsqi8 = (bsqi) bxvd2.mo74062i();
        this.f86118i = bsqi8;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsrg bsrg2 = (bsrg) bxvd.f164949b;
        bsqi8.getClass();
        bsrg2.f146753c = bsqi8;
        bsrg2.f146751a |= 1;
        bssg bssg = (bssg) bssh.f146859b.mo74144da();
        bssl bssl = this.f86118i.f146645b;
        if (bssl == null) {
            bssl = bssl.f146873c;
        }
        int a2 = bssk.m116151a(bssl.f146876b);
        if (a2 != 0 && a2 == 2) {
            btuh = btuh.ANDROID_BACKUP_SETTING_TURNED_ON;
        } else {
            btuh = btuh.ANDROID_BACKUP_SETTING_TURNED_OFF;
        }
        bssg.mo70710a(btuh);
        boolean z = this.f86117e.mo58957g().getBoolean("is_setup_wizard", false);
        boolean z2 = this.f86117e.mo58957g().getBoolean("deferredSetup", false);
        if ((z && cgll.f187253a.mo6606a().mo84078b()) || ((z2 && cgll.f187253a.mo6606a().mo84077a()) || (!z && !z2 && cgll.f187253a.mo6606a().mo84079c()))) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsrg bsrg3 = (bsrg) bxvd.f164949b;
            bssh bssh = (bssh) bssg.mo74062i();
            bssh.getClass();
            bsrg3.f146762l = bssh;
            bsrg3.f146752b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        bsrf bsrf2 = ((bsqw) bsqv.f164949b).f146701e;
        if (bsrf2 == null) {
            bsrf2 = bsrf.f146744d;
        }
        bxvd bxvd3 = (bxvd) bsrf2.mo74142c(5);
        bxvd3.mo73625a((bxvk) bsrf2);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bsrf bsrf3 = (bsrf) bxvd3.f164949b;
        bsrg bsrg4 = (bsrg) bxvd.mo74062i();
        bsrg4.getClass();
        bsrf3.f146748c = bsrg4;
        bsrf3.f146746a |= 2;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bsrf bsrf4 = (bsrf) bxvd3.mo74062i();
        bsqw bsqw2 = bsqw.f146695g;
        bsrf4.getClass();
        bsqw.f146701e = bsrf4;
        bsqw.f146697a |= 4;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        int i;
        if (this.f86117e.mo58959k() != null) {
            bsqi bsqi = this.f86118i;
            bxvd bxvd = (bxvd) bsqi.mo74142c(5);
            bxvd.mo73625a((bxvk) bsqi);
            bxvd da = bssl.f146873c.mo74144da();
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssl bssl = (bssl) da.f164949b;
            bssl.f146876b = i - 1;
            bssl.f146875a |= 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqi bsqi2 = (bsqi) bxvd.f164949b;
            bssl bssl2 = (bssl) da.mo74062i();
            bsqi bsqi3 = bsqi.f146642h;
            bssl2.getClass();
            bsqi2.f146645b = bssl2;
            bsqi2.f146644a |= 1;
            this.f86118i = (bsqi) bxvd.mo74062i();
        }
        this.f86116d.mo47926f();
    }
}
