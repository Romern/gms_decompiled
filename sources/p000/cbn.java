package p000;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

/* renamed from: cbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbn {

    /* renamed from: a */
    private static final Logger f6400a = Logger.getLogger(cbn.class.getName());

    /* renamed from: a */
    public static void m3898a(ByteArrayOutputStream byteArrayOutputStream) {
        int size = byteArrayOutputStream.size();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(new byte[size], 0, size);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, javax.security.auth.DestroyFailedException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m3899a(PrivateKey privateKey) {
        if (privateKey instanceof Destroyable) {
            try {
                privateKey.destroy();
            } catch (DestroyFailedException e) {
                f6400a.logp(Level.FINE, "com.bellid.util.WipeUtils", "wipe", "Error while destroying private key", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static void m3900a(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(char[], char):void}
     arg types: [char[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(char[], char):void} */
    /* renamed from: a */
    public static void m3901a(char[] cArr) {
        Arrays.fill(cArr, 0);
    }
}
