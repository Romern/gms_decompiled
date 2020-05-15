package p000;

/* renamed from: bcsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsg {

    /* renamed from: a */
    private Boolean f104792a;

    /* renamed from: a */
    public final bcsh mo57434a() {
        String str = this.f104792a == null ? " blocked" : "";
        if (str.isEmpty()) {
            return new bcrj(this.f104792a.booleanValue());
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57435a(boolean z) {
        this.f104792a = Boolean.valueOf(z);
    }
}
