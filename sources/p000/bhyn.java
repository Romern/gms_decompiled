package p000;

import java.util.List;
import java.util.Map;

/* renamed from: bhyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119898a;

    /* renamed from: b */
    final /* synthetic */ bhyt f119899b;

    public bhyn(bhyt bhyt, Map map) {
        this.f119899b = bhyt;
        this.f119898a = map;
    }

    public final void run() {
        bhyt bhyt = this.f119899b;
        Map map = this.f119898a;
        if (bhyt.f119916c != null) {
            for (Map.Entry entry : map.entrySet()) {
                bhyt.f119916c.mo25327a((bhyw) entry.getKey(), (List) entry.getValue());
            }
        }
    }
}
