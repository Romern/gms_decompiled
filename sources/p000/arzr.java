package p000;

import android.accounts.Account;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: arzr */
final /* synthetic */ class arzr implements Callable {

    /* renamed from: a */
    private final Map f88539a;

    /* renamed from: b */
    private final String f88540b;

    public arzr(Map map, String str) {
        this.f88539a = map;
        this.f88540b = str;
    }

    public final Object call() {
        Map map = this.f88539a;
        String str = this.f88540b;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            Account account = (Account) entry.getKey();
            try {
                if (((Boolean) bqga.m112780a((Future) entry.getValue())).booleanValue()) {
                    hashSet.add(account);
                    arzy.f88554a.mo25412b("%s has feature %s", account.name, str);
                }
            } catch (ExecutionException e) {
                arzy.f88554a.mo25417e("Failed to find %s status for %s", e, str, account.name);
            }
        }
        return hashSet;
    }
}
