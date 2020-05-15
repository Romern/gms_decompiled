package p000;

/* renamed from: bcoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcoe {

    /* renamed from: a */
    private Long f104610a;

    /* renamed from: b */
    private bcol f104611b;

    /* renamed from: c */
    private ByteString f104612c;

    /* renamed from: d */
    private bcog f104613d;

    /* renamed from: a */
    public final bcoh mo57051a() {
        String str = this.f104610a == null ? " registrationId" : "";
        if (this.f104611b == null) {
            str = str.concat(" accountUsers");
        }
        if (this.f104612c == null) {
            str = String.valueOf(str).concat(" serverRegistrationId");
        }
        if (this.f104613d == null) {
            str = String.valueOf(str).concat(" serverRegistrationStatus");
        }
        if (str.isEmpty()) {
            return new bcrd(this.f104610a.longValue(), this.f104611b, this.f104612c, this.f104613d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57052a(long j) {
        this.f104610a = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo57053a(bcog bcog) {
        if (bcog != null) {
            this.f104613d = bcog;
            return;
        }
        throw new NullPointerException("Null serverRegistrationStatus");
    }

    /* renamed from: a */
    public final void mo57054a(bcok bcok) {
        mo57055a(bcok.mo57063a());
    }

    /* renamed from: a */
    public final void mo57055a(bcol bcol) {
        if (bcol != null) {
            this.f104611b = bcol;
            return;
        }
        throw new NullPointerException("Null accountUsers");
    }

    /* renamed from: a */
    public final void mo57056a(ByteString bxtx) {
        if (bxtx != null) {
            this.f104612c = bxtx;
            return;
        }
        throw new NullPointerException("Null serverRegistrationId");
    }
}
