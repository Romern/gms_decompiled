package p000;

import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bdwm */
public final /* synthetic */ class bdwm implements bmxj {

    /* renamed from: a */
    private final bdwt f106532a;

    /* renamed from: b */
    private final bdqz f106533b;

    /* renamed from: c */
    private final bdqu f106534c;

    /* renamed from: d */
    private final TimeUnit f106535d;

    /* renamed from: e */
    private final long f106536e;

    /* renamed from: f */
    private final int f106537f;

    /* renamed from: g */
    private final File f106538g;

    public bdwm(bdwt bdwt, bdqz bdqz, bdqu bdqu, TimeUnit timeUnit, long j, int i, File file) {
        this.f106532a = bdwt;
        this.f106533b = bdqz;
        this.f106534c = bdqu;
        this.f106535d = timeUnit;
        this.f106536e = j;
        this.f106537f = i;
        this.f106538g = file;
    }

    public final Object apply(Object obj) {
        bdwt bdwt = this.f106532a;
        bdqz bdqz = this.f106533b;
        bdqu bdqu = this.f106534c;
        TimeUnit timeUnit = this.f106535d;
        long j = this.f106536e;
        int i = this.f106537f;
        File file = this.f106538g;
        ayte ayte = bdwt.f106549a;
        Executor executor = bdwt.f106550b;
        long millis = timeUnit.toMillis(j);
        abry abry = bdwt.f106553e;
        bmzi a = bmzn.m108681a((bmzi) new bdwq(bdwt, file));
        bdrl bdrl = bdwt.f106554f;
        bdrl.getClass();
        bdwr bdwr = new bdwr(bdrl);
        bdwt.f106553e.getClass();
        return new bdxj(bdqz, (bdxl) obj, executor, bdqu, millis, i, a, new bdrp(bdwr, new bdws(), bdqu));
    }
}
