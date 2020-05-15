package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cifr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifr {

    /* renamed from: a */
    public static final cihp f190025a = new cihp(cihp.f190346d, "https");

    /* renamed from: b */
    public static final cihp f190026b = new cihp(cihp.f190346d, "http");

    /* renamed from: c */
    public static final cihp f190027c = new cihp(cihp.f190344b, DataParser.CONNECT_TYPE_POST);

    /* renamed from: d */
    public static final cihp f190028d = new cihp(cihp.f190344b, "GET");

    /* renamed from: e */
    public static final cihp f190029e = new cihp(ciag.f189649f.f189129a, "application/grpc");

    /* renamed from: f */
    public static final cihp f190030f = new cihp("te", "trailers");

    /* renamed from: a */
    public static List m150186a(chtr chtr, String str, String str2, String str3, boolean z, boolean z2) {
        bmxy.m108582a(chtr, "headers");
        bmxy.m108582a(str, "defaultPath");
        bmxy.m108582a(str2, "authority");
        chtr.mo85655c(ciag.f189649f);
        chtr.mo85655c(ciag.f189650g);
        chtr.mo85655c(ciag.f189651h);
        ArrayList arrayList = new ArrayList(chsg.m149484b(chtr) + 7);
        if (z2) {
            arrayList.add(f190026b);
        } else {
            arrayList.add(f190025a);
        }
        arrayList.add(f190027c);
        arrayList.add(new cihp(cihp.f190347e, str2));
        arrayList.add(new cihp(cihp.f190345c, str));
        arrayList.add(new cihp(ciag.f189651h.f189129a, str3));
        arrayList.add(f190029e);
        arrayList.add(f190030f);
        byte[][] a = cife.m150161a(chtr);
        for (int i = 0; i < a.length; i += 2) {
            cipx a2 = cipx.m150786a(a[i]);
            String a3 = a2.mo86336a();
            if (!a3.startsWith(":") && !ciag.f189649f.f189129a.equalsIgnoreCase(a3) && !ciag.f189651h.f189129a.equalsIgnoreCase(a3)) {
                arrayList.add(new cihp(a2, cipx.m150786a(a[i + 1])));
            }
        }
        return arrayList;
    }
}
