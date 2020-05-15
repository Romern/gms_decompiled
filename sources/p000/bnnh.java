package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: bnnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnnh extends bndq {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    transient bmzi f131861c;

    public bnnh(Map map, bmzi bmzi) {
        super(map);
        bmxy.m108581a(bmzi);
        this.f131861c = bmzi;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131861c = (bmzi) objectInputStream.readObject();
        mo67267a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f131861c);
        objectOutputStream.writeObject(((bndd) this).f131477a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo67121a() {
        return (Set) this.f131861c.mo6606a();
    }

    /* renamed from: e */
    public final Set mo67273e() {
        return mo67274f();
    }

    /* renamed from: k */
    public final Map mo67279k() {
        return mo67280l();
    }

    /* renamed from: a */
    public final Collection mo67122a(Object obj, Collection collection) {
        if (collection instanceof NavigableSet) {
            return new bnda(this, obj, (NavigableSet) collection, null);
        }
        if (collection instanceof SortedSet) {
            return new bndc(this, obj, (SortedSet) collection, null);
        }
        return new bndb(this, obj, (Set) collection);
    }

    /* renamed from: a */
    public final Collection mo67123a(Collection collection) {
        if (collection instanceof NavigableSet) {
            return bnpf.m110051a((NavigableSet) collection);
        }
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        return Collections.unmodifiableSet((Set) collection);
    }
}
