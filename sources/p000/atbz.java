package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: atbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbz implements atci {

    /* renamed from: a */
    public static final byte[] f90047a = asti.m74762a("FFFFFFFFFFFFF002FFFFFFFFFFFF0F02");

    /* renamed from: b */
    public static final byte[] f90048b = asti.m74762a("FFFFFFFFFFFFF003FFFFFFFFFFFF0F03");

    /* renamed from: c */
    public static final byte[] f90049c = asti.m74762a("FFFFFFFFFFFFF001FFFFFFFFFFFF0F01");

    /* renamed from: e */
    private static final srn f90050e = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: d */
    public byte[] f90051d;

    /* renamed from: f */
    private bycy f90052f;

    /* renamed from: g */
    private String f90053g;

    /* renamed from: h */
    private Key f90054h;

    /* renamed from: i */
    private Key f90055i;

    /* renamed from: j */
    private Key f90056j;

    /* renamed from: k */
    private String f90057k;

    /* renamed from: l */
    private bxvd f90058l;

    public atbz(String str, bycy bycy, bycw bycw, byte[] bArr, String str2) {
        bycy bycy2;
        if (bycy != null) {
            byte[] k = bycy.serializeToBytes();
            try {
                bycy2 = (bycy) GeneratedMessageLite.m124016a(bycy.f165733j, k, bxus.m123744c());
            } catch (bxwf e) {
                throw new RuntimeException(e);
            }
        } else {
            bycy2 = null;
        }
        this.f90052f = bycy2;
        if (bycw != null) {
            bxvd bxvd = (bxvd) bycw.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bycw);
            this.f90058l = bxvd;
        }
        this.f90053g = str;
        this.f90051d = bArr;
        this.f90057k = str2;
    }

    /* renamed from: a */
    private static int m75471a(byte b) {
        if (b == Byte.MIN_VALUE) {
            return 1;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 64) {
            return 2;
        }
        throw new IllegalArgumentException("wrong cid");
    }

    /* renamed from: f */
    public static final byte[] m75472f(byte[] bArr) {
        return boan.f132470d.mo68796b(new String(bArr, StandardCharsets.UTF_8));
    }

    /* renamed from: g */
    private final byte[] m75473g(byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
        instance.init(2, this.f90055i, new IvParameterSpec(bArr2));
        return instance.doFinal(bArr);
    }

    /* renamed from: h */
    private final byte[] m75474h(byte[] bArr, byte[] bArr2) {
        boolean z;
        int length;
        byte[] g = m75473g(bArr, bArr2);
        int i = 0;
        if ((g.length & 15) == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        while (true) {
            length = g.length;
            if (g[(length - 1) - i] == 0 && i < 15) {
                i++;
            }
        }
        return g[(length - i) + -1] == Byte.MIN_VALUE ? Arrays.copyOf(g, length - (i + 1)) : g;
    }

    /* renamed from: i */
    private static final int m75475i(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length < length2) {
            return length2 - 32768;
        }
        System.arraycopy(bArr2, 0, bArr, 0, length2);
        return length2;
    }

    /* renamed from: a */
    public final void mo3143a(String str) {
        this.f90057k = "";
    }

    /* renamed from: b */
    public final int mo3152b(String str, String str2) {
        return 0;
    }

    /* renamed from: b */
    public final int mo3153b(byte[] bArr) {
        return 0;
    }

    /* renamed from: b */
    public final bycy mo49814b() {
        return this.f90052f;
    }

    /* renamed from: c */
    public final int mo3155c(byte[] bArr) {
        byte[][] a = bjc.m3174a(bArr);
        bycx bycx = (bycx) bycy.f165733j.mo74144da();
        short a2 = bqct.m112601a(a[0]);
        if (bycx.f164950c) {
            bycx.mo74035c();
            bycx.f164950c = false;
        }
        bycy bycy = (bycy) bycx.f164949b;
        bycy.f165735a |= 4;
        bycy.f165737c = a2;
        short a3 = bqct.m112601a(a[1]);
        if (bycx.f164950c) {
            bycx.mo74035c();
            bycx.f164950c = false;
        }
        bycy bycy2 = (bycy) bycx.f164949b;
        int i = bycy2.f165735a | 2;
        bycy2.f165735a = i;
        bycy2.f165736b = a3;
        byte b = a[2][0];
        int i2 = i | 8;
        bycy2.f165735a = i2;
        bycy2.f165738d = b;
        byte b2 = a[3][0];
        int i3 = i2 | 16;
        bycy2.f165735a = i3;
        bycy2.f165739e = b2;
        byte b3 = a[4][0];
        bycy2.f165735a = i3 | 128;
        bycy2.f165742h = b3;
        this.f90052f = (bycy) bycx.mo74062i();
        return 0;
    }

    /* renamed from: c */
    public final String mo49815c() {
        return this.f90053g;
    }

    /* renamed from: d */
    public final int mo3157d(byte[] bArr) {
        int i;
        byte[][] a = bjc.m3174a(bArr);
        ArrayList arrayList = new ArrayList(a.length >> 2);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int length = a.length;
            if (i2 < length) {
                bxvd da = bycv.f165717e.mo74144da();
                int i3 = i2 + 1;
                int i4 = i3 + 1;
                byte[] bArr4 = a[i3];
                try {
                    ByteString a2 = ByteString.m123261a(m75473g(bArr4, bArr2));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z;
                    }
                    bycv bycv = (bycv) da.f164949b;
                    a2.getClass();
                    bycv.f165719a |= 1;
                    bycv.f165720b = a2;
                    int i5 = i4 + 1;
                    byte[] bArr5 = a[i4];
                    byte[] k = bycv.f165720b.getKey();
                    Cipher instance = Cipher.getInstance("DESede/ECB/NoPadding");
                    instance.init(1, new SecretKeySpec(k, "DESede"));
                    if (!Arrays.equals(bArr5, Arrays.copyOf(instance.doFinal(new byte[8]), 3))) {
                        bnsl bnsl = (bnsl) f90050e.mo68388c();
                        bnsl.mo68432a("atbz", "d", 317, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("KCV doesn't match!");
                        return -11;
                    }
                    int i6 = i5 + 1;
                    short a3 = bqct.m112601a(a[i5]);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bycv bycv2 = (bycv) da.f164949b;
                    bycv2.f165719a |= 2;
                    bycv2.f165721c = a3;
                    if (i6 < length) {
                        byte[] bArr6 = a[i6];
                        if (bArr6.length != 1) {
                            i6++;
                            ByteString a4 = ByteString.m123261a(m75474h(bArr6, bArr3));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bycv bycv3 = (bycv) da.f164949b;
                            a4.getClass();
                            bycv3.f165719a |= 4;
                            bycv3.f165722d = a4;
                            bArr3 = bArr6;
                        }
                    }
                    arrayList.add((bycv) da.mo74062i());
                    bArr2 = bArr4;
                    i2 = i6;
                    z = false;
                } catch (GeneralSecurityException e) {
                    bnsl bnsl2 = (bnsl) f90050e.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("atbz", "d", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Bundle handling error");
                    asti.m74760a(bArr);
                    return -17;
                }
            } else {
                int size = this.f90052f.f165743i.size();
                bycy bycy = this.f90052f;
                int min = Math.min(bycy.f165742h, size - bycy.f165741g);
                bycv[] bycvArr = new bycv[(arrayList.size() + min)];
                System.arraycopy(this.f90052f.f165743i.toArray(new bycv[0]), this.f90052f.f165743i.size() - min, bycvArr, 0, min);
                System.arraycopy(arrayList.toArray(), 0, bycvArr, min, arrayList.size());
                bycy bycy2 = this.f90052f;
                bxvd bxvd = (bxvd) bycy2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bycy2);
                bycx bycx = (bycx) bxvd;
                if (bycx.f164950c) {
                    bycx.mo74035c();
                    bycx.f164950c = false;
                }
                bycy bycy3 = bycy.f165733j;
                ((bycy) bycx.f164949b).f165743i = GeneratedMessageLite.m124030de();
                bycx.mo74345a(Arrays.asList(bycvArr));
                if (!bycx.f164950c) {
                    i = 0;
                } else {
                    bycx.mo74035c();
                    i = 0;
                    bycx.f164950c = false;
                }
                bycy bycy4 = (bycy) bycx.f164949b;
                bycy4.f165735a |= 64;
                bycy4.f165741g = i;
                this.f90052f = (bycy) bycx.mo74062i();
                return i;
            }
        }
    }

    /* renamed from: d */
    public final int mo3158d(byte[] bArr, byte[] bArr2) {
        return 0;
    }

    /* renamed from: e */
    public final int mo3159e(byte[] bArr) {
        return 0;
    }

    /* renamed from: e */
    public final String mo49817e() {
        return this.f90057k;
    }

    /* renamed from: a */
    public final int mo3146a(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (i != 0) {
            return m75475i(bArr2, this.f90053g.getBytes(StandardCharsets.UTF_8));
        }
        byte[][] a = bjc.m3174a(bArr);
        byte[] f = m75472f(a[0]);
        byte[] f2 = m75472f(a[1]);
        byte[] f3 = m75472f(a[2]);
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(this.f90054h);
            instance.update(f2);
            if (!Arrays.equals(instance.doFinal(f), f3)) {
                bnsl bnsl = (bnsl) f90050e.mo68388c();
                bnsl.mo68432a("atbz", "a", 676, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("HMAC signature doesn't match!");
                return -12;
            }
            Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance2.init(2, this.f90056j, new IvParameterSpec(f2));
            byte[] doFinal = instance2.doFinal(f);
            return m75475i(bArr2, bjc.m3173a(new byte[][]{ByteBuffer.allocate(doFinal.length + 1).put((byte) 49).put(doFinal).array()}));
        } catch (GeneralSecurityException e) {
            bnsl bnsl2 = (bnsl) f90050e.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atbz", "a", 690, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Decryption failed");
            return -17;
        } catch (IOException e2) {
            bnsl bnsl3 = (bnsl) f90050e.mo68387b();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("atbz", "a", 693, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error converting to LLVar");
            return -17;
        }
    }

    /* renamed from: e */
    public final int mo3160e(byte[] bArr, byte[] bArr2) {
        bArr2[0] = 1;
        return 0;
    }

    /* renamed from: f */
    public final int mo3161f(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = bjc.m3174a(bArr)[0];
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(this.f90054h);
            byte[] encode = Base64.encode(instance.doFinal(bArr3), 0);
            int length = encode.length;
            byte[] bArr4 = new byte[(length + 1)];
            bArr4[0] = 49;
            System.arraycopy(encode, 0, bArr4, 1, length);
            return m75475i(bArr2, bjc.m3173a(new byte[][]{bArr4}));
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90050e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbz", "f", 734, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Signature generation failed");
            return -17;
        } catch (IOException e2) {
            bnsl bnsl2 = (bnsl) f90050e.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("atbz", "f", 737, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error converting to LLVar");
            return -17;
        }
    }

    /* renamed from: b */
    public final int mo3154b(byte[] bArr, byte[] bArr2) {
        String str;
        try {
            if (!askc.m74274c(askc.m74272b())) {
                str = "-----BEGIN CERTIFICATE-----\nMIIFEzCCA3ugAwIBAgIKAQIDBAUGBwgBATANBgkqhkiG9w0BAQwFADCBpDFAMD4G\nA1UEAww3QW1lcmljYW4gRXhwcmVzcyBSZXN0cmljdGVkIEhDRSBDZXJ0aWZpY2F0\naW9uIEF1dGhvcml0eTEMMAoGA1UECwwDR05CMSEwHwYDVQQKDBhBbWVyaWNhbiBF\neHByZXNzIENvbXBhbnkxEDAOBgNVBAcMB1Bob2VuaXgxEDAOBgNVBAgMB0FyaXpv\nbmExCzAJBgNVBAYTAlVTMB4XDTE1MDUwODEzMjk1OVoXDTI1MDUwOTEzMjk1OVow\ngZcxMzAxBgNVBAMMKkFtZXJpY2FuIEV4cHJlc3MgUmVzdHJpY3RlZCBIQ0UgSXNz\ndWluZyBDQTEMMAoGA1UECwwDR05CMSEwHwYDVQQKDBhBbWVyaWNhbiBFeHByZXNz\nIENvbXBhbnkxEDAOBgNVBAcMB1Bob2VuaXgxEDAOBgNVBAgMB0FyaXpvbmExCzAJ\nBgNVBAYTAlVTMIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEA3DBVjJM5\nLzNC9A+ejWVYSyCcj/eVbMMVaOHm8sOLj+dF0u0QiV8CUROkTyb5DSHhYXXROy2A\n+Dn8qIoyS6oFQl3H9ZqjdefpZDD8mK5lZNKLF9Bvrl7YpGq8/IDlXrz2TJCSnBD5\nf8YXz2qE5MQoWFo0riliyPfl0p8PyaxMzvcxQVeGpRji0kJBzmvLNlY1ccqgXybk\njXZ5XXeKXzJDnjTP3pcttsDtpp+nYnJsxQdRGi9xFr5MPazRxI2nCTJJSPjX6n7j\nx+C8t92qrzxSxMQHD5mv1VJqjiAKlyV5w+jqG9s/EE2IkYn21Kpaj8c0McqzgoE+\nHlYW1KNGAXSE6f68KCGHObHzi4iia2uHrB/Sktmv7/Jkheg1vxHqNhXGQYMLrgEa\nLD5/xAPGXleqpq1N97fMG1OZ46O0j3MhPNonIoOtu0Uhh6wKSy00n5FMfMeVXn71\n9GcSs7IAkE2YtrVWUNqqjtWHVPQogoUjfZlzGCsDEk3ucgFllMzJxnIhAgMBAAGj\nUjBQMA4GA1UdDwEB/wQEAwIBxjAdBgNVHQ4EFgQU64q3AiixN9eAB9K1RlsVi+sp\n/oUwHwYDVR0jBBgwFoAU3rYepvNufJCh17/lh/cekacEqpswDQYJKoZIhvcNAQEM\nBQADggGBANBh6Ezj41qrxoCyK35+UeGe7WEwDa8Ky5BmQBQSbyvU3mbgSf+bXOAS\n/QzdvXRRMUeC5imPHVqkTz7IU1zGQumMf8ymfRD0Mw8okkBIQQP1IlrVj5RLJFaI\nbHDRuoHu/t9TQKliVyKliRgrXhEq99fyMVvW3X4EK+FZi6pJKsnk7Pi5DtzuUofZ\njQQUuBdaUI/wKSvgQ+bLlofTXiASYSds0hVWrEzKsRajlxAjWqyhZ0TUUy2qi+ru\nNDckCDPcnBHsx0BaWhClUTYwVeze2UtqDPGXJ24JDZU/3FytT8kJR6p/LJDT5nHo\nR47+BAVQR03MT4T4NOwb6uu5HHOSH4QuEj52oFQi2LIdw+SKYNU0xPhPuHnq4kqI\naxPxY1qIHS2dVkYi6GKmH7VDLv4WcvNFb//ChQOmdFqWaI98EOrIkzEqli2K65/+\nQzdeYLE+KUHxQWFZH862H+uBiGXM3WUFrfPvNUVVfxIury954CgSqPp9aOWk2d8X\naB3FVLz0zg==\n-----END CERTIFICATE-----\n";
            } else {
                str = "-----BEGIN CERTIFICATE-----\nMIIFeTCCA+GgAwIBAgIULm+g+H2X1kT3+cETXEhV+cE885gwDQYJKoZIhvcNAQEM\nBQAwgaUxCzAJBgNVBAYTAlVTMRAwDgYDVQQIDAdBcml6b25hMRAwDgYDVQQHDAdQ\naG9lbml4MSEwHwYDVQQKDBhBbWVyaWNhbiBFeHByZXNzIENvbXBhbnkxDDAKBgNV\nBAsMA0dOQjFBMD8GA1UEAww4QW1lcmljYW4gRXhwcmVzcyBSZXN0cmljdGVkIEhD\nRSBDZXJ0aWZpY2F0aW9uIEF1dGhvcml0eSAwHhcNMTUwNTA3MTUxOTI2WhcNMjUw\nNTA3MTUxOTI2WjCBmDELMAkGA1UEBhMCVVMxEDAOBgNVBAgTB0FyaXpvbmExEDAO\nBgNVBAcTB1Bob2VuaXgxITAfBgNVBAoTGEFtZXJpY2FuIEV4cHJlc3MgQ29tcGFu\neTEMMAoGA1UECxMDR05CMTQwMgYDVQQDEytBbWVyaWNhbiBFeHByZXNzIFJlc3Ry\naWN0ZWQgSENFIElzc3VpbmcgQ0EgMIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIB\nigKCAYEAnEUREkw03uLaR6A47mXojX5OZunB0UxCZBibOGIsjelb5TojrfMiEVhG\n/N6JCFahHilQ+HOl7i7ijpouKTLQyElpLYx+VTUCzDh38ozpLQSiF/fRKbRxyJ0F\nh7S+EK7lHxhNLhybaKM3cL4PiGpXvQeAHE1wFHGMcj/q0Z9SAg+sfqjNnL5oqawL\nqzqSCmbg4ZhL+iOVp1918K1F/7jARQ9teaCRokPtyMzk/zO27m4a9Ah7Sw1Q7owY\nDomN+cKmgqC0yWpIMyIZJPv1P23RV+xBM7NLo8OxfyDO28Hfpv9pDvA367OB4xwy\nTRhKUzIUDF9lP6t64SQ629zAwprPAIfbO2JYMsubFoXTK2L0yuBvSRS8s8msNFEI\nEGX4pKcsGiG69/01hO3bx81cytIyd2aph/ROWvZIUgjsSf69p/jcD9gzP6flXgBf\npCLCWgylVi6QiPij101H6g/G+e+MNxkCNA04earmmuwWLJsVaAjbq7rk/QYpjPec\nf2N1nw6VAgMBAAGjgaswgagwEgYDVR0TAQH/BAgwBgEB/wIBADAOBgNVHQ8BAf8E\nBAMCAcYwHwYDVR0jBBgwFoAUA6znkDLOkzJFkJrF8mAhSe4ZIFowQgYDVR0fBDsw\nOTA3oDWgM4YxaHR0cDovL2FtZXhzay5jcmwuY29tLXN0cm9uZy1pZC5uZXQvYW1l\neDJyb290LmNybDAdBgNVHQ4EFgQUJc9lqQS2yS+/KaHXQisKLQz8aXwwDQYJKoZI\nhvcNAQEMBQADggGBAK3OKaRnNpePzenJ8coGs7xxwkEb86mstMhiCcpVtpLlR/Hk\nogwFtDGZXMeDKYjt7GwqfCwXbPCH51j4FGbVNU4mQmNqwceSLGeHjYjKmVZZpBYw\n+t8GuPZ0IXepMRGvg2xYWTjqmrrHCf5Zjnk5fv2jXg8f8gEl7LhY/zloh7yqjjhB\nMXkI3xyCDrWs0PmrRUl4PvGyW473wCHvUZgXBQud6cUqL5jpFEVXJhpPgfkCuHpf\nerYiKcun1J2sQOEy0DQQM+ijzMoea8YNHt7zuHcC4qcIS/JHmRp10ShZs+sEiK56\nDINvukRGOYnyAnNPXeqJ3CqDTD38XKmPQh0+A/noRhVOz57uJ/IKqp8c0N0IQZaH\n9ygD7HrPhLaWrvkDNRpes4Y8y6qGihFUhrAq/TpnnSb0ZX6qUJ304JCBYH64SFqA\nz+76Ho9+ubMrhz0BF1GpZIQPPobOjLq428pw0FHdN8Wes1+qEWID4aUyxQfRzpN6\nTYGriYcb13C2tlmGgQ==\n-----END CERTIFICATE-----\n";
            }
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.US_ASCII)));
            byte[][] a = bjc.m3174a(bArr);
            byte[] bArr3 = a[0];
            byte[] bArr4 = a[1];
            Certificate generateCertificate2 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr3));
            generateCertificate2.verify(generateCertificate.getPublicKey());
            PublicKey publicKey = generateCertificate2.getPublicKey();
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(this.f90051d);
            KeyAgreement instance = KeyAgreement.getInstance("ECDH");
            instance.init((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec));
            instance.doPhase(publicKey, true);
            SecretKeySpec secretKeySpec = new SecretKeySpec(new asmb(MessageDigest.getInstance("SHA-256")).mo49232a(instance.generateSecret(), bArr4), "AES");
            Cipher instance2 = Cipher.getInstance("AES/CBC/NoPadding");
            instance2.init(1, secretKeySpec, new IvParameterSpec(new byte[16]));
            this.f90054h = new SecretKeySpec(instance2.doFinal(f90047a), "HmacSHA256");
            this.f90055i = new SecretKeySpec(instance2.doFinal(f90049c), "AES");
            this.f90056j = new SecretKeySpec(instance2.doFinal(f90048b), "AES");
            return 0;
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90050e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbz", "b", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Bundle handling error");
            return -17;
        }
    }

    /* renamed from: a */
    public final int mo3147a(int i, byte[] bArr, byte[] bArr2) {
        byte[][] a = bjc.m3174a(bArr);
        try {
            bxvd da = bycw.f165723i.mo74144da();
            this.f90058l = da;
            byte[] bArr3 = new byte[16];
            ByteString a2 = ByteString.m123261a(m75474h(a[0], bArr3));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bycw bycw = (bycw) da.f164949b;
            a2.getClass();
            bycw.f165725a |= 1;
            bycw.f165726b = a2;
            bxvd bxvd = this.f90058l;
            ByteString a3 = ByteString.m123261a(m75474h(a[1], bArr3));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bycw bycw2 = (bycw) bxvd.f164949b;
            a3.getClass();
            bycw2.f165725a |= 2;
            bycw2.f165727c = a3;
            bxvd bxvd2 = this.f90058l;
            ByteString a4 = ByteString.m123261a(m75474h(a[2], bArr3));
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bycw bycw3 = (bycw) bxvd2.f164949b;
            a4.getClass();
            bycw3.f165725a |= 4;
            bycw3.f165728d = a4;
            bxvd bxvd3 = this.f90058l;
            ByteString a5 = ByteString.m123261a(m75474h(a[3], bArr3));
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bycw bycw4 = (bycw) bxvd3.f164949b;
            a5.getClass();
            bycw4.f165725a |= 8;
            bycw4.f165729e = a5;
            bxvd bxvd4 = this.f90058l;
            ByteString a6 = ByteString.m123261a(m75474h(a[4], bArr3));
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bycw bycw5 = (bycw) bxvd4.f164949b;
            a6.getClass();
            bycw5.f165725a = 16 | bycw5.f165725a;
            bycw5.f165730f = a6;
            bxvd bxvd5 = this.f90058l;
            ByteString a7 = ByteString.m123261a(new BigInteger(1, ((bycw) bxvd5.f164949b).f165728d.getKey()).multiply(new BigInteger(1, ((bycw) this.f90058l.f164949b).f165729e.getKey())).toByteArray());
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bycw bycw6 = (bycw) bxvd5.f164949b;
            a7.getClass();
            bycw6.f165725a |= 32;
            bycw6.f165731g = a7;
            bxvd bxvd6 = this.f90058l;
            ByteString a8 = ByteString.m123261a(a[6]);
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            bycw bycw7 = (bycw) bxvd6.f164949b;
            a8.getClass();
            bycw7.f165725a |= 64;
            bycw7.f165732h = a8;
            bycy bycy = this.f90052f;
            bxvd bxvd7 = (bxvd) bycy.mo74142c(5);
            bxvd7.mo73625a((GeneratedMessageLite) bycy);
            bycx bycx = (bycx) bxvd7;
            if (bycx.f164950c) {
                bycx.mo74035c();
                bycx.f164950c = false;
            }
            bycy bycy2 = (bycy) bycx.f164949b;
            bycy bycy3 = bycy.f165733j;
            bycy2.f165735a |= 32;
            bycy2.f165740f = i;
            this.f90052f = (bycy) bycx.mo74062i();
            return 0;
        } catch (GeneralSecurityException e) {
            return -17;
        }
    }

    /* renamed from: c */
    public final int mo3156c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        bycv bycv;
        short s;
        byte[] bArr4 = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = wrap.get();
        wrap.get(new byte[i]);
        if (i == 29 && (s = wrap.getShort()) != 0 && (this.f90052f.f165736b & 65279) != (s & 65279)) {
            return -15;
        }
        short s2 = wrap.getShort();
        byte[] bArr5 = new byte[4];
        wrap.get(bArr5);
        int i2 = 1;
        if (m75471a((byte) this.f90052f.f165739e) < m75471a((byte) (bArr5[1] & 192))) {
            return -15;
        }
        bycy bycy = this.f90052f;
        bxvd bxvd = (bxvd) bycy.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bycy);
        bycx bycx = (bycx) bxvd;
        int i3 = ((bycy) bycx.f164949b).f165741g;
        while (true) {
            bArr3 = null;
            if (i3 >= ((bycy) bycx.f164949b).f165743i.size()) {
                this.f90052f = (bycy) bycx.mo74062i();
                bycv = null;
                break;
            }
            int i4 = i3 + 1;
            bycv = bycx.mo74344a(i3);
            if (bycv.f165721c >= s2) {
                if (bycx.f164950c) {
                    bycx.mo74035c();
                    bycx.f164950c = false;
                }
                bycy bycy2 = (bycy) bycx.f164949b;
                bycy bycy3 = bycy.f165733j;
                bycy2.f165735a |= 64;
                bycy2.f165741g = i4;
                this.f90052f = (bycy) bycx.mo74062i();
            } else {
                i3 = i4;
            }
        }
        if (bycv == null) {
            return -24;
        }
        int length = bArr4.length;
        System.arraycopy(bqct.m112602a((short) bycv.f165721c), 0, bArr4, length - 6, 2);
        int i5 = length - 1;
        int i6 = 8;
        int i7 = (8 - (i5 % 8)) + i5;
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArr4, 1, bArr6, 0, i5);
        try {
            byte[] k = bycv.f165720b.getKey();
            byte[] bArr7 = new byte[8];
            ByteBuffer allocate = ByteBuffer.allocate(24);
            allocate.put(k, 0, 8);
            allocate.put(k, 0, 8);
            allocate.put(k, 0, 8);
            ByteBuffer allocate2 = ByteBuffer.allocate(24);
            allocate2.put(k, 8, 8);
            allocate2.put(k, 8, 8);
            allocate2.put(k, 8, 8);
            byte[] array = allocate.array();
            byte[] array2 = allocate2.array();
            int i8 = i7 >> 3;
            SecretKeySpec secretKeySpec = new SecretKeySpec(array, "DESede");
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(array2, "DESede");
            Cipher instance = Cipher.getInstance("DESede/CBC/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr7));
            int i9 = 0;
            while (i9 < i8) {
                if (bArr3 == null) {
                    bArr3 = Arrays.copyOf(bArr6, i6);
                }
                bArr3 = instance.doFinal(bArr3);
                i9++;
                if (i9 < i8) {
                    int i10 = i9 * 8;
                    byte[] copyOfRange = Arrays.copyOfRange(bArr6, i10, i10 + 8);
                    for (int i11 = 0; i11 < bArr3.length; i11++) {
                        bArr3[i11] = (byte) (bArr3[i11] ^ copyOfRange[i11]);
                    }
                }
                i2 = 1;
                i6 = 8;
            }
            instance.init(2, secretKeySpec2, new IvParameterSpec(bArr7));
            byte[] doFinal = instance.doFinal(bArr3);
            instance.init(i2, secretKeySpec, new IvParameterSpec(bArr7));
            byte[] doFinal2 = instance.doFinal(doFinal);
            System.arraycopy(doFinal2, 0, bArr2, 0, doFinal2.length);
            return bycv.f165721c;
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90050e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbz", "c", 548, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cryptogram generation failed");
            return -17;
        }
    }

    /* renamed from: d */
    public final bycw mo49816d() {
        bxvd bxvd = this.f90058l;
        if (bxvd != null) {
            return (bycw) bxvd.mo74062i();
        }
        return null;
    }

    /* renamed from: a */
    public final int mo3148a(byte[] bArr) {
        String str = this.f90053g;
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo3149a(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f90053g = new String(bArr, 0, i, StandardCharsets.UTF_8);
        return 0;
    }

    /* renamed from: a */
    public final int mo3150a(byte[] bArr, byte[] bArr2) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(new ECGenParameterSpec("prime256v1"), new SecureRandom());
            KeyPair genKeyPair = instance.genKeyPair();
            this.f90051d = genKeyPair.getPrivate().getEncoded();
            try {
                return m75475i(bArr2, bjc.m3173a(new byte[][]{atcb.m75501a(boan.f132470d.mo68794a(genKeyPair.getPublic().getEncoded()))}));
            } catch (IOException e) {
                bnsl bnsl = (bnsl) f90050e.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atbz", "a", 429, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error converting to LLVar");
                return -17;
            }
        } catch (GeneralSecurityException e2) {
            bnsl bnsl2 = (bnsl) f90050e.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("atbz", "a", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error generating key pair");
            return -17;
        }
    }

    /* renamed from: a */
    public final int mo3151a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (this.f90058l == null) {
            return -2;
        }
        bArr2[0] = 106;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        int length = bArr2.length;
        bArr2[length - 1] = -68;
        short s = (short) (this.f90052f.f165740f / 8);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(bArr2, 1, s - 18);
            System.arraycopy(instance.digest(), 0, bArr2, length - 21, 20);
            Cipher instance2 = Cipher.getInstance("RSA/None/NoPadding");
            instance2.init(1, (RSAPrivateCrtKey) KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, ((bycw) this.f90058l.f164949b).f165731g.getKey()), new BigInteger(1, ((bycw) this.f90058l.f164949b).f165732h.getKey()), BigInteger.ZERO, new BigInteger(1, ((bycw) this.f90058l.f164949b).f165728d.getKey()), new BigInteger(1, ((bycw) this.f90058l.f164949b).f165729e.getKey()), new BigInteger(1, ((bycw) this.f90058l.f164949b).f165726b.getKey()), new BigInteger(1, ((bycw) this.f90058l.f164949b).f165727c.getKey()), new BigInteger(1, ((bycw) this.f90058l.f164949b).f165730f.getKey()))));
            instance2.update(bArr2, 0, s);
            return m75475i(bArr2, instance2.doFinal());
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90050e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbz", "a", 618, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Signature generation failed");
            return -17;
        }
    }

    /* renamed from: a */
    public final String mo3142a(String str, String str2) {
        return str2.equals("HCECLIENT_META_DATA") ? stm.m36300b(this.f90057k) : "";
    }

    /* renamed from: a */
    public final void mo3144a(String str, String str2, String str3) {
        if (str2.equals("HCECLIENT_META_DATA")) {
            this.f90057k = str3;
        }
    }

    /* renamed from: a */
    public final boolean mo3145a() {
        return stm.m36300b(this.f90057k) != null;
    }
}
