package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bkpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpw {

    /* renamed from: a */
    public final bkpx f125099a;

    /* renamed from: b */
    public final bkwz f125100b;

    /* renamed from: c */
    public final List f125101c;

    /* renamed from: d */
    public final List f125102d;

    /* renamed from: e */
    public final String f125103e;

    public bkpw(bkpx bkpx, bkwz bkwz, List list, Collection collection, String str) {
        bkww.m106781a(bkpx, "otManagerState");
        this.f125099a = bkpx;
        bkww.m106781a(bkwz, "documentAcl");
        this.f125100b = bkwz;
        bkww.m106781a(list, "snapshot");
        this.f125101c = list;
        this.f125102d = Collections.unmodifiableList(new ArrayList(collection));
        this.f125103e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bkpw)) {
            bkpw bkpw = (bkpw) obj;
            List list = this.f125102d;
            if (list != null) {
                if (!list.equals(bkpw.f125102d)) {
                    return false;
                }
            } else if (bkpw.f125102d != null) {
                return false;
            }
            if (this.f125099a.equals(bkpw.f125099a)) {
                List list2 = this.f125101c;
                if (list2 != null) {
                    if (!list2.equals(bkpw.f125101c)) {
                        return false;
                    }
                } else if (bkpw.f125101c != null) {
                    return false;
                }
                String str = this.f125103e;
                if (str != null) {
                    if (!str.equals(bkpw.f125103e)) {
                        return false;
                    }
                } else if (bkpw.f125103e != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f125102d;
        int i = 0;
        int hashCode = ((((((list != null ? list.hashCode() : 0) + 31) * 31) + this.f125100b.hashCode()) * 31) + this.f125099a.hashCode()) * 31;
        List list2 = this.f125101c;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f125103e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125099a);
        String valueOf2 = String.valueOf(this.f125100b);
        String valueOf3 = String.valueOf(this.f125101c);
        String valueOf4 = String.valueOf(this.f125102d);
        String str = this.f125103e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(str).length());
        sb.append("InitialLoadResult [otManagerState=");
        sb.append(valueOf);
        sb.append(", documentAcl=");
        sb.append(valueOf2);
        sb.append(", snapshot=");
        sb.append(valueOf3);
        sb.append(", initialSessions=");
        sb.append(valueOf4);
        sb.append(", xsrfToken=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
