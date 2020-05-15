package p000;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhh extends nvt {

    /* renamed from: a */
    public final Semaphore f35573a = new Semaphore(0);

    /* renamed from: b */
    public boolean f35574b = false;

    /* renamed from: c */
    public final AtomicInteger f35575c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicInteger f35576d = new AtomicInteger();

    /* renamed from: e */
    final /* synthetic */ nhi f35577e;

    /* renamed from: f */
    private volatile boolean f35578f = false;

    /* renamed from: h */
    private nwz f35579h;

    /* renamed from: i */
    private nxj f35580i;

    /* renamed from: j */
    private final boolean f35581j;

    /* renamed from: k */
    private oaq f35582k;

    /* renamed from: l */
    private final Context f35583l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nhh(nhi nhi, Looper looper, Context context, boolean z) {
        super(null, looper);
        this.f35577e = nhi;
        this.f35583l = context;
        this.f35581j = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = p000.nxh.f36860a.mo68387b();
        r0.mo68432a("nxh", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Encoder input buffer unavailable. Dropping audio data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d7 A[SYNTHETIC] */
    /* renamed from: d */
    private final void m26255d() {
        nxj nxj;
        int i;
        ByteBuffer a;
        nwy b;
        oaq oaq;
        nhh nhh = this;
        nhi nhi = nhh.f35577e;
        bnsn bnsn = nhi.f35584a;
        nwy b2 = nhi.f35599k.mo21776b();
        while (b2 != null) {
            nhi nhi2 = nhh.f35577e;
            if (!nhi2.mo20653a(nhi2.f35595g)) {
                ByteBuffer byteBuffer = b2.f36852b;
                byteBuffer.position(byteBuffer.limit());
                nhh.f35577e.f35596h.mo22183a(b2.f36851a, byteBuffer);
                nhh.f35575c.getAndIncrement();
                nhh.f35576d.getAndIncrement();
                if (nhh.f35581j && (oaq = nhh.f35582k) != null) {
                    oaq.mo21908a(byteBuffer.array(), b2.mo21772a(), b2.mo21773b());
                }
            } else {
                nxj nxj2 = nhh.f35580i;
                if (nxj2.f36877l) {
                    bmxy.m108581a(nxj2.f36876k);
                    nxh nxh = nxj2.f36876k;
                    long j = (long) (1000000 / ((nxh.f36861b * nxh.f36863d) * (nxh.f36862c / 8)));
                    if (nxh.f36864e == null) {
                        nxh.f36864e = nxh.f37307k.f36450a.getInputBuffers();
                    }
                    int b3 = b2.mo21773b();
                    int a2 = b2.mo21772a();
                    long j2 = b2.f36851a;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= b3) {
                            nxj = nxj2;
                            i = i3;
                            break;
                        }
                        try {
                            nxj = nxj2;
                            try {
                                int a3 = nxh.f37307k.mo21566a(500000);
                                if (a3 < 0) {
                                    break;
                                }
                                nxh.f36864e[a3].clear();
                                int min = Math.min(b3 - i2, nxh.f36864e[a3].limit());
                                nwy nwy = b2;
                                nxh.f36864e[a3].put(b2.f36852b.array(), a2 + i2, min);
                                nxh.f37307k.mo21567a(a3, min, j2, 0);
                                i2 += min;
                                if (j2 != 0) {
                                    j2 += ((long) min) * j;
                                }
                                i3++;
                                nxj2 = nxj;
                                b2 = nwy;
                            } catch (IllegalStateException e) {
                                e = e;
                                i = i3;
                                bnsi c = nxh.f36860a.mo68388c();
                                c.mo68437a(e);
                                c.mo68432a("nxh", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c.mo68405a("mediacodec failed, already stopped?");
                                nxj.f36873h.acquire(i);
                                nhh = this;
                                a = nhh.f35580i.mo21793a();
                                if (a != null) {
                                }
                                while (b != null) {
                                }
                                if (nhh.f35577e.f35607s) {
                                }
                                b2 = nhh.f35577e.f35599k.mo21776b();
                            }
                        } catch (IllegalStateException e2) {
                            e = e2;
                            nxj = nxj2;
                            i = i3;
                            bnsi c2 = nxh.f36860a.mo68388c();
                            c2.mo68437a(e);
                            c2.mo68432a("nxh", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c2.mo68405a("mediacodec failed, already stopped?");
                            nxj.f36873h.acquire(i);
                            nhh = this;
                            a = nhh.f35580i.mo21793a();
                            if (a != null) {
                            }
                            while (b != null) {
                            }
                            if (nhh.f35577e.f35607s) {
                            }
                            b2 = nhh.f35577e.f35599k.mo21776b();
                        }
                    }
                    try {
                        nxj.f36873h.acquire(i);
                    } catch (InterruptedException e3) {
                    }
                    nhh = this;
                    a = nhh.f35580i.mo21793a();
                    if (a != null) {
                        byte[] bArr = new byte[a.limit()];
                        System.arraycopy(a.array(), a.arrayOffset(), bArr, 0, a.limit());
                        nhh.f35577e.f35596h.mo22186a(bArr);
                    }
                    for (b = nhh.f35579h.mo21776b(); b != null; b = nhh.f35579h.mo21776b()) {
                        ByteBuffer byteBuffer2 = b.f36852b;
                        byteBuffer2.position(byteBuffer2.limit());
                        nhh.f35577e.f35596h.mo22183a(b.f36851a, byteBuffer2);
                        nhh.f35575c.getAndIncrement();
                        nhh.f35576d.getAndIncrement();
                        if (nhh.f35581j) {
                            if (nhh.f35582k != null) {
                                if (nhh.f35577e.f35595g == birv.MEDIA_CODEC_AUDIO_AAC_LC) {
                                    byte[] a4 = nhh.f35580i.mo21794a(b.mo21773b());
                                    nhh.f35582k.mo21908a(a4, 0, a4.length);
                                }
                                nhh.f35582k.mo21908a(byteBuffer2.array(), b.mo21772a(), b.mo21773b());
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("start() has not been called");
                }
            }
            if (nhh.f35577e.f35607s) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                nhi nhi3 = nhh.f35577e;
                long j3 = nhi3.f35606r;
                if (j3 > 0) {
                    int i4 = (int) (elapsedRealtime - j3);
                    if (i4 < 0) {
                        i4 = 0;
                    } else if (i4 > 255) {
                        i4 = 255;
                    }
                    int[] iArr = nhi3.f35605q;
                    iArr[i4] = iArr[i4] + 1;
                }
                nhi3.f35606r = elapsedRealtime;
            }
            b2 = nhh.f35577e.f35599k.mo21776b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo20640a() {
        if (!this.f35574b) {
            sendMessage(obtainMessage(2));
        }
    }

    /* renamed from: b */
    public final synchronized void mo20642b() {
        if (!this.f35574b) {
            this.f35574b = true;
            sendMessage(obtainMessage(5));
        }
    }

    /* renamed from: c */
    public final synchronized void mo20643c() {
        if (!this.f35574b) {
            sendMessage(obtainMessage(4));
        }
    }

    public final void handleMessage(Message message) {
        int i;
        boolean z;
        oaq oaq;
        oaq oaq2;
        boolean z2 = true;
        if (this.f35577e.f35601m || message.what == 1 || message.what == 3 || message.what == 5) {
            int i2 = message.what;
            int i3 = 2;
            if (i2 == 1) {
                int i4 = message.arg1;
                birv birv = (birv) message.obj;
                if (i4 != 1) {
                    i3 = 1;
                }
                if (i4 == 1) {
                    i = 48000;
                } else {
                    i = 16000;
                }
                nhi nhi = this.f35577e;
                bnsn bnsn = nhi.f35584a;
                nhi.f35599k = new nwz(nhi.f35594f);
                if (this.f35577e.mo20653a(birv)) {
                    nwz nwz = this.f35579h;
                    if (nwz != null) {
                        nwz.mo21778c();
                    }
                    this.f35579h = new nwz(4096);
                    nxj nxj = this.f35580i;
                    if (nxj != null) {
                        nxj.mo21795b();
                    }
                    nwz nwz2 = this.f35579h;
                    if (birv != birv.MEDIA_CODEC_AUDIO_AAC_LC_ADTS) {
                        z2 = false;
                    }
                    this.f35580i = new nxj(i, i3, nwz2, z2);
                }
                int i5 = this.f35577e.f35594f;
                oik.m28816a(birv);
                int i6 = this.f35577e.f35591c;
                int i7 = njp.f35842m;
                this.f35573a.release();
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int i8 = message.arg1;
                    if (message.arg2 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f35578f) {
                        if (i8 != 1) {
                            m26255d();
                        }
                        nhi nhi2 = this.f35577e;
                        bnsn bnsn2 = nhi.f35584a;
                        nhi2.f35596h.mo22189e();
                        bnsi d = nhi.f35584a.mo68390d();
                        d.mo68432a("nhh", "handleMessage", 841, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68424a("stopping, sent %s for stream %s", this.f35575c, njp.m26591d(this.f35577e.f35591c));
                        this.f35578f = false;
                        if (i8 == 1 && this.f35577e.f35604p.mo21259V()) {
                            off off = this.f35577e.f35596h;
                            off.mo22187c(0);
                            off.mo22189e();
                        }
                        this.f35577e.mo20668m();
                        this.f35577e.mo20667l();
                        if (this.f35581j && (oaq = this.f35582k) != null) {
                            oaq.mo21907a();
                            this.f35582k = null;
                        }
                    }
                    nhi nhi3 = this.f35577e;
                    bnsn bnsn3 = nhi.f35584a;
                    nhi3.mo20657b(z);
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        nhi nhi4 = this.f35577e;
                        bnsn bnsn4 = nhi.f35584a;
                        if (nhi4.mo20653a(nhi4.f35595g)) {
                            nxj nxj2 = this.f35580i;
                            if (nxj2 != null) {
                                nxj2.mo21795b();
                            }
                            nwz nwz3 = this.f35579h;
                            if (nwz3 != null) {
                                nwz3.mo21778c();
                            }
                        }
                        if (this.f35581j && (oaq2 = this.f35582k) != null) {
                            oaq2.mo21907a();
                            this.f35582k = null;
                        }
                        this.f35577e.mo20668m();
                        return;
                    }
                    int i9 = message.what;
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Unsupported message ");
                    sb.append(i9);
                    throw new IllegalStateException(sb.toString());
                } else if (!this.f35578f) {
                    bnsn bnsn5 = nhi.f35584a;
                    int i10 = this.f35577e.f35591c;
                    int i11 = njp.f35842m;
                } else {
                    m26255d();
                }
            } else if (!this.f35578f) {
                this.f35578f = true;
                nhi nhi5 = this.f35577e;
                bnsn bnsn6 = nhi.f35584a;
                nhi5.f35606r = -1;
                nhi5.f35596h.mo22187c(nhi5.f35592d);
                this.f35575c.set(0);
                nhi nhi6 = this.f35577e;
                if (nhi6.mo20653a(nhi6.f35595g)) {
                    nxj nxj3 = this.f35580i;
                    if (!nxj3.f36877l) {
                        nxj3.f36877l = true;
                        nxj3.f36872g = ByteBuffer.allocate(1024);
                        nxj3.f36873h.drainPermits();
                        nxj3.f36871f.drainPermits();
                        nxj3.f36876k = new nxh(nxj3.f36867b, nxj3.f36868c, nxj3.f36869d);
                        nxj3.f36876k.mo22033a(nxj3.f36875j);
                    }
                }
                if (this.f35581j) {
                    nhi nhi7 = this.f35577e;
                    if (nhi7.f35593e != 1) {
                        z2 = false;
                    }
                    if (nhi7.mo20653a(nhi7.f35595g)) {
                        z2 |= true;
                    }
                    this.f35582k = new oaq(this.f35583l, z2 ? 1 : 0, this.f35577e.f35591c);
                }
            } else {
                bnsi d2 = nhi.f35584a.mo68390d();
                d2.mo68432a("nhh", "handleMessage", 797, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68405a("stream already started");
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo20641a(boolean z, boolean z2) {
        if (this.f35574b) {
            return false;
        }
        if (z) {
            removeMessages(4);
        }
        sendMessage(obtainMessage(3, z ? 1 : 0, z2 ? 1 : 0));
        return true;
    }
}
