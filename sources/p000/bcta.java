package p000;

/* renamed from: bcta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcta {

    /* renamed from: a */
    private String f104836a;

    /* renamed from: b */
    private bcov f104837b;

    /* renamed from: c */
    private bmxv f104838c;

    public bcta() {
    }

    /* renamed from: a */
    public final bctb mo57494a() {
        String str = this.f104836a == null ? " menuName" : "";
        if (this.f104837b == null) {
            str = str.concat(" action");
        }
        if (str.isEmpty()) {
            return new bcrr(this.f104836a, this.f104837b, this.f104838c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public bcta(byte[] bArr) {
        this.f104838c = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57495a(bcov bcov) {
        if (bcov != null) {
            this.f104837b = bcov;
            return;
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final void mo57496a(String str) {
        if (str != null) {
            this.f104836a = str;
            return;
        }
        throw new NullPointerException("Null menuName");
    }

    /* renamed from: a */
    public final void mo57497a(byte[] bArr) {
        this.f104838c = bmxv.m108566b(bArr);
    }
}
