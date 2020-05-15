package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.SparseArray;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: dtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtl implements dtn, efy {

    /* renamed from: a */
    public final Context f13990a;

    /* renamed from: b */
    public final dto f13991b;

    /* renamed from: c */
    public final dse f13992c = new dse();

    /* renamed from: d */
    public boolean f13993d = cdgp.m133204m();

    /* renamed from: e */
    public final PlaceFenceHelper f13994e;

    /* renamed from: f */
    protected boolean f13995f = false;

    /* renamed from: g */
    private final PendingIntent f13996g;

    public dtl(Context context) {
        this.f13990a = context;
        this.f13991b = new dto(context, this, dwq.m9667k());
        Intent intent = new Intent("com.google.android.awareness.geofence.receiver");
        intent.setPackage("com.google.android.gms");
        this.f13996g = PendingIntent.getBroadcast(context, 1, intent, 0);
        dwq.m9644A().mo10082a(this, dwq.m9667k());
        this.f13994e = new PlaceFenceHelper(context);
    }

    /* renamed from: a */
    public static ContextManagerClientInfo m9292a(doh doh) {
        return dwq.m9652a(doh, "SERVER_FENCE_MODULE_ID");
    }

    /* renamed from: b */
    public final SparseArray mo9562b() {
        Set<dus> b = this.f13991b.mo9576b();
        SparseArray sparseArray = new SparseArray();
        for (dus dus : b) {
            dtf.m9280a(dus.mo9674t(), sparseArray);
        }
        return sparseArray;
    }

    /* renamed from: c */
    public final Set mo9563c() {
        return this.f13991b.mo9576b();
    }

    /* renamed from: d */
    public final void mo9564d() {
        mo9565e();
        this.f13991b.mo9579c();
    }

    /* renamed from: e */
    public final void mo9565e() {
        if (!this.f13995f) {
            aeie.m51876a(dwq.m9662f()).mo24741d(this.f13996g).mo50371a(new dqi("[FenceManager] remove all geofences.", new Object[0]));
            this.f13995f = true;
        }
    }

    /* renamed from: f */
    public final Collection mo9566f() {
        ArrayList arrayList = new ArrayList();
        for (drk drk : this.f13991b.mo9569a()) {
            if (m9294a(drk.f13876a.f13872a)) {
                arrayList.addAll(drk.mo9493d());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final Set m9293a(ego ego) {
        HashSet hashSet = null;
        for (int i = 0; i < ego.size(); i++) {
            for (dwa dwa : (Set) ego.valueAt(i)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(Integer.valueOf(dwa.mo9747b().f162973bD));
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m9294a(ContextManagerClientInfo contextManagerClientInfo) {
        return contextManagerClientInfo != null && "SERVER_FENCE_MODULE_ID".equals(contextManagerClientInfo.f30680d);
    }

    /* renamed from: a */
    public final Set mo9553a(int i) {
        return (Set) this.f13991b.f14003f.get(i);
    }

    /* renamed from: a */
    public final void mo9350a() {
        boolean m = cdgp.m133204m();
        if (this.f13993d != m) {
            new Object[1][0] = Boolean.valueOf(m);
            this.f13993d = m;
            dse dse = this.f13992c;
            dtl E = dwq.m9648E();
            if (E.f13993d) {
                for (Integer num : dse.f13927c) {
                    int intValue = num.intValue();
                    new Object[1][0] = Integer.valueOf(intValue);
                    dse.m9214a(E.mo9553a(intValue));
                }
                dse.f13927c.clear();
            } else {
                for (dus dus : E.mo9563c()) {
                    new Object[1][0] = dus;
                    E.mo9557a(dus);
                }
            }
            dwq.m9667k().mo9433a(dse);
            this.f13992c.mo9516a(dqy.m9123a("Fence scheduler operation."));
        }
    }

    /* renamed from: a */
    public final void mo9554a(long j, duu duu) {
        dwq.m9667k().mo9434a(new dth(this, duu), j, dqy.m9123a("EvaluateFences"));
    }

    /* renamed from: a */
    public final void mo9555a(Intent intent) {
        if (!intent.hasExtra("client_info_package_name") || !intent.hasExtra("client_info_account_name") || !intent.hasExtra("client_info_module_id") || !intent.hasExtra("context_fence_key")) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dtl", "a", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FenceManager] Server fence state reporting intent is not valid.");
            return;
        }
        String a = duu.m9452a(intent.getStringExtra("client_info_package_name"), intent.getStringExtra("client_info_account_name"), intent.getStringExtra("client_info_module_id"), intent.getStringExtra("context_fence_key"));
        drk a2 = this.f13991b.mo9568a(a);
        if (a2 != null) {
            doh g = a2.mo9470g();
            if (g != null) {
                duu b = this.f13991b.mo9575b(a);
                if (b != null) {
                    new efs(g, b).mo9446a();
                } else {
                    new Object[1][0] = a;
                }
            } else {
                new Object[1][0] = a;
            }
        } else {
            new Object[1][0] = a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r4.isEmpty() == false) goto L_0x0047;
     */
    /* renamed from: a */
    public final void mo9556a(dri dri) {
        ArrayList arrayList;
        Set<String> c;
        mo9565e();
        doh a = dri.mo9484a();
        dto dto = this.f13991b;
        drk drk = (drk) dto.f14001d.get(dri);
        HashSet hashSet = null;
        if (!(drk == null || (c = drk.mo9492c()) == null || c.isEmpty())) {
            arrayList = new ArrayList();
            for (String str : c) {
                arrayList.addAll(dto.f13999b.mo67361a(str));
            }
        }
        arrayList = null;
        dto dto2 = this.f13991b;
        drk drk2 = (drk) dto2.f14001d.remove(dri);
        if (drk2 != null) {
            for (String str2 : drk2.mo9492c()) {
                duu b = drk2.mo9491b(str2);
                dto2.mo9577b(b);
                dto2.mo9580c(b);
                dto2.mo9582e(str2);
                dwq.m9646C().mo10104a(dwq.m9665i().mo20505a(), b.f14118a, 12);
            }
            if (dri.f13873b == 2) {
                dtx dtx = dto2.f14002e;
                dtt dtt = (dtt) dtx.f14016c.get(dri.f13875d);
                if (dtt != null && !dtt.mo9588b().isEmpty()) {
                    Iterator it = new HashSet(dtt.mo9588b()).iterator();
                    while (it.hasNext()) {
                        dtx.mo9597a((String) it.next());
                    }
                }
            }
        }
        if (drk2 != null) {
            Object[] objArr = {a, drk2};
            dwq.m9674r().mo9722a(a, drk2);
            mo9560a((Collection) null, arrayList);
            for (String str3 : drk2.mo9492c()) {
                ego ego = drk2.mo9491b(str3).f14126i;
                if (ego != null) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    Set a2 = m9293a(ego);
                    if (a2 != null) {
                        hashSet.addAll(a2);
                    }
                }
            }
            mo9561a((Set) hashSet);
        }
    }

    /* renamed from: a */
    public final void mo9557a(dus dus) {
        duu duu = (duu) this.f13991b.f14004g.get(dus);
        if (duu == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dto", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FenceMapping] Did not find registration record for fence");
            return;
        }
        duu.mo9680a((List) null);
    }

    /* renamed from: a */
    public final void mo9558a(duu duu) {
        sdo.m34959a(duu);
        for (Map.Entry entry : this.f13991b.f14001d.entrySet()) {
            if (((drk) entry.getValue()).mo9493d().contains(duu)) {
                ((drk) entry.getValue()).mo9489a(((dri) entry.getKey()).mo9484a(), null, duu);
            }
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:163:0x0021 */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:82:0x01d3 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:64:0x0193 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:165:0x00ed */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:166:0x004f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:164:0x004f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:167:0x004f */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v14, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v17, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v19, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v21, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v22, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v24, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v28, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v29, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v30, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v31, resolved type: tnq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v34, resolved type: tnq} */
    /* JADX WARN: Type inference failed for: r21v2, assign insn: PHI: (r21v2 ?) = (r21v1 tnq), (r21v3 tnq), (r21v3 tnq), (r21v1 tnq) binds: [B:163:0x0021, B:162:0x0021, B:161:0x0021, B:160:0x0021] */
    /* JADX WARN: Type inference failed for: r21v7, assign insn: PHI: (r21v7 ?) = (r21v1 tnq), (r21v10 tnq) binds: [B:42:?, B:168:0x0145] */
    /* JADX WARN: Type inference failed for: r21v23, types: [int], assign insn: PHI: (r21v23 ?) = (r21v26 ?), (r21v27 ?) binds: [B:17:0x006e, B:16:0x0067] */
    /* JADX WARN: Type inference failed for: r21v25, types: [android.app.PendingIntent], assign insn: 0x00c8: MOVE  (r21v25 ? I:?[OBJECT, ARRAY]) = (r15v12 android.app.PendingIntent) */
    /* JADX WARN: Type inference failed for: r21v26, assign insn: 0x006e: CONST  (r21v26 ? I:?[int, float, short, byte, char]) = (-1 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r21v27, assign insn: 0x006b: MOVE  (r21v27 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13v8 int) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0272 A[Catch:{ Exception -> 0x031f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0275 A[Catch:{ Exception -> 0x031f }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0283 A[Catch:{ Exception -> 0x031f }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0203 A[Catch:{ Exception -> 0x031f }] */
    /* renamed from: a */
    public final void mo9559a(Collection collection) {
        tiw tiw;
        ContextManagerClientInfo contextManagerClientInfo;
        String str;
        Iterator it;
        tiu tiu;
        tiw tiw2;
        tnq tnq;
        tnq tnq2;
        TimeFilterImpl timeFilterImpl;
        KeyFilterImpl keyFilterImpl;
        tnq tnq3;
        String str2;
        ContextManagerClientInfo contextManagerClientInfo2;
        tnq tnq4;
        String str3 = "egb";
        mo9565e();
        if (collection != null && !collection.isEmpty()) {
            new Object[1][0] = Integer.valueOf(collection.size());
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                dtt dtt = (dtt) it2.next();
                String str4 = "dtl";
                tnq tnq5 = tnq5;
                if (dtt.mo9586a() != null) {
                    tnq5 = tnq5;
                    if (dtt.mo9586a().size() > 0) {
                        tnq5 = tnq5;
                        for (tnp tnp : dtt.mo9586a()) {
                            int i = spn.m35897i(this.f13990a, tnp.f46315c);
                            if (tnp.f46321i) {
                                tnq5 = Process.myPid();
                            } else {
                                tnq5 = -1;
                            }
                            if (i == -1) {
                                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                                bnsl.mo68432a(str4, "a", 491, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("[FenceManager] Could not find package: %s", bryx.m114908a(tnp.f46315c));
                            } else {
                                ContextManagerClientInfo contextManagerClientInfo3 = new ContextManagerClientInfo(tnp.f46316d, tnp.f46315c, i, tnp.f46317e, 0, -1, tnq5);
                                long j = m9294a(contextManagerClientInfo3) ? tnp.f46320h : 0;
                                lrk lrk = new lrk();
                                String str5 = tnp.f46318f;
                                bxcm bxcm = tnp.f46319g;
                                if (bxcm == null) {
                                    bxcm = bxcm.f162813z;
                                }
                                ContextFenceStub contextFenceStub = new ContextFenceStub(bxcm);
                                tnq5 = dtt.f14009a;
                                lrk.mo15391a(str5, j, contextFenceStub, tnq5);
                                new dsp(new dtk(contextManagerClientInfo3.f30678b), contextManagerClientInfo3, lrk.mo15389a()).mo9516a(dqy.m9124a("UpdateFenceRegistration", this.f13990a, tnp.f46315c));
                            }
                        }
                    }
                }
                tnq tnq6 = dtt.f14012d;
                if (tnq6 != null) {
                    int i2 = spn.m35897i(this.f13990a, tnq6.f46326c);
                    int myPid = tnq6.f46330g ? Process.myPid() : -1;
                    if (i2 == -1) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                        bnsl2.mo68432a(str4, "a", 529, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("[FenceManager] Could not find package: %s", tnq6.f46326c);
                    } else {
                        ContextManagerClientInfo contextManagerClientInfo4 = new ContextManagerClientInfo(tnq6.f46327d, tnq6.f46326c, i2, tnq6.f46328e, 0, -1, myPid);
                        tiw tiw3 = tnq6.f46329f;
                        if (tiw3 == null) {
                            tiw = tiw.f46154e;
                        } else {
                            tiw = tiw3;
                        }
                        if (tiw != null) {
                            try {
                                tit tit = new tit();
                                for (tiv tiv : tiw.f46157b) {
                                    int i3 = tiv.f46151c;
                                    if ((tiv.f46149a & 4) != 0) {
                                        tjb tjb = tiv.f46152d;
                                        if (tjb == null) {
                                            tjb = tjb.f46179c;
                                        }
                                        if (tjb != null) {
                                            try {
                                                tkb tkb = new tkb();
                                                it = it2;
                                                try {
                                                    if (tjb.f46181a.size() == 0) {
                                                        tnq4 = tnq6;
                                                        str = str4;
                                                        contextManagerClientInfo = contextManagerClientInfo4;
                                                    } else {
                                                        Iterator it3 = tjb.f46181a.iterator();
                                                        tnq tnq7 = tnq5;
                                                        while (it3.hasNext()) {
                                                            Iterator it4 = it3;
                                                            tja tja = (tja) it3.next();
                                                            str2 = str4;
                                                            contextManagerClientInfo2 = contextManagerClientInfo4;
                                                            try {
                                                                tnq7 = tnq6;
                                                                try {
                                                                    tkb.mo26622a(tja.f46177b, tja.f46178c);
                                                                    str4 = str2;
                                                                    it3 = it4;
                                                                    contextManagerClientInfo4 = contextManagerClientInfo2;
                                                                    tnq6 = tnq7;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    tnq3 = tnq7;
                                                                    try {
                                                                        bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                                                                        bnsl3.mo68437a(e);
                                                                        bnsl3.mo68432a(str3, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl3.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
                                                                        timeFilterImpl = null;
                                                                        if ((tiv.f46149a & 8) != 0) {
                                                                        }
                                                                        if (timeFilterImpl == null) {
                                                                        }
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        tnq2 = tnq5;
                                                                        bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
                                                                        bnsl4.mo68437a(e);
                                                                        bnsl4.mo68432a(str3, "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl4.mo68405a("[ContextManagerUtil] Could not create ContextDataFilterImpl from proto.");
                                                                        tiu = null;
                                                                        tnq = tnq2;
                                                                        if (tiu != null) {
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                tnq3 = tnq6;
                                                                bnsl bnsl32 = (bnsl) dss.f13961a.mo68387b();
                                                                bnsl32.mo68437a(e);
                                                                bnsl32.mo68432a(str3, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                bnsl32.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
                                                                timeFilterImpl = null;
                                                                if ((tiv.f46149a & 8) != 0) {
                                                                }
                                                                if (timeFilterImpl == null) {
                                                                }
                                                            }
                                                        }
                                                        tnq4 = tnq6;
                                                        str = str4;
                                                        contextManagerClientInfo = contextManagerClientInfo4;
                                                    }
                                                    if (tjb.f46182b.size() != 0) {
                                                        tkb.mo26623a(bqcn.m112584a(tjb.f46182b));
                                                    }
                                                    timeFilterImpl = tkb.mo26620a();
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    tnq3 = tnq6;
                                                    str2 = str4;
                                                    contextManagerClientInfo2 = contextManagerClientInfo4;
                                                    bnsl bnsl322 = (bnsl) dss.f13961a.mo68387b();
                                                    bnsl322.mo68437a(e);
                                                    bnsl322.mo68432a(str3, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl322.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
                                                    timeFilterImpl = null;
                                                    if ((tiv.f46149a & 8) != 0) {
                                                    }
                                                    if (timeFilterImpl == null) {
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                it = it2;
                                                tnq3 = tnq6;
                                                str2 = str4;
                                                contextManagerClientInfo2 = contextManagerClientInfo4;
                                                bnsl bnsl3222 = (bnsl) dss.f13961a.mo68387b();
                                                bnsl3222.mo68437a(e);
                                                bnsl3222.mo68432a(str3, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl3222.mo68405a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
                                                timeFilterImpl = null;
                                                if ((tiv.f46149a & 8) != 0) {
                                                }
                                                if (timeFilterImpl == null) {
                                                }
                                            }
                                        } else {
                                            it = it2;
                                            tnq5 = tnq6;
                                            str = str4;
                                            contextManagerClientInfo = contextManagerClientInfo4;
                                            timeFilterImpl = null;
                                        }
                                    } else {
                                        it = it2;
                                        tnq5 = tnq6;
                                        str = str4;
                                        contextManagerClientInfo = contextManagerClientInfo4;
                                        timeFilterImpl = null;
                                    }
                                    if ((tiv.f46149a & 8) != 0) {
                                        tiy tiy = tiv.f46153e;
                                        if (tiy == null) {
                                            tiy = tiy.f46165b;
                                        }
                                        if (tiy != null) {
                                            try {
                                                tjv tjv = new tjv();
                                                for (Iterator it5 = tiy.f46167a.iterator(); it5.hasNext(); it5 = it5) {
                                                    tix tix = (tix) it5.next();
                                                    tjv.f46220a.add(new KeyFilterImpl.Inclusion((String[]) tix.f46162a.toArray(new String[0]), (String[]) tix.f46163b.toArray(new String[0]), (String[]) tix.f46164c.toArray(new String[0])));
                                                }
                                                keyFilterImpl = tjv.mo26612a();
                                            } catch (Exception e6) {
                                                bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
                                                bnsl5.mo68437a(e6);
                                                bnsl5.mo68432a(str3, "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl5.mo68405a("[ContextManagerUtil] Could not convert ContextDataFilterProto.KeyFilter proto.");
                                                keyFilterImpl = null;
                                            }
                                        } else {
                                            keyFilterImpl = null;
                                        }
                                    } else {
                                        keyFilterImpl = null;
                                    }
                                    if (timeFilterImpl == null) {
                                        tit.mo26579a(i3);
                                        it2 = it;
                                        str4 = str;
                                        contextManagerClientInfo4 = contextManagerClientInfo;
                                        tnq6 = tnq5;
                                    } else if (keyFilterImpl != null) {
                                        sdo.m34959a(keyFilterImpl);
                                        if (tit.f46144a == null) {
                                            tit.f46144a = new HashSet();
                                        }
                                        tit.f46144a.add(new ContextDataFilterImpl.Inclusion(-1, i3, timeFilterImpl, keyFilterImpl));
                                        it2 = it;
                                        str4 = str;
                                        contextManagerClientInfo4 = contextManagerClientInfo;
                                        tnq6 = tnq5;
                                    } else {
                                        tit.mo26580a(i3, timeFilterImpl);
                                        it2 = it;
                                        str4 = str;
                                        contextManagerClientInfo4 = contextManagerClientInfo;
                                        tnq6 = tnq5;
                                    }
                                }
                                it = it2;
                                tnq = tnq6;
                                str = str4;
                                contextManagerClientInfo = contextManagerClientInfo4;
                                for (String str6 : tiw.f46158c) {
                                    if (tit.f46145b == null) {
                                        tit.f46145b = new HashSet();
                                    }
                                    tit.f46145b.add(str6);
                                }
                                tiz tiz = tiw.f46159d;
                                if (tiz == null) {
                                    tiz = tiz.f46168e;
                                }
                                if (tiz.f46172c > 0) {
                                    tiz tiz2 = tiw.f46159d;
                                    if (tiz2 == null) {
                                        tiz2 = tiz.f46168e;
                                    }
                                    tit.mo26582b(tiz2.f46172c);
                                }
                                tiz tiz3 = tiw.f46159d;
                                if (tiz3 == null) {
                                    tiz3 = tiz.f46168e;
                                }
                                if (tiz3.f46173d.size() != 0) {
                                    tiz tiz4 = tiw.f46159d;
                                    if (tiz4 == null) {
                                        tiz4 = tiz.f46168e;
                                    }
                                    tit.mo26581a(bqcn.m112584a(tiz4.f46173d));
                                }
                                tiu = tit.mo26578a();
                            } catch (Exception e7) {
                                e = e7;
                                it = it2;
                                tnq2 = tnq6;
                                str = str4;
                                contextManagerClientInfo = contextManagerClientInfo4;
                                bnsl bnsl42 = (bnsl) dss.f13961a.mo68387b();
                                bnsl42.mo68437a(e);
                                bnsl42.mo68432a(str3, "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl42.mo68405a("[ContextManagerUtil] Could not create ContextDataFilterImpl from proto.");
                                tiu = null;
                                tnq = tnq2;
                                if (tiu != null) {
                                }
                            }
                        } else {
                            it = it2;
                            tnq = tnq6;
                            str = str4;
                            contextManagerClientInfo = contextManagerClientInfo4;
                            tiu = null;
                        }
                        if (tiu != null) {
                            new dsl(new dtk("RegisterContextListenerOperation"), contextManagerClientInfo, new drc(new ContextManagerClientInfo(tnq5.f46327d, "com.google.android.gms", 0, "ContextListenerConsumer", 0, -1, 0), null, dtt.f14009a, (ContextDataFilterImpl) tiu)).mo9516a(dqy.m9124a("RegisterContextListener", this.f13990a, tnq5.f46326c));
                            it2 = it;
                            str3 = str3;
                        } else {
                            String str7 = str3;
                            tnq tnq8 = tnq5;
                            bnsl bnsl6 = (bnsl) dss.f13961a.mo68388c();
                            bnsl6.mo68432a(str, "a", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            if ((tnq8.f46324a & 16) != 0) {
                                tiw2 = tnq8.f46329f;
                                if (tiw2 == null) {
                                    tiw2 = tiw.f46154e;
                                }
                            } else {
                                tiw2 = null;
                            }
                            bnsl6.mo68420a("[FenceManager] Could not create ContextFilterImpl from proto: %s", tiw2);
                            it2 = it;
                            str3 = str7;
                        }
                    }
                }
            }
            this.f13991b.mo9579c();
            this.f13992c.mo9516a(dqy.m9123a("Fence scheduler operation."));
        }
    }

    /* renamed from: a */
    public final void mo9560a(Collection collection, Collection collection2) {
        boolean z;
        String str;
        boolean z2 = true;
        if (collection == null || collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (collection2 == null || collection2.isEmpty()) {
            z2 = false;
        }
        if (z2 || z) {
            dvp dvp = new dvp(collection, this.f13996g, collection2);
            if (!z || !z2) {
                str = !z ? "RemoveGeofenceOperation" : "AddGeofenceOperation";
            } else {
                str = "UpdateGeofenceOperation";
            }
            dvp.mo9516a(dqy.m9123a(str));
        }
    }

    /* renamed from: a */
    public final void mo9561a(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Iterator it2 = dwq.m9674r().f14223a.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((dwf) it2.next()).mo9768a(intValue)) {
                            break;
                        }
                    } else {
                        this.f13992c.f13927c.remove(Integer.valueOf(intValue));
                        break;
                    }
                }
            }
        }
    }
}
