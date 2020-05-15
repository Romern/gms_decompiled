package p000;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: cija */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cija extends AbstractCollection implements Collection, Iterable {
    protected cija() {
    }

    /* renamed from: a */
    public abstract ciji iterator();

    /* renamed from: a */
    public boolean mo86143a(long j) {
        throw null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return mo86143a(((Long) obj).longValue());
    }

    /* renamed from: b */
    public boolean mo86145b(long j) {
        throw null;
    }

    /* renamed from: c */
    public boolean mo86146c(long j) {
        throw null;
    }

    @Deprecated
    public final boolean contains(Object obj) {
        if (obj != null) {
            return mo86145b(((Long) obj).longValue());
        }
        return false;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        if (obj != null) {
            return mo86146c(((Long) obj).longValue());
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ciji a = iterator();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(a.mo86151a()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
