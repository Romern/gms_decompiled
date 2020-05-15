package p000;

/* renamed from: bcwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwo {

    /* renamed from: a */
    private String f105077a;

    /* renamed from: b */
    private Integer f105078b;

    /* renamed from: a */
    public final bcwp mo57633a() {
        String str = this.f105077a == null ? " resourceId" : "";
        if (this.f105078b == null) {
            str = str.concat(" resourceRegion");
        }
        if (str.isEmpty()) {
            return new bcwm(this.f105077a, this.f105078b.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57634a(int i) {
        this.f105078b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57635a(String str) {
        if (str != null) {
            this.f105077a = str;
            return;
        }
        throw new NullPointerException("Null resourceId");
    }
}
