package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: cawn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawn implements cavn {

    /* renamed from: a */
    final cawi f176266a = new cawi(this.f176268c);

    /* renamed from: b */
    private final cipw f176267b;

    /* renamed from: c */
    private final cawl f176268c = new cawl(this.f176267b);

    /* renamed from: d */
    private final boolean f176269d;

    public cawn(cipw cipw, boolean z) {
        this.f176267b = cipw;
        this.f176269d = z;
    }

    /* renamed from: a */
    private final List m127408a(int i, short s, byte b, int i2) {
        cawl cawl = this.f176268c;
        cawl.f176260d = i;
        cawl.f176257a = i;
        cawl.f176261e = s;
        cawl.f176258b = b;
        cawl.f176259c = i2;
        cawi cawi = this.f176266a;
        while (!cawi.f176247b.mo86295b()) {
            byte e = cawi.f176247b.mo86305e() & 255;
            if (e == 128) {
                throw new IOException("index == 0");
            } else if ((e & 128) == 128) {
                int a = cawi.mo75017a(e, 127) - 1;
                if (cawi.m127393c(a)) {
                    cawi.f176246a.add(cawk.f176255a[a]);
                } else {
                    int a2 = cawi.mo75016a(a - cawk.f176255a.length);
                    if (a2 >= 0) {
                        cawh[] cawhArr = cawi.f176250e;
                        if (a2 <= cawhArr.length - 1) {
                            cawi.f176246a.add(cawhArr[a2]);
                        }
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Header index too large ");
                    sb.append(a + 1);
                    throw new IOException(sb.toString());
                }
            } else if (e == 64) {
                cipx b2 = cawi.mo75020b();
                cawk.m127404a(b2);
                cawi.mo75019a(new cawh(b2, cawi.mo75020b()));
            } else if ((e & 64) == 64) {
                cawi.mo75019a(new cawh(cawi.mo75021b(cawi.mo75017a(e, 63) - 1), cawi.mo75020b()));
            } else if ((e & 32) == 32) {
                int a3 = cawi.mo75017a(e, 31);
                cawi.f176249d = a3;
                if (a3 < 0 || a3 > cawi.f176248c) {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Invalid dynamic table size update ");
                    sb2.append(a3);
                    throw new IOException(sb2.toString());
                }
                cawi.mo75018a();
            } else if (e == 16 || e == 0) {
                cipx b3 = cawi.mo75020b();
                cawk.m127404a(b3);
                cawi.f176246a.add(new cawh(b3, cawi.mo75020b()));
            } else {
                cawi.f176246a.add(new cawh(cawi.mo75021b(cawi.mo75017a(e, 15) - 1), cawi.mo75020b()));
            }
        }
        cawi cawi2 = this.f176266a;
        ArrayList arrayList = new ArrayList(cawi2.f176246a);
        cawi2.f176246a.clear();
        return arrayList;
    }

    /* renamed from: b */
    private final void m127409b() {
        this.f176267b.mo86312g();
        this.f176267b.mo86305e();
    }

    public final void close() {
        this.f176267b.close();
    }

    /* renamed from: a */
    public final void mo74971a() {
        if (!this.f176269d) {
            cipx d = this.f176267b.mo86303d((long) cawp.f176277b.mo86345e());
            if (cawp.f176276a.isLoggable(Level.FINE)) {
                cawp.f176276a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Reader", "readConnectionPreface", String.format("<< CONNECTION %s", d.mo86342c()));
            }
            if (!cawp.f176277b.equals(d)) {
                throw cawp.m127427b("Expected a connection header but was %s", d.mo86336a());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cavm.a(boolean, cawx):void
     arg types: [int, cawx]
     candidates:
      cavm.a(int, long):void
      cavm.a(int, cavl):void
      cavm.a(int, cipx):void
      cavm.a(boolean, cawx):void */
    /* renamed from: a */
    public final boolean mo74972a(cavm cavm) {
        byte b;
        byte b2;
        boolean z;
        byte b3;
        boolean z2 = false;
        try {
            this.f176267b.mo86285a(9);
            int a = cawp.m127425a(this.f176267b);
            if (a <= 16384) {
                byte e = (byte) (this.f176267b.mo86305e() & 255);
                byte e2 = (byte) (this.f176267b.mo86305e() & 255);
                int g = this.f176267b.mo86312g() & Integer.MAX_VALUE;
                if (cawp.f176276a.isLoggable(Level.FINE)) {
                    cawp.f176276a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Reader", "nextFrame", cawm.m127407a(true, g, a, e, e2));
                }
                switch (e) {
                    case 0:
                        byte b4 = e2 & 1;
                        if ((e2 & 32) == 0) {
                            if ((e2 & 8) != 0) {
                                b = this.f176267b.mo86305e() & 255;
                            } else {
                                b = 0;
                            }
                            int a2 = cawp.m127424a(a, e2, (short) b);
                            cipw cipw = this.f176267b;
                            if (b4 != 0) {
                                z2 = true;
                            }
                            cavm.mo74968a(z2, g, cipw, a2);
                            this.f176267b.mo86317h((long) b);
                            break;
                        } else {
                            throw cawp.m127427b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                    case 1:
                        if (g != 0) {
                            byte b5 = e2 & 1;
                            if ((e2 & 8) != 0) {
                                b2 = this.f176267b.mo86305e() & 255;
                            } else {
                                b2 = 0;
                            }
                            if ((e2 & 32) != 0) {
                                m127409b();
                                a -= 5;
                            }
                            short s = (short) b2;
                            List a3 = m127408a(cawp.m127424a(a, e2, s), s, e2, g);
                            if (b5 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            cavm.mo74970a(false, z, g, a3, 4);
                            break;
                        } else {
                            throw cawp.m127427b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                    case 2:
                        if (a != 5) {
                            throw cawp.m127427b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        } else if (g != 0) {
                            m127409b();
                            break;
                        } else {
                            throw cawp.m127427b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case 3:
                        if (a != 4) {
                            throw cawp.m127427b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        } else if (g != 0) {
                            int g2 = this.f176267b.mo86312g();
                            cavl a4 = cavl.m127321a(g2);
                            if (a4 != null) {
                                cavm.mo74965a(g, a4);
                                break;
                            } else {
                                throw cawp.m127427b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(g2));
                            }
                        } else {
                            throw cawp.m127427b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case 4:
                        if (g != 0) {
                            throw cawp.m127427b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((e2 & 1) == 0) {
                            if (a % 6 == 0) {
                                cawx cawx = new cawx();
                                for (int i = 0; i < a; i += 6) {
                                    short f = this.f176267b.mo86310f();
                                    int g3 = this.f176267b.mo86312g();
                                    switch (f) {
                                        case 1:
                                        case 6:
                                            break;
                                        case 2:
                                            if (!(g3 == 0 || g3 == 1)) {
                                                throw cawp.m127427b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            }
                                        case 3:
                                            f = 4;
                                            break;
                                        case 4:
                                            if (g3 >= 0) {
                                                f = 7;
                                                break;
                                            } else {
                                                throw cawp.m127427b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            }
                                        case 5:
                                            if (g3 < 16384 || g3 > 16777215) {
                                                throw cawp.m127427b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(g3));
                                            }
                                        default:
                                    }
                                    cawx.mo75032a(f, 0, g3);
                                }
                                cavm.mo74969a(false, cawx);
                                if (cawx.mo75034b() >= 0) {
                                    cawi cawi = this.f176266a;
                                    int b6 = cawx.mo75034b();
                                    cawi.f176248c = b6;
                                    cawi.f176249d = b6;
                                    cawi.mo75018a();
                                    break;
                                }
                            } else {
                                throw cawp.m127427b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                            }
                        } else if (a != 0) {
                            throw cawp.m127427b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        }
                        break;
                    case 5:
                        if (g != 0) {
                            if ((e2 & 8) != 0) {
                                b3 = this.f176267b.mo86305e() & 255;
                            } else {
                                b3 = 0;
                            }
                            int g4 = this.f176267b.mo86312g() & Integer.MAX_VALUE;
                            short s2 = (short) b3;
                            m127408a(cawp.m127424a(a - 4, e2, s2), s2, e2, g);
                            cawc cawc = ((cawb) cavm).f176194c;
                            synchronized (cawc) {
                                Set set = cawc.f176213s;
                                Integer valueOf = Integer.valueOf(g4);
                                if (!set.contains(valueOf)) {
                                    cawc.f176213s.add(valueOf);
                                    cawc.f176203i.execute(new cavs(cawc, "OkHttp %s Push Request[%s]", new Object[]{cawc.f176199e, valueOf}, g4));
                                    break;
                                } else {
                                    cawc.mo74987a(g4, cavl.PROTOCOL_ERROR);
                                    break;
                                }
                            }
                        } else {
                            throw cawp.m127427b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                    case 6:
                        if (a != 8) {
                            throw cawp.m127427b("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        } else if (g == 0) {
                            int g5 = this.f176267b.mo86312g();
                            int g6 = this.f176267b.mo86312g();
                            if ((e2 & 1) != 0) {
                                z2 = true;
                            }
                            cavm.mo74967a(z2, g5, g6);
                            break;
                        } else {
                            throw cawp.m127427b("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case 7:
                        if (a < 8) {
                            throw cawp.m127427b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        } else if (g == 0) {
                            int g7 = this.f176267b.mo86312g();
                            int g8 = this.f176267b.mo86312g();
                            int i2 = a - 8;
                            if (cavl.m127321a(g8) != null) {
                                cipx cipx = cipx.f191215b;
                                if (i2 > 0) {
                                    cipx = this.f176267b.mo86303d((long) i2);
                                }
                                cavm.mo74966a(g7, cipx);
                                break;
                            } else {
                                throw cawp.m127427b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(g8));
                            }
                        } else {
                            throw cawp.m127427b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case 8:
                        if (a == 4) {
                            long g9 = ((long) this.f176267b.mo86312g()) & 2147483647L;
                            if (g9 != 0) {
                                cavm.mo74964a(g, g9);
                                break;
                            } else {
                                throw cawp.m127427b("windowSizeIncrement was 0", Long.valueOf(g9));
                            }
                        } else {
                            throw cawp.m127427b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        }
                    default:
                        this.f176267b.mo86317h((long) a);
                        break;
                }
                return true;
            }
            throw cawp.m127427b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
        } catch (IOException e3) {
            return false;
        }
    }
}
