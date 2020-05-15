package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ciwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwh {

    /* renamed from: c */
    private static final byte[] f191588c = {1};

    /* renamed from: d */
    private static final byte[] f191589d = {2};

    /* renamed from: a */
    public final byte[] f191590a;

    /* renamed from: b */
    public final int f191591b;

    /* renamed from: e */
    private final civw f191592e;

    public ciwh(civw civw, byte[] bArr, int i) {
        this.f191592e = civw;
        this.f191590a = bArr;
        this.f191591b = i;
    }

    /* renamed from: a */
    private final byte[] m151074a(byte[] bArr) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(this.f191590a, "HmacSHA256"));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final ciwi mo86605b() {
        civu civu = new civu(this.f191592e.mo86600a(m151074a(f191588c), "WhisperMessageKeys".getBytes(), 80));
        return new ciwi(civu.f191542a, civu.f191543b, civu.f191544c, this.f191591b);
    }

    /* renamed from: a */
    public final ciwh mo86604a() {
        return new ciwh(this.f191592e, m151074a(f191589d), this.f191591b + 1);
    }
}
