package p000;

/* renamed from: bczb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczb {

    /* renamed from: a */
    private byte[] f105167a;

    /* renamed from: b */
    private bcsz f105168b;

    /* renamed from: c */
    private String f105169c;

    /* renamed from: d */
    private bcov f105170d;

    /* renamed from: a */
    public final bczc mo57773a() {
        String str = this.f105167a == null ? " icon" : "";
        if (this.f105168b == null) {
            str = str.concat(" lighterIcon");
        }
        if (this.f105169c == null) {
            str = String.valueOf(str).concat(" displayText");
        }
        if (this.f105170d == null) {
            str = String.valueOf(str).concat(" action");
        }
        if (str.isEmpty()) {
            return new bcyo(this.f105167a, this.f105168b, this.f105169c, this.f105170d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57774a(bcov bcov) {
        if (bcov != null) {
            this.f105170d = bcov;
            return;
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final void mo57775a(bcsz bcsz) {
        if (bcsz != null) {
            this.f105168b = bcsz;
            return;
        }
        throw new NullPointerException("Null lighterIcon");
    }

    /* renamed from: a */
    public final void mo57776a(String str) {
        if (str != null) {
            this.f105169c = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: a */
    public final void mo57777a(byte[] bArr) {
        if (bArr != null) {
            this.f105167a = bArr;
            return;
        }
        throw new NullPointerException("Null icon");
    }
}
