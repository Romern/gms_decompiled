package p000;

import android.accounts.Account;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: alug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alug implements alub {

    /* renamed from: a */
    static final allq f74299a;

    static {
        allp allp = new allp();
        allp.f73626a = 526;
        f74299a = allp.mo40491a();
    }

    /* renamed from: a */
    public static String m61886a(Account account) {
        return String.format("%s@%s", account.name, account.type);
    }

    /* renamed from: b */
    public static final alui m61887b(rkb rkb) {
        rmx rmx = (rmx) rkb;
        adyd a = adyd.m51363a(rmx.f43323c);
        rjx c = allr.m61236c(rmx.f43323c, f74299a);
        Account[] a2 = a.mo33916a("com.google");
        ArrayList arrayList = new ArrayList();
        bqgj b = snp.m35704b(9);
        for (Account account : a2) {
            arrayList.add(c.mo24701a((rpa) new allv(account, "com.android.contacts")).mo50366a(b, new aluf(account)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                arrayList2.add((Pair) aucu.m76783a((aucb) arrayList.get(i), 10, TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String a3 = m61886a(a2[i]);
                String valueOf = String.valueOf(e.getMessage());
                arrayList2.add(Pair.create(a3, valueOf.length() == 0 ? new String("Sync status lookup failed: ") : "Sync status lookup failed: ".concat(valueOf)));
            }
        }
        bnha h = bnhe.m109414h();
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList2.get(i2);
            h.mo67695b((String) pair.first, (String) pair.second);
        }
        return new alui("fsa2_sync_status", h.mo67618b());
    }

    /* renamed from: a */
    public final String mo40784a() {
        return "fsa2_sync_status";
    }

    /* renamed from: b */
    public final void mo40785b() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ alua mo40783a(rkb rkb) {
        return m61887b(rkb);
    }
}
