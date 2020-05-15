package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSSLX509CertificateFactory extends CertificateFactorySpi {
    /* access modifiers changed from: private */
    public static final byte[] PKCS7_MARKER = {45, 45, 45, 45, 45, 66, 69, 71, 73, 78, 32, 80, 75, 67, 83, 55};
    private static final int PUSHBACK_SIZE = 64;
    private Parser certificateParser = new Parser(this) {
        /* class com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.C16511 */

        public List fromPkcs7DerInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromPkcs7DerInputStream(inputStream);
        }

        public List fromPkcs7PemInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromPkcs7PemInputStream(inputStream);
        }

        public OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromX509DerInputStream(inputStream);
        }

        public OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) {
            return OpenSSLX509Certificate.fromX509PemInputStream(inputStream);
        }
    };
    private Parser crlParser = new Parser(this) {
        /* class com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory.C16522 */

        public List fromPkcs7DerInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromPkcs7DerInputStream(inputStream);
        }

        public List fromPkcs7PemInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromPkcs7PemInputStream(inputStream);
        }

        public OpenSSLX509CRL fromX509DerInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromX509DerInputStream(inputStream);
        }

        public OpenSSLX509CRL fromX509PemInputStream(InputStream inputStream) {
            return OpenSSLX509CRL.fromX509PemInputStream(inputStream);
        }
    };

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    abstract class Parser {
        private Parser() {
        }

        /* access modifiers changed from: protected */
        public abstract List fromPkcs7DerInputStream(InputStream inputStream);

        /* access modifiers changed from: protected */
        public abstract List fromPkcs7PemInputStream(InputStream inputStream);

        /* access modifiers changed from: protected */
        public abstract Object fromX509DerInputStream(InputStream inputStream);

        /* access modifiers changed from: protected */
        public abstract Object fromX509PemInputStream(InputStream inputStream);

        public Object generateItem(InputStream inputStream) {
            if (inputStream != null) {
                boolean markSupported = inputStream.markSupported();
                if (markSupported) {
                    inputStream.mark(OpenSSLX509CertificateFactory.PKCS7_MARKER.length);
                }
                PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
                try {
                    byte[] bArr = new byte[OpenSSLX509CertificateFactory.PKCS7_MARKER.length];
                    int read = pushbackInputStream.read(bArr);
                    if (read >= 0) {
                        pushbackInputStream.unread(bArr, 0, read);
                        if (bArr[0] == 45) {
                            if (read != OpenSSLX509CertificateFactory.PKCS7_MARKER.length || !Arrays.equals(OpenSSLX509CertificateFactory.PKCS7_MARKER, bArr)) {
                                return fromX509PemInputStream(pushbackInputStream);
                            }
                            List fromPkcs7PemInputStream = fromPkcs7PemInputStream(pushbackInputStream);
                            if (fromPkcs7PemInputStream.size() == 0) {
                                return null;
                            }
                            fromPkcs7PemInputStream.get(0);
                        }
                        if (bArr[4] != 6) {
                            return fromX509DerInputStream(pushbackInputStream);
                        }
                        List fromPkcs7DerInputStream = fromPkcs7DerInputStream(pushbackInputStream);
                        if (fromPkcs7DerInputStream.size() != 0) {
                            return fromPkcs7DerInputStream.get(0);
                        }
                        return null;
                    }
                    throw new ParsingException("inStream is empty");
                } catch (Exception e) {
                    if (markSupported) {
                        try {
                            inputStream.reset();
                        } catch (IOException e2) {
                        }
                    }
                    throw new ParsingException(e);
                }
            } else {
                throw new ParsingException("inStream == null");
            }
        }

        public Collection generateItems(InputStream inputStream) {
            Object obj;
            if (inputStream != null) {
                try {
                    if (inputStream.available() == 0) {
                        return Collections.emptyList();
                    }
                    boolean markSupported = inputStream.markSupported();
                    if (markSupported) {
                        inputStream.mark(64);
                    }
                    PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 64);
                    try {
                        byte[] bArr = new byte[OpenSSLX509CertificateFactory.PKCS7_MARKER.length];
                        int read = pushbackInputStream.read(bArr);
                        if (read >= 0) {
                            pushbackInputStream.unread(bArr, 0, read);
                            if (read == OpenSSLX509CertificateFactory.PKCS7_MARKER.length) {
                                if (Arrays.equals(OpenSSLX509CertificateFactory.PKCS7_MARKER, bArr)) {
                                    return fromPkcs7PemInputStream(pushbackInputStream);
                                }
                            }
                            if (bArr[4] == 6) {
                                return fromPkcs7DerInputStream(pushbackInputStream);
                            }
                            ArrayList arrayList = new ArrayList();
                            do {
                                if (markSupported) {
                                    inputStream.mark(64);
                                }
                                obj = null;
                                try {
                                    Object generateItem = generateItem(pushbackInputStream);
                                    arrayList.add(generateItem);
                                    obj = generateItem;
                                    continue;
                                } catch (ParsingException e) {
                                    if (markSupported) {
                                        try {
                                            inputStream.reset();
                                            continue;
                                        } catch (IOException e2) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } while (obj != null);
                            return arrayList;
                        }
                        throw new ParsingException("inStream is empty");
                    } catch (Exception e3) {
                        if (markSupported) {
                            try {
                                inputStream.reset();
                            } catch (IOException e4) {
                            }
                        }
                        throw new ParsingException(e3);
                    }
                } catch (IOException e5) {
                    throw new ParsingException("Problem reading input stream", e5);
                }
            } else {
                throw new ParsingException("inStream == null");
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ParsingException extends Exception {
        private static final long serialVersionUID = 8390802697728301325L;

        public ParsingException(Exception exc) {
            super(exc);
        }

        public ParsingException(String str) {
            super(str);
        }

        public ParsingException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public CRL engineGenerateCRL(InputStream inputStream) {
        try {
            return (CRL) this.crlParser.generateItem(inputStream);
        } catch (ParsingException e) {
            throw new CRLException(e);
        }
    }

    public Collection engineGenerateCRLs(InputStream inputStream) {
        if (inputStream == null) {
            return Collections.emptyList();
        }
        try {
            return this.crlParser.generateItems(inputStream);
        } catch (ParsingException e) {
            throw new CRLException(e);
        }
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return OpenSSLX509CertPath.fromEncoding(inputStream);
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) {
        try {
            return (Certificate) this.certificateParser.generateItem(inputStream);
        } catch (ParsingException e) {
            throw new CertificateException(e);
        }
    }

    public Collection engineGenerateCertificates(InputStream inputStream) {
        try {
            return this.certificateParser.generateItems(inputStream);
        } catch (ParsingException e) {
            throw new CertificateException(e);
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return OpenSSLX509CertPath.getEncodingsIterator();
    }

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return OpenSSLX509CertPath.fromEncoding(inputStream, str);
    }

    public CertPath engineGenerateCertPath(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        while (i < list.size()) {
            Certificate certificate = (Certificate) list.get(i);
            if (certificate instanceof X509Certificate) {
                arrayList.add((X509Certificate) certificate);
                i++;
            } else {
                StringBuilder sb = new StringBuilder(47);
                sb.append("Certificate not X.509 type at index ");
                sb.append(i);
                throw new CertificateException(sb.toString());
            }
        }
        return new OpenSSLX509CertPath(arrayList);
    }
}
