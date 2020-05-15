package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() {
        Throwable th;
        long j;
        long j2;
        long j3;
        long j4 = 0;
        try {
            j = NativeCrypto.asn1_write_init();
            try {
                j2 = NativeCrypto.asn1_write_sequence(j);
            } catch (IOException e) {
                j3 = j;
                e = e;
                j2 = 0;
                j4 = j3;
                try {
                    NativeCrypto.asn1_write_cleanup(j4);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    j = j4;
                    j4 = j2;
                    NativeCrypto.asn1_write_free(j4);
                    NativeCrypto.asn1_write_free(j);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_write_free(j4);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
            try {
                OAEPParameters.writeHashAndMgfHash(j2, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                if (this.spec.getSaltLength() != 20) {
                    try {
                        j4 = NativeCrypto.asn1_write_tag(j2, 2);
                        try {
                            NativeCrypto.asn1_write_uint64(j4, (long) this.spec.getSaltLength());
                            NativeCrypto.asn1_write_flush(j2);
                            NativeCrypto.asn1_write_free(j4);
                        } catch (Throwable th4) {
                            th = th4;
                            NativeCrypto.asn1_write_flush(j2);
                            NativeCrypto.asn1_write_free(j4);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        NativeCrypto.asn1_write_flush(j2);
                        NativeCrypto.asn1_write_free(j4);
                        throw th;
                    }
                }
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
                NativeCrypto.asn1_write_free(j2);
                NativeCrypto.asn1_write_free(j);
                return asn1_write_finish;
            } catch (IOException e2) {
                j3 = j;
                e = e2;
                j4 = j3;
                NativeCrypto.asn1_write_cleanup(j4);
                throw e;
            } catch (Throwable th6) {
                th = th6;
                j4 = j2;
                NativeCrypto.asn1_write_free(j4);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            j2 = 0;
            NativeCrypto.asn1_write_cleanup(j4);
            throw e;
        } catch (Throwable th7) {
            th = th7;
            j = 0;
            NativeCrypto.asn1_write_free(j4);
            NativeCrypto.asn1_write_free(j);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null && cls == PSSParameterSpec.class) {
            return this.spec;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unsupported class: ");
        sb.append(valueOf);
        throw new InvalidParameterSpecException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            this.spec = (PSSParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) {
        long j;
        long asn1_read_sequence;
        int i;
        long asn1_read_tagged;
        long j2 = 0;
        try {
            j = NativeCrypto.asn1_read_init(bArr);
            try {
                asn1_read_sequence = NativeCrypto.asn1_read_sequence(j);
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(j2);
                NativeCrypto.asn1_read_free(j);
                throw th;
            }
            try {
                String readHash = OAEPParameters.readHash(asn1_read_sequence);
                String readMgfHash = OAEPParameters.readMgfHash(asn1_read_sequence);
                if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                    try {
                        asn1_read_tagged = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                        int asn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(asn1_read_tagged);
                        NativeCrypto.asn1_read_free(asn1_read_tagged);
                        i = asn1_read_uint64;
                    } catch (Throwable th2) {
                        th = th2;
                        NativeCrypto.asn1_read_free(j2);
                        throw th;
                    }
                } else {
                    i = 20;
                }
                if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 3)) {
                    try {
                        j2 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                        try {
                            long asn1_read_uint642 = (long) ((int) NativeCrypto.asn1_read_uint64(j2));
                            NativeCrypto.asn1_read_free(j2);
                            if (asn1_read_uint642 != 1) {
                                throw new IOException("Error reading ASN.1 encoding");
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            NativeCrypto.asn1_read_free(j2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        NativeCrypto.asn1_read_free(j2);
                        throw th;
                    }
                }
                if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(j)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                this.spec = new PSSParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), i, 1);
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j);
            } catch (Throwable th5) {
                th = th5;
                j2 = asn1_read_sequence;
                NativeCrypto.asn1_read_free(j2);
                NativeCrypto.asn1_read_free(j);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            j = 0;
            NativeCrypto.asn1_read_free(j2);
            NativeCrypto.asn1_read_free(j);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1") || str.equals("X.509")) {
            return engineGetEncoded();
        }
        throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1") || str.equals("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
    }
}
