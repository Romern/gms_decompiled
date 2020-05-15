package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cidj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cidj implements chzy {

    /* renamed from: a */
    public int f189900a = -1;

    /* renamed from: b */
    public final cifj f189901b;

    /* renamed from: c */
    private final cidi f189902c;

    /* renamed from: d */
    private cifi f189903d;

    /* renamed from: e */
    private chre f189904e = chrc.f189024a;

    /* renamed from: f */
    private final boolean f189905f = true;

    /* renamed from: g */
    private final cidh f189906g = new cidh(this);

    /* renamed from: h */
    private final byte[] f189907h = new byte[5];

    /* renamed from: i */
    private final ciez f189908i;

    /* renamed from: j */
    private boolean f189909j;

    /* renamed from: k */
    private int f189910k;

    /* renamed from: l */
    private int f189911l = -1;

    /* renamed from: m */
    private long f189912m;

    public cidj(cidi cidi, cifj cifj, ciez ciez) {
        bmxy.m108582a(cidi, "sink");
        this.f189902c = cidi;
        bmxy.m108582a(cifj, "bufferAllocator");
        this.f189901b = cifj;
        bmxy.m108582a(ciez, "statsTraceCtx");
        this.f189908i = ciez;
    }

    /* renamed from: a */
    private static int m150051a(InputStream inputStream, OutputStream outputStream) {
        boolean z = false;
        if (inputStream instanceof ciic) {
            ciic ciic = (ciic) inputStream;
            bxxc bxxc = ciic.f190395a;
            if (bxxc == null) {
                ByteArrayInputStream byteArrayInputStream = ciic.f190397c;
                if (byteArrayInputStream == null) {
                    return 0;
                }
                long a = ciie.m150369a(byteArrayInputStream, outputStream);
                ciic.f190397c = null;
                return (int) a;
            }
            int db = bxxc.mo74145db();
            ciic.f190395a.mo73638a(outputStream);
            ciic.f190395a = null;
            return db;
        }
        long a2 = boav.m111013a(inputStream, outputStream);
        if (a2 <= 2147483647L) {
            z = true;
        }
        bmxy.m108593a(z, "Message size overflow: %s", a2);
        return (int) a2;
    }

    /* renamed from: b */
    public final boolean mo85857b() {
        return this.f189909j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cidj.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      cidj.a(java.io.InputStream, java.io.OutputStream):int
      cidj.a(cidg, boolean):void
      cidj.a(boolean, boolean):void */
    /* renamed from: c */
    public final void mo85858c() {
        if (!this.f189909j) {
            this.f189909j = true;
            cifi cifi = this.f189903d;
            if (!(cifi == null || cifi.mo85754b() != 0 || this.f189903d == null)) {
                this.f189903d = null;
            }
            m150053a(true, true);
        }
    }

    /* renamed from: a */
    private final void m150052a(cidg cidg, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.f189907h);
        wrap.put(z ? (byte) 1 : 0);
        List list = cidg.f189896a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((cifi) list.get(i2)).mo85754b();
        }
        wrap.putInt(i);
        cifi a = this.f189901b.mo85755a(5);
        a.mo85753a(this.f189907h, 0, wrap.position());
        if (i != 0) {
            this.f189902c.mo85762a(a, false, false, this.f189910k - 1);
            this.f189910k = 1;
            List list2 = cidg.f189896a;
            for (int i3 = 0; i3 < list2.size() - 1; i3++) {
                this.f189902c.mo85762a((cifi) list2.get(i3), false, false, 0);
            }
            this.f189903d = (cifi) list2.get(list2.size() - 1);
            this.f189912m = (long) i;
            return;
        }
        this.f189903d = a;
    }

    /* renamed from: a */
    private final void m150053a(boolean z, boolean z2) {
        cifi cifi = this.f189903d;
        this.f189903d = null;
        this.f189902c.mo85762a(cifi, z, z2, this.f189910k);
        this.f189910k = 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cidj.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      cidj.a(java.io.InputStream, java.io.OutputStream):int
      cidj.a(cidg, boolean):void
      cidj.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo85854a() {
        cifi cifi = this.f189903d;
        if (cifi != null && cifi.mo85754b() > 0) {
            m150053a(false, true);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85855a(chre chre) {
        bmxy.m108582a(chre, "Can't pass an empty compressor");
        this.f189904e = chre;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cidj.a(cidg, boolean):void
     arg types: [cidg, int]
     candidates:
      cidj.a(java.io.InputStream, java.io.OutputStream):int
      cidj.a(boolean, boolean):void
      cidj.a(cidg, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c A[Catch:{ all -> 0x0085, IOException -> 0x0176, RuntimeException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0 A[Catch:{ all -> 0x0085, IOException -> 0x0176, RuntimeException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115 A[LOOP:3: B:61:0x0113->B:62:0x0115, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011b A[LOOP:2: B:59:0x010c->B:64:0x011b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123 A[LOOP:1: B:57:0x0102->B:65:0x0123, LOOP_END] */
    /* renamed from: a */
    public final void mo85856a(InputStream inputStream) {
        int i;
        int i2;
        OutputStream a;
        if (!this.f189909j) {
            this.f189910k++;
            this.f189911l++;
            this.f189912m = 0;
            chuy[] chuyArr = this.f189908i.f189993b;
            for (chuy chuy : chuyArr) {
            }
            boolean z = this.f189905f && this.f189904e != chrc.f189024a;
            try {
                if (!(inputStream instanceof chsj)) {
                    if (!(inputStream instanceof ByteArrayInputStream)) {
                        i = -1;
                        if (i == 0 && z) {
                            cidg cidg = new cidg(this);
                            a = this.f189904e.mo85558a(cidg);
                            i2 = m150051a(inputStream, a);
                            a.close();
                            int i3 = this.f189900a;
                            if (i3 >= 0) {
                                if (i2 > i3) {
                                    throw chuv.f189224k.mo85687a(String.format("message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.f189900a))).mo85691b();
                                }
                            }
                            m150052a(cidg, true);
                        } else if (i != -1) {
                            cidg cidg2 = new cidg(this);
                            i2 = m150051a(inputStream, cidg2);
                            int i4 = this.f189900a;
                            if (i4 >= 0) {
                                if (i2 > i4) {
                                    throw chuv.f189224k.mo85687a(String.format("message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.f189900a))).mo85691b();
                                }
                            }
                            m150052a(cidg2, false);
                        } else {
                            this.f189912m = (long) i;
                            int i5 = this.f189900a;
                            if (i5 >= 0) {
                                if (i > i5) {
                                    throw chuv.f189224k.mo85687a(String.format("message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.f189900a))).mo85691b();
                                }
                            }
                            ByteBuffer wrap = ByteBuffer.wrap(this.f189907h);
                            wrap.put((byte) 0);
                            wrap.putInt(i);
                            if (this.f189903d == null) {
                                this.f189903d = this.f189901b.mo85755a(wrap.position() + i);
                            }
                            mo85989a(this.f189907h, 0, wrap.position());
                            i2 = m150051a(inputStream, this.f189906g);
                        }
                        if (i == -1 || i2 == i) {
                            chuy[] chuyArr2 = this.f189908i.f189993b;
                            for (chuy chuy2 : chuyArr2) {
                            }
                            ciez ciez = this.f189908i;
                            long j = this.f189912m;
                            chuy[] chuyArr3 = ciez.f189993b;
                            for (chuy chuy3 : chuyArr3) {
                                chuy3.mo70088a(j);
                            }
                            chuy[] chuyArr4 = this.f189908i.f189993b;
                            for (chuy chuy4 : chuyArr4) {
                            }
                        }
                        throw chuv.f189228o.mo85687a(String.format("Message length inaccurate %s != %s", Integer.valueOf(i2), Integer.valueOf(i))).mo85691b();
                    }
                }
                i = inputStream.available();
                if (i == 0) {
                }
                if (i != -1) {
                }
                if (i == -1) {
                    throw chuv.f189228o.mo85687a(String.format("Message length inaccurate %s != %s", Integer.valueOf(i2), Integer.valueOf(i))).mo85691b();
                }
                chuy[] chuyArr22 = this.f189908i.f189993b;
                while (r11 < r1) {
                }
                ciez ciez2 = this.f189908i;
                long j2 = this.f189912m;
                chuy[] chuyArr32 = ciez2.f189993b;
                while (r11 < r6) {
                }
                chuy[] chuyArr42 = this.f189908i.f189993b;
                while (r4 < r0) {
                }
            } catch (IOException e) {
                throw chuv.f189228o.mo85687a("Failed to frame message").mo85692c(e).mo85691b();
            } catch (RuntimeException e2) {
                throw chuv.f189228o.mo85687a("Failed to frame message").mo85692c(e2).mo85691b();
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        } else {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cidj.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      cidj.a(java.io.InputStream, java.io.OutputStream):int
      cidj.a(cidg, boolean):void
      cidj.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo85989a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            cifi cifi = this.f189903d;
            if (cifi != null && cifi.mo85751a() == 0) {
                m150053a(false, false);
            }
            if (this.f189903d == null) {
                this.f189903d = this.f189901b.mo85755a(i2);
            }
            int min = Math.min(i2, this.f189903d.mo85751a());
            this.f189903d.mo85753a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
