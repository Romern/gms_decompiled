package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: abva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abva extends acpn {

    /* renamed from: a */
    private final abrv f58506a;

    /* renamed from: b */
    private final boolean f58507b;

    /* renamed from: c */
    private boolean f58508c;

    /* renamed from: d */
    private final Map f58509d = new HashMap();

    public abva(abrv abrv, boolean z, boolean z2) {
        super(bqbd.SLURP_USAGE_REPORTS, 2);
        this.f58506a = abrv;
        this.f58507b = z;
        this.f58508c = z2;
    }

    /* renamed from: a */
    private final acxd m48303a(absr absr) {
        acak acak = new acak(absr.f58140e, absr.f58138c);
        acxd acxd = (acxd) this.f58509d.get(acak);
        if (acxd != null) {
            return acxd;
        }
        acxd acxd2 = new acxd();
        this.f58509d.put(acak, acxd2);
        return acxd2;
    }

    /* renamed from: a */
    private final void m48304a(Exception exc) {
        this.f58506a.mo32331n().mo32456a("SlurpUsageReportsTask uploadUserActions", exc, cema.m137239f());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:40:0x00f9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:355:0x0070 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:362:0x0070 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:244:0x04fa */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:91:0x0215 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:43:0x0101 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:48:0x0110 */
    /* JADX WARN: Type inference failed for: r19v4, assign insn: PHI: (r19v4 ?) = (r19v21 bdwt), (r19v7 ?) binds: [B:19:0x006e, B:355:0x0070] */
    /* JADX WARN: Type inference failed for: r19v7, assign insn: PHI: (r19v7 ?) = (r19v8 ?), (r19v8 ?), (r19v8 ?), (r19v8 ?), (r19v9 ?), (r19v18 ?) binds: [B:362:0x0070, B:361:0x0070, B:360:0x0070, B:359:0x0070, B:363:0x0070, B:358:0x0070] */
    /* JADX WARN: Type inference failed for: r19v8, assign insn: PHI: (r19v8 ?) = (r19v12 ?), (r19v12 ?), (r19v20 ?) binds: [B:110:0x026d, B:368:0x039c, B:26:0x0086] */
    /* JADX WARN: Type inference failed for: r19v9, assign insn: PHI: (r19v9 ?) = (r19v10 ?), (r19v11 ?) binds: [B:242:0x04f1, B:240:0x04e6] */
    /* JADX WARN: Type inference failed for: r19v10, assign insn: 0x04f3: MOVE  (r19v10 ? I:?[OBJECT, ARRAY]) = (r10v13 acwo) */
    /* JADX WARN: Type inference failed for: r19v11, assign insn: 0x04da: MOVE  (r19v11 ? I:?[OBJECT, ARRAY]) = (r10v13 acwo) */
    /* JADX WARN: Type inference failed for: r19v12, assign insn: PHI: (r19v12 ?) = (r19v13 ?), (r19v18 ?), (r19v18 ?), (r19v19 ?) binds: [B:84:0x01e0, B:78:0x01ce, B:74:0x01ab, B:37:0x00ea] */
    /* JADX WARN: Type inference failed for: r19v13, assign insn: 0x01e4: MOVE  (r19v13 ? I:?[OBJECT, ARRAY]) = (r10v13 acwo) */
    /* JADX WARN: Type inference failed for: r19v14, assign insn: PHI: (r19v14 ?) = (r19v18 ?), (r19v23 ?), (r19v24 ?) binds: [B:77:0x01ca, B:234:0x04d3, B:83:0x01dd] */
    /* JADX WARN: Type inference failed for: r19v15, assign insn: PHI: (r19v15 ?) = (r19v4 ?), (r19v18 ?), (r19v18 ?), (r19v18 ?) binds: [B:40:0x00f9, B:43:0x0101, B:48:0x0110, B:54:0x011d] */
    /* JADX WARN: Type inference failed for: r19v16, assign insn: PHI: (r19v16 ?) = (r19v17 acwo), (r19v18 ?) binds: [B:82:0x01d9, B:80:0x01d5] */
    /* JADX WARN: Type inference failed for: r19v18, assign insn: 0x00ff: MOVE  (r19v18 ? I:?[OBJECT, ARRAY]) = (r10v13 acwo) */
    /* JADX WARN: Type inference failed for: r10v33, assign insn: 0x010d: MOVE  (r10v33 ? I:?[OBJECT, ARRAY]) = (r4v39 acsx) */
    /* JADX WARN: Type inference failed for: r19v19, assign insn: 0x00ee: MOVE  (r19v19 ? I:?[OBJECT, ARRAY]) = (r10v13 acwo) */
    /* JADX WARN: Type inference failed for: r10v35, assign insn: 0x00f0: MOVE  (r10v35 ? I:?[OBJECT, ARRAY]) = (r4v39 acsx) */
    /* JADX WARN: Type inference failed for: r19v20, assign insn: 0x0097: MOVE  (r19v20 ? I:?[OBJECT, ARRAY]) = (r10v13 acwo) */
    /* JADX WARN: Type inference failed for: r19v23, assign insn: ?: MOVE  (r19v23 ?) = (r19v15 ?) */
    /* JADX WARN: Type inference failed for: r10v40, assign insn: ?: MOVE  (r10v40 ?) = (r10v29 acwo) */
    /* JADX WARN: Type inference failed for: r19v24, assign insn: ?: MOVE  (r19v24 ?) = (r19v16 ?) */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0553, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0561, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:258:0x0537, B:274:0x055d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x056f A[SYNTHETIC, Splitter:B:285:0x056f] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0725  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abzm abzm;
        abva abva;
        abym abym;
        bxvd da;
        long t;
        abzm abzm2;
        acsx acsx;
        acsx acsx2;
        acwo acwo;
        acsx acsx3;
        boolean z;
        String str;
        int c;
        abzm abzm3;
        acxq acxq;
        List<absr> list;
        String str2;
        abva abva2 = this;
        if (!abva2.f58506a.f58078n.mo43414i()) {
            absg.m48205e("Failed to apply pending usage report deletions in slurp task. Continuing anyway.");
        }
        abzm b = abva2.f58506a.mo32314b();
        abpi abpi = new abpi();
        boolean z2 = false;
        try {
            if (cenc.m137460e()) {
                try {
                    abrv abrv = abva2.f58506a;
                    Context context = abrv.f58066b;
                    abyx abyx = abrv.f58077m;
                    acao acao = abrv.f58085u;
                    acrl acrl = abrv.f58071g;
                    abzo a = abrv.mo32298a();
                    abrv abrv2 = abva2.f58506a;
                    NativeIndex nativeIndex = abrv2.f58078n;
                    abym abym2 = abrv2.f58083s;
                    acwo = abrv2.f58086v;
                    acsx = acss.m49816a(context, abyx, acao, acrl, a, abrv2, nativeIndex, abym2, acwo);
                } catch (acsr e) {
                    absg.m48205e("No valid account for uploading user actions");
                    acsx = null;
                }
            } else {
                acsx = null;
            }
            try {
                acwo a2 = abva2.f58506a.f58076l.mo33220a();
                abrv abrv3 = abva2.f58506a;
                acwo acxf = new acxf(a2, acwn.m49907a(abrv3.f58066b, abrv3.mo32314b(), abva2.f58506a.f58083s));
                try {
                    if (!abva2.f58507b) {
                        while (acxf.hasNext()) {
                            acxq acxq2 = (acxq) acxf.next();
                            if (!acxq2.mo33218a()) {
                                absr absr = acxq2.f61047b;
                                if (absr != null) {
                                    abpj.m48039a(abva2.f58506a.f58078n, acxq2.mo33217a(absr), abva2.m48303a(absr), abpi);
                                    abzm = b;
                                    acwo = acxf;
                                    abva = abva2;
                                    acsx2 = acsx;
                                } else {
                                    throw new IllegalArgumentException("Cannot report usage to non-implicit corpus with null corpus config!");
                                }
                            } else {
                                abqe a3 = acwk.m49902a(acxq2.mo33219b());
                                try {
                                    abyy abyy = acxq2.f61048c;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    abyv a4 = abva2.f58506a.f58077m.mo32495a(abyy);
                                    if (a4.mo32466a(currentTimeMillis)) {
                                        absr a5 = abva2.f58506a.mo32296a(abyy, a4, z2, abzr.m48712a(abzm.m48650a(abyy.f58780f, a3), currentTimeMillis));
                                        acxd a6 = abva2.m48303a(a5);
                                        abzm b2 = abva2.f58506a.mo32314b();
                                        acak acak = new acak(a5.f58140e, a5.f58138c);
                                        absy f = b2.mo32547f(acak);
                                        if (f == null) {
                                            abzm = b;
                                            acxq = acxq2;
                                            acwo = acxf;
                                            acxf = acsx;
                                        } else if (abzm.m48658f(a5)) {
                                            try {
                                                acwo = acxf;
                                            } catch (Throwable th) {
                                                th = th;
                                                abzm = b;
                                                acwo = acxf;
                                                acxf = acsx;
                                                acwo = acwo;
                                                abva = this;
                                                acwo = acwo;
                                                acsx2 = acxf;
                                                Throwable th2 = th;
                                                acwo.close();
                                                throw th2;
                                            }
                                            try {
                                                long nativeGetCorpusDocumentsSize = NativeIndex.nativeGetCorpusDocumentsSize(abva2.f58506a.f58078n.f79071b, a5.f58137b);
                                                if (nativeGetCorpusDocumentsSize >= 0) {
                                                    acxf = acsx;
                                                    acxq = acxq2;
                                                    try {
                                                        long currentTimeMillis2 = System.currentTimeMillis();
                                                        absv absv = f.f58183f;
                                                        if (absv == null) {
                                                            absv = absv.f58170d;
                                                        }
                                                        abzm = b;
                                                        if (currentTimeMillis2 - absv.f58173b > ((Long) abzt.f58834B.mo58455c()).longValue()) {
                                                            bxvd da2 = absv.f58170d.mo74144da();
                                                            if (da2.f164950c) {
                                                                da2.mo74035c();
                                                                da2.f164950c = false;
                                                            }
                                                            absv absv2 = (absv) da2.f164949b;
                                                            int i = absv2.f58172a | 1;
                                                            absv2.f58172a = i;
                                                            absv2.f58173b = currentTimeMillis2;
                                                            absv2.f58172a = i | 2;
                                                            absv2.f58174c = nativeGetCorpusDocumentsSize;
                                                            absv absv3 = (absv) da2.mo74062i();
                                                            bxvd bxvd = (bxvd) f.mo74142c(5);
                                                            bxvd.mo73625a((GeneratedMessageLite) f);
                                                            if (bxvd.f164950c) {
                                                                bxvd.mo74035c();
                                                                bxvd.f164950c = false;
                                                            }
                                                            absy absy = (absy) bxvd.f164949b;
                                                            absv3.getClass();
                                                            absy.f58183f = absv3;
                                                            absy.f58178a |= 32;
                                                            f = (absy) bxvd.mo74062i();
                                                            absv absv4 = f.f58183f;
                                                            if (absv4 == null) {
                                                                absv4 = absv.f58170d;
                                                            }
                                                            b2.mo32531a(acak, (List) null, (Integer) null, absv4);
                                                        }
                                                        absv absv5 = f.f58183f;
                                                        if (absv5 == null) {
                                                            absv5 = absv.f58170d;
                                                        }
                                                        if (nativeGetCorpusDocumentsSize - absv5.f58174c >= ((Long) abzt.f58835C.mo58455c()).longValue()) {
                                                            absg.m48206e("Too many pushes from %s", a5.f58140e);
                                                            abpi.f57854d++;
                                                            a6.mo33187a("push index rejected rate limit");
                                                            z2 = false;
                                                            abva2 = this;
                                                            acsx3 = acxf;
                                                            acxf = acwo;
                                                            b = abzm;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        acwo = acwo;
                                                        acxf = acxf;
                                                        abva = this;
                                                        acwo = acwo;
                                                        acsx2 = acxf;
                                                        Throwable th22 = th;
                                                        acwo.close();
                                                        throw th22;
                                                    }
                                                } else {
                                                    abzm = b;
                                                    acxf = acsx;
                                                    acxq = acxq2;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                abzm = b;
                                                acxf = acsx;
                                                acwo = acwo;
                                                abva = this;
                                                acwo = acwo;
                                                acsx2 = acxf;
                                                Throwable th222 = th;
                                                acwo.close();
                                                throw th222;
                                            }
                                        } else {
                                            abzm = b;
                                            acxq = acxq2;
                                            acwo = acxf;
                                            acxf = acsx;
                                        }
                                        bxvd bxvd2 = (bxvd) a3.mo74142c(5);
                                        bxvd2.mo73625a((GeneratedMessageLite) a3);
                                        int i2 = a5.f58137b;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        abqe abqe = (abqe) bxvd2.f164949b;
                                        abqe abqe2 = abqe.f57949g;
                                        abqe.f57951a |= 1;
                                        abqe.f57952b = i2;
                                        abqe abqe3 = (abqe) bxvd2.mo74062i();
                                        abva = this;
                                        try {
                                            bpxk a7 = abva.f58506a.f58078n.mo43397a(0, abqe3, abzu.m48730a());
                                            abpi.f57853c++;
                                            if (a7 != null) {
                                                bqaw a8 = bqaw.m112488a(a7.f139728c);
                                                if (a8 == null) {
                                                    a8 = bqaw.OK;
                                                }
                                                String a9 = NativeIndex.m66680a(a8);
                                                if (a9 != null) {
                                                    a6.mo33187a(a9.length() == 0 ? new String("push index ") : "push index ".concat(a9));
                                                }
                                            }
                                            acxq2 = acxq;
                                            abpj.m48039a(abva.f58506a.f58078n, acxq2.mo33217a(a5), a6, abpi);
                                            abuy a10 = abuy.m48299a(acxq2.f61046a.f58478h);
                                            if (a10 == null) {
                                                a10 = abuy.GENERAL_USE;
                                            }
                                            if (a10 == abuy.FIREBASE_USER_ACTIONS_USE) {
                                                abyy abyy2 = acxq2.f61048c;
                                                abvo a11 = abvo.m48336a(abva.f58506a.f58066b, abyy2.f58780f);
                                                if (a11 == null) {
                                                    absg.m48185a("3P AppIndexing disabled for package %s", abyy2.f58780f);
                                                    list = bngx.m109376e();
                                                } else {
                                                    abrv abrv4 = abva.f58506a;
                                                    abxt a12 = abxt.m48504a(abrv4.f58066b);
                                                    SQLiteDatabase readableDatabase = a11.getReadableDatabase();
                                                    String str3 = abyy2.f58780f;
                                                    Set<abww> a13 = abvn.m48330a(readableDatabase, str3, a12);
                                                    ArrayList arrayList = new ArrayList();
                                                    for (abww abww : a13) {
                                                        absr a14 = abrv4.mo32297a(abyy2, abww.mo32395b(), str3);
                                                        if (a14 != null) {
                                                            arrayList.add(a14);
                                                        }
                                                    }
                                                    list = arrayList;
                                                }
                                                for (absr absr2 : list) {
                                                    NativeIndex nativeIndex2 = abva.f58506a.f58078n;
                                                    abqe abqe4 = acxq2.f61046a.f58479i;
                                                    if (abqe4 == null) {
                                                        abqe4 = abqe.f57949g;
                                                    }
                                                    Iterator it = abqe4.f57955e.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            str2 = null;
                                                            break;
                                                        }
                                                        abqd abqd = (abqd) it.next();
                                                        abqo abqo = abqd.f57948d;
                                                        if (abqo == null) {
                                                            abqo = abqo.f57975r;
                                                        }
                                                        if ("intent_data".equals(abqo.f57978b)) {
                                                            str2 = abqd.f57947c.mo73781l();
                                                            break;
                                                        }
                                                    }
                                                    abuu abuu = acxq2.f61046a;
                                                    if (str2 != null) {
                                                        bxvd bxvd3 = (bxvd) abuu.mo74142c(5);
                                                        bxvd3.mo73625a((GeneratedMessageLite) abuu);
                                                        if (bxvd3.f164950c) {
                                                            bxvd3.mo74035c();
                                                            bxvd3.f164950c = false;
                                                        }
                                                        abuu abuu2 = (abuu) bxvd3.f164949b;
                                                        abuu abuu3 = abuu.f58469m;
                                                        str2.getClass();
                                                        int i3 = abuu2.f58471a | 16;
                                                        abuu2.f58471a = i3;
                                                        abuu2.f58476f = str2;
                                                        String str4 = absr2.f58138c;
                                                        str4.getClass();
                                                        abuu2.f58471a = i3 | 8;
                                                        abuu2.f58475e = str4;
                                                        abqe abqe5 = acxq2.f61046a.f58479i;
                                                        if (abqe5 == null) {
                                                            abqe5 = abqe.f57949g;
                                                        }
                                                        bxvd bxvd4 = (bxvd) abqe5.mo74142c(5);
                                                        bxvd4.mo73625a((GeneratedMessageLite) abqe5);
                                                        if (bxvd4.f164950c) {
                                                            bxvd4.mo74035c();
                                                            bxvd4.f164950c = false;
                                                        }
                                                        abqe abqe6 = (abqe) bxvd4.f164949b;
                                                        str2.getClass();
                                                        abqe6.f57951a |= 2;
                                                        abqe6.f57953c = str2;
                                                        if (bxvd3.f164950c) {
                                                            bxvd3.mo74035c();
                                                            bxvd3.f164950c = false;
                                                        }
                                                        abuu abuu4 = (abuu) bxvd3.f164949b;
                                                        abqe abqe7 = (abqe) bxvd4.mo74062i();
                                                        abqe7.getClass();
                                                        abuu4.f58479i = abqe7;
                                                        abuu4.f58471a |= 128;
                                                        abuu = (abuu) bxvd3.mo74062i();
                                                    }
                                                    abpj.m48039a(nativeIndex2, acxs.m49969a(absr2, abuu), a6, abpi);
                                                }
                                            }
                                        } catch (InterruptedException e2) {
                                            Thread.currentThread().interrupt();
                                            abva.m48304a(e2);
                                            abva2 = abva;
                                            acsx3 = acsx2;
                                            acxf = acwo;
                                            b = abzm;
                                            z2 = false;
                                        } catch (ExecutionException e3) {
                                            abva.m48304a(e3);
                                            abva2 = abva;
                                            acsx3 = acsx2;
                                            acxf = acwo;
                                            b = abzm;
                                            z2 = false;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            Throwable th2222 = th;
                                            acwo.close();
                                            throw th2222;
                                        }
                                    } else {
                                        abzm3 = b;
                                        acwo = acxf;
                                        abva = abva2;
                                        acsx2 = acsx;
                                        try {
                                            throw new acaq("Could not find app.");
                                        } catch (acaq | acat | SecurityException e4) {
                                            e = e4;
                                            absg.m48192b("Implicit corpus from usage report failed: %s", e.getMessage());
                                            abva2 = abva;
                                            acsx3 = acsx2;
                                            acxf = acwo;
                                            b = abzm;
                                            z2 = false;
                                        }
                                    }
                                } catch (acaq | acat | SecurityException e5) {
                                    e = e5;
                                    abzm3 = b;
                                    acwo = acxf;
                                    abva = abva2;
                                    acsx2 = acsx;
                                    absg.m48192b("Implicit corpus from usage report failed: %s", e.getMessage());
                                    abva2 = abva;
                                    acsx3 = acsx2;
                                    acxf = acwo;
                                    b = abzm;
                                    z2 = false;
                                }
                            }
                            if (!abva.f58508c) {
                                acrl acrl2 = abva.f58506a.f58071g;
                                if (!cemt.f183011a.mo6606a().mo79368b() || acsh.m49798a(acxq2.f61046a.f58472b, acrl2)) {
                                    z = false;
                                } else {
                                    Iterator it2 = acxq2.mo33219b().f57955e.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            str = "";
                                            break;
                                        }
                                        abqd abqd2 = (abqd) it2.next();
                                        abqo abqo2 = abqd2.f57948d;
                                        if (abqo2 == null) {
                                            abqo2 = abqo.f57975r;
                                        }
                                        if (".private:action".equals(abqo2.f57988m)) {
                                            try {
                                                ByteString bxtx = abqd2.f57947c;
                                                bxus c2 = bxus.m123744c();
                                                cixm cixm = cixm.f191686d;
                                                try {
                                                    bxuc h = bxtx.mo73764h();
                                                    GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) cixm.mo74142c(4);
                                                    bxxv a15 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                                                    a15.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c2);
                                                    a15.mo74225d(GeneratedMessageLite);
                                                    h.mo73787a(0);
                                                    GeneratedMessageLite.m124027b(GeneratedMessageLite);
                                                    str = ((cixm) GeneratedMessageLite).f191689b;
                                                    break;
                                                } catch (IOException e6) {
                                                    IOException iOException = e6;
                                                    if (!(iOException.getCause() instanceof bxwf)) {
                                                        throw new bxwf(iOException.getMessage());
                                                    }
                                                    throw ((bxwf) iOException.getCause());
                                                } catch (RuntimeException e7) {
                                                    RuntimeException runtimeException = e7;
                                                    if (runtimeException.getCause() instanceof bxwf) {
                                                        throw ((bxwf) runtimeException.getCause());
                                                    }
                                                    throw runtimeException;
                                                } catch (bxwf e8) {
                                                    throw e8;
                                                } catch (bxwf e9) {
                                                    throw e9;
                                                }
                                            } catch (bxwf e10) {
                                                absg.m48191b("Failed to parse schemaOrgAction proto.");
                                            }
                                        }
                                    }
                                    z = (!bmyx.m108640a(',').mo66917a().mo66925c(cemt.f183011a.mo6606a().mo79367a()).contains(str) || (c = (int) cemt.f183011a.mo6606a().mo79369c()) <= 0) ? false : new Random().nextInt(c) == 0;
                                }
                                abva.f58508c = z;
                            }
                            if (acsx2 != null) {
                                bqdx.m112674a(acsx2.f60712g, new acst(acsx2, acxq2), acsx2.f60713h).get();
                                abva2 = abva;
                                acsx3 = acsx2;
                                acxf = acwo;
                                b = abzm;
                                z2 = false;
                            } else {
                                abva2 = abva;
                                acsx3 = acsx2;
                                acxf = acwo;
                                b = abzm;
                                z2 = false;
                            }
                        }
                        abzm = b;
                        acwo = acxf;
                        abva = abva2;
                        acsx2 = acsx;
                        if (acsx2 != null) {
                            try {
                                bqdx.m112674a(acsx2.f60712g, new acsu(acsx2), acsx2.f60713h).get();
                            } catch (InterruptedException e11) {
                                Thread.currentThread().interrupt();
                                abva.m48304a(e11);
                            } catch (ExecutionException e12) {
                                abva.m48304a(e12);
                            }
                        }
                        acwo.close();
                        if (acsx2 != null) {
                            try {
                                acsx2.close();
                            } catch (IOException e13) {
                                e = e13;
                            }
                        }
                        for (Map.Entry entry : abva.f58509d.entrySet()) {
                            acak acak2 = (acak) entry.getKey();
                            acxd acxd = (acxd) entry.getValue();
                            synchronized (abzm.mo32525a()) {
                                abzm2 = abzm;
                                try {
                                    absy a16 = abzm2.mo32522a(acak2, (absy) null);
                                    if (a16 == null) {
                                        absg.m48192b("Cannot update counters for non-existent key: %s", acak2.mo32584b());
                                    } else if (acxd.mo33188a()) {
                                        bxvd bxvd5 = (bxvd) a16.mo74142c(5);
                                        bxvd5.mo73625a((GeneratedMessageLite) a16);
                                        if (bxvd5.f164950c) {
                                            bxvd5.mo74035c();
                                            bxvd5.f164950c = false;
                                        }
                                        ((absy) bxvd5.f164949b).f58179b = GeneratedMessageLite.m124030de();
                                        bxvd5.mo73950M(acxd.mo33186a(a16.f58179b));
                                        bxvd5.mo74062i();
                                        abzm2.mo32539b(acak2, (absy) bxvd5.mo74062i());
                                        abzm2.f58818g = true;
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                            abzm = abzm2;
                        }
                        abym = abva.f58506a.f58083s;
                        absg.m48204d("Usage reports ok %d, Failed Usage reports %d, indexed %d, rejected %d", Integer.valueOf(abpi.f57851a), Integer.valueOf(abpi.f57852b), Integer.valueOf(abpi.f57853c), Integer.valueOf(abpi.f57854d));
                        if (abpi.f57851a > 0 || abpi.f57853c > 0 || abpi.f57854d > 0 || abpi.f57852b > 0) {
                            da = bpyv.f139942f.mo74144da();
                            int i4 = abpi.f57851a;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpyv bpyv = (bpyv) da.f164949b;
                            int i5 = bpyv.f139944a | 1;
                            bpyv.f139944a = i5;
                            bpyv.f139945b = i4;
                            int i6 = abpi.f57852b;
                            int i7 = i5 | 2;
                            bpyv.f139944a = i7;
                            bpyv.f139946c = i6;
                            int i8 = abpi.f57853c;
                            int i9 = i7 | 4;
                            bpyv.f139944a = i9;
                            bpyv.f139947d = i8;
                            int i10 = abpi.f57854d;
                            bpyv.f139944a = i9 | 8;
                            bpyv.f139948e = i10;
                            bpyv bpyv2 = (bpyv) da.mo74062i();
                            t = cema.f182934a.mo6606a().mo79318t();
                            if (abym.mo32452a(t)) {
                                bxvd da3 = bpxb.f139606R.mo74144da();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bpxb bpxb = (bpxb) da3.f164949b;
                                bpyv2.getClass();
                                bpxb.f139613F = bpyv2;
                                bpxb.f139626b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                abym.mo32438a(16002, da3, t);
                            }
                        }
                        if (abpi.f57853c > 0) {
                            return null;
                        }
                        if (abva.f58508c) {
                            abrv abrv5 = abva.f58506a;
                            acpl acpl = abrv5.f58067c;
                            Context context2 = abrv5.f58066b;
                            acrl acrl3 = abrv5.f58071g;
                            abzo a17 = abrv5.mo32298a();
                            abrv abrv6 = abva.f58506a;
                            abyx abyx2 = abrv6.f58077m;
                            acao acao2 = abrv6.f58085u;
                            NativeIndex nativeIndex3 = abrv6.f58078n;
                            abym abym3 = abrv6.f58083s;
                            abyp n = abrv6.mo32331n();
                            abrv abrv7 = abva.f58506a;
                            acpl.mo32995d(new abpk(context2, acrl3, a17, abyx2, acao2, nativeIndex3, abym3, abrv6, n, abrv7.f58086v, abrv7.f58087w));
                            return null;
                        }
                        abrv abrv8 = this.f58506a;
                        Context context3 = abrv8.f58066b;
                        acrl acrl4 = abrv8.f58071g;
                        if (acrl4.mo33031f()) {
                            return null;
                        }
                        abpk.m48040a(context3);
                        synchronized (acrl4.f60625g) {
                            try {
                                acrl4.f60620b.edit().putBoolean("app-history-upload-pending", true).apply();
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                        return null;
                    }
                    abzm = b;
                    acwo acwo2 = acxf;
                    abva = abva2;
                    acsx2 = acsx;
                    acwo2.close();
                    if (acsx2 != null) {
                        acsx2.close();
                    }
                    return null;
                } catch (Throwable th8) {
                    th = th8;
                    abzm = b;
                    acwo = acxf;
                    abva = abva2;
                    acsx2 = acsx;
                    Throwable th22222 = th;
                    acwo.close();
                    throw th22222;
                }
            } catch (Throwable th9) {
                th = th9;
                abzm = b;
                acsx2 = acsx;
                abva = abva2;
                Throwable th10 = th;
                if (acsx2 != null) {
                    try {
                        acsx2.close();
                    } catch (Throwable th11) {
                        bqye.m113761a(th10, th11);
                    }
                }
                throw th10;
            }
        } catch (IOException e14) {
            e = e14;
            abzm = b;
            abva = abva2;
            abva.f58506a.mo32331n().mo32456a("SlurpUsageReportsTask uploadUserActions", e, cema.m137239f());
            while (r1.hasNext()) {
            }
            abym = abva.f58506a.f58083s;
            absg.m48204d("Usage reports ok %d, Failed Usage reports %d, indexed %d, rejected %d", Integer.valueOf(abpi.f57851a), Integer.valueOf(abpi.f57852b), Integer.valueOf(abpi.f57853c), Integer.valueOf(abpi.f57854d));
            da = bpyv.f139942f.mo74144da();
            int i42 = abpi.f57851a;
            if (da.f164950c) {
            }
            bpyv bpyv3 = (bpyv) da.f164949b;
            int i52 = bpyv3.f139944a | 1;
            bpyv3.f139944a = i52;
            bpyv3.f139945b = i42;
            int i62 = abpi.f57852b;
            int i72 = i52 | 2;
            bpyv3.f139944a = i72;
            bpyv3.f139946c = i62;
            int i82 = abpi.f57853c;
            int i92 = i72 | 4;
            bpyv3.f139944a = i92;
            bpyv3.f139947d = i82;
            int i102 = abpi.f57854d;
            bpyv3.f139944a = i92 | 8;
            bpyv3.f139948e = i102;
            bpyv bpyv22 = (bpyv) da.mo74062i();
            t = cema.f182934a.mo6606a().mo79318t();
            if (abym.mo32452a(t)) {
            }
            if (abpi.f57853c > 0) {
            }
        }
    }
}
