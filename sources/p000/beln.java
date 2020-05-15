package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: beln */
final /* synthetic */ class beln implements Runnable {

    /* renamed from: a */
    private final bels f111770a;

    /* renamed from: b */
    private final int f111771b;

    /* renamed from: c */
    private final long f111772c;

    /* renamed from: d */
    private final TimeUnit f111773d;

    /* renamed from: e */
    private final int f111774e;

    public beln(bels bels, int i, long j, TimeUnit timeUnit, int i2) {
        this.f111770a = bels;
        this.f111771b = i;
        this.f111772c = j;
        this.f111773d = timeUnit;
        this.f111774e = i2;
    }

    public final void run() {
        bels bels = this.f111770a;
        int i = this.f111771b;
        long j = this.f111772c;
        TimeUnit timeUnit = this.f111773d;
        int i2 = this.f111774e;
        bxvd da = bpyo.f139901d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyo bpyo = (bpyo) da.f164949b;
        bpyo.f139903a |= 1;
        bpyo.f139904b = i;
        int convert = (int) TimeUnit.MILLISECONDS.convert(j, timeUnit);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyo bpyo2 = (bpyo) da.f164949b;
        bpyo2.f139903a |= 2;
        bpyo2.f139905c = convert;
        bpyo bpyo3 = (bpyo) da.mo74062i();
        bxvd da2 = bpyq.f139912g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpyq bpyq = (bpyq) da2.f164949b;
        bpyo3.getClass();
        bpyq.f139918e = bpyo3;
        bpyq.f139914a |= 8;
        bels.mo60785a((bpyq) da2.mo74062i(), i2);
    }
}
