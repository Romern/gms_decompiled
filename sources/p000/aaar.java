package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aaar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaar {

    /* renamed from: a */
    private final ScheduledExecutorService f27848a;

    /* renamed from: b */
    private final int f27849b;

    /* renamed from: c */
    private final long f27850c;

    /* renamed from: d */
    private final TimeUnit f27851d;

    /* renamed from: e */
    private long f27852e;

    /* renamed from: f */
    private final List f27853f = new ArrayList();

    /* renamed from: g */
    private ScheduledFuture f27854g;

    public aaar(ScheduledExecutorService scheduledExecutorService, int i, long j, TimeUnit timeUnit) {
        this.f27848a = scheduledExecutorService;
        this.f27849b = i;
        this.f27850c = j;
        this.f27851d = timeUnit;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo16666a() {
        ScheduledFuture scheduledFuture = this.f27854g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f27854g = null;
        }
        if (!this.f27853f.isEmpty()) {
            bxvd da = bpvf.f139321t.mo74144da();
            bxvd da2 = bpub.f139226d.mo74144da();
            long j = this.f27852e;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpub bpub = (bpub) da2.f164949b;
            bpub.f139228a = 1 | bpub.f139228a;
            bpub.f139229b = j;
            List list = this.f27853f;
            if (!bpub.f139230c.mo73666a()) {
                bpub.f139230c = bxvk.m124021a(bpub.f139230c);
            }
            bxsy.m123078a(list, bpub.f139230c);
            bpub bpub2 = (bpub) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvf bpvf = (bpvf) da.f164949b;
            bpub2.getClass();
            bpvf.f139341s = bpub2;
            bpvf.f139323a |= 2048;
            this.f27853f.clear();
            this.f27848a.execute(new aaaq((bpvf) da.mo74062i()));
        }
    }

    /* renamed from: b */
    public final synchronized void mo16668b() {
        this.f27854g = null;
        mo16666a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo16667a(int i, String str, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f27853f.isEmpty()) {
            this.f27852e = currentTimeMillis / 1000;
            this.f27854g = ((sny) this.f27848a).schedule(new aaap(this), this.f27850c, this.f27851d);
        }
        bxvd da = bpua.f139219f.mo74144da();
        sgj a = sgj.m35206a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpua bpua = (bpua) da.f164949b;
        bpua.f139222b = a.mo3214a();
        bpua.f139221a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpua bpua2 = (bpua) da.f164949b;
        str.getClass();
        int i3 = bpua2.f139221a | 2;
        bpua2.f139221a = i3;
        bpua2.f139223c = str;
        int i4 = i3 | 4;
        bpua2.f139221a = i4;
        bpua2.f139224d = i2;
        long j = this.f27852e;
        bpua2.f139221a = i4 | 8;
        Long.signum(j);
        bpua2.f139225e = (int) (currentTimeMillis - (j * 1000));
        this.f27853f.add((bpua) da.mo74062i());
        if (this.f27853f.size() > this.f27849b) {
            mo16666a();
        }
    }
}
