package p000;

import android.content.Intent;
import android.os.Debug;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: bdko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdko implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bdkp f105823a;

    /* renamed from: b */
    private final long f105824b;

    public bdko(bdkp bdkp, long j) {
        this.f105823a = bdkp;
        this.f105824b = j;
    }

    public final void run() {
        bdkp bdkp = this.f105823a;
        bnrt bnrt = bdkp.f105825a;
        long a = bdkp.f105835k.mo54417a();
        if (this.f105824b <= a) {
            this.f105823a.mo58125d();
            return;
        }
        bdkp bdkp2 = this.f105823a;
        Intent registerReceiver = bdkp2.f105827c.registerReceiver(null, bdkp2.f105834j);
        bdkp bdkp3 = this.f105823a;
        bxvd da = cimx.f190865e.mo74144da();
        cimy a2 = bdkp3.mo58123a(registerReceiver);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimx cimx = (cimx) da.f164949b;
        a2.getClass();
        cimx.f190868b = a2;
        cimx.f190867a |= 1;
        cimx cimx2 = (cimx) da.mo74062i();
        File e = this.f105823a.mo58126e();
        if (e != null) {
            this.f105823a.mo58127f();
            String absolutePath = e.getAbsolutePath();
            bdkp bdkp4 = this.f105823a;
            Debug.startMethodTracingSampling(absolutePath, bdkp4.f105829e, bdkp4.f105830f);
            bdkp bdkp5 = this.f105823a;
            bdkp bdkp6 = this.f105823a;
            bdkp5.f105837m = ((bqgk) bdkp5.f105828d.mo6445a()).mo25814a(new bdkn(bdkp6, e, cimx2, Float.valueOf(bdkp6.mo58124b(registerReceiver)), Long.valueOf(this.f105824b), Long.valueOf(a)), this.f105824b - a, TimeUnit.MILLISECONDS);
            return;
        }
        bnrq bnrq = (bnrq) bdkp.f105825a.mo68388c();
        bnrq.mo68432a("bdko", "run", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnrq.mo68405a("Can't create file, aborting method sampling");
    }
}
