package p000;

import android.os.RemoteException;
import com.google.android.gms.drive.events.ChangeEvent;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;

/* renamed from: ujt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ujt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChangeEvent f47817a;

    /* renamed from: b */
    final /* synthetic */ ukk f47818b;

    public ujt(ChangeEvent changeEvent, ukk ukk) {
        this.f47817a = changeEvent;
        this.f47818b = ukk;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: 0x000c: INVOKE  (r4v0 ? I:java.util.Collection) = (r3v0 ubf) type: VIRTUAL call: ubf.a():java.util.Collection */
    public final void run() {
        uqe uqe = vpu.m41034a().f49775v;
        ChangeEvent changeEvent = this.f47817a;
        ukk ukk = this.f47818b;
        ubf ubf = uqe.f48516c;
        ? a = ubf.mo27068a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ubk ubk = ((ubn) a.get(i)).f47170d;
            uoz uoz = ubk.f47151l;
            if (uoz.mo27821a(changeEvent.f30770a)) {
                try {
                    uoz.mo27812a(changeEvent, ubf.f47119b.mo27402a(ubk.f47143d, ukk));
                } catch (uaa e) {
                }
            }
        }
        uqu uqu = uqe.f48515b;
        sdo.checkIfNull(ukk, "Entry can't be null for change events");
        HashSet<ums> hashSet = new HashSet();
        synchronized (uqu.f48563d) {
            Set set = (Set) uqu.f48563d.get(ukk);
            if (set != null) {
                hashSet.addAll(set);
            }
        }
        if (!hashSet.isEmpty()) {
            HashSet<ums> hashSet2 = new HashSet();
            for (ums ums : hashSet) {
                uey g = uqu.f48561b.mo27444g(ums.f48253b);
                if (g != null) {
                    try {
                        ujx a2 = uqu.f48561b.mo27402a(g, ukk);
                        String str = g.f47396c.f30764b;
                        try {
                            uqu.f48562c.mo27884a(str, changeEvent);
                            uqu.f48560a.mo25369a("Raised change event to subscription: %s", changeEvent);
                            uqu.mo27887a(25, g, a2);
                        } catch (Exception e2) {
                            uqu.f48560a.mo25378c("SubscriptionStore", String.format("Error raising changeEvent to one subscriber: %s", str), e2);
                        }
                    } catch (uaa e3) {
                    }
                } else {
                    hashSet2.add(ums);
                }
            }
            synchronized (uqu.f48563d) {
                for (ums ums2 : hashSet2) {
                    uqu.mo27895a(ums2.f48252a, ums2.f48253b);
                }
            }
        }
        HashSet<uou> hashSet3 = new HashSet();
        synchronized (uqu.f48564e) {
            hashSet3.addAll(uqu.f48564e);
        }
        if (!hashSet3.isEmpty()) {
            HashSet<ums> hashSet4 = new HashSet();
            for (uou uou : hashSet3) {
                ums ums3 = uou.f48432b;
                uey g2 = uqu.f48561b.mo27444g(ums3.f48253b);
                if (g2 != null) {
                    try {
                        try {
                            if (uou.f48431a.mo27842a(uqu.f48561b.mo27402a(g2, ukk))) {
                                uqu.f48560a.mo25371b("Raised changes available event to subscription");
                                uqu.mo27887a(47, g2, (ujx) null);
                                if (uou.mo27792c()) {
                                    ums3.f48256e = uqq.m39259a(uou.f48433c, uou.f48434d, uou.f48435e, uqu.f48561b.mo27426c(g2.f47394a));
                                    ums3.mo27725t();
                                } else {
                                    uqu.f48560a.mo25371b("Removing inactive changes available subscription");
                                    ums3.mo27726u();
                                    hashSet4.add(ums3);
                                }
                            }
                        } catch (RemoteException e4) {
                            uqu.f48560a.mo25378c("SubscriptionStore", "Error raising changes available event to one subscriber", e4);
                        }
                    } catch (uaa e5) {
                    } catch (JSONException e6) {
                        uqu.f48560a.mo25378c("SubscriptionStore", "Error serializing subscription details. Removing subscription", e6);
                        ums3.mo27726u();
                        hashSet4.add(ums3);
                    }
                } else {
                    hashSet4.add(ums3);
                }
            }
            synchronized (uqu.f48564e) {
                for (ums ums4 : hashSet4) {
                    uqu.mo27888a(ums4.f48253b);
                }
            }
        }
    }
}
