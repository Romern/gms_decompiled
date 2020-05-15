package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bkmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkmo extends bkmt {

    /* renamed from: a */
    public final Logger f124889a = Logger.getLogger(bkmo.class.getName());

    /* renamed from: b */
    public int f124890b;

    /* renamed from: g */
    private final bknp f124891g;

    /* renamed from: h */
    private final bkms f124892h;

    /* renamed from: i */
    private final bkqx f124893i;

    /* renamed from: j */
    private final PriorityQueue f124894j = new PriorityQueue();

    /* renamed from: k */
    private final Set f124895k = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: l */
    private final bknm f124896l;

    /* renamed from: m */
    private boolean f124897m;

    /* renamed from: n */
    private long f124898n;

    /* renamed from: o */
    private bkps f124899o;

    /* renamed from: p */
    private boolean f124900p;

    /* renamed from: q */
    private long f124901q = Math.abs(new Random().nextLong());
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f124902r;

    /* renamed from: s */
    private final Runnable f124903s = new bkmj(this);

    public bkmo(bknp bknp, bkmz bkmz, bkms bkms, bkqx bkqx, bkpx bkpx) {
        super(bkpx);
        this.f124891g = bknp;
        this.f124892h = bkms;
        this.f124893i = bkqx;
        this.f124907e = bkpx.f125105b;
        if (bkmz != null) {
            bkmz.mo66129a(bkpr.class, new bkmk(this));
            bkmz.mo66129a(bkmy.class, new bkml(this));
        }
        this.f124896l = new bkmm(this, bkmz);
    }

    /* renamed from: a */
    private final synchronized void m106142a(int i) {
        if (i != -1) {
            Logger logger = this.f124889a;
            Level level = Level.INFO;
            int i2 = this.f124907e;
            StringBuilder sb = new StringBuilder(69);
            sb.append("Requesting catchup from revision ");
            sb.append(i2);
            sb.append(" to revision ");
            sb.append(i);
            sb.append(".");
            logger.logp(level, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "requestCatchup", sb.toString());
        } else {
            Logger logger2 = this.f124889a;
            Level level2 = Level.INFO;
            int i3 = this.f124907e;
            StringBuilder sb2 = new StringBuilder(62);
            sb2.append("Requesting catchup from revision ");
            sb2.append(i3);
            sb2.append(" to head revision.");
            logger2.logp(level2, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "requestCatchup", sb2.toString());
        }
        this.f124902r = true;
        this.f124891g.mo66140a(this.f124907e + 1, i, new bkmn(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r12.f124899o = r5;
        r12.f124900p = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r12.f124894j.add(r5);
        r4 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
        return;
     */
    /* renamed from: h */
    private final synchronized void m106145h() {
        boolean z;
        boolean z2;
        bkpv bkpv;
        if (this.f124899o == null) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106783b(z, "change skipped");
        if (!this.f124894j.isEmpty()) {
            int i = this.f124907e + 1;
            int i2 = -1;
            while (true) {
                if (this.f124894j.isEmpty()) {
                    break;
                }
                bkps bkps = (bkps) this.f124894j.remove();
                boolean remove = this.f124895k.remove(bkps);
                int i3 = bkps.f125087c;
                if (i3 == i) {
                    if (m106144a(bkps) && bkps.f125087c == this.f124907e + 1 && (bkpv = (bkpv) this.f124905c.peek()) != null) {
                        Long l = bkps.f125090f;
                        if (l == null) {
                            z2 = true;
                        } else if (l.longValue() == bkpv.f125096a) {
                            z2 = true;
                        }
                        if (!m106144a(bkps) && !z2 && !remove) {
                            i2 = i3;
                        }
                    }
                    z2 = false;
                    if (!m106144a(bkps)) {
                        break;
                    }
                    i2 = i3;
                } else if (i3 > i) {
                    break;
                }
            }
            if (!this.f124902r && i2 != -1) {
                m106142a(i2);
            }
        }
    }

    /* renamed from: i */
    private final boolean m106146i() {
        return this.f124891g != null && this.f124890b == 0 && mo66122f();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkws.a(bkwp, bkwq):void
     arg types: [bkwn, bkwr]
     candidates:
      bkws.a(blhf, blhf):bkwk
      bkws.a(java.util.List, blhg):blhg
      bkws.a(bkwq, bkwq):void
      bkws.a(bkwp, bkwq):void */
    /* renamed from: b */
    public final synchronized bkqi mo66117b() {
        bkqw bkqw;
        if (mo66118c()) {
            boolean z = true;
            if (this.f124900p) {
                this.f124905c.pop();
                this.f124890b = Math.max(this.f124890b - 1, 0);
                this.f124907e++;
                mo66119d();
                this.f124899o = null;
                this.f124900p = false;
                m106145h();
                return bkqi.f125113a;
            }
            bkps bkps = this.f124899o;
            String str = bkps.f125088d;
            if (m106144a(bkps)) {
                bkqw = bkqw.f125125c;
                Logger logger = this.f124889a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.f124899o);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94);
                sb.append("Received change from server for current session that has not beenapplied; treating as remote: ");
                sb.append(valueOf);
                logger.logp(level, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "applyNextChange", sb.toString());
            } else {
                bkqw = str != null ? bkqw.m106336a(str) : bkqw.f125125c;
            }
            int i = this.f124899o.f125089e;
            if (i <= this.f124907e) {
                z = false;
            }
            bkww.m106783b(z, "newAppliedRevision must be > appliedRevision");
            this.f124907e = i;
            bkws bkws = bkws.f125357a;
            LinkedList linkedList = this.f124905c;
            blhg blhg = this.f124899o.f125085a;
            bkwn bkwn = new bkwn(linkedList);
            bkwr bkwr = new bkwr(blhg);
            bkws.mo66395a((bkwp) bkwn, (bkwq) bkwr);
            bkqi a = this.f124893i.mo66103a(bkwr.f125355a, bkqw);
            this.f124899o = null;
            this.f124900p = false;
            m106145h();
            return a;
        }
        return bkqi.f125113a;
    }

    /* renamed from: c */
    public final synchronized boolean mo66118c() {
        return this.f124899o != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: d */
    public final synchronized void mo66119d() {
        if (!this.f124897m && m106146i()) {
            long currentTimeMillis = System.currentTimeMillis() - this.f124898n;
            if (currentTimeMillis < 0) {
                this.f124889a.logp(Level.WARNING, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "sendOrScheduleIfReady", "Detected system clock skew.");
                currentTimeMillis = 0;
            }
            long max = Math.max(0L, 200 - currentTimeMillis);
            this.f124897m = true;
            this.f124892h.mo28446a(this.f124903s, (int) max);
        }
    }

    /* renamed from: e */
    public final synchronized void mo66120e() {
        long j;
        this.f124897m = false;
        if (m106146i()) {
            this.f124898n = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            if (!this.f124905c.isEmpty()) {
                Logger logger = this.f124889a;
                Level level = Level.INFO;
                int size = this.f124905c.size();
                StringBuilder sb = new StringBuilder(52);
                sb.append("Sending ");
                sb.append(size);
                sb.append(" operation(s) to Realtime server.");
                logger.logp(level, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "send", sb.toString());
                j = ((bkpv) this.f124905c.get(0)).f125096a;
                Iterator it = this.f124905c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bkpv bkpv = (bkpv) it.next();
                    if (bkpv.f125096a != j) {
                        break;
                    }
                    arrayList.add(bkpv.f125097b);
                }
            } else {
                j = this.f124901q;
            }
            this.f124890b = arrayList.size();
            bkpy bkpy = new bkpy(this.f124907e, j, arrayList);
            long j2 = this.f124901q;
            if (j2 == j) {
                this.f124901q = j2 + 1;
            }
            this.f124891g.mo66141a(bkpy, this.f124896l);
        }
    }

    /* renamed from: a */
    private final boolean m106144a(bkps bkps) {
        return this.f124906d.equals(bkps.f125088d);
    }

    /* renamed from: a */
    public final synchronized bkpv mo66114a(blhg blhg) {
        bkpv bkpv;
        bkpv = new bkpv(this.f124901q, blhg, System.currentTimeMillis());
        this.f124905c.add(bkpv);
        mo66119d();
        return bkpv;
    }

    /* renamed from: a */
    public final void mo66115a() {
        m106142a(-1);
    }

    /* renamed from: a */
    public final void mo66116a(Collection collection, boolean z) {
        synchronized (this) {
            if (z) {
                this.f124895k.addAll(collection);
            }
            this.f124894j.addAll(collection);
            if (this.f124899o == null) {
                m106145h();
            }
        }
        this.f124908f.mo27174a(this);
        mo66119d();
    }
}
