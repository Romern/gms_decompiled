package p000;

import com.google.ads.afma.proto2api.C0152c;
import com.google.ads.afma.proto2api.C0153d;
import com.google.ads.afma.proto2api.C0158i;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dae {

    /* renamed from: a */
    static boolean f12496a = false;

    /* renamed from: b */
    public static MessageDigest f12497b = null;

    /* renamed from: c */
    static final CountDownLatch f12498c = new CountDownLatch(1);

    /* renamed from: d */
    private static final Object f12499d = new Object();

    /* renamed from: e */
    private static final Object f12500e = new Object();

    /* renamed from: a */
    public static String m8079a(C0152c cVar) {
        return m8086c(cVar.mo73642k());
    }

    /* renamed from: b */
    static C0152c m8084b() {
        bxvd da = C0152c.f7500Q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0152c cVar = (C0152c) da.f164949b;
        cVar.f7518a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        cVar.f7529l = 4096;
        return (C0152c) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dae.a(byte[], boolean):byte[]
     arg types: [byte[], int]
     candidates:
      dae.a(java.lang.String, java.lang.String):byte[]
      dae.a(byte[], boolean):byte[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(byte[], boolean):java.lang.String
     arg types: [byte[], int]
     candidates:
      dab.a(java.lang.String, boolean):byte[]
      dab.a(byte[], boolean):java.lang.String */
    /* renamed from: c */
    static String m8086c(byte[] bArr) {
        byte[] bArr2;
        if (((Boolean) C0371o.f8205S.mo6604a()).booleanValue()) {
            Vector b = m8085b(bArr);
            if (b == null || b.size() == 0) {
                bArr2 = m8083a(m8084b().mo73642k(), true);
            } else {
                bxvd da = C0158i.f7564e.mo74144da();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    da.mo74029b(bxtx.m123261a(m8083a((byte[]) b.get(i), false)));
                }
                bxtx a = bxtx.m123261a(m8082a(bArr));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0158i iVar = (C0158i) da.f164949b;
                a.getClass();
                iVar.f7566a |= 1;
                iVar.f7568c = a;
                bArr2 = ((C0158i) da.mo74062i()).mo73642k();
            }
        } else if (dcb.f12782a != null) {
            byte[] a2 = dcb.f12782a.mo69285a(bArr, new byte[0]);
            bxvd da2 = C0158i.f7564e.mo74144da();
            da2.mo74029b(bxtx.m123261a(a2));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            C0158i iVar2 = (C0158i) da2.f164949b;
            iVar2.f7569d = 2;
            iVar2.f7566a |= 4;
            bArr2 = ((C0158i) da2.mo74062i()).mo73642k();
        } else {
            throw new GeneralSecurityException();
        }
        return dab.m8076a(bArr2, true);
    }

    /* renamed from: a */
    static void m8080a() {
        synchronized (f12500e) {
            if (!f12496a) {
                f12496a = true;
                new Thread(new dad()).start();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(java.lang.String, boolean):byte[]
     arg types: [java.lang.String, int]
     candidates:
      dab.a(byte[], boolean):java.lang.String
      dab.a(java.lang.String, boolean):byte[] */
    /* renamed from: a */
    public static byte[] m8081a(String str, String str2) {
        byte[] bArr;
        bxvd da = C0153d.f7544d.mo74144da();
        try {
            bxtx a = bxtx.m123261a(str.length() < 3 ? str.getBytes("ISO-8859-1") : dab.m8077a(str, true));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C0153d dVar = (C0153d) da.f164949b;
            a.getClass();
            dVar.f7546a |= 1;
            dVar.f7547b = a;
            if (str2.length() == 0) {
                bArr = Integer.toString(5).getBytes("ISO-8859-1");
            } else {
                bArr = dab.m8077a(m8086c(str2.getBytes("ISO-8859-1")), true);
            }
            bxtx a2 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C0153d dVar2 = (C0153d) da.f164949b;
            a2.getClass();
            dVar2.f7546a |= 2;
            dVar2.f7548c = a2;
            return ((C0153d) da.mo74062i()).mo73642k();
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            return null;
        }
    }

    /* renamed from: b */
    static Vector m8085b(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i = (length + 254) / 255;
        Vector vector = new Vector();
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i3 > 255) {
                    length2 = i3 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i3, length2));
                i2++;
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return vector;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e A[Catch:{ InterruptedException -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[Catch:{ InterruptedException -> 0x001b }] */
    /* renamed from: a */
    public static byte[] m8082a(byte[] bArr) {
        byte[] digest;
        synchronized (f12499d) {
            m8080a();
            MessageDigest messageDigest = null;
            try {
                if (f12498c.await(2, TimeUnit.SECONDS)) {
                    if (f12497b != null) {
                        messageDigest = f12497b;
                        if (messageDigest == null) {
                            messageDigest.reset();
                            messageDigest.update(bArr);
                            digest = f12497b.digest();
                        } else {
                            throw new NoSuchAlgorithmException("Cannot compute hash");
                        }
                    }
                }
            } catch (InterruptedException e) {
            }
            if (messageDigest == null) {
            }
        }
        return digest;
    }

    /* renamed from: a */
    private static byte[] m8083a(byte[] bArr, boolean z) {
        int i;
        byte[] bArr2;
        if (!z) {
            i = 255;
        } else {
            i = 239;
        }
        if (bArr.length > i) {
            bArr = m8084b().mo73642k();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(PSKKeyManager.MAX_KEY_LENGTH_BYTES).put(m8082a(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        daf[] dafArr = new das().f12652cG;
        int length2 = dafArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            dafArr[i2].mo8473a(bArr2, bArr4);
        }
        return bArr4;
    }
}
