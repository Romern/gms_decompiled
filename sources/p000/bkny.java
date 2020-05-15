package p000;

/* renamed from: bkny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkny {

    /* renamed from: a */
    public final bkob f124974a;

    public bkny(bkob bkob) {
        this.f124974a = bkob;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f124974a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("BindCompleteEvent [continutationToken=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
