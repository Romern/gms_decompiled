package p000;

import android.content.Context;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: bgif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgif {

    /* renamed from: a */
    private static String f116501a;

    /* renamed from: a */
    private static String m98992a(Context context, long j) {
        try {
            File file = new File(context.getCacheDir(), "nlp_GlsPlatformKey");
            if (file.lastModified() <= j) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            String readUTF = dataInputStream.readUTF();
            dataInputStream.close();
            return readUTF;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized String m98995b(Context context) {
        String str;
        synchronized (bgif.class) {
            if (ceze.m138461f()) {
                if (f116501a == null) {
                    String a = m98992a(context, System.currentTimeMillis() - 604800000);
                    f116501a = a;
                    if (a == null) {
                        byte[] bArr = new byte[8];
                        new Random().nextBytes(bArr);
                        long currentTimeMillis = System.currentTimeMillis();
                        bmxy.m108588a(true);
                        byte[] bArr2 = new byte[12];
                        for (int i = 0; i < 8; i++) {
                            bArr2[i] = bArr[i];
                        }
                        int i2 = (int) (currentTimeMillis / 60000);
                        bArr2[8] = (byte) (i2 >> 24);
                        bArr2[9] = (byte) ((i2 >> 16) & 255);
                        bArr2[10] = (byte) ((i2 >> 8) & 255);
                        bArr2[11] = (byte) (i2 & 255);
                        String encodeToString = Base64.encodeToString(bArr2, 2);
                        f116501a = encodeToString;
                        m98994a(context, encodeToString);
                    }
                }
            } else if (f116501a == null) {
                f116501a = m98992a(context, Long.MIN_VALUE);
            }
            str = f116501a;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m98993a(Context context) {
        synchronized (bgif.class) {
            File file = new File(context.getCacheDir(), "nlp_GlsPlatformKey");
            try {
                file.delete();
            } catch (SecurityException e) {
                String valueOf = String.valueOf(file.toString());
                if (valueOf.length() == 0) {
                    new String("Unable to delete ");
                } else {
                    "Unable to delete ".concat(valueOf);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m98994a(Context context, String str) {
        synchronized (bgif.class) {
            if (!ceze.m138461f()) {
                File cacheDir = context.getCacheDir();
                if (cacheDir != null && (cacheDir.exists() || cacheDir.mkdirs())) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(cacheDir, "nlp_GlsPlatformKey"))));
                        dataOutputStream.writeUTF(str);
                        dataOutputStream.close();
                    } catch (FileNotFoundException | IOException e) {
                    }
                }
                f116501a = str;
            }
        }
    }
}
