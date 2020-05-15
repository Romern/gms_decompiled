package p000;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: aqpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpk {

    /* renamed from: a */
    public static final aqpk f86504a = new aqpk();

    /* renamed from: b */
    public final Map f86505b = new HashMap();

    private aqpk() {
    }

    /* renamed from: a */
    public final Set mo48031a(String str, Account account) {
        Set set = (Set) this.f86505b.get(new aqpj(str, account));
        if (set != null) {
            return bnfi.m109235a(set).mo67501a(aqpi.f86501a).mo67508c();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo48032b(String str, Account account) {
        return this.f86505b.containsKey(new aqpj(str, account));
    }

    /* renamed from: c */
    public final void mo48033c(String str, Account account) {
        this.f86505b.remove(new aqpj(str, account));
    }
}
