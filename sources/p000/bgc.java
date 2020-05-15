package p000;

/* renamed from: bgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgc {

    /* renamed from: d */
    private static final byte[] f3165d = {50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, 49};

    /* renamed from: a */
    public String f3166a = "";

    /* renamed from: b */
    public String f3167b = "";

    /* renamed from: c */
    public String f3168c = "";

    /* renamed from: a */
    public final void mo3099a(boolean z) {
        String str;
        bet a = bet.m2847a();
        bhx bhx = (bhx) bev.m2854a(a.f3120b, bgt.m2993a("PAYMENT_PARAMETERS_DGI"), bgt.m2993a("PPSE_TAG_V1"), true);
        bhx bhx2 = (bhx) bev.m2854a(a.f3120b, bgt.m2993a("PAYMENT_PARAMETERS_DGI"), bgt.m2993a("PPSE_TAG_V2"), false);
        if (bhx != null) {
            str = bhx.f3259a;
            String valueOf = String.valueOf(bhx.f3260b);
            this.f3166a = valueOf.length() == 0 ? new String("00") : "00".concat(valueOf);
        } else {
            str = "";
        }
        if (z && bhx2 != null) {
            String valueOf2 = String.valueOf(str);
            String valueOf3 = String.valueOf(bhx2.f3259a);
            str = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            String valueOf4 = String.valueOf(this.f3166a);
            String str2 = bhx2.f3260b;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 3 + String.valueOf(str2).length());
            sb.append(valueOf4);
            sb.append("=01");
            sb.append(str2);
            this.f3166a = sb.toString();
        }
        if (str.compareToIgnoreCase("") != 0) {
            String valueOf5 = String.valueOf(bhp.m3058b(str));
            String valueOf6 = String.valueOf(bhp.m3058b(valueOf5.length() == 0 ? new String("BF0C") : "BF0C".concat(valueOf5)));
            str = valueOf6.length() == 0 ? new String("A5") : "A5".concat(valueOf6);
            String valueOf7 = String.valueOf(bhp.m3058b(str));
            this.f3168c = valueOf7.length() == 0 ? new String("BF0C") : "BF0C".concat(valueOf7);
        }
        String valueOf8 = String.valueOf(bhp.m3058b(bgx.m3004a(f3165d)));
        String valueOf9 = String.valueOf(valueOf8.length() == 0 ? new String("84") : "84".concat(valueOf8));
        String valueOf10 = String.valueOf(str);
        String valueOf11 = String.valueOf(bhp.m3058b(valueOf10.length() == 0 ? new String(valueOf9) : valueOf9.concat(valueOf10)));
        this.f3167b = valueOf11.length() == 0 ? new String("6F") : "6F".concat(valueOf11);
    }
}
