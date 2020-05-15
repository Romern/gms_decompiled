package p000;

/* renamed from: bchx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bchx {

    /* renamed from: a */
    public bcuu f104188a;

    /* renamed from: b */
    public bchz f104189b;

    /* renamed from: c */
    private Boolean f104190c;

    public bchx() {
    }

    /* renamed from: a */
    public final bcia mo56909a() {
        String str = this.f104190c == null ? " skipNotification" : "";
        if (this.f104189b == null) {
            str = str.concat(" oneOfType");
        }
        if (str.isEmpty()) {
            return new bcgz(this.f104188a, this.f104190c.booleanValue(), this.f104189b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public bchx(bcia bcia) {
        bcgz bcgz = (bcgz) bcia;
        this.f104188a = bcgz.f104149a;
        this.f104190c = Boolean.valueOf(bcgz.f104150b);
        this.f104189b = bcgz.f104151c;
    }

    /* renamed from: a */
    public final void mo56910a(bchu bchu) {
        if (bchu != null) {
            this.f104189b = new bcgk(bchu);
            mo56911a(true);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo56911a(boolean z) {
        this.f104190c = Boolean.valueOf(z);
    }
}
