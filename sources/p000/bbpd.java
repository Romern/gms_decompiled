package p000;

/* renamed from: bbpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbpd {

    /* renamed from: a */
    private String f103036a;

    /* renamed from: b */
    private bngx f103037b;

    /* renamed from: a */
    public final bbpe mo56297a() {
        String str = this.f103036a == null ? " nextPageToken" : "";
        if (this.f103037b == null) {
            str = str.concat(" conversationIds");
        }
        if (str.isEmpty()) {
            return new bbpa(this.f103036a, this.f103037b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56298a(bngx bngx) {
        if (bngx != null) {
            this.f103037b = bngx;
            return;
        }
        throw new NullPointerException("Null conversationIds");
    }

    /* renamed from: a */
    public final void mo56299a(String str) {
        if (str != null) {
            this.f103036a = str;
            return;
        }
        throw new NullPointerException("Null nextPageToken");
    }
}
