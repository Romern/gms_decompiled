package p000;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: bnfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnfd extends bnfp implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final int f131554a;

    /* renamed from: b */
    private final Queue f131555b;

    private bnfd(int i) {
        bmxy.m108591a(i >= 0, "maxSize (%s) must >= 0", i);
        this.f131555b = new ArrayDeque(i);
        this.f131554a = i;
    }

    /* renamed from: a */
    public static bnfd m109230a(int i) {
        return new bnfd(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Queue mo67492a() {
        return this.f131555b;
    }

    public final boolean add(Object obj) {
        bmxy.m108581a(obj);
        if (this.f131554a != 0) {
            if (size() == this.f131554a) {
                this.f131555b.remove();
            }
            this.f131555b.add(obj);
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.util.Collection, java.lang.Iterable):boolean
     arg types: [bnfd, java.lang.Iterable]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean */
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.f131554a) {
            return bnjr.m109612a(this, collection.iterator());
        }
        clear();
        return bnjd.m109582a((Collection) this, bnjd.m109590c(collection, size - this.f131554a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo9243b() {
        return this.f131555b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f131555b;
    }

    public final boolean contains(Object obj) {
        Queue queue = this.f131555b;
        bmxy.m108581a(obj);
        return queue.contains(obj);
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final boolean remove(Object obj) {
        Queue queue = this.f131555b;
        bmxy.m108581a(obj);
        return queue.remove(obj);
    }
}
