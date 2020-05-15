package p000;

/* renamed from: bcoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcoo {

    /* renamed from: a */
    private bmxv f104637a;

    /* renamed from: b */
    private bmxv f104638b;

    /* renamed from: c */
    private bmxv f104639c;

    /* renamed from: d */
    private bmxv f104640d;

    /* renamed from: e */
    private Long f104641e;

    /* renamed from: f */
    private bcom f104642f;

    /* renamed from: g */
    private bcom f104643g;

    public bcoo() {
    }

    /* renamed from: a */
    public final bcov mo57085a() {
        String str = this.f104641e == null ? " actionTriggeredLogId" : "";
        if (this.f104642f == null) {
            str = str.concat(" actionPayload");
        }
        if (this.f104643g == null) {
            str = String.valueOf(str).concat(" eventCallbackFailureActionPayload");
        }
        if (str.isEmpty()) {
            return new bcrf(this.f104637a, this.f104638b, this.f104639c, this.f104640d, this.f104641e.longValue(), this.f104642f, this.f104643g);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57091b() {
        this.f104643g = bcpd.f104655a;
    }

    /* renamed from: c */
    public final void mo57094c() {
        this.f104642f = bcpd.f104655a;
    }

    /* renamed from: d */
    public final void mo57096d(String str) {
        this.f104639c = bmxv.m108566b(str);
    }

    /* renamed from: e */
    public final void mo57097e(String str) {
        this.f104638b = bmxv.m108566b(str);
    }

    /* renamed from: g */
    public final void mo57099g(String str) {
        this.f104637a = bmxv.m108566b(str);
    }

    /* renamed from: h */
    public final void mo57100h(String str) {
        if (str != null) {
            this.f104642f = new bcph(str);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo57092b(bcou bcou) {
        if (bcou != null) {
            this.f104642f = new bcpf(bcou);
            return;
        }
        throw null;
    }

    /* renamed from: f */
    public final void mo57098f(String str) {
        this.f104642f = bcpj.m89584a(str);
    }

    public bcoo(byte[] bArr) {
        this.f104637a = bmvz.f131120a;
        this.f104638b = bmvz.f131120a;
        this.f104639c = bmvz.f131120a;
        this.f104640d = bmvz.f131120a;
    }

    /* renamed from: c */
    public final void mo57095c(String str) {
        this.f104643g = bcpj.m89584a(str);
    }

    /* renamed from: b */
    public final void mo57093b(String str) {
        if (str != null) {
            this.f104642f = new bcpc(str);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57086a(long j) {
        this.f104641e = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo57087a(bcop bcop) {
        this.f104640d = bmxv.m108566b(bcop);
    }

    /* renamed from: a */
    public final void mo57088a(bcos bcos) {
        if (bcos != null) {
            this.f104642f = new bcpb(bcos);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57089a(bcou bcou) {
        if (bcou != null) {
            this.f104642f = new bcpe(bcou);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57090a(String str) {
        if (str != null) {
            this.f104642f = new bcpa(str);
            return;
        }
        throw null;
    }
}
