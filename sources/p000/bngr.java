package p000;

import java.util.Collection;
import java.util.EnumSet;

/* renamed from: bngr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bngr extends bnic {

    /* renamed from: a */
    private final transient EnumSet f131604a;

    /* renamed from: b */
    private transient int f131605b;

    public bngr(EnumSet enumSet) {
        this.f131604a = enumSet;
    }

    /* renamed from: a */
    public static bnic m109334a(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return bnon.f131923a;
        }
        if (size != 1) {
            return new bngr(enumSet);
        }
        return bnic.m109489a(bnjd.m109587b(enumSet));
    }

    public final boolean contains(Object obj) {
        return this.f131604a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof bngr) {
            collection = ((bngr) collection).f131604a;
        }
        return this.f131604a.containsAll(collection);
    }

    /* renamed from: d */
    public final boolean mo67658d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bngr) {
            obj = ((bngr) obj).f131604a;
        }
        return this.f131604a.equals(obj);
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return false;
    }

    public final int hashCode() {
        int i = this.f131605b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f131604a.hashCode();
        this.f131605b = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f131604a.isEmpty();
    }

    public final int size() {
        return this.f131604a.size();
    }

    public final String toString() {
        return this.f131604a.toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bngq(this.f131604a);
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return bnjr.m109608a(this.f131604a.iterator());
    }
}
