package p000;

/* renamed from: bcpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpy extends bcpz {

    /* renamed from: a */
    private final bxtx f104670a;

    /* renamed from: a */
    public final int mo57180a() {
        return 1;
    }

    /* renamed from: e */
    public final bxtx mo57196e() {
        return this.f104670a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcti) {
            bcti bcti = (bcti) obj;
            return bcti.mo57180a() == 1 && this.f104670a.equals(bcti.mo57196e());
        }
    }

    public final int hashCode() {
        return this.f104670a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104670a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("MessageContent{unsupported=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpy(bxtx bxtx) {
        this.f104670a = bxtx;
    }
}
