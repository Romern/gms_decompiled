package p000;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bqeb extends bqef {

    /* renamed from: c */
    private static final Logger f140537c = Logger.getLogger(bqeb.class.getName());

    /* renamed from: a */
    public bngm f140538a;

    /* renamed from: d */
    private final boolean f140539d;

    /* renamed from: e */
    private final boolean f140540e;

    public bqeb(bngm bngm, boolean z, boolean z2) {
        super(bngm.size());
        bmxy.m108581a(bngm);
        this.f140538a = bngm;
        this.f140539d = z;
        this.f140540e = z2;
    }

    /* renamed from: a */
    private static boolean m112679a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* renamed from: b */
    private final void m112680b(Throwable th) {
        bmxy.m108581a(th);
        if (this.f140539d && !mo69136a(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set b = bnpf.m110056b();
                mo69158a(b);
                bqef.f140544b.mo69162a(this, b);
                set = this.seenExceptions;
            }
            if (m112679a(set, th)) {
                m112681c(th);
                return;
            }
        }
        if (th instanceof Error) {
            m112681c(th);
        }
    }

    /* renamed from: c */
    private static void m112681c(Throwable th) {
        String str;
        if (!(th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        f140537c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    /* renamed from: a */
    public abstract void mo69154a(int i, Object obj);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, bngm], assign insn: 0x0000: IGET  (r0v0 ? I:bngm) = (r5v0 'this' bqeb A[THIS]) bqeb.a bngm */
    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        ? r0 = this.f140538a;
        mo69157a(bqea.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (r0 != 0)) {
            boolean e = mo69140e();
            int size = r0.size();
            for (int i = 0; i < size; i++) {
                ((Future) r0.get(i)).cancel(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        bngm bngm = this.f140538a;
        if (bngm == null) {
            return super.mo60815bi();
        }
        String valueOf = String.valueOf(bngm);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: g */
    public abstract void mo69160g();

    /* renamed from: a */
    public final void mo69155a(int i, Future future) {
        try {
            mo69154a(i, bqga.m112780a(future));
        } catch (ExecutionException e) {
            m112680b(e.getCause());
        } catch (Throwable th) {
            m112680b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, bngm], assign insn: 0x0039: IGET  (r0v5 ? I:bngm) = (r7v0 'this' bqeb A[THIS]) bqeb.a bngm */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, bngm], assign insn: 0x000d: IGET  (r0v8 ? I:bngm) = (r7v0 'this' bqeb A[THIS]) bqeb.a bngm */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo69159c() {
        bngm bngm;
        if (!this.f140538a.isEmpty()) {
            int i = 0;
            if (this.f140539d) {
                ? r0 = this.f140538a;
                int size = r0.size();
                int i2 = 0;
                while (i < size) {
                    bqgg bqgg = (bqgg) r0.get(i);
                    bqgg.mo741a(new bqdy(this, bqgg, i2), bqfb.INSTANCE);
                    i++;
                    i2++;
                }
                return;
            }
            if (this.f140540e) {
                bngm = this.f140538a;
            } else {
                bngm = null;
            }
            bqdz bqdz = new bqdz(this, bngm);
            ? r02 = this.f140538a;
            int size2 = r02.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((bqgg) r02.get(i3)).mo741a(bqdz, bqfb.INSTANCE);
            }
            return;
        }
        mo69160g();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, bngm], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo69156a(bngm r6) {
        boolean z;
        int a = bqef.f140544b.mo69161a(this);
        if (a >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Less than 0 remaining futures");
        if (a == 0) {
            if (r6 != 0) {
                int size = r6.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    Future future = (Future) r6.get(i2);
                    if (!future.isCancelled()) {
                        mo69155a(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            mo69160g();
            mo69157a(bqea.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    /* renamed from: a */
    public void mo69157a(bqea bqea) {
        bmxy.m108581a(bqea);
        this.f140538a = null;
    }

    /* renamed from: a */
    public final void mo69158a(Set set) {
        bmxy.m108581a(set);
        if (!isCancelled()) {
            m112679a(set, mo69141f());
        }
    }
}
