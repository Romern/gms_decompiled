package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.libs.vcdiff.VcDiffDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: efc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efc {
    /* JADX WARN: Failed to insert an additional move for type inference into block B:8:0x0035 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:249:0x0012 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:235:0x0483 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:205:0x0413 */
    /* JADX WARN: Type inference failed for: r5v0, assign insn: 0x000f: CONST  (r5v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v1, types: [int], assign insn: PHI: (r5v1 ?) = (r5v0 ?), (r5v3 ?) binds: [B:0:0x0000, B:249:0x0012] */
    /* JADX WARN: Type inference failed for: r5v3, assign insn: PHI: (r5v3 ?) = (r5v5 ?), (r5v15 ?), (r5v19 ?), (r5v32 ?) binds: [B:254:0x0012, B:253:0x0012, B:252:0x0012, B:251:0x0012] */
    /* JADX WARN: Type inference failed for: r5v5, assign insn: 0x04a4: CONST  (r5v5 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v11, assign insn: PHI: (r5v11 ?) = (r5v1 ?), (r5v14 ?) binds: [B:8:0x0035, B:217:0x043f] */
    /* JADX WARN: Type inference failed for: r5v14, assign insn: 0x043d: MOVE  (r5v14 ? I:?[OBJECT, ARRAY]) = ("efc") */
    /* JADX WARN: Type inference failed for: r5v15, assign insn: 0x042c: CONST  (r5v15 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v19, assign insn: 0x03fe: CONST  (r5v19 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v32, assign insn: 0x0362: CONST  (r5v32 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, long):void
     arg types: [java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, int):void
      bnsi.a(java.lang.String, java.lang.Object):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, long):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e7 A[Catch:{ bxwf -> 0x0433 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x030b A[Catch:{ bxwf -> 0x0433 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0147 A[Catch:{ bxwf -> 0x0433 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0169 A[Catch:{ bxwf -> 0x0433 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static WriteBatchImpl m10290a(doh doh, List list, bxik bxik, int i) {
        boolean z;
        Iterator it;
        String str;
        String str2;
        String str3;
        bxce bxce;
        bxco bxco;
        boolean z2;
        String str4;
        bxiq bxiq;
        WriteBatchImpl b = tjj.m37080b();
        efb efb = new efb(bxik);
        Iterator it2 = list.iterator();
        ? r5 = 0;
        boolean z3 = false;
        int i2 = 0;
        while (it2.hasNext()) {
            bxtx bxtx = (bxtx) it2.next();
            try {
                bxus c = bxus.m123744c();
                bxce bxce2 = bxce.f162766k;
                try {
                    bxuc h = bxtx.mo73764h();
                    bxvk bxvk = (bxvk) bxce2.mo74142c(4);
                    try {
                        bxxv a = bxxm.f165037a.mo74228a(bxvk);
                        a.mo74220a(bxvk, bxud.m123454a(h), c);
                        a.mo74225d(bxvk);
                        h.mo73787a((int) r5);
                        bxvk.m124027b(bxvk);
                        bxce bxce3 = (bxce) bxvk;
                        ContextData contextData = new ContextData(bxce3);
                        int m = contextData.mo18025m();
                        bxco h2 = contextData.mo18019h();
                        bxco a2 = bxco.m122577a(bxce3.f162772e);
                        if (a2 == null) {
                            a2 = bxco.UNKNOWN_CONTEXT_NAME;
                        }
                        if (a2 == bxco.CONTEXT_DELTA) {
                            try {
                                bxcf bxcf = bxce3.f162775h;
                                if (bxcf == null) {
                                    bxcf = bxcf.f162779a;
                                }
                                bxvj bxvj = bxkw.f163803f;
                                bxcf.mo74135a(bxvj);
                                if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                                    bxcf bxcf2 = bxce3.f162775h;
                                    if (bxcf2 == null) {
                                        bxcf2 = bxcf.f162779a;
                                    }
                                    bxvj bxvj2 = bxkw.f163803f;
                                    bxcf2.mo74135a(bxvj2);
                                    Object b2 = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                                    if (b2 == null) {
                                        b2 = bxvj2.f164956b;
                                    } else {
                                        bxvj2.mo74139a(b2);
                                    }
                                    bxkw bxkw = (bxkw) b2;
                                    bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                                    bnsl.mo68432a("efc", "a", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bxco a3 = bxco.m122577a(bxkw.f163805a);
                                    if (a3 == null) {
                                        a3 = bxco.UNKNOWN_CONTEXT_NAME;
                                    }
                                    bnsl.mo68420a("[CloudContextWriter] Handling delta context for context name = %s", a3);
                                    tka j = contextData.mo18022j();
                                    if (!VcDiffDecoder.f79290a) {
                                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                                        bnsl2.mo68432a("efe", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("[ContextDeltaHandler] VcDiff decoding library is not initialized!!!!");
                                        it = it2;
                                        z = z3;
                                        bxce = bxce3;
                                        bxco = h2;
                                        contextData = null;
                                    } else {
                                        byte[] k = bxkw.f163807c.mo73780k();
                                        if (k == null) {
                                            it = it2;
                                            z = z3;
                                            bxce = bxce3;
                                            bxco = h2;
                                        } else if (k.length > 0) {
                                            bxik bxik2 = bxkw.f163806b;
                                            if (bxik2 == null) {
                                                bxik2 = bxik.f163530b;
                                            }
                                            it = it2;
                                            try {
                                                bxco a4 = bxco.m122577a(bxkw.f163805a);
                                                if (a4 == null) {
                                                    try {
                                                        a4 = bxco.UNKNOWN_CONTEXT_NAME;
                                                    } catch (bxwf e) {
                                                    }
                                                }
                                                if (bxik2 != null) {
                                                    z = z3;
                                                    try {
                                                        if (bxik2.f163532a.size() != 0) {
                                                            Iterator it3 = bxik2.f163532a.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    break;
                                                                }
                                                                bxiq = (bxiq) it3.next();
                                                                Iterator it4 = it3;
                                                                bxco a5 = bxco.m122577a(bxiq.f163556b);
                                                                if (a5 == null) {
                                                                    a5 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                }
                                                                if (a5 == a4) {
                                                                    break;
                                                                }
                                                                it3 = it4;
                                                            }
                                                            if (bxiq != null) {
                                                                bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                                                                bnsl3.mo68432a("efe", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                bxco a6 = bxco.m122577a(bxkw.f163805a);
                                                                if (a6 == null) {
                                                                    a6 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                }
                                                                bnsl3.mo68420a("[ContextDeltaHandler] Received invalid delta context sync token for context = %s", a6);
                                                                bxce = bxce3;
                                                                bxco = h2;
                                                                contextData = null;
                                                            } else {
                                                                tit tit = new tit();
                                                                bxco a7 = bxco.m122577a(bxiq.f163556b);
                                                                if (a7 == null) {
                                                                    a7 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                }
                                                                int i3 = a7.f162973bD;
                                                                bxco = h2;
                                                                long a8 = dqt.m9097a(bxiq.f163557c);
                                                                bxce = bxce3;
                                                                tkb tkb = new tkb();
                                                                tkb.mo26622a(a8, a8);
                                                                tit.mo26580a(i3, tkb.mo26620a());
                                                                ArrayList arrayList = dwq.m9672p().mo10037a((ContextDataFilterImpl) tit.mo26578a(), dwq.m9652a(doh, "ContextDeltaHandler")).f14776b;
                                                                ContextData contextData2 = arrayList.size() > 0 ? (ContextData) arrayList.get(0) : null;
                                                                if (contextData2 == null) {
                                                                    bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
                                                                    bnsl4.mo68432a("efe", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bxco a9 = bxco.m122577a(bxkw.f163805a);
                                                                    if (a9 == null) {
                                                                        a9 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                    }
                                                                    bnsl4.mo68420a("[ContextDeltaHandler] No existing data for context name = %s", a9);
                                                                    contextData = null;
                                                                } else {
                                                                    byte[] nativeDecoder = VcDiffDecoder.nativeDecoder(contextData2.mo18023k(), k);
                                                                    if (nativeDecoder != null) {
                                                                        new Object[1][0] = Integer.valueOf(nativeDecoder.length);
                                                                        tip tip = new tip(contextData2.mo18017f(), contextData2.mo18018g(), contextData2.mo18021i());
                                                                        int i4 = (bxkw.f163808d << 3) | 2;
                                                                        sdo.m34959a(nativeDecoder);
                                                                        byte[] bArr = new byte[(bxuk.m123657i(i4) + bxuk.m123646d(nativeDecoder))];
                                                                        bxuk a10 = bxuk.m123637a(bArr);
                                                                        try {
                                                                            a10.mo73855d(i4);
                                                                            a10.mo73867c(nativeDecoder);
                                                                            bxuc a11 = bxuc.m123419a(bArr);
                                                                            bxvd bxvd = tip.f46141a;
                                                                            bxus c2 = bxus.m123744c();
                                                                            bxvk bxvk2 = (bxvk) bxcf.f162779a.mo74142c(4);
                                                                            try {
                                                                                bxxv a12 = bxxm.f165037a.mo74228a(bxvk2);
                                                                                a12.mo74220a(bxvk2, bxud.m123454a(a11), c2);
                                                                                a12.mo74225d(bxvk2);
                                                                                bxvk.m124027b(bxvk2);
                                                                                bxcf bxcf3 = (bxcf) bxvk2;
                                                                                if (bxvd.f164950c) {
                                                                                    bxvd.mo74035c();
                                                                                    bxvd.f164950c = false;
                                                                                }
                                                                                bxce bxce4 = (bxce) bxvd.f164949b;
                                                                                bxcf3.getClass();
                                                                                bxce4.f162775h = bxcf3;
                                                                                bxce4.f162768a |= 64;
                                                                            } catch (IOException e2) {
                                                                                if (!(e2.getCause() instanceof bxwf)) {
                                                                                    throw new bxwf(e2.getMessage());
                                                                                }
                                                                                throw ((bxwf) e2.getCause());
                                                                            } catch (RuntimeException e3) {
                                                                                if (e3.getCause() instanceof bxwf) {
                                                                                    throw ((bxwf) e3.getCause());
                                                                                }
                                                                                throw e3;
                                                                            } catch (IOException e4) {
                                                                                e = e4;
                                                                                Log.e("ContextData", "Could not write extension.", e);
                                                                                tip.mo26574a(j);
                                                                                contextData = tip.mo26570a();
                                                                                contextData.mo18010a(contextData2.mo18015e().mo26585c(), contextData2.mo18015e().f46200a.f162980e);
                                                                                if (contextData != null) {
                                                                                }
                                                                            }
                                                                        } catch (IOException e5) {
                                                                            e = e5;
                                                                            Log.e("ContextData", "Could not write extension.", e);
                                                                            tip.mo26574a(j);
                                                                            contextData = tip.mo26570a();
                                                                            contextData.mo18010a(contextData2.mo18015e().mo26585c(), contextData2.mo18015e().f46200a.f162980e);
                                                                            if (contextData != null) {
                                                                            }
                                                                        }
                                                                        tip.mo26574a(j);
                                                                        contextData = tip.mo26570a();
                                                                        contextData.mo18010a(contextData2.mo18015e().mo26585c(), contextData2.mo18015e().f46200a.f162980e);
                                                                    } else {
                                                                        contextData = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (bxwf e6) {
                                                        str2 = "efc";
                                                        z3 = z;
                                                        str = str2;
                                                        bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
                                                        bnsl5.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl5.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                        it2 = it;
                                                        r5 = 0;
                                                    }
                                                } else {
                                                    z = z3;
                                                }
                                                bxiq = null;
                                                if (bxiq != null) {
                                                }
                                            } catch (bxwf e7) {
                                                z = z3;
                                                str2 = "efc";
                                                z3 = z;
                                                str = str2;
                                                bnsl bnsl52 = (bnsl) dss.f13961a.mo68387b();
                                                bnsl52.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl52.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                it2 = it;
                                                r5 = 0;
                                            }
                                        } else {
                                            it = it2;
                                            z = z3;
                                            bxce = bxce3;
                                            bxco = h2;
                                        }
                                        bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                                        bnsl6.mo68432a("efe", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bxco a13 = bxco.m122577a(bxkw.f163805a);
                                        if (a13 == null) {
                                            a13 = bxco.UNKNOWN_CONTEXT_NAME;
                                        }
                                        bnsl6.mo68420a("[ContextDeltaHandler] Received invalid encoded differential for context = %s", a13);
                                        contextData = null;
                                    }
                                    if (contextData != null) {
                                        bxco a14 = bxco.m122577a(bxkw.f163805a);
                                        if (a14 == null) {
                                            a14 = bxco.UNKNOWN_CONTEXT_NAME;
                                        }
                                        m10291a(a14, 8, null);
                                        dpk F = dwq.m9649F();
                                        bxco a15 = bxco.m122577a(bxkw.f163805a);
                                        if (a15 == null) {
                                            a15 = bxco.UNKNOWN_CONTEXT_NAME;
                                        }
                                        F.mo9387a(a15, 8, m);
                                        z2 = true;
                                    } else {
                                        bnsl bnsl7 = (bnsl) dss.f13961a.mo68387b();
                                        bnsl7.mo68432a("efc", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bxco a16 = bxco.m122577a(bxkw.f163805a);
                                        if (a16 == null) {
                                            a16 = bxco.UNKNOWN_CONTEXT_NAME;
                                        }
                                        bnsl7.mo68409a("[CloudContextWriter] failed to decode delta for %s", a16.f162973bD);
                                        bxco a17 = bxco.m122577a(bxkw.f163805a);
                                        if (a17 == null) {
                                            a17 = bxco.UNKNOWN_CONTEXT_NAME;
                                        }
                                        dwq.m9666j().mo9831a(a17.f162973bD, 0);
                                        try {
                                            bxco a18 = bxco.m122577a(bxkw.f163805a);
                                            if (a18 == null) {
                                                a18 = bxco.UNKNOWN_CONTEXT_NAME;
                                            }
                                            m10291a(a18, 7, null);
                                            dpk F2 = dwq.m9649F();
                                            bxco a19 = bxco.m122577a(bxkw.f163805a);
                                            if (a19 == null) {
                                                a19 = bxco.UNKNOWN_CONTEXT_NAME;
                                            }
                                            F2.mo9387a(a19, 7, m);
                                            it2 = it;
                                            r5 = 0;
                                            z3 = true;
                                        } catch (bxwf e8) {
                                            str = "efc";
                                            z3 = true;
                                            bnsl bnsl522 = (bnsl) dss.f13961a.mo68387b();
                                            bnsl522.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl522.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                            it2 = it;
                                            r5 = 0;
                                        }
                                    }
                                } else {
                                    it = it2;
                                    z = z3;
                                    bnsl bnsl8 = (bnsl) dss.f13961a.mo68387b();
                                    bnsl8.mo68432a("efc", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl8.mo68405a("[CloudContextWriter] No delta extension!");
                                    it2 = it;
                                    z3 = z;
                                    r5 = 0;
                                }
                            } catch (bxwf e9) {
                                it = it2;
                                z = z3;
                                str2 = "efc";
                                z3 = z;
                                str = str2;
                                bnsl bnsl5222 = (bnsl) dss.f13961a.mo68387b();
                                bnsl5222.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl5222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                it2 = it;
                                r5 = 0;
                            }
                        } else {
                            it = it2;
                            z = z3;
                            bxce = bxce3;
                            bxco = h2;
                            z2 = false;
                        }
                        tka j2 = contextData.mo18022j();
                        if (j2 != null) {
                            tka a20 = dqt.m9102a(j2);
                            if (a20 != null) {
                                tip tip2 = new tip(contextData);
                                tip2.mo26574a(a20);
                                b.mo18101a(tip2.mo26570a());
                            } else {
                                b.mo18101a(contextData);
                            }
                            bxco bxco2 = bxco;
                            bxiq a21 = efb.mo10067a(bxco2);
                            if (a21 == null) {
                                bnsl bnsl9 = (bnsl) dss.f13961a.mo68387b();
                                bnsl9.mo68432a("efc", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl9.mo68420a("[CloudContextWriter] Found no sync token for context = %s", bxco2);
                                str4 = "efc";
                            } else {
                                str4 = "efc";
                                try {
                                    dwq.m9666j().mo9831a(bxco2.f162973bD, a21.f163557c);
                                } catch (bxwf e10) {
                                    str2 = str4;
                                    z3 = z;
                                    str = str2;
                                    bnsl bnsl52222 = (bnsl) dss.f13961a.mo68387b();
                                    bnsl52222.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl52222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                    it2 = it;
                                    r5 = 0;
                                }
                            }
                            if (a20 != null) {
                                j2 = a20;
                            }
                            try {
                                m10291a(bxco2, i, j2);
                                if (!z2) {
                                    dwq.m9649F().mo9387a(bxco2, 13, m);
                                }
                                i2++;
                                it2 = it;
                                z3 = z;
                                r5 = 0;
                            } catch (bxwf e11) {
                                str2 = str4;
                                z3 = z;
                                str = str2;
                                bnsl bnsl522222 = (bnsl) dss.f13961a.mo68387b();
                                bnsl522222.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl522222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                it2 = it;
                                r5 = 0;
                            }
                        } else {
                            String str5 = "efc";
                            bnsl bnsl10 = (bnsl) dss.f13961a.mo68387b();
                            str3 = str5;
                            try {
                                bnsl10.mo68432a(str3, "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bxco a22 = bxco.m122577a(bxce.f162772e);
                                if (a22 == null) {
                                    a22 = bxco.UNKNOWN_CONTEXT_NAME;
                                }
                                bnsl10.mo68420a("[CloudContextWriter] Could not find a valid time for context %s. Cannot proceed", a22);
                                it2 = it;
                                z3 = z;
                                r5 = 0;
                            } catch (bxwf e12) {
                                str2 = str3;
                            }
                        }
                    } catch (IOException e13) {
                        if (!(e13.getCause() instanceof bxwf)) {
                            throw new bxwf(e13.getMessage());
                        }
                        throw ((bxwf) e13.getCause());
                    } catch (RuntimeException e14) {
                        if (e14.getCause() instanceof bxwf) {
                            throw ((bxwf) e14.getCause());
                        }
                        throw e14;
                    } catch (bxwf e15) {
                        it = it2;
                        z = z3;
                        r5 = "efc";
                        throw e15;
                    } catch (bxwf e16) {
                        e = e16;
                        str3 = r5;
                        throw e;
                    }
                } catch (bxwf e17) {
                    e = e17;
                    it = it2;
                    z = z3;
                    str3 = "efc";
                    throw e;
                }
            } catch (bxwf e18) {
                it = it2;
            }
        }
        String str6 = "efc";
        if (z3) {
            bnsl bnsl11 = (bnsl) dss.f13961a.mo68390d();
            bnsl11.mo68432a(str6, "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl11.mo68415a("[CloudContextWriter] Found sync token resets. Scheduling download sync with delay = %s", 0L);
            dwq.m9682z().mo10068a();
        }
        if (i2 == 0) {
            return null;
        }
        return b;
        z = z3;
        str2 = "efc";
        z3 = z;
        str = str2;
        bnsl bnsl5222222 = (bnsl) dss.f13961a.mo68387b();
        bnsl5222222.mo68432a(str, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5222222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
        it2 = it;
        r5 = 0;
    }

    /* renamed from: a */
    private static void m10291a(bxco bxco, int i, tka tka) {
        if (tka != null) {
            long c = tka.mo26615a() == 2 ? tka.mo18096c() : tka.mo18097d();
            dpk F = dwq.m9649F();
            long a = dwq.m9665i().mo20505a() - c;
            dpo dpo = F.f13751e;
            if (a < 0) {
                dpo.f13782f.mo10092a((double) a);
            } else {
                dpo.f13781e.mo10092a((double) a);
            }
            F.f13747a = true;
        }
        dwq.m9649F().mo9386a(bxco, i);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:25:0x0093 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:293:0x0070 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:269:0x0523 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:239:0x049d */
    /* JADX WARN: Type inference failed for: r3v0, assign insn: 0x0006: CONST  (r3v0 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v1, assign insn: PHI: (r3v1 ?) = (r3v0 ?), (r3v3 ?) binds: [B:17:0x005f, B:293:0x0070] */
    /* JADX WARN: Type inference failed for: r3v3, assign insn: PHI: (r3v3 ?) = (r3v5 ?), (r3v17 ?), (r3v20 ?), (r3v22 ?) binds: [B:298:0x0070, B:297:0x0070, B:296:0x0070, B:295:0x0070] */
    /* JADX WARN: Type inference failed for: r3v5, assign insn: 0x054c: CONST  (r3v5 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v11, assign insn: PHI: (r3v11 ?) = (r3v1 ?), (r3v15 ?) binds: [B:25:0x0093, B:251:0x04d3] */
    /* JADX WARN: Type inference failed for: r3v15, assign insn: 0x04d1: MOVE  (r3v15 ? I:?[OBJECT, ARRAY]) = ("efc") */
    /* JADX WARN: Type inference failed for: r3v17, assign insn: 0x04ba: CONST  (r3v17 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v20, assign insn: 0x0485: CONST  (r3v20 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v22, assign insn: 0x03d2: CONST  (r3v22 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, long):void
     arg types: [java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, int):void
      bnsi.a(java.lang.String, java.lang.Object):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, long):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b5 A[Catch:{ bxwf -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d7 A[SYNTHETIC, Splitter:B:112:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0353 A[Catch:{ bxwf -> 0x04c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0377 A[Catch:{ bxwf -> 0x04c3 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static void m10292a(doh doh, bxii[] bxiiArr, List list, bxik bxik, int i) {
        int i2;
        boolean z;
        String str;
        Iterator it;
        String str2;
        String str3;
        String str4;
        bxco bxco;
        bxce bxce;
        boolean z2;
        String str5;
        bxce bxce2;
        bxiq bxiq;
        int length;
        doh doh2 = doh;
        bxii[] bxiiArr2 = bxiiArr;
        String str6 = "CloudContextWriter";
        ? r3 = 1;
        int i3 = 0;
        if (bxiiArr2 != null && (length = bxiiArr2.length) > 0) {
            new Object[1][0] = Integer.valueOf(length);
            tit tit = new tit();
            for (bxii bxii : bxiiArr2) {
                Object[] objArr = new Object[1];
                bxco a = bxco.m122577a(bxii.f163528a);
                if (a == null) {
                    a = bxco.UNKNOWN_CONTEXT_NAME;
                }
                objArr[0] = a;
                bxco a2 = bxco.m122577a(bxii.f163528a);
                if (a2 == null) {
                    a2 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                tit.mo26579a(a2.f162973bD);
            }
            tiu a3 = tit.mo26578a();
            new Object[1][0] = a3;
            dwq.m9672p().mo10041b((ContextDataFilterImpl) a3, dwq.m9652a(doh2, str6));
        }
        if (list != null && !list.isEmpty()) {
            WriteBatchImpl b = tjj.m37080b();
            efb efb = new efb(bxik);
            Iterator it2 = list.iterator();
            boolean z3 = false;
            int i4 = 0;
            while (it2.hasNext()) {
                bxtx bxtx = (bxtx) it2.next();
                try {
                    bxus c = bxus.m123744c();
                    bxce bxce3 = bxce.f162766k;
                    try {
                        bxuc h = bxtx.mo73764h();
                        bxvk bxvk = (bxvk) bxce3.mo74142c(4);
                        try {
                            bxxv a4 = bxxm.f165037a.mo74228a(bxvk);
                            a4.mo74220a(bxvk, bxud.m123454a(h), c);
                            a4.mo74225d(bxvk);
                            h.mo73787a(i3);
                            bxvk.m124027b(bxvk);
                            bxce bxce4 = (bxce) bxvk;
                            ContextData contextData = new ContextData(bxce4);
                            int m = contextData.mo18025m();
                            bxco h2 = contextData.mo18019h();
                            bxco a5 = bxco.m122577a(bxce4.f162772e);
                            if (a5 == null) {
                                a5 = bxco.UNKNOWN_CONTEXT_NAME;
                            }
                            if (a5 == bxco.CONTEXT_DELTA) {
                                try {
                                    bxcf bxcf = bxce4.f162775h;
                                    if (bxcf == null) {
                                        bxcf = bxcf.f162779a;
                                    }
                                    bxvj bxvj = bxkw.f163803f;
                                    bxcf.mo74135a(bxvj);
                                    if (bxcf.f164952m.mo73911a(bxvj.f164958d)) {
                                        bxcf bxcf2 = bxce4.f162775h;
                                        if (bxcf2 == null) {
                                            bxcf2 = bxcf.f162779a;
                                        }
                                        bxvj bxvj2 = bxkw.f163803f;
                                        bxcf2.mo74135a(bxvj2);
                                        it = it2;
                                        try {
                                            Object b2 = bxcf2.f164952m.mo73913b(bxvj2.f164958d);
                                            if (b2 == null) {
                                                try {
                                                    b2 = bxvj2.f164956b;
                                                } catch (bxwf e) {
                                                    str = str6;
                                                }
                                            } else {
                                                bxvj2.mo74139a(b2);
                                            }
                                            bxkw bxkw = (bxkw) b2;
                                            bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                                            bnsl.mo68432a("efc", "a", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            str = str6;
                                            try {
                                                bxco a6 = bxco.m122577a(bxkw.f163805a);
                                                if (a6 == null) {
                                                    a6 = bxco.UNKNOWN_CONTEXT_NAME;
                                                }
                                                bnsl.mo68420a("[CloudContextWriter] Handling delta context for context name = %s", a6);
                                                tka j = contextData.mo18022j();
                                                if (!VcDiffDecoder.f79290a) {
                                                    try {
                                                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                                                        bnsl2.mo68432a("efe", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl2.mo68405a("[ContextDeltaHandler] VcDiff decoding library is not initialized!!!!");
                                                        z = z3;
                                                        i2 = i4;
                                                        bxco = h2;
                                                        bxce = bxce4;
                                                        contextData = null;
                                                    } catch (bxwf e2) {
                                                        z = z3;
                                                        i2 = i4;
                                                        str3 = "efc";
                                                        z3 = z;
                                                        str2 = str3;
                                                        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                                                        bnsl3.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl3.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                        it2 = it;
                                                        str6 = str;
                                                        i4 = i2;
                                                        r3 = 1;
                                                        i3 = 0;
                                                    }
                                                } else {
                                                    byte[] k = bxkw.f163807c.mo73780k();
                                                    if (k == null) {
                                                        z = z3;
                                                        i2 = i4;
                                                        bxco = h2;
                                                        bxce2 = bxce4;
                                                    } else if (k.length > 0) {
                                                        bxik bxik2 = bxkw.f163806b;
                                                        if (bxik2 == null) {
                                                            bxik2 = bxik.f163530b;
                                                        }
                                                        z = z3;
                                                        try {
                                                            bxco a7 = bxco.m122577a(bxkw.f163805a);
                                                            if (a7 == null) {
                                                                try {
                                                                    a7 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                } catch (bxwf e3) {
                                                                    i2 = i4;
                                                                    str3 = "efc";
                                                                    z3 = z;
                                                                    str2 = str3;
                                                                    bnsl bnsl32 = (bnsl) dss.f13961a.mo68387b();
                                                                    bnsl32.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl32.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                                    it2 = it;
                                                                    str6 = str;
                                                                    i4 = i2;
                                                                    r3 = 1;
                                                                    i3 = 0;
                                                                }
                                                            }
                                                            if (bxik2 != null) {
                                                                bxce = bxce4;
                                                                if (bxik2.f163532a.size() != 0) {
                                                                    Iterator it3 = bxik2.f163532a.iterator();
                                                                    while (true) {
                                                                        if (!it3.hasNext()) {
                                                                            break;
                                                                        }
                                                                        bxiq = (bxiq) it3.next();
                                                                        Iterator it4 = it3;
                                                                        bxco a8 = bxco.m122577a(bxiq.f163556b);
                                                                        if (a8 == null) {
                                                                            a8 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                        }
                                                                        if (a8 == a7) {
                                                                            break;
                                                                        }
                                                                        it3 = it4;
                                                                    }
                                                                    if (bxiq != null) {
                                                                        bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
                                                                        bnsl4.mo68432a("efe", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bxco a9 = bxco.m122577a(bxkw.f163805a);
                                                                        if (a9 == null) {
                                                                            a9 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                        }
                                                                        bnsl4.mo68420a("[ContextDeltaHandler] Received invalid delta context sync token for context = %s", a9);
                                                                        i2 = i4;
                                                                        bxco = h2;
                                                                        contextData = null;
                                                                    } else {
                                                                        tit tit2 = new tit();
                                                                        bxco a10 = bxco.m122577a(bxiq.f163556b);
                                                                        if (a10 == null) {
                                                                            a10 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                        }
                                                                        int i5 = a10.f162973bD;
                                                                        i2 = i4;
                                                                        bxco = h2;
                                                                        try {
                                                                            long a11 = dqt.m9097a(bxiq.f163557c);
                                                                            tkb tkb = new tkb();
                                                                            tkb.mo26622a(a11, a11);
                                                                            tit2.mo26580a(i5, tkb.mo26620a());
                                                                            ArrayList arrayList = dwq.m9672p().mo10037a((ContextDataFilterImpl) tit2.mo26578a(), dwq.m9652a(doh2, "ContextDeltaHandler")).f14776b;
                                                                            ContextData contextData2 = arrayList.size() > 0 ? (ContextData) arrayList.get(0) : null;
                                                                            if (contextData2 == null) {
                                                                                bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
                                                                                bnsl5.mo68432a("efe", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                bxco a12 = bxco.m122577a(bxkw.f163805a);
                                                                                if (a12 == null) {
                                                                                    a12 = bxco.UNKNOWN_CONTEXT_NAME;
                                                                                }
                                                                                bnsl5.mo68420a("[ContextDeltaHandler] No existing data for context name = %s", a12);
                                                                                contextData = null;
                                                                            } else {
                                                                                byte[] nativeDecoder = VcDiffDecoder.nativeDecoder(contextData2.mo18023k(), k);
                                                                                if (nativeDecoder != null) {
                                                                                    new Object[1][0] = Integer.valueOf(nativeDecoder.length);
                                                                                    tip tip = new tip(contextData2.mo18017f(), contextData2.mo18018g(), contextData2.mo18021i());
                                                                                    int i6 = (bxkw.f163808d << 3) | 2;
                                                                                    sdo.m34959a(nativeDecoder);
                                                                                    byte[] bArr = new byte[(bxuk.m123657i(i6) + bxuk.m123646d(nativeDecoder))];
                                                                                    bxuk a13 = bxuk.m123637a(bArr);
                                                                                    try {
                                                                                        a13.mo73855d(i6);
                                                                                        a13.mo73867c(nativeDecoder);
                                                                                        bxuc a14 = bxuc.m123419a(bArr);
                                                                                        bxvd bxvd = tip.f46141a;
                                                                                        bxus c2 = bxus.m123744c();
                                                                                        bxvk bxvk2 = (bxvk) bxcf.f162779a.mo74142c(4);
                                                                                        try {
                                                                                            bxxv a15 = bxxm.f165037a.mo74228a(bxvk2);
                                                                                            a15.mo74220a(bxvk2, bxud.m123454a(a14), c2);
                                                                                            a15.mo74225d(bxvk2);
                                                                                            bxvk.m124027b(bxvk2);
                                                                                            bxcf bxcf3 = (bxcf) bxvk2;
                                                                                            if (bxvd.f164950c) {
                                                                                                bxvd.mo74035c();
                                                                                                bxvd.f164950c = false;
                                                                                            }
                                                                                            bxce bxce5 = (bxce) bxvd.f164949b;
                                                                                            bxcf3.getClass();
                                                                                            bxce5.f162775h = bxcf3;
                                                                                            bxce5.f162768a |= 64;
                                                                                        } catch (IOException e4) {
                                                                                            if (!(e4.getCause() instanceof bxwf)) {
                                                                                                throw new bxwf(e4.getMessage());
                                                                                            }
                                                                                            throw ((bxwf) e4.getCause());
                                                                                        } catch (RuntimeException e5) {
                                                                                            if (e5.getCause() instanceof bxwf) {
                                                                                                throw ((bxwf) e5.getCause());
                                                                                            }
                                                                                            throw e5;
                                                                                        } catch (IOException e6) {
                                                                                            e = e6;
                                                                                            Log.e("ContextData", "Could not write extension.", e);
                                                                                            tip.mo26574a(j);
                                                                                            contextData = tip.mo26570a();
                                                                                            contextData.mo18010a(contextData2.mo18015e().mo26585c(), contextData2.mo18015e().f46200a.f162980e);
                                                                                            if (contextData != null) {
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException e7) {
                                                                                        e = e7;
                                                                                        Log.e("ContextData", "Could not write extension.", e);
                                                                                        tip.mo26574a(j);
                                                                                        contextData = tip.mo26570a();
                                                                                        contextData.mo18010a(contextData2.mo18015e().mo26585c(), contextData2.mo18015e().f46200a.f162980e);
                                                                                        if (contextData != null) {
                                                                                        }
                                                                                    }
                                                                                    tip.mo26574a(j);
                                                                                    contextData = tip.mo26570a();
                                                                                    contextData.mo18010a(contextData2.mo18015e().mo26585c(), contextData2.mo18015e().f46200a.f162980e);
                                                                                } else {
                                                                                    contextData = null;
                                                                                }
                                                                            }
                                                                        } catch (bxwf e8) {
                                                                            str3 = "efc";
                                                                            z3 = z;
                                                                            str2 = str3;
                                                                            bnsl bnsl322 = (bnsl) dss.f13961a.mo68387b();
                                                                            bnsl322.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                            bnsl322.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                                            it2 = it;
                                                                            str6 = str;
                                                                            i4 = i2;
                                                                            r3 = 1;
                                                                            i3 = 0;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                bxce = bxce4;
                                                            }
                                                            bxiq = null;
                                                            if (bxiq != null) {
                                                            }
                                                        } catch (bxwf e9) {
                                                            i2 = i4;
                                                            str3 = "efc";
                                                            z3 = z;
                                                            str2 = str3;
                                                            bnsl bnsl3222 = (bnsl) dss.f13961a.mo68387b();
                                                            bnsl3222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl3222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                            it2 = it;
                                                            str6 = str;
                                                            i4 = i2;
                                                            r3 = 1;
                                                            i3 = 0;
                                                        }
                                                    } else {
                                                        z = z3;
                                                        i2 = i4;
                                                        bxco = h2;
                                                        bxce2 = bxce4;
                                                    }
                                                    bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                                                    bnsl6.mo68432a("efe", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bxco a16 = bxco.m122577a(bxkw.f163805a);
                                                    if (a16 == null) {
                                                        a16 = bxco.UNKNOWN_CONTEXT_NAME;
                                                    }
                                                    bnsl6.mo68420a("[ContextDeltaHandler] Received invalid encoded differential for context = %s", a16);
                                                    contextData = null;
                                                }
                                                if (contextData != null) {
                                                    bxco a17 = bxco.m122577a(bxkw.f163805a);
                                                    if (a17 == null) {
                                                        a17 = bxco.UNKNOWN_CONTEXT_NAME;
                                                    }
                                                    m10291a(a17, 8, null);
                                                    dpk F = dwq.m9649F();
                                                    bxco a18 = bxco.m122577a(bxkw.f163805a);
                                                    if (a18 == null) {
                                                        a18 = bxco.UNKNOWN_CONTEXT_NAME;
                                                    }
                                                    F.mo9387a(a18, 8, m);
                                                    z2 = true;
                                                } else {
                                                    bnsl bnsl7 = (bnsl) dss.f13961a.mo68387b();
                                                    bnsl7.mo68432a("efc", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bxco a19 = bxco.m122577a(bxkw.f163805a);
                                                    if (a19 == null) {
                                                        a19 = bxco.UNKNOWN_CONTEXT_NAME;
                                                    }
                                                    bnsl7.mo68409a("[CloudContextWriter] failed to decode delta for %s", a19.f162973bD);
                                                    bxco a20 = bxco.m122577a(bxkw.f163805a);
                                                    if (a20 == null) {
                                                        a20 = bxco.UNKNOWN_CONTEXT_NAME;
                                                    }
                                                    dwq.m9666j().mo9831a(a20.f162973bD, 0);
                                                    try {
                                                        bxco a21 = bxco.m122577a(bxkw.f163805a);
                                                        if (a21 == null) {
                                                            a21 = bxco.UNKNOWN_CONTEXT_NAME;
                                                        }
                                                        m10291a(a21, 7, null);
                                                        dpk F2 = dwq.m9649F();
                                                        bxco a22 = bxco.m122577a(bxkw.f163805a);
                                                        if (a22 == null) {
                                                            a22 = bxco.UNKNOWN_CONTEXT_NAME;
                                                        }
                                                        F2.mo9387a(a22, 7, m);
                                                        it2 = it;
                                                        str6 = str;
                                                        i4 = i2;
                                                        r3 = 1;
                                                        i3 = 0;
                                                        z3 = true;
                                                    } catch (bxwf e10) {
                                                        str2 = "efc";
                                                        z3 = true;
                                                        bnsl bnsl32222 = (bnsl) dss.f13961a.mo68387b();
                                                        bnsl32222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl32222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                        it2 = it;
                                                        str6 = str;
                                                        i4 = i2;
                                                        r3 = 1;
                                                        i3 = 0;
                                                    }
                                                }
                                            } catch (bxwf e11) {
                                                z = z3;
                                                i2 = i4;
                                                str3 = "efc";
                                                z3 = z;
                                                str2 = str3;
                                                bnsl bnsl322222 = (bnsl) dss.f13961a.mo68387b();
                                                bnsl322222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl322222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                                it2 = it;
                                                str6 = str;
                                                i4 = i2;
                                                r3 = 1;
                                                i3 = 0;
                                            }
                                        } catch (bxwf e12) {
                                            str = str6;
                                            z = z3;
                                            i2 = i4;
                                            str3 = "efc";
                                            z3 = z;
                                            str2 = str3;
                                            bnsl bnsl3222222 = (bnsl) dss.f13961a.mo68387b();
                                            bnsl3222222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl3222222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                            it2 = it;
                                            str6 = str;
                                            i4 = i2;
                                            r3 = 1;
                                            i3 = 0;
                                        }
                                    } else {
                                        str = str6;
                                        it = it2;
                                        z = z3;
                                        i2 = i4;
                                        bnsl bnsl8 = (bnsl) dss.f13961a.mo68387b();
                                        bnsl8.mo68432a("efc", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl8.mo68405a("[CloudContextWriter] No delta extension!");
                                        it2 = it;
                                        str6 = str;
                                        z3 = z;
                                        i4 = i2;
                                        r3 = 1;
                                        i3 = 0;
                                    }
                                } catch (bxwf e13) {
                                    str = str6;
                                    it = it2;
                                    z = z3;
                                    i2 = i4;
                                    str3 = "efc";
                                    z3 = z;
                                    str2 = str3;
                                    bnsl bnsl32222222 = (bnsl) dss.f13961a.mo68387b();
                                    bnsl32222222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl32222222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                    it2 = it;
                                    str6 = str;
                                    i4 = i2;
                                    r3 = 1;
                                    i3 = 0;
                                }
                            } else {
                                str = str6;
                                it = it2;
                                z = z3;
                                i2 = i4;
                                bxco = h2;
                                bxce = bxce4;
                                z2 = false;
                            }
                            tka j2 = contextData.mo18022j();
                            if (j2 != null) {
                                tka a23 = dqt.m9102a(j2);
                                if (a23 != null) {
                                    tip tip2 = new tip(contextData);
                                    tip2.mo26574a(a23);
                                    b.mo18101a(tip2.mo26570a());
                                } else {
                                    b.mo18101a(contextData);
                                }
                                bxco bxco2 = bxco;
                                bxiq a24 = efb.mo10067a(bxco2);
                                if (a24 == null) {
                                    bnsl bnsl9 = (bnsl) dss.f13961a.mo68387b();
                                    bnsl9.mo68432a("efc", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl9.mo68420a("[CloudContextWriter] Found no sync token for context = %s", bxco2);
                                    str5 = "efc";
                                } else {
                                    str5 = "efc";
                                    try {
                                        dwq.m9666j().mo9831a(bxco2.f162973bD, a24.f163557c);
                                    } catch (bxwf e14) {
                                        str3 = str5;
                                        z3 = z;
                                        str2 = str3;
                                        bnsl bnsl322222222 = (bnsl) dss.f13961a.mo68387b();
                                        bnsl322222222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl322222222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                        it2 = it;
                                        str6 = str;
                                        i4 = i2;
                                        r3 = 1;
                                        i3 = 0;
                                    }
                                }
                                if (a23 != null) {
                                    j2 = a23;
                                }
                                try {
                                    m10291a(bxco2, i, j2);
                                    if (!z2) {
                                        dwq.m9649F().mo9387a(bxco2, 13, m);
                                    }
                                    i4 = i2 + 1;
                                    it2 = it;
                                    str6 = str;
                                    z3 = z;
                                    r3 = 1;
                                    i3 = 0;
                                } catch (bxwf e15) {
                                    str3 = str5;
                                    z3 = z;
                                    str2 = str3;
                                    bnsl bnsl3222222222 = (bnsl) dss.f13961a.mo68387b();
                                    bnsl3222222222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3222222222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                                    it2 = it;
                                    str6 = str;
                                    i4 = i2;
                                    r3 = 1;
                                    i3 = 0;
                                }
                            } else {
                                String str7 = "efc";
                                bnsl bnsl10 = (bnsl) dss.f13961a.mo68387b();
                                str4 = str7;
                                try {
                                    bnsl10.mo68432a(str4, "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bxco a25 = bxco.m122577a(bxce.f162772e);
                                    if (a25 == null) {
                                        a25 = bxco.UNKNOWN_CONTEXT_NAME;
                                    }
                                    bnsl10.mo68420a("[CloudContextWriter] Could not find a valid time for context %s. Cannot proceed", a25);
                                    it2 = it;
                                    str6 = str;
                                    z3 = z;
                                    i4 = i2;
                                    r3 = 1;
                                    i3 = 0;
                                } catch (bxwf e16) {
                                    str3 = str4;
                                }
                            }
                        } catch (IOException e17) {
                            if (!(e17.getCause() instanceof bxwf)) {
                                throw new bxwf(e17.getMessage());
                            }
                            throw ((bxwf) e17.getCause());
                        } catch (RuntimeException e18) {
                            if (e18.getCause() instanceof bxwf) {
                                throw ((bxwf) e18.getCause());
                            }
                            throw e18;
                        } catch (bxwf e19) {
                            str = str6;
                            it = it2;
                            z = z3;
                            i2 = i4;
                            r3 = "efc";
                            throw e19;
                        } catch (bxwf e20) {
                            e = e20;
                            str4 = r3;
                            throw e;
                        }
                    } catch (bxwf e21) {
                        e = e21;
                        str = str6;
                        it = it2;
                        z = z3;
                        i2 = i4;
                        str4 = "efc";
                        throw e;
                    }
                } catch (bxwf e22) {
                    str = str6;
                    it = it2;
                    z = z3;
                    i2 = i4;
                    str3 = "efc";
                    z3 = z;
                    str2 = str3;
                    bnsl bnsl32222222222 = (bnsl) dss.f13961a.mo68387b();
                    bnsl32222222222.mo68432a(str2, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl32222222222.mo68405a("[CloudContextWriter] Could not deserialize context data.");
                    it2 = it;
                    str6 = str;
                    i4 = i2;
                    r3 = 1;
                    i3 = 0;
                }
            }
            String str8 = str6;
            int i7 = i4;
            String str9 = "efc";
            if (z3) {
                bnsl bnsl11 = (bnsl) dss.f13961a.mo68390d();
                bnsl11.mo68432a(str9, "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl11.mo68415a("[CloudContextWriter] Found sync token resets. Scheduling download sync with delay = %s", 0L);
                dwq.m9682z().mo10068a();
            }
            if (i7 == 0) {
                b = null;
            }
            if (b == null) {
                return;
            }
            if (TextUtils.isEmpty(doh2.f13690b)) {
                bnsl bnsl12 = (bnsl) dss.f13961a.mo68387b();
                bnsl12.mo68432a(str9, "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl12.mo68405a("[CloudContextWriter] Account name is empty.");
                return;
            }
            dwq.m9672p().mo10036a(b, dwq.m9652a(doh2, str8));
        }
    }

    /* renamed from: a */
    private static void m10293a(efb efb, bxco bxco) {
        bxiq a = efb.mo10067a(bxco);
        if (a != null) {
            dwq.m9666j().mo9831a(bxco.f162973bD, a.f163557c);
            return;
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("efc", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[CloudContextWriter] Found no sync token for context = %s", bxco);
    }
}
