package p000;

/* renamed from: bczw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczw {

    /* renamed from: a */
    private bngx f105207a;

    /* renamed from: a */
    public final bczx mo57810a() {
        String str = this.f105207a == null ? " elements" : "";
        if (str.isEmpty()) {
            return new bcyw(this.f105207a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57811a(bngx bngx) {
        if (bngx != null) {
            this.f105207a = bngx;
            return;
        }
        throw new NullPointerException("Null elements");
    }
}
