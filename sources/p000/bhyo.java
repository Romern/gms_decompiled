package p000;

import java.util.Map;

/* renamed from: bhyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119900a;

    /* renamed from: b */
    final /* synthetic */ bhyt f119901b;

    public bhyo(bhyt bhyt, Map map) {
        this.f119901b = bhyt;
        this.f119900a = map;
    }

    public final void run() {
        bhyt bhyt = this.f119901b;
        Map map = this.f119900a;
        if (bhyt.f119917d != null) {
            for (Map.Entry entry : map.entrySet()) {
                bhyt.f119917d.mo25327a((String) entry.getKey(), (bhzl) entry.getValue());
            }
        }
    }
}
