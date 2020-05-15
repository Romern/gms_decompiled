package p000;

import android.util.SparseArray;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpk extends dwm implements dvw, eei {

    /* renamed from: a */
    public boolean f13747a = false;

    /* renamed from: b */
    public final SparseArray f13748b = new SparseArray();

    /* renamed from: c */
    public long f13749c = dwq.m9665i().mo20505a();

    /* renamed from: d */
    public final Map f13750d = new HashMap();

    /* renamed from: e */
    public final dpo f13751e = new dpo();

    /* renamed from: f */
    public final List f13752f = new ArrayList();

    /* renamed from: g */
    public final SparseArray f13753g = new SparseArray();

    public dpk() {
        new dpr().mo9516a(dqy.m9123a("PushAnalyticsDataToServer"));
    }

    /* renamed from: a */
    public final void mo9384a(int i) {
        dpo dpo = this.f13751e;
        if (i == 1) {
            dpo.f13777a++;
        } else if (i == 2) {
            dpo.f13778b++;
        } else if (i != 3) {
            dpo.f13780d++;
        } else {
            dpo.f13779c++;
        }
        this.f13747a = true;
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
        long a = dwq.m9665i().mo20505a();
        dpq dpq = (dpq) this.f13748b.get(bxco.f162973bD);
        if (dpq == null) {
            new Object[1][0] = Integer.valueOf(bxco.f162973bD);
        } else if (dpq.f13791c) {
            int size = dpq.f13790b.size();
            if (size == 0) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                bnsl.mo68432a("dpq", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[ProducerStatusImpl] removedExistingInterest: no producer active intervals");
                return;
            }
            int i = size - 1;
            if (!((dpp) dpq.f13790b.get(i)).f13785b) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
                bnsl2.mo68432a("dpq", "a", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[ProducerStatusImpl] removedExistingInterest: latest is not active");
                return;
            }
            dpp dpp = (dpp) dpq.f13790b.get(i);
            if (dpp.f13785b) {
                for (HashMap hashMap : dpp.f13784a.mo9381b()) {
                    Iterator it = hashMap.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((dpg) it.next()).f13738b) {
                                return;
                            }
                        }
                    }
                }
                bxvd bxvd = dpp.f13788e;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bxhl bxhl = (bxhl) bxvd.f164949b;
                bxhl bxhl2 = bxhl.f163417d;
                bxhl.f163419a |= 2;
                bxhl.f163421c = a;
                dpp.f13785b = false;
                dpq.f13791c = false;
                this.f13747a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo9385a(int i, boolean z, int i2) {
        if (i >= 0) {
            dpl dpl = (dpl) this.f13753g.get(i);
            if (dpl == null) {
                dpl = new dpl(i);
                this.f13753g.put(i, dpl);
            }
            if (i2 != 1) {
                dpl.f13755b++;
                if (!z) {
                    dpl.f13757d++;
                }
            } else {
                dpl.f13756c++;
                if (!z) {
                    dpl.f13758e++;
                }
            }
            this.f13747a = true;
        }
    }

    /* renamed from: a */
    public final void mo9386a(bxco bxco, int i) {
        boolean z;
        dpo dpo = this.f13751e;
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                dpn a = dpo.mo9401a(bxco);
                if (bxco == a.f13765a) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34974b(z);
                switch (i) {
                    case 5:
                        a.f13766b++;
                        break;
                    case 6:
                        a.f13767c++;
                        break;
                    case 7:
                        a.f13770f++;
                        break;
                    case 8:
                        a.f13771g++;
                        break;
                    case 9:
                        a.f13773i++;
                        break;
                    case 10:
                        a.f13772h++;
                        break;
                    case 11:
                        a.f13768d++;
                        break;
                    case 12:
                        a.f13769e++;
                        break;
                    default:
                        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                        bnsl.mo68432a("dpn", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                        return;
                }
                this.f13747a = true;
                return;
            default:
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dpo", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
                return;
        }
    }

    /* renamed from: a */
    public final void mo9387a(bxco bxco, int i, int i2) {
        boolean z;
        dpn a = this.f13751e.mo9401a(bxco);
        boolean z2 = false;
        if (bxco == a.f13765a) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (i2 >= 0) {
            z2 = true;
        }
        sdo.m34974b(z2);
        if (i == 7) {
            a.f13775k += i2;
        } else if (i == 8) {
            a.f13776l += i2;
        } else if (i != 13) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dpn", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[GcmSyncStatisticsImpl] Context recd stats incorrect mode %d", i);
            return;
        } else {
            a.f13774j += i2;
        }
        this.f13747a = true;
    }

    /* renamed from: a */
    public final void mo9388a(ContextData contextData, ContextManagerClientInfo contextManagerClientInfo) {
        if (contextData.mo18022j().mo26615a() != 3) {
            dpq dpq = (dpq) this.f13748b.get(contextData.mo18018g());
            if (dpq == null) {
                new Object[1][0] = Integer.valueOf(contextData.mo18018g());
                return;
            }
            bxco h = contextData.mo18019h();
            if (h != dpq.f13789a) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                bnsl.mo68432a("dpq", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68411a("[ProducerStatusImpl] updateStateForNewContextData: mContextName=%s != contextName=%s", dpq.f13789a.f162973bD, h.f162973bD);
            } else if (!dpq.f13791c) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
                bnsl2.mo68432a("dpq", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("[ProducerStatusImpl] updateStateForNewContextData: inactive, contextName=%s", h.f162973bD);
            } else {
                int size = dpq.f13790b.size();
                if (size == 0) {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                    bnsl3.mo68432a("dpq", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68409a("[ProducerStatusImpl] updateStateForNewContextData: no elements, contextName=%s", h.f162973bD);
                    return;
                }
                dpp dpp = (dpp) dpq.f13790b.get(size - 1);
                if (!dpp.f13785b) {
                    bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
                    bnsl4.mo68432a("dpq", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68409a("[ProducerStatusImpl] updateStateForNewContextData: last not active, contextName=%s", h.f162973bD);
                    dpp.mo9404a();
                } else {
                    dpp.f13786c++;
                }
                this.f13747a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
        long a = dwq.m9665i().mo20505a();
        dpq dpq = (dpq) this.f13748b.get(bxco.f162973bD);
        if (dpq == null) {
            dpq = new dpq(bxco);
            this.f13748b.put(bxco.f162973bD, dpq);
        }
        if (!dpq.f13791c) {
            int size = dpq.f13790b.size();
            if (size <= 0 || !((dpp) dpq.f13790b.get(size - 1)).f13785b) {
                if (dpq.f13790b.add(new dpp(a))) {
                    int au = (int) cdgp.f180782a.mo6606a().mo77576au();
                    if (dpq.f13790b.size() >= au) {
                        dpq.f13790b.subList(0, au / 2).clear();
                    }
                    dpq.f13791c = true;
                    this.f13747a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
        long a = dwq.m9665i().mo20505a();
        dpq dpq = (dpq) this.f13748b.get(dwa.mo9747b().f162973bD);
        if (dpq == null) {
            new Object[1][0] = Integer.valueOf(dwa.mo9747b().f162973bD);
        } else if (dpq.mo9409b(dwa, a)) {
            this.f13747a = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, dwa]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
        long a = dwq.m9665i().mo20505a();
        dpq dpq = (dpq) this.f13748b.get(dwa.mo9747b().f162973bD);
        boolean z = false;
        if (dpq != null) {
            if (dwa.mo9747b() != dpq.f13789a) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                bnsl.mo68432a("dpq", "a", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68413a("[ProducerStatusImpl] addInterestRecord: context name mismatch: mContextName=%s, added=%s", dpq.f13789a.f162973bD, (Object) dwa);
            } else if (!dpq.f13791c) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
                bnsl2.mo68432a("dpq", "a", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[ProducerStatusImpl] addInterestRecord: not active: added=%s", dwa);
            } else {
                int size = dpq.f13790b.size();
                if (size == 0) {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                    bnsl3.mo68432a("dpq", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("[ProducerStatusImpl] addInterestRecord: no elements: added=%s", dwa);
                } else {
                    int i = size - 1;
                    if (!((dpp) dpq.f13790b.get(i)).f13785b) {
                        bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
                        bnsl4.mo68432a("dpq", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("[ProducerStatusImpl] addInterestRecord: producer inactive, added=%s", dwa);
                    } else {
                        dpp dpp = (dpp) dpq.f13790b.get(i);
                        if (dpp.f13785b) {
                            dpi dpi = new dpi(dwa.f14242b.mo9738a(), dwa.f14242b.mo9739b());
                            dpg dpg = new dpg(dwa, a);
                            dph dph = dpp.f13784a;
                            if (!dph.f13741a.containsKey(dpi) || !((HashMap) dph.f13741a.get(dpi)).containsKey(dpg.f13737a)) {
                                z = dpp.f13784a.mo9379a(dpi, dpg);
                            } else {
                                Object[] objArr = {dpi, dpg, dwa};
                            }
                        } else {
                            new Object[1][0] = dwa;
                        }
                    }
                }
            }
            if (dwa2 == null || dwa2.mo9747b() != dwa.mo9747b()) {
                if (!z) {
                    return;
                }
            } else if (!z || !dpq.mo9409b(dwa2, a)) {
                return;
            }
            this.f13747a = true;
            return;
        }
        new Object[1][0] = dwa;
    }

    /* renamed from: a */
    public final void mo9392a(String str, String str2, int i, int i2, int i3) {
        mo9393a(str, str2, i, i2, i3, -1);
    }

    /* renamed from: a */
    public final void mo9393a(String str, String str2, int i, int i2, int i3, int i4) {
        int i5;
        if (str != null && str2 != null) {
            dpi dpi = new dpi(str, str2);
            dpj dpj = (dpj) this.f13750d.get(dpi);
            if (dpj == null) {
                dpj = new dpj(dpi);
                this.f13750d.put(dpi, dpj);
            }
            if (i3 == 0) {
                i5 = 0;
            } else {
                i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            int i6 = i5 | i2;
            dpm dpm = (dpm) dpj.f13746c.get(i6);
            if (dpm == null) {
                dpm = new dpm(i6);
                dpj.f13746c.put(i6, dpm);
            }
            if (i != 0) {
                if (i == 3) {
                    dpm.f13760b++;
                    dpm.mo9396a(i4);
                } else if (i == 4) {
                    dpm.f13761c++;
                    dpm.mo9396a(i4);
                } else if (i != 5) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dpm", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[FenceTriggerStatsImpl] Incorrect operation code %d", i);
                    return;
                }
                this.f13747a = true;
            } else if (dpm.f13759a == 1) {
                dpm.f13762d++;
                this.f13747a = true;
            }
            dpm.f13763e++;
            this.f13747a = true;
        }
    }
}
