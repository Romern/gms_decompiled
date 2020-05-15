package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: bgbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgbr implements bgmi {

    /* renamed from: a */
    private static bgbr f116006a;

    /* renamed from: b */
    private final qws f116007b;

    /* renamed from: c */
    private final bfkp f116008c;

    public bgbr(qws qws, bfkp bfkp) {
        this.f116007b = qws;
        this.f116008c = bfkp;
    }

    /* renamed from: a */
    public static synchronized bgbr m98545a(Context context) {
        bgbr bgbr;
        synchronized (bgbr.class) {
            if (f116006a == null) {
                f116006a = new bgbr(new qws(context.getApplicationContext(), "LE", null), new bfkp(context));
            }
            bgbr = f116006a;
        }
        return bgbr;
    }

    /* renamed from: a */
    public final synchronized void mo62624a() {
        this.f116007b.mo24336a(30, TimeUnit.MINUTES);
    }

    /* renamed from: a */
    public final synchronized void mo62625a(long j, int i, long j2, boolean z, boolean z2, int i2, int i3, int i4) {
        long j3 = j;
        long j4 = j2;
        int i5 = i3;
        int i6 = i4;
        synchronized (this) {
            if (j3 >= 0) {
                bxvd da = bpkz.f138037j.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpkz bpkz = (bpkz) da.f164949b;
                int i7 = bpkz.f138039a | 2;
                bpkz.f138039a = i7;
                bpkz.f138041c = j3;
                int i8 = i7 | 8;
                bpkz.f138039a = i8;
                bpkz.f138043e = z;
                int i9 = i8 | 16;
                bpkz.f138039a = i9;
                bpkz.f138044f = z2;
                int i10 = i9 | 32;
                bpkz.f138039a = i10;
                bpkz.f138045g = i2;
                int i11 = i10 | 1;
                bpkz.f138039a = i11;
                bpkz.f138040b = i;
                if (j4 >= 0) {
                    i11 |= 4;
                    bpkz.f138039a = i11;
                    bpkz.f138042d = j4;
                }
                if (i5 >= 0) {
                    i11 |= 64;
                    bpkz.f138039a = i11;
                    bpkz.f138046h = i5;
                }
                if (i6 >= 0) {
                    bpkz.f138039a = i11 | 128;
                    bpkz.f138047i = i6;
                }
                bxvd da2 = bpkx.f138024f.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpkx bpkx = (bpkx) da2.f164949b;
                bpkx.f138027b = 2;
                bpkx.f138026a |= 1;
                bpkz bpkz2 = (bpkz) da.mo74062i();
                bpkz2.getClass();
                bpkx.f138029d = bpkz2;
                bpkx.f138026a |= 4;
                bxvd da3 = bonq.f133833p.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bonq bonq = (bonq) da3.f164949b;
                bonq.f133836b = 2;
                bonq.f133835a |= 1;
                bpkx bpkx2 = (bpkx) da2.mo74062i();
                bpkx2.getClass();
                bonq.f133838d = bpkx2;
                bonq.f133835a |= 4;
                this.f116007b.mo24335a(((bonq) da3.mo74062i()).serializeToBytes()).mo24327b();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo62626a(buna buna) {
        bxvd da = bpkx.f138024f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpkx bpkx = (bpkx) da.f164949b;
        bpkx.f138027b = 3;
        int i = bpkx.f138026a | 1;
        bpkx.f138026a = i;
        buna.getClass();
        bpkx.f138030e = buna;
        bpkx.f138026a = i | 8;
        bxvd da2 = bonq.f133833p.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bonq bonq = (bonq) da2.f164949b;
        bonq.f133836b = 2;
        bonq.f133835a |= 1;
        bpkx bpkx2 = (bpkx) da.mo74062i();
        bpkx2.getClass();
        bonq.f133838d = bpkx2;
        bonq.f133835a |= 4;
        this.f116007b.mo24335a(((bonq) da2.mo74062i()).serializeToBytes()).mo24327b();
    }

    /* renamed from: a */
    public final synchronized void mo62627a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        bxvd da = bpsc.f138934h.mo74144da();
        boolean booleanValue = bool.booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsc bpsc = (bpsc) da.f164949b;
        bpsc.f138936a |= 1;
        bpsc.f138937b = booleanValue;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsc bpsc2 = (bpsc) da.f164949b;
            bpsc2.f138936a |= 2;
            bpsc2.f138938c = booleanValue2;
        }
        if (bool3 != null) {
            boolean booleanValue3 = bool3.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsc bpsc3 = (bpsc) da.f164949b;
            bpsc3.f138936a |= 4;
            bpsc3.f138939d = booleanValue3;
        }
        boolean booleanValue4 = bool4.booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsc bpsc4 = (bpsc) da.f164949b;
        bpsc4.f138936a |= 8;
        bpsc4.f138940e = booleanValue4;
        boolean booleanValue5 = bool5.booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsc bpsc5 = (bpsc) da.f164949b;
        bpsc5.f138936a |= 16;
        bpsc5.f138941f = booleanValue5;
        boolean booleanValue6 = bool6.booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsc bpsc6 = (bpsc) da.f164949b;
        bpsc6.f138936a |= 32;
        bpsc6.f138942g = booleanValue6;
        bxvd da2 = bonq.f133833p.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bonq bonq = (bonq) da2.f164949b;
        bonq.f133836b = 3;
        bonq.f133835a |= 1;
        bpsc bpsc7 = (bpsc) da.mo74062i();
        bpsc7.getClass();
        bonq.f133839e = bpsc7;
        bonq.f133835a |= 8;
        this.f116007b.mo24335a(((bonq) da2.mo74062i()).serializeToBytes()).mo24327b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final synchronized void mo62628a(String str, long j) {
        if (this.f116008c.mo61852a()) {
            bxvd da = bpkf.f137938j.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpkf bpkf = (bpkf) da.f164949b;
            str.getClass();
            bpkf.f137940a |= 1;
            bpkf.f137941b = str;
            bxvd da2 = bpky.f138032d.mo74144da();
            int min = (int) Math.min(j, 2147483647L);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpky bpky = (bpky) da2.f164949b;
            bpky.f138034a |= 1;
            bpky.f138035b = min;
            bpkf bpkf2 = (bpkf) da.mo74062i();
            bpkf2.getClass();
            bpky.f138036c = bpkf2;
            bpky.f138034a |= 2;
            bxvd da3 = bpkx.f138024f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpkx bpkx = (bpkx) da3.f164949b;
            bpkx.f138027b = 1;
            bpkx.f138026a |= 1;
            bpky bpky2 = (bpky) da2.mo74062i();
            bpky2.getClass();
            bpkx.f138028c = bpky2;
            bpkx.f138026a |= 2;
            bxvd da4 = bonq.f133833p.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bonq bonq = (bonq) da4.f164949b;
            bonq.f133836b = 2;
            bonq.f133835a |= 1;
            bpkx bpkx2 = (bpkx) da3.mo74062i();
            bpkx2.getClass();
            bonq.f133838d = bpkx2;
            bonq.f133835a |= 4;
            this.f116007b.mo24335a(((bonq) da4.mo74062i()).serializeToBytes()).mo24327b();
        }
    }
}
