package p000;

import java.util.List;
import java.util.Map;

/* renamed from: bhyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119905a;

    /* renamed from: b */
    final /* synthetic */ List f119906b;

    /* renamed from: c */
    final /* synthetic */ bhyg f119907c;

    public bhyq(bhyg bhyg, Map map, List list) {
        this.f119907c = bhyg;
        this.f119905a = map;
        this.f119906b = list;
    }

    public final void run() {
        this.f119907c.mo64416a(this.f119905a, this.f119906b);
    }
}
