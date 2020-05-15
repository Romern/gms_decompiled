package p000;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: almh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almh {

    /* renamed from: a */
    public final almk f73687a;

    /* renamed from: b */
    public String f73688b;

    /* renamed from: c */
    public String f73689c;

    /* renamed from: d */
    public List f73690d = new ArrayList();

    /* renamed from: e */
    public int f73691e;

    /* renamed from: f */
    public String f73692f;

    /* renamed from: g */
    public SparseIntArray f73693g = new SparseIntArray();

    /* renamed from: h */
    public int f73694h;

    /* renamed from: i */
    public int f73695i;

    /* renamed from: j */
    public boolean f73696j;

    /* renamed from: k */
    public int f73697k;

    /* renamed from: l */
    public int f73698l;

    /* renamed from: m */
    public int f73699m;

    /* renamed from: n */
    public int f73700n;

    /* renamed from: o */
    public int f73701o;

    /* renamed from: p */
    public int f73702p;

    /* renamed from: q */
    public final String f73703q;

    /* renamed from: r */
    public int f73704r;

    /* renamed from: s */
    public int f73705s;

    /* renamed from: t */
    public int f73706t;

    /* renamed from: u */
    public int f73707u;

    /* renamed from: v */
    public int f73708v;

    /* renamed from: w */
    public int f73709w = 1;

    /* renamed from: x */
    private final ArrayList f73710x = new ArrayList();

    /* renamed from: y */
    private final int f73711y;

    public almh(String str) {
        almk a = almk.m61263a();
        this.f73711y = m61258a(str);
        this.f73687a = a;
        this.f73703q = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m61258a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1562673867:
                if (str.equals("LoadAvatarByReference")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -786677719:
                if (str.equals("IdentityGetByIds")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -256273972:
                if (str.equals("LoadAutocompleteList")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 68692846:
                if (str.equals("GetMe")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 862665990:
                if (str.equals("LoadOwnerAvatar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1124082446:
                if (str.equals("isSyncToContactsEnabled")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 1138528744:
                if (str.equals("LoadOwnerCoverPhoto")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1665805510:
                if (str.equals("LoadOwners")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2079406139:
                if (str.equals("SetAvatar")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 1;
        }
    }

    /* renamed from: b */
    public final void mo40510b(int i, int i2) {
        this.f73704r = i;
        this.f73691e = i2;
    }

    /* renamed from: a */
    public final void mo40507a(int i, int i2) {
        int i3;
        double d;
        double d2;
        String str;
        List list;
        Double d3;
        int i4;
        int i5;
        int i6 = this.f73711y;
        if (i6 == 2) {
            amig.m62939a();
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83308al()).booleanValue()) {
                if (this.f73694h == 1) {
                    d3 = Double.valueOf(cgbe.f186279a.mo6606a().mo83322az());
                } else {
                    d3 = Double.valueOf(cgbe.f186279a.mo6606a().mo83321ay());
                }
                double doubleValue = d3.doubleValue();
                almk almk = this.f73687a;
                String str2 = this.f73688b;
                String str3 = this.f73689c;
                SparseIntArray sparseIntArray = this.f73693g;
                String str4 = this.f73692f;
                if (str4 != null) {
                    i4 = str4.length();
                } else {
                    i4 = 0;
                }
                int i7 = this.f73694h;
                int i8 = this.f73695i;
                boolean z = this.f73696j;
                int i9 = this.f73707u;
                List list2 = this.f73690d;
                bxvd da = amlq.f75203f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amlq amlq = (amlq) da.f164949b;
                int i10 = amlq.f75205a | 1;
                amlq.f75205a = i10;
                amlq.f75206b = i4;
                if (i7 != 0) {
                    i5 = i7 != 1 ? i7 != 2 ? 1 : 4 : 3;
                } else {
                    i5 = 2;
                }
                amlq.f75207c = i5 - 1;
                amlq.f75205a = i10 | 2;
                amig.m62939a();
                if (sparseIntArray != null && sparseIntArray.size() > 0) {
                    amln[] amlnArr = new amln[sparseIntArray.size()];
                    int i11 = 0;
                    while (i11 < sparseIntArray.size()) {
                        int a = amlm.m63037a(sparseIntArray.keyAt(i11));
                        int i12 = a - 1;
                        if (a != 0) {
                            int i13 = sparseIntArray.get(i12);
                            bxvd da2 = amln.f75192d.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            amln amln = (amln) da2.f164949b;
                            amln.f75195b = i12;
                            int i14 = amln.f75194a | 1;
                            amln.f75194a = i14;
                            amln.f75194a = i14 | 2;
                            amln.f75196c = i13;
                            amlnArr[i11] = (amln) da2.mo74062i();
                            i11++;
                        } else {
                            throw null;
                        }
                    }
                    List asList = Arrays.asList(amlnArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlq amlq2 = (amlq) da.f164949b;
                    if (!amlq2.f75208d.mo73666a()) {
                        amlq2.f75208d = GeneratedMessageLite.m124021a(amlq2.f75208d);
                    }
                    bxsy.m123078a(asList, amlq2.f75208d);
                }
                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83309am()).booleanValue()) {
                    bxvd da3 = amlo.f75197d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    amlo amlo = (amlo) da3.f164949b;
                    int i15 = amlo.f75199a | 1;
                    amlo.f75199a = i15;
                    amlo.f75200b = i8;
                    amlo.f75199a = i15 | 2;
                    amlo.f75201c = z;
                    amlo amlo2 = (amlo) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlq amlq3 = (amlq) da.f164949b;
                    amlo2.getClass();
                    amlq3.f75209e = amlo2;
                    amlq3.f75205a |= 4;
                }
                almk.mo40512a(2, null, str2, str3, i, i2, i9, list2, (amlq) da.mo74062i(), null, null, doubleValue);
            }
        } else if (i6 == 3) {
            amig.m62939a();
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83310an()).booleanValue()) {
                almk almk2 = this.f73687a;
                String str5 = this.f73688b;
                String str6 = this.f73689c;
                List list3 = this.f73690d;
                int i16 = this.f73705s;
                int i17 = this.f73706t;
                int i18 = this.f73697k;
                int i19 = this.f73698l;
                int i20 = this.f73699m;
                int i21 = this.f73700n;
                int i22 = this.f73701o;
                int i23 = this.f73702p;
                int i24 = this.f73708v;
                int i25 = this.f73709w;
                double doubleValue2 = ((Double) amgx.f74900a.mo41191a()).doubleValue();
                bxvd da4 = amli.f75179i.mo74144da();
                amig.m62939a();
                if (((Boolean) amgo.f74891a.mo41191a()).booleanValue()) {
                    d2 = doubleValue2;
                    bxvd da5 = amlf.f75170f.mo74144da();
                    amig.m62939a();
                    if (!((Boolean) amgm.f74889a.mo41191a()).booleanValue()) {
                        str = str6;
                        list = list3;
                    } else {
                        list = list3;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        amlf amlf = (amlf) da5.f164949b;
                        str = str6;
                        int i26 = amlf.f75172a | 4;
                        amlf.f75172a = i26;
                        amlf.f75175d = i20;
                        amlf.f75172a = i26 | 8;
                        amlf.f75176e = i21;
                    }
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    amlf amlf2 = (amlf) da5.f164949b;
                    int i27 = i16 - 1;
                    if (i16 != 0) {
                        amlf2.f75173b = i27;
                        int i28 = amlf2.f75172a | 1;
                        amlf2.f75172a = i28;
                        int i29 = i17 - 1;
                        if (i17 != 0) {
                            amlf2.f75174c = i29;
                            amlf2.f75172a = i28 | 2;
                            amlf amlf3 = (amlf) da5.mo74062i();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            amli amli = (amli) da4.f164949b;
                            amlf3.getClass();
                            amli.f75182b = amlf3;
                            amli.f75181a |= 1;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    str = str6;
                    d2 = doubleValue2;
                    list = list3;
                }
                if (((Boolean) amgn.f74890a.mo41191a()).booleanValue()) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    amli amli2 = (amli) da4.f164949b;
                    int i30 = i25 - 1;
                    if (i25 != 0) {
                        amli2.f75188h = i30;
                        amli2.f75181a |= 64;
                    } else {
                        throw null;
                    }
                }
                if (((Boolean) amgp.f74892a.mo41191a()).booleanValue()) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    amli amli3 = (amli) da4.f164949b;
                    int i31 = amli3.f75181a | 2;
                    amli3.f75181a = i31;
                    amli3.f75183c = i18;
                    amli3.f75181a = i31 | 4;
                    amli3.f75184d = i19;
                }
                if (((Boolean) amgq.f74893a.mo41191a()).booleanValue()) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    amli amli4 = (amli) da4.f164949b;
                    int i32 = amli4.f75181a | 8;
                    amli4.f75181a = i32;
                    amli4.f75185e = i22;
                    amli4.f75181a = i32 | 16;
                    amli4.f75186f = i23;
                }
                if (((Boolean) amgu.f74897a.mo41191a()).booleanValue()) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    amli amli5 = (amli) da4.f164949b;
                    int i33 = i24 - 1;
                    if (i24 != 0) {
                        amli5.f75187g = i33;
                        amli5.f75181a |= 32;
                    } else {
                        throw null;
                    }
                }
                almk2.mo40512a(3, null, str5, str, i, i2, 1, list, null, (amli) da4.mo74062i(), null, d2);
            }
        } else if (i6 != 9) {
            almk almk3 = this.f73687a;
            String str7 = this.f73688b;
            String str8 = this.f73689c;
            int i34 = this.f73707u;
            List list4 = this.f73690d;
            amig.m62939a();
            switch (i6 - 1) {
                case 2:
                    d = ((Double) amgx.f74900a.mo41191a()).doubleValue();
                    break;
                case 3:
                    d = Double.valueOf(cgbe.f186279a.mo6606a().mo83350ba()).doubleValue();
                    break;
                case 4:
                    d = Double.valueOf(cgbe.f186279a.mo6606a().mo83358bi()).doubleValue();
                    break;
                case 5:
                    d = Double.valueOf(cgbe.f186279a.mo6606a().mo83359bj()).doubleValue();
                    break;
                case 6:
                    d = Double.valueOf(cgbe.f186279a.mo6606a().mo83357bh()).doubleValue();
                    break;
                case 7:
                    d = Double.valueOf(cgbe.f186279a.mo6606a().mo83333bJ()).doubleValue();
                    break;
                case 8:
                default:
                    d = Double.valueOf(cgbe.f186279a.mo6606a().mo83319aw()).doubleValue();
                    break;
                case 9:
                    d = cfza.f186189a.mo6606a().mo83153a();
                    break;
            }
            almk3.mo40512a(i6, null, str7, str8, i, i2, i34, list4, null, null, null, d);
        } else {
            if (cfzx.m144057b()) {
                almk almk4 = this.f73687a;
                String str9 = this.f73688b;
                String str10 = this.f73689c;
                List list5 = this.f73690d;
                double b = cfzx.f186223a.mo6606a().mo83177b();
                ArrayList arrayList = this.f73710x;
                bxvd da6 = amlt.f75217b.mo74144da();
                if (!da6.f164950c) {
                    i3 = 0;
                } else {
                    da6.mo74035c();
                    i3 = 0;
                    da6.f164950c = false;
                }
                amlt amlt = (amlt) da6.f164949b;
                if (!amlt.f75219a.mo73666a()) {
                    amlt.f75219a = GeneratedMessageLite.m124019a(amlt.f75219a);
                }
                int size = arrayList.size();
                while (i3 < size) {
                    amlt.f75219a.mo74153d(((amls) arrayList.get(i3)).f75216e);
                    i3++;
                }
                almk4.mo40512a(9, null, str9, str10, i, i2, 1, list5, null, null, (amlt) da6.mo74062i(), b);
            }
        }
    }

    /* renamed from: a */
    public final void mo40508a(amls amls) {
        this.f73710x.add(amls);
    }

    /* renamed from: a */
    public final void mo40509a(amlv amlv) {
        if (this.f73690d == null) {
            this.f73690d = new ArrayList();
        }
        this.f73690d.add(amlv);
    }
}
