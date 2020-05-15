package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* renamed from: bnpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnpc extends AbstractSet {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnpf.a(java.util.Set, java.util.Collection):boolean
     arg types: [bnpc, java.util.Collection]
     candidates:
      bnpf.a(java.lang.Enum, java.lang.Enum[]):bnic
      bnpf.a(java.util.Set, java.util.Set):bnpd
      bnpf.a(java.util.Set, java.lang.Object):boolean
      bnpf.a(java.util.Set, java.util.Iterator):boolean
      bnpf.a(java.util.Set, java.util.Collection):boolean */
    public boolean removeAll(Collection collection) {
        return bnpf.m110053a((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        bmxy.m108581a(collection);
        return super.retainAll(collection);
    }
}
