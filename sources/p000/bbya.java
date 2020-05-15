package p000;

import java.util.List;

/* renamed from: bbya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbya extends bbym {

    /* renamed from: a */
    private final List f103737a;

    /* renamed from: b */
    private final List f103738b;

    /* renamed from: c */
    private final boolean f103739c;

    public bbya(List list, List list2, boolean z) {
        this.f103737a = list;
        this.f103738b = list2;
        this.f103739c = z;
    }

    /* renamed from: a */
    public final List mo56517a() {
        return this.f103737a;
    }

    /* renamed from: b */
    public final List mo56518b() {
        return this.f103738b;
    }

    /* renamed from: c */
    public final boolean mo56519c() {
        return this.f103739c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbym) {
            bbym bbym = (bbym) obj;
            return this.f103737a.equals(bbym.mo56517a()) && this.f103738b.equals(bbym.mo56518b()) && this.f103739c == bbym.mo56519c();
        }
    }

    public final int hashCode() {
        return ((((this.f103737a.hashCode() ^ 1000003) * 1000003) ^ this.f103738b.hashCode()) * 1000003) ^ (!this.f103739c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103737a);
        String valueOf2 = String.valueOf(this.f103738b);
        boolean z = this.f103739c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62 + String.valueOf(valueOf2).length());
        sb.append("PullMessagesResult{tachyonMessages=");
        sb.append(valueOf);
        sb.append(", ackIds=");
        sb.append(valueOf2);
        sb.append(", pulledAll=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
