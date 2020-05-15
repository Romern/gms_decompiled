package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bhtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhtj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119545a;

    /* renamed from: b */
    final /* synthetic */ bhto f119546b;

    /* renamed from: c */
    final /* synthetic */ bhtl f119547c;

    public bhtj(bhtl bhtl, Collection collection, bhto bhto) {
        this.f119547c = bhtl;
        this.f119545a = collection;
        this.f119546b = bhto;
    }

    public final void run() {
        bhtl bhtl = this.f119547c;
        Collection collection = this.f119545a;
        bhto bhto = this.f119546b;
        bhsw bhsw = bhtl.f119551b;
        if (bhsw != null) {
            bhtl.f119557h.execute(new bhtk(bhto, bhsw.mo64242a((Set) new HashSet(collection))));
        }
    }
}
