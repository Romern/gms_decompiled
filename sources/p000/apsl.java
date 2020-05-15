package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: apsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apsl extends aplq {

    /* renamed from: a */
    private final abrv f84823a;

    /* renamed from: b */
    private final acxl f84824b;

    /* renamed from: c */
    private final boolean f84825c;

    public apsl(abrv abrv, QueryCall$Request queryCall$Request, abyy abyy) {
        super(bqbd.QUERY, 1, 1, abrv.f58066b, queryCall$Request, abyy);
        int i;
        this.f84823a = abrv;
        bpzh bpzh = bpzh.QUERY;
        QuerySpecification querySpecification = queryCall$Request.f107482f;
        if (querySpecification != null) {
            i = querySpecification.f9619f;
        } else {
            i = 0;
        }
        acxl acxl = new acxl(bpzh, acky.m49364b(i));
        this.f84824b = acxl;
        acxl.mo33202a();
        this.f84825c = abrv.f58083s.mo32454b();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x056b, code lost:
        if (r4 != 3) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0902, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028e A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x028f A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a7 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a8 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02c2 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x032e A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032f A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0350 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0351 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0388 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04db A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04dc A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f8 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04f9 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x050b A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x050c A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x051f A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0520 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x053e A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0546 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05db A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0744 A[Catch:{ all -> 0x091e }, LOOP:10: B:265:0x0740->B:267:0x0744, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x075b A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0764 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x076a A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0773 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x077b A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0789 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x078f A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x07ae A[Catch:{ all -> 0x091e }, LOOP:11: B:292:0x07aa->B:294:0x07ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x07d7 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x07da A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x081c A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x081e A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0823 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0828 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x082f A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0832 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0837 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x083b A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0846 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0847 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x086f A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0870 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0889 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x07d3 A[EDGE_INSN: B:382:0x07d3->B:295:0x07d3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0244 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0245 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0264 A[Catch:{ all -> 0x091e }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0265 A[Catch:{ all -> 0x091e }] */
    /* renamed from: a */
    public static SearchResults m70904a(abrv abrv, QueryCall$Request queryCall$Request, abyy abyy, acxl acxl, boolean z) {
        QueryCall$Request queryCall$Request2;
        String str;
        abud abud;
        List list;
        abuh a;
        boolean z2;
        int size;
        QuerySpecification querySpecification;
        int i;
        abud abud2;
        boolean z3;
        int i2;
        int[] iArr;
        byte[] bArr;
        double[] dArr;
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4;
        Bundle[] bundleArr;
        QueryCall$Request queryCall$Request3;
        String[] strArr;
        int i5;
        boolean z4;
        QuerySpecification querySpecification2;
        boolean z5;
        String str2;
        int b;
        abrv abrv2;
        abud abud3;
        abtu abtu;
        boolean z6;
        String str3;
        Map map;
        STSortSpec sTSortSpec;
        String str4;
        bxvd da;
        int[] iArr2;
        abrv abrv3 = abrv;
        QueryCall$Request queryCall$Request4 = queryCall$Request;
        abyy abyy2 = abyy;
        int c = abrv3.f58077m.mo32504c();
        if ("com.google.android.googlequicksearchbox".equals(queryCall$Request4.f107478b) && queryCall$Request4.f107479c == null && abyy2 != null && "com.google.android.googlequicksearchbox".equals(abyy2.f58780f) && c < ((Integer) abzt.f58889ad.mo58455c()).intValue()) {
            queryCall$Request4 = new QueryCall$Request(queryCall$Request4.f107477a, null, queryCall$Request4.f107479c, queryCall$Request4.f107480d, queryCall$Request4.f107481e, queryCall$Request4.f107482f, queryCall$Request4.f107483g);
        }
        QuerySpecification querySpecification3 = queryCall$Request2.f107482f;
        if (querySpecification3 != null) {
            absg.m48185a("QuerySpecification: %s", querySpecification3);
        }
        String str5 = queryCall$Request2.f107477a;
        String str6 = queryCall$Request2.f107478b;
        String[] strArr2 = queryCall$Request2.f107479c;
        int i6 = queryCall$Request2.f107480d;
        int i7 = queryCall$Request2.f107481e;
        if (querySpecification3 == null) {
            str = "No query spec defined";
        } else {
            try {
                absd.m48180c("Query", str5, 1000);
                if (str6 == null && strArr2 != null) {
                    if (((Boolean) abzt.f58914bB.mo58455c()).booleanValue()) {
                        int length = strArr2.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                if (!abww.m48413a(strArr2[i8])) {
                                    break;
                                }
                                i8++;
                            } else {
                                break;
                            }
                        }
                    }
                    str = "Corpora specified but not package name";
                }
                if (strArr2 != null) {
                    if (!querySpecification3.f9620g) {
                        for (String str7 : strArr2) {
                            absd.m48174a("Corpus name", str7, 2048);
                        }
                    } else {
                        str = "Cannot restrict to corpora if requesting semantic section names";
                    }
                }
                if (i6 >= 0) {
                    if (i7 > 0) {
                        str = absd.m48168a(querySpecification3);
                    }
                }
                StringBuilder sb = new StringBuilder(51);
                sb.append("Bad start and num results: ");
                sb.append(i6);
                sb.append(", ");
                sb.append(i7);
                str = sb.toString();
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        if (str != null) {
            return fsh.m12246b(str);
        }
        acxl.mo33207b();
        absg.m48204d("Query from package: %s, component: %s, restrict package: %s, start: %d, num: %d maxNumSlices: %d", abyy2.f58780f, abyy2.f58781g, queryCall$Request2.f107478b, Integer.valueOf(queryCall$Request2.f107480d), Integer.valueOf(queryCall$Request2.f107481e), Integer.valueOf(querySpecification3.f9627n));
        absg.m48185a("Query: [%s]", queryCall$Request2.f107477a);
        absg.m48186a("Index docs: %d pls: %d", Integer.valueOf(abrv3.f58078n.mo43409e()), Integer.valueOf(abrv3.f58078n.mo43410f()));
        abzo a2 = abrv.mo32298a();
        acxl.mo33208c();
        synchronized (a2.mo32525a()) {
            try {
                acxl.mo33209d();
                abzn b2 = a2.mo32535b(abyy2, queryCall$Request2.f107479c, true, queryCall$Request2.f107478b);
                String a3 = apsm.m70910a(b2, abyy2, queryCall$Request2.f107479c, queryCall$Request2.f107478b);
                bnic<acak> bnic = b2.f58821a;
                if (a3 == null) {
                    SparseArray sparseArray = new SparseArray();
                    ArrayList<absr> arrayList = new ArrayList(bnic.size());
                    for (acak acak : bnic) {
                        absr d = a2.mo32543d(acak);
                        if (d != null) {
                            sparseArray.put(d.f58137b, d);
                            arrayList.add(d);
                        }
                    }
                    bxvd da2 = abud.f58349v.mo74144da();
                    abtv a4 = acky.m49357a();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    abud abud4 = (abud) da2.f164949b;
                    a4.getClass();
                    abud4.f58365o = a4;
                    int i9 = abud4.f58351a | 2048;
                    abud4.f58351a = i9;
                    boolean z7 = abyy2.f58779e;
                    abud4.f58351a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    abud4.f58362l = z7;
                    if (((Boolean) abzt.f58846N.mo58455c()).booleanValue() && (iArr2 = querySpecification3.f9623j) != null) {
                        da2.mo73953P(bqcn.m112586b(iArr2));
                    }
                    boolean z8 = querySpecification3.f9614a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    abud abud5 = (abud) da2.f164949b;
                    int i10 = abud5.f58351a | 2;
                    abud5.f58351a = i10;
                    abud5.f58356f = z8;
                    boolean z9 = querySpecification3.f9617d;
                    int i11 = i10 | 4096;
                    abud5.f58351a = i11;
                    abud5.f58366p = z9;
                    boolean z10 = querySpecification3.f9622i;
                    abud5.f58351a = i11 | 8192;
                    abud5.f58367q = z10;
                    if (!z9) {
                        if (z10) {
                            absg.m48201d("prefixMatchAllTokens has no effect when prefixMatch is false.");
                        }
                    }
                    if (!abyy2.f58776b) {
                        if (!cemq.m137368e()) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abud abud6 = (abud) da2.f164949b;
                            abud6.f58351a |= 32;
                            abud6.f58359i = 0;
                            abud abud7 = (abud) da2.f164949b;
                            int i12 = abud7.f58359i;
                            abud7.f58351a |= 4;
                            abud7.f58357g = i12;
                            int a5 = acky.m49354a(querySpecification3.f9619f);
                            if (!da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abud abud8 = (abud) da2.f164949b;
                            abud8.f58360j = a5 - 1;
                            abud8.f58351a |= 64;
                            int a6 = acky.m49355a(querySpecification3.f9621h, querySpecification3.f9619f);
                            if (!da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abud abud9 = (abud) da2.f164949b;
                            abud9.f58363m = a6 - 1;
                            abud9.f58351a |= 512;
                            if (!(querySpecification3.f9619f != 5 || (sTSortSpec = querySpecification3.f9625l) == null || (str4 = sTSortSpec.f9662a) == null)) {
                                da = abuz.f58503b.mo74144da();
                                if (!da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                str4.getClass();
                                ((abuz) da.f164949b).f58505a = str4;
                                abuz abuz = (abuz) da.mo74062i();
                                if (!da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                abud abud10 = (abud) da2.f164949b;
                                abuz.getClass();
                                abud10.f58369s = abuz;
                                abud10.f58351a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            }
                            if (acaw.m48793j()) {
                                int a7 = abty.m48268a(((abud) da2.f164949b).f58360j);
                                if (a7 != 0) {
                                    if (a7 == 2) {
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        abud abud11 = (abud) da2.f164949b;
                                        abud11.f58360j = 3;
                                        abud11.f58351a |= 64;
                                        bxvd da3 = abuz.f58503b.mo74144da();
                                        String str8 = (String) abzt.f58973ch.mo58455c();
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        str8.getClass();
                                        ((abuz) da3.f164949b).f58505a = str8;
                                        abuz abuz2 = (abuz) da3.mo74062i();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        abud abud12 = (abud) da2.f164949b;
                                        abuz2.getClass();
                                        abud12.f58369s = abuz2;
                                        abud12.f58351a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    }
                                }
                            }
                            int i13 = querySpecification3.f9627n;
                            if (!da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abud abud13 = (abud) da2.f164949b;
                            int i14 = abud13.f58351a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                            abud13.f58351a = i14;
                            abud13.f58371u = i13;
                            boolean z11 = querySpecification3.f9620g;
                            abud13.f58351a = i14 | 128;
                            abud13.f58361k = z11;
                            if (acaw.m48787d()) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                abud abud14 = (abud) da2.f164949b;
                                abud14.f58351a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                abud14.f58371u = Integer.MAX_VALUE;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            for (absr absr : arrayList) {
                                if (querySpecification3.f9620g) {
                                    map = abzm.m48655c(absr);
                                    if (!map.isEmpty()) {
                                    }
                                } else {
                                    map = abzm.m48654b(absr);
                                }
                                SparseArray sparseArray2 = sparseArray;
                                bxvd da4 = abtu.f58310g.mo74144da();
                                ArrayList arrayList6 = arrayList;
                                int i15 = absr.f58137b;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                abtu abtu2 = (abtu) da4.f164949b;
                                abtu2.f58312a |= 1;
                                abtu2.f58313b = i15;
                                int a8 = acxn.m49955a(absr.f58145j);
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Iterator it2 = it;
                                    abzi abzi = (abzi) entry.getValue();
                                    QueryCall$Request queryCall$Request5 = queryCall$Request2;
                                    bxvd da5 = abua.f58332d.mo74144da();
                                    String str9 = (String) entry.getKey();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    abua abua = (abua) da5.f164949b;
                                    str9.getClass();
                                    ArrayList arrayList7 = arrayList4;
                                    int i16 = abua.f58334a | 1;
                                    abua.f58334a = i16;
                                    abua.f58335b = str9;
                                    int i17 = abzi.f58806a;
                                    abua.f58334a = i16 | 2;
                                    abua.f58336c = i17;
                                    arrayList5.add((abua) da5.mo74062i());
                                    abuc a9 = acxn.m49956a(absr, abzi.f58806a, abzi.f58807b, a8, querySpecification3.f9620g);
                                    if (a9 != null) {
                                        arrayList3.add(a9);
                                        arrayList4 = arrayList7;
                                        it = it2;
                                        queryCall$Request2 = queryCall$Request5;
                                    } else {
                                        arrayList4 = arrayList7;
                                        it = it2;
                                        queryCall$Request2 = queryCall$Request5;
                                    }
                                }
                                QueryCall$Request queryCall$Request6 = queryCall$Request2;
                                ArrayList arrayList8 = arrayList4;
                                if (querySpecification3.f9616c != null) {
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Section section : querySpecification3.f9616c) {
                                        abzi abzi2 = (abzi) map.get(section.f9683a);
                                        if (abzi2 != null) {
                                            bxvd da6 = abub.f58337e.mo74144da();
                                            int i18 = abzi2.f58806a;
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            abub abub = (abub) da6.f164949b;
                                            int i19 = abub.f58339a | 1;
                                            abub.f58339a = i19;
                                            abub.f58340b = i18;
                                            boolean z12 = section.f9684b;
                                            int i20 = i19 | 2;
                                            abub.f58339a = i20;
                                            abub.f58341c = z12;
                                            int i21 = section.f9685c;
                                            abub.f58339a = i20 | 8;
                                            abub.f58342d = i21;
                                            arrayList9.add((abub) da6.mo74062i());
                                        }
                                    }
                                    da4.mo73955R(arrayList9);
                                }
                                arrayList2.add((abtu) da4.mo74062i());
                                arrayList = arrayList6;
                                sparseArray = sparseArray2;
                                arrayList4 = arrayList8;
                                queryCall$Request2 = queryCall$Request6;
                            }
                            QueryCall$Request queryCall$Request7 = queryCall$Request2;
                            SparseArray sparseArray3 = sparseArray;
                            ArrayList arrayList10 = arrayList4;
                            ArrayList arrayList11 = arrayList;
                            if (!da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abud abud15 = (abud) da2.f164949b;
                            abud15.mo32346a();
                            bxsy.m123078a(arrayList2, abud15.f58352b);
                            da2.mo73952O(arrayList3);
                            da2.mo73951N(arrayList5);
                            if (!da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            abud = (abud) da2.f164949b;
                            if (abud.f58370t.mo73666a()) {
                                abud.f58370t = GeneratedMessageLite.m124021a(abud.f58370t);
                            }
                            bxsy.m123078a(arrayList10, abud.f58370t);
                            list = querySpecification3.f9615b;
                            if (list == null) {
                                da2.mo73954Q(list);
                            }
                            acxl.mo33210e();
                            abrv abrv4 = abrv;
                            QueryCall$Request queryCall$Request8 = queryCall$Request7;
                            a = abrv4.f58078n.mo43394a(queryCall$Request8.f107477a, (abud) da2.mo74062i(), queryCall$Request8.f107480d, queryCall$Request8.f107481e);
                            if (a != null) {
                                SearchResults b3 = fsh.m12246b("Error parsing QueryResponse from native");
                                return b3;
                            }
                            acxl.mo33211f();
                            abtn abtn = a.f58400l;
                            if (abtn == null) {
                                abtn = abtn.f58271c;
                            }
                            acxl.mo33203a(abtn);
                            int b4 = bqay.m112493b(a.f58401m);
                            if (b4 != 0) {
                                if (b4 != 2) {
                                    int b5 = bqay.m112493b(a.f58401m);
                                    if (b5 == 0) {
                                    }
                                    int b6 = bqay.m112493b(a.f58401m);
                                    SearchResults searchResults = new SearchResults(fsh.m12244a(b6 != 0 ? b6 : 2));
                                    return searchResults;
                                }
                            }
                            if (querySpecification3.f9628o != null) {
                                if (abrv4.f58082r.mo32433a(abyy.f58780f, bngx.m109368a((Collection) arrayList11), querySpecification3.f9628o)) {
                                    z2 = true;
                                    abud abud16 = (abud) da2.mo74062i();
                                    boolean z13 = querySpecification3.f9620g;
                                    size = abud16.f58352b.size();
                                    Bundle[] bundleArr2 = new Bundle[size];
                                    Bundle[] bundleArr3 = new Bundle[size];
                                    Bundle[] bundleArr4 = new Bundle[size];
                                    Bundle[] bundleArr5 = new Bundle[size];
                                    SparseIntArray sparseIntArray = new SparseIntArray(size);
                                    String[] strArr3 = new String[size];
                                    int i22 = Build.VERSION.SDK_INT;
                                    Bundle bundle = new Bundle();
                                    querySpecification = querySpecification3;
                                    UserHandle[] userHandleArr = new UserHandle[size];
                                    QueryCall$Request queryCall$Request9 = queryCall$Request8;
                                    Arrays.fill(userHandleArr, 0, size, fsh.m12242a());
                                    bundle.putParcelableArray("USER_HANDLE_ARRAYS_KEY", userHandleArr);
                                    i = 0;
                                    boolean z14 = false;
                                    while (i < size) {
                                        abtu abtu3 = (abtu) abud16.f58352b.get(i);
                                        int i23 = size;
                                        sparseIntArray.put(abtu3.f58313b, i);
                                        Bundle bundle2 = bundle;
                                        absr absr2 = (absr) sparseArray3.get(abtu3.f58313b);
                                        sparseArray3 = sparseArray3;
                                        String str10 = absr2.f58140e;
                                        String str11 = absr2.f58138c;
                                        SparseIntArray sparseIntArray2 = sparseIntArray;
                                        abud abud17 = abud16;
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 1 + String.valueOf(str11).length());
                                        sb2.append(str10);
                                        sb2.append("-");
                                        sb2.append(str11);
                                        strArr3[i] = sb2.toString();
                                        bundleArr3[i] = new Bundle();
                                        bundleArr4[i] = new Bundle();
                                        abug abug = (abug) a.f58392d.get(i);
                                        boolean z15 = z14;
                                        int i24 = 0;
                                        while (i24 < abtu3.f58314c.size()) {
                                            abub abub2 = (abub) abtu3.f58314c.get(i24);
                                            boolean z16 = z15;
                                            abue abue = (abue) abug.f58385a.get(i24);
                                            if (z13) {
                                                z6 = z13;
                                                abtu = abtu3;
                                                str3 = Section.m6156a(absr2.f58152q, ((abqo) absr2.f58145j.get(abub2.f58340b)).f57988m);
                                            } else {
                                                z6 = z13;
                                                abtu = abtu3;
                                                str3 = ((abqo) absr2.f58145j.get(abub2.f58340b)).f57978b;
                                            }
                                            if (abue.f58374a.size() != 0) {
                                                bundleArr3[i].putIntArray(str3, bqcn.m112584a(abue.f58374a));
                                            }
                                            bundleArr4[i].putByteArray(str3, abue.f58375b.getKey());
                                            byte[] a10 = fsh.m12245a(abue);
                                            if (a10 == null) {
                                                z15 = z16;
                                            } else {
                                                Bundle bundle3 = bundleArr5[i];
                                                if (bundle3 == null) {
                                                    bundle3 = new Bundle();
                                                    bundleArr5[i] = bundle3;
                                                    z16 = true;
                                                }
                                                bundle3.putByteArray(str3, a10);
                                                z15 = z16;
                                            }
                                            i24++;
                                            z13 = z6;
                                            abtu3 = abtu;
                                        }
                                        boolean z17 = z15;
                                        boolean z18 = z13;
                                        bundleArr2[i] = new Bundle();
                                        int i25 = 0;
                                        while (true) {
                                            abud3 = abud17;
                                            if (i25 >= abud3.f58355e.size()) {
                                                break;
                                            }
                                            String str12 = (String) abud3.f58355e.get(i25);
                                            abuf abuf = (abuf) abug.f58386b.get(i25);
                                            int a11 = abuf.f58381a.mo73744a();
                                            boolean[] zArr = new boolean[a11];
                                            abug abug2 = abug;
                                            int i26 = 0;
                                            while (i26 < a11) {
                                                int i27 = a11;
                                                zArr[i26] = abuf.f58381a.mo73743a(i26) != 0;
                                                i26++;
                                                a11 = i27;
                                            }
                                            bundleArr2[i].putBooleanArray(str12, zArr);
                                            i25++;
                                            abud17 = abud3;
                                            abug = abug2;
                                        }
                                        i++;
                                        abud16 = abud3;
                                        size = i23;
                                        z14 = z17;
                                        z13 = z18;
                                        sparseIntArray = sparseIntArray2;
                                        bundle = bundle2;
                                    }
                                    abud2 = abud16;
                                    z3 = z14;
                                    Bundle bundle4 = bundle;
                                    SparseIntArray sparseIntArray3 = sparseIntArray;
                                    int[] iArr3 = new int[a.f58391c.size()];
                                    i2 = 0;
                                    while (i2 < a.f58390b) {
                                        iArr3[i2] = sparseIntArray3.get(a.f58391c.mo74151b(i2));
                                        i2++;
                                        sparseIntArray3 = sparseIntArray3;
                                    }
                                    if (!abud2.f58356f) {
                                        iArr = bqcn.m112584a(a.f58394f);
                                    } else {
                                        iArr = null;
                                    }
                                    byte[] k = !abud2.f58356f ? a.f58395g.getKey() : null;
                                    if ((a.f58389a & 16) == 0) {
                                        abui abui = a.f58396h;
                                        if (abui == null) {
                                            abui = abui.f58405a;
                                        }
                                        bArr = abui.serializeToBytes();
                                    } else {
                                        bArr = null;
                                    }
                                    if (a.f58390b > 0) {
                                        if (a.f58397i.size() == 0) {
                                            dArr = null;
                                            int i28 = a.f58390b;
                                            jArr = new long[i28];
                                            jArr2 = new long[i28];
                                            i3 = 0;
                                            while (true) {
                                                i4 = a.f58390b;
                                                if (i3 >= i4) {
                                                    break;
                                                }
                                                jArr[i3] = TimeUnit.SECONDS.toMillis((long) a.f58398j.mo74151b(i3));
                                                jArr2[i3] = TimeUnit.SECONDS.toMillis((long) a.f58399k.mo74151b(i3));
                                                i3++;
                                                jArr = jArr;
                                            }
                                            long[] jArr3 = jArr;
                                            if (!z3) {
                                                bundleArr = null;
                                            } else {
                                                bundleArr = bundleArr5;
                                            }
                                            SearchResults searchResults2 = new SearchResults(i4, iArr3, strArr3, iArr, k, bundleArr2, bundleArr3, bundleArr4, bArr, dArr, bundle4, a.f58393e, jArr3, jArr2, bundleArr, bqcn.m112584a(a.f58403o), a.f58404p.getKey(), z2);
                                            acxl acxl2 = acxl;
                                            acxl2.mo33206a(searchResults2.f9672i);
                                            queryCall$Request3 = queryCall$Request9;
                                            acxl2.f61023b = queryCall$Request3.f107481e;
                                            acxl2.f61024c = a.f58390b;
                                            acxl2.f61025d = a.f58393e;
                                            strArr = queryCall$Request3.f107479c;
                                            if (strArr != null) {
                                                i5 = strArr.length;
                                            } else {
                                                i5 = -1;
                                            }
                                            acxl2.f61026e = i5;
                                            if (querySpecification != null) {
                                                querySpecification2 = querySpecification;
                                                z4 = querySpecification2.f9617d;
                                            } else {
                                                querySpecification2 = querySpecification;
                                                z4 = true;
                                            }
                                            acxl2.f61027f = z4;
                                            if (querySpecification2 != null) {
                                                z5 = querySpecification2.f9622i;
                                            } else {
                                                z5 = true;
                                            }
                                            acxl2.f61028g = z5;
                                            if (querySpecification2 != null) {
                                                str2 = querySpecification2.f9626m;
                                            } else {
                                                str2 = null;
                                            }
                                            acxl2.f61029h = str2;
                                            b = bqay.m112493b(a.f58401m);
                                            if (b == 0) {
                                                b = 2;
                                            }
                                            acxl2.f61030i = b;
                                            absg.m48194b("Response numResults: %d, numScored %d, error message: '%s'", Integer.valueOf(a.f58390b), Integer.valueOf(a.f58393e), a.f58402n);
                                            if (m70905a(queryCall$Request3)) {
                                                if (z) {
                                                    acxl2.mo33205a(queryCall$Request3.f107477a, abyy.f58780f, abyy.f58781g, queryCall$Request3.f107483g);
                                                }
                                            }
                                            abrv2 = abrv;
                                            if (abrv2.f58090z.mo33199a()) {
                                                acxk acxk = abrv2.f58090z;
                                                bxvd da7 = abtr.f58296d.mo74144da();
                                                ByteString a12 = ByteString.m123261a(acxk.m49938a(queryCall$Request3));
                                                if (da7.f164950c) {
                                                    da7.mo74035c();
                                                    da7.f164950c = false;
                                                }
                                                abtr abtr = (abtr) da7.f164949b;
                                                a12.getClass();
                                                abtr.f58298a |= 1;
                                                abtr.f58299b = a12;
                                                ByteString a13 = ByteString.m123261a(acxk.m49938a(searchResults2));
                                                if (da7.f164950c) {
                                                    da7.mo74035c();
                                                    da7.f164950c = false;
                                                }
                                                abtr abtr2 = (abtr) da7.f164949b;
                                                a13.getClass();
                                                abtr2.f58298a |= 2;
                                                abtr2.f58300c = a13;
                                                bxvd da8 = abtt.f58306c.mo74144da();
                                                abtr abtr3 = (abtr) da7.mo74062i();
                                                if (da8.f164950c) {
                                                    da8.mo74035c();
                                                    da8.f164950c = false;
                                                }
                                                abtt abtt = (abtt) da8.f164949b;
                                                abtr3.getClass();
                                                abtt.f58309b = abtr3;
                                                abtt.f58308a = 2;
                                                acxk.mo33198a((abtt) da8.mo74062i());
                                            }
                                        }
                                    }
                                    dArr = bqci.m112569a(a.f58397i);
                                    int i282 = a.f58390b;
                                    jArr = new long[i282];
                                    jArr2 = new long[i282];
                                    i3 = 0;
                                    while (true) {
                                        i4 = a.f58390b;
                                        if (i3 >= i4) {
                                        }
                                        jArr[i3] = TimeUnit.SECONDS.toMillis((long) a.f58398j.mo74151b(i3));
                                        jArr2[i3] = TimeUnit.SECONDS.toMillis((long) a.f58399k.mo74151b(i3));
                                        i3++;
                                        jArr = jArr;
                                    }
                                    long[] jArr32 = jArr;
                                    if (!z3) {
                                    }
                                    SearchResults searchResults22 = new SearchResults(i4, iArr3, strArr3, iArr, k, bundleArr2, bundleArr3, bundleArr4, bArr, dArr, bundle4, a.f58393e, jArr32, jArr2, bundleArr, bqcn.m112584a(a.f58403o), a.f58404p.getKey(), z2);
                                    acxl acxl22 = acxl;
                                    acxl22.mo33206a(searchResults22.f9672i);
                                    queryCall$Request3 = queryCall$Request9;
                                    acxl22.f61023b = queryCall$Request3.f107481e;
                                    acxl22.f61024c = a.f58390b;
                                    acxl22.f61025d = a.f58393e;
                                    strArr = queryCall$Request3.f107479c;
                                    if (strArr != null) {
                                    }
                                    acxl22.f61026e = i5;
                                    if (querySpecification != null) {
                                    }
                                    acxl22.f61027f = z4;
                                    if (querySpecification2 != null) {
                                    }
                                    acxl22.f61028g = z5;
                                    if (querySpecification2 != null) {
                                    }
                                    acxl22.f61029h = str2;
                                    b = bqay.m112493b(a.f58401m);
                                    if (b == 0) {
                                    }
                                    acxl22.f61030i = b;
                                    absg.m48194b("Response numResults: %d, numScored %d, error message: '%s'", Integer.valueOf(a.f58390b), Integer.valueOf(a.f58393e), a.f58402n);
                                    if (m70905a(queryCall$Request3)) {
                                    }
                                    abrv2 = abrv;
                                    if (abrv2.f58090z.mo33199a()) {
                                    }
                                }
                            }
                            z2 = false;
                            abud abud162 = (abud) da2.mo74062i();
                            boolean z132 = querySpecification3.f9620g;
                            size = abud162.f58352b.size();
                            Bundle[] bundleArr22 = new Bundle[size];
                            Bundle[] bundleArr32 = new Bundle[size];
                            Bundle[] bundleArr42 = new Bundle[size];
                            Bundle[] bundleArr52 = new Bundle[size];
                            SparseIntArray sparseIntArray4 = new SparseIntArray(size);
                            String[] strArr32 = new String[size];
                            int i222 = Build.VERSION.SDK_INT;
                            Bundle bundle5 = new Bundle();
                            querySpecification = querySpecification3;
                            UserHandle[] userHandleArr2 = new UserHandle[size];
                            QueryCall$Request queryCall$Request92 = queryCall$Request8;
                            Arrays.fill(userHandleArr2, 0, size, fsh.m12242a());
                            bundle5.putParcelableArray("USER_HANDLE_ARRAYS_KEY", userHandleArr2);
                            i = 0;
                            boolean z142 = false;
                            while (i < size) {
                            }
                            abud2 = abud162;
                            z3 = z142;
                            Bundle bundle42 = bundle5;
                            SparseIntArray sparseIntArray32 = sparseIntArray4;
                            int[] iArr32 = new int[a.f58391c.size()];
                            i2 = 0;
                            while (i2 < a.f58390b) {
                            }
                            if (!abud2.f58356f) {
                            }
                            if (!abud2.f58356f) {
                            }
                            if ((a.f58389a & 16) == 0) {
                            }
                            if (a.f58390b > 0) {
                            }
                            dArr = bqci.m112569a(a.f58397i);
                            int i2822 = a.f58390b;
                            jArr = new long[i2822];
                            jArr2 = new long[i2822];
                            i3 = 0;
                            while (true) {
                                i4 = a.f58390b;
                                if (i3 >= i4) {
                                }
                                jArr[i3] = TimeUnit.SECONDS.toMillis((long) a.f58398j.mo74151b(i3));
                                jArr2[i3] = TimeUnit.SECONDS.toMillis((long) a.f58399k.mo74151b(i3));
                                i3++;
                                jArr = jArr;
                            }
                            long[] jArr322 = jArr;
                            if (!z3) {
                            }
                            SearchResults searchResults222 = new SearchResults(i4, iArr32, strArr32, iArr, k, bundleArr22, bundleArr32, bundleArr42, bArr, dArr, bundle42, a.f58393e, jArr322, jArr2, bundleArr, bqcn.m112584a(a.f58403o), a.f58404p.getKey(), z2);
                            acxl acxl222 = acxl;
                            acxl222.mo33206a(searchResults222.f9672i);
                            queryCall$Request3 = queryCall$Request92;
                            acxl222.f61023b = queryCall$Request3.f107481e;
                            acxl222.f61024c = a.f58390b;
                            acxl222.f61025d = a.f58393e;
                            strArr = queryCall$Request3.f107479c;
                            if (strArr != null) {
                            }
                            acxl222.f61026e = i5;
                            if (querySpecification != null) {
                            }
                            acxl222.f61027f = z4;
                            if (querySpecification2 != null) {
                            }
                            acxl222.f61028g = z5;
                            if (querySpecification2 != null) {
                            }
                            acxl222.f61029h = str2;
                            b = bqay.m112493b(a.f58401m);
                            if (b == 0) {
                            }
                            acxl222.f61030i = b;
                            absg.m48194b("Response numResults: %d, numScored %d, error message: '%s'", Integer.valueOf(a.f58390b), Integer.valueOf(a.f58393e), a.f58402n);
                            if (m70905a(queryCall$Request3)) {
                            }
                            abrv2 = abrv;
                            if (abrv2.f58090z.mo33199a()) {
                            }
                        }
                    }
                    int i29 = querySpecification3.f9618e;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    abud abud18 = (abud) da2.f164949b;
                    abud18.f58351a |= 32;
                    abud18.f58359i = i29;
                    abud abud72 = (abud) da2.f164949b;
                    int i122 = abud72.f58359i;
                    abud72.f58351a |= 4;
                    abud72.f58357g = i122;
                    int a52 = acky.m49354a(querySpecification3.f9619f);
                    if (!da2.f164950c) {
                    }
                    abud abud82 = (abud) da2.f164949b;
                    abud82.f58360j = a52 - 1;
                    abud82.f58351a |= 64;
                    int a62 = acky.m49355a(querySpecification3.f9621h, querySpecification3.f9619f);
                    if (!da2.f164950c) {
                    }
                    abud abud92 = (abud) da2.f164949b;
                    abud92.f58363m = a62 - 1;
                    abud92.f58351a |= 512;
                    da = abuz.f58503b.mo74144da();
                    if (!da.f164950c) {
                    }
                    str4.getClass();
                    ((abuz) da.f164949b).f58505a = str4;
                    abuz abuz3 = (abuz) da.mo74062i();
                    if (!da2.f164950c) {
                    }
                    abud abud102 = (abud) da2.f164949b;
                    abuz3.getClass();
                    abud102.f58369s = abuz3;
                    abud102.f58351a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    if (acaw.m48793j()) {
                    }
                    int i132 = querySpecification3.f9627n;
                    if (!da2.f164950c) {
                    }
                    abud abud132 = (abud) da2.f164949b;
                    int i142 = abud132.f58351a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    abud132.f58351a = i142;
                    abud132.f58371u = i132;
                    boolean z112 = querySpecification3.f9620g;
                    abud132.f58351a = i142 | 128;
                    abud132.f58361k = z112;
                    if (acaw.m48787d()) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    ArrayList arrayList32 = new ArrayList();
                    ArrayList arrayList42 = new ArrayList();
                    ArrayList arrayList52 = new ArrayList();
                    while (r18.hasNext()) {
                    }
                    QueryCall$Request queryCall$Request72 = queryCall$Request2;
                    SparseArray sparseArray32 = sparseArray;
                    ArrayList arrayList102 = arrayList42;
                    ArrayList arrayList112 = arrayList;
                    if (!da2.f164950c) {
                    }
                    abud abud152 = (abud) da2.f164949b;
                    abud152.mo32346a();
                    bxsy.m123078a(arrayList22, abud152.f58352b);
                    da2.mo73952O(arrayList32);
                    da2.mo73951N(arrayList52);
                    if (!da2.f164950c) {
                    }
                    abud = (abud) da2.f164949b;
                    if (abud.f58370t.mo73666a()) {
                    }
                    bxsy.m123078a(arrayList102, abud.f58370t);
                    list = querySpecification3.f9615b;
                    if (list == null) {
                    }
                    acxl.mo33210e();
                    abrv abrv42 = abrv;
                    QueryCall$Request queryCall$Request82 = queryCall$Request72;
                    a = abrv42.f58078n.mo43394a(queryCall$Request82.f107477a, (abud) da2.mo74062i(), queryCall$Request82.f107480d, queryCall$Request82.f107481e);
                    if (a != null) {
                    }
                } else {
                    absg.m48184a(a3.length() == 0 ? new String("Validating corpus keys failed with message: ") : "Validating corpus keys failed with message: ".concat(a3));
                    SearchResults b7 = fsh.m12246b(a3);
                    return b7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        String str;
        String[] strArr = ((QueryCall$Request) this.f84708n).f107479c;
        if (strArr != null) {
            str = TextUtils.join(",", strArr);
        } else {
            str = "";
        }
        return String.format("%s, query[%s], corpora[%s]", super.mo33000f(), ((QueryCall$Request) this.f84708n).f107477a, str);
    }

    /* renamed from: a */
    private static boolean m70905a(QueryCall$Request queryCall$Request) {
        return queryCall$Request.f107483g != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        acry acry;
        QuerySpecification querySpecification = ((QueryCall$Request) this.f84708n).f107482f;
        if (!(!celx.m137222b() || (acry = this.f60440k) == null || querySpecification == null)) {
            acry.mo33050a(querySpecification.f9624k);
        }
        QueryCall$Response queryCall$Response = new QueryCall$Response();
        SearchResults a = m70904a(this.f84823a, (QueryCall$Request) this.f84708n, this.f84709o, this.f84824b, this.f84825c);
        queryCall$Response.f107484a = a.mo7231a() ? new Status(8, a.f9664a, null) : Status.f30107a;
        queryCall$Response.f107485b = a;
        queryCall$Response.f107486c = ((QueryCall$Request) this.f84708n).f107483g;
        return queryCall$Response;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        QueryCall$Response queryCall$Response = new QueryCall$Response();
        queryCall$Response.f107484a = status;
        return queryCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47406a(Exception exc) {
        abrv abrv = this.f84823a;
        QueryCall$Request queryCall$Request = (QueryCall$Request) this.f84708n;
        abyy abyy = this.f84709o;
        acxl acxl = this.f84824b;
        if (this.f84825c) {
            boolean a = m70905a(queryCall$Request);
            acxl.mo33204a(exc);
            boolean z = false;
            if (a && exc != null) {
                z = true;
            }
            if (!a || z) {
                bpxd a2 = acxl.mo33201a(queryCall$Request.f107477a, abyy.f58780f, abyy.f58781g);
                if (((Boolean) abzt.f58993m.mo58455c()).booleanValue()) {
                    abrv.f58067c.mo32995d(new apsk(bqbd.LOG_QUERY_STATS, abyy.f58780f, acrz.m49787b(abrv.f58066b), abrv, a2));
                } else {
                    abrv.f58083s.mo32441a(a2);
                }
            }
        }
    }
}
