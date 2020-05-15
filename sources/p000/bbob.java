package p000;

/* renamed from: bbob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbob {

    /* renamed from: a */
    public Class f103001a;

    /* renamed from: b */
    public bxvq f103002b;

    /* renamed from: c */
    public ayte f103003c;

    /* renamed from: d */
    public bnsn f103004d;

    /* renamed from: e */
    private beju f103005e;

    /* renamed from: a */
    public final bboc mo56268a() {
        String str = this.f103005e == null ? " pdsFactory" : "";
        if (this.f103003c == null) {
            str = str.concat(" clock");
        }
        if (this.f103004d == null) {
            str = String.valueOf(str).concat(" logger");
        }
        if (str.isEmpty()) {
            return new bbnx(this.f103001a, this.f103002b, this.f103005e, this.f103003c, this.f103004d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56269a(beju beju) {
        if (beju != null) {
            this.f103005e = beju;
            return;
        }
        throw new NullPointerException("Null pdsFactory");
    }
}
