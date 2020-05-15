package p000;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pkn {

    /* renamed from: a */
    public static pkn f39488a;

    /* renamed from: b */
    public final qav f39489b = new qav("CastSocketMultiplexer");

    /* renamed from: c */
    public volatile boolean f39490c;

    /* renamed from: d */
    public volatile Throwable f39491d;

    /* renamed from: e */
    public CountDownLatch f39492e;

    /* renamed from: f */
    private final List f39493f;

    /* renamed from: g */
    private List f39494g;

    /* renamed from: h */
    private List f39495h;

    /* renamed from: i */
    private final Map f39496i;

    /* renamed from: j */
    private Selector f39497j;

    /* renamed from: k */
    private volatile boolean f39498k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile Thread f39499l;

    /* renamed from: m */
    private final AtomicBoolean f39500m;

    /* renamed from: n */
    private final Context f39501n;

    /* renamed from: o */
    private final Intent f39502o;

    /* renamed from: p */
    private final asfb f39503p;

    /* renamed from: q */
    private final ScheduledExecutorService f39504q;

    /* renamed from: r */
    private final phy f39505r;

    /* renamed from: s */
    private final Object f39506s = new Object();

    /* renamed from: t */
    private final Object f39507t = new Object();

    /* renamed from: u */
    private final boolean f39508u = ccyh.f180261a.mo6606a().mo77072e();

    /* renamed from: v */
    private final boolean f39509v = ccyk.f180269a.mo6606a().mo77075a();

    /* renamed from: w */
    private final AtomicBoolean f39510w = new AtomicBoolean();

    public pkn(Context context, phy phy, ScheduledExecutorService scheduledExecutorService) {
        this.f39504q = scheduledExecutorService;
        this.f39505r = phy;
        this.f39493f = new ArrayList();
        this.f39494g = new ArrayList();
        this.f39495h = new ArrayList();
        this.f39500m = new AtomicBoolean(false);
        this.f39501n = context;
        Intent intent = new Intent();
        this.f39502o = intent;
        intent.setClassName(context, "com.google.android.gms.cast.service.CastSocketMultiplexerLifeCycleService");
        this.f39503p = new asfb(context, 1, "CastSocketMultiplexer_WakeLock", null, "com.google.android.gms");
        this.f39496i = Collections.synchronizedMap(new HashMap());
    }

    /* renamed from: a */
    private static String m30713a(SelectionKey selectionKey) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "isValid:%b ", Boolean.valueOf(selectionKey.isValid())));
        try {
            sb.append(selectionKey.readyOps());
            sb.append(": ");
            sb.append(String.format(Locale.ROOT, "isAcceptable:%b ", Boolean.valueOf(selectionKey.isAcceptable())));
            sb.append(String.format(Locale.ROOT, "isConnectable:%b ", Boolean.valueOf(selectionKey.isConnectable())));
            sb.append(String.format(Locale.ROOT, "isReadable:%b ", Boolean.valueOf(selectionKey.isReadable())));
            sb.append(String.format(Locale.ROOT, "isWritable:%b ", Boolean.valueOf(selectionKey.isWritable())));
        } catch (CancelledKeyException e) {
            sb.append(String.format(Locale.ROOT, "Error calling readyOps(%s) ", e.getMessage()));
        }
        Object attachment = selectionKey.attachment();
        if (attachment == null) {
            sb.append("No attached cast socket. ");
        } else if (attachment instanceof pkk) {
            sb.append((pkk) attachment);
        } else {
            sb.append("Unknown attached object");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private final void m30715b(pkk pkk) {
        if (this.f39496i.containsKey(pkk)) {
            this.f39503p.mo49122c(pkk.f39463b);
            synchronized (this.f39496i) {
                this.f39496i.remove(pkk);
            }
        }
    }

    /* renamed from: c */
    private final void m30716c(pkk pkk) {
        if (this.f39509v) {
            this.f39493f.remove(pkk);
        } else {
            synchronized (this.f39506s) {
                this.f39493f.remove(pkk);
            }
        }
        if (pkk.f39464c) {
            this.f39503p.mo49122c(pkk.f39463b);
            synchronized (this.f39496i) {
                this.f39496i.remove(pkk);
            }
        }
    }

    /* renamed from: g */
    private final void m30717g() {
        if (this.f39490c) {
            StringBuilder sb = new StringBuilder();
            sb.append("selector thread aborted ");
            if (this.f39491d != null) {
                sb.append(String.format(Locale.ROOT, "\"%s\"", this.f39491d.getMessage()));
                StringWriter stringWriter = new StringWriter();
                bqye.m113760a(this.f39491d, new PrintWriter(stringWriter));
                sb.append("Stack Trace: ");
                sb.append(stringWriter);
            } else {
                sb.append("unknown condition");
            }
            throw new IllegalStateException(sb.toString());
        } else if (this.f39499l == null) {
            throw new IllegalStateException("not started; call start()");
        }
    }

    /* renamed from: h */
    private final synchronized boolean m30718h() {
        boolean z;
        z = !this.f39496i.isEmpty();
        for (pkk pkk : this.f39496i.keySet()) {
            this.f39503p.mo49122c(pkk.f39463b);
        }
        synchronized (this.f39496i) {
            this.f39496i.clear();
        }
        return z;
    }

    /* renamed from: i */
    private final void m30719i() {
        this.f39489b.mo23861b("waking up the selector.");
        this.f39510w.set(true);
        this.f39497j.wakeup();
    }

    /* renamed from: d */
    public final boolean mo23325d() {
        boolean z = true;
        if (this.f39509v) {
            synchronized (this.f39507t) {
                if (!this.f39493f.isEmpty() || !this.f39494g.isEmpty()) {
                    z = false;
                }
            }
            return z;
        }
        synchronized (this.f39506s) {
            if (!this.f39493f.isEmpty() || !this.f39494g.isEmpty()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final void mo23326e() {
        if (m30718h()) {
            this.f39489b.mo23677d("disposeWakeLock: Unbalanced call in releasing the wake lock.", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r6.f39508u != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r6.f39499l.join(2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r1.join(2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r6.f39499l = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        mo23326e();
     */
    /* renamed from: f */
    public final synchronized void mo23327f() {
        this.f39489b.mo23673b("Stopping multiplexer...", new Object[0]);
        this.f39498k = true;
        this.f39491d = null;
        if (this.f39497j != null) {
            m30719i();
        }
        while (true) {
            Thread thread = this.f39499l;
            if (this.f39508u) {
                if (thread == null) {
                    break;
                }
            } else if (this.f39499l == null) {
                break;
            }
            try {
                break;
            } catch (InterruptedException e) {
                mo23326e();
            } catch (IOException e2) {
                this.f39489b.mo23676c(e2, "Error closing selector", new Object[0]);
            } catch (Throwable th) {
                mo23326e();
                throw th;
            }
        }
        Selector selector = this.f39497j;
        if (selector != null) {
            selector.close();
            this.f39497j = null;
        }
        Thread thread2 = this.f39499l;
    }

    /* renamed from: b */
    public final synchronized void mo23323b() {
        m30717g();
        m30719i();
    }

    /* renamed from: c */
    public final void mo23324c() {
        boolean z;
        long j;
        int k;
        int j2;
        int i;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        while (!this.f39498k) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f39500m.getAndSet(false)) {
                if (this.f39509v) {
                    synchronized (this.f39507t) {
                        synchronized (this.f39506s) {
                            List list = this.f39495h;
                            this.f39495h = this.f39494g;
                            this.f39494g = list;
                            list.clear();
                        }
                        for (pkk pkk : this.f39495h) {
                            try {
                                pkk.mo23301a().register(this.f39497j, 0).attach(pkk);
                                this.f39501n.startService(this.f39502o);
                                this.f39493f.add(pkk);
                            } catch (Exception e) {
                                this.f39489b.mo23679f("Error while connecting socket.", new Object[0]);
                                arrayList.add(pkk);
                            }
                        }
                    }
                } else {
                    synchronized (this.f39506s) {
                        for (pkk pkk2 : this.f39494g) {
                            try {
                                pkk2.mo23301a().register(this.f39497j, 0).attach(pkk2);
                                this.f39501n.startService(this.f39502o);
                                this.f39493f.add(pkk2);
                            } catch (Exception e2) {
                                this.f39489b.mo23679f("Error while connecting socket.", new Object[0]);
                                arrayList.add(pkk2);
                            }
                        }
                        this.f39494g.clear();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((pkk) arrayList.get(i2)).mo23307b(2);
                }
                arrayList.clear();
            }
            if (this.f39509v) {
                Iterator it = this.f39493f.iterator();
                z = false;
                while (it.hasNext()) {
                    pkk pkk3 = (pkk) it.next();
                    plh l = pkk3.mo23317l();
                    if (l == null || l.keyFor(this.f39497j) == null) {
                        it.remove();
                        m30715b(pkk3);
                    } else {
                        int a = pkk3.mo23300a(l.keyFor(this.f39497j), elapsedRealtime);
                        if (a != -1) {
                            this.f39489b.mo23856a("*** removing socket %s", pkk3);
                            it.remove();
                            m30715b(pkk3);
                            pkk3.mo23307b(a);
                        } else if (pkk3.mo23309d() || pkk3.mo23310e()) {
                            z = true;
                        }
                    }
                }
            } else {
                synchronized (this.f39506s) {
                    Iterator it2 = this.f39493f.iterator();
                    z2 = false;
                    while (it2.hasNext()) {
                        pkk pkk4 = (pkk) it2.next();
                        plh l2 = pkk4.mo23317l();
                        if (l2 == null || l2.keyFor(this.f39497j) == null) {
                            it2.remove();
                            m30715b(pkk4);
                        } else {
                            int a2 = pkk4.mo23300a(l2.keyFor(this.f39497j), elapsedRealtime);
                            if (a2 != -1) {
                                this.f39489b.mo23856a("*** removing socket %s", pkk4);
                                it2.remove();
                                m30715b(pkk4);
                                pkk4.mo23307b(a2);
                            } else if (pkk4.mo23309d() || pkk4.mo23310e()) {
                                z2 = true;
                            }
                        }
                    }
                }
                z = z2;
            }
            if (mo23325d()) {
                this.f39501n.stopService(this.f39502o);
                if (ccyh.f180261a.mo6606a().mo77073f()) {
                    this.f39504q.execute(new pkl(this));
                }
            }
            if (!z) {
                j = 0;
            } else {
                j = 1000;
            }
            this.f39489b.mo23670a("Selector is sleeping for %d ms. isWakelockHeld: %b", Long.valueOf(j), Boolean.valueOf(this.f39503p.mo49124e()));
            int select = this.f39497j.select(j);
            if (!this.f39510w.getAndSet(false) && !z3 && mo23325d()) {
                this.f39489b.mo23677d("Selector.select() returns %d but isIdle() returns true. Keys size: %d", Integer.valueOf(select), Integer.valueOf(this.f39497j.keys().size()));
                phy phy = this.f39505r;
                if (!phy.f39152e || !ccyh.f180261a.mo6606a().mo77071d()) {
                    z3 = true;
                } else {
                    bpsy i3 = phy.mo23145i();
                    String str = phy.f39158b;
                    if (i3.f164950c) {
                        i3.mo74035c();
                        i3.f164950c = false;
                    }
                    bpsz bpsz = (bpsz) i3.f164949b;
                    bpsz bpsz2 = bpsz.f139036I;
                    str.getClass();
                    bpsz.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    bpsz.f139054h = str;
                    phy.mo23110a((bpsz) i3.mo74062i(), 272);
                    z3 = true;
                }
            }
            this.f39489b.mo23670a("eventCount=%d, wakeLockHeld=%b, connectionActionsPending=%b, mSockets.size=%d, keys.size=%d", Integer.valueOf(select), Boolean.valueOf(this.f39503p.mo49124e()), Boolean.valueOf(z), Integer.valueOf(this.f39493f.size()), Integer.valueOf(this.f39497j.selectedKeys().size()));
            Iterator<SelectionKey> it3 = this.f39497j.selectedKeys().iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                this.f39489b.mo23670a("%d %s", Integer.valueOf(i4), m30713a(it3.next()));
                i4++;
            }
            if (select != 0) {
                if (!this.f39498k) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    for (SelectionKey selectionKey : this.f39497j.selectedKeys()) {
                        pkk pkk5 = (pkk) selectionKey.attachment();
                        if (pkk5.f39464c && !this.f39496i.containsKey(pkk5)) {
                            this.f39503p.mo49113a(pkk5.f39463b);
                            synchronized (this.f39496i) {
                                this.f39496i.put(pkk5, Long.valueOf(elapsedRealtime2));
                            }
                        }
                    }
                    for (SelectionKey selectionKey2 : this.f39497j.selectedKeys()) {
                        try {
                            pkk pkk6 = (pkk) selectionKey2.attachment();
                            if (selectionKey2.isValid() && selectionKey2.isConnectable() && (i = pkk6.mo23314i()) != -1) {
                                this.f39489b.mo23856a("*** removing socket %s (onConnectable)", pkk6);
                                m30716c(pkk6);
                                selectionKey2.cancel();
                                pkk6.mo23307b(i);
                            }
                            if (selectionKey2.isValid() && selectionKey2.isReadable() && (j2 = pkk6.mo23315j()) != -1) {
                                this.f39489b.mo23856a("*** removing socket %s (onReadable)", pkk6);
                                m30716c(pkk6);
                                selectionKey2.cancel();
                                pkk6.mo23307b(j2);
                            }
                            if (selectionKey2.isValid() && selectionKey2.isWritable() && (k = pkk6.mo23316k()) != -1) {
                                this.f39489b.mo23856a("*** removing socket %s (onWritable)", pkk6);
                                m30716c(pkk6);
                                selectionKey2.cancel();
                                pkk6.mo23307b(k);
                            }
                        } catch (CancelledKeyException e3) {
                            this.f39489b.mo23675c("Received a CancelledKeyException exception: %s", e3.getMessage());
                        }
                    }
                    this.f39497j.selectedKeys().clear();
                    m30718h();
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r4.f39492e.await(1, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0043;
     */
    /* renamed from: a */
    public final synchronized void mo23321a() {
        if (this.f39499l == null) {
            this.f39489b.mo23861b("starting multiplexer");
            this.f39492e = new CountDownLatch(1);
            this.f39490c = false;
            this.f39498k = false;
            this.f39497j = Selector.open();
            this.f39499l = new Thread(new pkm(this));
            this.f39499l.setName("CastSocketMultiplexerThread");
            this.f39499l.start();
        }
        return;
        throw new IOException("timed out or interrupted waiting for muxer thread to start");
    }

    /* renamed from: a */
    public final synchronized void mo23322a(pkk pkk) {
        m30717g();
        synchronized (this.f39506s) {
            this.f39501n.startService(this.f39502o);
            this.f39494g.add(pkk);
            this.f39489b.mo23856a("added socket %s", pkk);
            this.f39500m.set(true);
        }
        m30719i();
    }
}
