package p000;

import java.util.List;

/* renamed from: bddu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddu extends bden {

    /* renamed from: a */
    private final bdeq f105385a;

    /* renamed from: b */
    private final bdeq f105386b;

    /* renamed from: c */
    private final List f105387c;

    /* renamed from: d */
    private final bdcr f105388d;

    /* renamed from: e */
    private final bdcw f105389e;

    public bddu(bdcr bdcr, bdeq bdeq, bdeq bdeq2, bdcw bdcw, List list) {
        this.f105388d = bdcr;
        this.f105385a = bdeq;
        this.f105386b = bdeq2;
        this.f105389e = bdcw;
        this.f105387c = list;
    }

    /* renamed from: a */
    public final bdeq mo57914a() {
        return this.f105385a;
    }

    /* renamed from: b */
    public final bdeq mo57915b() {
        return this.f105386b;
    }

    /* renamed from: c */
    public final List mo57916c() {
        return this.f105387c;
    }

    /* renamed from: d */
    public final bdcr mo57917d() {
        return this.f105388d;
    }

    /* renamed from: e */
    public final bdcw mo57918e() {
        return this.f105389e;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bden) {
            bden bden = (bden) obj;
            return this.f105388d.equals(bden.mo57917d()) && this.f105385a.equals(bden.mo57914a()) && this.f105386b.equals(bden.mo57915b()) && this.f105389e.equals(bden.mo57918e()) && ((list = this.f105387c) == null ? bden.mo57916c() == null : list.equals(bden.mo57916c()));
        }
    }

    public final int hashCode() {
        int hashCode = (((((((this.f105388d.hashCode() ^ 1000003) * 1000003) ^ this.f105385a.hashCode()) * 1000003) ^ this.f105386b.hashCode()) * 1000003) ^ this.f105389e.hashCode()) * 1000003;
        List list = this.f105387c;
        return hashCode ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105388d);
        String valueOf2 = String.valueOf(this.f105385a);
        String valueOf3 = String.valueOf(this.f105386b);
        String valueOf4 = String.valueOf(this.f105389e);
        String valueOf5 = String.valueOf(this.f105387c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 115 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ImageModelLoader{keyGenerator=");
        sb.append(valueOf);
        sb.append(", imageRetriever=");
        sb.append(valueOf2);
        sb.append(", secondaryImageRetriever=");
        sb.append(valueOf3);
        sb.append(", defaultImageRetriever=");
        sb.append(valueOf4);
        sb.append(", postProcessors=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
