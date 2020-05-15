package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bxwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxwl extends bxtc implements RandomAccess, bxwm {

    /* renamed from: b */
    private static final bxwl f164997b;

    /* renamed from: c */
    private final List f164998c;

    static {
        bxwl bxwl = new bxwl(10);
        f164997b = bxwl;
        bxwl.mo73671b();
    }

    public bxwl() {
        this(10);
    }

    /* renamed from: a */
    private static String m124099a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).mo73781l();
        }
        return bxwd.m124086b((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo73672c();
        this.f164998c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo73672c();
        if (collection instanceof bxwm) {
            collection = ((bxwm) collection).mo74191d();
        }
        boolean addAll = this.f164998c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public final Object mo74190b(int i) {
        return this.f164998c.get(i);
    }

    public final void clear() {
        mo73672c();
        this.f164998c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List mo74191d() {
        return Collections.unmodifiableList(this.f164998c);
    }

    /* renamed from: e */
    public final bxwm mo74192e() {
        return this.f164760a ? new bxyr(this) : this;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo73672c();
        return m124099a(this.f164998c.set(i, (String) obj));
    }

    public final int size() {
        return this.f164998c.size();
    }

    public bxwl(int i) {
        this(new ArrayList(i));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxwc mo73731c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f164998c);
            return new bxwl(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo73672c();
        Object remove = this.f164998c.remove(i);
        this.modCount++;
        return m124099a(remove);
    }

    private bxwl(ArrayList arrayList) {
        this.f164998c = arrayList;
    }

    /* renamed from: a */
    public final String get(int i) {
        Object obj = this.f164998c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString bxtx = (ByteString) obj;
            String l = bxtx.mo73781l();
            if (bxtx.mo73762f()) {
                this.f164998c.set(i, l);
            }
            return l;
        }
        byte[] bArr = (byte[]) obj;
        String b = bxwd.m124086b(bArr);
        if (bxwd.m124085a(bArr)) {
            this.f164998c.set(i, b);
        }
        return b;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: a */
    public final void mo74189a(ByteString bxtx) {
        mo73672c();
        this.f164998c.add(bxtx);
        this.modCount++;
    }
}
