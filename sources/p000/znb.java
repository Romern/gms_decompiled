package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Device;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: znb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class znb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DataReadRequest f55523a;

    /* renamed from: b */
    final /* synthetic */ String f55524b;

    /* renamed from: c */
    final /* synthetic */ zne f55525c;

    /* renamed from: d */
    final /* synthetic */ zax f55526d;

    /* renamed from: e */
    final /* synthetic */ bxvd f55527e;

    /* renamed from: f */
    final /* synthetic */ bxvd f55528f;

    public znb(zne zne, DataReadRequest dataReadRequest, String str, bxvd bxvd, bxvd bxvd2, zax zax) {
        this.f55525c = zne;
        this.f55523a = dataReadRequest;
        this.f55524b = str;
        this.f55527e = bxvd;
        this.f55528f = bxvd2;
        this.f55526d = zax;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:18:0x0082 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:114:0x0349 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:120:0x035d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:24:0x00b4 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: yfk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: yfj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: yfh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: yfg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: yfk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: yec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v56, resolved type: int} */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean], assign insn: 0x007a: IGET  (r6v10 ? I:boolean) = (r4v2 com.google.android.gms.fitness.request.DataReadRequest) com.google.android.gms.fitness.request.DataReadRequest.l boolean */
    /* JADX WARN: Type inference failed for: r6v11, assign insn: PHI: (r6v11 ?) = (r6v10 ?), (r6v16 ?), (r6v19 ?), (r6v29 ?) binds: [B:18:0x0082, B:114:0x0349, B:120:0x035d, B:24:0x00b4] */
    /* JADX WARN: Type inference failed for: r6v12, assign insn: PHI: (r6v12 ?) = (r6v10 ?), (r6v16 ?), (r6v19 ?), (r6v29 ?) binds: [B:18:0x0082, B:114:0x0349, B:120:0x035d, B:24:0x00b4] */
    /* JADX WARN: Type inference failed for: r6v16, assign insn: PHI: (r6v16 ?) = (r6v49 ?), (r6v51 ?) binds: [B:113:0x0348, B:97:0x02b1] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean], assign insn: PHI: (r1v10 ?) = (r1v18 ?), (r1v29 ?) binds: [B:113:0x0348, B:97:0x02b1] */
    /* JADX WARN: Type inference failed for: r6v19, types: [znb], assign insn: 0x035b: MOVE  (r6v19 ? I:?[OBJECT, ARRAY]) = (r27v0 'this' znb A[THIS]) */
    /* JADX WARN: Type inference failed for: r1v18, assign insn: 0x030c: CONST  (r1v18 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v29, types: [caae], assign insn: 0x008e: INVOKE  (r6v29 ? I:caae) = (r6v28 com.google.android.gms.fitness.data.DataSource) type: STATIC call: yvx.a(com.google.android.gms.fitness.data.DataSource):caae */
    /* JADX WARN: Type inference failed for: r6v30, assign insn: PHI: (r6v30 ?) = (r6v29 ?), (r6v53 ?) binds: [B:41:0x0137, B:76:0x021d] */
    /* JADX WARN: Type inference failed for: r1v29, assign insn: 0x02c0: CONST  (r1v29 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v36, assign insn: PHI: (r6v36 ?) = (r6v29 ?), (r6v29 ?), (r6v29 ?), (r6v29 ?), (r6v29 ?), (r6v54 ?) binds: [B:57:0x018f, B:56:0x017e, B:55:0x016e, B:54:0x015e, B:53:0x0155, B:75:0x0218] */
    /* JADX WARN: Type inference failed for: r6v49, assign insn: ?: MOVE  (r6v49 ?) = (r6v22 com.google.android.gms.common.api.Status) */
    /* JADX WARN: Type inference failed for: r6v51, assign insn: ?: MOVE  (r6v51 ?) = (r6v31 boolean) */
    /* JADX WARN: Type inference failed for: r6v53, assign insn: ?: MOVE  (r6v53 ?) = (r6v36 ?) */
    /* JADX WARN: Type inference failed for: r6v54, assign insn: ?: MOVE  (r6v54 ?) = (r6v37 java.lang.String) */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04ef, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04f4, code lost:
        r6 = r1;
        r26 = "Read data failed.";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04f3 A[ExcHandler: ytw (e ytw), Splitter:B:1:0x0004] */
    public final void run() {
        znb znb;
        String str;
        IOException iOException;
        String str2;
        znb znb2;
        znb znb3;
        char c;
        int i;
        DataReadResult dataReadResult;
        ? r1;
        Application application;
        znm znm;
        cadl a;
        bngx a2;
        bngx a3;
        bngx a4;
        bngx a5;
        long a6;
        long j;
        yec yec;
        List list;
        Collection<cadj> collection;
        Session session;
        boolean hasNext;
        yfe yfe;
        long j2;
        int i2;
        bngx bngx;
        int i3;
        try {
            znj znj = this.f55525c.f55537g;
            DataReadRequest dataReadRequest = this.f55523a;
            String str3 = this.f55524b;
            znj.mo31273a(str3, znj.mo31271a(yvx.m44924a(dataReadRequest.f32216b), ywb.m44928a(dataReadRequest.f32215a), str3));
            znj.mo31273a(str3, znj.mo31271a(yvx.m44924a(dataReadRequest.f32220f), ywb.m44928a(dataReadRequest.f32219e), str3));
            if (dataReadRequest.f32221g == 1) {
                long a7 = dataReadRequest.mo19008a(TimeUnit.NANOSECONDS);
                long b = dataReadRequest.mo19009b(TimeUnit.NANOSECONDS);
                long c2 = dataReadRequest.mo19010c(TimeUnit.NANOSECONDS);
                if (c2 > 0) {
                    if ((b - a7) / c2 > cdyu.m135390h()) {
                        throw new ytw(5022, String.format("Cannot bucket into more than %s intervals.", Long.valueOf(cdyu.m135390h())));
                    }
                }
            }
            ygb a8 = ygc.m44027a(str3);
            ? r6 = dataReadRequest.f32226l;
            a8.f53748b = r6;
            ygc a9 = a8.mo30460a();
            try {
                int i4 = dataReadRequest.f32221g;
                if (i4 != 0) {
                    try {
                        znm = znj.f55556f;
                        a = cadl.m126501a(i4);
                        r6 = yvx.m44925a(dataReadRequest.f32223i);
                        a2 = yvx.m44924a(dataReadRequest.f32216b);
                        a3 = ywb.m44928a(dataReadRequest.f32215a);
                        a4 = yvx.m44924a(dataReadRequest.f32220f);
                        a5 = ywb.m44928a(dataReadRequest.f32219e);
                        a6 = dataReadRequest.mo19008a(TimeUnit.NANOSECONDS);
                        str2 = "Read data failed.";
                    } catch (znl e) {
                        throw new ytw(5012, "One of the requested data types cannot be aggregated");
                    } catch (IOException e2) {
                        e = e2;
                        znb = this;
                        iOException = e;
                        str = "Read data failed.";
                        bnsl bnsl = (bnsl) zne.f55533d.mo68387b();
                        bnsl.mo68437a(iOException);
                        bnsl.mo68405a(str);
                        zax zax = znb.f55526d;
                        Status status = new Status(5008);
                        DataReadRequest dataReadRequest2 = znb.f55523a;
                        zne.m45785a(zax, DataReadResult.m23714a(status, dataReadRequest2.f32215a, dataReadRequest2.f32216b));
                    } catch (ytw e3) {
                        e = e3;
                        str2 = "Read data failed.";
                        znb2 = this;
                        bnsl bnsl2 = (bnsl) zne.f55533d.mo68387b();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68405a(str2);
                        Status status2 = new Status(e.f54623a, e.f54624b);
                        zax zax2 = znb2.f55526d;
                        DataReadRequest dataReadRequest3 = znb2.f55523a;
                        zne.m45785a(zax2, DataReadResult.m23714a(status2, dataReadRequest3.f32215a, dataReadRequest3.f32216b));
                    }
                    try {
                        long b2 = dataReadRequest.mo19009b(TimeUnit.NANOSECONDS);
                        long c3 = dataReadRequest.mo19010c(TimeUnit.NANOSECONDS);
                        bngs b3 = bngx.m109371b(dataReadRequest.f32227m.size());
                        int i5 = 0;
                        while (true) {
                            j = c3;
                            if (i5 >= dataReadRequest.f32227m.size()) {
                                break;
                            }
                            b3.mo67668c(yfv.m44005a(((Long) dataReadRequest.f32227m.get(i5)).longValue(), ((Long) dataReadRequest.f32228n.get(i5)).longValue()));
                            i5++;
                            c3 = j;
                            a6 = a6;
                        }
                        long j3 = a6;
                        bngx a10 = b3.mo67664a();
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        bmxy.m108588a(a != cadl.UNKNOWN_BUCKET);
                        List a11 = znm.mo31275a(a2, a3, str3);
                        List a12 = znm.mo31275a(a4, a5, str3);
                        if (znm.m45808a(a12)) {
                            if (!a12.isEmpty()) {
                                yec = znm.f55562b;
                                list = a12;
                            } else {
                                list = a11;
                                yec = ydw.f53677a;
                            }
                            if (list.isEmpty()) {
                                collection = bngx.m109376e();
                            } else {
                                int ordinal = a.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        yga yga = znm.f55561a;
                                        long j4 = b2 - j3;
                                        if (j3 < 0) {
                                            j2 = b2;
                                        } else if (b2 < j3 || j <= 0) {
                                            j2 = b2;
                                        } else {
                                            if (j4 % j != 0) {
                                                i3 = 1;
                                            } else {
                                                i3 = 0;
                                            }
                                            int i6 = ((int) (j4 / j)) + i3;
                                            bngs b4 = bngx.m109371b(i6);
                                            int i7 = 0;
                                            while (i7 < i6) {
                                                long j5 = j3 + (((long) i7) * j);
                                                b4.mo67668c(yfv.m44005a(j5, Math.min(j5 + j, b2)));
                                                b2 = b2;
                                                i7++;
                                            }
                                            j2 = b2;
                                            bngx = b4.mo67664a();
                                            i2 = i7;
                                            yfe = new yfk(yga, bngx);
                                            r6 = i2;
                                        }
                                        String str4 = "DataSplitter";
                                        ypq.m44538a(str4, Level.WARNING, "Invalid values specified: start time: %d, end time: %d, interval duration: %d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j));
                                        bngx = bngx.m109376e();
                                        i2 = str4;
                                        yfe = new yfk(yga, bngx);
                                        r6 = i2;
                                    } else if (ordinal == 2) {
                                        j2 = b2;
                                        yfe = new yfj(znm.f55561a);
                                    } else if (ordinal == 3) {
                                        j2 = b2;
                                        yfe = new yfh(znm.f55561a, r6);
                                    } else if (ordinal == 4) {
                                        j2 = b2;
                                        yfe = new yfg(znm.f55561a, r6);
                                    } else if (ordinal != 5) {
                                        j2 = b2;
                                        yfe = null;
                                    } else {
                                        j2 = b2;
                                        yfe = new yfk(znm.f55561a, a10);
                                    }
                                    bmzs.m108696a(yfe);
                                    collection = yfe.mo30405a(timeUnit.toMillis(j3), timeUnit.toMillis(j2), timeUnit.toMillis(j), list, a9, yec);
                                    r6 = r6;
                                } else {
                                    throw new IllegalArgumentException("Cannot bucket by UNKNOWN.");
                                }
                            }
                            bngs b5 = bngx.m109371b(collection.size());
                            boolean z = r6;
                            for (cadj cadj : collection) {
                                ywl a13 = Bucket.m23663a();
                                a13.mo30794a(cadj.f172683b, cadj.f172684c, TimeUnit.MILLISECONDS);
                                if ((cadj.f172682a & 8) != 0) {
                                    cadz cadz = cadj.f172685d;
                                    if (cadz == null) {
                                        cadz = cadz.f172773j;
                                    }
                                    session = ywf.m44942a(cadz);
                                } else {
                                    session = null;
                                }
                                a13.f54703a = session;
                                a13.f54704b = cadj.f172686e;
                                cadl a14 = cadl.m126501a(cadj.f172688g);
                                if (a14 == null) {
                                    a14 = cadl.UNKNOWN_BUCKET;
                                }
                                a13.f54705c = a14.f172698g;
                                Iterator it = cadj.f172687f.iterator();
                                while (true) {
                                    hasNext = it.hasNext();
                                    if (!hasNext) {
                                        break;
                                    }
                                    a13.mo30795a(ywe.m44939a((cadp) it.next(), str3));
                                }
                                a13.f54706d = cadj.f172689h;
                                b5.mo67668c(a13.mo30793a());
                                z = hasNext;
                            }
                            dataReadResult = new DataReadResult(bngx.m109376e(), b5.mo67664a(), znj.f55552b);
                            r1 = 0;
                            i = 2;
                            c = 1;
                            r6 = z;
                        } else {
                            throw new znl();
                        }
                    } catch (znl e4) {
                        throw new ytw(5012, "One of the requested data types cannot be aggregated");
                    }
                } else {
                    str2 = "Read data failed.";
                    znm znm2 = znj.f55556f;
                    cadl cadl = cadl.UNKNOWN_BUCKET;
                    bngx a15 = yvx.m44924a(dataReadRequest.f32216b);
                    bngx a16 = ywb.m44928a(dataReadRequest.f32215a);
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    long a17 = dataReadRequest.mo19008a(TimeUnit.NANOSECONDS);
                    long b6 = dataReadRequest.mo19009b(TimeUnit.NANOSECONDS);
                    int i8 = dataReadRequest.f32224j;
                    i = 2;
                    r1 = 0;
                    String str5 = str3;
                    c = 1;
                    List<cadp> a18 = znm2.mo31274a(str3, cadl, a15, a16, a9, timeUnit2, a17, b6, i8);
                    bngs b7 = bngx.m109371b(a18.size());
                    for (cadp cadp : a18) {
                        b7.mo67668c(ywe.m44939a(cadp, str5));
                    }
                    bngx a19 = b7.mo67664a();
                    bngx e5 = bngx.m109376e();
                    Status status3 = znj.f55552b;
                    dataReadResult = new DataReadResult(a19, e5, status3);
                    r6 = status3;
                }
            } catch (znl e6) {
                throw new ytw(5012, "One of the requested data types cannot be aggregated");
            }
            try {
                for (DataSet dataSet : dataReadResult.f32329a) {
                    r6 = this;
                    try {
                        zmw zmw = r6.f55525c.f55539i;
                        DataSource dataSource = dataSet.f31999b;
                        String str6 = r6.f55524b;
                        if (!zmw.f55504b.contains(str6) && (application = dataSource.f32008d) != null) {
                            if ("com.google.android.gms".equals(application.f31980b)) {
                                Object[] objArr = new Object[i];
                                objArr[r1] = dataSource;
                                objArr[c] = str6;
                                String format = String.format("%s:%s", objArr);
                                if (zmw.f55509g.mo20505a() - zmw.f55508f.getLong(format, 0) >= zmw.f55503a) {
                                    zmw.f55508f.edit().putLong(format, zmw.f55509g.mo20505a()).apply();
                                    ytq a20 = zmw.f55507e.mo30767a(zmw.f55505c);
                                    a20.mo30762a(zmw.f55506d);
                                    a20.mo30755a(416);
                                    bxvd da = bpfw.f137450h.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = r1;
                                    }
                                    bpfw bpfw = (bpfw) da.f164949b;
                                    str6.getClass();
                                    bpfw.f137452a |= 1;
                                    bpfw.f137453b = str6;
                                    bzzv a21 = bzzk.m126356a(dataSource.f32005a.f32064a);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = r1;
                                    }
                                    bpfw bpfw2 = (bpfw) da.f164949b;
                                    bpfw2.f137455d = a21.f172235aH;
                                    int i9 = bpfw2.f137452a | 4;
                                    bpfw2.f137452a = i9;
                                    String str7 = dataSource.f32009e;
                                    str7.getClass();
                                    int i10 = i9 | 2;
                                    bpfw2.f137452a = i10;
                                    bpfw2.f137454c = str7;
                                    Device device = dataSource.f32007c;
                                    if (device != null) {
                                        String str8 = device.f32074b;
                                        str8.getClass();
                                        int i11 = i10 | 16;
                                        bpfw2.f137452a = i11;
                                        bpfw2.f137457f = str8;
                                        String str9 = device.f32073a;
                                        str9.getClass();
                                        int i12 = i11 | 32;
                                        bpfw2.f137452a = i12;
                                        bpfw2.f137458g = str9;
                                        int i13 = device.f32076d;
                                        bpfw2.f137452a = i12 | 8;
                                        bpfw2.f137456e = i13;
                                    }
                                    a20.mo30757a((bpfw) da.mo74062i());
                                    a20.mo30754a();
                                }
                            }
                        }
                    } catch (IOException e7) {
                        e = e7;
                        znb3 = r6;
                        iOException = e;
                        str = str2;
                        znb = znb3;
                        bnsl bnsl3 = (bnsl) zne.f55533d.mo68387b();
                        bnsl3.mo68437a(iOException);
                        bnsl3.mo68405a(str);
                        zax zax3 = znb.f55526d;
                        Status status4 = new Status(5008);
                        DataReadRequest dataReadRequest22 = znb.f55523a;
                        zne.m45785a(zax3, DataReadResult.m23714a(status4, dataReadRequest22.f32215a, dataReadRequest22.f32216b));
                    } catch (ytw e8) {
                        e = e8;
                        znb2 = r6;
                        bnsl bnsl22 = (bnsl) zne.f55533d.mo68387b();
                        bnsl22.mo68437a(e);
                        bnsl22.mo68405a(str2);
                        Status status22 = new Status(e.f54623a, e.f54624b);
                        zax zax22 = znb2.f55526d;
                        DataReadRequest dataReadRequest32 = znb2.f55523a;
                        zne.m45785a(zax22, DataReadResult.m23714a(status22, dataReadRequest32.f32215a, dataReadRequest32.f32216b));
                    }
                }
                bxvd bxvd = this.f55527e;
                int i14 = dataReadResult.f32330b.f30115i;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = r1;
                }
                bpgr bpgr = (bpgr) bxvd.f164949b;
                bpgr bpgr2 = bpgr.f137526x;
                bpgr.f137528a = i | bpgr.f137528a;
                bpgr.f137530c = i14;
                bxvd bxvd2 = this.f55528f;
                HashSet<bzzv> hashSet = new HashSet();
                for (DataSet dataSet2 : dataReadResult.f32329a) {
                    hashSet.add(bzzk.m126356a(dataSet2.mo18901a().f32064a));
                }
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = r1;
                }
                bpgf bpgf = (bpgf) bxvd2.f164949b;
                bpgf bpgf2 = bpgf.f137483c;
                if (!bpgf.f137486b.mo73666a()) {
                    bpgf.f137486b = bxvk.m124019a(bpgf.f137486b);
                }
                for (bzzv bzzv : hashSet) {
                    bpgf.f137486b.mo74153d(bzzv.f172235aH);
                }
                zne.m45785a(this.f55526d, dataReadResult);
            } catch (IOException e9) {
                e = e9;
                znb3 = this;
                iOException = e;
                str = str2;
                znb = znb3;
                bnsl bnsl32 = (bnsl) zne.f55533d.mo68387b();
                bnsl32.mo68437a(iOException);
                bnsl32.mo68405a(str);
                zax zax32 = znb.f55526d;
                Status status42 = new Status(5008);
                DataReadRequest dataReadRequest222 = znb.f55523a;
                zne.m45785a(zax32, DataReadResult.m23714a(status42, dataReadRequest222.f32215a, dataReadRequest222.f32216b));
            } catch (ytw e10) {
                e = e10;
                znb2 = this;
                bnsl bnsl222 = (bnsl) zne.f55533d.mo68387b();
                bnsl222.mo68437a(e);
                bnsl222.mo68405a(str2);
                Status status222 = new Status(e.f54623a, e.f54624b);
                zax zax222 = znb2.f55526d;
                DataReadRequest dataReadRequest322 = znb2.f55523a;
                zne.m45785a(zax222, DataReadResult.m23714a(status222, dataReadRequest322.f32215a, dataReadRequest322.f32216b));
            }
        } catch (IOException e11) {
            znb = this;
            str = "Read data failed.";
            iOException = e11;
            bnsl bnsl322 = (bnsl) zne.f55533d.mo68387b();
            bnsl322.mo68437a(iOException);
            bnsl322.mo68405a(str);
            zax zax322 = znb.f55526d;
            Status status422 = new Status(5008);
            DataReadRequest dataReadRequest2222 = znb.f55523a;
            zne.m45785a(zax322, DataReadResult.m23714a(status422, dataReadRequest2222.f32215a, dataReadRequest2222.f32216b));
        } catch (ytw e12) {
        }
    }
}
