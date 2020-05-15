package p000;

import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;

/* renamed from: egz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class egz {

    /* renamed from: a */
    public final eia f14893a;

    /* renamed from: b */
    public final List f14894b;

    /* renamed from: c */
    public final Logger f14895c;

    /* renamed from: d */
    private final SecureRandom f14896d = new SecureRandom();

    /* renamed from: e */
    private SecretKey f14897e;

    public egz(eia eia, egx egx, Logger Logger) {
        bmxy.m108581a(eia);
        this.f14893a = eia;
        bmxy.m108581a(egx);
        bmxy.m108581a(Logger);
        this.f14895c = Logger;
        this.f14894b = new ArrayList();
        this.f14897e = null;
    }

    /* renamed from: a */
    static int m10392a(bqmb bqmb) {
        bqmb bqmb2 = bqmb.KEY_TYPE_UNSPECIFIED;
        ehc ehc = ehc.ASYMMETRIC_KEY;
        int ordinal = bqmb.ordinal();
        if (ordinal == 1) {
            return 16;
        }
        if (ordinal == 2) {
            return 32;
        }
        throw new ehf("Unsupported keyType", ehh.UNSUPPORTED_ACTION);
    }

    /* renamed from: a */
    private static SecretKey m10393a(ehk ehk) {
        try {
            return ehv.m10463a(ehk.f14974b.getPrivate(), ehv.m10473c(ehk.f14975c));
        } catch (InvalidKeyException | InvalidKeySpecException e) {
            throw new ehf(e, ehh.CRYPTOGRAPHIC_KEY_ERROR);
        }
    }

    /* renamed from: a */
    public static boolean m10394a(ehm ehm) {
        return ehm != null && !ehm.f14980c.isEmpty();
    }

    /* renamed from: a */
    public final eht mo10120a(String str, String str2, bqmb bqmb, long j, ehk ehk) {
        int i;
        String str3 = str;
        if (this.f14897e == null) {
            this.f14897e = m10393a(ehk);
        }
        try {
            byte[] a = ehv.m10469a(this.f14897e.getEncoded(), ehv.f15022a, str3.getBytes(bmwy.f131158c), "HmacSHA256", m10392a(bqmb));
            byte[] a2 = mo10121a(str);
            if (!"authzen".equals(str3)) {
                i = 1;
            } else {
                i = 2;
            }
            long currentTimeMillis = System.currentTimeMillis();
            return new eht(str, str2, a2, bqmb, ehp.ACTIVE_KEY, i, a, currentTimeMillis, currentTimeMillis + j);
        } catch (InvalidKeyException e) {
            throw new ehf(e, ehh.CRYPTOGRAPHIC_KEY_ERROR);
        }
    }

    /* renamed from: a */
    public final byte[] mo10121a(String str) {
        if (str.equals("PublicKey")) {
            return "device_key".getBytes(bmwy.f131158c);
        }
        byte[] bArr = new byte[32];
        this.f14896d.nextBytes(bArr);
        if (str.equals("authzen")) {
            bArr[0] = (byte) (Integer.valueOf(bArr[0]).intValue() & 127);
        }
        return bArr;
    }
}
