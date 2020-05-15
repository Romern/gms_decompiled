package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: lwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwu {
    /* renamed from: a */
    private static Cipher m24576a() {
        try {
            return Cipher.getInstance("AES/GCM/NoPadding");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new lwh("AES/GCM/NoPadding not supported for (un)wrap of tertiary keys.", e);
        }
    }

    /* renamed from: a */
    public static SecretKey m24577a(SecretKey secretKey, mde mde) {
        int a = C1571mdd.m24895a(mde.f33475b);
        int i = 1;
        if (a == 0 || a != 2) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = C1571mdd.m24895a(mde.f33475b);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.toString(i - 1);
            throw new lwh(String.format(locale, "Could not unwrap key wrapped with %s algorithm", objArr));
        } else if ((mde.f33474a & 8) != 0) {
            mdb mdb = mde.f33478e;
            if (mdb == null) {
                mdb = mdb.f33467c;
            }
            int a3 = mda.m24892a(mdb.f33470b);
            if (a3 != 0 && a3 == 2) {
                Cipher a4 = m24576a();
                try {
                    a4.init(4, secretKey, new GCMParameterSpec(128, mde.f33476c.getKey()));
                    try {
                        return (SecretKey) a4.unwrap(mde.f33477d.getKey(), "AES", 3);
                    } catch (NoSuchAlgorithmException e) {
                        throw new lwh("Unable to unwrap tertiary key", e);
                    }
                } catch (InvalidAlgorithmParameterException e2) {
                    throw new lwh("Bad GCMParameterSpec", e2);
                }
            } else {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                mdb mdb2 = mde.f33478e;
                if (mdb2 == null) {
                    mdb2 = mdb.f33467c;
                }
                int a5 = mda.m24892a(mdb2.f33470b);
                if (a5 != 0) {
                    i = a5;
                }
                objArr2[0] = Integer.toString(i - 1);
                throw new lwh(String.format(locale2, "Wrapped key was unexpected %s algorithm. Only support AES/GCM/NoPadding.", objArr2));
            }
        } else {
            throw new lwh("Metadata missing from wrapped tertiary key.");
        }
    }

    /* renamed from: a */
    public static mde m24578a(SecretKey secretKey, SecretKey secretKey2) {
        Cipher a = m24576a();
        a.init(3, secretKey);
        bxvd da = mde.f33472f.mo74144da();
        ByteString a2 = ByteString.m123261a(a.wrap(secretKey2));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mde mde = (mde) da.f164949b;
        a2.getClass();
        mde.f33474a |= 4;
        mde.f33477d = a2;
        ByteString a3 = ByteString.m123261a(a.getIV());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mde mde2 = (mde) da.f164949b;
        a3.getClass();
        int i = mde2.f33474a | 2;
        mde2.f33474a = i;
        mde2.f33476c = a3;
        mde2.f33475b = 1;
        mde2.f33474a = i | 1;
        bxvd da2 = mdb.f33467c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        mdb mdb = (mdb) da2.f164949b;
        mdb.f33470b = 1;
        mdb.f33469a = 1 | mdb.f33469a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mde mde3 = (mde) da.f164949b;
        mdb mdb2 = (mdb) da2.mo74062i();
        mdb2.getClass();
        mde3.f33478e = mdb2;
        mde3.f33474a |= 8;
        return (mde) da.mo74062i();
    }
}
