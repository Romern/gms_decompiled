package p000;

/* renamed from: aueq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aueq extends auej {

    /* renamed from: a */
    public String f91567a = "";

    public aueq(String str) {
        super(str);
        try {
            if (str.startsWith("google---")) {
                String[] split = str.split("---", -1);
                String str2 = split[0];
                String str3 = split[1];
                String str4 = split[2];
            } else if (str.startsWith("ios/")) {
                str.substring(4, 16);
            } else if (str.startsWith("GoogleFi Peering".toLowerCase())) {
                this.f91567a = "Fi";
            } else if (str.startsWith("mavenir uag")) {
                this.f91567a = "T-Mobile";
            }
        } catch (Exception e) {
            mo50487b();
        }
    }
}
