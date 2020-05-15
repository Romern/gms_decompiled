package p000;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.backup.p032g1.restore.mms.StartMmsRestoreIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: mny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mny implements bqfp {

    /* renamed from: a */
    final /* synthetic */ StartMmsRestoreIntentOperation f34071a;

    public mny(StartMmsRestoreIntentOperation startMmsRestoreIntentOperation) {
        this.f34071a = startMmsRestoreIntentOperation;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        lvt lvt = lvt.f33072a;
        StartMmsRestoreIntentOperation startMmsRestoreIntentOperation = this.f34071a;
        if (startMmsRestoreIntentOperation.f29053b == null) {
            startMmsRestoreIntentOperation.f29053b = new mbx(startMmsRestoreIntentOperation);
        }
        mbx mbx = this.f34071a.f29053b;
        if (ccls.m130540s()) {
            bxvd a = lyu.m24685a();
            bxvd da = mse.f34525e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mse mse = (mse) da.f164949b;
            mse.f34528b = 1;
            mse.f34527a |= 1;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mse mse2 = (mse) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mse2.getClass();
            mqk.f34282E = mse2;
            mqk.f34285b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            mbx.f33384d = mbx.mo19820a();
            mbx.mo19833a(a, mqj.MMS_RESTORE, mbx.f33384d);
        }
        if (lvt.mo19668a(this.f34071a) != 1) {
            StartMmsRestoreIntentOperation.f29052a.mo25409a("MMS restore not enabled by user", new Object[0]);
            this.f34071a.f29053b.mo19841d(2);
        } else if (!lvt.mo19674c(this.f34071a)) {
            int i = Build.VERSION.SDK_INT;
            lvt.mo19671b(this.f34071a, true);
            Intent intent = new Intent();
            intent.setClassName(this.f34071a, "com.google.android.gms.backup.mms.MmsRestoreService");
            this.f34071a.startService(intent);
            if (ccls.m130527f()) {
                aebi aebi = new aebi();
                aebi.f63097i = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
                aebi.mo34004a(ccls.m130529h(), ccls.m130528g());
                aebi.f63099k = "com.google.android.gms.backup.g1.restore.REVIVE_SERVICE";
                aebi.f63102n = true;
                aeat.m51532a(this.f34071a).mo33984a(aebi.mo33974b());
            }
        } else {
            StartMmsRestoreIntentOperation.f29052a.mo25409a("MMS restore has already been finished", new Object[0]);
            this.f34071a.f29053b.mo19841d(3);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f34071a.f29053b.mo19841d(1);
    }
}
