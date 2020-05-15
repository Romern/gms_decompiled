package p000;

import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import java.util.Map;
import java.util.Set;

/* renamed from: gty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gty {

    /* renamed from: a */
    public static final sbw f19007a = new sbw("AccountTransfer", "[ATAuthenticatorProgressManager]");

    /* renamed from: b */
    public static final Object f19008b = new Object();

    /* renamed from: c */
    public static gty f19009c;

    /* renamed from: d */
    public final Object f19010d = new Object();

    /* renamed from: e */
    public Map f19011e = null;

    /* renamed from: f */
    public Map f19012f = null;

    /* renamed from: g */
    private final Map f19013g;

    public gty() {
        bnha bnha = new bnha();
        bnha.mo67695b("registered", 1);
        bnha.mo67695b("in_progress", 2);
        bnha.mo67695b("success", 3);
        bnha.mo67695b("failed", 3);
        bnha.mo67695b("escrowed", 3);
        this.f19013g = bnha.mo67618b();
    }

    /* renamed from: a */
    public static gty m13895a() {
        gty gty;
        synchronized (f19008b) {
            if (f19009c == null) {
                f19009c = new gty();
            }
            gty = f19009c;
        }
        return gty;
    }

    /* renamed from: a */
    public final void mo12216a(Context context) {
        Set keySet = gub.m13906a().mo12225a(context).keySet();
        C1223np npVar = new C1223np();
        for (Map.Entry entry : this.f19012f.entrySet()) {
            String str = (String) entry.getKey();
            if (((String) entry.getValue()).equals("in_progress") && !keySet.contains(str)) {
                npVar.put(str, "escrowed");
                this.f19012f.put(str, "escrowed");
            }
        }
        if (!npVar.isEmpty()) {
            gvh.m14000a(context, npVar, 1);
        }
    }

    /* renamed from: a */
    public final void mo12217a(Context context, int i) {
        if (i != 1) {
            if (this.f19011e == null) {
                this.f19011e = gvh.m14006d(context, i);
            }
        } else if (this.f19012f == null) {
            this.f19012f = gvh.m14006d(context, i);
        }
    }

    /* renamed from: a */
    public final void mo12218a(Context context, Map map, Map map2, int i) {
        C1223np npVar = new C1223np();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!map2.containsKey(str)) {
                String format = String.format("Account type:%s not found in existing object %s", str, new AccountTransferProgress(map2));
                f19007a.mo25380d("AccountTransfer", format, new Throwable(format));
            } else if (!str2.equals(map2.get(str))) {
                if (((Integer) this.f19013g.get(str2)).intValue() > ((Integer) this.f19013g.get((String) map2.get(str))).intValue()) {
                    npVar.put(str, str2);
                    map2.put(str, str2);
                }
            }
        }
        if (!npVar.isEmpty()) {
            gvh.m14000a(context, npVar, i);
        }
    }
}
