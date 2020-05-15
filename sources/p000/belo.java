package p000;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: belo */
final /* synthetic */ class belo implements Runnable {

    /* renamed from: a */
    private final bels f111775a;

    /* renamed from: b */
    private final int f111776b;

    /* renamed from: c */
    private final Set f111777c;

    /* renamed from: d */
    private final long f111778d;

    /* renamed from: e */
    private final TimeUnit f111779e;

    /* renamed from: f */
    private final int f111780f;

    public belo(bels bels, int i, Set set, long j, TimeUnit timeUnit, int i2) {
        this.f111775a = bels;
        this.f111776b = i;
        this.f111777c = set;
        this.f111778d = j;
        this.f111779e = timeUnit;
        this.f111780f = i2;
    }

    public final void run() {
        bels bels = this.f111775a;
        int i = this.f111776b;
        Set set = this.f111777c;
        long j = this.f111778d;
        TimeUnit timeUnit = this.f111779e;
        int i2 = this.f111780f;
        bxvd da = bpyp.f139906e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyp bpyp = (bpyp) da.f164949b;
        bpyp.f139908a |= 1;
        bpyp.f139909b = i;
        if (!bpyp.f139910c.mo73666a()) {
            bpyp.f139910c = GeneratedMessageLite.m124021a(bpyp.f139910c);
        }
        bxsy.m123078a(set, bpyp.f139910c);
        int convert = (int) TimeUnit.MILLISECONDS.convert(j, timeUnit);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyp bpyp2 = (bpyp) da.f164949b;
        bpyp2.f139908a |= 2;
        bpyp2.f139911d = convert;
        bpyp bpyp3 = (bpyp) da.mo74062i();
        bxvd da2 = bpyq.f139912g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpyq bpyq = (bpyq) da2.f164949b;
        bpyp3.getClass();
        bpyq.f139917d = bpyp3;
        bpyq.f139914a |= 4;
        bels.mo60785a((bpyq) da2.mo74062i(), i2);
    }
}
