package p000;

/* renamed from: bbft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbft {

    /* renamed from: a */
    public int f102567a;

    /* renamed from: b */
    private Boolean f102568b;

    /* renamed from: a */
    public final bbfu mo56117a() {
        String str = this.f102568b == null ? " forceRefreshCache" : "";
        if (str.isEmpty()) {
            return new bbfq(this.f102568b.booleanValue(), this.f102567a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo56118a(boolean z) {
        this.f102568b = Boolean.valueOf(z);
    }
}
