package p000;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Locale;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bfgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgl extends adzt implements bfef {

    /* renamed from: a */
    final /* synthetic */ bfgm f113767a;

    /* renamed from: b */
    private final ReentrantLock f113768b;

    /* renamed from: c */
    private final Condition f113769c;

    /* renamed from: d */
    private volatile int f113770d = 0;

    /* renamed from: e */
    private volatile boolean f113771e = false;

    /* renamed from: f */
    private final bfgj f113772f = new bfgj();

    /* renamed from: h */
    private final bfez f113773h = new bfez();

    /* renamed from: i */
    private volatile boolean f113774i = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfgl(bfgm bfgm, Looper looper) {
        super(looper);
        this.f113767a = bfgm;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f113768b = reentrantLock;
        this.f113769c = reentrantLock.newCondition();
    }

    /* renamed from: a */
    private final void m96651a(bsax bsax, bfgp bfgp) {
        try {
            int b = bsax.mo70129e(6).mo70114b(3);
            if (bfgp.f113792a) {
                bhdb bhdb = this.f113767a.f113797i;
                Locale locale = Locale.US;
                bfgm bfgm = this.f113767a;
                Object[] objArr = {Integer.valueOf(b), bfgm.f113778d};
                if (bfgm.f113796h != null) {
                    bsax bsax2 = bfgp.f113793b;
                    bmxy.m108581a(bsax2);
                    bfgm bfgm2 = this.f113767a;
                    bfgm2.f113796h.mo61493a(bfgm2.f113778d, b, bsax2);
                }
            } else {
                this.f113773h.mo61569a();
                if (this.f113773h.mo61570b() > 3) {
                    bhdb bhdb2 = this.f113767a.f113797i;
                    this.f113774i = true;
                }
                String str = bfgp.f113795d;
                bhdb bhdb3 = this.f113767a.f113797i;
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(b);
                if (str == null) {
                    str = "none";
                }
                objArr2[1] = str;
                bfgm bfgm3 = this.f113767a;
                bfgm3.mo61661a(bsax, bfgp, b, bfgm3.f113778d);
            }
            this.f113768b.lock();
            try {
                this.f113770d--;
                m96652b();
                this.f113769c.signalAll();
            } finally {
                this.f113768b.unlock();
            }
        } catch (Throwable th) {
            this.f113768b.lock();
            this.f113770d--;
            m96652b();
            this.f113769c.signalAll();
            throw th;
        } finally {
            this.f113768b.unlock();
        }
    }

    /* renamed from: b */
    private final boolean m96652b() {
        if (this.f113770d != 0 || !this.f113771e) {
            return false;
        }
        sendEmptyMessage(3);
        return true;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        boolean z = false;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            bsax bsax = (bsax) pair.first;
            bsax bsax2 = (bsax) pair.second;
            bfgm.m96656a(bsax, bsax2, this.f113767a.f113778d);
            if (this.f113774i || this.f113767a.f113777c) {
                String str = !this.f113774i ? "Interrupted by client." : "Too many server errors.";
                m96651a(bsax, new bfgp(null, str.length() == 0 ? new String("Will not send to MASF: ") : "Will not send to MASF: ".concat(str)));
                return;
            }
            bhdb bhdb = this.f113767a.f113797i;
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(bsax.mo70122c()), Integer.valueOf(bsax2.mo70114b(3)), Long.valueOf(SystemClock.uptimeMillis())};
            bffy bffy = this.f113767a.f113776b;
            if (bffy.f113728a != null) {
                bwdg a = bffy.mo61637a("g:loc/uil", bsax);
                synchronized (bffy.f113730c) {
                    bmxy.m108601b(!bffy.f113730c.containsKey(a), "Duplicated request.");
                    bffy.f113730c.put(a, bfne.m97311a(bsax, this));
                }
                bffy.f113728a.mo73469a(a);
                return;
            }
            m96651a(bsax, new bfgp(null, "Can not send to MASF."));
        } else if (i == 2) {
            Pair pair2 = (Pair) message.obj;
            bsax bsax3 = (bsax) pair2.first;
            bfgp bfgp = (bfgp) pair2.second;
            if (this.f113767a.f113778d != null) {
                z = true;
            }
            bmxy.m108601b(z, "session ID should not be null in asynchronized mode.");
            m96651a(bsax3, bfgp);
        } else if (i != 3) {
            bhdb bhdb2 = this.f113767a.f113797i;
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(38);
            sb.append("Message with unexpected tag");
            sb.append(i2);
            sb.toString();
        } else {
            if (this.f113770d == 0) {
                z = true;
            }
            bmxy.m108601b(z, "pending requests are not 0 before quiting.");
            if (this.f113767a.f113779e != null) {
                this.f113767a.f113779e.mo61632a(this.f113767a.f113799k);
                this.f113767a.f113779e.mo61669c();
            }
            bfew bfew = this.f113767a.f113796h;
            if (bfew != null) {
                bfew.mo61505k();
            }
            Looper looper = getLooper();
            bhdb bhdb3 = this.f113767a.f113797i;
            String.valueOf(looper.getThread().getName()).concat(" terminated.");
            looper.quit();
        }
    }

    /* renamed from: a */
    public final synchronized void mo61658a() {
        this.f113771e = true;
        this.f113768b.lock();
        try {
            if (!m96652b()) {
                bhdb bhdb = this.f113767a.f113797i;
                Locale locale = Locale.US;
                new Object[1][0] = Integer.valueOf(this.f113770d);
            }
        } finally {
            this.f113768b.unlock();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61530a(Object obj, Object obj2) {
        bmxy.m108601b(sendMessageAtFrontOfQueue(Message.obtain(this, 2, new Pair(obj, obj2))), "There is pending result before handler thread exits.");
    }

    /* renamed from: a */
    public final synchronized boolean mo61659a(bsax bsax, bsax bsax2, boolean z) {
        ReentrantLock reentrantLock;
        this.f113768b.lock();
        while (!this.f113771e) {
            try {
                if (!this.f113774i) {
                    if (this.f113770d >= 20) {
                        if (!z) {
                            bhdb bhdb = this.f113767a.f113797i;
                            Locale locale = Locale.US;
                            new Object[1][0] = Integer.valueOf(bsax2.mo70114b(3));
                            reentrantLock = this.f113768b;
                            break;
                        }
                        bhdb bhdb2 = this.f113767a.f113797i;
                        Locale locale2 = Locale.US;
                        new Object[1][0] = Integer.valueOf(this.f113770d);
                        this.f113769c.await();
                    } else {
                        Message obtain = Message.obtain(this, 1, new Pair(bsax, bsax2));
                        long a = this.f113772f.mo61655a();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bhdb bhdb3 = this.f113767a.f113797i;
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("upTimeNow=");
                        sb.append(uptimeMillis);
                        sb.append(" scheduledUpTimeMillis=");
                        sb.append(a);
                        sb.toString();
                        boolean sendMessageAtTime = this.f113767a.f113780f.sendMessageAtTime(obtain, a);
                        if (sendMessageAtTime) {
                            this.f113770d++;
                            this.f113772f.mo61656b();
                        }
                        this.f113768b.unlock();
                        return sendMessageAtTime;
                    }
                } else {
                    bhdb bhdb4 = this.f113767a.f113797i;
                    reentrantLock = this.f113768b;
                    break;
                }
            } catch (InterruptedException e) {
                reentrantLock = this.f113768b;
            } catch (Throwable th) {
                this.f113768b.unlock();
                throw th;
            }
        }
        bhdb bhdb5 = this.f113767a.f113797i;
        reentrantLock = this.f113768b;
        reentrantLock.unlock();
        return false;
    }
}
