package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bfob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfob {

    /* renamed from: a */
    private final Cipher f114539a;

    /* renamed from: b */
    private final Cipher f114540b;

    private bfob(Cipher cipher, Cipher cipher2) {
        this.f114539a = cipher;
        this.f114540b = cipher2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0088 A[SYNTHETIC, Splitter:B:58:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0090 A[Catch:{ IOException -> 0x008c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x0070=Splitter:B:45:0x0070, B:64:0x0093=Splitter:B:64:0x0093} */
    /* renamed from: a */
    public static synchronized bfob m97393a(Context context, SecureRandom secureRandom) {
        FileInputStream fileInputStream;
        IOException e;
        byte[] bArr;
        bfob bfob;
        synchronized (bfob.class) {
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "EARStorage.ck");
                FileOutputStream fileOutputStream = null;
                try {
                    if (!file.exists()) {
                        bArr = new byte[32];
                        secureRandom.nextBytes(bArr);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            fileOutputStream2.write(bArr);
                            fileInputStream = null;
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException e2) {
                            e = e2;
                            fileInputStream = null;
                            fileOutputStream = fileOutputStream2;
                            try {
                                throw new bfof(e);
                            } catch (Throwable th) {
                                th = th;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e3) {
                                        throw th;
                                    }
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                            }
                            if (fileInputStream != null) {
                            }
                            throw th;
                        }
                    } else {
                        fileInputStream = new FileInputStream(file);
                        try {
                            bArr = boav.m111020a(fileInputStream);
                        } catch (IOException e4) {
                            e = e4;
                            throw new bfof(e);
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    try {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                        bfob = new bfob(m97394a(1, secretKeySpec), m97394a(2, secretKeySpec));
                    } catch (IllegalArgumentException e6) {
                        try {
                            file.delete();
                        } catch (SecurityException e7) {
                        }
                        throw new bfof(e6);
                    } catch (GeneralSecurityException e8) {
                        throw new bfof(e8);
                    }
                } catch (IOException e9) {
                    e = e9;
                    fileInputStream = null;
                    throw new bfof(e);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                    if (fileOutputStream != null) {
                    }
                    if (fileInputStream != null) {
                    }
                    throw th;
                }
            } else {
                throw new bfof();
            }
        }
        return bfob;
    }

    /* renamed from: b */
    public final byte[] mo62028b(byte[] bArr) {
        try {
            return this.f114540b.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new bfof(e);
        }
    }

    /* renamed from: a */
    private static Cipher m97394a(int i, SecretKeySpec secretKeySpec) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(new byte[16]));
        return instance;
    }

    /* renamed from: a */
    public final byte[] mo62027a(byte[] bArr) {
        try {
            return this.f114539a.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new bfof(e);
        }
    }
}
