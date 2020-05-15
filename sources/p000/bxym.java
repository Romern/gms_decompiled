package p000;

/* renamed from: bxym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxym extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public bxym() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final bxwf mo74281a() {
        return new bxwf(getMessage());
    }
}
