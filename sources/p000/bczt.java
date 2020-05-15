package p000;

/* renamed from: bczt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczt {

    /* renamed from: a */
    private String f105201a;

    /* renamed from: b */
    private Integer f105202b;

    /* renamed from: c */
    private Integer f105203c;

    /* renamed from: a */
    public final bczu mo57806a() {
        String str = this.f105201a == null ? " text" : "";
        if (this.f105202b == null) {
            str = str.concat(" backgroundColor");
        }
        if (this.f105203c == null) {
            str = String.valueOf(str).concat(" textColor");
        }
        if (str.isEmpty()) {
            return new bcyv(this.f105201a, this.f105202b.intValue(), this.f105203c.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57809b(int i) {
        this.f105203c = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57807a(int i) {
        this.f105202b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57808a(String str) {
        if (str != null) {
            this.f105201a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
