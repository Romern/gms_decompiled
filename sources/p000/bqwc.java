package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: bqwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwc implements bqnw {

    /* renamed from: a */
    private final Mac f141706a;

    /* renamed from: b */
    private final int f141707b;

    /* renamed from: c */
    private final String f141708c;

    /* renamed from: d */
    private final Key f141709d;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    public bqwc(String str, Key key, int i) {
        char c;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        } else if (key.getEncoded().length >= 16) {
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                        if (c == 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    throw new NoSuchAlgorithmException(str.length() == 0 ? new String("unknown Hmac algorithm: ") : "unknown Hmac algorithm: ".concat(str));
                                } else if (i > 64) {
                                    throw new InvalidAlgorithmParameterException("tag size too big");
                                }
                            } else if (i > 32) {
                                throw new InvalidAlgorithmParameterException("tag size too big");
                            }
                        } else if (i > 20) {
                            throw new InvalidAlgorithmParameterException("tag size too big");
                        }
                        this.f141708c = str;
                        this.f141707b = i;
                        this.f141709d = key;
                        Mac mac = (Mac) bqvo.f141690b.mo69341a(str);
                        this.f141706a = mac;
                        mac.init(key);
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                    if (c == 0) {
                    }
                    this.f141708c = str;
                    this.f141707b = i;
                    this.f141709d = key;
                    Mac mac2 = (Mac) bqvo.f141690b.mo69341a(str);
                    this.f141706a = mac2;
                    mac2.init(key);
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
                if (c == 0) {
                }
                this.f141708c = str;
                this.f141707b = i;
                this.f141709d = key;
                Mac mac22 = (Mac) bqvo.f141690b.mo69341a(str);
                this.f141706a = mac22;
                mac22.init(key);
            }
            c = 65535;
            if (c == 0) {
            }
            this.f141708c = str;
            this.f141707b = i;
            this.f141709d = key;
            Mac mac222 = (Mac) bqvo.f141690b.mo69341a(str);
            this.f141706a = mac222;
            mac222.init(key);
        } else {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
    }

    /* renamed from: a */
    public final byte[] mo69311a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f141706a.clone();
        } catch (CloneNotSupportedException e) {
            mac = (Mac) bqvo.f141690b.mo69341a(this.f141708c);
            mac.init(this.f141709d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f141707b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f141707b);
        return bArr2;
    }
}
