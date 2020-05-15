package p000;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.GenericDimension;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: qxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qxq {

    /* renamed from: a */
    public static final qxk f42376a = new qxk(new GenericDimension[0], new byte[0]);

    /* renamed from: b */
    public static final qxk f42377b = new qxk(new GenericDimension[0], new byte[0]);

    /* renamed from: m */
    public static final Comparator f42378m = new qxa();

    /* renamed from: n */
    public static final Comparator f42379n = new qxb();

    /* renamed from: p */
    public static final qxf f42380p = new qxf(1);

    /* renamed from: q */
    private static final Charset f42381q = Charset.forName("UTF-8");

    /* renamed from: c */
    public final int f42382c;

    /* renamed from: d */
    public final sqv f42383d;

    /* renamed from: e */
    public final ReentrantReadWriteLock f42384e;

    /* renamed from: f */
    public boolean f42385f;

    /* renamed from: g */
    public volatile int f42386g;

    /* renamed from: h */
    public volatile Future f42387h;

    /* renamed from: i */
    public long f42388i;

    /* renamed from: j */
    public Map f42389j;

    /* renamed from: k */
    public qxk f42390k;

    /* renamed from: l */
    public Integer f42391l;

    /* renamed from: o */
    public volatile axtx f42392o;

    /* renamed from: r */
    private final String f42393r;

    /* renamed from: s */
    private ScheduledExecutorService f42394s;

    /* renamed from: t */
    private final qws f42395t;

    /* renamed from: u */
    private TreeMap f42396u;

    public qxq(qws qws, String str, int i) {
        this(qws, str, i, srb.f45012a);
    }

    /* renamed from: a */
    public static long m33053a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f42381q));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Integer mo24378b(qxk qxk) {
        Integer num = (Integer) this.f42396u.get(qxk);
        if (num != null) {
            return num;
        }
        Integer valueOf = Integer.valueOf(this.f42396u.size());
        this.f42396u.put(qxk, valueOf);
        return valueOf;
    }

    /* renamed from: c */
    public final Integer mo24382c(qxk qxk) {
        return (Integer) this.f42396u.get(qxk);
    }

    /* renamed from: d */
    public final qxl mo24385d(String str) {
        qxl qxl;
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.f42384e.writeLock().lock();
        try {
            qxc qxc = (qxc) this.f42389j.get(str);
            if (qxc == null) {
                this.f42384e.writeLock().lock();
                qxl = new qxl(this, str);
                this.f42384e.writeLock().unlock();
                reentrantReadWriteLock = this.f42384e;
            } else {
                qxl = (qxl) qxc;
                reentrantReadWriteLock = this.f42384e;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return qxl;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf));
        } catch (Throwable th) {
            this.f42384e.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final qxm mo24387e(String str) {
        return mo24380b(str, f42380p);
    }

    /* renamed from: f */
    public final qxp mo24389f(String str) {
        qxp qxp;
        ReentrantReadWriteLock reentrantReadWriteLock;
        qxf qxf = f42380p;
        this.f42384e.writeLock().lock();
        try {
            qxc qxc = (qxc) this.f42389j.get(str);
            if (qxc != null) {
                qxp = (qxp) qxc;
                if (!qxf.equals(qxp.f42361e)) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("alias mismatch: ") : "alias mismatch: ".concat(valueOf));
                }
                reentrantReadWriteLock = this.f42384e;
            } else {
                this.f42384e.writeLock().lock();
                qxp = new qxp(this, str, qxf);
                this.f42384e.writeLock().unlock();
                reentrantReadWriteLock = this.f42384e;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return qxp;
        } catch (ClassCastException e) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf2));
        } catch (Throwable th) {
            this.f42384e.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.f42384e.readLock().lock();
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry entry : this.f42396u.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append("(");
                qxk qxk = (qxk) entry.getKey();
                StringBuilder sb2 = new StringBuilder("{");
                sb2.append("(");
                int length = qxk.f42368a.length;
                sb2.append("), ");
                sb2.append(new String(qxk.f42369b, f42381q));
                sb2.append("}");
                sb.append(sb2.toString());
                sb.append(") => ");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}\n");
            for (qxc qxc : this.f42389j.values()) {
                sb.append(qxc.toString());
                sb.append("\n");
            }
            this.f42384e.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.f42384e.readLock().unlock();
            throw th;
        }
    }

    public qxq(qws qws, String str, int i, sqv sqv) {
        boolean z;
        this.f42384e = new ReentrantReadWriteLock();
        this.f42389j = new TreeMap();
        this.f42390k = f42376a;
        this.f42396u = new TreeMap();
        this.f42391l = null;
        this.f42392o = null;
        sdo.m34959a((Object) str);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(sqv);
        this.f42395t = qws;
        this.f42393r = str;
        this.f42382c = i;
        this.f42383d = sqv;
        this.f42388i = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final qxh mo24383c(String str) {
        this.f42384e.writeLock().lock();
        try {
            qxc qxc = (qxc) this.f42389j.get(str);
            if (qxc != null) {
                qxh qxh = (qxh) qxc;
                this.f42384e.writeLock().unlock();
                return qxh;
            }
            qxh b = mo24379b(str);
            this.f42384e.writeLock().unlock();
            return b;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf));
        } catch (Throwable th) {
            this.f42384e.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final rke mo24388e() {
        axtx axtx = this.f42392o;
        this.f42384e.writeLock().lock();
        if (axtx != null) {
            try {
                axtw axtw = axtx.f96347a.f96349b;
                if (axtw.f96341a) {
                    if (axtw.mo53541b()) {
                        if (chnj.m149027c() && chnj.f188812a.mo6606a().mo85409ah()) {
                        }
                    }
                }
                mo24384c();
            } catch (RuntimeException e) {
                Log.i("Counters", "problem executing callback: ", e);
            } catch (Throwable th) {
                this.f42384e.writeLock().unlock();
                throw th;
            }
        }
        qxq c = mo24384c();
        this.f42384e.writeLock().unlock();
        int size = c.f42396u.size();
        qwo[] qwoArr = new qwo[size];
        for (Map.Entry entry : c.f42396u.entrySet()) {
            qwo a = c.f42395t.mo24334a(new qxj(c, ((qxk) entry.getKey()).f42369b, Integer.valueOf(((Integer) entry.getValue()).intValue())));
            int length = ((qxk) entry.getKey()).f42368a.length;
            qwoArr[((Integer) entry.getValue()).intValue()] = a;
        }
        rke rke = null;
        for (int i = 0; i < size; i++) {
            qwo qwo = qwoArr[i];
            qwo.f42320d = c.f42393r;
            rke = qwo.mo24327b();
        }
        return rke == null ? rkg.m33851a(Status.f30107a, null) : rke;
    }

    /* renamed from: a */
    public final qxm mo24373a(String str, qxf qxf) {
        this.f42384e.writeLock().lock();
        try {
            return new qxm(this, str, qxf);
        } finally {
            this.f42384e.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public final qxh mo24379b(String str) {
        this.f42384e.writeLock().lock();
        try {
            return new qxh(this, str);
        } finally {
            this.f42384e.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo24374a() {
        sdo.m34959a(this.f42395t);
        this.f42384e.writeLock().lock();
        try {
            this.f42385f = true;
        } finally {
            this.f42384e.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public final qxm mo24380b(String str, qxf qxf) {
        this.f42384e.writeLock().lock();
        try {
            qxc qxc = (qxc) this.f42389j.get(str);
            if (qxc != null) {
                qxm qxm = (qxm) qxc;
                if (!qxf.equals(qxm.f42361e)) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("alias mismatch: ") : "alias mismatch: ".concat(valueOf));
                }
                this.f42384e.writeLock().unlock();
                return qxm;
            }
            qxm a = mo24373a(str, qxf);
            this.f42384e.writeLock().unlock();
            return a;
        } catch (ClassCastException e) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(valueOf2));
        } catch (Throwable th) {
            this.f42384e.writeLock().unlock();
            throw th;
        }
    }

    private qxq(qxq qxq) {
        this(qxq.f42395t, qxq.f42393r, qxq.f42382c, qxq.f42383d);
        Object obj;
        ReentrantReadWriteLock.WriteLock writeLock = qxq.f42384e.writeLock();
        writeLock.lock();
        try {
            this.f42390k = qxq.f42390k;
            this.f42391l = qxq.f42391l;
            this.f42388i = qxq.f42388i;
            this.f42389j = new TreeMap();
            for (Map.Entry entry : qxq.f42389j.entrySet()) {
                Map map = this.f42389j;
                String str = (String) entry.getKey();
                qxc qxc = (qxc) entry.getValue();
                if (qxc instanceof qxh) {
                    obj = new qxh(this, (qxh) qxc);
                } else if (qxc instanceof qxp) {
                    obj = new qxp(this, (qxp) qxc);
                } else if (qxc instanceof qxl) {
                    obj = new qxl(this, (qxl) qxc);
                } else if (qxc instanceof qxm) {
                    obj = new qxm(this, (qxm) qxc);
                } else if (qxc instanceof qxe) {
                    obj = new qxe(this, (qxe) qxc);
                } else {
                    String valueOf = String.valueOf(qxc);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Unknown counter type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                map.put(str, obj);
            }
            TreeMap treeMap = this.f42396u;
            this.f42396u = qxq.f42396u;
            qxq.f42396u = treeMap;
            qxq.f42391l = null;
            qxq.f42388i = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24375a(ScheduledExecutorService scheduledExecutorService, int i) {
        this.f42384e.writeLock().lock();
        try {
            this.f42394s = scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.f42386g = i;
                mo24381b();
            } else {
                this.f42386g = 0;
            }
        } finally {
            this.f42384e.writeLock().unlock();
        }
    }

    /* renamed from: c */
    public final qxq mo24384c() {
        return new qxq(this);
    }

    /* renamed from: d */
    public final qxn mo24386d() {
        return new qxn(this);
    }

    /* renamed from: a */
    public final void mo24376a(qxk qxk) {
        if (qxk == null) {
            qxk = f42376a;
        }
        this.f42384e.writeLock().lock();
        try {
            this.f42390k = qxk;
            this.f42391l = null;
        } finally {
            this.f42384e.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo24377a(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            mo24376a(f42376a);
        } else {
            mo24376a(new qxk(f42376a.f42368a, bArr));
        }
    }

    /* renamed from: b */
    public final void mo24381b() {
        this.f42384e.writeLock().lock();
        try {
            Future future = this.f42387h;
            if (future != null) {
                future.cancel(false);
            }
            this.f42387h = ((sny) this.f42394s).schedule(new qwz(this), (long) this.f42386g, TimeUnit.MILLISECONDS);
        } finally {
            this.f42384e.writeLock().unlock();
        }
    }
}
