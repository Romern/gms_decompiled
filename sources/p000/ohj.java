package p000;

/* renamed from: ohj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohj {

    /* renamed from: a */
    private Integer f37641a;

    /* renamed from: b */
    private Integer f37642b;

    /* renamed from: c */
    private Boolean f37643c;

    /* renamed from: a */
    public final ohk mo22164a() {
        String str = this.f37641a == null ? " fragmentSize" : "";
        if (this.f37642b == null) {
            str = str.concat(" bufferedStreamSize");
        }
        if (this.f37643c == null) {
            str = String.valueOf(str).concat(" isQoSEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        ofg ofg = new ofg(this.f37641a.intValue(), this.f37642b.intValue(), this.f37643c.booleanValue());
        int i = ofg.f37497a;
        if (i >= 263 && i <= 65539) {
            return ofg;
        }
        throw new IllegalArgumentException("Maximum frame size cannot be smaller than 263 or larger than 655354");
    }

    /* renamed from: b */
    public final void mo22167b(int i) {
        this.f37641a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo22165a(int i) {
        this.f37642b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo22166a(boolean z) {
        this.f37643c = Boolean.valueOf(z);
    }
}
