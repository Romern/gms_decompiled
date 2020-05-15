package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: ob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1236ob implements Iterator, Map.Entry {

    /* renamed from: a */
    int f26790a;

    /* renamed from: b */
    int f26791b;

    /* renamed from: c */
    boolean f26792c = false;

    /* renamed from: d */
    final /* synthetic */ C1238od f26793d;

    public C1236ob(C1238od odVar) {
        this.f26793d = odVar;
        this.f26790a = odVar.mo15496a() - 1;
        this.f26791b = -1;
    }

    public final boolean equals(Object obj) {
        if (this.f26792c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C1229nv.m19716a(entry.getKey(), this.f26793d.mo15498a(this.f26791b, 0)) || !C1229nv.m19716a(entry.getValue(), this.f26793d.mo15498a(this.f26791b, 1))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getKey() {
        if (this.f26792c) {
            return this.f26793d.mo15498a(this.f26791b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f26792c) {
            return this.f26793d.mo15498a(this.f26791b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f26791b < this.f26790a;
    }

    public final int hashCode() {
        int i;
        if (this.f26792c) {
            int i2 = 0;
            Object a = this.f26793d.mo15498a(this.f26791b, 0);
            Object a2 = this.f26793d.mo15498a(this.f26791b, 1);
            if (a != null) {
                i = a.hashCode();
            } else {
                i = 0;
            }
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            return i ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final void remove() {
        if (this.f26792c) {
            this.f26793d.mo15500a(this.f26791b);
            this.f26791b--;
            this.f26790a--;
            this.f26792c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f26792c) {
            return this.f26793d.mo15499a(this.f26791b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.f26791b++;
            this.f26792c = true;
            return this;
        }
        throw new NoSuchElementException();
    }
}
