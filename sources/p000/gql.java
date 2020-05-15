package p000;

/* renamed from: gql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gql {

    /* renamed from: a */
    public Throwable f18825a = null;

    /* renamed from: b */
    public String f18826b = null;

    /* renamed from: c */
    private final int f18827c;

    public gql(int i) {
        this.f18827c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aaaj mo12128a() {
        Throwable th;
        if (this.f18826b == null && (th = this.f18825a) != null) {
            this.f18826b = th.getMessage();
        }
        aaaj aaaj = new aaaj(this.f18827c, this.f18826b, null, this.f18825a);
        aaaj.f27844b = !gqm.f18828a.contains(Integer.valueOf(this.f18827c));
        return aaaj;
    }
}
