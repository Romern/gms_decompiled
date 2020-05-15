package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cihv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihv implements cihn {

    /* renamed from: a */
    final cihq f190376a = new cihq(this.f190378c);

    /* renamed from: b */
    private final cipw f190377b;

    /* renamed from: c */
    private final ciht f190378c = new ciht(this.f190377b);

    public cihv(cipw cipw) {
        this.f190377b = cipw;
    }

    /* renamed from: a */
    private final List m150343a(int i, short s, byte b, int i2) {
        ciht ciht = this.f190378c;
        ciht.f190370d = i;
        ciht.f190367a = i;
        ciht.f190371e = s;
        ciht.f190368b = b;
        ciht.f190369c = i2;
        cihq cihq = this.f190376a;
        while (!cihq.f190352b.mo86295b()) {
            byte e = cihq.f190352b.mo86305e() & 255;
            if (e == 128) {
                throw new IOException("index == 0");
            } else if ((e & 128) == 128) {
                int a = cihq.mo86118a(e, 127) - 1;
                if (cihq.m150327c(a)) {
                    cihq.f190351a.add(cihs.f190365b[a]);
                } else {
                    int a2 = cihq.mo86117a(a - cihs.f190365b.length);
                    if (a2 >= 0) {
                        cihp[] cihpArr = cihq.f190355e;
                        if (a2 <= cihpArr.length - 1) {
                            cihq.f190351a.add(cihpArr[a2]);
                        }
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Header index too large ");
                    sb.append(a + 1);
                    throw new IOException(sb.toString());
                }
            } else if (e == 64) {
                cipx b2 = cihq.mo86121b();
                cihs.m150339a(b2);
                cihq.mo86120a(new cihp(b2, cihq.mo86121b()));
            } else if ((e & 64) == 64) {
                cihq.mo86120a(new cihp(cihq.mo86122b(cihq.mo86118a(e, 63) - 1), cihq.mo86121b()));
            } else if ((e & 32) == 32) {
                int a3 = cihq.mo86118a(e, 31);
                cihq.f190354d = a3;
                if (a3 < 0 || a3 > cihq.f190353c) {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Invalid dynamic table size update ");
                    sb2.append(a3);
                    throw new IOException(sb2.toString());
                }
                cihq.mo86119a();
            } else if (e == 16 || e == 0) {
                cipx b3 = cihq.mo86121b();
                cihs.m150339a(b3);
                cihq.f190351a.add(new cihp(b3, cihq.mo86121b()));
            } else {
                cihq.f190351a.add(new cihp(cihq.mo86122b(cihq.mo86118a(e, 15) - 1), cihq.mo86121b()));
            }
        }
        cihq cihq2 = this.f190376a;
        ArrayList arrayList = new ArrayList(cihq2.f190351a);
        cihq2.f190351a.clear();
        return arrayList;
    }

    public final void close() {
        this.f190377b.close();
    }

    /* renamed from: a */
    private final void m150344a() {
        this.f190377b.mo86312g();
        this.f190377b.mo86305e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cifq.a(boolean, int, int):void
     arg types: [int, int, int]
     candidates:
      cifq.a(boolean, int, java.util.List):void
      ciho.a(boolean, int, java.util.List):void
      cifq.a(boolean, int, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0691 A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo86113a(cigg cigg) {
        byte b;
        chuv chuv;
        boolean z;
        boolean z2;
        boolean z3;
        int g;
        ciam ciam;
        ciae ciae;
        chuv chuv2;
        chuv chuv3;
        cigg cigg2 = cigg;
        byte b2 = 0;
        try {
            this.f190377b.mo86285a(9);
            int a = cihx.m150358a(this.f190377b);
            if (a <= 16384) {
                byte e = (byte) (this.f190377b.mo86305e() & 255);
                byte e2 = (byte) (this.f190377b.mo86305e() & 255);
                int g2 = this.f190377b.mo86312g() & Integer.MAX_VALUE;
                if (cihx.f190384a.isLoggable(Level.FINE)) {
                    cihx.f190384a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", cihu.m150342a(true, g2, a, e, e2));
                }
                switch (e) {
                    case 0:
                        byte b3 = e2 & 1;
                        if ((e2 & 32) == 0) {
                            byte e3 = (e2 & 8) != 0 ? this.f190377b.mo86305e() & 255 : 0;
                            int a2 = cihx.m150357a(a, e2, (short) e3);
                            cipw cipw = this.f190377b;
                            cigk cigk = cigg2.f190087a;
                            ciqm ciqm = (ciqm) cipw;
                            cipu cipu = ciqm.f191247a;
                            boolean z4 = b3 != 0;
                            cigk.mo86070a(1, g2, cipu, a2, z4);
                            cifz b4 = cigg2.f190090d.mo86060b(g2);
                            if (b4 == null) {
                                if (!cigg2.f190090d.mo86059a(g2)) {
                                    cigh cigh = cigg2.f190090d;
                                    cihm cihm = cihm.PROTOCOL_ERROR;
                                    StringBuilder sb = new StringBuilder(45);
                                    sb.append("Received data for unknown stream: ");
                                    sb.append(g2);
                                    String sb2 = sb.toString();
                                    Logger logger = cigh.f190093a;
                                    cigh.mo86058a(cihm, sb2);
                                    this.f190377b.mo86317h((long) e3);
                                    break;
                                } else {
                                    cigh cigh2 = cigg2.f190090d;
                                    Logger logger2 = cigh.f190093a;
                                    synchronized (cigh2.f190115j) {
                                        cigg2.f190090d.f190113h.mo86034a(g2, cihm.INVALID_STREAM);
                                    }
                                    cipw.mo86317h((long) a2);
                                }
                            } else {
                                long j = (long) a2;
                                cipw.mo86285a(j);
                                cipu cipu2 = new cipu();
                                cipu2.mo74930a(ciqm.f191247a, j);
                                int i = ciix.f190424a;
                                cigh cigh3 = cigg2.f190090d;
                                Logger logger3 = cigh.f190093a;
                                synchronized (cigh3.f190115j) {
                                    b4.f190076h.mo86048a(cipu2, z4);
                                }
                            }
                            cigh cigh4 = cigg2.f190090d;
                            int i2 = cigh4.f190118m + a2;
                            cigh4.f190118m = i2;
                            if (((float) i2) >= ((float) cigh4.f190111f) * 0.5f) {
                                synchronized (cigh4.f190115j) {
                                    cigh cigh5 = cigg2.f190090d;
                                    cigh5.f190113h.mo86033a(0, (long) cigh5.f190118m);
                                }
                                cigg2.f190090d.f190118m = 0;
                            }
                            this.f190377b.mo86317h((long) e3);
                        } else {
                            throw cihx.m150360b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                    case 1:
                        if (g2 != 0) {
                            byte b5 = e2 & 1;
                            byte e4 = (e2 & 8) != 0 ? this.f190377b.mo86305e() & 255 : 0;
                            if ((e2 & 32) != 0) {
                                m150344a();
                                a -= 5;
                            }
                            short s = (short) e4;
                            List a3 = m150343a(cihx.m150357a(a, e2, s), s, e2, g2);
                            cigk cigk2 = cigg2.f190087a;
                            if (cigk2.mo86073a()) {
                                Logger logger4 = cigk2.f190140a;
                                Level level = cigk2.f190141b;
                                String a4 = cigi.m150239a(1);
                                String valueOf = String.valueOf(a3);
                                StringBuilder sb3 = new StringBuilder(a4.length() + 55 + String.valueOf(valueOf).length());
                                sb3.append(a4);
                                sb3.append(" HEADERS: streamId=");
                                sb3.append(g2);
                                sb3.append(" headers=");
                                sb3.append(valueOf);
                                sb3.append(" endStream=");
                                sb3.append(b5 != 0);
                                logger4.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", sb3.toString());
                            }
                            cigh cigh6 = cigg2.f190090d;
                            Logger logger5 = cigh.f190093a;
                            if (cigh6.f190096C != Integer.MAX_VALUE) {
                                int i3 = 0;
                                long j2 = 0;
                                while (i3 < a3.size()) {
                                    cihp cihp = (cihp) a3.get(i3);
                                    j2 += (long) (cihp.f190348f.mo86345e() + 32 + cihp.f190349g.mo86345e());
                                    i3++;
                                    b5 = b5;
                                }
                                b = b5;
                                int min = (int) Math.min(j2, 2147483647L);
                                if (min > cigg2.f190090d.f190096C) {
                                    chuv chuv4 = chuv.f189224k;
                                    Object[] objArr = new Object[3];
                                    objArr[0] = b == 0 ? "header" : "trailer";
                                    objArr[1] = Integer.valueOf(cigg2.f190090d.f190096C);
                                    objArr[2] = Integer.valueOf(min);
                                    chuv = chuv4.mo85687a(String.format("Response %s metadata larger than %d: %d", objArr));
                                    synchronized (cigg2.f190090d.f190115j) {
                                        cifz cifz = (cifz) cigg2.f190090d.f190116k.get(Integer.valueOf(g2));
                                        if (cifz == null) {
                                            if (cigg2.f190090d.mo86059a(g2)) {
                                                cigg2.f190090d.f190113h.mo86034a(g2, cihm.INVALID_STREAM);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                        } else if (chuv == null) {
                                            int i4 = ciix.f190424a;
                                            cify cify = cifz.f190076h;
                                            if (b != 0) {
                                                cify.mo85868b(chsg.m149482a(cigu.m150276a(a3)));
                                                z = false;
                                            } else {
                                                cify.mo85866a(chsg.m149482a(cigu.m150276a(a3)));
                                                z = false;
                                            }
                                        } else {
                                            if (b == 0) {
                                                cigg2.f190090d.f190113h.mo86034a(g2, cihm.CANCEL);
                                            }
                                            cifz.f190076h.mo85777b(chuv, false, new chtr());
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        cigh cigh7 = cigg2.f190090d;
                                        cihm cihm2 = cihm.PROTOCOL_ERROR;
                                        StringBuilder sb4 = new StringBuilder(47);
                                        sb4.append("Received header for unknown stream: ");
                                        sb4.append(g2);
                                        cigh7.mo86058a(cihm2, sb4.toString());
                                        break;
                                    }
                                }
                            } else {
                                b = b5;
                            }
                            chuv = null;
                            synchronized (cigg2.f190090d.f190115j) {
                            }
                        } else {
                            throw cihx.m150360b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                        break;
                    case 2:
                        if (a != 5) {
                            throw cihx.m150360b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        } else if (g2 != 0) {
                            m150344a();
                            break;
                        } else {
                            throw cihx.m150360b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case 3:
                        if (a != 4) {
                            throw cihx.m150360b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        } else if (g2 != 0) {
                            int g3 = this.f190377b.mo86312g();
                            cihm a5 = cihm.m150314a(g3);
                            if (a5 != null) {
                                cigg2.f190087a.mo86068a(1, g2, a5);
                                chuv b6 = cigh.m150218a(a5).mo85690b("Rst Stream");
                                if (b6.f189233s == chus.CANCELLED || b6.f189233s == chus.DEADLINE_EXCEEDED) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                synchronized (cigg2.f190090d.f190115j) {
                                    if (((cifz) cigg2.f190090d.f190116k.get(Integer.valueOf(g2))) != null) {
                                        int i5 = ciix.f190424a;
                                        cigg2.f190090d.mo86055a(g2, b6, a5 != cihm.REFUSED_STREAM ? chxt.PROCESSED : chxt.REFUSED, z2, null, null);
                                    }
                                }
                                break;
                            } else {
                                throw cihx.m150360b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(g3));
                            }
                        } else {
                            throw cihx.m150360b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case 4:
                        if (g2 != 0) {
                            throw cihx.m150360b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((e2 & 1) == 0) {
                            if (a % 6 == 0) {
                                ciia ciia = new ciia();
                                int i6 = 0;
                                while (true) {
                                    short s2 = 7;
                                    if (i6 >= a) {
                                        cigg2.f190087a.mo86072a(1, ciia);
                                        cigh cigh8 = cigg2.f190090d;
                                        Logger logger6 = cigh.f190093a;
                                        synchronized (cigh8.f190115j) {
                                            if (ciia.mo86132a(4)) {
                                                cigg2.f190090d.f190126u = ciia.mo86133b(4);
                                            }
                                            if (ciia.mo86132a(7)) {
                                                int b7 = ciia.mo86133b(7);
                                                cigt cigt = cigg2.f190090d.f190114i;
                                                if (b7 >= 0) {
                                                    int i7 = b7 - cigt.f190167c;
                                                    cigt.f190167c = b7;
                                                    cifz[] d = cigt.f190165a.mo86064d();
                                                    for (cifz cifz2 : d) {
                                                        Object obj = cifz2.f190074f;
                                                        if (obj == null) {
                                                            cifz2.f190074f = new cigr(cigt, cifz2, cigt.f190167c);
                                                        } else {
                                                            ((cigr) obj).mo86078a(i7);
                                                        }
                                                    }
                                                    z3 = i7 > 0;
                                                } else {
                                                    StringBuilder sb5 = new StringBuilder(40);
                                                    sb5.append("Invalid initial window size: ");
                                                    sb5.append(b7);
                                                    throw new IllegalArgumentException(sb5.toString());
                                                }
                                            } else {
                                                z3 = false;
                                            }
                                            if (cigg2.f190089c) {
                                                cigg2.f190090d.f190112g.mo85891a();
                                                cigg2.f190089c = false;
                                            }
                                            cifq cifq = cigg2.f190090d.f190113h;
                                            cigk cigk3 = cifq.f190024c;
                                            if (cigk3.mo86073a()) {
                                                Logger logger7 = cigk3.f190140a;
                                                Level level2 = cigk3.f190141b;
                                                String a6 = cigi.m150239a(2);
                                                StringBuilder sb6 = new StringBuilder(a6.length() + 19);
                                                sb6.append(a6);
                                                sb6.append(" SETTINGS: ack=true");
                                                logger7.logp(level2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", sb6.toString());
                                            }
                                            try {
                                                cifq.f190023b.mo86036a(ciia);
                                            } catch (IOException e5) {
                                                cifq.f190022a.mo86031a(e5);
                                            }
                                            if (z3) {
                                                cigg2.f190090d.f190114i.mo86087b();
                                            }
                                            cigg2.f190090d.mo86063c();
                                        }
                                        if (ciia.mo86130a() >= 0) {
                                            cihq cihq = this.f190376a;
                                            int a7 = ciia.mo86130a();
                                            cihq.f190353c = a7;
                                            cihq.f190354d = a7;
                                            cihq.mo86119a();
                                            break;
                                        }
                                    } else {
                                        short f = this.f190377b.mo86310f();
                                        g = this.f190377b.mo86312g();
                                        switch (f) {
                                            case 1:
                                            case 6:
                                                s2 = f;
                                                break;
                                            case 2:
                                                if (!(g == 0 || g == 1)) {
                                                    throw cihx.m150360b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                                }
                                                s2 = f;
                                                break;
                                            case 3:
                                                s2 = 4;
                                                break;
                                            case 4:
                                                if (g < 0) {
                                                    throw cihx.m150360b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                                }
                                                break;
                                            case 5:
                                                if (g < 16384 || g > 16777215) {
                                                    break;
                                                }
                                                s2 = f;
                                                break;
                                            default:
                                                continue;
                                                i6 += 6;
                                        }
                                        ciia.mo86131a(s2, g);
                                        i6 += 6;
                                    }
                                }
                                throw cihx.m150360b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(g));
                            }
                            throw cihx.m150360b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                        } else if (a != 0) {
                            throw cihx.m150360b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        }
                        break;
                    case 5:
                        if (g2 != 0) {
                            if ((e2 & 8) != 0) {
                                b2 = this.f190377b.mo86305e() & 255;
                            }
                            int g4 = this.f190377b.mo86312g() & Integer.MAX_VALUE;
                            short s3 = (short) b2;
                            List a8 = m150343a(cihx.m150357a(a - 4, e2, s3), s3, e2, g2);
                            cigk cigk4 = cigg2.f190087a;
                            if (cigk4.mo86073a()) {
                                Logger logger8 = cigk4.f190140a;
                                Level level3 = cigk4.f190141b;
                                String a9 = cigi.m150239a(1);
                                String valueOf2 = String.valueOf(a8);
                                StringBuilder sb7 = new StringBuilder(a9.length() + 73 + String.valueOf(valueOf2).length());
                                sb7.append(a9);
                                sb7.append(" PUSH_PROMISE: streamId=");
                                sb7.append(g2);
                                sb7.append(" promisedStreamId=");
                                sb7.append(g4);
                                sb7.append(" headers=");
                                sb7.append(valueOf2);
                                logger8.logp(level3, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", sb7.toString());
                            }
                            cigh cigh9 = cigg2.f190090d;
                            Logger logger9 = cigh.f190093a;
                            synchronized (cigh9.f190115j) {
                                cigg2.f190090d.f190113h.mo86034a(g2, cihm.PROTOCOL_ERROR);
                            }
                            break;
                        } else {
                            throw cihx.m150360b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                    case 6:
                        if (a != 8) {
                            throw cihx.m150360b("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        } else if (g2 == 0) {
                            int g5 = this.f190377b.mo86312g();
                            int g6 = this.f190377b.mo86312g();
                            long j3 = (((long) g5) << 32) | (((long) g6) & 4294967295L);
                            cigg2.f190087a.mo86071a(1, j3);
                            if ((e2 & 1) != 0) {
                                cigh cigh10 = cigg2.f190090d;
                                Logger logger10 = cigh.f190093a;
                                synchronized (cigh10.f190115j) {
                                    cigh cigh11 = cigg2.f190090d;
                                    ciam = cigh11.f190122q;
                                    if (ciam == null) {
                                        cigh.f190093a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
                                        ciam = null;
                                    } else if (ciam.f189669a != j3) {
                                        cigh.f190093a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(cigg2.f190090d.f190122q.f189669a), Long.valueOf(j3)));
                                        ciam = null;
                                    } else {
                                        cigh11.f190122q = null;
                                    }
                                }
                                if (ciam != null) {
                                    synchronized (ciam) {
                                        if (ciam.f189672d) {
                                            break;
                                        } else {
                                            ciam.f189672d = true;
                                            ciam.f189674f = ciam.f189670b.mo66928a(TimeUnit.NANOSECONDS);
                                            Map map = ciam.f189671c;
                                            ciam.f189671c = null;
                                            for (Map.Entry entry : map.entrySet()) {
                                                cibn cibn = (cibn) entry.getKey();
                                                ciam.m149931a((Executor) entry.getValue(), ciam.m149928a());
                                            }
                                            break;
                                        }
                                    }
                                }
                            } else {
                                cigh cigh12 = cigg2.f190090d;
                                Logger logger11 = cigh.f190093a;
                                synchronized (cigh12.f190115j) {
                                    cigg2.f190090d.f190113h.mo86037a(true, g5, g6);
                                }
                                break;
                            }
                        } else {
                            throw cihx.m150360b("TYPE_PING streamId != 0", new Object[0]);
                        }
                        break;
                    case 7:
                        if (a < 8) {
                            throw cihx.m150360b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        } else if (g2 == 0) {
                            int g7 = this.f190377b.mo86312g();
                            int g8 = this.f190377b.mo86312g();
                            int i8 = a - 8;
                            cihm a10 = cihm.m150314a(g8);
                            if (a10 != null) {
                                cipx cipx = cipx.f191215b;
                                if (i8 > 0) {
                                    cipx = this.f190377b.mo86303d((long) i8);
                                }
                                cigg2.f190087a.mo86069a(1, g7, a10, cipx);
                                if (a10 == cihm.ENHANCE_YOUR_CALM) {
                                    String a11 = cipx.mo86336a();
                                    cigh.f190093a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", cigg2, a11));
                                    if ("too_many_pings".equals(a11)) {
                                        cigg2.f190090d.f190095B.run();
                                    }
                                }
                                long j4 = (long) a10.f190342s;
                                if (j4 >= ((long) ciae.f189640o.length) || j4 < 0) {
                                    ciae = null;
                                } else {
                                    ciae = ciae.f189640o[(int) j4];
                                }
                                if (ciae == null) {
                                    int i9 = ciae.INTERNAL_ERROR.f189642p.f189233s.f189211r;
                                    if (i9 > chuv.f189214a.size()) {
                                        chuv chuv5 = chuv.f189217d;
                                        StringBuilder sb8 = new StringBuilder(24);
                                        sb8.append("Unknown code ");
                                        sb8.append(i9);
                                        chuv3 = chuv5.mo85687a(sb8.toString());
                                    } else {
                                        chuv3 = (chuv) chuv.f189214a.get(i9);
                                    }
                                    StringBuilder sb9 = new StringBuilder(52);
                                    sb9.append("Unrecognized HTTP/2 error code: ");
                                    sb9.append(j4);
                                    chuv2 = chuv3.mo85687a(sb9.toString());
                                } else {
                                    chuv2 = ciae.f189642p;
                                }
                                chuv b8 = chuv2.mo85690b("Received Goaway");
                                if (cipx.mo86345e() > 0) {
                                    b8 = b8.mo85690b(cipx.mo86336a());
                                }
                                cigh cigh13 = cigg2.f190090d;
                                Logger logger12 = cigh.f190093a;
                                cigh13.mo86056a(g7, (cihm) null, b8);
                                break;
                            } else {
                                throw cihx.m150360b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(g8));
                            }
                        } else {
                            throw cihx.m150360b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case 8:
                        if (a == 4) {
                            long g9 = ((long) this.f190377b.mo86312g()) & 2147483647L;
                            if (g9 != 0) {
                                cigg2.f190087a.mo86067a(1, g2, g9);
                                if (g9 == 0) {
                                    if (g2 != 0) {
                                        cigg2.f190090d.mo86055a(g2, chuv.f189228o.mo85687a("Received 0 flow control window increment."), chxt.PROCESSED, false, cihm.PROTOCOL_ERROR, null);
                                        break;
                                    } else {
                                        cigh cigh14 = cigg2.f190090d;
                                        cihm cihm3 = cihm.PROTOCOL_ERROR;
                                        Logger logger13 = cigh.f190093a;
                                        cigh14.mo86058a(cihm3, "Received 0 flow control window increment.");
                                        break;
                                    }
                                } else {
                                    cigh cigh15 = cigg2.f190090d;
                                    Logger logger14 = cigh.f190093a;
                                    synchronized (cigh15.f190115j) {
                                        if (g2 == 0) {
                                            cigg2.f190090d.f190114i.mo86085a(null, (int) g9);
                                            break;
                                        } else {
                                            cifz cifz3 = (cifz) cigg2.f190090d.f190116k.get(Integer.valueOf(g2));
                                            if (cifz3 != null) {
                                                cigg2.f190090d.f190114i.mo86085a(cifz3, (int) g9);
                                            } else if (!cigg2.f190090d.mo86059a(g2)) {
                                                b2 = 1;
                                            }
                                            if (b2 != 0) {
                                                cigh cigh16 = cigg2.f190090d;
                                                cihm cihm4 = cihm.PROTOCOL_ERROR;
                                                StringBuilder sb10 = new StringBuilder(54);
                                                sb10.append("Received window_update for unknown stream: ");
                                                sb10.append(g2);
                                                cigh16.mo86058a(cihm4, sb10.toString());
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw cihx.m150360b("windowSizeIncrement was 0", new Object[0]);
                            }
                        } else {
                            throw cihx.m150360b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        }
                        break;
                    default:
                        this.f190377b.mo86317h((long) a);
                        break;
                }
                return true;
            }
            throw cihx.m150360b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
        } catch (IOException e6) {
            return false;
        }
    }
}
