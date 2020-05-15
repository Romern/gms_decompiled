package p000;

/* renamed from: bcza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcza {

    /* renamed from: a */
    private bngx f105166a;

    /* renamed from: a */
    public final bczd mo57771a() {
        String str = this.f105166a == null ? " verticalLayoutButtons" : "";
        if (str.isEmpty()) {
            return new bcyn(this.f105166a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo57772a(bngx bngx) {
        if (bngx != null) {
            this.f105166a = bngx;
            return;
        }
        throw new NullPointerException("Null verticalLayoutButtons");
    }
}
