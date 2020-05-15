package p000;

import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: myw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myw implements myt {

    /* renamed from: a */
    public static final lvn f34971a = new lvn("FullBackupWrapper");

    /* renamed from: b */
    public ndb f34972b;

    /* renamed from: c */
    public myq f34973c;

    /* renamed from: d */
    public final AtomicInteger f34974d = new AtomicInteger(0);

    /* renamed from: e */
    public final Object f34975e = new Object();

    /* renamed from: f */
    public final Context f34976f;

    /* renamed from: g */
    public final String f34977g;

    /* renamed from: h */
    public mys f34978h;

    /* renamed from: i */
    public volatile boolean f34979i;

    /* renamed from: j */
    public volatile boolean f34980j;

    /* renamed from: k */
    public long f34981k;

    /* renamed from: l */
    public final nds f34982l;

    /* renamed from: m */
    public int f34983m;

    /* renamed from: n */
    public bxvd f34984n;

    /* renamed from: o */
    private bzsq f34985o;

    /* renamed from: p */
    private final lvx f34986p;

    /* renamed from: q */
    private InputStream f34987q;

    /* renamed from: r */
    private boolean f34988r;

    /* renamed from: s */
    private bmxv f34989s;

    /* renamed from: t */
    private final bzsu f34990t = new myv(this);

    public myw(Context context, myu myu, String str, lvx lvx, nds nds) {
        sdo.m34959a(context);
        this.f34976f = context;
        sdo.m34959a(myu);
        sdo.m34959a(lvx);
        this.f34986p = lvx;
        sdo.m34959a((Object) str);
        this.f34977g = str;
        sdo.m34959a(nds);
        this.f34982l = nds;
    }

    /* renamed from: a */
    private final void m25784a(boolean z) {
        int i;
        bxvd bxvd = this.f34982l.f35360c;
        if (!z) {
            i = 5;
        } else {
            i = 6;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34433f = i - 1;
        mrj.f34428a |= 16;
        m25786h();
    }

    /* renamed from: g */
    private final void m25785g() {
        synchronized (this.f34975e) {
            while (this.f34974d.get() == 0) {
                try {
                    if (ccnu.m130914b()) {
                        f34971a.mo25409a("Waiting for backup uploading to complete.", new Object[0]);
                    }
                    this.f34975e.wait();
                } catch (InterruptedException e) {
                }
            }
        }
        if (this.f34988r) {
            this.f34982l.mo20496a();
        }
        this.f34973c = null;
        this.f34985o = null;
        srz.m36171a((Closeable) this.f34987q);
        this.f34987q = null;
    }

    /* renamed from: h */
    private final void m25786h() {
        this.f34979i = true;
        this.f34973c.mo20319a(naf.CANCELED_BY_FRAMEWORK);
    }

    /* renamed from: a */
    public final void mo20334a(mys mys) {
        this.f34978h = mys;
    }

    /* renamed from: b */
    public final void mo20336b() {
        bxvd bxvd = this.f34982l.f35360c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34433f = 2;
        mrj.f34428a |= 16;
        m25786h();
        m25785g();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final int mo20337c() {
        blbn a;
        if (!ccmn.m130690b() || !this.f34989s.mo66813a() || ((Pair) this.f34989s.mo66814b()).second == null || (a = this.f34972b.mo20473a()) == null || !a.equals(((Pair) this.f34989s.mo66814b()).second)) {
            myq myq = this.f34973c;
            myq.f34957g.lock();
            try {
                myq.f34955e.set(false);
                myq.f34958h.signalAll();
                myq.f34950a.mo25409a("[FINISH] signal no more data.", new Object[0]);
                srz.m36171a((Closeable) myq.f34952b);
                myq.f34957g.unlock();
                m25785g();
                int i = this.f34974d.get();
                int i2 = this.f34983m;
                if (i2 != 50008) {
                    if (i2 == 50006) {
                        return -1005;
                    }
                    if (i != 200) {
                        return i / 100 == 5 ? -1000 : -1002;
                    }
                    return 0;
                }
            } catch (Throwable th) {
                myq.f34957g.unlock();
                throw th;
            }
        } else {
            f34971a.mo25414c("Backup data is not changed since the last full backup, aborting transfer.", new Object[0]);
            bxvd bxvd = this.f34982l.f35360c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            mrj mrj = (mrj) bxvd.f164949b;
            mrj mrj2 = mrj.f34426i;
            mrj.f34433f = 14;
            mrj.f34428a |= 16;
            this.f34980j = true;
            this.f34973c.mo20319a(naf.BACKUP_UNCHANGED);
            m25785g();
            return 0;
        }
    }

    /* renamed from: d */
    public final void mo20338d() {
        this.f34988r = false;
        bxvd bxvd = this.f34982l.f35360c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34433f = 10;
        mrj.f34428a |= 16;
        m25786h();
    }

    /* renamed from: e */
    public final void mo20339e() {
        m25784a(true);
    }

    /* renamed from: f */
    public final void mo20340f() {
        m25784a(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final int mo20332a(int i) {
        boolean z;
        Lock lock;
        if (this.f34973c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "pushData() was called before initiate().");
        if (this.f34983m == 50006 && ccog.m130999c()) {
            return -1005;
        }
        long j = (long) i;
        this.f34981k += j;
        myq myq = this.f34973c;
        myq.f34957g.lock();
        try {
            lvn lvn = myq.f34950a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("[PUSH] Push ");
            sb.append(i);
            sb.append(" bytes into pipe.");
            lvn.mo25409a(sb.toString(), new Object[0]);
            myq.f34953c += j;
            myq.f34950a.mo25409a("[PUSH] signal data available.", new Object[0]);
            myq.f34958h.signalAll();
            while (myq.f34954d != myq.f34953c && !myq.f34956f.get()) {
                myq.f34950a.mo25409a("[PUSH] Wait for data been processed.", new Object[0]);
                myq.f34959i.await();
            }
            if (myq.f34956f.get()) {
                myq.f34950a.mo25418e("Data stream has transfer exception or unexpected http response.", new Object[0]);
                lock = myq.f34957g;
                lock.unlock();
                return -1002;
            }
            myq.f34957g.unlock();
            return 0;
        } catch (InterruptedException e) {
            myq.f34950a.mo25418e("InterruptedException when waiting for data processed", new Object[0]);
            lock = myq.f34957g;
        } catch (Throwable th) {
            myq.f34957g.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo20333a() {
        boolean z;
        if (this.f34985o != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "start() was called before initiate().");
        this.f34981k = 0;
        this.f34988r = true;
        this.f34985o.mo74567a();
    }

    /* renamed from: a */
    public final boolean mo20335a(InputStream inputStream, bxvd bxvd) {
        lvn lvn = f34971a;
        String valueOf = String.valueOf(this.f34977g);
        lvn.mo25414c(valueOf.length() == 0 ? new String("create full backup for : ") : "create full backup for : ".concat(valueOf), new Object[0]);
        this.f34987q = inputStream;
        String str = this.f34982l.f35359b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        lth lth = (lth) bxvd.f164949b;
        lth lth2 = lth.f32914q;
        str.getClass();
        lth.f32916a |= 4;
        lth.f32919d = str;
        this.f34984n = bxvd;
        MessageDigest b = spn.m35868b("SHA-1");
        if (b == null) {
            f34971a.mo25416d("No such message digest algorithm found : SHA-1", new Object[0]);
        }
        lvn lvn2 = ncz.f35303a;
        ndb ndb = new ndb(inputStream, new blbl(blbf.m106974a(1024)), b);
        this.f34972b = ndb;
        this.f34973c = new myq(ndb);
        bmxv a = ncz.m25945a(this.f34976f, this.f34977g);
        this.f34989s = a;
        if (a.mo66813a()) {
            try {
                this.f34985o = this.f34986p.mo19687a((lth) bxvd.mo74062i(), (String) ((Pair) this.f34989s.mo66814b()).first, b, ncz.m25946a((blbn) ((Pair) this.f34989s.mo66814b()).second, new ncx(this.f34973c), snp.m35704b(10)));
            } catch (IOException e) {
                f34971a.mo25418e("Fail to generate binary diff data stream.", new Object[0]);
                this.f34982l.mo20497a(13);
                return false;
            }
        } else {
            this.f34985o = this.f34986p.mo19688a((lth) bxvd.mo74062i(), b, this.f34973c);
        }
        this.f34985o.mo74568a(this.f34990t, 1);
        return true;
    }
}
