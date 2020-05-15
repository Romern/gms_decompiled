package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: xkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkw implements bmxj {

    /* renamed from: a */
    private final xkf f52636a;

    public xkw(xkf xkf) {
        this.f52636a = xkf;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        byte[] bArr = (byte[]) obj;
        try {
            xkf xkf = this.f52636a;
            int i = 0;
            if (bArr != null) {
                z = bArr.length > 0;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            sdo.m34959a(xkf);
            byte b = bArr[0];
            xkj[] values = xkj.values();
            int length = values.length;
            while (i < length) {
                xkj xkj = values[i];
                if (xkj.f52553Z != b) {
                    i++;
                } else if (xkj != xkj.CTAP1_ERR_SUCCESS) {
                    return new xkg(xkj, null);
                } else {
                    if (xkf instanceof xkq) {
                        return new xkg(xkj, null);
                    }
                    bypx b2 = bypx.m125087b(Arrays.copyOfRange(bArr, 1, bArr.length));
                    xke xke = xke.AUTHENTICATOR_MAKE_CREDENTIAL;
                    int ordinal = xkf.mo29860a().ordinal();
                    if (ordinal == 0) {
                        return new xkg(xkj, xkv.m43119a(b2));
                    }
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return new xkg(xkj, xku.m43117a(b2));
                        }
                        if (ordinal == 3) {
                            throw new UnsupportedOperationException("Parsing client pin responses is not yet supported");
                        } else if (ordinal != 5) {
                            String valueOf = String.valueOf(xkf.mo29860a());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                            sb.append("Unrecognizable input command type: ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    return new xkg(xkj, xks.m43109a(b2, xkf));
                }
            }
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("Unrecognized CTAP2 status code encountered: ");
            sb2.append((int) b);
            throw new xki(sb2.toString());
        } catch (IOException e) {
            adbd a = adbe.m50105a();
            a.f61233b = e;
            a.f61234c = 34006;
            throw a.mo33301a().mo33303c();
        }
    }
}
