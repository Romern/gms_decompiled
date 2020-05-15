package p000;

import java.util.List;
import java.util.Map;

/* renamed from: bhys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhys implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhyu f119911a;

    /* renamed from: b */
    final /* synthetic */ Map f119912b;

    /* renamed from: c */
    final /* synthetic */ List f119913c;

    public bhys(bhyu bhyu, Map map, List list) {
        this.f119911a = bhyu;
        this.f119912b = map;
        this.f119913c = list;
    }

    public final void run() {
        this.f119911a.mo64417a(this.f119912b, this.f119913c);
    }
}
