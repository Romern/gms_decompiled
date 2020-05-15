package p000;

import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: qxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qxc {

    /* renamed from: a */
    public final String f42355a;

    /* renamed from: b */
    public final Object f42356b;

    /* renamed from: c */
    public C1246ol f42357c;

    /* renamed from: d */
    public final /* synthetic */ qxq f42358d;

    /* renamed from: e */
    private int f42359e;

    /* renamed from: f */
    private int f42360f;

    protected qxc(qxq qxq, String str) {
        this.f42358d = qxq;
        this.f42356b = new Object();
        this.f42360f = this.f42358d.f42382c;
        this.f42357c = new C1246ol();
        if (qxq.f42389j.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("counter/histogram already exists: ") : "counter/histogram already exists: ".concat(valueOf));
        }
        qxq.f42389j.put(str, this);
        this.f42355a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        return r4;
     */
    /* renamed from: a */
    private final boolean m33038a(long j, long j2, Integer num) {
        synchronized (this.f42356b) {
            C1230nw nwVar = (C1230nw) this.f42357c.mo15646f(num.intValue());
            if (nwVar == null) {
                nwVar = new C1230nw();
                this.f42357c.mo15637a(num.intValue(), nwVar);
            }
            int i = this.f42359e;
            qxq qxq = this.f42358d;
            qxk qxk = qxq.f42376a;
            int i2 = qxq.f42382c;
            boolean z = false;
            if (i >= i2) {
                if (!qxq.f42385f) {
                    if (i == i2) {
                        String valueOf = String.valueOf(this.f42355a);
                        Log.i("Counters", valueOf.length() == 0 ? new String("exceeded sample count in ") : "exceeded sample count in ".concat(valueOf));
                    }
                }
            }
            this.f42359e = i + 1;
            long[] jArr = (long[]) nwVar.mo15534a(j);
            if (jArr == null) {
                jArr = new long[]{0};
                nwVar.mo15540b(j, jArr);
            }
            jArr[0] = jArr[0] + j2;
            if (this.f42358d.f42385f && this.f42359e >= this.f42360f) {
                z = true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractCounter(");
        sb.append(this.f42355a);
        sb.append(")[");
        synchronized (this.f42356b) {
            for (int i = 0; i < this.f42357c.mo15640c(); i++) {
                C1230nw nwVar = (C1230nw) this.f42357c.mo15641c(i);
                sb.append(this.f42357c.mo15638b(i));
                sb.append(" -> [");
                for (int i2 = 0; i2 < nwVar.mo15537b(); i2++) {
                    sb.append(nwVar.mo15533a(i2));
                    sb.append(" = ");
                    sb.append(((long[]) nwVar.mo15538b(i2))[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected qxc(qxq qxq, qxc qxc) {
        this(qxq, qxc.f42355a);
        synchronized (qxc.f42356b) {
            this.f42359e = qxc.f42359e;
            C1246ol olVar = this.f42357c;
            this.f42357c = qxc.f42357c;
            qxc.f42357c = olVar;
            qxc.f42359e = 0;
        }
    }

    /* renamed from: a */
    public final void mo24354a(long j, long j2, qxk qxk) {
        boolean z;
        Integer num;
        if (qxk == null) {
            qxk = qxq.f42376a;
        }
        qxq qxq = this.f42358d;
        qxk qxk2 = qxq.f42376a;
        qxq.f42384e.readLock().lock();
        try {
            Integer c = qxk != qxq.f42377b ? this.f42358d.mo24382c(qxk) : this.f42358d.f42391l;
            boolean z2 = false;
            if (c != null) {
                z = m33038a(j, j2, c);
            } else {
                z2 = true;
                z = false;
            }
            if (z2) {
                Lock writeLock = this.f42358d.f42384e.writeLock();
                writeLock.lock();
                try {
                    if (qxk == qxq.f42377b) {
                        qxq qxq2 = this.f42358d;
                        qxq2.f42391l = qxq2.mo24378b(qxq2.f42390k);
                        num = this.f42358d.f42391l;
                    } else {
                        num = this.f42358d.mo24378b(qxk);
                    }
                    Integer num2 = num;
                    this.f42358d.f42384e.readLock().lock();
                    writeLock.unlock();
                    writeLock = this.f42358d.f42384e.readLock();
                    try {
                        z = m33038a(j, j2, num2);
                        writeLock.unlock();
                    } catch (Throwable th) {
                        th = th;
                        writeLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    writeLock.unlock();
                    throw th;
                }
            }
            if (z) {
                this.f42358d.mo24388e();
            }
            if (this.f42358d.f42386g > 0 && this.f42358d.f42387h == null) {
                this.f42358d.mo24381b();
            }
        } finally {
            this.f42358d.f42384e.readLock().unlock();
        }
    }
}
