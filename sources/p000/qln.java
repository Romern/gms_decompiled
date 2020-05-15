package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.ConfigChimeraService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: qln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qln {

    /* renamed from: d */
    private static volatile qln f41659d = null;

    /* renamed from: a */
    private final Context f41660a;

    /* renamed from: b */
    private final long f41661b;

    /* renamed from: c */
    private final List f41662c = new ArrayList();

    public qln(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f41660a = applicationContext;
        this.f41661b = dia.m8552b(applicationContext);
        qlp.m32393a();
    }

    /* renamed from: a */
    private static dky m32378a(bnic bnic) {
        if (bnic.isEmpty()) {
            return dgk.f13062d;
        }
        dky b = dky.m8765b(bnic, dgk.f13060b);
        bnia j = bnic.m109500j();
        int size = b.size();
        int i = 0;
        djd djd = null;
        while (i < size) {
            djd djd2 = (djd) b.get(i);
            if (djd != null && djd.f13317b.equals(djd2.f13317b)) {
                j.mo67629b(djd);
            }
            i++;
            djd = djd2;
        }
        return b.mo9241a((Set) j.mo67751a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo24088b(boolean z) {
        qnd a = qnd.m32471a(this.f41660a);
        dky<bojy> b = a.mo24124b(bnon.f131923a);
        if (b != null) {
            if (b.isEmpty()) {
                qlp.m32393a().mo8860a(this.f41660a, 52);
                return 1;
            }
            try {
                dfy a2 = dfy.m8329a(this.f41660a);
                dky c = a2.mo8895c(a2.mo8898f());
                if (dhz.m8550a(b, c)) {
                    qlp.m32393a().mo8860a(this.f41660a, 50);
                    return 3;
                } else if (!z) {
                    dky b2 = dky.m8765b(c, dhz.f13198b);
                    ArrayList arrayList = new ArrayList();
                    for (bojy bojy : b) {
                        int a3 = b2.mo9239a(bojy);
                        if (a3 >= 0) {
                            bxwc bxwc = ((bojy) b2.get(a3)).f133374f;
                            if (!bojy.f133374f.equals(bxwc)) {
                                ArrayList arrayList2 = new ArrayList(bojy.f133374f);
                                arrayList2.removeAll(bxwc);
                                if (!arrayList2.isEmpty()) {
                                    bxvd bxvd = (bxvd) bojy.mo74142c(5);
                                    bxvd.mo73625a((bxvk) bojy);
                                    bojx bojx = (bojx) bxvd;
                                    if (bojx.f164950c) {
                                        bojx.mo74035c();
                                        bojx.f164950c = false;
                                    }
                                    bojy bojy2 = bojy.f133367g;
                                    ((bojy) bojx.f164949b).f133374f = bxvk.m124030de();
                                    bojx.mo68914a(arrayList2);
                                    arrayList.add((bojy) bojx.mo74062i());
                                }
                            }
                        } else {
                            arrayList.add(bojy);
                        }
                    }
                    dky b3 = dky.m8765b(arrayList, dhz.f13197a);
                    String a4 = dhz.m8548a(b3);
                    Collection a5 = a.mo24118a(bnon.f131923a);
                    String valueOf = String.valueOf(a4);
                    int size = a5 != null ? a5.size() : -1;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb.append(valueOf);
                    sb.append("|");
                    sb.append(size);
                    qlp.m32393a().mo24090a(this.f41660a, 51, sb.toString(), b3);
                    return 2;
                }
            } catch (InvalidConfigException e) {
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static qln m32379a(Context context) {
        qln qln = f41659d;
        if (qln == null) {
            synchronized (qln.class) {
                qln = f41659d;
                if (qln == null) {
                    qln = new qln(context);
                    f41659d = qln;
                }
            }
        }
        return qln;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo24084a() {
        ArrayList arrayList = new ArrayList(this.f41662c);
        this.f41662c.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qlm) arrayList.get(i)).mo24083a();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo24085a(int i, djk djk, String str, List list) {
        boolean remove;
        qlm qlm = new qlm(djk, str, list);
        synchronized (this.f41662c) {
            this.f41662c.add(qlm);
        }
        if (!mo24087a(i, qli.m32351a(this.f41660a), list)) {
            synchronized (this.f41662c) {
                remove = this.f41662c.remove(qlm);
                qlm.mo24083a();
            }
            if (remove && djk != null) {
                dkz.m8776a(djk, 1);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnd.a(bnic, boolean, bnic):java.util.Set
     arg types: [bnon, int, bnic]
     candidates:
      qnd.a(qnl, java.util.Map, bnic):np
      qnd.a(java.lang.String, java.lang.String, java.io.File):boolean
      qnd.a(bnic, boolean, bnic):java.util.Set */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022a, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo24086a(boolean z) {
        boolean z2;
        boolean z3;
        List list;
        List list2;
        bojy bojy;
        long j;
        boolean z4;
        String str = !z ? "fail" : "success";
        Log.i("ChimeraConfigurator", str.length() == 0 ? new String("Update complete: ") : "Update complete: ".concat(str));
        if (!z) {
            ConfigChimeraService.m22385b().mo24089a(this.f41660a);
        }
        qnd a = qnd.m32471a(this.f41660a);
        Set a2 = a.mo24119a((bnic) bnon.f131923a, false, qnm.m32491a(dgv.m8427a(a.f12990a).mo8990h()));
        if (a2 != null) {
            z2 = a2.isEmpty();
        } else {
            z2 = false;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = !z;
        }
        if (cdji.f180981a.mo6606a().mo77679h() && z3) {
            mo24088b(false);
        }
        synchronized (this.f41662c) {
            if (!z) {
                list2 = mo24084a();
                list = null;
            } else if (this.f41662c.isEmpty()) {
                list2 = null;
                list = null;
            } else if (cdji.f180981a.mo6606a().mo77684m()) {
                try {
                    djz f = dfy.m8329a(this.f41660a).mo8898f();
                    list = new ArrayList(this.f41662c.size());
                    Iterator it = this.f41662c.iterator();
                    while (it.hasNext()) {
                        qlm qlm = (qlm) it.next();
                        if (!qlm.f41657b.isEmpty()) {
                            if (dkt.m8751a(f, qlm.f41657b) == 0) {
                            }
                        } else if (!z2) {
                        }
                        list.add(qlm);
                        it.remove();
                        qlm.mo24083a();
                    }
                } catch (InvalidConfigException e) {
                    Log.e("ChimeraConfigurator", "Failed fetching module config, disabling feature-aware listeners", e);
                    list = null;
                }
                list2 = z2 ? mo24084a() : null;
            } else {
                list = z2 ? mo24084a() : null;
                list2 = null;
            }
        }
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dkz.m8776a(((qlm) list.get(i)).f41656a, 0);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dkz.m8776a(((qlm) list2.get(i2)).f41656a, 1);
            }
        }
        if (z3 && cdot.m134467b()) {
            qom a3 = qom.m32578a(this.f41660a);
            try {
                Iterator it2 = dfy.m8329a(a3.f41874a).mo8896d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        bojy = null;
                        break;
                    }
                    bojy = (bojy) it2.next();
                    if ("container".equals(bojy.f133370b) && qnm.m32503a(bojy, 128)) {
                        break;
                    }
                }
            } catch (InvalidConfigException e2) {
                bojy = null;
            }
            if (bojy != null) {
                long j2 = bojy.f133373e;
                synchronized (a3.f41875b) {
                    qok a4 = a3.mo24171a();
                    if (a4 != null) {
                        qmk qmk = a4.f41869c;
                        if (qmk == null) {
                            qmk = qmk.f41705d;
                        }
                        if (((bojy) qmk.f41707a.get(0)).f133373e == j2) {
                            if (!z || a4.f41870d) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                bxvd bxvd = (bxvd) a4.mo74142c(5);
                                bxvd.mo73625a((bxvk) a4);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                qok qok = (qok) bxvd.f164949b;
                                qok.f41867a |= 4;
                                qok.f41870d = true;
                                a3.mo24172a((qok) bxvd.mo74062i());
                            }
                            qol qol = a3.f41876c;
                            if (qol != null) {
                                qol.f41872b = z;
                                qol.f41871a.countDown();
                                a3.f41876c = null;
                            } else if (z4) {
                                qlp.m32393a().mo8861a(a3.f41874a, 65, String.valueOf(j2));
                                int i3 = a4.f41868b;
                                Context context = a3.f41874a;
                                context.getPackageName();
                                emz emz = new emz(null);
                                enh enh = new enh();
                                end b = emz.mo10313b(context, enh);
                                if (b != null) {
                                    try {
                                        String packageName = context.getPackageName();
                                        Parcel bj = b.mo8529bj();
                                        bj.writeString(packageName);
                                        bj.writeInt(i3);
                                        b.mo8530c(4, bj);
                                    } catch (Exception e3) {
                                        try {
                                            String valueOf = String.valueOf(e3.getMessage());
                                            Log.e("ZappPhoneskyConn", valueOf.length() == 0 ? new String("updateGmsApk failed: ") : "updateGmsApk failed: ".concat(valueOf));
                                        } catch (Throwable th) {
                                            emz.m10743a(context, enh);
                                            throw th;
                                        }
                                    }
                                    emz.m10743a(context, enh);
                                }
                            }
                        }
                    }
                    if (a4 != null) {
                        qmk qmk2 = a4.f41869c;
                        if (qmk2 == null) {
                            qmk2 = qmk.f41705d;
                        }
                        j = ((bojy) qmk2.f41707a.get(0)).f133373e;
                    } else {
                        j = -1;
                    }
                    StringBuilder sb = new StringBuilder(81);
                    sb.append("Ignoring placebo container module set ");
                    sb.append(j2);
                    sb.append(" (");
                    sb.append(j);
                    sb.append(")");
                    sb.toString();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r9v73, assign insn: PHI: (r9v73 ?) = (r9v10 boolean), (r9v87 ?) binds: [B:211:?, B:301:0x0776] */
    /* JADX WARN: Type inference failed for: r9v87, assign insn: 0x0778: MOVE  (r9v87 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r41v11 qli) */
    /* JADX WARN: Type inference failed for: r9v128, assign insn: ?: MOVE  (r9v128 ?) = (r9v75 qli) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnm.a(android.content.Context, java.util.Collection, int, boolean):void
     arg types: [android.content.Context, dky, int, int]
     candidates:
      qnm.a(ok, qng, java.lang.String, boolean):boolean
      qnm.a(android.content.Context, java.util.Collection, int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [dky, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r2 != 4) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        if (r14 < r18) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0d7f, code lost:
        return false;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=qli, code=boolean, for r41v0, types: [qli], assign insn: null */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0378 A[Catch:{ all -> 0x0d74, qns -> 0x0031, all -> 0x0dc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0381 A[Catch:{ all -> 0x0d74, qns -> 0x0031, all -> 0x0dc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x07d8 A[Catch:{ all -> 0x0d74, qns -> 0x0031, all -> 0x0dc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x07fb A[Catch:{ all -> 0x0d74, qns -> 0x0031, all -> 0x0dc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x081e A[Catch:{ all -> 0x0d74, qns -> 0x0031, all -> 0x0dc2 }, LOOP:7: B:333:0x081c->B:334:0x081e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0833 A[SYNTHETIC, Splitter:B:337:0x0833] */
    /* renamed from: a */
    public final synchronized boolean mo24087a(int i, boolean z, List list) {
        List list2;
        dky dky;
        dky dky2;
        int size;
        int i2;
        qnd qnd;
        boolean z2;
        bnic bnic;
        boolean z3;
        boolean z4;
        qmo qmo;
        dky dky3;
        dky dky4;
        qmo qmo2;
        boolean z5;
        qnd qnd2;
        boolean z6;
        dky dky5;
        boolean z7;
        qox qox;
        dky dky6;
        qnu qnu;
        qnx qnx;
        dgg dgg;
        ArrayList arrayList;
        dgg dgg2;
        qmk qmk;
        qns qns;
        int i3 = i;
        qli qli = z;
        List list3 = list;
        synchronized (this) {
            byte[] bArr = (byte[]) qlk.f41648d.mo58455c();
            if (i3 == 5) {
                if (bArr == qlk.f41645a && cdji.m133565f()) {
                    try {
                        bArr = qnt.m32529b(this.f41660a);
                        qlp.m32393a().mo8860a(this.f41660a, 79);
                    } catch (qns e) {
                        String valueOf = String.valueOf(qns);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                        sb.append("Error syncing flags: ");
                        sb.append(valueOf);
                        Log.w("ChimeraConfigurator", sb.toString());
                        qlp.m32393a().mo8861a(this.f41660a, 80, qns.getMessage());
                        bArr = (byte[]) qlk.f41648d.mo58455c();
                    } catch (Throwable th) {
                        while (true) {
                        }
                        throw th;
                    } finally {
                        Throwable th2 = th;
                    }
                }
            }
            if (cdji.f180981a.mo6606a().mo77677f()) {
                if (i3 != 3) {
                    if (i3 != 2) {
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                long e2 = z.mo24081e();
                long d = z.mo24080d();
                Long a = qnt.m32526a(this.f41660a);
                if (a != null) {
                    if (a.longValue() != e2) {
                    }
                    String valueOf2 = String.valueOf(a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                    sb2.append("Storing H serving version ");
                    sb2.append(valueOf2);
                    sb2.toString();
                    long longValue = a.longValue();
                    if (z.mo24082f()) {
                        qli.f41640a.edit().putLong("Chimera.lastHeterodyneServingVersion", longValue).putLong("Chimera.lastHeterodyneChangeTime", currentTimeMillis).commit();
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                long j = qli.f41640a.getLong("Chimera.lastUpdateTime", 0);
                long e3 = z.mo24081e();
                long d2 = z.mo24080d();
                long j2 = (currentTimeMillis2 - d2) / 1000;
                long j3 = (currentTimeMillis2 - j) / 1000;
                if (j3 <= 86400 && j != 0 && d2 != 0 && e3 != -1 && j2 >= 0 && j3 >= 0 && j2 > cdji.m133563d()) {
                    long d3 = cdji.m133563d();
                    StringBuilder sb3 = new StringBuilder(88);
                    sb3.append("H config is too old. ");
                    sb3.append(j2);
                    sb3.append(" secs is older than max of ");
                    sb3.append(d3);
                    sb3.toString();
                    qlp.m32393a().mo8860a(this.f41660a, 81);
                    return false;
                }
            }
            if (!cdjh.f180979a.mo6606a().mo77745j()) {
                qlp.m32393a().mo8860a(this.f41660a, 53);
                ConfigChimeraService.m22385b().mo24089a(this.f41660a);
                return false;
            }
            ArrayList arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            try {
                if (bArr.length > 0) {
                    qml qml = (qml) bxvk.m124016a(qml.f41710b, bArr, bxus.m123743b());
                    String valueOf3 = String.valueOf(qml);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                    sb4.append("Using PH Module Sets: ");
                    sb4.append(valueOf3);
                    sb4.toString();
                    arrayList2.addAll(qml.f41712a);
                }
                if (!cdjl.m133598d() || ((byte[]) qlk.f41646b.mo58455c()).length <= 0) {
                    list2 = arrayList3;
                } else {
                    dje dje = (dje) bxvk.m124016a(dje.f13319b, (byte[]) qlk.f41646b.mo58455c(), bxus.m123743b());
                    List list4 = dje.f13321a;
                    String valueOf4 = String.valueOf(dje);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 29);
                    sb5.append("Using PH requested features: ");
                    sb5.append(valueOf4);
                    sb5.toString();
                }
                if (cdot.m134467b()) {
                    qok a2 = qom.m32578a(this.f41660a).mo24171a();
                    if (a2 == null || (a2.f41867a & 2) == 0) {
                        qmk = null;
                    } else {
                        qmk qmk2 = a2.f41869c;
                        if (qmk2 == null) {
                            qmk2 = qmk.f41705d;
                        }
                        bojy bojy = (bojy) qmk2.f41707a.get(0);
                        bxvd bxvd = (bxvd) bojy.mo74142c(5);
                        bxvd.mo73625a((bxvk) bojy);
                        bojx bojx = (bojx) bxvd;
                        if (bojx.f164950c) {
                            bojx.mo74035c();
                            bojx.f164950c = false;
                        }
                        bojy bojy2 = (bojy) bojx.f164949b;
                        bojy bojy3 = bojy.f133367g;
                        bojy2.f133369a |= 4;
                        bojy2.f133372d = 128;
                        bojy bojy4 = (bojy) bojx.mo74062i();
                        bxvd bxvd2 = (bxvd) qmk2.mo74142c(5);
                        bxvd2.mo73625a((bxvk) qmk2);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        qmk.m32445a((qmk) bxvd2.f164949b, bojy4);
                        qmk = (qmk) bxvd2.mo74062i();
                    }
                    if (qmk != null) {
                        arrayList2.add(qmk);
                    }
                }
                if (Boolean.TRUE.equals(qlk.f41649e.mo58455c())) {
                    qlp a3 = qlp.m32393a();
                    Context context = this.f41660a;
                    StringBuilder sb6 = new StringBuilder();
                    int i4 = i3 - 1;
                    if (i3 != 0) {
                        sb6.append(i4);
                        sb6.append("|");
                        sb6.append(qnm.m32510b(arrayList2));
                        a3.mo8861a(context, 43, sb6.toString());
                    } else {
                        throw null;
                    }
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                if (z.mo24082f()) {
                    qli.f41640a.edit().putLong("Chimera.lastUpdateTime", currentTimeMillis3).commit();
                }
                dky a4 = qnm.m32495a((List) arrayList2);
                Set b = z.mo24077b();
                qnd a5 = qnd.m32471a(this.f41660a);
                qli a6 = qli.m32351a(this.f41660a);
                if (cdjl.m133598d()) {
                    dfz dfz = new dfz(this.f41660a);
                    dgh a7 = dgh.m8389a(this.f41660a);
                    long e4 = a6.mo24081e();
                    brtm e5 = a7.mo8954e();
                    ArrayList arrayList4 = new ArrayList();
                    if (e4 != -1) {
                        try {
                            djy w = e5.mo69934w();
                            long x = e5.mo69935x();
                            if (w != null && dfz.mo8909a(w)) {
                                dgg2 = null;
                                dgg = dgg2;
                                arrayList = arrayList4;
                                if (!a7.mo8952a(":server_requester", list2, arrayList, false, false, null, null, dgg)) {
                                }
                            } else if (x != e4) {
                                dgg2 = new dgg(dfz.mo8915g(), e4);
                                try {
                                    ArrayList arrayList5 = new ArrayList();
                                    for (int i5 = 0; i5 < e5.mo69933v(); i5++) {
                                        brtm b2 = e5.mo69919b(new brtm(), i5);
                                        if (b2.mo69892A().equals(":server_requester")) {
                                            arrayList5.add(b2.mo69936y());
                                        }
                                    }
                                    arrayList4 = arrayList5;
                                    dgg = dgg2;
                                    arrayList = arrayList4;
                                } catch (PackageManager.NameNotFoundException e6) {
                                    Log.e("FeatureMgr", "Installed container APK's timestamp or version code weren't set. No features will be removed.");
                                    dgg = dgg2;
                                    arrayList = arrayList4;
                                    if (!a7.mo8952a(":server_requester", list2, arrayList, false, false, null, null, dgg)) {
                                    }
                                }
                                if (!a7.mo8952a(":server_requester", list2, arrayList, false, false, null, null, dgg)) {
                                    Log.e("FeatureMgr", "Failed to update config with server requested features.");
                                } else {
                                    bnia j4 = bnic.m109500j();
                                    dgh a8 = dgh.m8389a(this.f41660a);
                                    byte[] bArr2 = (byte[]) qlk.f41647c.mo58455c();
                                    if (bArr2 == qlk.f41645a || bArr2.length == 0) {
                                        j4.mo67752b((Iterable) a8.mo8953d());
                                    } else {
                                        try {
                                            j4.mo67752b((Iterable) ((dje) bxvk.m124016a(dje.f13319b, bArr2, bxus.m123743b())).f13321a);
                                        } catch (bxwf e7) {
                                            bxwf bxwf = e7;
                                            long j5 = this.f41661b;
                                            String valueOf5 = String.valueOf(bxwf);
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 55);
                                            sb7.append("Invalid devFeatureBytes for user ");
                                            sb7.append(j5);
                                            sb7.append(": ");
                                            sb7.append(valueOf5);
                                            Log.e("ChimeraConfigurator", sb7.toString());
                                        }
                                    }
                                    dky = m32378a(j4.mo67751a());
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e8) {
                            dgg2 = null;
                            Log.e("FeatureMgr", "Installed container APK's timestamp or version code weren't set. No features will be removed.");
                            dgg = dgg2;
                            arrayList = arrayList4;
                            if (!a7.mo8952a(":server_requester", list2, arrayList, false, false, null, null, dgg)) {
                            }
                        }
                    }
                    dgg2 = null;
                    dgg = dgg2;
                    arrayList = arrayList4;
                    if (!a7.mo8952a(":server_requester", list2, arrayList, false, false, null, null, dgg)) {
                    }
                } else {
                    bnia j6 = bnic.m109500j();
                    try {
                        j6.mo67752b((Iterable) ((dje) bxvk.m124016a(dje.f13319b, (byte[]) qlk.f41646b.mo58455c(), bxus.m123743b())).f13321a);
                    } catch (bxwf e9) {
                        String valueOf6 = String.valueOf(e9);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf6).length() + 31);
                        sb8.append("Invalid required feature list: ");
                        sb8.append(valueOf6);
                        Log.e("ChimeraConfigurator", sb8.toString());
                    }
                    byte[] bArr3 = (byte[]) qlk.f41647c.mo58455c();
                    if (bArr3 != qlk.f41645a) {
                        try {
                            j6.mo67752b((Iterable) ((dje) bxvk.m124016a(dje.f13319b, bArr3, bxus.m123743b())).f13321a);
                        } catch (bxwf e10) {
                            bxwf bxwf2 = e10;
                            long j7 = this.f41661b;
                            String valueOf7 = String.valueOf(bxwf2);
                            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf7).length() + 60);
                            sb9.append("Invalid devRequestedFeatures for user ");
                            sb9.append(j7);
                            sb9.append(": ");
                            sb9.append(valueOf7);
                            Log.e("ChimeraConfigurator", sb9.toString());
                        }
                    } else {
                        j6.mo67752b((Iterable) dgh.m8389a(this.f41660a).mo8953d());
                    }
                    dky = m32378a(j6.mo67751a());
                }
                bnia j8 = bnic.m109500j();
                j8.mo67752b((Iterable) cdjh.f180979a.mo6606a().mo77740e().f13321a);
                dky a9 = m32378a(j8.mo67751a());
                qnm.m32500a(this.f41660a, (Collection) a4, 3, false);
                boolean h = cdjh.m133558h();
                if (!h) {
                    if (!cdjh.m133552b()) {
                        bnia j9 = bnic.m109500j();
                        size = list.size();
                        for (i2 = 0; i2 < size; i2++) {
                            j9.mo67629b(((djd) list3.get(i2)).f13317b);
                        }
                        bnic a10 = j9.mo67751a();
                        synchronized (a5.f41765e) {
                            try {
                                if (a5.mo8638b()) {
                                    Log.e("ModuleSetMgr", "not migrated with user locked");
                                    bnic = a10;
                                    qnd = a5;
                                    z2 = h;
                                    z3 = false;
                                } else {
                                    dky a11 = dky.m8762a((Iterable) dfy.m8329a(a5.f12990a).mo8896d(), dhz.f13198b);
                                    qox qox2 = new qox();
                                    bnkd a12 = qnm.m32492a(a4, b, qox2);
                                    bndu r = bndu.m109109r();
                                    long h2 = qnd.m32475h();
                                    Iterator it = a12.mo67316o().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = it;
                                        String str = (String) it.next();
                                        for (qmk qmk3 : a12.mo67124a(str)) {
                                            bnkd bnkd = a12;
                                            boolean z8 = h;
                                            bxvd da = qmm.f41713g.mo74144da();
                                            bnic bnic2 = a10;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            qmm qmm = (qmm) da.f164949b;
                                            qmk3.getClass();
                                            qmm.f41716b = qmk3;
                                            int i6 = qmm.f41715a | 1;
                                            qmm.f41715a = i6;
                                            qmm.f41715a = i6 | 8;
                                            qmm.f41719e = h2;
                                            r.mo67268a(str, (qmm) da.mo74062i());
                                            a10 = bnic2;
                                            a12 = bnkd;
                                            h = z8;
                                        }
                                        it = it2;
                                    }
                                    bnic = a10;
                                    z2 = h;
                                    qmo d4 = a5.mo24125d();
                                    for (qmn qmn : d4.f41728c) {
                                        qmo qmo3 = d4;
                                        qnd qnd3 = a5;
                                        dky dky7 = dky;
                                        dky dky8 = dky2;
                                        if (qmn.f41723a.size() != 0) {
                                            qmk qmk4 = ((qmm) qmn.f41723a.get(0)).f41716b;
                                            if (qmk4 == null) {
                                                qmk4 = qmk.f41705d;
                                            }
                                            String str2 = ((bojy) qmk4.f41707a.get(0)).f133370b;
                                            List a13 = r.mo67124a(str2);
                                            bojx bojx2 = (bojx) bojy.f133367g.mo74144da();
                                            if (bojx2.f164950c) {
                                                bojx2.mo74035c();
                                                bojx2.f164950c = false;
                                            }
                                            bojy bojy5 = (bojy) bojx2.f164949b;
                                            str2.getClass();
                                            int i7 = bojy5.f133369a | 1;
                                            bojy5.f133369a = i7;
                                            bojy5.f133370b = str2;
                                            bojy5.f133369a = i7 | 8;
                                            bojy5.f133373e = Long.MAX_VALUE;
                                            int a14 = a11.mo9239a((bojy) bojx2.mo74062i());
                                            if (a14 < 0) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            bmzs.m108698a(z7);
                                            int i8 = (-(a14 + 1)) - 1;
                                            while (true) {
                                                if (i8 >= 0) {
                                                    if (!qnm.m32503a((bojy) a11.get(i8), 128)) {
                                                        break;
                                                    }
                                                    i8--;
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (i8 < 0 || !((bojy) a11.get(i8)).f133370b.equals(str2)) {
                                                i8 = -1;
                                            }
                                            if (i8 >= 0) {
                                                qox qox3 = qox2;
                                                long j10 = ((bojy) a11.get(i8)).f133373e;
                                                int size2 = a13.size() - 1;
                                                while (true) {
                                                    if (size2 < 0) {
                                                        qox = qox3;
                                                        break;
                                                    }
                                                    qmk qmk5 = ((qmm) a13.get(size2)).f41716b;
                                                    if (qmk5 == null) {
                                                        qmk5 = qmk.f41705d;
                                                    }
                                                    qox = qox3;
                                                    if (qnm.m32502a(j10, ((bojy) qmk5.f41707a.get(0)).f133373e)) {
                                                        break;
                                                    }
                                                    a13.remove(size2);
                                                    size2--;
                                                    qox3 = qox;
                                                }
                                            } else {
                                                qox = qox2;
                                            }
                                            for (qmm qmm2 : qmn.f41723a) {
                                                int binarySearch = Collections.binarySearch(a13, qmm2, bnny.m109908a(qnm.f41783b).mo68159a(qmv.f41743a).mo67377a());
                                                if (binarySearch < 0) {
                                                    a13.add(-(binarySearch + 1), qmm2);
                                                } else {
                                                    a13.set(binarySearch, qmm2);
                                                }
                                            }
                                            qox2 = qox;
                                            dky5 = dky7;
                                            dky2 = dky8;
                                            d4 = qmo3;
                                            a5 = qnd3;
                                        } else {
                                            dky5 = dky7;
                                            dky2 = dky8;
                                            d4 = qmo3;
                                            a5 = qnd3;
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it3 = dky.m8764b((Iterable) r.mo67316o()).iterator();
                                    while (it3.hasNext()) {
                                        String str3 = (String) it3.next();
                                        bxvd da2 = qmn.f41721b.mo74144da();
                                        dky dky9 = dky;
                                        dky dky10 = dky2;
                                        int A = (int) cdjh.f180979a.mo6606a().mo77721A();
                                        if (A <= 0) {
                                            StringBuilder sb10 = new StringBuilder(51);
                                            qmo = d4;
                                            sb10.append("maxModuleSetHistoryLen=");
                                            sb10.append(A);
                                            sb10.append(". Setting it to 1");
                                            Log.w("ModuleSetMgr", sb10.toString());
                                            A = 1;
                                        } else {
                                            qmo = d4;
                                        }
                                        Iterator it4 = r.mo67124a(str3).iterator();
                                        boolean z9 = false;
                                        boolean z10 = false;
                                        while (it4.hasNext()) {
                                            qmm qmm3 = (qmm) it4.next();
                                            Iterator it5 = it4;
                                            qmk qmk6 = qmm3.f41716b;
                                            if (qmk6 == null) {
                                                qmk6 = qmk.f41705d;
                                            }
                                            ArrayList arrayList7 = arrayList6;
                                            boolean z11 = qmk6.f41709c.isEmpty() ? qmk6.f41708b.isEmpty() : false;
                                            Iterator it6 = it3;
                                            qnd qnd4 = a5;
                                            boolean contains = a11.contains((bojy) qmk6.f41707a.get(0));
                                            boolean a15 = qnm.m32507a(qmk6, 128);
                                            if (contains || qmm3.f41720f) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (!z11) {
                                                if (!z9) {
                                                    if (z10 && !contains) {
                                                        if (!z5 || A <= 0) {
                                                        }
                                                    }
                                                    if (!contains) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = !a15;
                                                    }
                                                    z10 |= z6;
                                                    boolean contains2 = a4.contains(qmk6);
                                                    bxvd bxvd3 = (bxvd) qmm3.mo74142c(5);
                                                    bxvd3.mo73625a((bxvk) qmm3);
                                                    if (!contains2) {
                                                        if (bxvd3.f164950c) {
                                                            bxvd3.mo74035c();
                                                            bxvd3.f164950c = false;
                                                        }
                                                        qmm qmm4 = (qmm) bxvd3.f164949b;
                                                        qmm qmm5 = qmm.f41713g;
                                                        qmm4.f41715a |= 4;
                                                        qmm4.f41718d = true;
                                                        qox2.mo24183a(qmk6, 13);
                                                    } else {
                                                        if (bxvd3.f164950c) {
                                                            bxvd3.mo74035c();
                                                            bxvd3.f164950c = false;
                                                        }
                                                        qmm qmm6 = (qmm) bxvd3.f164949b;
                                                        qmm qmm7 = qmm.f41713g;
                                                        qmm6.f41715a &= -5;
                                                        qmm6.f41718d = false;
                                                        qox2.mo24183a(qmk6, 3);
                                                    }
                                                    if (z5) {
                                                        if (!a15) {
                                                            if (bxvd3.f164950c) {
                                                                bxvd3.mo74035c();
                                                                bxvd3.f164950c = false;
                                                            }
                                                            qmm qmm8 = (qmm) bxvd3.f164949b;
                                                            qmm8.f41715a |= 16;
                                                            qmm8.f41720f = true;
                                                            A--;
                                                        }
                                                    }
                                                    qmm qmm9 = (qmm) bxvd3.mo74062i();
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    qmn qmn2 = (qmn) da2.f164949b;
                                                    qmm9.getClass();
                                                    qmn2.mo24113a();
                                                    qmn2.f41723a.add(qmm9);
                                                    it4 = it5;
                                                    arrayList6 = arrayList7;
                                                    it3 = it6;
                                                    qnd2 = qnd4;
                                                }
                                            }
                                            z9 |= z11;
                                            Iterator it7 = qmk6.f41707a.iterator();
                                            while (it7.hasNext()) {
                                                bojy bojy6 = (bojy) it7.next();
                                                Iterator it8 = it7;
                                                int a16 = qox2.f41905a.mo15616a(qox.m32595a(bojy6.f133370b, bojy6.f133373e));
                                                if (a16 >= 0) {
                                                    qox2.f41905a.mo8152d(a16);
                                                    it7 = it8;
                                                } else {
                                                    it7 = it8;
                                                }
                                            }
                                            it4 = it5;
                                            arrayList6 = arrayList7;
                                            it3 = it6;
                                            qnd2 = qnd4;
                                        }
                                        if (((qmn) da2.f164949b).f41723a.size() > 0) {
                                            arrayList6.add((qmn) da2.mo74062i());
                                            dky3 = dky9;
                                            dky4 = dky10;
                                            qmo2 = qmo;
                                        } else {
                                            dky3 = dky9;
                                            dky4 = dky10;
                                            qmo2 = qmo;
                                        }
                                    }
                                    qox2.mo24185b();
                                    qox2.mo24179a(a5.f12990a);
                                    bxvd bxvd4 = (bxvd) d4.mo74142c(5);
                                    bxvd4.mo73625a((bxvk) d4);
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    qmo qmo4 = qmo.f41724g;
                                    ((qmo) bxvd4.f164949b).f41728c = bxvk.m124030de();
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    qmo qmo5 = (qmo) bxvd4.f164949b;
                                    qmo5.mo24114a();
                                    bxsy.m123078a(arrayList6, qmo5.f41728c);
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    ((qmo) bxvd4.f164949b).f41729d = bxvk.m124030de();
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    qmo qmo6 = (qmo) bxvd4.f164949b;
                                    if (!qmo6.f41729d.mo73666a()) {
                                        qmo6.f41729d = bxvk.m124021a(qmo6.f41729d);
                                    }
                                    bxsy.m123078a(dky, qmo6.f41729d);
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    ((qmo) bxvd4.f164949b).f41730e = bxvk.m124030de();
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    qmo qmo7 = (qmo) bxvd4.f164949b;
                                    if (!qmo7.f41730e.mo73666a()) {
                                        qmo7.f41730e = bxvk.m124021a(qmo7.f41730e);
                                    }
                                    bxsy.m123078a(dky2, qmo7.f41730e);
                                    boolean m = cdjh.f180979a.mo6606a().mo77748m();
                                    if (bxvd4.f164950c) {
                                        bxvd4.mo74035c();
                                        bxvd4.f164950c = false;
                                    }
                                    qmo qmo8 = (qmo) bxvd4.f164949b;
                                    qmo8.f41726a |= 2;
                                    qmo8.f41731f = m;
                                    qmo qmo9 = (qmo) bxvd4.mo74062i();
                                    if (!qmo9.equals(d4)) {
                                        z3 = a5.mo24123a(qmo9);
                                        qnd = a5;
                                    } else {
                                        qnd = a5;
                                        z3 = false;
                                    }
                                }
                            } catch (InvalidConfigException e11) {
                                bnic = a10;
                                qnd = a5;
                                z2 = h;
                                String valueOf8 = String.valueOf(e11);
                                StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf8).length() + 44);
                                sb11.append("Failed to get current chimera configuration ");
                                sb11.append(valueOf8);
                                Log.e("ModuleSetMgr", sb11.toString());
                                z3 = false;
                            } catch (Throwable th3) {
                                while (true) {
                                    throw th3;
                                }
                            }
                        }
                        if (i == 3) {
                            if (mo24088b(z3) == 2) {
                                qmc.m32424a(true);
                            }
                        }
                        bnic bnic3 = bnic;
                        qnd qnd5 = qnd;
                        dky b3 = qnd5.mo24124b(bnic3);
                        if (b3 != null) {
                            Context context2 = this.f41660a;
                            if (qlq.f41665a == null) {
                                synchronized (qlq.class) {
                                    if (qlq.f41665a == null) {
                                        qlq.f41665a = new qlq(context2);
                                    }
                                }
                            }
                            int a17 = qlq.f41665a.mo24092a(z2, bnic3);
                            if (a17 == 2) {
                                qox qox4 = new qox();
                                qox4.mo24182a(b3, 7);
                                qox4.mo24179a(this.f41660a);
                                ConfigChimeraService.m22385b().mo24089a(this.f41660a);
                                z4 = false;
                            } else if (a17 == 3) {
                                qox qox5 = new qox();
                                qox5.mo24182a(b3, 16);
                                qox5.mo24179a(this.f41660a);
                                ConfigChimeraService.m22385b();
                                qlo.m32389b(this.f41660a);
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                        } else {
                            z4 = false;
                        }
                        if (z3 || z4) {
                            qnd5.mo24126f();
                            mo24086a(true);
                            return z4;
                        }
                    }
                }
                qnv a18 = qnv.m32530a(this.f41660a);
                int i9 = Build.VERSION.SDK_INT;
                bxvd da3 = qnx.f41814d.mo74144da();
                int size3 = a4.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    bxtx aL = ((qmk) a4.get(i10)).mo73639aL();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    qnx qnx2 = (qnx) da3.f164949b;
                    aL.getClass();
                    qnx2.mo24145a();
                    qnx2.f41816a.add(aL);
                }
                int size4 = dky.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    bxtx aL2 = ((djd) dky.get(i11)).mo73639aL();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    qnx qnx3 = (qnx) da3.f164949b;
                    aL2.getClass();
                    qnx3.mo24146b();
                    qnx3.f41817b.add(aL2);
                }
                int size5 = a9.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    bxtx aL3 = ((djd) a9.get(i12)).mo73639aL();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    qnx qnx4 = (qnx) da3.f164949b;
                    aL3.getClass();
                    qnx4.mo24147c();
                    qnx4.f41818c.add(aL3);
                }
                if (!a18.f41804e) {
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("UpdateRequest", ((qnx) da3.mo74062i()).mo73642k());
                    if (!list.isEmpty()) {
                        bxvd da4 = dje.f13319b.mo74144da();
                        da4.mo74060h(list3);
                        bundle.putByteArray("UrgentFeatures", ((dje) da4.mo74062i()).mo73642k());
                    }
                    qnu = null;
                    qnu = null;
                    Bundle call = a18.f12990a.getContentResolver().call(Uri.parse("content://com.google.android.gms.chimera.container.sharedmoduleprovider"), "exchangeInfo", (String) null, bundle);
                    if (call != null) {
                        try {
                            byte[] byteArray = call.getByteArray("UpdateRequest");
                            if (byteArray != null) {
                                qnx = (qnx) bxvk.m124016a(qnx.f41814d, byteArray, bxus.m123743b());
                            }
                        } catch (bxwf e12) {
                            long j11 = a18.f41806g;
                            StringBuilder sb12 = new StringBuilder(65);
                            sb12.append("Failed to decode the module request for user ");
                            sb12.append(j11);
                            Log.e("SharedModuleManager", sb12.toString());
                            dky6 = a4;
                            z = h;
                        }
                    }
                    dky6 = a4;
                    z = h;
                    if (qnu != null) {
                        long j12 = this.f41661b;
                        StringBuilder sb13 = new StringBuilder(121);
                        sb13.append("Module update request to system user from user ");
                        sb13.append(j12);
                        sb13.append(" failed. Falling back to normal downloading mechanism.");
                        Log.w("ChimeraConfigurator", sb13.toString());
                        a4 = dky6;
                        h = false;
                    } else {
                        a4 = qnm.m32495a((List) qnu.f41800a);
                        dky = dky.m8765b(qnu.f41801b, dky.f13433a);
                        a9 = dky.m8765b(qnu.f41802c, a9.f13433a);
                        h = z;
                    }
                    bnia j92 = bnic.m109500j();
                    size = list.size();
                    while (i2 < size) {
                    }
                    bnic a102 = j92.mo67751a();
                    synchronized (a5.f41765e) {
                    }
                } else {
                    qnx = a18.mo24141a((qnx) da3.mo74062i(), a18.f41806g);
                }
                try {
                    bngs b4 = bngx.m109371b(qnx.f41816a.size());
                    for (bxtx bxtx : qnx.f41816a) {
                        dky6 = a4;
                        z = h;
                        qnx qnx5 = qnx;
                        bxus b5 = bxus.m123743b();
                        qmk qmk7 = qmk.f41705d;
                        try {
                            bxuc h3 = bxtx.mo73764h();
                            bxvk bxvk = (bxvk) qmk7.mo74142c(4);
                            bxxv a19 = bxxm.f165037a.mo74228a(bxvk);
                            a19.mo74220a(bxvk, bxud.m123454a(h3), b5);
                            a19.mo74225d(bxvk);
                            h3.mo73787a(0);
                            bxvk.m124027b(bxvk);
                            b4.mo67668c((qmk) bxvk);
                            h = z;
                            qnx = qnx5;
                            a4 = dky6;
                        } catch (IOException e13) {
                            IOException iOException = e13;
                            if (!(iOException.getCause() instanceof bxwf)) {
                                throw new bxwf(iOException.getMessage());
                            }
                            throw ((bxwf) iOException.getCause());
                        } catch (RuntimeException e14) {
                            RuntimeException runtimeException = e14;
                            if (runtimeException.getCause() instanceof bxwf) {
                                throw ((bxwf) runtimeException.getCause());
                            }
                            throw runtimeException;
                        } catch (bxwf e15) {
                            throw e15;
                        } catch (bxwf e16) {
                            throw e16;
                        }
                    }
                    bngs b6 = bngx.m109371b(qnx.f41817b.size());
                    qli qli2 = h;
                    for (bxtx bxtx2 : qnx.f41817b) {
                        dky6 = a4;
                        z = qli2;
                        bxus b7 = bxus.m123743b();
                        djd djd = djd.f13314d;
                        try {
                            bxuc h4 = bxtx2.mo73764h();
                            bxvk bxvk2 = (bxvk) djd.mo74142c(4);
                            bxxv a20 = bxxm.f165037a.mo74228a(bxvk2);
                            qnx qnx6 = qnx;
                            a20.mo74220a(bxvk2, bxud.m123454a(h4), b7);
                            a20.mo74225d(bxvk2);
                            h4.mo73787a(0);
                            bxvk.m124027b(bxvk2);
                            b6.mo67668c((djd) bxvk2);
                            qli2 = z;
                            qnx = qnx6;
                            a4 = dky6;
                        } catch (IOException e17) {
                            IOException iOException2 = e17;
                            if (!(iOException2.getCause() instanceof bxwf)) {
                                throw new bxwf(iOException2.getMessage());
                            }
                            throw ((bxwf) iOException2.getCause());
                        } catch (RuntimeException e18) {
                            RuntimeException runtimeException2 = e18;
                            if (runtimeException2.getCause() instanceof bxwf) {
                                throw ((bxwf) runtimeException2.getCause());
                            }
                            throw runtimeException2;
                        } catch (bxwf e19) {
                            throw e19;
                        } catch (bxwf e20) {
                            throw e20;
                        }
                    }
                    bngs b8 = bngx.m109371b(qnx.f41818c.size());
                    Iterator it9 = qnx.f41818c.iterator();
                    qli qli3 = qli2;
                    while (it9.hasNext()) {
                        bxtx bxtx3 = (bxtx) it9.next();
                        bxus b9 = bxus.m123743b();
                        dky6 = a4;
                        try {
                            djd djd2 = djd.f13314d;
                            z = qli3;
                            try {
                                bxuc h5 = bxtx3.mo73764h();
                                Iterator it10 = it9;
                                bxvk bxvk3 = (bxvk) djd2.mo74142c(4);
                                bxxv a21 = bxxm.f165037a.mo74228a(bxvk3);
                                a21.mo74220a(bxvk3, bxud.m123454a(h5), b9);
                                a21.mo74225d(bxvk3);
                                h5.mo73787a(0);
                                try {
                                    bxvk.m124027b(bxvk3);
                                    b8.mo67668c((djd) bxvk3);
                                    qli3 = z;
                                    it9 = it10;
                                    a4 = dky6;
                                } catch (bxwf e21) {
                                }
                            } catch (IOException e22) {
                                IOException iOException3 = e22;
                                if (!(iOException3.getCause() instanceof bxwf)) {
                                    throw new bxwf(iOException3.getMessage());
                                }
                                throw ((bxwf) iOException3.getCause());
                            } catch (RuntimeException e23) {
                                RuntimeException runtimeException3 = e23;
                                if (runtimeException3.getCause() instanceof bxwf) {
                                    throw ((bxwf) runtimeException3.getCause());
                                }
                                throw runtimeException3;
                            } catch (bxwf e24) {
                                throw e24;
                            } catch (bxwf e25) {
                                throw e25;
                            }
                        } catch (bxwf e26) {
                            h = qli3;
                            z = h;
                            long j13 = a18.f41806g;
                            StringBuilder sb14 = new StringBuilder(68);
                            sb14.append("Failed to decode merged module request for user ");
                            sb14.append(j13);
                            Log.e("SharedModuleManager", sb14.toString());
                            qnu = null;
                            if (qnu != null) {
                            }
                            bnia j922 = bnic.m109500j();
                            size = list.size();
                            while (i2 < size) {
                            }
                            bnic a1022 = j922.mo67751a();
                            synchronized (a5.f41765e) {
                            }
                        }
                    }
                    dky6 = a4;
                    z = qli3;
                    qnu = new qnu(b4.mo67664a(), b6.mo67664a(), b8.mo67664a());
                } catch (bxwf e27) {
                    dky6 = a4;
                    z = h;
                    long j132 = a18.f41806g;
                    StringBuilder sb142 = new StringBuilder(68);
                    sb142.append("Failed to decode merged module request for user ");
                    sb142.append(j132);
                    Log.e("SharedModuleManager", sb142.toString());
                    qnu = null;
                    if (qnu != null) {
                    }
                    bnia j9222 = bnic.m109500j();
                    size = list.size();
                    while (i2 < size) {
                    }
                    bnic a10222 = j9222.mo67751a();
                    synchronized (a5.f41765e) {
                    }
                }
                if (qnu != null) {
                }
                bnia j92222 = bnic.m109500j();
                size = list.size();
                while (i2 < size) {
                }
                bnic a102222 = j92222.mo67751a();
                synchronized (a5.f41765e) {
                }
            } catch (bxwf e28) {
                String valueOf9 = String.valueOf(e28);
                StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf9).length() + 84);
                sb15.append("Failed to parse chimera moduleset or server-requested features from phenotype flag: ");
                sb15.append(valueOf9);
                Log.e("ChimeraConfigurator", sb15.toString());
                qlp.m32393a().mo8861a(this.f41660a, 22, "ph");
                return false;
            }
        }
    }
}
