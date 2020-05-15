package p000;

import android.text.TextUtils;
import com.google.android.gms.mdns.MdnsSearchOptions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agak implements agbs {

    /* renamed from: a */
    private static final agcm f65073a = new agcm("MdnsDiscoveryManager");

    /* renamed from: b */
    private final agah f65074b;

    /* renamed from: c */
    private final agbt f65075c;

    /* renamed from: d */
    private final Map f65076d = new C1223np();

    public agak(agah agah, agbt agbt) {
        this.f65074b = agah;
        this.f65075c = agbt;
    }

    /* renamed from: a */
    public final synchronized void mo35132a(int i, int i2) {
        for (agbl agbl : this.f65076d.values()) {
            agbl.mo35189a(i, i2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo35133a(agat agat) {
        String[] strArr;
        agbl agbl;
        if (!agat.mo35156a().isEmpty()) {
            strArr = ((agar) agat.mo35156a().get(0)).f65092c;
        } else {
            strArr = null;
        }
        if (strArr != null) {
            Iterator it = this.f65076d.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                agbl = (agbl) it.next();
                String[] strArr2 = agbl.f65149c;
                if (Arrays.equals(strArr, strArr2) || (strArr.length == strArr2.length + 2 && strArr[1].equals("_sub") && agas.m53826a(strArr2, strArr))) {
                    agbl.mo35190a(agat);
                }
            }
            agbl.mo35190a(agat);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00fc, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo35134a(String str, agbb agbb) {
        boolean isEmpty;
        Timer timer;
        f65073a.mo35222a("Unregistering listener for service type: %s", str);
        agbl agbl = (agbl) this.f65076d.get(str);
        if (agbl != null) {
            synchronized (agbl.f65152f) {
                agbl.f65153g.remove(agbb);
                if (agbl.f65153g.isEmpty()) {
                    Future future = agbl.f65156j;
                    if (future != null) {
                        future.cancel(true);
                        agbl.f65156j = null;
                    }
                }
                isEmpty = agbl.f65153g.isEmpty();
            }
            if (isEmpty) {
                this.f65076d.remove(str);
                if (this.f65076d.isEmpty()) {
                    agbt agbt = this.f65075c;
                    agbt.f65168a.mo35221a("Stop discovery.");
                    if (agbt.f65182l != null || agbt.f65183m != null) {
                        if (cczu.f180328a.mo6606a().mo77125f()) {
                            synchronized (agbt.f65193w) {
                                agbt.f65193w.clear();
                            }
                            synchronized (agbt.f65194x) {
                                agbt.f65194x.clear();
                            }
                        }
                        agbt.f65175e.release();
                        agbt.f65181k = true;
                        agbt.f65168a.mo35221a("wait For Send Thread To Stop");
                        if (agbt.f65190t == null) {
                            bnsl bnsl = (bnsl) agbt.f65168a.f65218b.mo68388c();
                            bnsl.mo68432a("agbt", "g", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("socket thread is already dead.");
                        } else {
                            agbt.mo35201a(agbt.f65190t);
                            agbt.f65190t = null;
                            if (cczu.m132316c() && (timer = agbt.f65184n) != null) {
                                timer.cancel();
                                agbt.f65184n = null;
                                agbt.mo35206b(agbt.f65185o.getAndSet(0));
                            }
                        }
                        Thread thread = agbt.f65191u;
                        if (thread != null) {
                            agbt.mo35201a(thread);
                            agbt.f65191u = null;
                        }
                        Thread thread2 = agbt.f65192v;
                        if (thread2 != null) {
                            agbt.mo35201a(thread2);
                            agbt.f65192v = null;
                        }
                        synchronized (agbt.f65179i) {
                            agbt.f65182l = null;
                            agbt.f65183m = null;
                        }
                        synchronized (agbt.f65180j) {
                            Timer timer2 = agbt.f65186p;
                            if (timer2 != null) {
                                timer2.cancel();
                                agbt.f65186p = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo35135a(String str, agbb agbb, MdnsSearchOptions mdnsSearchOptions) {
        f65073a.mo35222a("Registering listener for subtypes: %s", TextUtils.join(",", mdnsSearchOptions.f80069a));
        if (this.f65076d.isEmpty()) {
            try {
                this.f65075c.mo35199a();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) f65073a.f65218b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("agak", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to start discover.");
                return;
            }
        }
        agbl agbl = (agbl) this.f65076d.get(str);
        if (agbl == null) {
            agbt agbt = this.f65075c;
            agah agah = this.f65074b;
            snf a = snp.m35703a(1, 10);
            agah.f65070a.add(a);
            agbl = new agbl(str, agbt, a);
            this.f65076d.put(str, agbl);
        }
        synchronized (agbl.f65152f) {
            if (!agbl.f65153g.contains(agbb)) {
                agbl.f65153g.add(agbb);
                for (agat agat : agbl.f65154h.values()) {
                    if (agat.mo35170i()) {
                        agbb.mo23435a(agbl.m53875a(agat, agbl.f65149c));
                    }
                }
            }
            Future future = agbl.f65156j;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = agbl.f65151e;
            List list = mdnsSearchOptions.f80069a;
            boolean z = mdnsSearchOptions.f80070b;
            long j = agbl.f65155i + 1;
            agbl.f65155i = j;
            agbl.f65156j = ((sny) scheduledExecutorService).submit(new agbj(agbl, new agbk(list, z, j)));
        }
    }
}
