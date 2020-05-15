package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: atxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atxt {
    FELICA;
    

    /* renamed from: b */
    public final int f91092b = 1;

    /* renamed from: c */
    public final long f91093c = 60;

    /* renamed from: d */
    public final TimeUnit f91094d;

    /* renamed from: e */
    private final int f91095e = 1;

    private atxt() {
        this.f91094d = r4;
    }

    /* renamed from: a */
    public static atxt m76521a(int i) {
        atxt[] values = values();
        for (atxt atxt : values) {
            if (atxt.f91095e == i) {
                return atxt;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unknown resource type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
