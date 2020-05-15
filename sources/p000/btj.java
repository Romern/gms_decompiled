package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: btj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btj extends cao {
    public btj(cat cat) {
        btj.class.getSimpleName();
    }

    /* renamed from: a */
    public static final void m3586a(int i) {
        if (i != 0 && i != 256) {
            throw new bon("Correct Length 00", bop.f5264d);
        }
    }

    public final String toString() {
        return getClass().getName();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        try {
            return new bor(bok.mo3333h());
        } catch (bpf e) {
            throw new bon("Wrong Data", bop.f5272l);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d3  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        int i;
        boolean z;
        bys b;
        bqx bqx = (bqx) bxm;
        bor bor = (bor) bok;
        new Object[1][0] = bxg.EFTPOS;
        int i2 = cbd.f6383a;
        bqx.mo3443b();
        if (!bqx.f5990l || bqx.f5991m || bqx.f5375a) {
            throw new bon("Conditions of use not satisfied", bop.f5263c);
        } else if (bor.mo3328d() == 0 && bor.mo3329e() == 0) {
            bqu bqu = (bqu) ((bqv) bqx.f5984f).mo3578d();
            bym bym = null;
            bym g = bqu.mo3433f() ? bqu.mo3434g() : null;
            int b2 = (g != null ? g.mo3454b() : 0) + 2;
            if (bor.mo3335i() == 2 || bor.mo3335i() == b2) {
                m3586a(bor.mo3336j());
                byte[] f = bor.mo3331f();
                if (f == null || f[0] != -125) {
                    throw new bon("Wrong Length", bop.f5272l);
                }
                new Object[1][0] = bor.toString();
                bro bro = (bro) bqx.f5988j;
                bqu bqu2 = (bqu) ((bqv) bqx.f5984f).mo3578d();
                if (bqu2.mo3433f()) {
                    bym = bqu2.mo3434g();
                }
                new Object[1][0] = bym;
                byte[] l = bor.mo3343l();
                if (l.length != 0) {
                    new Object[1][0] = l;
                    try {
                        bpl c = bym.mo3614c(l);
                        new Object[1][0] = c;
                        ((bth) bqx.f5994p).mo3584a(c);
                        bth bth = (bth) bqx.f5994p;
                        new Object[1][0] = bth;
                        try {
                            bth.mo3482w();
                            bth.mo3481f();
                            bth.mo3483x();
                            byte[] bArr = new byte[(bor.mo3331f().length - 2)];
                            System.arraycopy(bor.mo3331f(), 2, bArr, 0, bor.mo3331f().length - 2);
                            bro.f5482a = bArr;
                        } catch (IllegalArgumentException e) {
                            throw new bon("Wrong Data", bop.f5272l, e);
                        }
                    } catch (bpf e2) {
                        throw new bon("Wrong Length", bop.f5272l);
                    }
                }
                if (bqx.f5993o == null) {
                    bqx.mo3599g();
                }
                bro bro2 = (bro) bqx.f5988j;
                bxp v = bro2.mo3607v();
                if (v == null || v.mo3454b() == 65535) {
                    throw new bon("Conditions of use not satisfied", bop.f5263c);
                }
                byte[] l2 = bor.mo3343l();
                Object[] objArr = {bqx, l2};
                bqu bqu3 = (bqu) ((bqv) bqx.f5984f).mo3578d();
                bsi bsi = (bsi) bqu3.mo3576c(byy.f6232a);
                brq c2 = bsi.mo3471c();
                bqy b3 = bsi.mo3470b();
                if (c2 == null || (b3.f5930l[1] & 8) == 0) {
                    i = bsi.mo3469a().mo3457e();
                } else {
                    try {
                        int i3 = btn.f5576a;
                        Object[] objArr2 = {bqu3, l2};
                        try {
                            brq c3 = ((bsi) bqu3.mo3574b(byy.f6232a)).mo3471c();
                            byte b4 = 1;
                            byte b5 = 1;
                            while (true) {
                                if (b4 > c3.mo3466a()) {
                                    i = 127;
                                    break;
                                } else if (b5 <= c3.mo3466a()) {
                                    bze bze = new bze(c3.mo3550a(0), b4);
                                    new Object[1][0] = bze;
                                    b = bqu3.mo3574b(bze);
                                    new Object[1][0] = b.mo3617k();
                                    byte[] k = b.mo3617k();
                                    int i4 = bot.f5284a;
                                    ArrayList arrayList = new ArrayList();
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(k);
                                    for (boz a = bot.m3421a(byteArrayInputStream); a != null; a = bot.m3421a(byteArrayInputStream)) {
                                        arrayList.add(a);
                                    }
                                    boz boz = new bpa((boz[]) arrayList.toArray(new boz[arrayList.size()])).f5306a[0];
                                    i = bow.m3422a(boz, l2);
                                    Object[] objArr3 = {new byte[]{(byte) i}, Byte.valueOf(b5), Byte.valueOf(b4), boz};
                                    if ((i & 128) != 128) {
                                        break;
                                    }
                                    b4 = (byte) (b4 + (i & Byte.MAX_VALUE));
                                    b5 = (byte) (b5 + 1);
                                } else {
                                    box box = box.LOOP_DETECTED;
                                    throw new boy();
                                }
                            }
                            new Object[1][0] = Integer.valueOf(i);
                            if (i == 127) {
                                throw new bon("Conditions Not Satisfied", bop.f5263c);
                            }
                        } catch (IOException e3) {
                            new Object[1][0] = b;
                            throw new bon(bop.f5263c, e3);
                        } catch (RuntimeException e4) {
                            if (!(e4 instanceof bon)) {
                                box box2 = box.LOOP_DETECTED;
                                throw new boy(e4);
                            }
                            throw e4;
                        }
                    } catch (boy e5) {
                        new Object[1][0] = bqu3;
                        throw new bon("Conditions Not Satisfied", bop.f5263c, e5);
                    }
                }
                bqx.f5376b = i;
                bqu3.f5373a = i;
                new Object[1][0] = Integer.valueOf(bqx.f5376b);
                bro2.f5483b = new brb();
                bro2.f5484c = new brh();
                bqk bqk = bqx.f5982d;
                if (bqk instanceof bqj) {
                    bqj bqj = (bqj) bqk;
                    if (!(bqj.f5366b == 1 || bqj.f5367c == 1 || ((bth) bqx.f5994p).mo3481f() == null)) {
                        bqu bqu4 = (bqu) ((bqv) bqx.f5984f).mo3578d();
                        bsi bsi2 = (bsi) bqu4.mo3576c(byy.f6232a);
                        if (bsi2.mo3583b(brf.f5427a) && (bqu4.mo3428d(bqx).mo3550a(0) & 2) == 2) {
                            z = Long.parseLong(cbm.m3893a(((bth) bqx.f5994p).mo3481f().mo3563i())) < Long.parseLong(cbm.m3893a(new brf(bsi2.mo3582a(brf.f5427a)).mo3563i()));
                            new Object[1][0] = Boolean.valueOf(z);
                            if (!z) {
                                brh brh = bro2.f5484c;
                                brh.mo3446a(true);
                                brh.mo3445a(brg.NOT_AVAILABLE);
                            } else {
                                brh brh2 = bro2.f5484c;
                                brh2.mo3446a(false);
                                brh2.mo3445a(brg.NOT_AVAILABLE);
                            }
                            bro bro3 = (bro) bqx.f5988j;
                            bqu bqu5 = (bqu) ((bqv) bqx.f5984f).mo3578d();
                            brd a2 = bqu5.mo3432f(bqx);
                            bro3.mo3585a(a2);
                            brc j = bqu5.mo3437j();
                            bro3.mo3585a(j);
                            bol bol = new bol(new byq(a2, j).mo3564j().mo3358e(), bop.f5269i);
                            bqx.f5991m = true;
                            return bol;
                        }
                    }
                }
                z = false;
                new Object[1][0] = Boolean.valueOf(z);
                if (!z) {
                }
                bro bro32 = (bro) bqx.f5988j;
                bqu bqu52 = (bqu) ((bqv) bqx.f5984f).mo3578d();
                brd a22 = bqu52.mo3432f(bqx);
                bro32.mo3585a(a22);
                brc j2 = bqu52.mo3437j();
                bro32.mo3585a(j2);
                bol bol2 = new bol(new byq(a22, j2).mo3564j().mo3358e(), bop.f5269i);
                bqx.f5991m = true;
                return bol2;
            }
            throw new bon("Wrong Length", bop.f5273m);
        } else {
            throw new bon("incorrect P1/P2", bop.f5267g);
        }
    }
}
