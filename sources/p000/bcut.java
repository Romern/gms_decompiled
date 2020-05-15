package p000;

/* renamed from: bcut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcut {

    /* renamed from: a */
    private String f104961a;

    /* renamed from: b */
    private String f104962b;

    /* renamed from: c */
    private bngx f104963c;

    /* renamed from: d */
    private Integer f104964d;

    /* renamed from: e */
    private String f104965e;

    /* renamed from: a */
    public final bcuu mo57577a() {
        String str = this.f104961a == null ? " id" : "";
        if (this.f104962b == null) {
            str = str.concat(" messageId");
        }
        if (this.f104963c == null) {
            str = String.valueOf(str).concat(" suggestions");
        }
        if (this.f104964d == null) {
            str = String.valueOf(str).concat(" renderStyle");
        }
        if (this.f104965e == null) {
            str = String.valueOf(str).concat(" hintText");
        }
        if (str.isEmpty()) {
            return new bcse(this.f104961a, this.f104962b, this.f104963c, this.f104964d.intValue(), this.f104965e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57581b(String str) {
        if (str != null) {
            this.f104961a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: c */
    public final void mo57582c(String str) {
        if (str != null) {
            this.f104962b = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    /* renamed from: a */
    public final void mo57578a(int i) {
        this.f104964d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57579a(bngx bngx) {
        if (bngx != null) {
            this.f104963c = bngx;
            return;
        }
        throw new NullPointerException("Null suggestions");
    }

    /* renamed from: a */
    public final void mo57580a(String str) {
        if (str != null) {
            this.f104965e = str;
            return;
        }
        throw new NullPointerException("Null hintText");
    }
}
