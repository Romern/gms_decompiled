package p000;

/* renamed from: bctz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctz {

    /* renamed from: a */
    private bngx f104904a;

    /* renamed from: a */
    public final bcuo mo57557a() {
        String str = this.f104904a == null ? " lines" : "";
        if (str.isEmpty()) {
            return new bcrz(this.f104904a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57558a(bngx bngx) {
        if (bngx != null) {
            this.f104904a = bngx;
            return;
        }
        throw new NullPointerException("Null lines");
    }
}
