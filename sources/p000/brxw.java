package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: brxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brxw extends chqs {

    /* renamed from: a */
    public final Set f143595a = bnpf.m110059d();

    /* renamed from: b */
    public final Deque f143596b;

    /* renamed from: c */
    public int f143597c;

    /* renamed from: d */
    public brxv f143598d;

    /* renamed from: e */
    public chqr f143599e;

    /* renamed from: f */
    public boolean f143600f = false;

    /* renamed from: g */
    public boolean f143601g = false;

    /* renamed from: h */
    public chqs f143602h;

    /* renamed from: i */
    private final chqp f143603i;

    /* renamed from: j */
    private final chtv f143604j;

    /* renamed from: k */
    private final bngx f143605k;

    /* renamed from: l */
    private final Executor f143606l;

    /* renamed from: m */
    private final LinkedHashMap f143607m = new LinkedHashMap();

    /* renamed from: n */
    private final Set f143608n = bnpf.m110059d();

    /* renamed from: o */
    private final Queue f143609o;

    /* renamed from: p */
    private chqo f143610p;

    /* renamed from: q */
    private final Queue f143611q;

    /* renamed from: r */
    private int f143612r;

    /* renamed from: s */
    private chtr f143613s;

    public brxw(chqp chqp, chtv chtv, chqo chqo, bngx bngx) {
        this.f143603i = chqp;
        this.f143604j = chtv;
        this.f143610p = chqo;
        this.f143605k = bngx;
        this.f143596b = new ArrayDeque();
        this.f143611q = new ArrayDeque();
        this.f143609o = new ArrayDeque();
        this.f143598d = new brxv(bngx.size(), 1, 0, 0);
        Executor executor = chqo.f189008c;
        this.f143606l = new brxi(this, bqgs.m112813a(executor == null ? bqfb.INSTANCE : executor));
    }

    /* renamed from: b */
    private final brxa m114844b(brxa brxa) {
        chqo chqo = this.f143610p;
        return chqo != brxa.f143554b ? brxa.m114831a(brxa.f143555c, chqo, brxa.f143553a, brxa.f143556d) : brxa;
    }

    /* renamed from: d */
    private final void m114845d() {
        boolean z;
        brxv brxv;
        brxv brxv2 = this.f143598d;
        if (brxv2.f143594e != 4) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108601b(!z, "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i = brxv2.f143594e;
        if (i == 3) {
            brxv = new brxv(brxv2.f143590a, 4, brxv2.f143591b, brxv2.f143592c);
        } else if (i == 1 && brxv2.f143593d) {
            int i2 = brxv2.f143590a;
            int i3 = brxv2.f143591b;
            brxv = new brxv(i2, 2, i3, i3);
        } else {
            int i4 = brxv2.f143591b;
            int i5 = i4 + 1;
            int i6 = brxv2.f143590a;
            if (i5 >= i6) {
                brxv = new brxv(i6, 3, i4, brxv2.f143592c);
            } else {
                brxv = new brxv(i6, 1, i5, brxv2.f143592c);
            }
        }
        this.f143598d = brxv;
        bryf bryf = bryf.PROCEED;
        int i7 = this.f143598d.f143594e - 1;
        if (i7 == 0) {
            mo70070a(this.f143613s);
        } else if (i7 != 2) {
            mo70067a();
        } else {
            chqs a = this.f143603i.mo70053a(this.f143604j, this.f143610p);
            this.f143602h = a;
            a.mo56351a(this.f143599e, this.f143613s);
            int i8 = this.f143597c;
            if (i8 > 0) {
                this.f143602h.mo70029a(i8);
            }
            for (Object obj : this.f143609o) {
                this.f143602h.mo70030a(obj);
            }
            if (this.f143600f && this.f143596b.isEmpty()) {
                this.f143602h.mo70032b();
            }
            m114845d();
        }
    }

    /* renamed from: e */
    private final void m114846e() {
        while (!this.f143596b.isEmpty()) {
            brxu brxu = (brxu) this.f143596b.peek();
            if (brxu.f143587b.isEmpty() && brxu.f143588c == brxu.f143589d.f143598d.f143590a) {
                Object obj = ((brxu) this.f143596b.poll()).f143586a;
                if (this.f143598d.f143594e != 4) {
                    this.f143609o.add(obj);
                } else {
                    this.f143602h.mo70030a(obj);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo70071c() {
        if (this.f143600f) {
            brxu brxu = (brxu) this.f143596b.peekLast();
            bryf bryf = bryf.PROCEED;
            int i = this.f143598d.f143594e - 1;
            if (i != 1) {
                if (i == 3 && brxu == null) {
                    this.f143602h.mo70032b();
                }
            } else if (brxu == null || (brxu.f143587b.isEmpty() && brxu.f143588c == brxu.f143589d.f143598d.f143592c + 1)) {
                m114845d();
            }
        }
    }

    /* renamed from: a */
    private final void m114842a(brxu brxu, int i, int i2) {
        bmxy.m108601b(brxu.f143586a instanceof bxxc, "Only MessageLite is supported");
        brxb brxb = new brxb((bxxc) brxu.f143586a);
        while (i < i2) {
            bnre i3 = ((bngx) this.f143605k.get(i)).listIterator();
            while (i3.hasNext()) {
                brxe brxe = (brxe) i3.next();
                bryh b = brxe.mo70016b();
                if (b.f143649c.equals(bryf.CONTINUE_AFTER)) {
                    bqgg a = b.mo70080a();
                    brxu.f143587b.put(brxe, a);
                    a.mo741a(bljx.m107269a(new brxq(this, brxb, brxu)), this.f143606l);
                }
                if (m114843a(b)) {
                    return;
                }
            }
            i++;
        }
        brxu.f143588c = i2;
        if (brxu.f143587b.isEmpty()) {
            m114846e();
            mo70071c();
        }
    }

    /* renamed from: b */
    public final void mo70032b() {
        this.f143606l.execute(new brxt(this));
    }

    /* renamed from: a */
    private final boolean m114843a(bryh bryh) {
        bryf bryf = bryf.PROCEED;
        int ordinal = bryh.f143649c.ordinal();
        if (ordinal == 0) {
            chqo chqo = bryh.f143652f;
            if (chqo != null) {
                if (this.f143598d.f143594e != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                    this.f143599e.mo25570a(chuv.m149608a(illegalStateException), new chtr());
                    if (this.f143598d.f143594e == 4) {
                        this.f143602h.mo70031a("Interceptor returned invalid outcome", illegalStateException);
                    }
                    return true;
                }
                this.f143610p = chqo;
            }
            return false;
        } else if (ordinal == 1) {
            bryc bryc = bryh.f143651e;
            this.f143599e.mo25570a(bryc.f143636a, bryc.f143637b);
            if (this.f143598d.f143594e == 4) {
                this.f143602h.mo70031a("Aborted RPC with exception", bryc.f143636a.f189235u);
            }
            this.f143601g = true;
            return true;
        } else if (ordinal == 2) {
            bryg bryg = bryh.f143650d;
            throw null;
        } else if (ordinal == 3) {
            bqgg a = bryh.mo70080a();
            this.f143595a.add(a);
            a.mo741a(new brxo(this, a), this.f143606l);
            return false;
        } else if (ordinal == 4) {
            this.f143598d.f143593d = true;
            return false;
        } else {
            String valueOf = String.valueOf(bryh.f143649c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unrecognized outcome type: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo70067a() {
        bryf bryf = bryf.PROCEED;
        int i = this.f143598d.f143594e - 1;
        if (i == 1) {
            for (brxu brxu : this.f143596b) {
                int i2 = brxu.f143588c;
                int i3 = this.f143598d.f143592c;
                if (i2 <= i3) {
                    m114842a(brxu, i2, i3 + 1);
                }
            }
        } else if (i == 3) {
            for (brxu brxu2 : this.f143596b) {
                m114842a(brxu2, brxu2.f143588c, this.f143598d.f143590a);
            }
        }
    }

    /* renamed from: a */
    public final void mo70029a(int i) {
        synchronized (this.f143611q) {
            this.f143612r += i;
        }
        ArrayDeque<Object> arrayDeque = new ArrayDeque();
        synchronized (this.f143611q) {
            if (!this.f143611q.isEmpty()) {
                int i2 = this.f143612r;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object poll = this.f143611q.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.f143612r--;
                    }
                }
                boolean isEmpty = this.f143611q.isEmpty();
                for (Object obj : arrayDeque) {
                    this.f143599e.mo25571a(obj);
                }
                if (isEmpty) {
                    this.f143599e.mo25570a(chuv.f189215b, null);
                }
            }
        }
        this.f143606l.execute(new brxs(this, i));
    }

    /* renamed from: a */
    public final void mo70068a(brxa brxa) {
        if (!this.f143607m.isEmpty()) {
            Iterator it = this.f143607m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((bqgg) entry.getValue()).isDone()) {
                    break;
                }
                it.remove();
                brxe brxe = (brxe) entry.getKey();
                bryh b = brxe.mo70017b(m114844b(brxa));
                if (b.f143649c.equals(bryf.CONTINUE_AFTER)) {
                    bqgg a = b.mo70080a();
                    this.f143607m.put(brxe, a);
                    a.mo741a(bljx.m107269a(new brxn(this, brxa)), this.f143606l);
                }
                if (m114843a(b)) {
                    return;
                }
            }
            if (this.f143607m.isEmpty()) {
                m114845d();
            }
        }
    }

    /* renamed from: a */
    public final void mo70069a(brxb brxb, brxu brxu) {
        Iterator it = brxu.f143587b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((bqgg) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            brxe brxe = (brxe) entry.getKey();
            bryh a = brxe.mo70012a(brxb);
            if (a.f143649c.equals(bryf.CONTINUE_AFTER)) {
                bqgg a2 = a.mo70080a();
                brxu.f143587b.put(brxe, a2);
                a2.mo741a(bljx.m107269a(new brxr(this, brxb, brxu)), this.f143606l);
            }
            if (m114843a(a)) {
                return;
            }
        }
        if (brxu.f143587b.isEmpty()) {
            m114846e();
            mo70071c();
        }
    }

    /* renamed from: a */
    public final void mo56351a(chqr chqr, chtr chtr) {
        this.f143599e = new bryn(new bryb(chqr, this.f143605k, this.f143608n));
        this.f143613s = chtr;
        this.f143606l.execute(new brxl(this, chtr));
    }

    /* renamed from: a */
    public final void mo70070a(chtr chtr) {
        brxa a = brxa.m114831a(this.f143604j, this.f143610p, chtr, this.f143603i.mo70054a());
        bnre i = ((bngx) this.f143605k.get(this.f143598d.f143591b)).listIterator();
        while (i.hasNext()) {
            brxe brxe = (brxe) i.next();
            bryh a2 = brxe.mo70011a(m114844b(a));
            if (a2.f143649c.equals(bryf.CONTINUE_AFTER)) {
                bqgg a3 = a2.mo70080a();
                this.f143607m.put(brxe, a3);
                a3.mo741a(bljx.m107269a(new brxm(this, a)), this.f143606l);
            }
            if (!m114843a(a2)) {
                this.f143608n.add(brxe);
            } else {
                return;
            }
        }
        if (this.f143607m.isEmpty()) {
            m114845d();
        }
    }

    /* renamed from: a */
    public final void mo70030a(Object obj) {
        this.f143606l.execute(new brxp(this, obj));
    }

    /* renamed from: a */
    public final void mo70031a(String str, Throwable th) {
        this.f143606l.execute(new brxj(this, str, th));
    }
}
