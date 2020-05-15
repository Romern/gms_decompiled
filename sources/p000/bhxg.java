package p000;

import java.util.ArrayList;

/* renamed from: bhxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxg extends bhxa {

    /* renamed from: d */
    private static final C1245ok f119808d;

    /* renamed from: e */
    private static final C1245ok f119809e;

    /* renamed from: f */
    private static final C1245ok f119810f;

    /* renamed from: g */
    private float f119811g;

    /* renamed from: h */
    private long f119812h;

    /* renamed from: i */
    private bhxb f119813i;

    /* renamed from: j */
    private bhxc f119814j;

    /* renamed from: k */
    private bhxe f119815k;

    static {
        C1245ok okVar = new C1245ok();
        okVar.put(1, 0);
        okVar.put(4, 0);
        okVar.put(2, 0);
        okVar.put(3, 0);
        f119808d = okVar;
        C1245ok okVar2 = new C1245ok();
        okVar2.put(1, 0);
        okVar2.put(4, 1);
        okVar2.put(2, 1);
        okVar2.put(3, 0);
        f119809e = okVar2;
        C1245ok okVar3 = new C1245ok();
        okVar3.put(1, 0);
        okVar3.put(4, 0);
        okVar3.put(2, 1);
        okVar3.put(3, 1);
        f119810f = okVar3;
    }

    public bhxg(bhuk bhuk, bicy bicy) {
        super(bhuk, bicy);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e9, code lost:
        if (r0 != 4) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028d, code lost:
        if (r2 > ((float) p000.cggg.f186820a.mo6606a().mo83687e())) goto L_0x028f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02e6  */
    /* renamed from: a */
    public final bhxb mo64354a(bhtx bhtx) {
        bhxf bhxf;
        boolean z;
        int i;
        bpol bpol;
        int i2;
        long j;
        bhxc bhxc;
        bhub bhub;
        bhtx bhtx2 = bhtx;
        bhxe bhxe = this.f119815k;
        bhxe.f119795l = bhtx2.f119580a;
        bhuc bhuc = bhxe.f119784a;
        bhub bhub2 = bhxe.f119795l;
        long j2 = bhub2.f119610f;
        int i3 = bhub2.f119609e;
        StringBuilder sb = new StringBuilder(68);
        sb.append("Segmenter: input time ");
        sb.append(j2);
        sb.append(", input source ");
        sb.append(i3);
        bhuc.mo64304a(sb.toString());
        bhxe.f119785b++;
        bhxe.f119786c++;
        bhxe.f119787d++;
        bhxe.f119788e++;
        long j3 = bhxe.f119793j;
        if (j3 > 0) {
            long j4 = bhtx2.f119580a.f119610f;
            bicy bicy = bhxe.f119797n;
            if (j3 < j4 - bicy.m101986e()) {
                bhxe.f119796m = null;
            }
        }
        bhtr bhtr = bhtx2.f119583d;
        if (bhtr != null && bhtr.f119565a.size() > 0) {
            long j5 = bhtx2.f119583d.f119566b;
            long j6 = bhxe.f119795l.f119610f;
            bicy bicy2 = bhxe.f119797n;
            if (j5 >= j6 - bicy.m101986e()) {
                bhtr bhtr2 = bhtx2.f119583d;
                bhxe.f119793j = bhtr2.f119566b;
                float f = -1.0f;
                bhtw bhtw = null;
                for (int i4 = 0; i4 < bhtr2.f119565a.size(); i4++) {
                    float f2 = ((bhtw) bhtr2.f119565a.get(i4)).f119579b;
                    if (f2 > f) {
                        bhtw = (bhtw) bhtr2.f119565a.get(i4);
                        f = f2;
                    }
                }
                bhxe.f119796m = bhtw;
                bhtw bhtw2 = bhxe.f119796m;
                long j7 = bhxe.f119793j;
                bhuc bhuc2 = bhxe.f119784a;
                int i5 = bhtw2.f119578a;
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append(", detected activity ");
                sb2.append(i5);
                bhuc2.mo64304a(sb2.toString());
                int i6 = bhtw2.f119578a;
                if (i6 == 0) {
                    bhxe.f119792i = j7;
                    bhxe.f119788e = 0;
                } else if (i6 == 1) {
                    bhxe.f119790g = j7;
                    bhxe.f119786c = 0;
                } else if (i6 == 3) {
                    bhxe.f119789f = j7;
                    bhxe.f119785b = 0;
                } else if (i6 == 6) {
                    bhxe.f119791h = j7;
                    bhxe.f119787d = 0;
                }
            }
        }
        bhub bhub3 = bhtx2.f119580a;
        long j8 = bhub3.f119610f;
        bhxb bhxb = this.f119813i;
        if ((bhxb == null || j8 >= bhxb.f119775b.f119766b) && j8 >= this.f119812h) {
            int i7 = bhub3.f119609e;
            if (!(bhxb == null || bhxb.f119775b.f119765a == bpol.AT_PLACE)) {
                this.f119811g += bhxd.m101691a(i7);
            }
            bhxe bhxe2 = this.f119815k;
            bhxc bhxc2 = this.f119814j;
            bhuh a = bhuh.m101543a(bhtx2.f119580a);
            int i8 = bhtx2.f119580a.f119609e;
            bhxf bhxf2 = bhxc2.f119779c;
            bicy bicy3 = bhxc2.f119783g;
            double f3 = (double) (((float) cggg.f186820a.mo6606a().mo83688f()) * 1.569609E-7f);
            if (!bhxc2.f119780d.mo64385b() && bhxd.m101690a(bhxc2.f119780d, a, i8) <= f3) {
                bhxc2.f119780d.mo64384a(bhtx2);
                bhxc2.f119782f = bhxc2.f119780d;
                bhxc2.f119777a.mo64304a(bhxc2.mo64378a());
                bhxf = bhxc2.f119782f;
            } else if (!bhxf2.mo64385b() && bhxd.m101690a(bhxf2, a, i8) <= f3) {
                bicy bicy4 = bhxc2.f119783g;
                if (bicy.m101984c() > 0) {
                    long a2 = bhxf2.mo64383a();
                    bicy bicy5 = bhxc2.f119783g;
                    if (a2 >= bicy.m101984c() * 1000) {
                        bhxf bhxf3 = new bhxf();
                        bhxf3.mo64384a(bhtx2);
                        bhxc2.mo64379a(bhxf3);
                        bhxc2.f119782f = bhxf3;
                        bhxf = bhxc2.f119782f;
                        bhxc2.f119780d = bhxf;
                    }
                }
                bhxf2.mo64384a(bhtx2);
                bhxc2.f119782f = bhxf2;
                bhxc2.f119777a.mo64304a(bhxc2.mo64378a());
                bhxf = bhxc2.f119782f;
            } else {
                ArrayList arrayList = bhxc2.f119778b;
                int size = arrayList.size();
                bhxf bhxf4 = null;
                for (int i9 = 0; i9 < size; i9++) {
                    bhxf bhxf5 = (bhxf) arrayList.get(i9);
                    double a3 = bhxd.m101690a(bhxf5, a, i8);
                    if (a3 <= f3) {
                        bhxf4 = bhxf5;
                    }
                    if (a3 <= f3) {
                        f3 = a3;
                    }
                }
                if (bhxf4 == null) {
                    bhxf bhxf6 = new bhxf();
                    bhxf6.mo64384a(bhtx2);
                    bhxc2.mo64379a(bhxf6);
                    bhxc2.f119782f = bhxf6;
                    bhxc2.f119777a.mo64304a(bhxc2.mo64378a());
                    bhxf = bhxc2.f119782f;
                } else {
                    bhxf4.mo64384a(bhtx2);
                    bhxc2.f119782f = bhxf4;
                    bhxc2.f119777a.mo64304a(bhxc2.mo64378a());
                    bhxf = bhxc2.f119782f;
                }
            }
            bhxc bhxc3 = this.f119814j;
            boolean equals = bhxc3.f119779c.equals(bhxc3.f119782f);
            bhxc bhxc4 = this.f119814j;
            float f4 = this.f119811g;
            if (!bhxc4.f119779c.mo64385b()) {
                if (f4 >= 2.0f) {
                    long c = bhxc4.f119779c.mo64386c();
                    bicy bicy6 = bhxc4.f119783g;
                    if (j8 - c < cggg.f186820a.mo6606a().mo83690h()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                bhxe2.f119784a.mo64304a(", return code ");
                if (!equals) {
                    bhxe2.f119784a.mo64304a("0");
                    bhxe2.mo64382b();
                    i = 4;
                } else {
                    if (!bhxe2.mo64381a(bhxe2.f119792i, bhxe2.f119788e) && !bhxe2.mo64381a(bhxe2.f119791h, bhxe2.f119787d) && !bhxe2.mo64381a(bhxe2.f119790g, bhxe2.f119786c)) {
                        float f5 = bhxe2.f119795l.f119611g;
                        bicy bicy7 = bhxe2.f119797n;
                    }
                    if (!bhxe2.mo64381a(bhxe2.f119789f, bhxe2.f119785b)) {
                        bhxe2.f119784a.mo64304a("1");
                        bhxe2.mo64380a();
                        i = 3;
                    }
                    if (bhxf.f119798a > 2.0f) {
                        long a4 = bhxf.mo64383a();
                        bicy bicy8 = bhxe2.f119797n;
                        if (a4 > cggg.f186820a.mo6606a().mo83691i()) {
                            bhxe2.f119784a.mo64304a("2");
                            bhxe2.mo64382b();
                            i = 1;
                        }
                    }
                    if (!z) {
                        bhxe2.f119784a.mo64304a("3");
                        bhxe2.mo64380a();
                        i = 2;
                    } else {
                        bhxe2.f119784a.mo64304a("4");
                        bhxe2.mo64380a();
                        i = 3;
                    }
                }
                if (i != 1) {
                    if (i == 3) {
                        bhxc bhxc5 = this.f119814j;
                        bhxf bhxf7 = new bhxf();
                        bhxc5.f119781e = bhxc5.f119779c;
                        bhxc5.f119779c = bhxf7;
                    }
                    if (i != 1 || i == 2 || i == 4) {
                        bpol = bpol.AT_PLACE;
                    } else {
                        bpol = bpol.IN_TRANSIT;
                    }
                    if (!cgfi.f186720a.mo6606a().mo83591a()) {
                        i2 = mo64374a(bpol);
                    } else {
                        bhxb bhxb2 = this.f119771b;
                        if (bhxb2 == null) {
                            i2 = ((Integer) f119808d.get(Integer.valueOf(i))).intValue();
                        } else {
                            int ordinal = bhxb2.f119775b.f119765a.ordinal();
                            i2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? 1 : ((Integer) f119810f.get(Integer.valueOf(i))).intValue() : ((Integer) f119809e.get(Integer.valueOf(i))).intValue() : ((Integer) f119808d.get(Integer.valueOf(i))).intValue();
                        }
                    }
                    if (i2 == 0 && this.f119813i != null) {
                        this.f119814j.f119778b.clear();
                    }
                    if (i != 1) {
                        if (i == 3) {
                            j = this.f119815k.f119794k;
                        } else if (i != 4) {
                            j = j8;
                        }
                        bhxc = this.f119814j;
                        if (bhxc.f119779c.mo64385b()) {
                            bhub = bhxc.f119779c.f119800c.mo64309a();
                        } else {
                            bhub = null;
                        }
                        bhxb a5 = mo64375a(i2, bpol, j, bhub, this.f119814j.f119779c.f119801d);
                        this.f119813i = a5;
                        bhuc bhuc3 = this.f119770a;
                        String valueOf = String.valueOf(a5.toString());
                        bhuc3.mo64304a(valueOf.length() != 0 ? new String("\n") : "\n".concat(valueOf));
                        return a5;
                    }
                    bhxc bhxc6 = this.f119814j;
                    j = Math.max(bhxc6.f119779c.f119799b, bhxc6.f119781e.mo64386c());
                    bhxc = this.f119814j;
                    if (bhxc.f119779c.mo64385b()) {
                    }
                    bhxb a52 = mo64375a(i2, bpol, j, bhub, this.f119814j.f119779c.f119801d);
                    this.f119813i = a52;
                    bhuc bhuc32 = this.f119770a;
                    String valueOf2 = String.valueOf(a52.toString());
                    bhuc32.mo64304a(valueOf2.length() != 0 ? new String("\n") : "\n".concat(valueOf2));
                    return a52;
                }
                bhxc bhxc7 = this.f119814j;
                bhxc7.f119781e = bhxc7.f119779c;
                bhxc7.f119779c = bhxc7.f119782f;
                bhxc7.f119780d = new bhxf();
                this.f119811g = 0.0f;
                if (i != 1) {
                }
                bpol = bpol.AT_PLACE;
                if (!cgfi.f186720a.mo6606a().mo83591a()) {
                }
                this.f119814j.f119778b.clear();
                if (i != 1) {
                }
                bhxc bhxc62 = this.f119814j;
                j = Math.max(bhxc62.f119779c.f119799b, bhxc62.f119781e.mo64386c());
                bhxc = this.f119814j;
                if (bhxc.f119779c.mo64385b()) {
                }
                bhxb a522 = mo64375a(i2, bpol, j, bhub, this.f119814j.f119779c.f119801d);
                this.f119813i = a522;
                bhuc bhuc322 = this.f119770a;
                String valueOf22 = String.valueOf(a522.toString());
                bhuc322.mo64304a(valueOf22.length() != 0 ? new String("\n") : "\n".concat(valueOf22));
                return a522;
            }
            z = true;
            bhxe2.f119784a.mo64304a(", return code ");
            if (!equals) {
            }
            if (i != 1) {
            }
            bhxc bhxc72 = this.f119814j;
            bhxc72.f119781e = bhxc72.f119779c;
            bhxc72.f119779c = bhxc72.f119782f;
            bhxc72.f119780d = new bhxf();
            this.f119811g = 0.0f;
            if (i != 1) {
            }
            bpol = bpol.AT_PLACE;
            if (!cgfi.f186720a.mo6606a().mo83591a()) {
            }
            this.f119814j.f119778b.clear();
            if (i != 1) {
            }
            bhxc bhxc622 = this.f119814j;
            j = Math.max(bhxc622.f119779c.f119799b, bhxc622.f119781e.mo64386c());
            bhxc = this.f119814j;
            if (bhxc.f119779c.mo64385b()) {
            }
            bhxb a5222 = mo64375a(i2, bpol, j, bhub, this.f119814j.f119779c.f119801d);
            this.f119813i = a5222;
            bhuc bhuc3222 = this.f119770a;
            String valueOf222 = String.valueOf(a5222.toString());
            bhuc3222.mo64304a(valueOf222.length() != 0 ? new String("\n") : "\n".concat(valueOf222));
            return a5222;
        }
        bhwp a6 = bhuj.m101555a();
        long j9 = this.f119812h;
        StringBuilder sb3 = new StringBuilder(119);
        sb3.append("Position timestamp out of order. Previous: ");
        sb3.append(j9);
        sb3.append(", Current: ");
        sb3.append(j8);
        sb3.append(". Skipping this Position.");
        a6.mo64361c(sb3.toString());
        bhxb bhxb3 = this.f119813i;
        if (bhxb3 == null) {
            return mo64375a(0, bpol.IN_TRANSIT, System.currentTimeMillis(), null, null);
        }
        if (bhxb3.f119775b.f119765a != bpol.AT_PLACE) {
            return this.f119813i;
        }
        bpol bpol2 = bpol.AT_PLACE;
        bhwz bhwz = this.f119813i.f119775b;
        return mo64375a(1, bpol2, bhwz.f119766b, bhwz.f119767c, bhwz.f119768d);
    }

    /* renamed from: a */
    public final void mo64355a() {
        super.mo64355a();
        this.f119811g = 0.0f;
        this.f119813i = null;
        this.f119812h = -1;
        this.f119814j = new bhxc(this.f119772c, this.f119770a);
        this.f119815k = new bhxe(this.f119772c, this.f119770a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64356a(bhuk bhuk, bhtx bhtx, bhxb bhxb) {
        bhtx bhtx2 = bhtx;
        bhxb bhxb2 = bhxb;
        bhub bhub = bhtx2.f119580a;
        long j = bhub.f119610f;
        long j2 = this.f119812h;
        long j3 = -1;
        int i = j2 != -1 ? (int) ((j - j2) / 1000) : -1;
        boolean z = bhtx2.f119583d != null;
        boolean z2 = bhtx2.f119581b != null;
        boolean z3 = bhub.f119611g != -1.0f;
        if (bhxb2.f119774a == 1) {
            bhwz bhwz = bhxb2.f119775b;
            bpol bpol = bhwz.f119765a;
            long j4 = bhwz.f119766b;
            bxvd da = bpop.f138552h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpop bpop = (bpop) da.f164949b;
            bpop.f138555b = 2;
            bpop.f138554a |= 1;
            bxvd da2 = bpom.f138545d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpom bpom = (bpom) da2.f164949b;
            int i2 = bpom.f138547a | 2;
            bpom.f138547a = i2;
            bpom.f138549c = j4;
            if (bpol != null) {
                bpom.f138548b = bpol.f138544d;
                bpom.f138547a = i2 | 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpop bpop2 = (bpop) da.f164949b;
            bpom bpom2 = (bpom) da2.mo74062i();
            bpom2.getClass();
            bpop2.f138556c = bpom2;
            bpop2.f138554a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpop bpop3 = (bpop) da.f164949b;
            bpop3.f138558e = 1;
            bpop3.f138554a |= 8;
            bxvd da3 = bpoq.f138561f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpoq bpoq = (bpoq) da3.f164949b;
            int i3 = 1 | bpoq.f138563a;
            bpoq.f138563a = i3;
            bpoq.f138564b = i;
            int i4 = i3 | 2;
            bpoq.f138563a = i4;
            bpoq.f138565c = z;
            int i5 = i4 | 4;
            bpoq.f138563a = i5;
            bpoq.f138566d = z2;
            bpoq.f138563a = i5 | 8;
            bpoq.f138567e = z3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpop bpop4 = (bpop) da.f164949b;
            bpoq bpoq2 = (bpoq) da3.mo74062i();
            bpoq2.getClass();
            bpop4.f138559f = bpoq2;
            bpop4.f138554a |= 16;
            da.mo74062i();
            bicx bicx = (bicx) bhuk;
            bicx.mo64534a(bicx.mo64533a((bpop) da.mo74062i()));
        } else {
            bhwz bhwz2 = bhxb2.f119775b;
            bpol bpol2 = bhwz2.f119765a;
            long j5 = bhwz2.f119766b;
            bhwz bhwz3 = bhxb2.f119776c;
            bpol bpol3 = bhwz3 != null ? bhwz3.f119765a : bpol.UNKNOWN;
            bhwz bhwz4 = bhxb2.f119776c;
            if (bhwz4 != null) {
                j3 = bhwz4.f119766b;
            }
            bxvd da4 = bpop.f138552h.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpop bpop5 = (bpop) da4.f164949b;
            bpop5.f138555b = 1;
            bpop5.f138554a |= 1;
            bxvd da5 = bpom.f138545d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bpom bpom3 = (bpom) da5.f164949b;
            int i6 = bpom3.f138547a | 2;
            bpom3.f138547a = i6;
            bpom3.f138549c = j3;
            if (bpol3 != null) {
                bpom3.f138548b = bpol3.f138544d;
                bpom3.f138547a = i6 | 1;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpop bpop6 = (bpop) da4.f164949b;
            bpom bpom4 = (bpom) da5.mo74062i();
            bpom4.getClass();
            bpop6.f138556c = bpom4;
            bpop6.f138554a |= 2;
            bxvd da6 = bpom.f138545d.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bpom bpom5 = (bpom) da6.f164949b;
            int i7 = bpom5.f138547a | 2;
            bpom5.f138547a = i7;
            bpom5.f138549c = j5;
            if (bpol2 != null) {
                bpom5.f138548b = bpol2.f138544d;
                bpom5.f138547a = i7 | 1;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpop bpop7 = (bpop) da4.f164949b;
            bpom bpom6 = (bpom) da6.mo74062i();
            bpom6.getClass();
            bpop7.f138557d = bpom6;
            bpop7.f138554a |= 4;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpop bpop8 = (bpop) da4.f164949b;
            bpop8.f138558e = 1;
            bpop8.f138554a |= 8;
            bxvd da7 = bpoq.f138561f.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bpoq bpoq3 = (bpoq) da7.f164949b;
            int i8 = bpoq3.f138563a | 1;
            bpoq3.f138563a = i8;
            bpoq3.f138564b = i;
            int i9 = 2 | i8;
            bpoq3.f138563a = i9;
            bpoq3.f138565c = z;
            int i10 = i9 | 4;
            bpoq3.f138563a = i10;
            bpoq3.f138566d = z2;
            bpoq3.f138563a = i10 | 8;
            bpoq3.f138567e = z3;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpop bpop9 = (bpop) da4.f164949b;
            bpoq bpoq4 = (bpoq) da7.mo74062i();
            bpoq4.getClass();
            bpop9.f138559f = bpoq4;
            bpop9.f138554a |= 16;
            da4.mo74062i();
            bicx bicx2 = (bicx) bhuk;
            bicx2.mo64534a(bicx2.mo64533a((bpop) da4.mo74062i()));
        }
        this.f119812h = j;
    }
}
