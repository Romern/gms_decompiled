package p000;

/* renamed from: betp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betp {

    /* renamed from: a */
    public final bfoa f112416a;

    /* renamed from: b */
    public final bfnb f112417b;

    public betp(bfoa bfoa, bfnb bfnb) {
        this.f112416a = bfoa;
        this.f112417b = bfnb;
    }

    public final String toString() {
        bfnb bfnb = this.f112417b;
        String replaceAll = bfnb != null ? bfnb.toString().replaceAll("\n", "_") : null;
        String valueOf = String.valueOf(this.f112416a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(replaceAll).length());
        sb.append("ClassificationSignals [wifiScan=");
        sb.append(valueOf);
        sb.append(", networkLocation=");
        sb.append(replaceAll);
        sb.append("]");
        return sb.toString();
    }
}
