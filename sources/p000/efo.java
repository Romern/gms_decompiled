package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.contextmanager.service.ReportServerFenceStateIntentOperation;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: efo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efo extends dwu implements dqm {

    /* renamed from: a */
    private final tmi f14838a = tmi.m37203a(new efn(), (tmc) null);

    /* renamed from: b */
    private final doh f14839b;

    public efo(doh doh) {
        super("ReadServerFenceUpdatesOperation", "receive server fence updates", new Object[0]);
        sdo.m34959a(doh);
        this.f14839b = doh;
    }

    /* renamed from: a */
    private static void m10323a(Map map, doh doh, UpdateFenceOperation updateFenceOperation) {
        ArrayList arrayList = (ArrayList) map.get(doh);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(doh, arrayList);
        }
        arrayList.add(updateFenceOperation);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof efo) {
            return this.f14839b.equals(((efo) obj).f14839b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14839b});
    }

    /* renamed from: a */
    public final Future mo9446a() {
        sdo.m34970a(!isDone());
        dwq.m9679w().mo9818b(this.f14839b, dwq.m9648E().mo9566f(), this, dwq.m9667k(), dqy.m9123a("ReadServerFenceUpdatesOperation"));
        return this;
    }

    /* renamed from: a */
    public final void mo10076a(bxjg bxjg) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = bxjg.f163634b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bxkc bxkc = (bxkc) bxwc.get(i);
            if (bxkc.f163708b.isEmpty()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("efo", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[ReadServerFenceUpdatesOperation] Received FenceUpdateOperation with no account specified!");
            } else {
                int a = bxkb.m122792a(bxkc.f163709c);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 1) {
                    Object[] objArr = new Object[2];
                    bxjx bxjx = bxkc.f163707a;
                    if (bxjx == null) {
                        bxjx = bxjx.f163698d;
                    }
                    objArr[0] = bxjx;
                    bxcm bxcm = bxkc.f163710d;
                    if (bxcm == null) {
                        bxcm = bxcm.f162813z;
                    }
                    objArr[1] = bxcm;
                    doh doh = new doh(bxkc.f163708b);
                    doh doh2 = new doh(bxkc.f163708b);
                    bxjx bxjx2 = bxkc.f163707a;
                    if (bxjx2 == null) {
                        bxjx2 = bxjx.f163698d;
                    }
                    String str = bxjx2.f163701b;
                    bxjx bxjx3 = bxkc.f163707a;
                    if (bxjx3 == null) {
                        bxjx3 = bxjx.f163698d;
                    }
                    long j = bxjx3.f163702c;
                    bxcm bxcm2 = bxkc.f163710d;
                    if (bxcm2 == null) {
                        bxcm2 = bxcm.f162813z;
                    }
                    ContextFenceStub contextFenceStub = new ContextFenceStub(bxcm2);
                    dtl E = dwq.m9648E();
                    ContextManagerClientInfo a2 = dwq.m9652a(doh, "SERVER_FENCE_MODULE_ID");
                    Intent startIntent = IntentOperation.getStartIntent(dwq.m9662f(), ReportServerFenceStateIntentOperation.class, "com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE");
                    startIntent.putExtra("client_info_package_name", a2.f30678b);
                    startIntent.putExtra("client_info_account_name", a2.f30677a);
                    startIntent.putExtra("client_info_module_id", a2.f30680d);
                    m10323a(hashMap, doh2, UpdateFenceOperation.m22880a(str, j, contextFenceStub, PendingIntent.getService(E.f13990a, doh.hashCode(), startIntent, 134217728)));
                } else if (i2 != 2) {
                    new Object[1][0] = bxkc;
                } else {
                    Object[] objArr2 = new Object[1];
                    bxjx bxjx4 = bxkc.f163707a;
                    if (bxjx4 == null) {
                        bxjx4 = bxjx.f163698d;
                    }
                    objArr2[0] = bxjx4;
                    doh doh3 = new doh(bxkc.f163708b);
                    bxjx bxjx5 = bxkc.f163707a;
                    if (bxjx5 == null) {
                        bxjx5 = bxjx.f163698d;
                    }
                    m10323a(hashMap, doh3, UpdateFenceOperation.m22879a(bxjx5.f163701b));
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            dwq.m9670n().mo9501a(this.f14838a, dtl.m9292a((doh) entry.getKey()), new FenceUpdateRequestImpl(new ArrayList((Collection) entry.getValue())));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = ((bxjg) obj).f163634b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bxkc bxkc = (bxkc) bxwc.get(i);
            if (bxkc.f163708b.isEmpty()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("efo", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[ReadServerFenceUpdatesOperation] Received FenceUpdateOperation with no account specified!");
            } else {
                int a = bxkb.m122792a(bxkc.f163709c);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 1) {
                    Object[] objArr = new Object[2];
                    bxjx bxjx = bxkc.f163707a;
                    if (bxjx == null) {
                        bxjx = bxjx.f163698d;
                    }
                    objArr[0] = bxjx;
                    bxcm bxcm = bxkc.f163710d;
                    if (bxcm == null) {
                        bxcm = bxcm.f162813z;
                    }
                    objArr[1] = bxcm;
                    doh doh = new doh(bxkc.f163708b);
                    doh doh2 = new doh(bxkc.f163708b);
                    bxjx bxjx2 = bxkc.f163707a;
                    if (bxjx2 == null) {
                        bxjx2 = bxjx.f163698d;
                    }
                    String str = bxjx2.f163701b;
                    bxjx bxjx3 = bxkc.f163707a;
                    if (bxjx3 == null) {
                        bxjx3 = bxjx.f163698d;
                    }
                    long j = bxjx3.f163702c;
                    bxcm bxcm2 = bxkc.f163710d;
                    if (bxcm2 == null) {
                        bxcm2 = bxcm.f162813z;
                    }
                    ContextFenceStub contextFenceStub = new ContextFenceStub(bxcm2);
                    dtl E = dwq.m9648E();
                    ContextManagerClientInfo a2 = dwq.m9652a(doh, "SERVER_FENCE_MODULE_ID");
                    Intent startIntent = IntentOperation.getStartIntent(dwq.m9662f(), ReportServerFenceStateIntentOperation.class, "com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE");
                    startIntent.putExtra("client_info_package_name", a2.f30678b);
                    startIntent.putExtra("client_info_account_name", a2.f30677a);
                    startIntent.putExtra("client_info_module_id", a2.f30680d);
                    m10323a(hashMap, doh2, UpdateFenceOperation.m22880a(str, j, contextFenceStub, PendingIntent.getService(E.f13990a, doh.hashCode(), startIntent, 134217728)));
                } else if (i2 != 2) {
                    new Object[1][0] = bxkc;
                } else {
                    Object[] objArr2 = new Object[1];
                    bxjx bxjx4 = bxkc.f163707a;
                    if (bxjx4 == null) {
                        bxjx4 = bxjx.f163698d;
                    }
                    objArr2[0] = bxjx4;
                    doh doh3 = new doh(bxkc.f163708b);
                    bxjx bxjx5 = bxkc.f163707a;
                    if (bxjx5 == null) {
                        bxjx5 = bxjx.f163698d;
                    }
                    m10323a(hashMap, doh3, UpdateFenceOperation.m22879a(bxjx5.f163701b));
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            dwq.m9670n().mo9501a(this.f14838a, dtl.m9292a((doh) entry.getKey()), new FenceUpdateRequestImpl(new ArrayList((Collection) entry.getValue())));
        }
    }
}
