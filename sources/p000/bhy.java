package p000;

/* renamed from: bhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhy {

    /* renamed from: a */
    public bhz f3261a;

    /* renamed from: b */
    public bia f3262b;

    public final String toString() {
        String valueOf = String.valueOf(this.f3261a);
        String valueOf2 = String.valueOf(this.f3262b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("TagDetail [tagKey=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
