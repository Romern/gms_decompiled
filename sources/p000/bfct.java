package p000;

import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* renamed from: bfct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfct {

    /* renamed from: a */
    final bgmm f113432a;

    /* renamed from: b */
    private bfcr f113433b;

    /* renamed from: c */
    private long f113434c = -1;

    /* renamed from: d */
    private final bhco f113435d;

    public bfct(bgmm bgmm, bhco bhco) {
        this.f113432a = bgmm;
        this.f113435d = bhco;
        mo61407b(m96367m());
    }

    /* renamed from: a */
    private static final File m96363a(bgmm bgmm) {
        if (bgmm.mo62783c() != null) {
            return new File(bgmm.mo62783c(), "nlp_params");
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsax.b(int, long):void
     arg types: [int, int]
     candidates:
      bsax.b(int, double):void
      bsax.b(int, float):void
      bsax.b(int, java.lang.Object):void
      bsax.b(int, boolean):void
      bsax.b(int, int):byte[]
      bsax.b(int, long):void */
    /* renamed from: m */
    public static bsax m96367m() {
        bsax bsax = new bsax(bgox.f117088bb);
        bsax.mo70117b(3, -2L);
        return bsax;
    }

    /* renamed from: n */
    public static final synchronized bfcs m96368n() {
        bfcs bfcs;
        synchronized (bfct.class) {
            bfcs = new bfcs(120000, 120000, 86400000);
        }
        return bfcs;
    }

    /* renamed from: o */
    public static final synchronized bfcs m96369o() {
        bfcs bfcs;
        synchronized (bfct.class) {
            bfcs = new bfcs(76800, 12800, 14400000);
        }
        return bfcs;
    }

    /* renamed from: p */
    public static final synchronized bfcs m96370p() {
        bfcs bfcs;
        synchronized (bfct.class) {
            bfcs = new bfcs(600000, 120000, 86400000);
        }
        return bfcs;
    }

    /* renamed from: q */
    public static final synchronized bfcs m96371q() {
        bfcs bfcs;
        synchronized (bfct.class) {
            bfcs = new bfcs(1260000, 1260000, 86400000);
        }
        return bfcs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        if (r1 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        m96364a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r1 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd A[SYNTHETIC, Splitter:B:31:0x00bd] */
    /* renamed from: s */
    private final synchronized void m96372s() {
        File a = m96363a(this.f113432a);
        if (a != null) {
            DataOutputStream dataOutputStream = null;
            try {
                if (!m96365a(this.f113433b)) {
                    if (!a.exists()) {
                        a.createNewFile();
                    }
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(a)));
                    try {
                        dataOutputStream2.writeShort(2);
                        dataOutputStream2.writeLong(this.f113434c + bgof.m99492e());
                        bfcr bfcr = this.f113433b;
                        bsax bsax = new bsax(bgox.f117088bb);
                        bsax.mo70134g(1, bfcr.f113417a);
                        bsax.mo70134g(11, bfcr.f113418b);
                        bsax.mo70119b(5, bfcr.f113419c);
                        bsax.mo70119b(6, bfcr.f113420d);
                        bsax.mo70119b(7, bfcr.f113421e);
                        bsax.mo70119b(8, bfcr.f113422f);
                        bsax.mo70134g(17, bfcr.f113423g);
                        bsax.mo70134g(18, bfcr.f113424h);
                        bsax.mo70134g(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, bfcr.f113425i);
                        bsax.mo70134g(16, bfcr.f113427k);
                        bsax.mo70117b(3, bfcr.f113428l);
                        bsax bsax2 = new bsax(bgox.f117089bc);
                        bsax2.mo70134g(1, bfcr.f113426j);
                        bsax.mo70118b(50, bsax2);
                        dataOutputStream2.write(bsax.mo70120b());
                        dataOutputStream = dataOutputStream2;
                    } catch (IOException e) {
                        dataOutputStream = dataOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                        }
                        throw th;
                    }
                } else if (a.exists()) {
                    a.delete();
                }
            } catch (IOException e2) {
            } catch (Throwable th2) {
                th = th2;
                if (dataOutputStream != null) {
                    m96364a(dataOutputStream);
                }
                throw th;
            }
        }
    }

    /* renamed from: t */
    private final synchronized void m96373t() {
        if (!m96365a(this.f113433b) && m96366a(this.f113433b, this.f113434c)) {
            m96374u();
        }
    }

    /* renamed from: u */
    private final synchronized void m96374u() {
        int i = this.f113433b.f113417a;
        mo61407b(m96367m());
        int i2 = this.f113433b.f113417a;
        this.f113434c = -1;
        if (i != i2) {
            this.f113435d.mo62906a(this);
        }
    }

    /* renamed from: b */
    public final synchronized void mo61407b(bsax bsax) {
        this.f113433b = new bfcr(bsax);
    }

    /* renamed from: c */
    public final synchronized int mo61409c() {
        m96373t();
        return this.f113433b.f113417a;
    }

    /* renamed from: d */
    public final synchronized int mo61410d() {
        m96373t();
        return this.f113433b.f113418b;
    }

    /* renamed from: e */
    public final synchronized boolean mo61411e() {
        m96373t();
        return this.f113433b.f113419c;
    }

    /* renamed from: f */
    public final synchronized boolean mo61412f() {
        m96373t();
        return this.f113433b.f113421e;
    }

    /* renamed from: g */
    public final synchronized boolean mo61413g() {
        m96373t();
        return this.f113433b.f113422f;
    }

    /* renamed from: h */
    public final synchronized int mo61414h() {
        m96373t();
        return this.f113433b.f113423g;
    }

    /* renamed from: i */
    public final synchronized int mo61415i() {
        m96373t();
        return (int) (((long) this.f113433b.f113424h) * 1000);
    }

    /* renamed from: j */
    public final synchronized int mo61416j() {
        m96373t();
        return this.f113433b.f113425i;
    }

    /* renamed from: k */
    public final synchronized int mo61417k() {
        m96373t();
        return this.f113433b.f113426j;
    }

    /* renamed from: l */
    public final synchronized long mo61418l() {
        m96373t();
        return ((long) this.f113433b.f113427k) * 1000;
    }

    /* renamed from: r */
    public final synchronized void mo61419r() {
        m96373t();
        boolean z = this.f113433b.f113420d;
    }

    /* renamed from: b */
    public final synchronized boolean mo61408b() {
        m96373t();
        return m96365a(this.f113433b);
    }

    /* renamed from: a */
    private static final void m96364a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    private static final boolean m96365a(bfcr bfcr) {
        return bfcr.f113428l == -2;
    }

    /* renamed from: a */
    private static final boolean m96366a(bfcr bfcr, long j) {
        if (m96365a(bfcr) || j + (bfcr.f113428l * 1000) >= SystemClock.elapsedRealtime()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo61405a() {
        DataInputStream dataInputStream;
        File a = m96363a(this.f113432a);
        if (a == null) {
            m96374u();
        } else if (a.exists()) {
            try {
                dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(a)));
                try {
                    if (dataInputStream.readUnsignedShort() == 2) {
                        long readLong = dataInputStream.readLong();
                        long currentTimeMillis = System.currentTimeMillis();
                        long elapsedRealtime = currentTimeMillis - SystemClock.elapsedRealtime();
                        if (readLong > currentTimeMillis) {
                            readLong = currentTimeMillis;
                        }
                        long j = readLong - elapsedRealtime;
                        bsax a2 = bhcr.m100642a(dataInputStream, bgox.f117088bb);
                        if (m96366a(new bfcr(a2), j)) {
                            m96374u();
                        } else {
                            synchronized (this) {
                                mo61407b(a2);
                                this.f113434c = j;
                                if (this.f113433b.f113417a != 0) {
                                    this.f113435d.mo62906a(this);
                                }
                            }
                        }
                    } else {
                        m96374u();
                    }
                } catch (IOException e) {
                    m96374u();
                }
                m96364a(dataInputStream);
            } catch (FileNotFoundException e2) {
                m96374u();
            } catch (Throwable th) {
                m96364a(dataInputStream);
                throw th;
            }
        }
        Locale locale = Locale.US;
        new Object[1][0] = Integer.valueOf(this.f113433b.f113417a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsax.b(int, long):void
     arg types: [int, int]
     candidates:
      bsax.b(int, double):void
      bsax.b(int, float):void
      bsax.b(int, java.lang.Object):void
      bsax.b(int, boolean):void
      bsax.b(int, int):byte[]
      bsax.b(int, long):void */
    /* renamed from: a */
    public final synchronized void mo61406a(bsax bsax) {
        if (bsax != null) {
            if (bsax.mo70124c(3) == -2) {
                bsax.mo70117b(3, -3L);
            }
            int i = this.f113433b.f113417a;
            mo61407b(bsax);
            long j = (long) this.f113433b.f113417a;
            this.f113434c = SystemClock.elapsedRealtime();
            if (j != ((long) i)) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Updating NlpParameters. New version: ");
                sb.append(j);
                sb.toString();
                m96372s();
                this.f113435d.mo62906a(this);
            }
        }
    }
}
