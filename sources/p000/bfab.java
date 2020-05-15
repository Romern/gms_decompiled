package p000;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.PrintWriter;

/* renamed from: bfab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfab implements bezz {

    /* renamed from: a */
    public final qws f113225a;

    /* renamed from: b */
    public bxvd f113226b = bvzr.f158545E.mo74144da();

    /* renamed from: c */
    private final boolean f113227c;

    /* renamed from: d */
    private long f113228d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    private final rjx f113229e;

    public bfab(qws qws, rjx rjx, boolean z) {
        this.f113225a = qws;
        this.f113229e = rjx;
        this.f113227c = z;
    }

    /* renamed from: a */
    public final void mo61308a() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158553c + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 2;
        bvzr.f158553c = i;
    }

    /* renamed from: b */
    public final void mo61312b() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158554d + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 4;
        bvzr.f158554d = i;
    }

    /* renamed from: c */
    public final void mo61314c() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158555e + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 8;
        bvzr.f158555e = i;
    }

    /* renamed from: d */
    public final void mo61316d() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158556f + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 16;
        bvzr.f158556f = i;
    }

    /* renamed from: e */
    public final void mo61317e() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158558h + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 64;
        bvzr.f158558h = i;
    }

    /* renamed from: f */
    public final void mo61318f() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158557g + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 32;
        bvzr.f158557g = i;
    }

    /* renamed from: g */
    public final void mo61319g() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158559i + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 128;
        bvzr.f158559i = i;
    }

    /* renamed from: h */
    public final void mo61320h() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158560j + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bvzr.f158560j = i;
    }

    /* renamed from: i */
    public final void mo61321i() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158561k + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 512;
        bvzr.f158561k = i;
    }

    /* renamed from: j */
    public final void mo61322j() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158562l + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 1024;
        bvzr.f158562l = i;
    }

    /* renamed from: k */
    public final void mo61323k() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158563m + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 2048;
        bvzr.f158563m = i;
    }

    /* renamed from: l */
    public final void mo61324l() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158564n + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 4096;
        bvzr.f158564n = i;
    }

    /* renamed from: m */
    public final void mo61325m() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158565o + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= 8192;
        bvzr.f158565o = i;
    }

    /* renamed from: n */
    public final void mo61326n() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158566p + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bvzr.f158566p = i;
    }

    /* renamed from: o */
    public final void mo61327o() {
        bxvd bxvd = this.f113226b;
        int i = ((bvzr) bxvd.f164949b).f158567q + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvzr bvzr = (bvzr) bxvd.f164949b;
        bvzr bvzr2 = bvzr.f158545E;
        bvzr.f158551a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        bvzr.f158567q = i;
    }

    /* renamed from: p */
    public final void mo61328p() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158568r + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bvzr.f158568r = i;
        }
    }

    /* renamed from: q */
    public final void mo61329q() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158569s + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bvzr.f158569s = i;
        }
    }

    /* renamed from: r */
    public final void mo61330r() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158570t + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            bvzr.f158570t = i;
        }
    }

    /* renamed from: s */
    public final void mo61331s() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158571u + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            bvzr.f158571u = i;
        }
    }

    /* renamed from: t */
    public final void mo61332t() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158572v + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 1048576;
            bvzr.f158572v = i;
        }
    }

    /* renamed from: u */
    public final void mo61333u() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158573w + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 2097152;
            bvzr.f158573w = i;
        }
    }

    /* renamed from: v */
    public final void mo61334v() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158574x + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 4194304;
            bvzr.f158574x = i;
        }
    }

    /* renamed from: w */
    public final void mo61335w() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158575y + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 8388608;
            bvzr.f158575y = i;
        }
    }

    /* renamed from: x */
    public final void mo61336x() {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i = ((bvzr) bxvd.f164949b).f158550D + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 268435456;
            bvzr.f158550D = i;
        }
    }

    /* renamed from: y */
    public final void mo61337y() {
        this.f113229e.mo24673E().mo50373a(new bfaa(this, (int) ((SystemClock.elapsedRealtime() - this.f113228d) / 1000)));
    }

    /* renamed from: z */
    public final void mo61338z() {
        this.f113226b = bvzr.f158545E.mo74144da();
        this.f113228d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo61309a(float f) {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            if (f > ((bvzr) bxvd.f164949b).f158547A) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bvzr bvzr = (bvzr) bxvd.f164949b;
                bvzr bvzr2 = bvzr.f158545E;
                bvzr.f158551a |= 33554432;
                bvzr.f158547A = f;
            }
        }
    }

    /* renamed from: b */
    public final void mo61313b(int i) {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i2 = i + ((bvzr) bxvd.f164949b).f158548B;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 67108864;
            bvzr.f158548B = i2;
        }
    }

    /* renamed from: c */
    public final void mo61315c(int i) {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            int i2 = i + ((bvzr) bxvd.f164949b).f158549C;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvzr bvzr = (bvzr) bxvd.f164949b;
            bvzr bvzr2 = bvzr.f158545E;
            bvzr.f158551a |= 134217728;
            bvzr.f158549C = i2;
        }
    }

    /* renamed from: a */
    public final void mo61310a(int i) {
        if (this.f113227c) {
            bxvd bxvd = this.f113226b;
            if (i > ((bvzr) bxvd.f164949b).f158576z) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bvzr bvzr = (bvzr) bxvd.f164949b;
                bvzr bvzr2 = bvzr.f158545E;
                bvzr.f158551a |= 16777216;
                bvzr.f158576z = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo61311a(PrintWriter printWriter) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f113228d;
        StringBuilder sb = new StringBuilder(34);
        sb.append("stats elapsed seconds: ");
        sb.append((int) ((elapsedRealtime - j) / 1000));
        printWriter.println(sb.toString());
        int i = ((bvzr) this.f113226b.f164949b).f158553c;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("computations: ");
        sb2.append(i);
        printWriter.println(sb2.toString());
        int i2 = ((bvzr) this.f113226b.f164949b).f158554d;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append("errors: ");
        sb3.append(i2);
        printWriter.println(sb3.toString());
        int i3 = ((bvzr) this.f113226b.f164949b).f158555e;
        StringBuilder sb4 = new StringBuilder(30);
        sb4.append("in geofence count: ");
        sb4.append(i3);
        printWriter.println(sb4.toString());
        int i4 = ((bvzr) this.f113226b.f164949b).f158556f;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("outside geofence count: ");
        sb5.append(i4);
        printWriter.println(sb5.toString());
        int i5 = ((bvzr) this.f113226b.f164949b).f158558h;
        StringBuilder sb6 = new StringBuilder(35);
        sb6.append("open sky detector true: ");
        sb6.append(i5);
        printWriter.println(sb6.toString());
        int i6 = ((bvzr) this.f113226b.f164949b).f158557g;
        StringBuilder sb7 = new StringBuilder(36);
        sb7.append("open sky detector false: ");
        sb7.append(i6);
        printWriter.println(sb7.toString());
        int i7 = ((bvzr) this.f113226b.f164949b).f158559i;
        StringBuilder sb8 = new StringBuilder(30);
        sb8.append("no geo data count: ");
        sb8.append(i7);
        printWriter.println(sb8.toString());
        int i8 = ((bvzr) this.f113226b.f164949b).f158560j;
        StringBuilder sb9 = new StringBuilder(34);
        sb9.append("not enough sats count: ");
        sb9.append(i8);
        printWriter.println(sb9.toString());
        if (this.f113227c) {
            int i9 = ((bvzr) this.f113226b.f164949b).f158568r;
            StringBuilder sb10 = new StringBuilder(35);
            sb10.append("no gnss location count: ");
            sb10.append(i9);
            printWriter.println(sb10.toString());
            int i10 = ((bvzr) this.f113226b.f164949b).f158569s;
            StringBuilder sb11 = new StringBuilder(34);
            sb11.append("no flp location count: ");
            sb11.append(i10);
            printWriter.println(sb11.toString());
            int i11 = ((bvzr) this.f113226b.f164949b).f158570t;
            StringBuilder sb12 = new StringBuilder(38);
            sb12.append("need both locations count: ");
            sb12.append(i11);
            printWriter.println(sb12.toString());
            int i12 = ((bvzr) this.f113226b.f164949b).f158571u;
            StringBuilder sb13 = new StringBuilder(33);
            sb13.append("no grid center count: ");
            sb13.append(i12);
            printWriter.println(sb13.toString());
            int i13 = ((bvzr) this.f113226b.f164949b).f158572v;
            StringBuilder sb14 = new StringBuilder(52);
            sb14.append("location accuracy above threshold count: ");
            sb14.append(i13);
            printWriter.println(sb14.toString());
            int i14 = ((bvzr) this.f113226b.f164949b).f158573w;
            StringBuilder sb15 = new StringBuilder(30);
            sb15.append("not on foot count: ");
            sb15.append(i14);
            printWriter.println(sb15.toString());
            int i15 = ((bvzr) this.f113226b.f164949b).f158574x;
            StringBuilder sb16 = new StringBuilder(29);
            sb16.append("screen off count: ");
            sb16.append(i15);
            printWriter.println(sb16.toString());
            int i16 = ((bvzr) this.f113226b.f164949b).f158575y;
            StringBuilder sb17 = new StringBuilder(33);
            sb17.append("small movement count: ");
            sb17.append(i16);
            printWriter.println(sb17.toString());
            int i17 = ((bvzr) this.f113226b.f164949b).f158550D;
            StringBuilder sb18 = new StringBuilder(38);
            sb18.append("grid radius too big count: ");
            sb18.append(i17);
            printWriter.println(sb18.toString());
        }
        int i18 = ((bvzr) this.f113226b.f164949b).f158561k;
        StringBuilder sb19 = new StringBuilder(57);
        sb19.append("problos cache resets from satellite movement: ");
        sb19.append(i18);
        printWriter.println(sb19.toString());
        int i19 = ((bvzr) this.f113226b.f164949b).f158562l;
        StringBuilder sb20 = new StringBuilder(45);
        sb20.append("problos cache resets from raster: ");
        sb20.append(i19);
        printWriter.println(sb20.toString());
        int i20 = ((bvzr) this.f113226b.f164949b).f158563m;
        StringBuilder sb21 = new StringBuilder(44);
        sb21.append("problos cache resets from clear: ");
        sb21.append(i20);
        printWriter.println(sb21.toString());
        int i21 = ((bvzr) this.f113226b.f164949b).f158564n;
        StringBuilder sb22 = new StringBuilder(39);
        sb22.append("problos cache losview hits: ");
        sb22.append(i21);
        printWriter.println(sb22.toString());
        int i22 = ((bvzr) this.f113226b.f164949b).f158565o;
        StringBuilder sb23 = new StringBuilder(31);
        sb23.append("problos cache hits: ");
        sb23.append(i22);
        printWriter.println(sb23.toString());
        int i23 = ((bvzr) this.f113226b.f164949b).f158566p;
        StringBuilder sb24 = new StringBuilder(33);
        sb24.append("problos cache misses: ");
        sb24.append(i23);
        printWriter.println(sb24.toString());
        int i24 = ((bvzr) this.f113226b.f164949b).f158567q;
        StringBuilder sb25 = new StringBuilder(41);
        sb25.append("problos cache partial misses: ");
        sb25.append(i24);
        printWriter.println(sb25.toString());
        if (this.f113227c) {
            int i25 = ((bvzr) this.f113226b.f164949b).f158548B;
            StringBuilder sb26 = new StringBuilder(30);
            sb26.append("tile lookup count: ");
            sb26.append(i25);
            printWriter.println(sb26.toString());
            int i26 = ((bvzr) this.f113226b.f164949b).f158549C;
            StringBuilder sb27 = new StringBuilder(41);
            sb27.append("tile load from network count: ");
            sb27.append(i26);
            printWriter.println(sb27.toString());
            int i27 = ((bvzr) this.f113226b.f164949b).f158576z;
            StringBuilder sb28 = new StringBuilder(38);
            sb28.append("max GNSS signals observed: ");
            sb28.append(i27);
            printWriter.println(sb28.toString());
            float f = ((bvzr) this.f113226b.f164949b).f158547A;
            StringBuilder sb29 = new StringBuilder(33);
            sb29.append("max observed CN0: ");
            sb29.append(f);
            printWriter.println(sb29.toString());
        }
    }
}
