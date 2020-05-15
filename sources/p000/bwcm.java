package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bwcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcm {

    /* renamed from: a */
    protected static bwcm f158828a;

    /* renamed from: b */
    protected bsbc f158829b;

    /* renamed from: c */
    protected bwcy f158830c;

    /* renamed from: d */
    protected ArrayList f158831d = new ArrayList();

    /* renamed from: e */
    protected HashMap f158832e = new HashMap();

    /* renamed from: f */
    public final Object f158833f = new Object();

    /* renamed from: g */
    public int f158834g = 0;

    /* renamed from: h */
    public int f158835h = 0;

    /* renamed from: i */
    protected long f158836i;

    /* renamed from: j */
    protected long f158837j;

    /* renamed from: k */
    protected bsbd f158838k;

    /* renamed from: l */
    protected bsbd f158839l;

    /* renamed from: m */
    private bwcs f158840m;

    /* renamed from: n */
    private String f158841n;

    /* renamed from: o */
    private int f158842o = 0;

    /* renamed from: p */
    private final Random f158843p = new Random();

    /* renamed from: q */
    private final ThreadPoolExecutor f158844q;

    protected bwcm(bwcl bwcl) {
        this.f158830c = new bwcy(bwcl.f158824b, bwcl.f158825c, bwcl.f158826d, bwcl.f158827e, "g");
        bsbc bsbc = new bsbc("MSMuxTR");
        this.f158829b = bsbc;
        synchronized (bsbc.f143926c) {
            if (!bsbc.f143929f) {
                bsbc.f143929f = true;
                char c = 0;
                while (true) {
                    Thread[] threadArr = bsbc.f143927d;
                    if (c > 0) {
                        break;
                    }
                    String str = bsbc.f143928e;
                    StringBuilder sb = new StringBuilder(str.length() + 12);
                    sb.append(str);
                    sb.append("-");
                    sb.append(0);
                    threadArr[0] = new Thread(bsbc, sb.toString());
                    bsbc.f143927d[0].start();
                    c = 1;
                }
            }
        }
        this.f158841n = bwcl.f158823a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 15, 5, TimeUnit.MINUTES, new LinkedBlockingQueue(), new bwck());
        this.f158844q = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f158840m = new bwcs(this.f158829b, this.f158844q);
        this.f158838k = new bsbd(this.f158829b, new bwch(this));
        this.f158839l = new bsbd(this.f158829b, new bwci(this));
    }

    /* renamed from: a */
    public static synchronized bwcm m121749a() {
        bwcm bwcm;
        synchronized (bwcm.class) {
            bwcm = f158828a;
        }
        return bwcm;
    }

    /* renamed from: b */
    public final void mo73466b() {
        synchronized (this.f158833f) {
            this.f158839l.mo70150a();
            long j = -1;
            for (bwdg bwdg : this.f158832e.keySet()) {
                if (bwdg.f158892e) {
                    this.f158832e.remove(bwdg);
                } else {
                    long j2 = bwdg.f158890c;
                    if (j2 != -1 && (j == -1 || j > j2)) {
                        j = j2;
                    }
                }
            }
            if (j != -1) {
                this.f158839l.mo70160b(j);
                this.f158839l.mo70161f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo73467c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 10 + currentTimeMillis;
        long j2 = this.f158837j;
        if (j2 == 0) {
            this.f158836i = currentTimeMillis + 100;
            this.f158837j = j;
            this.f158838k.mo70160b(j);
            this.f158838k.mo70161f();
            return;
        }
        long j3 = this.f158836i;
        if (j < j3) {
            this.f158837j = j;
        } else if (j2 < j3) {
            this.f158837j = j3;
        }
    }

    /* renamed from: d */
    public final synchronized int mo73468d() {
        int i;
        i = this.f158842o + 1;
        this.f158842o = i;
        return i;
    }

    /* renamed from: a */
    public static synchronized void m121750a(bwcl bwcl) {
        synchronized (bwcm.class) {
            if (f158828a == null) {
                f158828a = new bwcm(bwcl);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73464a(ArrayList arrayList) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        bwdg bwdg;
        int size = arrayList.size();
        bwdg[] bwdgArr = new bwdg[size];
        arrayList.toArray(bwdgArr);
        if (size == 0) {
            inputStream = this.f158830c.mo73459b();
        } else {
            inputStream = new SequenceInputStream(this.f158830c.mo73459b(), bwdgArr[0].mo73459b());
            int i = 1;
            while (i < size) {
                i++;
                inputStream = new SequenceInputStream(inputStream, bwdgArr[i].mo73459b());
            }
        }
        bwcq bwcq = new bwcq(this.f158840m, this.f158841n);
        bwcq.mo73486a(DataParser.CONNECT_TYPE_POST);
        int available = inputStream.available();
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(32);
            byte[] bArr = new byte[512];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            bsat.m114961a(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bsat.m114960a(inputStream);
            bwcq.mo73487a(byteArray);
            if (size != 0) {
                bwdg = bwdgArr[this.f158843p.nextInt(size)];
            } else {
                bwdg = null;
            }
            if (bwdg != null) {
                bwcq.f158852c = bwdg.mo73510i();
                bwcq.f158851b = 1536;
            }
            bwcq.mo73493k();
            bwcq.mo73489b("application/binary");
            bwcq.mo73470a(new bsbb(this.f158829b, new bwcj(this, bwcq, bwdgArr, available)));
            bwcq.f158850a.f158867b.execute(bwcq);
        } catch (Throwable th) {
            bsat.m114960a(inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo73465a(bwdg[] bwdgArr, Exception exc) {
        bwdf g;
        synchronized (this.f158833f) {
            for (bwdg bwdg : bwdgArr) {
                if (bwdg != null) {
                    if (bwdg.mo73511j() && (g = bwdg.mo73508g()) != null) {
                        g.mo61639a(bwdg, exc);
                    }
                }
            }
        }
    }
}
