package p000;

import android.os.UpdateEngineCallback;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: avpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpk extends UpdateEngineCallback {

    /* renamed from: e */
    public static final /* synthetic */ int f93699e = 0;

    /* renamed from: f */
    private static final Logger f93700f = avpq.m79018e("SynchronizedUpdateEngine");

    /* renamed from: g */
    private static final long f93701g = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    public final AtomicInteger f93702a = new AtomicInteger(-1);

    /* renamed from: b */
    public final AtomicBoolean f93703b = new AtomicBoolean(false);

    /* renamed from: c */
    public final avtn f93704c = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: d */
    public final avpn f93705d = ((avpn) avpn.f93713b.mo51589b());

    /* renamed from: h */
    private final AtomicBoolean f93706h = new AtomicBoolean(false);

    /* renamed from: i */
    private final Object f93707i = new Object();

    /* renamed from: j */
    private final Object f93708j = new Object();

    /* renamed from: k */
    private final Deque f93709k = new ArrayDeque();

    /* renamed from: l */
    private avpj f93710l = null;

    private avpk() {
    }

    /* renamed from: a */
    public static avpk m78987a() {
        return new avpk();
    }

    /* renamed from: g */
    private final avpj m78990g() {
        avpj avpj;
        synchronized (this.f93708j) {
            avpj = this.f93710l;
        }
        return avpj;
    }

    /* renamed from: h */
    private final void m78991h() {
        synchronized (this.f93707i) {
            for (avpi avpi : this.f93709k) {
                if (avpi.mo51463a()) {
                    avpi.f93696a.countDown();
                }
            }
        }
    }

    /* renamed from: i */
    private final void m78992i() {
        try {
            avpn avpn = this.f93705d;
            avpn.f93712a.mo25414c("cancel()", new Object[0]);
            avpn.f93715d.cancel();
        } catch (Exception e) {
            f93700f.mo25417e("Error when calling UpdateEngine.cancel() (note that this error might be expected).", e, new Object[0]);
        }
    }

    /* renamed from: j */
    private final void m78993j() {
        try {
            avpn avpn = this.f93705d;
            if (((Boolean) avpn.f93714c.mo51607b(avnp.f93534i)).booleanValue()) {
                avpn.f93712a.mo25414c("resetStatus()", new Object[0]);
                avpn.f93715d.resetStatus();
                avpn.f93714c.mo51605a(avnp.f93534i.mo51602b(false));
            }
            this.f93704c.mo51605a(avnp.f93538m.mo51602b(false));
        } catch (Exception e) {
            f93700f.mo25417e("Error when calling UpdateEngine.resetStatus() (note that this error might be expected).", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo51466b() {
        avpn avpn = this.f93705d;
        synchronized (avpn.f93716e) {
            avpn.f93720i.add(this);
            if (!avpn.f93719h) {
                avpn.f93719h = true;
                avpn.f93715d.bind(avpn);
            }
            int i = avpn.f93717f;
            if (i != -1) {
                onStatusUpdate(i, avpn.f93718g);
            }
        }
        this.f93706h.set(true);
    }

    /* renamed from: c */
    public final void mo51467c() {
        avpn avpn = this.f93705d;
        synchronized (avpn.f93716e) {
            avpn.f93720i.remove(this);
        }
    }

    /* renamed from: d */
    public final void mo51468d() {
        sdo.m34975b(this.f93706h.get(), "stop() called before binding to UpdateEngine.");
        f93700f.mo25414c("stop()", new Object[0]);
        try {
            this.f93703b.set(true);
            int f = mo51470f();
            if (!(f == 0 || f == 6)) {
                m78992i();
                if (!m78989a(avpd.f93691a, f93701g)) {
                    f93700f.mo25418e("Failed to get updated status from update engine after cancel.", new Object[0]);
                }
            }
        } finally {
            m78991h();
        }
    }

    /* renamed from: e */
    public final void mo51469e() {
        sdo.m34975b(this.f93706h.get(), "reset() called before binding to UpdateEngine.");
        f93700f.mo25414c("reset()", new Object[0]);
        try {
            this.f93703b.set(true);
            int f = mo51470f();
            if (f != 0) {
                if (f != 6) {
                    m78992i();
                    if (!m78989a(avpf.f93693a, f93701g)) {
                        f93700f.mo25418e("Failed to get updated status from update engine after cancel.", new Object[0]);
                    }
                } else {
                    m78993j();
                    if (!m78989a(avpe.f93692a, f93701g)) {
                        f93700f.mo25418e("Failed to get updated status from update engine after reset status.", new Object[0]);
                    }
                }
                if (mo51470f() == 6) {
                    m78993j();
                    if (!m78989a(avpg.f93694a, f93701g)) {
                        f93700f.mo25418e("Failed to get updated status from update engine after reset status.", new Object[0]);
                    }
                }
            }
        } finally {
            m78991h();
        }
    }

    /* renamed from: f */
    public final int mo51470f() {
        sdo.m34975b(this.f93706h.get(), "GetStatus called before binding to UpdateEngine.");
        m78988a(avph.f93695a);
        return this.f93705d.mo51473a();
    }

    public final void onPayloadApplicationComplete(int i) {
        float f;
        this.f93702a.set(i);
        avpj g = m78990g();
        if (g != null) {
            int a = this.f93705d.mo51473a();
            avpn avpn = this.f93705d;
            synchronized (avpn.f93716e) {
                f = avpn.f93718g;
            }
            g.mo51456a(a, i, f);
        }
        m78991h();
    }

    public final void onStatusUpdate(int i, float f) {
        avpj g = m78990g();
        if (g != null) {
            g.mo51456a(i, this.f93702a.get(), f);
        }
        m78991h();
    }

    /* renamed from: a */
    private final void m78988a(ssx ssx) {
        avpi avpi = new avpi(this, ssx);
        synchronized (this.f93707i) {
            if (!avpi.mo51463a()) {
                this.f93709k.add(avpi);
                try {
                    avpi.f93696a.await();
                    synchronized (this.f93707i) {
                        this.f93709k.remove(avpi);
                    }
                } catch (Throwable th) {
                    synchronized (this.f93707i) {
                        this.f93709k.remove(avpi);
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m78989a(ssx ssx, long j) {
        avpi avpi = new avpi(this, ssx);
        synchronized (this.f93707i) {
            if (avpi.mo51463a()) {
                return true;
            }
            this.f93709k.add(avpi);
            try {
                boolean await = avpi.f93696a.await(j, TimeUnit.MILLISECONDS);
                synchronized (this.f93707i) {
                    this.f93709k.remove(avpi);
                }
                return await;
            } catch (Throwable th) {
                synchronized (this.f93707i) {
                    this.f93709k.remove(avpi);
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
     arg types: [bnfi, java.lang.Class]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[] */
    /* renamed from: a */
    public final int mo51464a(avsp avsp, List list) {
        sdo.m34975b(this.f93706h.get(), "start() called before binding to UpdateEngine.");
        Logger Logger = f93700f;
        Object[] objArr = new Object[2];
        bmxt a = bmxu.m108563a(avsp);
        a.mo66885a("url", avsp.f93845a);
        avsq avsq = avsp.f93847c;
        if (avsq == null) {
            avsq = avsq.f93848d;
        }
        a.mo66884a("payload_binary_file.offset", avsq.f93851b);
        avsq avsq2 = avsp.f93847c;
        if (avsq2 == null) {
            avsq2 = avsq.f93848d;
        }
        a.mo66884a("payload_binary_file.length", avsq2.f93852c);
        a.mo66885a("properties", avsp.f93846b);
        objArr[0] = a.toString();
        objArr[1] = Integer.valueOf(list.size());
        Logger.mo25414c("start(%s, additionalProperties.size=%d)", objArr);
        if (this.f93703b.get()) {
            return this.f93702a.get();
        }
        if (mo51470f() == 6) {
            this.f93702a.set(0);
            return 0;
        }
        this.f93702a.set(-1);
        if (this.f93705d.mo51473a() == 0) {
            try {
                avpn avpn = this.f93705d;
                String str = avsp.f93845a;
                avsq avsq3 = avsp.f93847c;
                if (avsq3 == null) {
                    avsq3 = avsq.f93848d;
                }
                long j = avsq3.f93851b;
                avsq avsq4 = avsp.f93847c;
                if (avsq4 == null) {
                    avsq4 = avsq.f93848d;
                }
                long j2 = avsq4.f93852c;
                String[] strArr = (String[]) bnjd.m109584a((Iterable) bnfi.m109236a(avsp.f93846b, list), String.class);
                avpn.f93712a.mo25414c("applyPayload()", new Object[0]);
                avpn.f93714c.mo51605a(avnp.f93534i.mo51602b(true));
                avpn.f93715d.applyPayload(str, j, j2, strArr);
                this.f93704c.mo51605a(avnp.f93538m.mo51602b(Boolean.valueOf(!list.contains("SWITCH_SLOT_ON_REBOOT=0"))));
            } catch (Exception e) {
                f93700f.mo25417e("Error when calling UpdateEngine.applyPayload().", e, new Object[0]);
                this.f93702a.set(1);
            }
        }
        m78988a(avpc.f93690a);
        return this.f93702a.get();
    }

    /* renamed from: a */
    public final void mo51465a(avpj avpj) {
        synchronized (this.f93708j) {
            this.f93710l = avpj;
        }
    }
}
