package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: vos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vos {
    /* renamed from: a */
    public static CipherInputStream m40948a(vow vow, InputStream inputStream) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, vow.f49687a, new IvParameterSpec((byte[]) sdo.m34959a(vow.f49689c)));
            return new CipherInputStream(inputStream, instance);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new vov(e);
        }
    }

    /* renamed from: a */
    public static CipherOutputStream m40949a(vow vow, OutputStream outputStream) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, vow.f49687a, new IvParameterSpec((byte[]) sdo.m34959a(vow.f49689c)));
            return new CipherOutputStream(outputStream, instance);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new vov(e);
        }
    }

    /* renamed from: a */
    public static void m40950a(vow vow, InputStream inputStream, OutputStream outputStream) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, vow.f49687a, new IvParameterSpec((byte[]) sdo.m34959a(vow.f49689c)));
            byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byte[] update = instance.update(bArr, 0, read);
                    if (update != null) {
                        outputStream.write(update);
                    }
                } else {
                    outputStream.write(instance.doFinal());
                    return;
                }
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new vov(e);
        }
    }
}
