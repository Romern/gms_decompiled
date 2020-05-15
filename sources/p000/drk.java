package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: drk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class drk extends dra implements drb {

    /* renamed from: a */
    public final dri f13876a;

    /* renamed from: b */
    public final HashMap f13877b = new HashMap();

    /* renamed from: c */
    private final Object f13878c = new Object();

    /* renamed from: d */
    private boolean f13879d = true;

    public drk(dri dri) {
        super(dri.mo9484a());
        this.f13876a = dri;
    }

    /* renamed from: b */
    private final void m9149b(duu duu) {
        dus dus = duu.f14119b;
        ArrayList arrayList = new ArrayList();
        Set<Integer> m = dus.mo9667m();
        CountDownLatch countDownLatch = new CountDownLatch(m.size());
        for (Integer num : m) {
            int intValue = num.intValue();
            if (intValue != 26) {
                tmi a = tmi.m37202a(new drh(this, arrayList, intValue, countDownLatch, duu, m));
                SnapshotRequest snapshotRequest = new SnapshotRequest(0, null, intValue);
                if (intValue == 1) {
                    long b = cfag.m138525b();
                    snapshotRequest.f11733d = b;
                    new Object[1][0] = Long.valueOf(b);
                }
                new edn(a, this.f13876a.f13872a, snapshotRequest).mo9516a(dqy.m9123a("FenceListenerConsumer_snapshot"));
            } else {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("drk", "b", 441, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[FenceListenerConsumer] Fence-to-Snapshot DETECTED_BEACON not supported!");
                return;
            }
        }
    }

    /* renamed from: f */
    private final void m9150f() {
        synchronized (this.f13878c) {
            this.f13879d = false;
        }
        dwq.m9667k().mo9435a(new drf(this), dqy.m9123a("remove_canceled_consumer"));
    }

    /* renamed from: a */
    public final duu mo9488a(String str) {
        return (duu) this.f13877b.remove(str);
    }

    /* renamed from: a */
    public final void mo9473a(doh doh, Collection collection, dpv dpv, dqb dqb) {
    }

    /* renamed from: c */
    public final Set mo9492c() {
        return this.f13877b.keySet();
    }

    /* renamed from: d */
    public final Collection mo9493d() {
        return this.f13877b.values();
    }

    /* renamed from: e */
    public final boolean mo9494e() {
        return this.f13877b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drk) {
            return this.f13876a.equals(((drk) obj).f13876a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13876a.hashCode();
    }

    public final String toString() {
        String obj = super.toString();
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 12);
        sb.append(obj);
        sb.append("-");
        sb.append(identityHashCode);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo9472a(doh doh, ContextData contextData) {
        for (duu duu : mo9493d()) {
            mo9489a(doh, contextData, duu);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List, java.util.Collection], assign insn: 0x00da: IGET  (r2v14 ? I:java.util.Collection) = (r8v0 duu) duu.d java.util.Collection */
    /* renamed from: a */
    public final void mo9489a(doh doh, ContextData contextData, duu duu) {
        int i;
        doh doh2 = doh;
        duu duu2 = duu;
        new Object[1][0] = contextData;
        doh g = super.mo9470g();
        if (g == null || !g.equals(doh2)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("drk", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("[FenceListenerConsumer] Mismatched account name on deliver.  Expected %s, got %s", g, doh2);
            return;
        }
        dus dus = duu2.f14119b;
        int i2 = duu2.f14129l;
        if (contextData != null) {
            dus.mo9641a(contextData.mo18013c());
        }
        boolean z = dwq.m9648E().f13993d;
        int a = dus.mo9659a(dwq.m9665i().mo20505a(), z);
        if (z) {
            if (a != 0) {
                List list = dus.f14100j;
                Set m = dus.mo9667m();
                if (!sqw.m36041a((Collection) m) && cdgp.m133213v() > 0) {
                    list = new ArrayList(dus.f14100j);
                    list.addAll(m);
                }
                Collection collection = duu2.f14121d;
                if (collection != null) {
                    list.addAll(collection);
                }
                duu2.mo9680a(list);
            } else {
                List list2 = dus.f14099i;
                if (list2 != null && !list2.isEmpty()) {
                    Collections.sort(dus.f14099i, dtq.f14006a);
                    int a2 = dtq.m9327a(((dus) dus.f14099i.get(0)).f14074a);
                    List list3 = dus.f14099i;
                    int size = list3.size();
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < size) {
                        dus dus2 = (dus) list3.get(i3);
                        if (z2 && dtq.m9327a(dus2.f14074a) > a2) {
                            break;
                        }
                        int[] g2 = dus2.mo9652g();
                        int length = g2.length;
                        int i4 = 0;
                        while (true) {
                            i = i3 + 1;
                            if (i4 >= length) {
                                break;
                            }
                            z2 |= duu2.mo9679a(g2[i4]);
                            i4++;
                        }
                        i3 = i;
                    }
                } else {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("drk", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[FenceListenerConsumer] Unexpected fence value computed.");
                }
                ? r2 = duu2.f14121d;
                if (r2 != 0) {
                    int size2 = r2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        duu2.mo9679a(((Integer) r2.get(i5)).intValue());
                    }
                }
            }
        }
        if (duu2.f14128k != a) {
            Object[] objArr = {FenceState.m7188a(i2), FenceState.m7188a(duu2.f14128k), FenceState.m7188a(a)};
            long j = dus.f14101k;
            if (j > 0) {
                duu2.f14132o = j;
                Object[] objArr2 = {duu2.f14118a, Long.valueOf(dwq.m9665i().mo20505a() - duu2.f14132o)};
            } else {
                duu2.f14132o = dwq.m9665i().mo20505a();
            }
            duu2.f14128k = a;
            if (!sqw.m36041a((Collection) dus.mo9667m())) {
                dus dus3 = duu2.f14119b;
                ArrayList arrayList = new ArrayList();
                Set m2 = dus3.mo9667m();
                CountDownLatch countDownLatch = new CountDownLatch(m2.size());
                Iterator it = m2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (intValue == 26) {
                            bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                            bnsl3.mo68432a("drk", "b", 441, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("[FenceListenerConsumer] Fence-to-Snapshot DETECTED_BEACON not supported!");
                            break;
                        }
                        tmi a3 = tmi.m37202a(new drh(this, arrayList, intValue, countDownLatch, duu, m2));
                        SnapshotRequest snapshotRequest = new SnapshotRequest(0, null, intValue);
                        if (intValue == 1) {
                            long b = cfag.m138525b();
                            snapshotRequest.f11733d = b;
                            new Object[1][0] = Long.valueOf(b);
                        }
                        new edn(a3, this.f13876a.f13872a, snapshotRequest).mo9516a(dqy.m9123a("FenceListenerConsumer_snapshot"));
                    } else {
                        break;
                    }
                }
            } else {
                mo9490a(duu2);
            }
        }
        duu.m9453a(duu2, 4);
    }

    /* renamed from: b */
    public final duu mo9491b(String str) {
        return (duu) this.f13877b.get(str);
    }

    /* renamed from: b */
    public final boolean mo9474b() {
        boolean z;
        synchronized (this.f13878c) {
            z = this.f13879d;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0299  */
    /* renamed from: a */
    public final void mo9490a(duu duu) {
        int i;
        boolean z;
        int i2;
        String str;
        String str2;
        int i3;
        boolean z2;
        String str3;
        duu duu2 = duu;
        String str4 = duu2.f14118a;
        int i4 = duu2.f14129l;
        int i5 = duu2.f14128k;
        Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i5)};
        if (i4 != i5) {
            dus dus = duu2.f14119b;
            if (duu2.f14131n == null) {
                duu2.f14131n = new ArrayList();
            }
            boolean a = dus.mo9645a(duu2.f14131n, (Collection) null);
            if (!sqw.m36041a((Collection) dus.mo9667m())) {
                i = 1;
            } else {
                i = a ? 2 : 0;
            }
            if (dus.f14101k > 0) {
                z = a;
                i2 = (int) (dwq.m9665i().mo20505a() - dus.f14101k);
            } else {
                z = a;
                i2 = -1;
            }
            ContextManagerClientInfo contextManagerClientInfo = this.f13876a.f13872a;
            if (cdgp.m133203l()) {
                List list = dus.f14100j;
                int size = list.size();
                int i6 = 0;
                while (i6 < size) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    int a2 = dwq.m9668l().mo9355a(intValue, contextManagerClientInfo);
                    i6++;
                    if (a2 != 0) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("drk", "a", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68425a("[FenceListenerConsumer] Permission denied to notify %s of %s: %s", contextManagerClientInfo, Integer.valueOf(intValue), Integer.valueOf(a2));
                        return;
                    }
                }
            }
            dri dri = this.f13876a;
            int i7 = dri.f13873b;
            if (i7 == 1) {
                try {
                    if (contextManagerClientInfo.f30681e < 10200000) {
                        dri.f13874c.mo9520a(new FenceTriggerInfoImpl(i5 == 2, str4));
                        new Object[1][0] = Integer.valueOf(contextManagerClientInfo.f30681e);
                    } else {
                        str2 = "drk";
                        str = "a";
                        try {
                            dri.f13874c.mo9519a(new FenceStateImpl(i5, duu2.f14132o, str4, i4, duu2.f14131n));
                            new Object[1][0] = Integer.valueOf(contextManagerClientInfo.f30681e);
                        } catch (RemoteException e) {
                            e = e;
                            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68432a(str2, str, 325, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("[FenceListenerConsumer] Couldn't trigger fence listener; %s unreachable.", bryx.m114908a(duu2.f14123f));
                            dwq.m9649F().mo9392a(duu2.f14123f, duu2.f14125h, 5, i, 0);
                            m9150f();
                            dwq.m9646C().mo10104a(duu2.f14132o, duu2.f14118a, tnl.m37270a(i5));
                            if (z) {
                            }
                            duu2.f14131n = null;
                        }
                    }
                    dpk F = dwq.m9649F();
                    String str5 = duu2.f14123f;
                    String str6 = duu2.f14125h;
                    if (i5 == 2) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                    F.mo9393a(str5, str6, i3, i, 0, i2);
                } catch (RemoteException e2) {
                    e = e2;
                    str2 = "drk";
                    str = "a";
                    bnsl bnsl22 = (bnsl) dss.f13961a.mo68388c();
                    bnsl22.mo68437a(e);
                    bnsl22.mo68432a(str2, str, 325, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl22.mo68420a("[FenceListenerConsumer] Couldn't trigger fence listener; %s unreachable.", bryx.m114908a(duu2.f14123f));
                    dwq.m9649F().mo9392a(duu2.f14123f, duu2.f14125h, 5, i, 0);
                    m9150f();
                    dwq.m9646C().mo10104a(duu2.f14132o, duu2.f14118a, tnl.m37270a(i5));
                    if (z) {
                    }
                    duu2.f14131n = null;
                }
            } else if (i7 != 2) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                bnsl3.mo68432a("drk", "a", 394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("[FenceListenerConsumer] Unknown type=%s", this.f13876a.f13873b);
            } else {
                Object[] objArr2 = {str4, Integer.valueOf(i5)};
                Intent intent = new Intent();
                intent.putExtra("context_fence_current_state", i5);
                intent.putExtra("context_fence_previous_state", i4);
                intent.putExtra("context_fence_key", str4);
                intent.putExtra("context_fence_last_updated_time", duu2.f14132o);
                if (dus.f14074a == bxcl.SHUSH_STATE_FENCE && cdgp.f180782a.mo6606a().mo77538aC()) {
                    intent.setFlags(268435456);
                }
                if (!sqw.m36041a((Collection) duu2.f14131n)) {
                    sef.m35072a(duu2.f14131n, intent, "context_data_list");
                }
                if (i5 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intent.putExtra("is_triggered", z2);
                try {
                    PendingIntent pendingIntent = this.f13876a.f13875d;
                    if (!dus.f14097g) {
                        HashSet hashSet = new HashSet();
                        dus.mo9663a(hashSet);
                        if (!hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            char c = 65535;
                            str3 = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                int intValue2 = ((Integer) it.next()).intValue();
                                if (doi.m8936a(intValue2)) {
                                    str3 = "android.permission.ACCESS_FINE_LOCATION";
                                    break;
                                } else if (doi.m8938b(intValue2)) {
                                    str3 = "com.google.android.gms.permission.ACTIVITY_RECOGNITION";
                                    c = 6;
                                } else if (c != 6 && doi.m8941e(intValue2)) {
                                    str3 = "android.permission.BLUETOOTH";
                                    c = 26;
                                }
                            }
                        } else {
                            str3 = null;
                        }
                        dus.f14096f = str3;
                        dus.f14097g = true;
                    }
                    dqk.m9089a(pendingIntent, intent, dus.f14096f);
                    dwq.m9649F().mo9393a(duu2.f14123f, duu2.f14125h, i5 == 2 ? 3 : 4, i, 1, i2);
                } catch (PendingIntent.CanceledException e3) {
                    bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                    bnsl4.mo68437a(e3);
                    bnsl4.mo68432a("drk", "a", 380, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("[FenceListenerConsumer] Couldn't trigger fence; %s unreachable.", bryx.m114908a(duu2.f14123f));
                    dwq.m9649F().mo9392a(duu2.f14123f, duu2.f14125h, 5, i, 1);
                    m9150f();
                }
            }
            dwq.m9646C().mo10104a(duu2.f14132o, duu2.f14118a, tnl.m37270a(i5));
            if (z) {
                duu2.f14128k = 1;
                duu2.mo9681b(1);
            } else {
                duu2.mo9681b(i5);
            }
            duu2.f14131n = null;
        }
    }
}
