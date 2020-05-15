package p000;

/* renamed from: aout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aout {
    /* renamed from: a */
    public static int m69570a(int i) {
        if (i == 0) {
            return ((Integer) aoss.f83527F.mo58455c()).intValue();
        }
        if (i == 1) {
            return ((Integer) aoss.f83528G.mo58455c()).intValue();
        }
        if (i == 2) {
            return ((Integer) aoss.f83529H.mo58455c()).intValue();
        }
        if (i == 3) {
            return ((Integer) aoss.f83530I.mo58455c()).intValue();
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unrecognized frequency: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
