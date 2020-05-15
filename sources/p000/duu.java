package p000;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: duu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duu {

    /* renamed from: a */
    public final String f14118a;

    /* renamed from: b */
    public final dus f14119b;

    /* renamed from: c */
    public final long f14120c;

    /* renamed from: d */
    public final Collection f14121d;

    /* renamed from: e */
    public String f14122e;

    /* renamed from: f */
    public String f14123f;

    /* renamed from: g */
    public String f14124g;

    /* renamed from: h */
    public String f14125h;

    /* renamed from: i */
    public ego f14126i;

    /* renamed from: j */
    public SparseBooleanArray f14127j;

    /* renamed from: k */
    public int f14128k;

    /* renamed from: l */
    public int f14129l = 0;

    /* renamed from: m */
    public int f14130m;

    /* renamed from: n */
    public ArrayList f14131n;

    /* renamed from: o */
    public long f14132o;

    /* renamed from: p */
    public final long f14133p;

    /* renamed from: q */
    public int f14134q;

    public duu(ContextFenceRegistrationStub contextFenceRegistrationStub) {
        String str = contextFenceRegistrationStub.f30625a;
        long j = contextFenceRegistrationStub.f30627c;
        ContextFenceStub contextFenceStub = contextFenceRegistrationStub.f30626b;
        sdo.m34959a(contextFenceStub);
        dus dus = new dus(contextFenceStub.mo18035c());
        sdo.m34977c(str);
        this.f14118a = str;
        sdo.m34959a(dus);
        this.f14119b = dus;
        dus.f14077d = this;
        this.f14120c = j;
        long a = dwq.m9665i().mo20505a();
        this.f14132o = a;
        this.f14133p = a;
        this.f14134q = 0;
        ArrayList arrayList = null;
        this.f14131n = null;
        ArrayList arrayList2 = new ArrayList();
        this.f14119b.mo9645a((Collection) null, arrayList2);
        if (!arrayList2.isEmpty() && cdgp.f180782a.mo6606a().mo77593m()) {
            arrayList = arrayList2;
        }
        this.f14121d = arrayList;
    }

    /* renamed from: a */
    public static String m9451a(ContextManagerClientInfo contextManagerClientInfo, String str) {
        return m9452a(contextManagerClientInfo.f30678b, contextManagerClientInfo.f30677a, contextManagerClientInfo.f30680d, str);
    }

    /* renamed from: b */
    public final void mo9681b(int i) {
        this.f14130m = this.f14129l;
        this.f14129l = i;
        this.f14134q = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duu) {
            duu duu = (duu) obj;
            return TextUtils.equals(this.f14122e, duu.f14122e) && TextUtils.equals(this.f14118a, duu.f14118a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14118a, this.f14122e});
    }

    /* renamed from: a */
    public static String m9452a(String str, String str2, String str3, String str4) {
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(str4);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* renamed from: a */
    public static void m9453a(duu duu, int i) {
        dus dus = duu.f14119b;
        if (i == 4 && !dus.mo9647c()) {
            new Object[1][0] = duu.f14122e;
            return;
        }
        bxvd da = bxlr.f163883e.mo74144da();
        String str = duu.f14122e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxlr bxlr = (bxlr) da.f164949b;
        str.getClass();
        int i2 = bxlr.f163886a | 1;
        bxlr.f163886a = i2;
        bxlr.f163887b = str;
        bxcm bxcm = (bxcm) dus.f14076c;
        bxcm.getClass();
        bxlr.f163889d = bxcm;
        bxlr.f163886a = i2 | 4;
        bxvd da2 = bxlq.f163878d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxlq bxlq = (bxlq) da2.f164949b;
        bxlq.f163881b = i - 1;
        bxlq.f163880a |= 1;
        if (i == 4) {
            bxlo s = dus.mo9673s();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxlq bxlq2 = (bxlq) da2.f164949b;
            s.getClass();
            bxlq2.f163882c = s;
            bxlq2.f163880a |= 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxlr bxlr2 = (bxlr) da.f164949b;
        bxlq bxlq3 = (bxlq) da2.mo74062i();
        bxlq3.getClass();
        bxlr2.f163888c = bxlq3;
        bxlr2.f163886a |= 2;
        new Object[1][0] = da.mo74062i();
        if (m9454a(dus)) {
            dpf G = dwq.m9650G();
            bxlr bxlr3 = (bxlr) da.mo74062i();
            if (bxlr3 != null) {
                bxvd b = dpf.m9019b();
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                tjk tjk = (tjk) b.f164949b;
                tjk tjk2 = tjk.f46190i;
                bxlr3.getClass();
                tjk.f46199h = bxlr3;
                tjk.f46192a |= 64;
                G.mo9376a((tjk) b.mo74062i(), 7);
            }
        }
        tip tip = new tip(7, 10009, 1);
        tip.mo26572a(bxlr.f163884f, (bxlr) da.mo74062i());
        tip.mo26573a(tju.m37104a(duu.f14123f, duu.f14125h, duu.f14118a));
        ContextData a = tip.mo26570a();
        WriteBatchImpl b2 = tjj.m37080b();
        b2.mo18101a(a);
        ContextManagerClientInfo a2 = dwq.m9652a(doh.f13688a, "ContextFenceRegistration");
        a.mo18010a(a2.f30680d, dwq.m9678v().mo9974a(doh.f13688a, true).f14703a.f46294b);
        dwq.m9667k().mo9435a(new dut(b2, a2), dqy.m9123a("ContextFenceRegistration_write_to_store"));
    }

    /* renamed from: a */
    private static boolean m9454a(dus dus) {
        if (dus != null) {
            if (dus.mo9671q()) {
                return dus.f14074a == bxcl.PLACE_FENCE && dus.mo9649e() == 4;
            }
            for (dus dus2 : dus.mo9661a()) {
                if (m9454a(dus2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Set mo9678a() {
        HashSet hashSet = null;
        for (int i = 0; i < this.f14126i.size(); i++) {
            Iterator it = ((Set) this.f14126i.valueAt(i)).iterator();
            while (it.hasNext()) {
                dwa dwa = (dwa) it.next();
                if (dwa.m9589a(dwa, 6)) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dwa);
                    it.remove();
                }
            }
            if (((Set) this.f14126i.valueAt(i)).isEmpty()) {
                this.f14127j.put(this.f14126i.keyAt(i), false);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final boolean mo9679a(int i) {
        if (this.f14127j == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("duu", "a", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextFenceRegistration] Cannot add interest records; must first set activation state");
            return false;
        }
        Set set = (Set) this.f14126i.get(i);
        if (set == null) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("duu", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("[ContextFenceRegistration] Cannot find interest record for context %s!", i);
            return false;
        }
        dwq.m9674r().mo9727a(set, !cdgp.m133205n());
        if (this.f14127j.get(i, false)) {
            return false;
        }
        this.f14127j.put(i, true);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dvx.a(java.util.Collection, boolean):void
     arg types: [java.util.Collection, int]
     candidates:
      dvx.a(int, int):void
      dvx.a(doh, drb):void
      dvx.a(dvw, dqb):void
      dvx.a(dwa, boolean):void
      aerc.a(int, int):void
      dvx.a(java.util.Collection, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dvx.a(dwa, boolean):void
     arg types: [dwa, int]
     candidates:
      dvx.a(int, int):void
      dvx.a(doh, drb):void
      dvx.a(dvw, dqb):void
      dvx.a(java.util.Collection, boolean):void
      aerc.a(int, int):void
      dvx.a(dwa, boolean):void */
    /* renamed from: a */
    public final boolean mo9680a(List list) {
        boolean z;
        SparseBooleanArray sparseBooleanArray = this.f14127j;
        if (sparseBooleanArray == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("duu", "a", 432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextFenceRegistration] Cannot update interest records; must first set activation state");
            return false;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(sparseBooleanArray.size());
        for (int i = 0; i < this.f14127j.size(); i++) {
            sparseBooleanArray2.append(this.f14127j.keyAt(i), false);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (sparseBooleanArray2.indexOfKey(intValue) >= 0) {
                    sparseBooleanArray2.put(intValue, true);
                }
            }
        }
        dvx r = dwq.m9674r();
        boolean z2 = false;
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            int keyAt = sparseBooleanArray2.keyAt(i2);
            if (sparseBooleanArray2.valueAt(i2)) {
                Iterator it2 = ((Set) this.f14126i.get(keyAt)).iterator();
                long a = dwq.m9665i().mo20505a();
                while (it2.hasNext()) {
                    if (dwa.m9590a((dwa) it2.next(), a)) {
                        it2.remove();
                    }
                }
                r.mo9727a((Collection) this.f14126i.get(keyAt), false);
                z = !this.f14127j.valueAt(i2);
            } else {
                if (list != null && cdgp.m133208q()) {
                    for (dwa dwa : (Set) this.f14126i.get(keyAt)) {
                        if (dwa.mo9752f()) {
                            r.mo9731b(dwa);
                        } else {
                            r.mo9725a(dwa, false);
                        }
                    }
                } else {
                    r.mo9733b((Collection) this.f14126i.get(keyAt));
                }
                z = this.f14127j.valueAt(i2);
            }
            z2 |= z;
        }
        this.f14127j = sparseBooleanArray2;
        return z2;
    }
}
