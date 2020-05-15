package p000;

/* renamed from: buqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buqw extends burt {

    /* renamed from: a */
    private final aiaa f154745a;

    /* renamed from: b */
    private final ByteString f154746b;

    /* renamed from: c */
    private final ByteString f154747c;

    /* renamed from: d */
    private final String f154748d;

    public buqw(aiaa aiaa, ByteString bxtx, ByteString bxtx2, String str) {
        this.f154745a = aiaa;
        this.f154746b = bxtx;
        this.f154747c = bxtx2;
        this.f154748d = str;
    }

    /* renamed from: a */
    public final aiaa mo73010a() {
        return this.f154745a;
    }

    /* renamed from: b */
    public final ByteString mo73011b() {
        return this.f154746b;
    }

    /* renamed from: c */
    public final ByteString mo73012c() {
        return this.f154747c;
    }

    /* renamed from: d */
    public final String mo73013d() {
        return this.f154748d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof burt) {
            burt burt = (burt) obj;
            return this.f154745a.equals(burt.mo73010a()) && this.f154746b.equals(burt.mo73011b()) && this.f154747c.equals(burt.mo73012c()) && this.f154748d.equals(burt.mo73013d());
        }
    }

    public final int hashCode() {
        aiaa aiaa = this.f154745a;
        int i = aiaa.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(aiaa).mo74216a(aiaa);
            aiaa.f164758ag = i;
        }
        return this.f154748d.hashCode() ^ ((((((i ^ 1000003) * 1000003) ^ this.f154746b.hashCode()) * 1000003) ^ this.f154747c.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f154745a);
        String valueOf2 = String.valueOf(this.f154746b);
        String valueOf3 = String.valueOf(this.f154747c);
        String str = this.f154748d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("FastPairUploadInfo{storedDiscoveryItem=");
        sb.append(valueOf);
        sb.append(", accountKey=");
        sb.append(valueOf2);
        sb.append(", sha256AccountKeyPublicAddress=");
        sb.append(valueOf3);
        sb.append(", bleAddress=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
