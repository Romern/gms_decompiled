package p000;

/* renamed from: bctg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctg {

    /* renamed from: a */
    private String f104855a;

    /* renamed from: b */
    private byte[] f104856b;

    /* renamed from: a */
    public final bcth mo57522a() {
        String str = this.f104855a == null ? " type" : "";
        if (this.f104856b == null) {
            str = str.concat(" content");
        }
        if (str.isEmpty()) {
            return new bcrv(this.f104855a, this.f104856b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57523a(String str) {
        if (str != null) {
            this.f104855a = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final void mo57524a(byte[] bArr) {
        if (bArr != null) {
            this.f104856b = bArr;
            return;
        }
        throw new NullPointerException("Null content");
    }
}
