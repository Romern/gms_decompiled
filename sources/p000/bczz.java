package p000;

/* renamed from: bczz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczz {

    /* renamed from: a */
    private bdaa f105208a;

    /* renamed from: b */
    private Integer f105209b;

    /* renamed from: c */
    private Integer f105210c;

    /* renamed from: d */
    private Integer f105211d;

    /* renamed from: e */
    private Integer f105212e;

    /* renamed from: a */
    public final bdad mo57812a() {
        String str = this.f105208a == null ? " element" : "";
        if (this.f105209b == null) {
            str = str.concat(" paddingStart");
        }
        if (this.f105210c == null) {
            str = String.valueOf(str).concat(" paddingTop");
        }
        if (this.f105211d == null) {
            str = String.valueOf(str).concat(" paddingEnd");
        }
        if (this.f105212e == null) {
            str = String.valueOf(str).concat(" paddingBottom");
        }
        if (str.isEmpty()) {
            return new bcyx(this.f105208a, this.f105209b.intValue(), this.f105210c.intValue(), this.f105211d.intValue(), this.f105212e.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57820b() {
        this.f105208a = bcye.f105118a;
    }

    /* renamed from: c */
    public final void mo57822c(int i) {
        this.f105209b = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo57823d(int i) {
        this.f105210c = Integer.valueOf(i);
    }

    /* renamed from: b */
    public final void mo57821b(int i) {
        this.f105211d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57813a(int i) {
        this.f105212e = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57814a(bcuo bcuo) {
        if (bcuo != null) {
            this.f105208a = new bcyj(bcuo);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57815a(bczd bczd) {
        if (bczd != null) {
            this.f105208a = new bcyf(bczd);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57816a(bczf bczf) {
        if (bczf != null) {
            this.f105208a = new bcyg(bczf);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57817a(bczh bczh) {
        if (bczh != null) {
            this.f105208a = new bcyh(bczh);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57818a(bczo bczo) {
        if (bczo != null) {
            this.f105208a = new bcyi(bczo);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo57819a(bczu bczu) {
        if (bczu != null) {
            this.f105208a = new bcyk(bczu);
            return;
        }
        throw null;
    }
}
