package p000;

/* renamed from: bctc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctc {

    /* renamed from: a */
    private Integer f104839a;

    /* renamed from: b */
    private Integer f104840b;

    /* renamed from: a */
    public final bctd mo57499a() {
        String str = this.f104839a == null ? " badge" : "";
        if (this.f104840b == null) {
            str = str.concat(" profileLabelStyle");
        }
        if (str.isEmpty()) {
            return new bcrs(this.f104839a.intValue(), this.f104840b.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57501b(int i) {
        this.f104840b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57500a(int i) {
        this.f104839a = Integer.valueOf(i);
    }
}
