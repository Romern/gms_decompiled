package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;

/* renamed from: cawy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawy implements cavn {

    /* renamed from: a */
    private final cipw f176294a;

    /* renamed from: b */
    private final boolean f176295b;

    /* renamed from: c */
    private final cawu f176296c = new cawu(this.f176294a);

    public cawy(cipw cipw, boolean z) {
        this.f176294a = cipw;
        this.f176295b = z;
    }

    /* renamed from: a */
    private static IOException m127440a(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: a */
    public final void mo74971a() {
    }

    public final void close() {
        this.f176296c.f176287b.close();
    }

    /* renamed from: a */
    public final boolean mo74972a(cavm cavm) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        try {
            int g = this.f176294a.mo86312g();
            int g2 = this.f176294a.mo86312g();
            int i = g2 >>> 24;
            int i2 = g2 & 16777215;
            if ((Integer.MIN_VALUE & g) != 0) {
                int i3 = (g >>> 16) & 32767;
                char c = (char) g;
                if (i3 == 3) {
                    cavl cavl = null;
                    switch (c) {
                        case 1:
                            int g3 = this.f176294a.mo86312g() & Integer.MAX_VALUE;
                            this.f176294a.mo86312g();
                            this.f176294a.mo86310f();
                            List a = this.f176296c.mo75030a(i2 - 10);
                            int i4 = i & 1;
                            if ((i & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i4 == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            cavm.mo74970a(z, z2, g3, a, 1);
                            return true;
                        case 2:
                            int g4 = this.f176294a.mo86312g() & Integer.MAX_VALUE;
                            List a2 = this.f176296c.mo75030a(i2 - 4);
                            if ((i & 1) == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            cavm.mo74970a(false, z3, g4, a2, 2);
                            return true;
                        case 3:
                            if (i2 == 8) {
                                int g5 = this.f176294a.mo86312g() & Integer.MAX_VALUE;
                                int g6 = this.f176294a.mo86312g();
                                cavl[] values = cavl.values();
                                int length = values.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        cavl cavl2 = values[i5];
                                        if (cavl2.f176160t != g6) {
                                            i5++;
                                        } else {
                                            cavl = cavl2;
                                        }
                                    }
                                }
                                if (cavl != null) {
                                    cavm.mo74965a(g5, cavl);
                                    return true;
                                }
                                throw m127440a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(g6));
                            }
                            throw m127440a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
                        case 4:
                            int g7 = this.f176294a.mo86312g();
                            if (i2 == (g7 * 8) + 4) {
                                cawx cawx = new cawx();
                                for (int i6 = 0; i6 < g7; i6++) {
                                    int g8 = this.f176294a.mo86312g();
                                    cawx.mo75032a(g8 & 16777215, g8 >>> 24, this.f176294a.mo86312g());
                                }
                                if ((i & 1) != 0) {
                                    z5 = true;
                                }
                                cavm.mo74969a(z5, cawx);
                                return true;
                            }
                            throw m127440a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(g7));
                        case 5:
                        default:
                            this.f176294a.mo86317h((long) i2);
                            return true;
                        case 6:
                            if (i2 == 4) {
                                int g9 = this.f176294a.mo86312g();
                                if (this.f176295b == (g9 & true)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                cavm.mo74967a(z4, g9, 0);
                                return true;
                            }
                            throw m127440a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
                        case 7:
                            if (i2 == 8) {
                                int g10 = this.f176294a.mo86312g() & Integer.MAX_VALUE;
                                int g11 = this.f176294a.mo86312g();
                                cavl[] values2 = cavl.values();
                                int length2 = values2.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < length2) {
                                        cavl cavl3 = values2[i7];
                                        if (cavl3.f176161u != g11) {
                                            i7++;
                                        } else {
                                            cavl = cavl3;
                                        }
                                    }
                                }
                                if (cavl != null) {
                                    cavm.mo74966a(g10, cipx.f191215b);
                                    return true;
                                }
                                throw m127440a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(g11));
                            }
                            throw m127440a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
                        case 8:
                            cavm.mo74970a(false, false, this.f176294a.mo86312g() & Integer.MAX_VALUE, this.f176296c.mo75030a(i2 - 4), 3);
                            return true;
                        case 9:
                            if (i2 == 8) {
                                int g12 = this.f176294a.mo86312g() & Integer.MAX_VALUE;
                                long g13 = (long) (this.f176294a.mo86312g() & Integer.MAX_VALUE);
                                if (g13 != 0) {
                                    cavm.mo74964a(g12, g13);
                                    return true;
                                }
                                throw m127440a("windowSizeIncrement was 0", Long.valueOf(g13));
                            }
                            throw m127440a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
                    }
                } else {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("version != 3: ");
                    sb.append(i3);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                int i8 = g & Integer.MAX_VALUE;
                cipw cipw = this.f176294a;
                if ((i & 1) != 0) {
                    z5 = true;
                }
                cavm.mo74968a(z5, i8, cipw, i2);
                return true;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
