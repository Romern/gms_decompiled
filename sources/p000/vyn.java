package p000;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: vyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyn {

    /* renamed from: a */
    private final String f50241a;

    /* renamed from: b */
    private final vwf f50242b;

    public vyn(Context context) {
        String str = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxW77dCKJ8mhEIfXXdeidi7/7LMNM/fzwI+wj1Ed8xIKgTYWCnekRko3JxQb4Cv/gEL5hEA8e9lFs3V67VUL6hCo1FxysXj7Q8n3Kp7hARDkbiZ0mdk8bSanqrPAXTPx6pEL2ZOzfFCHEtJdhz5Ozp2C4XTKF1SBv/YbpsqSUJwdhG7ZPGjyCMRloMww6ITpGdVQ8lChklkCek0WPbz2UrY5RC1qIJKmmcB6KNxxE776Dn6QoYbhN5jPeVBp7lDD3UxjfVzTxKKDAome6fUVBop3dpcLM6rq3+nNT2YArgqTD1qtsVM9vHlcLaAYaPg82vtIN80iDUseMlVHgK+nf6wIDAQAB";
        if (cdrb.f181587a.mo6606a().mo78202b()) {
            try {
                FileInputStream openFileInput = context.openFileInput("PUB_KEY");
                InputStreamReader inputStreamReader = new InputStreamReader(openFileInput);
                StringBuilder sb = new StringBuilder();
                sdo.m34959a(inputStreamReader);
                sdo.m34959a(sb);
                CharBuffer allocate = CharBuffer.allocate(1024);
                while (inputStreamReader.read(allocate) != -1) {
                    allocate.flip();
                    sb.append((CharSequence) allocate);
                    allocate.remaining();
                    allocate.clear();
                }
                str = sb.toString();
                try {
                    openFileInput.close();
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                Log.e("DG", "Failed to read key override", e);
                this.f50241a = str;
                this.f50242b = vwf.m41483a(context);
            }
        }
        this.f50241a = str;
        this.f50242b = vwf.m41483a(context);
    }

    /* renamed from: a */
    public final boolean mo28964a(byte[] bArr, byte[] bArr2) {
        try {
            KeyFactory e = spn.m35883e("RSA");
            if (e == null) {
                this.f50242b.mo28911a(new RuntimeException("Failed to get key factory object."));
                return false;
            }
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(this.f50241a, 0));
            Signature d = spn.m35878d("SHA256withRSA");
            if (d == null) {
                this.f50242b.mo28911a(new RuntimeException("Failed to get signature object."));
                return false;
            }
            d.initVerify(e.generatePublic(x509EncodedKeySpec));
            d.update(bArr);
            return d.verify(bArr2);
        } catch (GeneralSecurityException e2) {
            this.f50242b.mo28911a(e2);
            return false;
        }
    }
}
