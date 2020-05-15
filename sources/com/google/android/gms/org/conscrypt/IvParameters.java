package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IvParameters extends AlgorithmParametersSpi {

    /* renamed from: iv */
    private byte[] f81428iv;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AES extends IvParameters {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ChaCha20 extends IvParameters {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DESEDE extends IvParameters {
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        long j = 0;
        try {
            j = NativeCrypto.asn1_write_init();
            try {
                NativeCrypto.asn1_write_octetstring(j, this.f81428iv);
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
                NativeCrypto.asn1_write_free(j);
                return asn1_write_finish;
            } catch (IOException e) {
                e = e;
                try {
                    NativeCrypto.asn1_write_cleanup(j);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    NativeCrypto.asn1_write_free(j);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            NativeCrypto.asn1_write_cleanup(j);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            NativeCrypto.asn1_write_free(j);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.f81428iv);
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("Incompatible AlgorithmParametersSpec class: ");
        sb.append(valueOf);
        throw new InvalidParameterSpecException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.f81428iv = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
            return;
        }
        throw new InvalidParameterSpecException("Only IvParameterSpec is supported");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "Conscrypt IV AlgorithmParameters";
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) {
        long j;
        try {
            j = NativeCrypto.asn1_read_init(bArr);
            try {
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(j);
                if (NativeCrypto.asn1_read_is_empty(j)) {
                    this.f81428iv = asn1_read_octetstring;
                    NativeCrypto.asn1_read_free(j);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
            NativeCrypto.asn1_read_free(j);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        if (str.equals("RAW")) {
            return (byte[]) this.f81428iv.clone();
        }
        throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
        } else if (str.equals("RAW")) {
            this.f81428iv = (byte[]) bArr.clone();
        } else {
            throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
        }
    }
}
