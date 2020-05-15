package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: bhyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119908a;

    /* renamed from: b */
    final /* synthetic */ bhyu f119909b;

    /* renamed from: c */
    final /* synthetic */ bhyt f119910c;

    public bhyr(bhyt bhyt, Collection collection, bhyu bhyu) {
        this.f119910c = bhyt;
        this.f119908a = collection;
        this.f119909b = bhyu;
    }

    public final void run() {
        bhyt bhyt = this.f119910c;
        Collection<String> collection = this.f119908a;
        bhyu bhyu = this.f119909b;
        if (bhyt.f119917d != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String str : collection) {
                bhzl bhzl = (bhzl) bhyt.f119917d.mo25325a(str);
                if (bhzl != null) {
                    hashMap.put(str, bhzl);
                } else {
                    arrayList.add(str);
                }
            }
            bhyt.f119915b.execute(new bhys(bhyu, hashMap, arrayList));
        }
    }
}
