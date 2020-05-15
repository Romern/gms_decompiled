package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bhzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119945a;

    /* renamed from: b */
    final /* synthetic */ bhyu f119946b;

    /* renamed from: c */
    final /* synthetic */ bhzk f119947c;

    public bhzi(bhzk bhzk, Collection collection, bhyu bhyu) {
        this.f119947c = bhzk;
        this.f119945a = collection;
        this.f119946b = bhyu;
    }

    public final void run() {
        bhzk bhzk = this.f119947c;
        Collection collection = this.f119945a;
        bhyu bhyu = this.f119946b;
        bhsw bhsw = bhzk.f119957h;
        if (bhsw != null) {
            bhzk.f119954e.execute(new bhzj(bhyu, bhsw.mo64242a((Set) new HashSet(collection))));
        }
    }
}
