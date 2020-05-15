package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class OpenSSLX509CertPath extends CertPath {
    private static final List ALL_ENCODINGS = Collections.unmodifiableList(Arrays.asList(Encoding.PKI_PATH.apiName, Encoding.PKCS7.apiName));
    private static final Encoding DEFAULT_ENCODING = Encoding.PKI_PATH;
    private static final byte[] PKCS7_MARKER = {45, 45, 45, 45, 45, 66, 69, 71, 73, 78, 32, 80, 75, 67, 83, 55};
    private static final int PUSHBACK_SIZE = 64;
    private static final long serialVersionUID = -3249106005255170761L;
    private final List mCertificates;

    /* renamed from: com.google.android.gms.org.conscrypt.OpenSSLX509CertPath$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16501 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLX509CertPath$Encoding;

        static {
            int[] iArr = new int[Encoding.values().length];
            $SwitchMap$org$conscrypt$OpenSSLX509CertPath$Encoding = iArr;
            try {
                iArr[Encoding.PKI_PATH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLX509CertPath$Encoding[Encoding.PKCS7.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum Encoding {
        PKI_PATH("PkiPath"),
        PKCS7("PKCS7");
        
        /* access modifiers changed from: private */
        public final String apiName;

        private Encoding(String str) {
            this.apiName = str;
        }

        static Encoding findByApiName(String str) {
            Encoding[] values = values();
            for (Encoding encoding : values) {
                if (encoding.apiName.equals(str)) {
                    return encoding;
                }
            }
            return null;
        }
    }

    public OpenSSLX509CertPath(List list) {
        super("X.509");
        this.mCertificates = list;
    }

    static CertPath fromEncoding(InputStream inputStream) {
        if (inputStream != null) {
            return fromEncoding(inputStream, DEFAULT_ENCODING);
        }
        throw new CertificateException("inStream == null");
    }

    private static CertPath fromPkcs7Encoding(InputStream inputStream) {
        if (inputStream != null) {
            try {
                if (inputStream.available() != 0) {
                    boolean markSupported = inputStream.markSupported();
                    if (markSupported) {
                        inputStream.mark(64);
                    }
                    PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
                    try {
                        byte[] bArr = new byte[PKCS7_MARKER.length];
                        int read = pushbackInputStream.read(bArr);
                        if (read >= 0) {
                            pushbackInputStream.unread(bArr, 0, read);
                            if (read != PKCS7_MARKER.length || !Arrays.equals(PKCS7_MARKER, bArr)) {
                                return new OpenSSLX509CertPath(OpenSSLX509Certificate.fromPkcs7DerInputStream(pushbackInputStream));
                            }
                            return new OpenSSLX509CertPath(OpenSSLX509Certificate.fromPkcs7PemInputStream(pushbackInputStream));
                        }
                        throw new OpenSSLX509CertificateFactory.ParsingException("inStream is empty");
                    } catch (Exception e) {
                        if (markSupported) {
                            try {
                                inputStream.reset();
                            } catch (IOException e2) {
                            }
                        }
                        throw new CertificateException(e);
                    }
                }
            } catch (IOException e3) {
                throw new CertificateException("Problem reading input stream", e3);
            }
        }
        return new OpenSSLX509CertPath(Collections.emptyList());
    }

    private static CertPath fromPkiPathEncoding(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        boolean markSupported = inputStream.markSupported();
        if (markSupported) {
            inputStream.mark(64);
        }
        try {
            long[] ASN1_seq_unpack_X509_bio = NativeCrypto.ASN1_seq_unpack_X509_bio(openSSLBIOInputStream.getBioContext());
            openSSLBIOInputStream.release();
            if (ASN1_seq_unpack_X509_bio == null) {
                return new OpenSSLX509CertPath(Collections.emptyList());
            }
            int length = ASN1_seq_unpack_X509_bio.length;
            ArrayList arrayList = new ArrayList(length);
            for (int i = length - 1; i >= 0; i--) {
                long j = ASN1_seq_unpack_X509_bio[i];
                if (j != 0) {
                    try {
                        arrayList.add(new OpenSSLX509Certificate(j));
                    } catch (OpenSSLX509CertificateFactory.ParsingException e) {
                        throw new CertificateParsingException(e);
                    }
                }
            }
            return new OpenSSLX509CertPath(arrayList);
        } catch (Exception e2) {
            if (markSupported) {
                try {
                    inputStream.reset();
                } catch (IOException e3) {
                }
            }
            throw new CertificateException(e2);
        } catch (Throwable th) {
            openSSLBIOInputStream.release();
            throw th;
        }
    }

    private byte[] getEncoded(Encoding encoding) {
        OpenSSLX509Certificate openSSLX509Certificate;
        int size = this.mCertificates.size();
        OpenSSLX509Certificate[] openSSLX509CertificateArr = new OpenSSLX509Certificate[size];
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            X509Certificate x509Certificate = (X509Certificate) this.mCertificates.get(i);
            if (x509Certificate instanceof OpenSSLX509Certificate) {
                openSSLX509Certificate = (OpenSSLX509Certificate) x509Certificate;
                openSSLX509CertificateArr[i2] = openSSLX509Certificate;
            } else {
                openSSLX509Certificate = OpenSSLX509Certificate.fromX509Der(x509Certificate.getEncoded());
                openSSLX509CertificateArr[i2] = openSSLX509Certificate;
            }
            jArr[i2] = openSSLX509Certificate.getContext();
            i++;
        }
        Encoding encoding2 = Encoding.PKI_PATH;
        int ordinal = encoding.ordinal();
        if (ordinal == 0) {
            return NativeCrypto.ASN1_seq_pack_X509(jArr);
        }
        if (ordinal == 1) {
            return NativeCrypto.i2d_PKCS7(jArr);
        }
        throw new CertificateEncodingException("Unknown encoding");
    }

    static Iterator getEncodingsIterator() {
        return ALL_ENCODINGS.iterator();
    }

    public List getCertificates() {
        return Collections.unmodifiableList(this.mCertificates);
    }

    public Iterator getEncodings() {
        return getEncodingsIterator();
    }

    private static CertPath fromEncoding(InputStream inputStream, Encoding encoding) {
        Encoding encoding2 = Encoding.PKI_PATH;
        int ordinal = encoding.ordinal();
        if (ordinal == 0) {
            return fromPkiPathEncoding(inputStream);
        }
        if (ordinal == 1) {
            return fromPkcs7Encoding(inputStream);
        }
        throw new CertificateEncodingException("Unknown encoding");
    }

    static CertPath fromEncoding(InputStream inputStream, String str) {
        if (inputStream != null) {
            Encoding findByApiName = Encoding.findByApiName(str);
            if (findByApiName != null) {
                return fromEncoding(inputStream, findByApiName);
            }
            String valueOf = String.valueOf(str);
            throw new CertificateException(valueOf.length() == 0 ? new String("Invalid encoding: ") : "Invalid encoding: ".concat(valueOf));
        }
        throw new CertificateException("inStream == null");
    }

    public byte[] getEncoded() {
        return getEncoded(DEFAULT_ENCODING);
    }

    public byte[] getEncoded(String str) {
        Encoding findByApiName = Encoding.findByApiName(str);
        if (findByApiName != null) {
            return getEncoded(findByApiName);
        }
        String valueOf = String.valueOf(str);
        throw new CertificateEncodingException(valueOf.length() == 0 ? new String("Invalid encoding: ") : "Invalid encoding: ".concat(valueOf));
    }
}
