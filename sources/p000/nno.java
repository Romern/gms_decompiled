package p000;

import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: nno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nno implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bpdn f36103a;

    /* renamed from: b */
    final /* synthetic */ bpdo f36104b;

    /* renamed from: c */
    final /* synthetic */ String f36105c;

    /* renamed from: d */
    final /* synthetic */ noj f36106d;

    public nno(noj noj, bpdn bpdn, bpdo bpdo, String str) {
        this.f36106d = noj;
        this.f36103a = bpdn;
        this.f36104b = bpdo;
        this.f36105c = str;
    }

    public final void run() {
        Integer num;
        noj noj = this.f36106d;
        bnsn bnsn = noj.f36155b;
        if (noj.f36231r != 0 || this.f36103a != bpdn.NO_LAUNCHER) {
            bnsi c = noj.f36155b.mo68388c();
            c.mo68432a("nno", "run", 831, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            Integer valueOf = Integer.valueOf(this.f36103a.f136282v);
            bpdo bpdo = this.f36104b;
            if (bpdo != null) {
                num = Integer.valueOf(bpdo.f136351ap);
            } else {
                num = null;
            }
            c.mo68425a("Critical error %d detail: %d msg: %s", valueOf, num, this.f36105c);
            if (this.f36106d.mo21257T()) {
                niw niw = this.f36106d.f36168M;
                bpdn bpdn = this.f36103a;
                bpdo bpdo2 = this.f36104b;
                bmxy.m108582a(bpdn, "errorCode is necessary");
                bxvd da = bpdp.f136352f.mo74144da();
                int i = bpdn.f136282v;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpdp bpdp = (bpdp) da.f164949b;
                int i2 = bpdp.f136354a | 1;
                bpdp.f136354a = i2;
                bpdp.f136355b = i;
                int i3 = bpdo2.f136351ap;
                bpdp.f136354a = i2 | 2;
                bpdp.f136356c = i3;
                bpdp bpdp2 = (bpdp) da.mo74062i();
                nja nja = (nja) niw;
                bxvd c2 = nja.mo20870c();
                if (c2.f164950c) {
                    c2.mo74035c();
                    c2.f164950c = false;
                }
                bpcl bpcl = (bpcl) c2.f164949b;
                bpcl bpcl2 = bpcl.f135759L;
                bpdp2.getClass();
                bpcl.f135787o = bpdp2;
                bpcl.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                nja.mo20868a(c2, 42);
                bpdn bpdn2 = this.f36103a;
                bmxy.m108582a(bpdn2, "errorCode is necessary");
                int i4 = bpdn2.f136282v;
                if (i4 > 0 && i4 < 1000) {
                    if (!this.f36106d.f36164I) {
                        this.f36106d.f36164I = true;
                        this.f36106d.f36163H = this.f36103a;
                        if (this.f36106d.f36231r != 0) {
                            noj noj2 = this.f36106d;
                            nli.m26725a(noj2.f36219f, this.f36103a, noj2.f36231r, this.f36104b);
                            this.f36106d.mo21188a(CriticalError.m22086a(this.f36103a, this.f36104b));
                            return;
                        }
                        this.f36106d.mo21188a(CriticalError.m22086a(this.f36103a, this.f36104b));
                    } else if (this.f36106d.f36163H != this.f36103a) {
                        bpdn bpdn3 = this.f36106d.f36163H;
                    }
                }
            }
        }
    }
}
