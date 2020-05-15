package p000;

/* renamed from: bbfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfx {

    /* renamed from: a */
    public int f102572a;

    /* renamed from: b */
    private bmxv f102573b;

    /* renamed from: c */
    private Long f102574c;

    public bbfx() {
    }

    /* renamed from: a */
    public final bbfz mo56122a() {
        String str = this.f102572a == 0 ? " state" : "";
        if (this.f102574c == null) {
            str = str.concat(" timestamp");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        bbfs bbfs = new bbfs(this.f102573b, this.f102572a, this.f102574c.longValue());
        if (bbfs.f102565b == 2) {
            if (!bbfs.f102564a.mo66813a()) {
                throw new IllegalStateException("If state is FOUND, must have a value set");
            }
        } else if (bbfs.f102564a.mo66813a()) {
            String a = bbfy.m87974a(bbfs.f102565b);
            String valueOf2 = String.valueOf(bbfs.f102564a.mo66814b());
            StringBuilder sb = new StringBuilder(a.length() + 50 + String.valueOf(valueOf2).length());
            sb.append("If state is ");
            sb.append(a);
            sb.append(", must not have a value set (but is ");
            sb.append(valueOf2);
            sb.append(").");
            throw new IllegalStateException(sb.toString());
        }
        return bbfs;
    }

    public bbfx(byte[] bArr) {
        this.f102573b = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo56123a(long j) {
        this.f102574c = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo56124a(Object obj) {
        this.f102573b = bmxv.m108566b(obj);
    }
}
