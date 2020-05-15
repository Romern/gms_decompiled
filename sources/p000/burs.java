package p000;

/* renamed from: burs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burs {

    /* renamed from: a */
    private aiaa f154786a;

    /* renamed from: b */
    private ByteString f154787b;

    /* renamed from: c */
    private ByteString f154788c;

    /* renamed from: d */
    private String f154789d;

    /* renamed from: a */
    public final burt mo73047a() {
        String str = this.f154786a == null ? " storedDiscoveryItem" : "";
        if (this.f154787b == null) {
            str = str.concat(" accountKey");
        }
        if (this.f154788c == null) {
            str = String.valueOf(str).concat(" sha256AccountKeyPublicAddress");
        }
        if (this.f154789d == null) {
            str = String.valueOf(str).concat(" bleAddress");
        }
        if (str.isEmpty()) {
            return new buqw(this.f154786a, this.f154787b, this.f154788c, this.f154789d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo73051b(ByteString bxtx) {
        if (bxtx != null) {
            this.f154788c = bxtx;
            return;
        }
        throw new NullPointerException("Null sha256AccountKeyPublicAddress");
    }

    /* renamed from: a */
    public final void mo73048a(aiaa aiaa) {
        if (aiaa != null) {
            this.f154786a = aiaa;
            return;
        }
        throw new NullPointerException("Null storedDiscoveryItem");
    }

    /* renamed from: a */
    public final void mo73049a(ByteString bxtx) {
        if (bxtx != null) {
            this.f154787b = bxtx;
            return;
        }
        throw new NullPointerException("Null accountKey");
    }

    /* renamed from: a */
    public final void mo73050a(String str) {
        if (str != null) {
            this.f154789d = str;
            return;
        }
        throw new NullPointerException("Null bleAddress");
    }
}
