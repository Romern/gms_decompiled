package p000;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.gms.car.audio.resampling.NativeResampler;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhi implements nxe {

    /* renamed from: a */
    public static final bnsn f35584a = odk.m28481a("CAR.AUDIO");

    /* renamed from: A */
    private boolean f35585A = false;

    /* renamed from: B */
    private final Semaphore f35586B = new Semaphore(0);

    /* renamed from: C */
    private boolean f35587C = false;

    /* renamed from: D */
    private final Object f35588D = new Object();

    /* renamed from: E */
    private final oiu f35589E;

    /* renamed from: b */
    public final nhs f35590b;

    /* renamed from: c */
    public final int f35591c;

    /* renamed from: d */
    public final int f35592d;

    /* renamed from: e */
    public final int f35593e;

    /* renamed from: f */
    public final int f35594f;

    /* renamed from: g */
    public final birv f35595g;

    /* renamed from: h */
    public off f35596h;

    /* renamed from: i */
    public final HandlerThread f35597i;

    /* renamed from: j */
    public nhh f35598j;

    /* renamed from: k */
    public nwz f35599k;

    /* renamed from: l */
    public final Object f35600l = new Object();

    /* renamed from: m */
    public volatile boolean f35601m = false;

    /* renamed from: n */
    public final Context f35602n;

    /* renamed from: o */
    public final npd f35603o;

    /* renamed from: p */
    public final nxd f35604p;

    /* renamed from: q */
    public final int[] f35605q;

    /* renamed from: r */
    public long f35606r = -1;

    /* renamed from: s */
    public final boolean f35607s;

    /* renamed from: t */
    private int f35608t;

    /* renamed from: u */
    private nwz f35609u;

    /* renamed from: v */
    private boolean f35610v = false;

    /* renamed from: w */
    private nxc f35611w;

    /* renamed from: x */
    private final AtomicBoolean f35612x = new AtomicBoolean(false);

    /* renamed from: y */
    private volatile boolean f35613y = false;

    /* renamed from: z */
    private nwy f35614z;

    public nhi(Context context, nhs nhs, npd npd, niw niw, nxd nxd, int i, int i2, birv birv) {
        oiu oiu;
        this.f35602n = context;
        this.f35590b = nhs;
        this.f35603o = npd;
        this.f35604p = nxd;
        this.f35591c = i;
        this.f35592d = i2;
        int i3 = 2;
        if (i != 3) {
            this.f35593e = 2;
        } else {
            this.f35593e = 1;
            i3 = 1;
        }
        this.f35595g = birv;
        this.f35594f = m26262c(i3);
        String d = njp.m26591d(i);
        this.f35597i = new HandlerThread(d.length() == 0 ? new String("AUDIO_BH-") : "AUDIO_BH-".concat(d), -19);
        boolean z = this.f35603o.f36296c.getBoolean("car_enable_audio_latency_dump", false);
        this.f35607s = z;
        if (z) {
            this.f35605q = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        } else {
            this.f35605q = null;
        }
        int e = njp.m26592e(i);
        ScheduledExecutorService a = adzl.f62962b.mo25877a(1, 1);
        long a2 = ccpj.f179685a.mo6606a().mo76583a();
        if (a2 > 0) {
            oiu = new nhr(birv, e, niw, a, a2);
        } else {
            oiu = new nhp();
        }
        this.f35589E = oiu;
    }

    /* renamed from: a */
    private final void m26260a(boolean z, boolean z2) {
        synchronized (this.f35588D) {
            if (this.f35612x.getAndSet(false)) {
                if (this.f35613y) {
                    if (!z2 && this.f35614z != null) {
                        nwy a = this.f35609u.mo21774a();
                        int a2 = a.mo21772a();
                        Arrays.fill(a.f36852b.array(), a2, a.mo21773b() + a2, (byte) 0);
                        m26263c(a);
                    }
                }
                if (ccsh.m131422c()) {
                    synchronized (this.f35600l) {
                        this.f35610v = false;
                        this.f35611w = null;
                    }
                }
                if (this.f35598j.mo20641a(z2, z)) {
                    int i = njp.f35842m;
                    try {
                        this.f35587C |= this.f35586B.tryAcquire(2000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        bnsi c = f35584a.mo68388c();
                        c.mo68437a(e);
                        c.mo68432a("nhi", "a", 382, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Waiting for stream to stop but interrupted");
                    }
                } else {
                    mo20657b(z);
                    try {
                        this.f35586B.acquire();
                    } catch (InterruptedException e2) {
                    }
                }
                return;
            }
            int i2 = njp.f35842m;
        }
    }

    /* renamed from: b */
    public static String m26261b(int i) {
        return i != 1 ? i != 2 ? "UNKNOWN" : "16k-mono" : "48k-stereo";
    }

    /* renamed from: c */
    private static final int m26262c(int i) {
        return i != 1 ? 2048 : 8192;
    }

    /* renamed from: a */
    public final int mo20645a() {
        return this.f35591c;
    }

    /* renamed from: d */
    public final void mo20659d() {
        nxc g = mo20662g();
        if (g != null) {
            g.mo20673a(this);
            mo20663h();
        }
    }

    /* renamed from: e */
    public final birv mo20660e() {
        return this.f35595g;
    }

    /* renamed from: f */
    public final boolean mo20661f() {
        synchronized (this.f35600l) {
            if (!this.f35601m) {
                return false;
            }
            boolean z = !this.f35610v;
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        return null;
     */
    /* renamed from: g */
    public final nxc mo20662g() {
        synchronized (this.f35600l) {
            if (this.f35601m && this.f35610v) {
                nxc nxc = this.f35611w;
                return nxc;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhi.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      nhi.a(long, boolean):void
      nxe.a(long, boolean):void
      nhi.a(boolean, boolean):void */
    /* renamed from: h */
    public final void mo20663h() {
        m26260a(false, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhi.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      nhi.a(long, boolean):void
      nxe.a(long, boolean):void
      nhi.a(boolean, boolean):void */
    /* renamed from: i */
    public final void mo20664i() {
        m26260a(false, true);
    }

    /* renamed from: j */
    public final nwy mo20665j() {
        if (this.f35613y) {
            return this.f35609u.mo21774a();
        }
        return this.f35599k.mo21774a();
    }

    /* renamed from: k */
    public final boolean mo20666k() {
        synchronized (this.f35600l) {
            if (!this.f35601m) {
                return true;
            }
            if (this.f35610v) {
                return false;
            }
            boolean z = !this.f35596h.mo22188c();
            return z;
        }
    }

    /* renamed from: l */
    public final synchronized void mo20667l() {
        notify();
    }

    /* renamed from: m */
    public final void mo20668m() {
        this.f35585A = false;
        this.f35614z = null;
        nwz nwz = this.f35609u;
        if (nwz != null) {
            nwz.mo21778c();
        }
        nwz nwz2 = this.f35599k;
        if (nwz2 != null) {
            nwz2.mo21778c();
        }
    }

    /* renamed from: c */
    private final boolean m26263c(nwy nwy) {
        int i = this.f35608t;
        if (i == 2) {
            if (this.f35585A) {
                nwy nwy2 = this.f35614z;
                nwy a = this.f35599k.mo21774a();
                NativeResampler.native16000MonoTo48000StereoSecond(nwy.f36852b.array(), nwy.mo21772a(), nwy2.f36852b.array(), nwy2.mo21772a(), a.f36852b.array(), a.mo21772a());
                this.f35599k.mo21775a(nwy2);
                this.f35599k.mo21775a(a);
                this.f35614z = null;
                this.f35585A = false;
            } else {
                nwy a2 = this.f35599k.mo21774a();
                nwy a3 = this.f35599k.mo21774a();
                NativeResampler.native16000MonoTo48000StereoFirst(nwy.f36852b.array(), nwy.mo21772a(), a2.f36852b.array(), a2.mo21772a(), a3.f36852b.array(), a3.mo21772a());
                this.f35599k.mo21775a(a2);
                this.f35614z = a3;
                this.f35585A = true;
            }
            this.f35609u.mo21777b(nwy);
            return true;
        } else if (i == 1) {
            nwy nwy3 = this.f35614z;
            if (nwy3 != null) {
                byte[] array = nwy3.f36852b.array();
                int a4 = this.f35614z.mo21772a();
                byte[] array2 = nwy.f36852b.array();
                int a5 = nwy.mo21772a();
                nwy a6 = this.f35599k.mo21774a();
                byte[] array3 = a6.f36852b.array();
                int a7 = a6.mo21772a();
                if (!this.f35585A) {
                    NativeResampler.native48000StereoTo16000MonoFirst(array, a4, array2, a5, array3, a7);
                    this.f35609u.mo21777b(this.f35614z);
                    this.f35614z = nwy;
                    this.f35585A = true;
                } else {
                    NativeResampler.native48000StereoTo16000MonoSecond(array, a4, array2, a5, array3, a7);
                    this.f35609u.mo21777b(this.f35614z);
                    this.f35609u.mo21777b(nwy);
                    this.f35614z = null;
                    this.f35585A = false;
                }
                this.f35599k.mo21775a(a6);
                return true;
            }
            this.f35614z = nwy;
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public final void mo20655b() {
        synchronized (this.f35600l) {
            if (this.f35601m) {
                this.f35601m = false;
                mo20659d();
                this.f35598j.mo20642b();
                this.f35597i.quitSafely();
                this.f35590b.mo20702e(this.f35591c);
            }
        }
    }

    /* renamed from: b */
    public final void mo20656b(nwy nwy) {
        if (!this.f35613y) {
            this.f35599k.mo21775a(nwy);
        } else if (!m26263c(nwy)) {
            return;
        }
        this.f35598j.mo20643c();
    }

    /* renamed from: b */
    public final void mo20657b(boolean z) {
        if (!ccsh.m131422c()) {
            synchronized (this.f35600l) {
                this.f35610v = false;
                this.f35611w = null;
            }
        }
        this.f35586B.release();
        if (z) {
            this.f35590b.mo20697a();
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        this.f35589E.mo20688a();
        mo20655b();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ojh mo20646a(ojm ojm) {
        return new off(njp.m26592e(this.f35591c), this.f35595g, this, ojm, this.f35589E);
    }

    /* renamed from: a */
    public final void mo20647a(int i) {
        synchronized (this.f35588D) {
            if (!this.f35612x.getAndSet(true)) {
                this.f35608t = i;
                if (i != this.f35593e) {
                    this.f35613y = true;
                    this.f35609u = new nwz(m26262c(i));
                } else {
                    this.f35613y = false;
                }
                this.f35598j.mo20640a();
                return;
            }
            int i2 = njp.f35842m;
        }
    }

    /* renamed from: a */
    public final void mo20648a(long j, boolean z) {
        if (j > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f35612x.get()) {
                int i = njp.f35842m;
                synchronized (this) {
                    try {
                        wait(j);
                    } catch (InterruptedException e) {
                    }
                }
            }
            if (z) {
                long elapsedRealtime2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (elapsedRealtime2 > 0 && this.f35596h.mo22188c()) {
                    off off = this.f35596h;
                    synchronized (off.f37701d) {
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        long j2 = elapsedRealtime2 + elapsedRealtime3;
                        while (off.mo22188c() && elapsedRealtime3 < j2) {
                            off.f37755p.mo22112a();
                            try {
                                off.f37701d.wait(j2 - elapsedRealtime3);
                            } catch (InterruptedException e2) {
                            }
                            elapsedRealtime3 = SystemClock.elapsedRealtime();
                        }
                    }
                    if (off.mo22188c()) {
                        bnsi c = oik.f37698a.mo68388c();
                        c.mo68432a("oik", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Car did not give all ACKs. Just reset counter");
                        off.f37702e.mo22193b();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        String d = njp.m26591d(this.f35591c);
        String b = m26261b(this.f35593e);
        String a = oik.m28816a(this.f35595g);
        boolean z = this.f35610v;
        boolean z2 = this.f35613y;
        String b2 = m26261b(this.f35608t);
        int length = d.length();
        int length2 = b.length();
        StringBuilder sb = new StringBuilder(length + 108 + length2 + a.length() + b2.length());
        sb.append("stream type:");
        sb.append(d);
        sb.append(" protocolAudioFormat:");
        sb.append(b);
        sb.append(" codec type:");
        sb.append(a);
        sb.append(" channel used:");
        sb.append(z);
        sb.append(" needs resampling:");
        sb.append(z2);
        sb.append(" client audio format:");
        sb.append(b2);
        printWriter.println(sb.toString());
        nhh nhh = this.f35598j;
        if (nhh != null) {
            String valueOf = String.valueOf(nhh.f35575c);
            String valueOf2 = String.valueOf(nhh.f35576d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
            sb2.append("packets sent since start:");
            sb2.append(valueOf);
            sb2.append(" total packets sent:");
            sb2.append(valueOf2);
            printWriter.println(sb2.toString());
            if (nhh.f35577e.f35607s) {
                printWriter.println("Latency histogram: latency frequency");
                int i = 0;
                while (true) {
                    int[] iArr = nhh.f35577e.f35605q;
                    if (i >= iArr.length) {
                        break;
                    }
                    int i2 = iArr[i];
                    if (i2 > 0) {
                        StringBuilder sb3 = new StringBuilder(23);
                        sb3.append(i);
                        sb3.append(" ");
                        sb3.append(i2);
                        printWriter.println(sb3.toString());
                    }
                    i++;
                }
            }
        }
        off off = this.f35596h;
        if (off != null) {
            printWriter.print("session id=");
            printWriter.println(((oik) off).f37699b);
            off.f37702e.mo22192a(printWriter);
        }
    }

    /* renamed from: a */
    public final void mo20650a(nwy nwy) {
        if (this.f35613y) {
            this.f35609u.mo21777b(nwy);
        } else {
            this.f35599k.mo21777b(nwy);
        }
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f35596h = (off) ojh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhi.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      nhi.a(long, boolean):void
      nxe.a(long, boolean):void
      nhi.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo20652a(boolean z) {
        m26260a(true, z);
    }

    /* renamed from: a */
    public final boolean mo20653a(birv birv) {
        return birv == birv.MEDIA_CODEC_AUDIO_AAC_LC || birv == birv.MEDIA_CODEC_AUDIO_AAC_LC_ADTS;
    }

    /* renamed from: a */
    public final boolean mo20654a(nxc nxc) {
        if (nxc != null) {
            synchronized (this.f35600l) {
                if (!mo20661f()) {
                    return false;
                }
                this.f35610v = true;
                this.f35611w = nxc;
                return true;
            }
        }
        nhh nhh = this.f35598j;
        if (nhh != null) {
            boolean z = this.f35587C;
            boolean z2 = nhh.f35574b;
            int i = this.f35608t;
            int i2 = this.f35593e;
            StringBuilder sb = new StringBuilder(47);
            sb.append("Null client ");
            sb.append(z);
            sb.append(" ");
            sb.append(z2);
            sb.append(" ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            throw new NullPointerException(sb.toString());
        }
        throw new NullPointerException("transmissionHandler is null");
    }
}
