package p000;

/* renamed from: bczg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczg {

    /* renamed from: a */
    public String f105173a;

    /* renamed from: b */
    private bcwp f105174b;

    /* renamed from: c */
    private bxtx f105175c;

    /* renamed from: d */
    private Integer f105176d;

    /* renamed from: e */
    private Integer f105177e;

    /* renamed from: f */
    private String f105178f;

    /* renamed from: a */
    public final bczh mo57781a() {
        String str = this.f105174b == null ? " mediaId" : "";
        if (this.f105175c == null) {
            str = str.concat(" thumbnail");
        }
        if (this.f105176d == null) {
            str = String.valueOf(str).concat(" width");
        }
        if (this.f105177e == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (this.f105178f == null) {
            str = String.valueOf(str).concat(" imageDescription");
        }
        if (str.isEmpty()) {
            return new bcyq(this.f105174b, this.f105173a, this.f105175c, this.f105176d.intValue(), this.f105177e.intValue(), this.f105178f);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57786b(int i) {
        this.f105176d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57782a(int i) {
        this.f105177e = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57783a(bcwp bcwp) {
        if (bcwp != null) {
            this.f105174b = bcwp;
            return;
        }
        throw new NullPointerException("Null mediaId");
    }

    /* renamed from: a */
    public final void mo57784a(String str) {
        if (str != null) {
            this.f105178f = str;
            return;
        }
        throw new NullPointerException("Null imageDescription");
    }

    /* renamed from: a */
    public final void mo57785a(byte[] bArr) {
        bxtx a = bxtx.m123261a(bArr);
        if (a != null) {
            this.f105175c = a;
            return;
        }
        throw new NullPointerException("Null thumbnail");
    }
}
