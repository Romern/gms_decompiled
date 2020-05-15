package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: bhyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119902a;

    /* renamed from: b */
    final /* synthetic */ bhyt f119903b;

    /* renamed from: c */
    final /* synthetic */ bhyg f119904c;

    public bhyp(bhyt bhyt, Collection collection, bhyg bhyg) {
        this.f119903b = bhyt;
        this.f119902a = collection;
        this.f119904c = bhyg;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection], assign insn: 0x0002: IGET  (r1v0 ? I:java.util.Collection) = (r9v0 'this' bhyp A[THIS]) bhyp.a java.util.Collection */
    public final void run() {
        bhyt bhyt = this.f119903b;
        ? r1 = this.f119902a;
        bhyg bhyg = this.f119904c;
        if (bhyt.f119916c != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                bhyw bhyw = (bhyw) r1.get(i);
                List list = (List) bhyt.f119916c.mo25325a(bhyw);
                if (list != null) {
                    hashMap.put(bhyw, list);
                } else {
                    arrayList.add(bhyw);
                }
            }
            bhyt.f119915b.execute(new bhyq(bhyg, hashMap, arrayList));
        }
    }
}
