package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ayac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayac implements Comparable {

    /* renamed from: a */
    public final axzf f96884a;

    /* renamed from: b */
    public int f96885b;

    /* renamed from: c */
    public axzf f96886c;

    /* renamed from: d */
    public boolean f96887d;

    /* renamed from: e */
    public final Map f96888e = new HashMap();

    /* renamed from: f */
    public final boolean f96889f;

    /* renamed from: g */
    public boolean f96890g;

    private ayac(axzf axzf, int i, boolean z) {
        this.f96884a = axzf;
        this.f96885b = i;
        this.f96889f = z;
    }

    /* renamed from: a */
    public final int compareTo(ayac ayac) {
        return this.f96884a.f96814a.compareTo(ayac.f96884a.f96814a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.f96884a.equals(((ayac) obj).f96884a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f96884a.hashCode();
    }

    public final String toString() {
        return mo53819a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ayac mo53818a() {
        ayac ayac = new ayac(this.f96884a, this.f96885b, this.f96889f);
        ayac.f96888e.putAll(this.f96888e);
        ayac.f96887d = this.f96887d;
        ayac.f96886c = this.f96886c;
        return ayac;
    }

    public ayac(axzf axzf, boolean z) {
        this.f96884a = axzf;
        this.f96889f = z;
    }

    /* renamed from: a */
    public final String mo53819a(boolean z) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("NodeInfo{");
        if (axzm.m83605a(this.f96889f, z, this)) {
            sb.append(this.f96884a.f96815b);
            sb.append(", ");
        }
        sb.append("id=");
        sb.append(this.f96884a.f96814a);
        sb.append(", isWatch=");
        sb.append(this.f96889f);
        sb.append(", isLeaf=");
        sb.append(this.f96890g);
        sb.append(", hops=");
        sb.append(this.f96885b);
        sb.append(", bestRoute=");
        if (this.f96886c != null && !axzm.m83605a(this.f96889f, z, (ayac) null)) {
            obj = this.f96886c.f96814a;
        } else {
            obj = this.f96886c;
        }
        sb.append(obj);
        sb.append(", connections[");
        boolean z2 = false;
        for (ayad ayad : this.f96888e.values()) {
            if (z2) {
                sb.append(",");
            }
            sb.append(ayad);
            z2 = true;
        }
        sb.append("]}");
        return sb.toString();
    }
}
