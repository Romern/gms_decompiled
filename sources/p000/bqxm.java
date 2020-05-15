package p000;

/* renamed from: bqxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxm {

    /* renamed from: a */
    private Integer f141885a;

    /* renamed from: b */
    private bqxn f141886b;

    /* renamed from: c */
    private Integer f141887c;

    /* renamed from: a */
    public final bqxo mo69434a() {
        String str = this.f141885a == null ? " size" : "";
        if (this.f141886b == null) {
            str = str.concat(" type");
        }
        if (this.f141887c == null) {
            str = String.valueOf(str).concat(" data");
        }
        if (str.isEmpty()) {
            return new bqwp(this.f141885a.intValue(), this.f141886b, this.f141887c.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo69437b(int i) {
        this.f141885a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo69435a(int i) {
        this.f141887c = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo69436a(bqxn bqxn) {
        if (bqxn != null) {
            this.f141886b = bqxn;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
