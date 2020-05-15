package p000;

import android.app.job.JobParameters;
import com.google.android.gms.backup.transport.component.GmsBackupSchedulerChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: naj */
public final /* synthetic */ class naj implements Runnable {

    /* renamed from: a */
    private final GmsBackupSchedulerChimeraService f35133a;

    /* renamed from: b */
    private final nak f35134b;

    /* renamed from: c */
    private final JobParameters f35135c;

    public naj(GmsBackupSchedulerChimeraService gmsBackupSchedulerChimeraService, nak nak, JobParameters jobParameters) {
        this.f35133a = gmsBackupSchedulerChimeraService;
        this.f35134b = nak;
        this.f35135c = jobParameters;
    }

    public final void run() {
        GmsBackupSchedulerChimeraService gmsBackupSchedulerChimeraService = this.f35133a;
        nak nak = this.f35134b;
        JobParameters jobParameters = this.f35135c;
        boolean b = GmsBackupSchedulerChimeraService.m22013b(gmsBackupSchedulerChimeraService);
        boolean c = ccli.m130403c();
        boolean g = ccli.m130407g();
        boolean j = ccli.f179330a.mo6606a().mo76277j();
        GmsBackupSchedulerChimeraService.f29226a.mo25414c("Requesting backup of all packages.", new Object[0]);
        lsi a = lsh.m24339a(gmsBackupSchedulerChimeraService);
        lsj lsj = new lsj();
        lsj.f32838a = b;
        lsj.f32839b = g;
        lsj.f32840c = c;
        lsj.f32841d = ccli.f179330a.mo6606a().mo76276i();
        lsj.f32842e = j;
        a.mo19586a(lsj.mo19587a());
        bxvd a2 = lyu.m24685a();
        bxvd da = mrp.f34462i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mrp mrp = (mrp) da.f164949b;
        int i = mrp.f34464a | 1;
        mrp.f34464a = i;
        mrp.f34465b = true;
        int i2 = i | 2;
        mrp.f34464a = i2;
        mrp.f34466c = true;
        int i3 = i2 | 4;
        mrp.f34464a = i3;
        mrp.f34467d = true;
        int i4 = i3 | 8;
        mrp.f34464a = i4;
        mrp.f34468e = b;
        int i5 = i4 | 16;
        mrp.f34464a = i5;
        mrp.f34469f = c;
        int i6 = i5 | 32;
        mrp.f34464a = i6;
        mrp.f34470g = g;
        mrp.f34464a = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mrp.f34471h = j;
        if (a2.f164950c) {
            a2.mo74035c();
            a2.f164950c = false;
        }
        mqk mqk = (mqk) a2.f164949b;
        mrp mrp2 = (mrp) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mrp2.getClass();
        mqk.f34308y = mrp2;
        mqk.f34284a |= Integer.MIN_VALUE;
        nak.mo20409a((mqk) a2.mo74062i(), mqj.GMS_BACKUP_RUN);
        GmsBackupSchedulerChimeraService.m22012a(gmsBackupSchedulerChimeraService);
        gmsBackupSchedulerChimeraService.jobFinished(jobParameters, false);
    }
}
