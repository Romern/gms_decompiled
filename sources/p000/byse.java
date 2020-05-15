package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byse {

    /* renamed from: a */
    private final HashMap f167554a = new HashMap();

    /* renamed from: b */
    private final bysc f167555b;

    /* renamed from: c */
    private final KeyPair f167556c;

    /* renamed from: d */
    private PublicKey f167557d;

    /* renamed from: e */
    private SecretKey f167558e;

    /* renamed from: f */
    private byte[] f167559f;

    /* renamed from: g */
    private byte[] f167560g;

    /* renamed from: h */
    private byte[] f167561h;

    /* renamed from: i */
    private final int f167562i;

    /* renamed from: j */
    private int f167563j;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    private byse(int i, bysc bysc) {
        KeyPair keyPair;
        int i2;
        if (bysc == null) {
            m125251c("Invalid handshake cipher");
        }
        this.f167555b = bysc;
        bysc bysc2 = bysc.P256_SHA512;
        int i3 = i - 1;
        if (i3 == 0) {
            i2 = 1;
        } else if (i3 != 3) {
            m125250b("Invalid handshake state");
            this.f167562i = 0;
            this.f167563j = i;
            if (bysc.ordinal() == 0) {
                String valueOf = String.valueOf(bysc);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append("unknown cipher: ");
                sb.append(valueOf);
                m125245a(sb.toString());
                keyPair = null;
            } else {
                keyPair = bysu.m125292a();
            }
            this.f167556c = keyPair;
        } else {
            i2 = 2;
        }
        this.f167562i = i2;
        this.f167563j = i;
        if (bysc.ordinal() == 0) {
        }
        this.f167556c = keyPair;
    }

    /* renamed from: a */
    public static byse m125241a(bysc bysc) {
        return new byse(1, bysc);
    }

    /* renamed from: b */
    public static byse m125248b(bysc bysc) {
        return new byse(4, bysc);
    }

    /* renamed from: c */
    private final void m125251c(String str) {
        this.f167563j = 11;
        throw new IllegalArgumentException(str);
    }

    /* renamed from: e */
    private static byte[] m125253e() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: d */
    public final int mo74497d() {
        bysc bysc = bysc.P256_SHA512;
        int i = this.f167563j;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                    return 3;
                case 8:
                    return 4;
                case 9:
                    return 5;
                case 10:
                    return 6;
                default:
                    m125250b("Unknown state");
                    return 0;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    private final void m125242a(int i, String str) {
        this.f167563j = 11;
        bysc bysc = bysc.P256_SHA512;
        if (!(i == 1 || i == 2 || i == 3 || i == 4)) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                case ErrorInfo.TYPE_SDU_FAILED:
                    break;
                default:
                    String valueOf = String.valueOf(Integer.toString(i));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("Unknown alert type: ");
                    sb.append(valueOf);
                    m125245a(sb.toString());
                    break;
            }
        }
        bxvd da = bysh.f167565d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bysh bysh = (bysh) da.f164949b;
        bysh.f167568b = i;
        int i2 = bysh.f167567a | 1;
        bysh.f167567a = i2;
        if (str != null) {
            str.getClass();
            bysh.f167567a = i2 | 2;
            bysh.f167569c = str;
        }
        throw new bysb(str, (bysh) da.mo74062i());
    }

    /* renamed from: b */
    private final PublicKey m125249b(byte[] bArr) {
        try {
            return bysu.m125293a((bytb) bxvk.m124014a(bytb.f167639f, bArr));
        } catch (bxwf | InvalidKeySpecException e) {
            String valueOf = String.valueOf(e.getMessage());
            m125242a((int) ErrorInfo.TYPE_SDU_FAILED, valueOf.length() == 0 ? new String("Cannot parse public key: ") : "Cannot parse public key: ".concat(valueOf));
            return null;
        }
    }

    /* renamed from: c */
    private final byte[] m125252c(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            m125246a("No security provider initialized yet?", e);
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* renamed from: c */
    public final byqy mo74496c() {
        byte[] bArr;
        SecretKeySpec secretKeySpec;
        SecretKey secretKey;
        int i;
        SecretKey secretKey2;
        Exception e;
        bysc bysc = bysc.P256_SHA512;
        int i2 = this.f167563j;
        int i3 = i2 - 1;
        SecretKey secretKey3 = null;
        if (i2 != 0) {
            switch (i3) {
                case 6:
                    m125250b("Handshake not verified, cannot create context");
                    return null;
                case 7:
                default:
                    m125250b("Handshake is not complete; cannot create connection context");
                    break;
                case 8:
                    break;
                case 9:
                    m125250b("Cannot reuse handshake context; is has already been used");
                    return null;
                case 10:
                    m125250b("Cannot make context; handshake had error");
                    return null;
            }
            if (this.f167558e == null) {
                m125250b("Unexpected state error: derived key is null");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.f167560g);
                byteArrayOutputStream.write(this.f167561h);
            } catch (IOException e2) {
                m125244a(e2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                bArr = "UKEY2 v1 next".getBytes("UTF-8");
            } catch (UnsupportedEncodingException e3) {
                m125244a(e3);
                bArr = null;
            }
            try {
                secretKeySpec = new SecretKeySpec(byst.m125284a(this.f167558e, bArr, byteArray), "AES");
            } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
                m125244a(e4);
                secretKeySpec = null;
            }
            try {
                secretKey = byrb.m125176a(secretKeySpec, "client");
                try {
                    secretKey3 = byrb.m125176a(secretKeySpec, "server");
                } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
                    e = e5;
                    m125244a(e);
                    this.f167563j = 10;
                    i = this.f167562i;
                    if (i == 1) {
                    }
                    if (i == 1) {
                    }
                    return new byra(secretKey2, secretKey, 0, 0);
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException e6) {
                e = e6;
                secretKey = null;
                m125244a(e);
                this.f167563j = 10;
                i = this.f167562i;
                if (i == 1) {
                }
                if (i == 1) {
                }
                return new byra(secretKey2, secretKey, 0, 0);
            }
            this.f167563j = 10;
            i = this.f167562i;
            if (i == 1) {
                secretKey2 = secretKey;
            } else {
                secretKey2 = secretKey3;
            }
            if (i == 1) {
                secretKey = secretKey3;
            }
            return new byra(secretKey2, secretKey, 0, 0);
        }
        throw null;
    }

    /* renamed from: b */
    private final void m125250b(String str) {
        this.f167563j = 11;
        throw new IllegalStateException(str);
    }

    /* renamed from: b */
    public final void mo74495b() {
        int i = this.f167563j;
        if (i != 8) {
            String a = bysd.m125240a(i);
            StringBuilder sb = new StringBuilder(a.length() + 18);
            sb.append("Unexpected state: ");
            sb.append(a);
            m125250b(sb.toString());
        }
        this.f167563j = 9;
    }

    /* renamed from: a */
    private final void m125243a(bysp bysp) {
        bysh bysh;
        if ((bysp.f167590a & 2) != 0) {
            try {
                bysh = (bysh) bxvk.m124007a(bysh.f167565d, bysp.f167592c);
            } catch (bxwf e) {
                m125246a("Cannot parse alert message", e);
                bysh = null;
            }
            int i = bysh.f167567a;
            if ((i & 1) != 0) {
                int i2 = 1;
                if ((i & 2) == 0) {
                    int a = bysg.m125261a(bysh.f167568b);
                    if (a != 0) {
                        i2 = a;
                    }
                    String valueOf = String.valueOf(Integer.toString(i2));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb.append("Received Alert message. Type: ");
                    sb.append(valueOf);
                    m125245a(sb.toString());
                } else {
                    int a2 = bysg.m125261a(bysh.f167568b);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    String valueOf2 = String.valueOf(Integer.toString(i2));
                    String str = bysh.f167569c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 46 + String.valueOf(str).length());
                    sb2.append("Received Alert message. Type: ");
                    sb2.append(valueOf2);
                    sb2.append(" Error Message: ");
                    sb2.append(str);
                    m125245a(sb2.toString());
                }
            }
        }
        m125245a("Received empty Alert Message");
    }

    /* renamed from: a */
    private final void m125244a(Exception exc) {
        this.f167563j = 11;
        throw new byrq(exc);
    }

    /* renamed from: a */
    private final void m125245a(String str) {
        this.f167563j = 11;
        throw new byrq(str);
    }

    /* renamed from: a */
    private final void m125246a(String str, Exception exc) {
        this.f167563j = 11;
        throw new byrq(str, exc);
    }

    /* renamed from: a */
    private final byte[] m125247a(int i, byte[] bArr) {
        bxvd da = bysp.f167588d.mo74144da();
        int i2 = i - 1;
        bysc bysc = bysc.P256_SHA512;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bysp bysp = (bysp) da.f164949b;
        bysp.f167591b = i2;
        bysp.f167590a |= 1;
        if (bArr == null || bArr.length == 0) {
            m125251c("Cannot send empty message data for non-alert messages");
        }
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bysp bysp2 = (bysp) da.f164949b;
        a.getClass();
        bysp2.f167590a |= 2;
        bysp2.f167592c = a;
        return ((bysp) da.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    public final void mo74492a(byte[] bArr) {
        bysp bysp;
        bysq bysq;
        bysp bysp2;
        int a;
        bysp bysp3;
        byte[] bArr2;
        byte[] bArr3 = bArr;
        bysc bysc = bysc.P256_SHA512;
        int i = this.f167563j;
        int i2 = i - 1;
        bysc bysc2 = null;
        bysi bysi = null;
        bysk bysk = null;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            try {
                bysp = (bysp) bxvk.m124014a(bysp.f167588d, bArr3);
            } catch (bxwf e) {
                String valueOf = String.valueOf(e.getMessage());
                m125242a(1, valueOf.length() == 0 ? new String("Can't parse message 2 ") : "Can't parse message 2 ".concat(valueOf));
                bysp = null;
            }
            if ((bysp.f167590a & 1) == 0) {
                m125242a(2, "Expected, but did not find message type");
            }
            int a2 = byso.m125269a(bysp.f167591b);
            if (a2 != 0 && a2 == 2) {
                this.f167563j = 11;
                m125243a(bysp);
            }
            int a3 = byso.m125269a(bysp.f167591b);
            if (a3 == 0 || a3 != 4) {
                m125242a(2, "Expected, but did not find SERVER_INIT message type");
            }
            if ((bysp.f167590a & 2) == 0) {
                m125242a(4, "Expected message data, but didn't find it");
            }
            try {
                bysq = (bysq) bxvk.m124007a(bysq.f167593f, bysp.f167592c);
            } catch (bxwf e2) {
                m125242a(4, "Can't parse message data into ServerInit");
                bysq = null;
            }
            if ((bysq.f167595a & 1) == 0) {
                m125242a(100, "ServerInit missing version");
            }
            if (bysq.f167596b != 1) {
                m125242a(100, "ServerInit version mismatch");
            }
            if ((bysq.f167595a & 2) == 0) {
                m125242a(101, "ServerInit missing random");
            }
            if (bysq.f167597c.mo73780k().length != 32) {
                m125242a(101, "ServerInit has incorrect nonce length");
            }
            if ((bysq.f167595a & 4) == 0) {
                m125242a(102, "No handshake cipher found");
            }
            bysc[] values = bysc.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                bysc bysc3 = values[i3];
                int i4 = bysc3.f167553b;
                int a4 = bysm.m125267a(bysq.f167598d);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (i4 == a4) {
                    bysc2 = bysc3;
                    break;
                }
                i3++;
            }
            if (bysc2 == null || bysc2 != this.f167555b) {
                m125242a(102, "No acceptable handshake cipher found");
            }
            if ((bysq.f167595a & 8) == 0) {
                m125242a((int) ErrorInfo.TYPE_SDU_FAILED, "No public key found in ServerInit");
            }
            this.f167557d = m125249b(bysq.f167599e.mo73780k());
            this.f167561h = bArr3;
            this.f167563j = 3;
        } else if (i2 == 3) {
            try {
                bysp2 = (bysp) bxvk.m124014a(bysp.f167588d, bArr3);
            } catch (bxwf e3) {
                String valueOf2 = String.valueOf(e3.getMessage());
                m125242a(1, valueOf2.length() == 0 ? new String("Can't parse message 1 ") : "Can't parse message 1 ".concat(valueOf2));
                bysp2 = null;
            }
            if ((bysp2.f167590a & 1) == 0 || (a = byso.m125269a(bysp2.f167591b)) == 0 || a != 3) {
                m125242a(2, "Expected, but did not find ClientInit message type");
            }
            if ((bysp2.f167590a & 2) == 0) {
                m125242a(4, "Expected message data, but didn't find it");
            }
            try {
                bysk = (bysk) bxvk.m124007a(bysk.f167579f, bysp2.f167592c);
            } catch (bxwf e4) {
                m125242a(4, "Can't parse message data into ClientInit");
            }
            if ((bysk.f167581a & 1) == 0) {
                m125242a(100, "ClientInit missing version");
            }
            if (bysk.f167582b != 1) {
                m125242a(100, "ClientInit version mismatch");
            }
            if ((bysk.f167581a & 2) == 0) {
                m125242a(101, "ClientInit missing random");
            }
            if (bysk.f167583c.mo73780k().length != 32) {
                m125242a(101, "ClientInit has incorrect nonce length");
            }
            bxwc bxwc = bysk.f167584d;
            if (bxwc.isEmpty()) {
                m125242a(102, "ClientInit is missing cipher commitments");
            }
            int size = bxwc.size();
            for (int i5 = 0; i5 < size; i5++) {
                bysj bysj = (bysj) bxwc.get(i5);
                int i6 = bysj.f167576a;
                if ((i6 & 1) == 0 || (i6 & 2) == 0) {
                    m125242a(102, "ClientInit has improperly formatted cipher commitment");
                }
                int a5 = bysm.m125267a(bysj.f167577b);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (a5 == this.f167555b.f167553b) {
                    this.f167559f = bysj.f167578c.mo73780k();
                }
            }
            if (this.f167559f == null) {
                m125242a(102, "No acceptable commitments found");
            }
            if ((bysk.f167581a & 4) == 0 || !"AES_256_CBC-HMAC_SHA256".equals(bysk.f167585e)) {
                m125242a((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, "Incorrect next protocol");
            }
            this.f167560g = bArr3;
            this.f167563j = 5;
        } else if (i2 != 5) {
            String a6 = bysd.m125240a(i);
            StringBuilder sb = new StringBuilder(a6.length() + 30);
            sb.append("Cannot parse message in state ");
            sb.append(a6);
            m125250b(sb.toString());
        } else {
            try {
                bysp3 = (bysp) bxvk.m124014a(bysp.f167588d, bArr3);
            } catch (bxwf e5) {
                m125246a("Can't parse message 3", e5);
                bysp3 = null;
            }
            if ((bysp3.f167590a & 1) != 0) {
                int a7 = byso.m125269a(bysp3.f167591b);
                if (a7 != 0 && a7 == 2) {
                    m125243a(bysp3);
                }
                int a8 = byso.m125269a(bysp3.f167591b);
                if (a8 == 0 || a8 != 5) {
                    m125245a("Expected, but did not find CLIENT_FINISH message type");
                }
                if (this.f167555b.ordinal() != 0) {
                    m125250b("Unexpected handshakeCipher");
                    bArr2 = null;
                } else {
                    bArr2 = m125252c(bArr);
                }
                if (!MessageDigest.isEqual(bArr2, this.f167559f)) {
                    m125245a("Commitment does not match");
                }
                if ((bysp3.f167590a & 2) == 0) {
                    m125245a("Expected message data, but didn't find it");
                }
                try {
                    bysi = (bysi) bxvk.m124007a(bysi.f167570c, bysp3.f167592c);
                } catch (bxwf e6) {
                    m125244a(e6);
                }
                if ((bysi.f167572a & 1) == 0) {
                    m125245a("No public key found in ClientFinished");
                }
                try {
                    this.f167557d = m125249b(bysi.f167573b.mo73780k());
                } catch (bysb e7) {
                    m125244a(e7);
                }
                this.f167563j = 7;
                return;
            }
            throw new byrq("Expected, but did not find message type");
        }
    }

    /* renamed from: a */
    public final byte[] mo74493a() {
        bysc bysc = bysc.P256_SHA512;
        int i = this.f167563j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            bxvd da = bysk.f167579f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bysk bysk = (bysk) da.f164949b;
            bysk.f167581a |= 1;
            bysk.f167582b = 1;
            bxtx a = bxtx.m123261a(m125253e());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bysk bysk2 = (bysk) da.f164949b;
            a.getClass();
            int i3 = bysk2.f167581a | 2;
            bysk2.f167581a = i3;
            bysk2.f167583c = a;
            "AES_256_CBC-HMAC_SHA256".getClass();
            bysk2.f167581a = 4 | i3;
            bysk2.f167585e = "AES_256_CBC-HMAC_SHA256";
            if (!this.f167554a.containsKey(bysc.P256_SHA512)) {
                byte[] k = bysu.m125290a(this.f167556c.getPublic()).mo73642k();
                bxvd da2 = bysi.f167570c.mo74144da();
                bxtx a2 = bxtx.m123261a(k);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bysi bysi = (bysi) da2.f164949b;
                a2.getClass();
                bysi.f167572a |= 1;
                bysi.f167573b = a2;
                this.f167554a.put(bysc.P256_SHA512, m125247a(5, ((bysi) da2.mo74062i()).mo73642k()));
                bysi bysi2 = (bysi) da2.mo74062i();
            }
            bxvd da3 = bysj.f167574d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bysj bysj = (bysj) da3.f164949b;
            bysj.f167577b = 100;
            bysj.f167576a |= 1;
            bxtx a3 = bxtx.m123261a(m125252c((byte[]) this.f167554a.get(bysc.P256_SHA512)));
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bysj bysj2 = (bysj) da3.f164949b;
            a3.getClass();
            bysj2.f167576a |= 2;
            bysj2.f167578c = a3;
            bysj bysj3 = (bysj) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bysk bysk3 = (bysk) da.f164949b;
            bysj3.getClass();
            if (!bysk3.f167584d.mo73666a()) {
                bysk3.f167584d = bxvk.m124021a(bysk3.f167584d);
            }
            bysk3.f167584d.add(bysj3);
            byte[] a4 = m125247a(3, ((bysk) da.mo74062i()).mo73642k());
            this.f167560g = a4;
            this.f167563j = 2;
            return a4;
        } else if (i2 == 2) {
            if (!this.f167554a.containsKey(this.f167555b)) {
                String valueOf = String.valueOf(this.f167555b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 125);
                sb.append("Client state is CLIENT_AFTER_SERVER_INIT, and cipher is ");
                sb.append(valueOf);
                sb.append(", but no corresponding raw client finished message has been generated");
                m125250b(sb.toString());
            }
            this.f167563j = 7;
            return (byte[]) this.f167554a.get(this.f167555b);
        } else if (i2 != 4) {
            String a5 = bysd.m125240a(i);
            StringBuilder sb2 = new StringBuilder(a5.length() + 34);
            sb2.append("Cannot get next message in state: ");
            sb2.append(a5);
            m125250b(sb2.toString());
            return null;
        } else {
            bxvd da4 = bysq.f167593f.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bysq bysq = (bysq) da4.f164949b;
            bysq.f167595a |= 1;
            bysq.f167596b = 1;
            bxtx a6 = bxtx.m123261a(m125253e());
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bysq bysq2 = (bysq) da4.f164949b;
            a6.getClass();
            int i4 = 2 | bysq2.f167595a;
            bysq2.f167595a = i4;
            bysq2.f167597c = a6;
            int i5 = this.f167555b.f167553b;
            int i6 = i5 - 1;
            if (i5 != 0) {
                bysq2.f167598d = i6;
                bysq2.f167595a = i4 | 4;
                bxtx aL = bysu.m125290a(this.f167556c.getPublic()).mo73639aL();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bysq bysq3 = (bysq) da4.f164949b;
                aL.getClass();
                bysq3.f167595a |= 8;
                bysq3.f167599e = aL;
                byte[] a7 = m125247a(4, ((bysq) da4.mo74062i()).mo73642k());
                this.f167561h = a7;
                this.f167563j = 6;
                return a7;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final byte[] mo74494a(int i) {
        byte[] bArr;
        int i2 = this.f167563j;
        if (i2 != 7) {
            String a = bysd.m125240a(i2);
            StringBuilder sb = new StringBuilder(a.length() + 18);
            sb.append("Unexpected state: ");
            sb.append(a);
            m125250b(sb.toString());
        }
        try {
            this.f167558e = byrp.m125222a(this.f167556c.getPrivate(), this.f167557d);
        } catch (InvalidKeyException e) {
            m125244a(e);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.f167560g);
            byteArrayOutputStream.write(this.f167561h);
        } catch (IOException e2) {
            m125244a(e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = null;
        try {
            bArr = "UKEY2 v1 auth".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            m125244a(e3);
            bArr = null;
        }
        try {
            bArr2 = byst.m125284a(this.f167558e, bArr, byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
            m125244a(e4);
        }
        this.f167563j = 8;
        return Arrays.copyOf(bArr2, i);
    }
}
