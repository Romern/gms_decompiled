package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: dpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpq {

    /* renamed from: a */
    public final bxco f13789a;

    /* renamed from: b */
    public final ArrayList f13790b;

    /* renamed from: c */
    public boolean f13791c = false;

    public dpq(bxco bxco) {
        this.f13789a = bxco;
        this.f13790b = new ArrayList();
    }

    /* renamed from: a */
    public final boolean mo9406a(long j) {
        if (!this.f13791c) {
            return false;
        }
        int size = this.f13790b.size();
        if (size == 0) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
            bnsl.mo68432a("dpq", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ProducerStatusImpl] removedExistingInterest: no producer active intervals");
            return false;
        }
        int i = size - 1;
        if (!((dpp) this.f13790b.get(i)).f13785b) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
            bnsl2.mo68432a("dpq", "a", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[ProducerStatusImpl] removedExistingInterest: latest is not active");
            return false;
        }
        dpp dpp = (dpp) this.f13790b.get(i);
        if (dpp.f13785b) {
            loop0:
            for (HashMap hashMap : dpp.f13784a.mo9381b()) {
                Iterator it = hashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((dpg) it.next()).f13738b) {
                            break loop0;
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
            bxhl.f163421c = j;
            dpp.f13785b = false;
            this.f13791c = false;
            return true;
        }
        return false;
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
    /* renamed from: b */
    public final boolean mo9409b(dwa dwa, long j) {
        dpg dpg;
        if (dwa.mo9747b() != this.f13789a) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
            bnsl.mo68432a("dpq", "b", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("[ProducerStatusImpl] removeInterestRecord: contextName different, mContextName=%s, removed=%s", this.f13789a.f162973bD, (Object) dwa);
            return false;
        } else if (!this.f13791c) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
            bnsl2.mo68432a("dpq", "b", 270, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[ProducerStatusImpl] removeInterestRecord: not active, removed=%s", dwa);
            return false;
        } else {
            int size = this.f13790b.size();
            if (size == 0) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                bnsl3.mo68432a("dpq", "b", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("[ProducerStatusImpl] removeInterestRecord: no producer active intervals, removed=%s", dwa);
                return false;
            }
            int i = size - 1;
            if (!((dpp) this.f13790b.get(i)).f13785b) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
                bnsl4.mo68432a("dpq", "b", 285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("[ProducerStatusImpl] removeInterestRecord: last producer active interval inactive, removed=%s", dwa);
                return false;
            }
            dpp dpp = (dpp) this.f13790b.get(i);
            if (!dpp.f13785b) {
                return false;
            }
            dpi dpi = new dpi(dwa.f14242b.mo9738a(), dwa.f14242b.mo9739b());
            if (!dpp.f13784a.mo9380a(dpi, dwa)) {
                return false;
            }
            dph dph = dpp.f13784a;
            if (dph.mo9380a(dpi, dwa)) {
                dpg = (dpg) ((HashMap) dph.f13741a.get(dpi)).get(dwa);
            } else {
                dpg = null;
            }
            return dpg.mo9377a(j);
        }
    }

    /* renamed from: a */
    public final boolean mo9407a(bxco bxco) {
        if (bxco != this.f13789a) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
            bnsl.mo68432a("dpq", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("[ProducerStatusImpl] updateStateForNewContextData: mContextName=%s != contextName=%s", this.f13789a.f162973bD, bxco.f162973bD);
            return false;
        } else if (!this.f13791c) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
            bnsl2.mo68432a("dpq", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("[ProducerStatusImpl] updateStateForNewContextData: inactive, contextName=%s", bxco.f162973bD);
            return false;
        } else {
            int size = this.f13790b.size();
            if (size == 0) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                bnsl3.mo68432a("dpq", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("[ProducerStatusImpl] updateStateForNewContextData: no elements, contextName=%s", bxco.f162973bD);
                return false;
            }
            dpp dpp = (dpp) this.f13790b.get(size - 1);
            if (dpp.f13785b) {
                dpp.f13786c++;
                return true;
            }
            bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
            bnsl4.mo68432a("dpq", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68409a("[ProducerStatusImpl] updateStateForNewContextData: last not active, contextName=%s", bxco.f162973bD);
            dpp.mo9404a();
            return true;
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
    public final boolean mo9408a(dwa dwa, long j) {
        if (dwa.mo9747b() != this.f13789a) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
            bnsl.mo68432a("dpq", "a", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("[ProducerStatusImpl] addInterestRecord: context name mismatch: mContextName=%s, added=%s", this.f13789a.f162973bD, (Object) dwa);
            return false;
        } else if (!this.f13791c) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
            bnsl2.mo68432a("dpq", "a", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[ProducerStatusImpl] addInterestRecord: not active: added=%s", dwa);
            return false;
        } else {
            int size = this.f13790b.size();
            if (size == 0) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68390d();
                bnsl3.mo68432a("dpq", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("[ProducerStatusImpl] addInterestRecord: no elements: added=%s", dwa);
                return false;
            }
            int i = size - 1;
            if (!((dpp) this.f13790b.get(i)).f13785b) {
                bnsl bnsl4 = (bnsl) dss.f13961a.mo68390d();
                bnsl4.mo68432a("dpq", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("[ProducerStatusImpl] addInterestRecord: producer inactive, added=%s", dwa);
                return false;
            }
            dpp dpp = (dpp) this.f13790b.get(i);
            if (dpp.f13785b) {
                dpi dpi = new dpi(dwa.f14242b.mo9738a(), dwa.f14242b.mo9739b());
                dpg dpg = new dpg(dwa, j);
                dph dph = dpp.f13784a;
                if (!dph.f13741a.containsKey(dpi) || !((HashMap) dph.f13741a.get(dpi)).containsKey(dpg.f13737a)) {
                    return dpp.f13784a.mo9379a(dpi, dpg);
                }
                Object[] objArr = {dpi, dpg, dwa};
                return false;
            }
            new Object[1][0] = dwa;
            return false;
        }
    }
}
