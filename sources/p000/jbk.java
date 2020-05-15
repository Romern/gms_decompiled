package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: jbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jbk {

    /* renamed from: i */
    private static final sek f22107i = jdh.m16547a("RecoveryDataHolder");

    /* renamed from: a */
    public final Account f22108a;

    /* renamed from: b */
    public final bxtx f22109b;

    /* renamed from: c */
    public final bxtx f22110c;

    /* renamed from: d */
    public final CertPath f22111d;

    /* renamed from: e */
    public final bxtx f22112e;

    /* renamed from: f */
    public final int f22113f;

    /* renamed from: g */
    public final long f22114g;

    /* renamed from: h */
    public final bxtx f22115h;

    private jbk(Account account, bxtx bxtx, bxtx bxtx2, CertPath certPath, bxtx bxtx3, long j, int i, bxtx bxtx4) {
        this.f22108a = account;
        this.f22109b = bxtx;
        this.f22110c = bxtx2;
        this.f22111d = certPath;
        this.f22112e = bxtx3;
        this.f22114g = j;
        this.f22113f = i;
        this.f22115h = bxtx4;
    }

    /* renamed from: a */
    private static bxtx m16461a(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return bxtx.m123261a(byteArray);
        }
        throw new jbl(str.length() == 0 ? new String("Null ") : "Null ".concat(str), 14);
    }

    /* renamed from: b */
    private static CertPath m16463b(Bundle bundle) {
        byte[] byteArray = bundle.getByteArray("com.google.android.gms.auth.folsom.EXTRA_CERT_PATH");
        if (byteArray == null || byteArray.length == 0) {
            return null;
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertPath(new ByteArrayInputStream(byteArray), "PkiPath");
        } catch (CertificateException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static jbk m16462a(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT");
        if (parcelable != null) {
            Account account = (Account) ((Parcelable) Account.class.cast(parcelable));
            bxtx a = m16461a(bundle, "com.google.android.gms.auth.folsom.EXTRA_LSKF_HASH");
            bxtx a2 = m16461a(bundle, "com.google.android.gms.auth.folsom.EXTRA_CHALLENGE");
            bxtx a3 = m16461a(bundle, "com.google.android.gms.auth.folsom.EXTRA_VAULT_HANDLE");
            try {
                CertPath b = m16463b(bundle);
                if (b != null) {
                    f22107i.mo25412b("Received non-null CertPath for recovery.", new Object[0]);
                    bxtx a4 = bxtx.m123261a(bslu.m115954a(((Certificate) b.getCertificates().get(0)).getPublicKey()));
                    bxtx a5 = m16461a(bundle, "com.google.android.gms.auth.folsom.EXTRA_COUNTER_ID");
                    if (a5.mo73744a() == 8) {
                        long j = ByteBuffer.wrap(a5.mo73780k()).order(ByteOrder.LITTLE_ENDIAN).getLong();
                        int i = bundle.getInt("com.google.android.gms.auth.folsom.EXTRA_MAX_ATTEMPTS");
                        return new jbk(account, a, a2, b, a4, j, i == 0 ? 10 : i, a3);
                    }
                    throw new jbl("Invalid number of bytes for CounterId", 14);
                }
                f22107i.mo25418e("Received null CertPath for recovery", new Object[0]);
                throw new jbl("Received null CertPath for recovery", 14);
            } catch (CertificateException e) {
                f22107i.mo25418e("Cannot decode the received CertPath", new Object[0]);
                throw new jbl("Cannot decode the received CertPath", e);
            }
        } else {
            throw new jbl("Null com.google.android.gms.auth.folsom.EXTRA_ACCOUNT", 14);
        }
    }
}
