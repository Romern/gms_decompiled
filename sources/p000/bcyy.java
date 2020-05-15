package p000;

/* renamed from: bcyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcyy {

    /* renamed from: a */
    private Integer f105162a;

    /* renamed from: b */
    private String f105163b;

    /* renamed from: c */
    private bngx f105164c;

    /* renamed from: a */
    public final bcyz mo57766a() {
        String str = this.f105162a == null ? " cardWidth" : "";
        if (this.f105163b == null) {
            str = str.concat(" jsonSource");
        }
        if (this.f105164c == null) {
            str = String.valueOf(str).concat(" cards");
        }
        if (str.isEmpty()) {
            return new bcym(this.f105162a.intValue(), this.f105163b, this.f105164c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57767a(int i) {
        this.f105162a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57768a(bngx bngx) {
        if (bngx != null) {
            this.f105164c = bngx;
            return;
        }
        throw new NullPointerException("Null cards");
    }

    /* renamed from: a */
    public final void mo57769a(String str) {
        if (str != null) {
            this.f105163b = str;
            return;
        }
        throw new NullPointerException("Null jsonSource");
    }
}
