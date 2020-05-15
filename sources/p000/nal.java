package p000;

import android.app.job.JobParameters;
import android.content.Intent;
import com.google.android.gms.backup.transport.component.MmsBackupSchedulerChimeraService;

/* renamed from: nal */
public final /* synthetic */ class nal implements Runnable {

    /* renamed from: a */
    private final MmsBackupSchedulerChimeraService f35138a;

    /* renamed from: b */
    private final nam f35139b;

    /* renamed from: c */
    private final JobParameters f35140c;

    public nal(MmsBackupSchedulerChimeraService mmsBackupSchedulerChimeraService, nam nam, JobParameters jobParameters) {
        this.f35138a = mmsBackupSchedulerChimeraService;
        this.f35139b = nam;
        this.f35140c = jobParameters;
    }

    public final void run() {
        MmsBackupSchedulerChimeraService mmsBackupSchedulerChimeraService = this.f35138a;
        nam nam = this.f35139b;
        JobParameters jobParameters = this.f35140c;
        MmsBackupSchedulerChimeraService.m22015a(mmsBackupSchedulerChimeraService);
        boolean b = MmsBackupSchedulerChimeraService.m22016b(mmsBackupSchedulerChimeraService);
        boolean m = ccls.m130534m();
        boolean l = ccls.m130533l();
        long k = ccls.m130532k();
        MmsBackupSchedulerChimeraService.f29230a.mo25409a("Requesting backup of mms.", new Object[0]);
        Intent intent = new Intent();
        intent.setClassName(mmsBackupSchedulerChimeraService, "com.google.android.gms.backup.mms.MmsBackupService");
        mmsBackupSchedulerChimeraService.startService(intent);
        bxvd a = lyu.m24685a();
        bxvd da = msa.f34506g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msa msa = (msa) da.f164949b;
        int i = msa.f34508a | 1;
        msa.f34508a = i;
        msa.f34509b = true;
        int i2 = i | 2;
        msa.f34508a = i2;
        msa.f34510c = b;
        int i3 = i2 | 4;
        msa.f34508a = i3;
        msa.f34511d = m;
        int i4 = i3 | 8;
        msa.f34508a = i4;
        msa.f34512e = l;
        msa.f34508a = i4 | 16;
        msa.f34513f = k;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msa msa2 = (msa) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msa2.getClass();
        mqk.f34279B = msa2;
        mqk.f34285b |= 32;
        nam.mo20411a((mqk) a.mo74062i(), mqj.MMS_BACKUP_RUN);
        mmsBackupSchedulerChimeraService.jobFinished(jobParameters, false);
    }
}
