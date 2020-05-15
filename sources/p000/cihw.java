package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* renamed from: cihw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cihw implements ciho {

    /* renamed from: a */
    public int f190379a = AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;

    /* renamed from: b */
    private final cipv f190380b;

    /* renamed from: c */
    private final cipu f190381c = new cipu();

    /* renamed from: d */
    private final cihr f190382d = new cihr(this.f190381c);

    /* renamed from: e */
    private boolean f190383e;

    public cihw(cipv cipv) {
        this.f190380b = cipv;
    }

    /* renamed from: a */
    public final synchronized void mo86032a() {
        if (!this.f190383e) {
            if (cihx.f190384a.isLoggable(Level.FINE)) {
                cihx.f190384a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", cihx.f190385b.mo86342c()));
            }
            this.f190380b.mo86289a(cihx.f190385b.mo86347f());
            this.f190380b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo86040b() {
        if (!this.f190383e) {
            this.f190380b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() {
        this.f190383e = true;
        this.f190380b.close();
    }

    /* renamed from: b */
    public final synchronized void mo86041b(ciia ciia) {
        int i;
        if (!this.f190383e) {
            int i2 = 0;
            mo86127a(0, Integer.bitCount(ciia.f190393a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (ciia.mo86132a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f190380b.mo86311f(i);
                    this.f190380b.mo86307e(ciia.mo86133b(i2));
                }
                i2++;
            }
            this.f190380b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86127a(int i, int i2, byte b, byte b2) {
        if (cihx.f190384a.isLoggable(Level.FINE)) {
            cihx.f190384a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", cihu.m150342a(false, i, i2, b, b2));
        }
        int i3 = this.f190379a;
        if (i2 > i3) {
            throw cihx.m150359a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            cipv cipv = this.f190380b;
            cipv.mo86316h((i2 >>> 16) & 255);
            cipv.mo86316h((i2 >>> 8) & 255);
            cipv.mo86316h(i2 & 255);
            this.f190380b.mo86316h(b);
            this.f190380b.mo86316h(b2);
            this.f190380b.mo86307e(i & Integer.MAX_VALUE);
        } else {
            throw cihx.m150359a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final synchronized void mo86033a(int i, long j) {
        if (this.f190383e) {
            throw new IOException("closed");
        } else if (j != 0) {
            mo86127a(i, 4, (byte) 8, (byte) 0);
            this.f190380b.mo86307e((int) j);
            this.f190380b.flush();
        } else {
            throw cihx.m150359a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final synchronized void mo86034a(int i, cihm cihm) {
        if (this.f190383e) {
            throw new IOException("closed");
        } else if (cihm.f190342s != -1) {
            mo86127a(i, 4, (byte) 3, (byte) 0);
            this.f190380b.mo86307e(cihm.f190342s);
            this.f190380b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final synchronized void mo86035a(cihm cihm, byte[] bArr) {
        if (this.f190383e) {
            throw new IOException("closed");
        } else if (cihm.f190342s != -1) {
            int length = bArr.length;
            mo86127a(0, length + 8, (byte) 7, (byte) 0);
            this.f190380b.mo86307e(0);
            this.f190380b.mo86307e(cihm.f190342s);
            if (length > 0) {
                this.f190380b.mo86289a(bArr);
            }
            this.f190380b.flush();
        } else {
            throw cihx.m150359a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo86036a(ciia ciia) {
        if (!this.f190383e) {
            int i = this.f190379a;
            if ((ciia.f190393a & 32) != 0) {
                i = ciia.f190394b[5];
            }
            this.f190379a = i;
            mo86127a(0, 0, (byte) 4, (byte) 1);
            this.f190380b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo86037a(boolean z, int i, int i2) {
        if (!this.f190383e) {
            mo86127a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f190380b.mo86307e(i);
            this.f190380b.mo86307e(i2);
            this.f190380b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo86038a(boolean z, int i, cipu cipu, int i2) {
        if (!this.f190383e) {
            mo86127a(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f190380b.mo74930a(cipu, (long) i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: a */
    public final synchronized void mo86039a(boolean z, int i, List list) {
        byte b;
        byte b2;
        int i2;
        int i3;
        int i4 = i;
        synchronized (this) {
            if (!this.f190383e) {
                cihr cihr = this.f190382d;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    cihp cihp = (cihp) list.get(i5);
                    cipx d = cihp.f190348f.mo86344d();
                    cipx cipx = cihp.f190349g;
                    Integer num = (Integer) cihs.f190366c.get(d);
                    if (num != null) {
                        i3 = num.intValue() + 1;
                        if (i3 < 2) {
                            i2 = i3;
                            i3 = -1;
                        } else {
                            if (i3 <= 7) {
                                if (cihs.f190365b[i3 - 1].f190349g.equals(cipx)) {
                                    i2 = i3;
                                } else if (cihs.f190365b[i3].f190349g.equals(cipx)) {
                                    i2 = i3;
                                    i3++;
                                }
                            }
                            i2 = i3;
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                        i2 = -1;
                    }
                    if (i3 == -1) {
                        int i6 = cihr.f190362d + 1;
                        while (true) {
                            cihp[] cihpArr = cihr.f190360b;
                            if (i6 >= cihpArr.length) {
                                break;
                            }
                            if (cihpArr[i6].f190348f.equals(d)) {
                                if (cihr.f190360b[i6].f190349g.equals(cipx)) {
                                    i3 = (i6 - cihr.f190362d) + cihs.f190365b.length;
                                    break;
                                } else if (i2 == -1) {
                                    i2 = (i6 - cihr.f190362d) + cihs.f190365b.length;
                                }
                            }
                            i6++;
                        }
                    }
                    if (i3 != -1) {
                        cihr.mo86123a(i3, 127, 128);
                    } else if (i2 == -1) {
                        cihr.f190359a.mo86316h(64);
                        cihr.mo86125a(d);
                        cihr.mo86125a(cipx);
                        cihr.mo86124a(cihp);
                    } else {
                        if (d.mo86339a(cihs.f190364a)) {
                            if (!cihp.f190347e.equals(d)) {
                                cihr.mo86123a(i2, 15, 0);
                                cihr.mo86125a(cipx);
                            }
                        }
                        cihr.mo86123a(i2, 63, 64);
                        cihr.mo86125a(cipx);
                        cihr.mo86124a(cihp);
                    }
                }
                long j = this.f190381c.f191213b;
                int min = (int) Math.min((long) this.f190379a, j);
                long j2 = (long) min;
                if (j == j2) {
                    b = 4;
                } else {
                    b = 0;
                }
                mo86127a(i4, min, (byte) 1, b);
                this.f190380b.mo74930a(this.f190381c, j2);
                if (j > j2) {
                    long j3 = j - j2;
                    while (j3 > 0) {
                        int min2 = (int) Math.min((long) this.f190379a, j3);
                        long j4 = (long) min2;
                        j3 -= j4;
                        if (j3 == 0) {
                            b2 = 4;
                        } else {
                            b2 = 0;
                        }
                        mo86127a(i4, min2, (byte) 9, b2);
                        this.f190380b.mo74930a(this.f190381c, j4);
                    }
                }
            } else {
                throw new IOException("closed");
            }
        }
    }
}
