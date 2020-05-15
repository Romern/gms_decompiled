package p000;

import java.security.KeyPair;

/* renamed from: bcow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcow {

    /* renamed from: a */
    public Long f104648a;

    /* renamed from: b */
    public Long f104649b;

    /* renamed from: c */
    public bcoy f104650c;

    /* renamed from: d */
    private bngx f104651d;

    /* renamed from: a */
    public final bcoz mo57125a() {
        String str = this.f104651d == null ? " tachyonToken" : "";
        if (this.f104648a == null) {
            str = str.concat(" expireAt");
        }
        if (this.f104649b == null) {
            str = String.valueOf(str).concat(" refreshedAt");
        }
        if (this.f104650c == null) {
            str = String.valueOf(str).concat(" oneOfId");
        }
        if (str.isEmpty()) {
            return new bcri(this.f104651d, this.f104648a, this.f104649b, this.f104650c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57126a(bngx bngx) {
        if (bngx != null) {
            this.f104651d = bngx;
            return;
        }
        throw new NullPointerException("Null tachyonToken");
    }

    /* renamed from: a */
    public final void mo57127a(KeyPair keyPair) {
        if (keyPair != null) {
            this.f104650c = new bcpq(keyPair);
            return;
        }
        throw null;
    }
}
