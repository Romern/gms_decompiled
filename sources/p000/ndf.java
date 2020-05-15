package p000;

import com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.sql.Timestamp;

/* renamed from: ndf */
public final /* synthetic */ class ndf implements Runnable {

    /* renamed from: a */
    private final MmsRestoreChimeraService f35333a;

    public ndf(MmsRestoreChimeraService mmsRestoreChimeraService) {
        this.f35333a = mmsRestoreChimeraService;
    }

    public final void run() {
        long j;
        MmsRestoreChimeraService mmsRestoreChimeraService = this.f35333a;
        mmsRestoreChimeraService.f29246a.mo19847b("com.android.providers.telephony").delete();
        File file = mmsRestoreChimeraService.f29246a.f33397b;
        new File(file, "restore_token_file").delete();
        new File(file, "@pm@").delete();
        lvt.f33072a.mo19673c(mmsRestoreChimeraService, true);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (mmsRestoreChimeraService.f29247b != null) {
            j = timestamp.getTime() - mmsRestoreChimeraService.f29247b.getTime();
        } else {
            j = 0;
        }
        mbx mbx = mmsRestoreChimeraService.f29248c;
        long j2 = j / 1000;
        if (ccls.m130540s()) {
            bxvd a = lyu.m24685a();
            bxvd da = mse.f34525e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mse mse = (mse) da.f164949b;
            mse.f34528b = 3;
            int i = 1 | mse.f34527a;
            mse.f34527a = i;
            mse.f34527a = i | 2;
            mse.f34529c = j2;
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
            mbx.mo19833a(a, mqj.MMS_RESTORE, mbx.f33384d);
        }
        new mas(mmsRestoreChimeraService, "com.android.providers.telephony", new lvp(mmsRestoreChimeraService)).mo19813a(new ndg(mmsRestoreChimeraService));
    }
}
