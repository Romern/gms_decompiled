package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bgdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdy implements bujf {

    /* renamed from: a */
    public final bgdw f116200a;

    /* renamed from: b */
    public final bgmk f116201b;

    /* renamed from: c */
    public final bfmi f116202c = new bfmi();

    /* renamed from: d */
    public final bfcu f116203d;

    /* renamed from: e */
    public final bfkx f116204e;

    /* renamed from: f */
    public final bgea f116205f;

    public bgdy(bfcu bfcu, bgmk bgmk, bgea bgea, bgdw bgdw) {
        this.f116203d = bfcu;
        this.f116201b = bgmk;
        this.f116205f = bgea;
        this.f116200a = bgdw;
        this.f116204e = new bfkx(getClass().getSimpleName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: bfmv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: bfns} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: bfml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: bfml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: bfml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: bfmv} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bubh.a(long, boolean):byte[]
     arg types: [long, int]
     candidates:
      bubh.a(java.lang.Object, boolean):java.lang.Object
      buan.a(java.lang.Object, boolean):java.lang.Object
      bubh.a(long, boolean):byte[] */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06ff, code lost:
        if (r1.f114449c.f114482d > r0.f114449c.f114482d) goto L_0x0701;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x01c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x040d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b5 A[LOOP:0: B:48:0x013c->B:65:0x01b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f0  */
    /* renamed from: a */
    public final bfnb mo62696a(bfoa bfoa, bfmq bfmq, bfmu bfmu, bfni bfni, boolean z) {
        List list;
        bfmn bfmn;
        bfml bfml;
        bfni bfni2;
        bfoa bfoa2;
        bfmy bfmy;
        bfmy bfmy2;
        bfml bfml2;
        boolean z2;
        bfni bfni3;
        long j;
        List list2;
        bgdw bgdw;
        int i;
        int i2;
        int i3;
        bfml bfml3;
        bfni bfni4;
        bgdw bgdw2;
        long j2;
        List list3;
        long j3;
        bsax bsax;
        String str;
        int j4;
        int i4;
        int i5;
        String str2;
        bfni bfni5;
        String str3;
        bgdw bgdw3;
        byte b;
        double[] a;
        int i6;
        bsax bsax2;
        byte b2;
        int i7;
        int i8;
        bfmq bfmq2 = bfmq;
        this.f116204e.mo61864a();
        bgdw bgdw4 = this.f116200a;
        long b3 = bgdw4.f116185a.mo62775b();
        if (bfmq2 != null) {
            bfmn bfmn2 = bfmq2.f114425a;
            list = bfmq2.f114426b;
            bfmn = bfmn2;
        } else {
            bfmn = null;
            list = null;
        }
        if (bfmn != null) {
            if (bfmn.mo61950e()) {
                bmxy.m108581a(bfmq);
                if (bgdw4.mo62693a()) {
                    bmxy.m108581a(bgdw4.f116186b);
                    bube bube = bgdw4.f116186b;
                    bube.f153221c++;
                    if (bfmn != null) {
                        int i9 = bfmn.f114419i;
                        if (i9 != 3) {
                            if (i9 == 4) {
                                if ((cetv.f183429a.mo6606a().cellFingerprintHoldbackConfig() & 1) == 0 && (cetv.f183429a.mo6606a().cellFingerprintHoldback() & 1) != 0) {
                                    bgdw2 = bgdw4;
                                    j2 = b3;
                                    list3 = list;
                                    bfml3 = null;
                                    if (!(bfml3 == null || bfml3.f114450d != bfmy.OK || (bfni4 = bfml3.f114449c) == null)) {
                                        bfml = bfml.m97249a(bfml3.f114405a, bfni4, bfmn.f114417g, bfmn);
                                        if (bfni == null || bfml.f114450d != bfmy.OK || (bfni3 = bfml.f114449c) == null) {
                                            bfni2 = bfni;
                                        } else {
                                            bfni2 = new bfni(bfni3.f114480b, bfni3.f114481c, 50000000);
                                            String valueOf = String.valueOf(bfni2);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                                            sb.append("Generating cell-based outlier rejection aperture: ");
                                            sb.append(valueOf);
                                            sb.toString();
                                        }
                                        bfoa2 = bfoa;
                                        if (bfoa2 != null) {
                                            long d = bfoa.mo62009d();
                                            boolean f = bfoa.mo62013f();
                                            StringBuilder sb2 = new StringBuilder(57);
                                            sb2.append("WiFi scan ");
                                            sb2.append(d);
                                            sb2.append(" has RTT information: ");
                                            sb2.append(f);
                                            sb2.toString();
                                        }
                                        bfns a2 = mo62697a(bfoa2, bfni2);
                                        bfmy = a2.f114450d;
                                        bfmy2 = bfmy.OK;
                                        bfmy bfmy3 = bfml.f114450d;
                                        bfmy bfmy4 = bfmy.OK;
                                        if (bfmy != bfmy2 || bfmy3 == bfmy4) {
                                            if (bfmy == bfmy2) {
                                                if (bfmy3 == bfmy4) {
                                                    bmxy.m108581a(a2.f114449c);
                                                    bmxy.m108581a(bfml.f114449c);
                                                }
                                                bfml2 = a2;
                                            }
                                            bfml2 = bfml;
                                        } else {
                                            bfml2 = null;
                                        }
                                        if (!z) {
                                            z2 = false;
                                        } else {
                                            z2 = bfml2 == bfml;
                                        }
                                        return new bfnb(bfml2, a2, bfml, z2);
                                    }
                                }
                            }
                        }
                        bubj bubj = bube.f153219a;
                        int i10 = bfmn.f114419i;
                        long j5 = -1;
                        if (i10 == 3) {
                            try {
                                j5 = bunh.m120054a(bfmn.f114413c, bfmn.f114414d, bfmn.f114412b);
                            } catch (IllegalArgumentException e) {
                                j3 = -1;
                            }
                        } else if (i10 == 4) {
                            j5 = bune.m120036a(bfmn.f114413c, bfmn.f114414d, bfmn.f114412b);
                        }
                        j3 = j5;
                        if (j3 >= 0) {
                            bubi bubi = (bubi) bubj;
                            bubl bubl = bubi.f153226a;
                            if (bubl.f153248c != null && j3 == bubl.f153249d) {
                                StringBuilder sb3 = new StringBuilder(43);
                                sb3.append("Fast return Cell Map : ");
                                sb3.append(j3);
                                sb3.toString();
                                j = b3;
                                list2 = list;
                                bsax = bubl.f153248c;
                                bgdw = bgdw4;
                            } else {
                                byte[] a3 = bubl.f153247b.mo72616a(j3, true);
                                if (a3 != null) {
                                    bubo bubo = bubl.f153252g;
                                    bsax = new bsax(bgox.f117143x);
                                    int length = a3.length;
                                    if (length < 6 || (a = bubo.m119298a((b = ((a3[0] & 255) << 16) | ((a3[1] & 255) << 8) | (a3[2] & 255)), a3, 3)) == null) {
                                        bgdw3 = bgdw4;
                                        j = b3;
                                        list2 = list;
                                    } else {
                                        list2 = list;
                                        if (a.length == 3) {
                                            bsax.mo70134g(2, (int) (a[0] * 1.0E7d));
                                            bgdw bgdw5 = bgdw4;
                                            bsax.mo70134g(3, (int) (a[1] * 1.0E7d));
                                            j = b3;
                                            bsax.mo70116b(4, (float) a[2]);
                                            if (length != 6) {
                                                int i11 = length - 6;
                                                byte[] bArr = new byte[i11];
                                                System.arraycopy(a3, 6, bArr, 0, i11);
                                                bubn bubn = new bubn(bArr);
                                                bubn.f153253a = 0;
                                                while (true) {
                                                    int i12 = bubn.f153253a;
                                                    if (i12 >= bubn.f153254b.length - 1) {
                                                        break;
                                                    }
                                                    if (i11 >= bubn.mo72618a() + i12) {
                                                        bsax2 = new bsax(bgox.f117142w);
                                                        int a4 = bubo.m119297a(bArr, i12);
                                                        int i13 = i12 + 1;
                                                        byte b4 = bArr[i13];
                                                        int i14 = i13 + 1;
                                                        int i15 = 0;
                                                        while (i15 < a4) {
                                                            int a5 = bubo.m119297a(bArr, i14);
                                                            if ((b4 & (128 >> i15)) > 0) {
                                                                i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                            } else {
                                                                i8 = 0;
                                                            }
                                                            bsax2.mo70105a(2, i8 + a5);
                                                            i14++;
                                                            i15++;
                                                            a4 = a4;
                                                            i11 = i11;
                                                        }
                                                        i6 = i11;
                                                        double[] a6 = bubo.m119298a(b, bArr, i14);
                                                        if (a6 != null) {
                                                            bsax2.mo70105a(3, (int) (a6[0] * 1.0E7d));
                                                            bsax2.mo70105a(4, (int) (a6[1] * 1.0E7d));
                                                            b2 = b;
                                                            bgdw = bgdw5;
                                                            i7 = 5;
                                                            bsax2.mo70104a(5, (float) a6[2]);
                                                            if (bsax2 != null) {
                                                                bsax = null;
                                                                break;
                                                            }
                                                            bsax.mo70107a(i7, bsax2);
                                                            bubn.f153253a += bubn.mo72618a();
                                                            b = b2;
                                                            bgdw5 = bgdw;
                                                            i11 = i6;
                                                        }
                                                    } else {
                                                        i6 = i11;
                                                    }
                                                    b2 = b;
                                                    bgdw = bgdw5;
                                                    i7 = 5;
                                                    bsax2 = null;
                                                    if (bsax2 != null) {
                                                    }
                                                }
                                                if (bsax == null) {
                                                    StringBuilder sb4 = new StringBuilder(34);
                                                    sb4.append("Decode ");
                                                    sb4.append(j3);
                                                    sb4.append(" Failed");
                                                    sb4.toString();
                                                    bsax = null;
                                                } else {
                                                    bubl.f153248c = bsax;
                                                    bubl.f153249d = j3;
                                                    StringBuilder sb5 = new StringBuilder(37);
                                                    sb5.append("Found Cell Map : ");
                                                    sb5.append(j3);
                                                    sb5.toString();
                                                }
                                            }
                                            bgdw = bgdw5;
                                            if (bsax == null) {
                                            }
                                        } else {
                                            bgdw3 = bgdw4;
                                            j = b3;
                                        }
                                    }
                                    bsax = null;
                                    if (bsax == null) {
                                    }
                                } else {
                                    bgdw = bgdw4;
                                    j = b3;
                                    list2 = list;
                                    StringBuilder sb6 = new StringBuilder(56);
                                    sb6.append("Can NOT found key: ");
                                    sb6.append(j3);
                                    sb6.append(" in Cache Manager");
                                    sb6.toString();
                                    bsax = null;
                                }
                            }
                            if (bsax == null) {
                                StringBuilder sb7 = new StringBuilder(44);
                                sb7.append("Cell Map was not found: ");
                                sb7.append(j3);
                                sb7.toString();
                                String a7 = bfmn.mo61934a();
                                int i16 = bfmn.f114419i;
                                if (i16 == 3) {
                                    String[] split = a7.split(":");
                                    if (split.length == 5 && bubm.m119295a(split[0]) == 3) {
                                        str3 = split[0] + ":" + split[1] + ":" + split[2] + ":" + ((int) ((char) (Integer.parseInt(split[4]) >> 16))) + ":" + ((int) ((char) Integer.parseInt(split[4])));
                                    } else {
                                        str3 = null;
                                    }
                                } else {
                                    if (i16 == 4) {
                                        String[] split2 = a7.split(":");
                                        if (split2.length == 4 && bubm.m119295a(split2[0]) == 4) {
                                            str3 = split2[0] + ":" + split2[1] + ":" + split2[2] + ":" + split2[3];
                                        }
                                    }
                                    str3 = null;
                                }
                                if (str3 != null) {
                                    bubi.f153226a.f153251f = str3;
                                    if (str3.length() == 0) {
                                        new String("Set missing Cell ID Key: ");
                                    } else {
                                        "Set missing Cell ID Key: ".concat(str3);
                                    }
                                }
                                long b5 = bubi.f153228c.mo62775b();
                                long j6 = bubi.f153232g;
                                long j7 = bubi.f153230e;
                                if (b5 - j6 > 86400000) {
                                    long j8 = bubi.f153231f;
                                    long j9 = -604800000 + b5;
                                    buml a8 = bubi.f153226a.f153247b.values().iterator();
                                    while (a8.hasNext()) {
                                        a8.mo72556f();
                                        if (a8.f154246a.f154250a[a8.f153152b.mo72577d()] < j9) {
                                            a8.remove();
                                        }
                                    }
                                    bubi.f153232g = b5;
                                }
                            }
                        } else {
                            bgdw = bgdw4;
                            j = b3;
                            list2 = list;
                            bsax = null;
                        }
                        if (bsax != null) {
                            ((bubi) bube.f153219a).f153229d.f153209e += bfmn.f114418h.size();
                            bubd bubd = bube.f153220b;
                            bmxy.m108581a(bfmn);
                            bmxy.m108581a(bsax);
                            ArrayList arrayList = new ArrayList();
                            if (bfmn instanceof bfmv) {
                                for (bfmn bfmn3 : ((bfmv) bfmn).f114418h) {
                                    if (bfmn3 instanceof bfmv) {
                                        arrayList.add(Integer.valueOf(((bfmv) bfmn3).f114431l));
                                    }
                                }
                            } else if (bfmn instanceof bfna) {
                                for (bfmn bfmn4 : ((bfna) bfmn).f114418h) {
                                    if (bfmn4 instanceof bfna) {
                                        arrayList.add(Integer.valueOf(((bfna) bfmn4).f114453l));
                                    }
                                }
                            } else {
                                str = null;
                                j4 = bsax.mo70138j(5);
                                bmxy.m108581a(bsax);
                                int b6 = bsax.mo70114b(2);
                                int b7 = bsax.mo70114b(3);
                                double d2 = (double) bsax.mo70126d(4);
                                Double.isNaN(d2);
                                bfni bfni6 = new bfni(b6, b7, Math.max(100000, (int) (d2 * 1000000.0d)));
                                i4 = 0;
                                while (true) {
                                    if (i4 < j4) {
                                        bubd.f153217b++;
                                        ((bubi) bubd.f153216a).f153229d.f153206b++;
                                        i5 = 1;
                                        break;
                                    }
                                    bsax f2 = bsax.mo70131f(5, i4);
                                    bmxy.m108581a(str);
                                    bmxy.m108581a(f2);
                                    if (f2 != null) {
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("#");
                                        int i17 = 2;
                                        int j10 = f2.mo70138j(2);
                                        int i18 = 0;
                                        while (i18 < j10) {
                                            sb8.append("#");
                                            sb8.append(f2.mo70123c(i17, i18));
                                            i18++;
                                            i17 = 2;
                                        }
                                        str2 = sb8.toString();
                                    } else {
                                        str2 = null;
                                    }
                                    if (str.equals(str2)) {
                                        int b8 = f2.mo70114b(3);
                                        int b9 = f2.mo70114b(4);
                                        double d3 = (double) f2.mo70126d(5);
                                        Double.isNaN(d3);
                                        bfni5 = new bfni(b8, b9, Math.max(100000, (int) (d3 * 1000000.0d)));
                                    } else {
                                        bfni5 = null;
                                    }
                                    if (bfni5 != null) {
                                        String valueOf2 = String.valueOf(str);
                                        if (valueOf2.length() == 0) {
                                            new String("Got Location With Cell Neighbors: ");
                                        } else {
                                            "Got Location With Cell Neighbors: ".concat(valueOf2);
                                        }
                                        bubd.f153218c++;
                                        i5 = 1;
                                        ((bubi) bubd.f153216a).f153229d.f153205a++;
                                        bfni6 = bfni5;
                                    } else {
                                        i4++;
                                    }
                                }
                                ((bubi) bube.f153219a).f153229d.f153207c += i5;
                                bube.f153222d++;
                                bfml3 = bfml.m97249a(2, bfni6, bfmn.f114417g, bfmn);
                            }
                            Collections.sort(arrayList);
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("#");
                            int size = arrayList.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                int intValue = ((Integer) arrayList.get(i19)).intValue();
                                sb9.append("#");
                                sb9.append(intValue);
                            }
                            str = sb9.toString();
                            j4 = bsax.mo70138j(5);
                            bmxy.m108581a(bsax);
                            int b62 = bsax.mo70114b(2);
                            int b72 = bsax.mo70114b(3);
                            double d22 = (double) bsax.mo70126d(4);
                            Double.isNaN(d22);
                            bfni bfni62 = new bfni(b62, b72, Math.max(100000, (int) (d22 * 1000000.0d)));
                            i4 = 0;
                            while (true) {
                                if (i4 < j4) {
                                }
                                i4++;
                            }
                            ((bubi) bube.f153219a).f153229d.f153207c += i5;
                            bube.f153222d++;
                            bfml3 = bfml.m97249a(2, bfni62, bfmn.f114417g, bfmn);
                        } else {
                            bubi bubi2 = (bubi) bube.f153219a;
                            bubi2.f153229d.f153208d++;
                            bubk bubk = bubi2.f153227b;
                            bfml3 = (bubk.f153234b || bubk.f153237e.f153226a.f153251f == null || bubk.f153238f.mo62775b() - bubk.f153235c <= ((long) bubk.f153240h)) ? null : cewj.m138361d() ? bfml.m97248a(0, bfmy.NO_LOCATION, bfmn) : bfml.m97250a(bfmy.CACHE_MISS, 0, bfmn);
                        }
                        bfml = bfml.m97249a(bfml3.f114405a, bfni4, bfmn.f114417g, bfmn);
                        if (bfni == null) {
                        }
                        bfni2 = bfni;
                        bfoa2 = bfoa;
                        if (bfoa2 != null) {
                        }
                        bfns a22 = mo62697a(bfoa2, bfni2);
                        bfmy = a22.f114450d;
                        bfmy2 = bfmy.OK;
                        bfmy bfmy32 = bfml.f114450d;
                        bfmy bfmy42 = bfmy.OK;
                        if (bfmy != bfmy2) {
                        }
                        if (bfmy == bfmy2) {
                        }
                        bfml2 = bfml;
                        if (!z) {
                        }
                        return new bfnb(bfml2, a22, bfml, z2);
                    }
                    bgdw2 = bgdw4;
                    j2 = b3;
                    list3 = list;
                    bfml3 = null;
                    bfml = bfml.m97249a(bfml3.f114405a, bfni4, bfmn.f114417g, bfmn);
                    if (bfni == null) {
                    }
                    bfni2 = bfni;
                    bfoa2 = bfoa;
                    if (bfoa2 != null) {
                    }
                    bfns a222 = mo62697a(bfoa2, bfni2);
                    bfmy = a222.f114450d;
                    bfmy2 = bfmy.OK;
                    bfmy bfmy322 = bfml.f114450d;
                    bfmy bfmy422 = bfmy.OK;
                    if (bfmy != bfmy2) {
                    }
                    if (bfmy == bfmy2) {
                    }
                    bfml2 = bfml;
                    if (!z) {
                    }
                    return new bfnb(bfml2, a222, bfml, z2);
                }
                bgdw = bgdw4;
                j = b3;
                list2 = list;
                bgdw bgdw6 = bgdw;
                long j11 = j;
                bfni a9 = bgdw6.mo62692a(bfmn, j11);
                if (a9 == null) {
                    bfmu.mo61959a(bfmn.mo61947a(bgdw6.f116185a.mo62776c()), 1);
                    if (cewj.m138361d()) {
                        bfml = bfml.m97248a(1, bfmy.NO_LOCATION, bfmn);
                    } else {
                        bfml = bfml.m97250a(bfmy.CACHE_MISS, bfmn.f114417g, bfmn);
                    }
                } else if (!a9.mo61980a()) {
                    bfml = bfml.m97250a(bfmy.NO_LOCATION, 0, bfmn);
                } else {
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    bgdx bgdx = new bgdx(i + 1);
                    bfmp bfmp = new bfmp(bgdw6, j11, bgdx);
                    long j12 = bfmn.f114417g - 30000;
                    bfmq bfmq3 = bfmq;
                    bfmn bfmn5 = bfmq3.f114425a;
                    if (bfmn5 != null) {
                        bfmp.mo61954a(bfmn5);
                    }
                    List list4 = bfmq3.f114426b;
                    int size2 = list4.size();
                    for (int i20 = 0; i20 < size2; i20++) {
                        bfmn bfmn6 = (bfmn) list4.get(i20);
                        if (bfmn6.f114417g > j12) {
                            bfmp.mo61954a(bfmn6);
                        }
                    }
                    int b10 = ayuo.m84849b(bgdx.mo62694a());
                    int b11 = ayuo.m84849b(bgdx.mo62695b());
                    int i21 = bgdx.f116194c;
                    if (i21 == 0) {
                        i2 = 0;
                    } else if (i21 != 1) {
                        double a10 = bgdx.mo62694a();
                        double b12 = bgdx.mo62695b();
                        int i22 = 5000;
                        int i23 = 5000;
                        int i24 = 0;
                        boolean z3 = false;
                        int i25 = 0;
                        while (true) {
                            i3 = bgdx.f116194c;
                            if (i24 >= i3) {
                                break;
                            }
                            double d4 = a10;
                            int round = (int) Math.round(ayuo.m84846b(a10, b12, bgdx.f116195d[i24], bgdx.f116196e[i24]));
                            i25 += round;
                            int i26 = bgdx.f116197f[i24];
                            if (round > i26) {
                                z3 = true;
                            }
                            if (i26 < i22) {
                                i23 = round;
                            }
                            if (i26 < i22) {
                                i22 = i26;
                            }
                            i24++;
                            a10 = d4;
                        }
                        if (z3) {
                            i2 = i25 / i3;
                        } else {
                            i2 = Math.max(i22, i23);
                        }
                    } else {
                        i2 = bgdx.f116197f[0];
                    }
                    bfni bfni7 = new bfni(b10, b11, bfmw.m97290b(i2));
                    if (bfmw.m97289a(bfni7)) {
                        String valueOf3 = String.valueOf(bfni7);
                        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                        sb10.append("Found cell location: ");
                        sb10.append(valueOf3);
                        sb10.toString();
                        bfml = bfml.m97249a(1, bfni7, bfmn.f114417g, bfmn);
                    } else {
                        bfml = bfml.m97250a(bfmy.NO_LOCATION, bfmn.f114417g, bfmn);
                    }
                }
                if (bfni == null) {
                }
                bfni2 = bfni;
                bfoa2 = bfoa;
                if (bfoa2 != null) {
                }
                bfns a2222 = mo62697a(bfoa2, bfni2);
                bfmy = a2222.f114450d;
                bfmy2 = bfmy.OK;
                bfmy bfmy3222 = bfml.f114450d;
                bfmy bfmy4222 = bfmy.OK;
                if (bfmy != bfmy2) {
                }
                if (bfmy == bfmy2) {
                }
                bfml2 = bfml;
                if (!z) {
                }
                return new bfnb(bfml2, a2222, bfml, z2);
            }
        }
        bfml = bfml.m97250a(bfmy.EMPTY_SCAN, 0, bfmn);
        if (bfni == null) {
        }
        bfni2 = bfni;
        bfoa2 = bfoa;
        if (bfoa2 != null) {
        }
        bfns a22222 = mo62697a(bfoa2, bfni2);
        bfmy = a22222.f114450d;
        bfmy2 = bfmy.OK;
        bfmy bfmy32222 = bfml.f114450d;
        bfmy bfmy42222 = bfmy.OK;
        if (bfmy != bfmy2) {
        }
        if (bfmy == bfmy2) {
        }
        bfml2 = bfml;
        if (!z) {
        }
        return new bfnb(bfml2, a22222, bfml, z2);
    }

    /* renamed from: a */
    public final buje mo62698a(Long l) {
        throw null;
    }

    /* renamed from: a */
    public final bfns mo62697a(bfoa bfoa, bfni bfni) {
        bfns a;
        bfni bfni2;
        this.f116204e.mo61864a();
        if (bfoa == null || bfoa.mo62006b() == 0) {
            return bfns.m97357a(bfmy.EMPTY_SCAN, this.f116201b.mo62776c(), bfoa);
        }
        if (!ceze.m138458c() || !bfoa.mo62013f() || (a = bgdz.m98685a(this).mo62700a(bfoa.mo62011e())) == null || a.f114450d != bfmy.OK) {
            bfns a2 = this.f116205f.mo62701a(bfoa, bfni);
            return a2 == null ? bfns.m97357a(bfmy.NO_LOCATION, this.f116201b.mo62776c(), bfoa) : a2;
        } else if (!cewj.f183475a.mo6606a().overwriteRttZAxisInfoWithFrewle()) {
            return a;
        } else {
            bfns a3 = this.f116205f.mo62701a(bfoa, bfni);
            if (a.f114449c == null || a3 == null || a3.f114450d != bfmy.OK || (bfni2 = a3.f114449c) == null) {
                return a;
            }
            bfnh l = a.f114449c.mo61991l();
            if (bfni2.mo61985f()) {
                l.f114471b = bfni2.mo61990k();
            }
            if (bfni2.mo61983d()) {
                l.mo61979a(bfni2.mo61988i());
            }
            if (bfni2.mo61981b() && bfni2.mo61982c()) {
                l.mo61978a(bfni2.mo61986g(), bfni2.mo61987h());
            }
            if (bfni2.mo61984e()) {
                l.f114470a = bfni2.mo61989j();
            }
            return bfns.m97356a(a.f114508a, l.mo61977a(), a.f114451e, a.f114509b);
        }
    }

    /* renamed from: a */
    public final boolean mo62699a() {
        this.f116204e.mo61864a();
        return this.f116200a.mo62693a();
    }
}
