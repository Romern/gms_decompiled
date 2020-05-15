package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bhzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119940a;

    /* renamed from: b */
    final /* synthetic */ bhzk f119941b;

    /* renamed from: c */
    final /* synthetic */ bhyg f119942c;

    public bhzg(bhzk bhzk, Collection collection, bhyg bhyg) {
        this.f119941b = bhzk;
        this.f119940a = collection;
        this.f119942c = bhyg;
    }

    public final void run() {
        bhzk bhzk = this.f119941b;
        Collection collection = this.f119940a;
        bhyg bhyg = this.f119942c;
        bhsw bhsw = bhzk.f119956g;
        if (bhsw != null) {
            bhzk.f119954e.execute(new bhzh(bhyg, bhsw.mo64242a((Set) new HashSet(collection))));
        }
    }
}
