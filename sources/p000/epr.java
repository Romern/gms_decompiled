package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Set;

/* renamed from: epr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epr {

    /* renamed from: a */
    public static final bsxn f15494a;

    /* renamed from: b */
    public static final bsul f15495b;

    /* renamed from: c */
    public static final bsul f15496c = bsul.f147142j;

    /* renamed from: a */
    public static bsxk m10919a(bsxn bsxn) {
        bxvd da = bsxk.f147578f.mo74144da();
        bswy bswy = bswy.f147512a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsxk bsxk = (bsxk) da.f164949b;
        bswy.getClass();
        bsxk.f147582c = bswy;
        bsxk.f147581b = 1000;
        bsxn.getClass();
        bsxk.f147583d = bsxn;
        bsxk.f147580a |= 1;
        return (bsxk) da.mo74062i();
    }

    /* renamed from: b */
    public static bsxn m10924b(bsul bsul) {
        bsxs bsxs = bsul.f147150g;
        if (bsxs == null) {
            bsxs = bsxs.f147606f;
        }
        if ((bsxs.f147608a & 8) == 0) {
            return null;
        }
        bsxs bsxs2 = bsul.f147150g;
        if (bsxs2 == null) {
            bsxs2 = bsxs.f147606f;
        }
        bsxn bsxn = bsxs2.f147612e;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: c */
    public static bswk m10928c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (bswk) bxvk.m124016a(bswk.f147445c, bArr, bxus.m123744c());
        } catch (bxwf e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public static bsxn m10931d(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 4096) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bsxn bsxn = bsvh2.f147262j;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: e */
    public static bsxn m10933e(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 8192) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bsxn bsxn = bsvh2.f147263k;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: f */
    public static bswk m10934f(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bswk bswk = bsvh2.f147260h;
        return bswk == null ? bswk.f147445c : bswk;
    }

    /* renamed from: g */
    public static bsxn m10935g(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 2) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bsxn bsxn = bsvh2.f147255c;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: h */
    public static bsxn m10936h(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 4) != 0) {
            bsvh bsvh2 = bsul.f147149f;
            if (bsvh2 == null) {
                bsvh2 = bsvh.f147251l;
            }
            bsxn bsxn = bsvh2.f147256d;
            return bsxn == null ? bsxn.f147586d : bsxn;
        } else if ((bsul.f147144a & 64) == 0) {
            return null;
        } else {
            bsxs bsxs = bsul.f147150g;
            if (bsxs == null) {
                bsxs = bsxs.f147606f;
            }
            if ((bsxs.f147608a & 1) == 0) {
                return null;
            }
            bsxs bsxs2 = bsul.f147150g;
            if (bsxs2 == null) {
                bsxs2 = bsxs.f147606f;
            }
            bsxn bsxn2 = bsxs2.f147609b;
            return bsxn2 == null ? bsxn.f147586d : bsxn2;
        }
    }

    /* renamed from: i */
    public static bsxn m10937i(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 8) != 0) {
            bsvh bsvh2 = bsul.f147149f;
            if (bsvh2 == null) {
                bsvh2 = bsvh.f147251l;
            }
            bsxn bsxn = bsvh2.f147257e;
            return bsxn == null ? bsxn.f147586d : bsxn;
        } else if ((bsul.f147144a & 64) == 0) {
            return null;
        } else {
            bsxs bsxs = bsul.f147150g;
            if (bsxs == null) {
                bsxs = bsxs.f147606f;
            }
            if ((bsxs.f147608a & 2) == 0) {
                return null;
            }
            bsxs bsxs2 = bsul.f147150g;
            if (bsxs2 == null) {
                bsxs2 = bsxs.f147606f;
            }
            bsxn bsxn2 = bsxs2.f147610c;
            return bsxn2 == null ? bsxn.f147586d : bsxn2;
        }
    }

    /* renamed from: j */
    public static bsxn m10938j(bsul bsul) {
        if (bsul == null || (bsul.f147144a & 32) == 0) {
            return null;
        }
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 2048) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bsxn bsxn = bsvh2.f147261i;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: k */
    public static boolean m10939k(bsul bsul) {
        return (m10929c(bsul) == null || m10936h(bsul) == null) ? false : true;
    }

    /* renamed from: l */
    public static boolean m10940l(bsul bsul) {
        return m10935g(bsul) != null;
    }

    /* renamed from: m */
    public static int m10941m(bsul bsul) {
        if ((bsul.f147144a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return m10929c(bsul) == null ? 2 : 1;
        }
        return 3;
    }

    static {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn.f147588a |= 1;
        bsxn.f147589b = 90000;
        f15494a = (bsxn) bsxl.mo74062i();
        bxvd da = bsul.f147142j.mo74144da();
        bswz bswz = bswz.f147514a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsul bsul = (bsul) da.f164949b;
        bswz.getClass();
        bsul.f147152i = bswz;
        bsul.f147144a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        f15495b = (bsul) da.mo74062i();
    }

    /* renamed from: b */
    public static bsxn m10925b(byte[] bArr) {
        if (bArr != null) {
            return m10921a(bArr);
        }
        return null;
    }

    /* renamed from: c */
    public static bsxn m10929c(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 1) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bsxn bsxn = bsvh2.f147254b;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: d */
    public static bsxn m10932d(byte[] bArr) {
        return bArr != null ? m10921a(bArr) : f15494a;
    }

    /* renamed from: b */
    public static Set m10926b(bsxk bsxk) {
        bsys bsys;
        bsys bsys2;
        bsxf bsxf;
        bsvi bsvi;
        bsvi bsvi2;
        bsvi bsvi3;
        bsxb bsxb;
        bsuz bsuz;
        bsuz bsuz2;
        bnia j = bnic.m109500j();
        bngs j2 = bngx.m109377j();
        int i = bsxk.f147581b;
        int i2 = 0;
        if (i == 3) {
            bxwc bxwc = ((bsxr) bsxk.f147582c).f147605a;
            int size = bxwc.size();
            while (i2 < size) {
                bsul bsul = (bsul) bxwc.get(i2);
                int i3 = bsul.f147144a;
                if ((i3 & 32) != 0) {
                    bsvh bsvh = bsul.f147149f;
                    if (bsvh == null) {
                        bsvh = bsvh.f147251l;
                    }
                    if ((bsvh.f147253a & 8) != 0) {
                        bsxn bsxn = bsvh.f147257e;
                        if (bsxn == null) {
                            bsxn = bsxn.f147586d;
                        }
                        j2.mo67668c(bsxn);
                    }
                    if ((bsvh.f147253a & 8192) != 0) {
                        bsxn bsxn2 = bsvh.f147263k;
                        if (bsxn2 == null) {
                            bsxn2 = bsxn.f147586d;
                        }
                        j2.mo67668c(bsxn2);
                    }
                } else if ((i3 & 64) != 0) {
                    bsxs bsxs = bsul.f147150g;
                    if (bsxs == null) {
                        bsxs = bsxs.f147606f;
                    }
                    if ((bsxs.f147608a & 2) != 0) {
                        bsxn bsxn3 = bsxs.f147610c;
                        if (bsxn3 == null) {
                            bsxn3 = bsxn.f147586d;
                        }
                        j2.mo67668c(bsxn3);
                    }
                }
                i2++;
            }
        } else if (i == 7) {
            bxwc bxwc2 = ((bsva) bsxk.f147582c).f147221a;
            int size2 = bxwc2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                bsuv bsuv = (bsuv) bxwc2.get(i4);
                int i5 = bsuv.f147199b;
                if (i5 == 2) {
                    j2.mo67668c((bsxn) bsuv.f147200c);
                } else if (i5 == 3) {
                    bxwc bxwc3 = ((bsuw) bsuv.f147200c).f147206a;
                    int size3 = bxwc3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        bsux bsux = (bsux) bxwc3.get(i6);
                        if (bsux.f147209a == 1) {
                            bsuz = (bsuz) bsux.f147210b;
                        } else {
                            bsuz = bsuz.f147213e;
                        }
                        if ((bsuz.f147215a & 1) != 0) {
                            if (bsux.f147209a == 1) {
                                bsuz2 = (bsuz) bsux.f147210b;
                            } else {
                                bsuz2 = bsuz.f147213e;
                            }
                            bsxn bsxn4 = bsuz2.f147216b;
                            if (bsxn4 == null) {
                                bsxn4 = bsxn.f147586d;
                            }
                            j2.mo67668c(bsxn4);
                        }
                    }
                }
            }
        } else if (i == 8) {
            bsvd bsvd = (bsvd) bsxk.f147582c;
            int i7 = bsvd.f147232a;
            if (i7 == 1) {
                bsye bsye = (bsye) bsvd.f147233b;
                bngs j3 = bngx.m109377j();
                if ((bsye.f147662a & 1) != 0) {
                    bsxn bsxn5 = bsye.f147663b;
                    if (bsxn5 == null) {
                        bsxn5 = bsxn.f147586d;
                    }
                    j3.mo67668c(bsxn5);
                }
                bxwc bxwc4 = bsye.f147664c;
                int size4 = bxwc4.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    bsut bsut = (bsut) bxwc4.get(i8);
                    if ((bsut.f147189a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
                        bsxn bsxn6 = bsut.f147192d;
                        if (bsxn6 == null) {
                            bsxn6 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn6);
                    }
                    int i9 = bsut.f147190b;
                    if (i9 == 1) {
                        bsvu bsvu = (bsvu) bsut.f147191c;
                        if ((bsvu.f147340a & 64) != 0) {
                            bsxn bsxn7 = bsvu.f147345f;
                            if (bsxn7 == null) {
                                bsxn7 = bsxn.f147586d;
                            }
                            j3.mo67668c(bsxn7);
                        }
                    } else {
                        if (i9 == 6) {
                            bsvi = (bsvi) bsut.f147191c;
                        } else {
                            bsvi = bsvi.f147268h;
                        }
                        if ((bsvi.f147270a & 8) == 0) {
                            int i10 = bsut.f147190b;
                            if (i10 == 9) {
                                bxwc bxwc5 = ((bsuj) bsut.f147191c).f147136a;
                                int size5 = bxwc5.size();
                                for (int i11 = 0; i11 < size5; i11++) {
                                    bsui bsui = (bsui) bxwc5.get(i11);
                                    if ((bsui.f147130a & 4) != 0) {
                                        bsxn bsxn8 = bsui.f147133d;
                                        if (bsxn8 == null) {
                                            bsxn8 = bsxn.f147586d;
                                        }
                                        j3.mo67668c(bsxn8);
                                    }
                                }
                            } else {
                                if (i10 == 10) {
                                    bsxb = (bsxb) bsut.f147191c;
                                } else {
                                    bsxb = bsxb.f147517g;
                                }
                                if ((bsxb.f147519a & 8) != 0) {
                                    bsxn bsxn9 = (bsut.f147190b == 10 ? (bsxb) bsut.f147191c : bsxb.f147517g).f147523e;
                                    if (bsxn9 == null) {
                                        bsxn9 = bsxn.f147586d;
                                    }
                                    j3.mo67668c(bsxn9);
                                }
                            }
                        } else {
                            if (bsut.f147190b == 6) {
                                bsvi2 = (bsvi) bsut.f147191c;
                            } else {
                                bsvi2 = bsvi.f147268h;
                            }
                            bsxn bsxn10 = bsvi2.f147275f;
                            if (bsxn10 == null) {
                                bsxn10 = bsxn.f147586d;
                            }
                            j3.mo67668c(bsxn10);
                            if (bsut.f147190b == 6) {
                                bsvi3 = (bsvi) bsut.f147191c;
                            } else {
                                bsvi3 = bsvi.f147268h;
                            }
                            bxwc bxwc6 = bsvi3.f147271b;
                            int size6 = bxwc6.size();
                            for (int i12 = 0; i12 < size6; i12++) {
                                bsvj bsvj = (bsvj) bxwc6.get(i12);
                                if ((bsvj.f147279a & 32) != 0) {
                                    bsxn bsxn11 = bsvj.f147287i;
                                    if (bsxn11 == null) {
                                        bsxn11 = bsxn.f147586d;
                                    }
                                    j3.mo67668c(bsxn11);
                                }
                            }
                        }
                    }
                }
                j2.mo67666b((Iterable) j3.mo67664a());
            } else if (i7 == 2) {
                if (bsvd.f147232a == 2) {
                    bsxf = (bsxf) bsvd.f147233b;
                } else {
                    bsxf = bsxf.f147542b;
                }
                bxwc bxwc7 = bsxf.f147544a;
                int size7 = bxwc7.size();
                while (i2 < size7) {
                    bsxh bsxh = (bsxh) bxwc7.get(i2);
                    if ((bsxh.f147553a & 16) != 0) {
                        bsxn bsxn12 = bsxh.f147558f;
                        if (bsxn12 == null) {
                            bsxn12 = bsxn.f147586d;
                        }
                        j2.mo67668c(bsxn12);
                    }
                    i2++;
                }
            }
        } else if (i == 5) {
            bxwc bxwc8 = ((bsyo) bsxk.f147582c).f147692a;
            int size8 = bxwc8.size();
            while (i2 < size8) {
                bsyp bsyp = (bsyp) bxwc8.get(i2);
                if ((bsyp.f147695a & 1) != 0) {
                    bsxn bsxn13 = bsyp.f147696b;
                    if (bsxn13 == null) {
                        bsxn13 = bsxn.f147586d;
                    }
                    j2.mo67668c(bsxn13);
                }
                i2++;
            }
        } else if (i == 9) {
            bxwc bxwc9 = ((bsxu) bsxk.f147582c).f147620b;
            int size9 = bxwc9.size();
            while (i2 < size9) {
                bsxv bsxv = (bsxv) bxwc9.get(i2);
                if ((bsxv.f147625a & 16) != 0) {
                    bsxn bsxn14 = bsxv.f147631g;
                    if (bsxn14 == null) {
                        bsxn14 = bsxn.f147586d;
                    }
                    j2.mo67668c(bsxn14);
                }
                i2++;
            }
        } else if (i == 4) {
            bsys bsys3 = (bsys) bsxk.f147582c;
            if ((bsys3.f147711a & 4) != 0) {
                bsxn bsxn15 = bsys3.f147713c;
                if (bsxn15 == null) {
                    bsxn15 = bsxn.f147586d;
                }
                j2.mo67668c(bsxn15);
            }
            if (bsxk.f147581b == 4) {
                bsys = (bsys) bsxk.f147582c;
            } else {
                bsys = bsys.f147709h;
            }
            bsui bsui2 = bsys.f147715e;
            if (bsui2 == null) {
                bsui2 = bsui.f147128e;
            }
            if ((bsui2.f147130a & 4) != 0) {
                if (bsxk.f147581b == 4) {
                    bsys2 = (bsys) bsxk.f147582c;
                } else {
                    bsys2 = bsys.f147709h;
                }
                bsui bsui3 = bsys2.f147715e;
                if (bsui3 == null) {
                    bsui3 = bsui.f147128e;
                }
                bsxn bsxn16 = bsui3.f147133d;
                if (bsxn16 == null) {
                    bsxn16 = bsxn.f147586d;
                }
                j2.mo67668c(bsxn16);
            }
        } else if (i == 13) {
            bxwc bxwc10 = ((bswx) bsxk.f147582c).f147511a;
            int size10 = bxwc10.size();
            while (i2 < size10) {
                bsww bsww = (bsww) bxwc10.get(i2);
                if ((bsww.f147506a & 2) != 0) {
                    bsxn bsxn17 = bsww.f147508c;
                    if (bsxn17 == null) {
                        bsxn17 = bsxn.f147586d;
                    }
                    j2.mo67668c(bsxn17);
                }
                i2++;
            }
        }
        j.mo67752b((Iterable) j2.mo67664a());
        return j.mo67751a();
    }

    /* renamed from: c */
    public static byte[] m10930c(bsxn bsxn) {
        if (bsxn != null) {
            return bsxn.mo73642k();
        }
        return null;
    }

    /* renamed from: a */
    public static bsxn m10920a(bsul bsul) {
        bsvh bsvh = bsul.f147149f;
        if (bsvh == null) {
            bsvh = bsvh.f147251l;
        }
        if ((bsvh.f147253a & 32) == 0) {
            return null;
        }
        bsvh bsvh2 = bsul.f147149f;
        if (bsvh2 == null) {
            bsvh2 = bsvh.f147251l;
        }
        bsxn bsxn = bsvh2.f147258f;
        return bsxn == null ? bsxn.f147586d : bsxn;
    }

    /* renamed from: a */
    public static bsxn m10921a(byte[] bArr) {
        try {
            return (bsxn) bxvk.m124016a(bsxn.f147586d, bArr, bxus.m123744c());
        } catch (bxwf e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static Set m10922a(bsxk bsxk) {
        bnia j = bnic.m109500j();
        bngs j2 = bngx.m109377j();
        int i = bsxk.f147581b;
        if (i == 3) {
            bxwc bxwc = ((bsxr) bsxk.f147582c).f147605a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                bsul bsul = (bsul) bxwc.get(i2);
                bngs j3 = bngx.m109377j();
                int i3 = bsul.f147144a;
                if ((i3 & 32) != 0) {
                    bsvh bsvh = bsul.f147149f;
                    if (bsvh == null) {
                        bsvh = bsvh.f147251l;
                    }
                    if ((bsvh.f147253a & 2) != 0) {
                        bsxn bsxn = bsvh.f147255c;
                        if (bsxn == null) {
                            bsxn = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn);
                    }
                    if ((bsvh.f147253a & 1) != 0) {
                        bsxn bsxn2 = bsvh.f147254b;
                        if (bsxn2 == null) {
                            bsxn2 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn2);
                    }
                    if ((bsvh.f147253a & 32) != 0) {
                        bsxn bsxn3 = bsvh.f147258f;
                        if (bsxn3 == null) {
                            bsxn3 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn3);
                    }
                    if ((bsvh.f147253a & 4) != 0) {
                        bsxn bsxn4 = bsvh.f147256d;
                        if (bsxn4 == null) {
                            bsxn4 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn4);
                    }
                    if ((bsvh.f147253a & 2048) != 0) {
                        bsxn bsxn5 = bsvh.f147261i;
                        if (bsxn5 == null) {
                            bsxn5 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn5);
                    }
                    if ((bsvh.f147253a & 4096) != 0) {
                        bsxn bsxn6 = bsvh.f147262j;
                        if (bsxn6 == null) {
                            bsxn6 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn6);
                    }
                } else if ((i3 & 64) != 0) {
                    bsxs bsxs = bsul.f147150g;
                    if (bsxs == null) {
                        bsxs = bsxs.f147606f;
                    }
                    if ((bsxs.f147608a & 8) != 0) {
                        bsxn bsxn7 = bsxs.f147612e;
                        if (bsxn7 == null) {
                            bsxn7 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn7);
                    }
                    if ((bsxs.f147608a & 1) != 0) {
                        bsxn bsxn8 = bsxs.f147609b;
                        if (bsxn8 == null) {
                            bsxn8 = bsxn.f147586d;
                        }
                        j3.mo67668c(bsxn8);
                    }
                }
                j2.mo67666b((Iterable) j3.mo67664a());
            }
        } else if (i == 6) {
            j2.mo67666b((Iterable) ((bsvg) bsxk.f147582c).f147250a);
        }
        j.mo67752b((Iterable) j2.mo67664a());
        return j.mo67751a();
    }

    /* renamed from: a */
    public static byte[] m10923a(bswk bswk) {
        if (bswk != null) {
            return bswk.mo73642k();
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m10927b(bsxn bsxn) {
        return bsxn.mo73642k();
    }
}
