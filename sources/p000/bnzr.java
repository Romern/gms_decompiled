package p000;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: bnzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzr extends bnyp {

    /* renamed from: a */
    private final Mac f132412a;

    /* renamed from: b */
    private final Key f132413b;

    /* renamed from: c */
    private final String f132414c;

    /* renamed from: d */
    private final boolean f132415d = m110923a(this.f132412a);

    public bnzr(String str, Key key, String str2) {
        this.f132412a = m110922a(str, key);
        bmxy.m108581a(key);
        this.f132413b = key;
        bmxy.m108581a(str2);
        this.f132414c = str2;
        this.f132412a.getMacLength();
    }

    /* renamed from: a */
    private static Mac m110922a(String str, Key key) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(key);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final String toString() {
        return this.f132414c;
    }

    /* renamed from: a */
    private static boolean m110923a(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final bnzd mo68732a() {
        if (this.f132415d) {
            try {
                return new bnzq((Mac) this.f132412a.clone());
            } catch (CloneNotSupportedException e) {
            }
        }
        return new bnzq(m110922a(this.f132412a.getAlgorithm(), this.f132413b));
    }
}
