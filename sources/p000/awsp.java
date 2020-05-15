package p000;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: awsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsp {
    /* renamed from: a */
    public static final SharedPreferences m80965a(boolean z) {
        return rpr.m34216b().getSharedPreferences("com.google.android.gms.wallet.service.ib.ParcelableCryptoKeys", !z ? 0 : 4);
    }

    /* renamed from: b */
    private static String m80973b(String str) {
        return String.format("%08X%s%s", 2, "|", str);
    }

    /* renamed from: c */
    private static String[] m80974c(String str) {
        return str.split(Pattern.quote("|"));
    }

    /* renamed from: d */
    private static byte[] m80975d(String str) {
        return Base64.decode(str, 2);
    }

    /* renamed from: a */
    public static final Parcelable m80966a(Parcelable.Creator creator, String str) {
        String[] c = m80974c(str);
        if (m80967a(c).intValue() == 2) {
            boolean z = true;
            String b = m80973b(c[1]);
            SharedPreferences a = m80965a(false);
            if (!a.contains(b)) {
                a = m80965a(true);
            }
            String string = a.getString(b, null);
            if (string != null) {
                SecretKey a2 = m80972a(string);
                byte[] d = m80975d(c[2]);
                byte[] d2 = m80975d(c[3]);
                if (d2.length != 12) {
                    z = false;
                }
                sdo.m34975b(z, "Wrong number of bytes for IV");
                try {
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(2, a2, new IvParameterSpec(d2));
                    byte[] doFinal = instance.doFinal(d);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(doFinal, 0, doFinal.length);
                        obtain.setDataPosition(0);
                        return (Parcelable) creator.createFromParcel(obtain);
                    } finally {
                        obtain.recycle();
                    }
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Failed to decrypt with AES", e);
                }
            } else {
                throw new SecurityException("Could not find key!");
            }
        } else {
            throw new SecurityException("Wrong key version!");
        }
    }

    /* renamed from: a */
    private static Integer m80967a(String[] strArr) {
        return Integer.valueOf(Integer.parseInt(strArr[0], 16));
    }

    /* renamed from: a */
    private static final String m80968a() {
        try {
            return m80971a(KeyGenerator.getInstance("AES").generateKey().getEncoded());
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Failed to generate AES key", e);
        }
    }

    /* renamed from: a */
    public static final String m80969a(SharedPreferences sharedPreferences, boolean z) {
        String b = m80973b(UUID.randomUUID().toString());
        if (sharedPreferences.edit().clear().putString(b, m80968a()).commit()) {
            return b;
        }
        sharedPreferences.edit().clear().apply();
        if (!z) {
            return null;
        }
        throw new RuntimeException("Unable to save data to shared preferences!");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awsp.a(android.content.SharedPreferences, boolean):java.lang.String
     arg types: [android.content.SharedPreferences, int]
     candidates:
      awsp.a(android.os.Parcelable$Creator, java.lang.String):android.os.Parcelable
      awsp.a(android.content.SharedPreferences, boolean):java.lang.String */
    /* renamed from: a */
    public static final String m80970a(Parcelable parcelable) {
        String str;
        int i = spn.f44932a;
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            SharedPreferences a = m80965a(false);
            Set<String> keySet = a.getAll().keySet();
            if (keySet.size() == 1) {
                str = keySet.iterator().next();
                if (m80967a(m80974c(str)).intValue() != 2) {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str == null) {
                str = m80969a(a, true);
            }
            SecretKey a2 = m80972a(a.getString(str, null));
            byte[] bArr = new byte[12];
            awvz.m81273a().nextBytes(bArr);
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(1, a2, new IvParameterSpec(bArr));
                return String.format("%s%s%s%s%s", str, "|", m80971a(instance.doFinal(marshall)), "|", m80971a(bArr));
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Failed to encrypt with AES", e);
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private static String m80971a(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: a */
    private static SecretKey m80972a(String str) {
        byte[] d = m80975d(str);
        return new SecretKeySpec(d, 0, d.length, "AES");
    }
}
