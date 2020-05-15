package p000;

import android.os.health.HealthStats;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;

/* renamed from: bdje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdje {

    /* renamed from: a */
    final Long f105726a;

    /* renamed from: b */
    final Long f105727b;

    /* renamed from: c */
    final HealthStats f105728c;

    /* renamed from: d */
    final cimj f105729d;

    /* renamed from: e */
    final Boolean f105730e;

    /* renamed from: f */
    final /* synthetic */ bdjf f105731f;

    public bdje(bdjf bdjf, Long l, Long l2, HealthStats healthStats, cimj cimj, Boolean bool) {
        this.f105731f = bdjf;
        this.f105726a = l;
        this.f105727b = l2;
        this.f105728c = healthStats;
        this.f105729d = cimj;
        this.f105730e = bool;
    }

    /* renamed from: a */
    public final bdjz mo58083a() {
        bdkc bdkc = this.f105731f.f105732a;
        HealthStats healthStats = this.f105728c;
        cimu cimu = (cimu) cimv.f190788ar.mo74144da();
        long a = bdjw.m90934a(healthStats, 10001);
        long j = 0;
        if (a != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv = (cimv) cimu.f164949b;
            cimv.f190816a |= 1;
            cimv.f190831c = a;
        }
        long a2 = bdjw.m90934a(healthStats, 10002);
        if (a2 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv2 = (cimv) cimu.f164949b;
            cimv2.f190816a |= 2;
            cimv2.f190832d = a2;
        }
        long a3 = bdjw.m90934a(healthStats, 10003);
        if (a3 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv3 = (cimv) cimu.f164949b;
            cimv3.f190816a |= 4;
            cimv3.f190833e = a3;
        }
        long a4 = bdjw.m90934a(healthStats, 10004);
        if (a4 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv4 = (cimv) cimu.f164949b;
            cimv4.f190816a |= 8;
            cimv4.f190834f = a4;
        }
        cimu.mo86252g(bdjw.m90944c(healthStats, 10005));
        cimu.mo86238ae(bdjw.m90944c(healthStats, 10006));
        cimu.mo86239af(bdjw.m90944c(healthStats, 10007));
        cimu.mo86250f(bdjw.m90944c(healthStats, 10008));
        cimu.mo86248e(bdjw.m90944c(healthStats, 10009));
        cimu.mo86237a(bdjw.m90944c(healthStats, 10010));
        cimt b = bdjw.m90943b(healthStats, 10011);
        if (b != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv5 = (cimv) cimu.f164949b;
            b.getClass();
            cimv5.f190841m = b;
            cimv5.f190816a |= 16;
        }
        cimu.mo86242b(bdjw.m90944c(healthStats, 10012));
        cimu.mo86246d(bdjs.f105764a.mo58094a(bdjw.m90945d(healthStats, 10014)));
        cimu.mo86244c(bdjr.f105763a.mo58094a(bdjw.m90945d(healthStats, 10015)));
        long a5 = bdjw.m90934a(healthStats, 10016);
        if (a5 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv6 = (cimv) cimu.f164949b;
            cimv6.f190816a |= 32;
            cimv6.f190846r = a5;
        }
        long a6 = bdjw.m90934a(healthStats, 10017);
        if (a6 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv7 = (cimv) cimu.f164949b;
            cimv7.f190816a |= 64;
            cimv7.f190847s = a6;
        }
        long a7 = bdjw.m90934a(healthStats, 10018);
        if (a7 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv8 = (cimv) cimu.f164949b;
            cimv8.f190816a |= 128;
            cimv8.f190848t = a7;
        }
        long a8 = bdjw.m90934a(healthStats, 10019);
        if (a8 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv9 = (cimv) cimu.f164949b;
            cimv9.f190816a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cimv9.f190849u = a8;
        }
        long a9 = bdjw.m90934a(healthStats, 10020);
        if (a9 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv10 = (cimv) cimu.f164949b;
            cimv10.f190816a |= 512;
            cimv10.f190850v = a9;
        }
        long a10 = bdjw.m90934a(healthStats, 10021);
        if (a10 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv11 = (cimv) cimu.f164949b;
            cimv11.f190816a |= 1024;
            cimv11.f190851w = a10;
        }
        long a11 = bdjw.m90934a(healthStats, 10022);
        if (a11 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv12 = (cimv) cimu.f164949b;
            cimv12.f190816a |= 2048;
            cimv12.f190852x = a11;
        }
        long a12 = bdjw.m90934a(healthStats, 10023);
        if (a12 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv13 = (cimv) cimu.f164949b;
            cimv13.f190816a |= 4096;
            cimv13.f190853y = a12;
        }
        long a13 = bdjw.m90934a(healthStats, 10024);
        if (a13 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv14 = (cimv) cimu.f164949b;
            cimv14.f190816a |= 8192;
            cimv14.f190854z = a13;
        }
        long a14 = bdjw.m90934a(healthStats, 10025);
        if (a14 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv15 = (cimv) cimu.f164949b;
            cimv15.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            cimv15.f190790A = a14;
        }
        long a15 = bdjw.m90934a(healthStats, 10026);
        if (a15 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv16 = (cimv) cimu.f164949b;
            cimv16.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            cimv16.f190791B = a15;
        }
        long a16 = bdjw.m90934a(healthStats, 10027);
        if (a16 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv17 = (cimv) cimu.f164949b;
            cimv17.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            cimv17.f190792C = a16;
        }
        long a17 = bdjw.m90934a(healthStats, 10028);
        if (a17 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv18 = (cimv) cimu.f164949b;
            cimv18.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            cimv18.f190793D = a17;
        }
        long a18 = bdjw.m90934a(healthStats, 10029);
        if (a18 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv19 = (cimv) cimu.f164949b;
            cimv19.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            cimv19.f190794E = a18;
        }
        cimt b2 = bdjw.m90943b(healthStats, 10030);
        if (b2 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv20 = (cimv) cimu.f164949b;
            b2.getClass();
            cimv20.f190795F = b2;
            cimv20.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }
        long a19 = bdjw.m90934a(healthStats, 10031);
        if (a19 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv21 = (cimv) cimu.f164949b;
            cimv21.f190816a |= 1048576;
            cimv21.f190796G = a19;
        }
        cimt b3 = bdjw.m90943b(healthStats, 10032);
        if (b3 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv22 = (cimv) cimu.f164949b;
            b3.getClass();
            cimv22.f190797H = b3;
            cimv22.f190816a |= 2097152;
        }
        cimt b4 = bdjw.m90943b(healthStats, 10033);
        if (b4 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv23 = (cimv) cimu.f164949b;
            b4.getClass();
            cimv23.f190798I = b4;
            cimv23.f190816a |= 4194304;
        }
        cimt b5 = bdjw.m90943b(healthStats, 10034);
        if (b5 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv24 = (cimv) cimu.f164949b;
            b5.getClass();
            cimv24.f190799J = b5;
            cimv24.f190816a |= 8388608;
        }
        cimt b6 = bdjw.m90943b(healthStats, 10035);
        if (b6 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv25 = (cimv) cimu.f164949b;
            b6.getClass();
            cimv25.f190800K = b6;
            cimv25.f190816a |= 16777216;
        }
        cimt b7 = bdjw.m90943b(healthStats, 10036);
        if (b7 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv26 = (cimv) cimu.f164949b;
            b7.getClass();
            cimv26.f190801L = b7;
            cimv26.f190816a |= 33554432;
        }
        cimt b8 = bdjw.m90943b(healthStats, 10037);
        if (b8 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv27 = (cimv) cimu.f164949b;
            b8.getClass();
            cimv27.f190802M = b8;
            cimv27.f190816a |= 67108864;
        }
        cimt b9 = bdjw.m90943b(healthStats, 10038);
        if (b9 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv28 = (cimv) cimu.f164949b;
            b9.getClass();
            cimv28.f190803N = b9;
            cimv28.f190816a |= 134217728;
        }
        cimt b10 = bdjw.m90943b(healthStats, 10039);
        if (b10 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv29 = (cimv) cimu.f164949b;
            b10.getClass();
            cimv29.f190804O = b10;
            cimv29.f190816a |= 268435456;
        }
        cimt b11 = bdjw.m90943b(healthStats, 10040);
        if (b11 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv30 = (cimv) cimu.f164949b;
            b11.getClass();
            cimv30.f190805P = b11;
            cimv30.f190816a |= 536870912;
        }
        cimt b12 = bdjw.m90943b(healthStats, 10041);
        if (b12 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv31 = (cimv) cimu.f164949b;
            b12.getClass();
            cimv31.f190806Q = b12;
            cimv31.f190816a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        }
        cimt b13 = bdjw.m90943b(healthStats, 10042);
        if (b13 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv32 = (cimv) cimu.f164949b;
            b13.getClass();
            cimv32.f190807R = b13;
            cimv32.f190816a |= Integer.MIN_VALUE;
        }
        cimt b14 = bdjw.m90943b(healthStats, 10043);
        if (b14 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv33 = (cimv) cimu.f164949b;
            b14.getClass();
            cimv33.f190808S = b14;
            cimv33.f190830b |= 1;
        }
        cimt b15 = bdjw.m90943b(healthStats, 10044);
        if (b15 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv34 = (cimv) cimu.f164949b;
            b15.getClass();
            cimv34.f190809T = b15;
            cimv34.f190830b |= 2;
        }
        long a20 = bdjw.m90934a(healthStats, 10045);
        if (a20 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv35 = (cimv) cimu.f164949b;
            cimv35.f190830b |= 4;
            cimv35.f190810U = a20;
        }
        long a21 = bdjw.m90934a(healthStats, 10046);
        if (a21 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv36 = (cimv) cimu.f164949b;
            cimv36.f190830b |= 8;
            cimv36.f190811V = a21;
        }
        long a22 = bdjw.m90934a(healthStats, 10047);
        if (a22 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv37 = (cimv) cimu.f164949b;
            cimv37.f190830b |= 16;
            cimv37.f190812W = a22;
        }
        long a23 = bdjw.m90934a(healthStats, 10048);
        if (a23 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv38 = (cimv) cimu.f164949b;
            cimv38.f190830b |= 32;
            cimv38.f190813X = a23;
        }
        long a24 = bdjw.m90934a(healthStats, 10049);
        if (a24 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv39 = (cimv) cimu.f164949b;
            cimv39.f190830b |= 64;
            cimv39.f190814Y = a24;
        }
        long a25 = bdjw.m90934a(healthStats, 10050);
        if (a25 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv40 = (cimv) cimu.f164949b;
            cimv40.f190830b |= 128;
            cimv40.f190815Z = a25;
        }
        long a26 = bdjw.m90934a(healthStats, 10051);
        if (a26 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv41 = (cimv) cimu.f164949b;
            cimv41.f190830b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cimv41.f190817aa = a26;
        }
        long a27 = bdjw.m90934a(healthStats, 10052);
        if (a27 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv42 = (cimv) cimu.f164949b;
            cimv42.f190830b |= 512;
            cimv42.f190818ab = a27;
        }
        long a28 = bdjw.m90934a(healthStats, 10053);
        if (a28 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv43 = (cimv) cimu.f164949b;
            cimv43.f190830b |= 1024;
            cimv43.f190819ac = a28;
        }
        long a29 = bdjw.m90934a(healthStats, 10054);
        if (a29 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv44 = (cimv) cimu.f164949b;
            cimv44.f190830b |= 2048;
            cimv44.f190820ad = a29;
        }
        long a30 = bdjw.m90934a(healthStats, 10055);
        if (a30 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv45 = (cimv) cimu.f164949b;
            cimv45.f190830b |= 4096;
            cimv45.f190821ae = a30;
        }
        long a31 = bdjw.m90934a(healthStats, 10056);
        if (a31 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv46 = (cimv) cimu.f164949b;
            cimv46.f190830b |= 8192;
            cimv46.f190822af = a31;
        }
        long a32 = bdjw.m90934a(healthStats, 10057);
        if (a32 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv47 = (cimv) cimu.f164949b;
            cimv47.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            cimv47.f190823ak = a32;
        }
        long a33 = bdjw.m90934a(healthStats, 10058);
        if (a33 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv48 = (cimv) cimu.f164949b;
            cimv48.f190830b = 32768 | cimv48.f190830b;
            cimv48.f190824al = a33;
        }
        long a34 = bdjw.m90934a(healthStats, 10059);
        if (a34 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv49 = (cimv) cimu.f164949b;
            cimv49.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            cimv49.f190825am = a34;
        }
        cimt b16 = bdjw.m90943b(healthStats, 10061);
        if (b16 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv50 = (cimv) cimu.f164949b;
            b16.getClass();
            cimv50.f190826an = b16;
            cimv50.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        }
        long a35 = bdjw.m90934a(healthStats, 10062);
        if (a35 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv51 = (cimv) cimu.f164949b;
            cimv51.f190830b = 262144 | cimv51.f190830b;
            cimv51.f190827ao = a35;
        }
        long a36 = bdjw.m90934a(healthStats, 10063);
        if (a36 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv52 = (cimv) cimu.f164949b;
            cimv52.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            cimv52.f190828ap = a36;
        }
        long a37 = bdjw.m90934a(healthStats, 10064);
        if (a37 != 0) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv53 = (cimv) cimu.f164949b;
            cimv53.f190830b |= 1048576;
            cimv53.f190829aq = a37;
        }
        cimv cimv54 = (cimv) cimu.mo74062i();
        bxvd bxvd = (bxvd) cimv54.mo74142c(5);
        bxvd.mo73625a((bxvk) cimv54);
        cimu cimu2 = (cimu) bxvd;
        bdjp bdjp = bdkc.f105784b;
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190835g);
        for (int i = 0; i < ((cimv) cimu2.f164949b).f190835g.size(); i++) {
            cimu2.mo86247e(i, bdjp.mo58088a(1, cimu2.mo86235a(i)));
        }
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190836h);
        for (int i2 = 0; i2 < ((cimv) cimu2.f164949b).f190836h.size(); i2++) {
            cimu2.mo86249f(i2, bdjp.mo58088a(1, cimu2.mo86240b(i2)));
        }
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190837i);
        for (int i3 = 0; i3 < ((cimv) cimu2.f164949b).f190837i.size(); i3++) {
            cimu2.mo86251g(i3, bdjp.mo58088a(1, cimu2.mo86230G(i3)));
        }
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190838j);
        for (int i4 = 0; i4 < ((cimv) cimu2.f164949b).f190838j.size(); i4++) {
            cimu2.mo86245d(i4, bdjp.mo58088a(1, cimu2.mo86231H(i4)));
        }
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190839k);
        for (int i5 = 0; i5 < ((cimv) cimu2.f164949b).f190839k.size(); i5++) {
            cimu2.mo86243c(i5, bdjp.mo58088a(2, cimu2.mo86232I(i5)));
        }
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190840l);
        for (int i6 = 0; i6 < ((cimv) cimu2.f164949b).f190840l.size(); i6++) {
            cimu2.mo86236a(i6, bdjp.mo58088a(3, cimu2.mo86233J(i6)));
        }
        Collections.unmodifiableList(((cimv) cimu2.f164949b).f190842n);
        for (int i7 = 0; i7 < ((cimv) cimu2.f164949b).f190842n.size(); i7++) {
            cimu2.mo86241b(i7, bdjp.mo58088a(5, cimu2.mo86234K(i7)));
        }
        cimv cimv55 = (cimv) cimu2.mo74062i();
        Long l = this.f105726a;
        Long l2 = this.f105727b;
        Long l3 = ((bdgf) this.f105731f.f105734c.mo6445a()).f105580g;
        String str = ((bdgf) this.f105731f.f105734c.mo6445a()).f105577d;
        if (str != null) {
            j = (long) str.hashCode();
        }
        return new bdjz(cimv55, l, l2, l3, Long.valueOf(j), this.f105729d, null, this.f105730e, null);
    }
}
