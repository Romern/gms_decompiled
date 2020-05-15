package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bnzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzu extends bnyp implements Serializable {

    /* renamed from: a */
    private final MessageDigest f132422a;

    /* renamed from: b */
    private final int f132423b;

    /* renamed from: c */
    private final boolean f132424c;

    /* renamed from: d */
    private final String f132425d;

    public bnzu(String str, int i, String str2) {
        bmxy.m108581a(str2);
        this.f132425d = str2;
        MessageDigest a = m110929a(str);
        this.f132422a = a;
        int digestLength = a.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        bmxy.m108592a(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.f132423b = i;
        this.f132424c = m110930a(this.f132422a);
    }

    /* renamed from: a */
    private static MessageDigest m110929a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.f132425d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnzt(this.f132422a.getAlgorithm(), this.f132423b, this.f132425d);
    }

    public bnzu(String str, String str2) {
        MessageDigest a = m110929a(str);
        this.f132422a = a;
        this.f132423b = a.getDigestLength();
        bmxy.m108581a(str2);
        this.f132425d = str2;
        this.f132424c = m110930a(this.f132422a);
    }

    /* renamed from: a */
    private static boolean m110930a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final bnzd mo68732a() {
        if (this.f132424c) {
            try {
                return new bnzs((MessageDigest) this.f132422a.clone(), this.f132423b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new bnzs(m110929a(this.f132422a.getAlgorithm()), this.f132423b);
    }
}
