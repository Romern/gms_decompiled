package p000;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: rgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rgc {

    /* renamed from: a */
    public final String f42905a;

    /* renamed from: b */
    public final rfl f42906b;

    /* renamed from: c */
    public final byte[] f42907c;

    /* renamed from: d */
    public byte[] f42908d = null;

    /* renamed from: e */
    private byte[] f42909e = null;

    public rgc(String str, rfl rfl) {
        this.f42905a = str;
        this.f42906b = rfl;
        this.f42907c = ((rfm) rfl).f42877a;
    }

    /* renamed from: a */
    public static byte[] m33572a(byte[] bArr, String str) {
        MessageDigest a = spo.m35903a("SHA-256");
        try {
            a.update(str.getBytes("US-ASCII"));
            a.update((byte) 32);
            a.update(bArr);
            return a.digest();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public rgc(String str, byte[] bArr) {
        this.f42905a = str;
        this.f42906b = null;
        this.f42907c = bArr;
    }

    /* renamed from: a */
    public final boolean mo24613a(rfa rfa) {
        if (this.f42909e == null) {
            this.f42909e = m33572a(this.f42907c, this.f42905a);
        }
        return rfa.mo24571a(this.f42909e);
    }
}
