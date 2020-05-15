package p000;

/* renamed from: bbyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyr {

    /* renamed from: a */
    private Integer f103765a;

    /* renamed from: b */
    private bmxv f103766b;

    /* renamed from: c */
    private bmxv f103767c;

    public bbyr() {
    }

    /* renamed from: a */
    public final bbys mo56551a() {
        String str = this.f103765a == null ? " status" : "";
        if (str.isEmpty()) {
            return new bbyd(this.f103765a.intValue(), this.f103766b, this.f103767c);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    public bbyr(byte[] bArr) {
        this.f103766b = bmvz.f131120a;
        this.f103767c = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo56552a(int i) {
        this.f103765a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56553a(bcoh bcoh) {
        this.f103766b = bmxv.m108566b(bcoh);
    }

    /* renamed from: a */
    public final void mo56554a(bcoz bcoz) {
        this.f103767c = bmxv.m108566b(bcoz);
    }
}
