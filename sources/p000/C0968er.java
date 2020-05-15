package p000;

import java.util.List;

/* renamed from: er */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0968er {

    /* renamed from: a */
    public final String f15559a;

    /* renamed from: b */
    public final boolean f15560b;

    /* renamed from: c */
    public final List f15561c;

    public C0968er(String str, boolean z, List list) {
        this.f15559a = str;
        this.f15560b = z;
        this.f15561c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0968er) {
            C0968er erVar = (C0968er) obj;
            if (this.f15560b == erVar.f15560b && this.f15561c.equals(erVar.f15561c)) {
                if (this.f15559a.startsWith("index_")) {
                    return erVar.f15559a.startsWith("index_");
                }
                return this.f15559a.equals(erVar.f15559a);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (!this.f15559a.startsWith("index_")) {
            i = this.f15559a.hashCode();
        } else {
            i = -1184239155;
        }
        return (((i * 31) + (this.f15560b ? 1 : 0)) * 31) + this.f15561c.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.f15559a + "', unique=" + this.f15560b + ", columns=" + this.f15561c + '}';
    }
}
