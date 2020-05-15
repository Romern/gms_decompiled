package p000;

import java.util.LinkedHashMap;

/* renamed from: asrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrd {

    /* renamed from: c */
    private static final srn f89481c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final LinkedHashMap f89482a = new LinkedHashMap();

    /* renamed from: b */
    public int f89483b;

    /* renamed from: d */
    private int f89484d;

    /* renamed from: a */
    public static LinkedHashMap m74511a(byte[] bArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        asst a = asst.m74710a(bArr, 0);
        while (a.f89617a.length - a.f89618b > 0) {
            try {
                int a2 = a.mo49444a();
                int b = a.mo49445b();
                Integer valueOf = Integer.valueOf(a2);
                if (linkedHashMap.containsKey(valueOf)) {
                    bnsl bnsl = (bnsl) f89481c.mo68388c();
                    bnsl.mo68432a("asrd", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Attempted to add the same pdol twice. Ignoring the second attempt at adding: %s", assu.m74714a(a2));
                } else {
                    linkedHashMap.put(valueOf, Integer.valueOf(b));
                }
            } catch (assx e) {
                bnsl bnsl2 = (bnsl) f89481c.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("asrd", "a", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Invalid tlv tag specified in flag. Tags cannot be longer than 2 bytes.");
            } catch (assw e2) {
                bnsl bnsl3 = (bnsl) f89481c.mo68388c();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("asrd", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Invalid tlv length specified in flag. Length bytes are too long.");
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final asrd mo49401a(int i, int i2) {
        boolean z;
        if (i2 <= 127) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Only PDOL tag lengths < 128 are supported");
        if (this.f89482a.containsKey(Integer.valueOf(i))) {
            bnsl bnsl = (bnsl) f89481c.mo68388c();
            bnsl.mo68432a("asrd", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("Attempted to add / override a PDOL field twice. This is not allowed. The entry will remain: %d, with length: %d", i, i2);
            return this;
        }
        asrc asrc = new asrc(i, (byte) i2, this.f89484d);
        this.f89484d += asrc.f89479b;
        this.f89483b += assu.m74717c(i) + 1;
        this.f89482a.put(Integer.valueOf(asrc.f89478a), asrc);
        return this;
    }
}
