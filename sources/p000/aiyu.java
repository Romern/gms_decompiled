package p000;

import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleFilter;
import java.util.List;

/* renamed from: aiyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyu {

    /* renamed from: a */
    public static final BleFilter f70105a;

    /* renamed from: b */
    private static final ParcelUuid f70106b = ParcelUuid.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");

    static {
        neh neh = new neh();
        neh.mo20517a(f70106b);
        f70105a = neh.mo20515a();
    }

    /* renamed from: a */
    public static ahfv m58240a(nek nek) {
        List list = nek.f35398a;
        ahfv ahfv = null;
        if (list == null || !list.contains(f70106b)) {
            return null;
        }
        byte[] a = nek.mo20526a(f70106b);
        if (a != null) {
            return new ahfv(a);
        }
        String str = nek.f35401d;
        if (str == null) {
            return null;
        }
        try {
            ahfv a2 = ahfv.m55670a(str);
            try {
                byte[] bArr = a2.f67128a;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return a2;
            } catch (IllegalArgumentException e) {
                ahfv = a2;
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                bnsl.mo68432a("aiyu", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("No token in either service data or device name: %s", nek.f35401d);
                return ahfv;
            }
        } catch (IllegalArgumentException e2) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68388c();
            bnsl2.mo68432a("aiyu", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("No token in either service data or device name: %s", nek.f35401d);
            return ahfv;
        }
    }
}
