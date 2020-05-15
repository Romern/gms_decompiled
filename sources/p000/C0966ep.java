package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: ep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0966ep {

    /* renamed from: a */
    public final String f15457a;

    /* renamed from: b */
    public final String f15458b;

    /* renamed from: c */
    public final String f15459c;

    /* renamed from: d */
    public final List f15460d;

    /* renamed from: e */
    public final List f15461e;

    public C0966ep(String str, String str2, String str3, List list, List list2) {
        this.f15457a = str;
        this.f15458b = str2;
        this.f15459c = str3;
        this.f15460d = Collections.unmodifiableList(list);
        this.f15461e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0966ep) {
            C0966ep epVar = (C0966ep) obj;
            if (this.f15457a.equals(epVar.f15457a) && this.f15458b.equals(epVar.f15458b) && this.f15459c.equals(epVar.f15459c) && this.f15460d.equals(epVar.f15460d)) {
                return this.f15461e.equals(epVar.f15461e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f15457a.hashCode() * 31) + this.f15458b.hashCode()) * 31) + this.f15459c.hashCode()) * 31) + this.f15460d.hashCode()) * 31) + this.f15461e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f15457a + "', onDelete='" + this.f15458b + "', onUpdate='" + this.f15459c + "', columnNames=" + this.f15460d + ", referenceColumnNames=" + this.f15461e + '}';
    }
}
