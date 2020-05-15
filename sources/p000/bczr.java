package p000;

/* renamed from: bczr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczr {

    /* renamed from: a */
    private String f105198a;

    /* renamed from: b */
    private bczq f105199b;

    /* renamed from: a */
    public final bczs mo57802a() {
        String str = this.f105198a == null ? " jsonSource" : "";
        if (this.f105199b == null) {
            str = str.concat(" stackCard");
        }
        if (str.isEmpty()) {
            return new bcyu(this.f105198a, this.f105199b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57803a(bczq bczq) {
        if (bczq != null) {
            this.f105199b = bczq;
            return;
        }
        throw new NullPointerException("Null stackCard");
    }

    /* renamed from: a */
    public final void mo57804a(String str) {
        if (str != null) {
            this.f105198a = str;
            return;
        }
        throw new NullPointerException("Null jsonSource");
    }
}
