package p000;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: muq */
public final /* synthetic */ class muq implements View.OnClickListener {

    /* renamed from: a */
    private final SetBackupAccountFlowChimeraActivity f34781a;

    public muq(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity) {
        this.f34781a = setBackupAccountFlowChimeraActivity;
    }

    public void onClick(View view) {
        SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity = this.f34781a;
        Account account = setBackupAccountFlowChimeraActivity.f29083d;
        if (ccmz.m130714b()) {
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.ANDROID_BACKUP_SET_ACCOUNT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf = (bsrf) da.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da2 = bsrg.f146749m.mo74144da();
            bsqi bsqi = setBackupAccountFlowChimeraActivity.f29082c;
            bxvd bxvd = (bxvd) bsqi.mo74142c(5);
            bxvd.mo73625a((bxvk) bsqi);
            bxvd da3 = bssl.f146873c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssl bssl = (bssl) da3.f164949b;
            bssl.f146876b = 1;
            bssl.f146875a |= 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqi bsqi2 = (bsqi) bxvd.f164949b;
            bssl bssl2 = (bssl) da3.mo74062i();
            bsqi bsqi3 = bsqi.f146642h;
            bssl2.getClass();
            bsqi2.f146645b = bssl2;
            bsqi2.f146644a |= 1;
            boolean b = myg.m25745b(setBackupAccountFlowChimeraActivity);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqi bsqi4 = (bsqi) bxvd.f164949b;
            bsqi4.f146644a |= 16;
            bsqi4.f146649f = b;
            setBackupAccountFlowChimeraActivity.f29082c = (bsqi) bxvd.mo74062i();
            bsqi bsqi5 = setBackupAccountFlowChimeraActivity.f29082c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrg bsrg = (bsrg) da2.f164949b;
            bsqi5.getClass();
            bsrg.f146753c = bsqi5;
            bsrg.f146751a |= 1;
            bssg bssg = (bssg) bssh.f146859b.mo74144da();
            bssg.mo70710a(btuh.ANDROID_BACKUP_SET_ACCOUNT);
            bssh bssh = (bssh) bssg.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrg bsrg2 = (bsrg) da2.f164949b;
            bssh.getClass();
            bsrg2.f146762l = bssh;
            bsrg2.f146752b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf2 = (bsrf) da.f164949b;
            bsrg bsrg3 = (bsrg) da2.mo74062i();
            bsrg3.getClass();
            bsrf2.f146748c = bsrg3;
            bsrf2.f146746a |= 2;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw = (bsqw) bsqv.f164949b;
            bsrf bsrf3 = (bsrf) da.mo74062i();
            bsrf3.getClass();
            bsqw.f146701e = bsrf3;
            bsqw.f146697a |= 4;
            bxvd da4 = bssm.f146877d.mo74144da();
            bsmx bsmx = bsmx.ANDROID_BACKUP_SET_BACKUP_ACCOUNT_FLOW;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bssm bssm = (bssm) da4.f164949b;
            bssm.f146880b = bsmx.f145962iC;
            bssm.f146879a |= 1;
            bxvd da5 = bssi.f146862i.mo74144da();
            bsqo c = setBackupAccountFlowChimeraActivity.mo17246c();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bssi bssi = (bssi) da5.f164949b;
            c.getClass();
            bssi.f146867d = c;
            bssi.f146864a |= 32;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bssm bssm2 = (bssm) da4.f164949b;
            bssi bssi2 = (bssi) da5.mo74062i();
            bssi2.getClass();
            bssm2.f146881c = bssi2;
            bssm2.f146879a |= 8;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw2 = (bsqw) bsqv.f164949b;
            bssm bssm3 = (bssm) da4.mo74062i();
            bssm3.getClass();
            bsqw2.f146702f = bssm3;
            bsqw2.f146697a |= 8;
            max.m24779a(setBackupAccountFlowChimeraActivity.getApplicationContext(), bsqv, account).mo50371a(muv.f34786a);
        }
        myg.m25741a(setBackupAccountFlowChimeraActivity, setBackupAccountFlowChimeraActivity.f29082c);
        if (!skh.m35531a().mo25690a(setBackupAccountFlowChimeraActivity, new Intent().setClassName(setBackupAccountFlowChimeraActivity, "com.google.android.gms.backup.BackupAccountManagerService"), new mux(setBackupAccountFlowChimeraActivity, "backup", account), 1)) {
            SetBackupAccountFlowChimeraActivity.f29080a.mo25418e("Cannot connect to BackupAccountManagerService.", new Object[0]);
            setBackupAccountFlowChimeraActivity.finishAndRemoveTask();
        }
    }
}
