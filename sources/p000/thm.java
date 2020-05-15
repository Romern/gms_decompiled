package p000;

/* renamed from: thm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thm extends thu {

    /* renamed from: a */
    private final bzjl f46030a;

    /* renamed from: b */
    private final bmxv f46031b;

    /* renamed from: c */
    private final bmxv f46032c;

    /* renamed from: d */
    private final bmxv f46033d;

    public thm(bzjl bzjl, bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        this.f46030a = bzjl;
        this.f46031b = bmxv;
        this.f46032c = bmxv2;
        this.f46033d = bmxv3;
    }

    /* renamed from: a */
    public final bzjl mo26535a() {
        return this.f46030a;
    }

    /* renamed from: b */
    public final bmxv mo26536b() {
        return this.f46031b;
    }

    /* renamed from: c */
    public final bmxv mo26537c() {
        return this.f46032c;
    }

    /* renamed from: d */
    public final bmxv mo26538d() {
        return this.f46033d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof thu) {
            thu thu = (thu) obj;
            return this.f46030a.equals(thu.mo26535a()) && this.f46031b.equals(thu.mo26536b()) && this.f46032c.equals(thu.mo26537c()) && this.f46033d.equals(thu.mo26538d());
        }
    }

    public final int hashCode() {
        bzjl bzjl = this.f46030a;
        int i = bzjl.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bzjl).mo74216a(bzjl);
            bzjl.f164758ag = i;
        }
        return this.f46033d.hashCode() ^ ((((((i ^ 1000003) * 1000003) ^ this.f46031b.hashCode()) * 1000003) ^ this.f46032c.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46030a);
        String valueOf2 = String.valueOf(this.f46031b);
        String valueOf3 = String.valueOf(this.f46032c);
        String valueOf4 = String.valueOf(this.f46033d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PhotosCardData{relatedPhotosCard=");
        sb.append(valueOf);
        sb.append(", targetGaiaId=");
        sb.append(valueOf2);
        sb.append(", viewerAccountName=");
        sb.append(valueOf3);
        sb.append(", viewerPageId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
