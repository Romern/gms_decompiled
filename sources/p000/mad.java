package p000;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.StringBuilderPrinter;
import com.felicanetworks.mfc.C0126R;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: mad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mad {

    /* renamed from: a */
    private static final lvn f33323a = new lvn("TelephonyBackupUtil");

    /* renamed from: b */
    private final Context f33324b;

    /* renamed from: c */
    private final PackageManager f33325c;

    public mad(Context context, PackageManager packageManager) {
        this.f33324b = context;
        this.f33325c = packageManager;
    }

    /* renamed from: a */
    public static ArrayList m24750a(byte[][] bArr) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (byte[] bArr2 : bArr) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr2);
            arrayList.add(instance.digest());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m24757b(String str, String str2, String str3, String str4, FullBackupDataOutput fullBackupDataOutput) {
        f33323a.mo25412b("backupToTarV23", new Object[0]);
        try {
            Method declaredMethod = Class.forName("android.app.backup.FullBackup").getDeclaredMethod("backupToTar", String.class, String.class, String.class, String.class, String.class, FullBackupDataOutput.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, str, str2, null, str3, str4, fullBackupDataOutput);
        } catch (ReflectiveOperationException e) {
            throw new mae("Error calling backupToTarV23.", e);
        }
    }

    /* renamed from: a */
    public static void m24751a(BackupDataOutput backupDataOutput, String str, byte[] bArr) {
        int length = bArr.length;
        backupDataOutput.writeEntityHeader(str, length);
        backupDataOutput.writeEntityData(bArr, length);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (4) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m24752a(Context context, File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Throwable e;
        FileInputStream fileInputStream4;
        FileInputStream fileInputStream5;
        BackupDataInput backupDataInput;
        FileOutputStream fileOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream6 = null;
        r2 = null;
        FileInputStream fileInputStream7 = null;
        try {
            File a = mce.m24857a(context, "telephony_metadata");
            fileInputStream2 = new FileInputStream(file);
            try {
                backupDataInput = new BackupDataInput(fileInputStream2.getFD());
                fileOutputStream = new FileOutputStream(a);
            } catch (IOException | NoSuchAlgorithmException e2) {
                e = e2;
                fileInputStream = null;
                fileInputStream5 = null;
                fileInputStream6 = fileInputStream2;
                fileInputStream4 = fileInputStream5;
                try {
                    throw new mae("Error creating package metadata.", e);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream6;
                    fileInputStream3 = fileInputStream4;
                    fileInputStream7 = fileInputStream3;
                    srz.m36171a(byteArrayOutputStream);
                    srz.m36171a(dataOutputStream);
                    srz.m36171a((Closeable) fileInputStream7);
                    srz.m36171a((Closeable) fileInputStream2);
                    srz.m36171a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                srz.m36171a(byteArrayOutputStream);
                srz.m36171a(dataOutputStream);
                srz.m36171a((Closeable) fileInputStream7);
                srz.m36171a((Closeable) fileInputStream2);
                srz.m36171a((Closeable) fileInputStream);
                throw th;
            }
            try {
                BackupDataOutput backupDataOutput = new BackupDataOutput(fileOutputStream.getFD());
                while (backupDataInput.readNextHeader()) {
                    String key = backupDataInput.getKey();
                    int dataSize = backupDataInput.getDataSize();
                    if (dataSize < 0 || "com.android.providers.telephony".equals(key)) {
                        backupDataInput.skipEntityData();
                    } else {
                        byte[] bArr = new byte[dataSize];
                        backupDataInput.readEntityData(bArr, 0, dataSize);
                        m24751a(backupDataOutput, key, bArr);
                    }
                }
                dataOutputStream.writeInt(23);
                m24753a(dataOutputStream, m24750a(new byte[][]{m24756a(context)}));
                m24751a(backupDataOutput, "com.android.providers.telephony", byteArrayOutputStream.toByteArray());
                fileInputStream2.close();
                file.delete();
                fileInputStream = new FileInputStream(a);
                try {
                    srj.m36118a(fileInputStream, file);
                    a.delete();
                    srz.m36171a(byteArrayOutputStream);
                    srz.m36171a(dataOutputStream);
                    srz.m36171a(fileOutputStream);
                    srz.m36171a((Closeable) fileInputStream2);
                    srz.m36171a((Closeable) fileInputStream);
                } catch (IOException | NoSuchAlgorithmException e3) {
                    e = e3;
                    fileInputStream5 = fileOutputStream;
                    fileInputStream6 = fileInputStream2;
                    fileInputStream4 = fileInputStream5;
                    throw new mae("Error creating package metadata.", e);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream3 = fileOutputStream;
                    fileInputStream7 = fileInputStream3;
                    srz.m36171a(byteArrayOutputStream);
                    srz.m36171a(dataOutputStream);
                    srz.m36171a((Closeable) fileInputStream7);
                    srz.m36171a((Closeable) fileInputStream2);
                    srz.m36171a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (IOException | NoSuchAlgorithmException e4) {
                e = e4;
                fileInputStream = null;
                fileInputStream5 = fileOutputStream;
                fileInputStream6 = fileInputStream2;
                fileInputStream4 = fileInputStream5;
                throw new mae("Error creating package metadata.", e);
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                fileInputStream3 = fileOutputStream;
                fileInputStream7 = fileInputStream3;
                srz.m36171a(byteArrayOutputStream);
                srz.m36171a(dataOutputStream);
                srz.m36171a((Closeable) fileInputStream7);
                srz.m36171a((Closeable) fileInputStream2);
                srz.m36171a((Closeable) fileInputStream);
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException e5) {
            e = e5;
            fileInputStream = null;
            fileInputStream4 = null;
            throw new mae("Error creating package metadata.", e);
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            fileInputStream2 = null;
            srz.m36171a(byteArrayOutputStream);
            srz.m36171a(dataOutputStream);
            srz.m36171a((Closeable) fileInputStream7);
            srz.m36171a((Closeable) fileInputStream2);
            srz.m36171a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m24753a(DataOutputStream dataOutputStream, ArrayList arrayList) {
        dataOutputStream.writeInt(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* renamed from: a */
    public static void m24754a(String str, String str2, String str3, String str4, FullBackupDataOutput fullBackupDataOutput) {
        int i = Build.VERSION.SDK_INT;
        m24757b(str, str2, str3, str4, fullBackupDataOutput);
    }

    /* renamed from: a */
    public static boolean m24755a(String str) {
        return str != null && !str.equals("text/plain") && str.matches("^(image|video|audio|text).*$");
    }

    /* renamed from: a */
    public static byte[] m24756a(Context context) {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = context.getResources().openRawResource(C0126R.raw.sms_signature);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                srz.m36171a((Closeable) inputStream);
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                srz.m36171a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            srz.m36171a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo19798a(File file) {
        StringBuilder sb = new StringBuilder(4096);
        StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(sb);
        stringBuilderPrinter.println(Integer.toString(1));
        stringBuilderPrinter.println("com.android.providers.telephony");
        stringBuilderPrinter.println(Integer.toString(23));
        stringBuilderPrinter.println(Integer.toString(Build.VERSION.SDK_INT));
        String installerPackageName = this.f33325c.getInstallerPackageName("com.android.providers.telephony");
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        stringBuilderPrinter.println(installerPackageName);
        stringBuilderPrinter.println("0");
        Signature signature = new Signature(m24756a(this.f33324b));
        stringBuilderPrinter.println("1");
        stringBuilderPrinter.println(signature.toCharsString());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
            srz.m36171a(fileOutputStream);
            file.setLastModified(0);
        } catch (Throwable th) {
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo19799a(File file, File file2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                dataInputStream = dataInputStream2;
                srz.m36171a((Closeable) dataInputStream);
                srz.m36171a(fileOutputStream);
                throw th;
            }
            try {
                byte[] bArr = new byte[1048576];
                while (true) {
                    int readInt = dataInputStream2.readInt();
                    if (readInt > 0) {
                        while (readInt > 0) {
                            int read = dataInputStream2.read(bArr, 0, Math.min(readInt, 1048576));
                            fileOutputStream.write(bArr, 0, read);
                            readInt -= read;
                        }
                    } else {
                        fileOutputStream.close();
                        srz.m36171a((Closeable) dataInputStream2);
                        srz.m36171a(fileOutputStream);
                        return;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = dataInputStream2;
                srz.m36171a((Closeable) dataInputStream);
                srz.m36171a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            srz.m36171a((Closeable) dataInputStream);
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }
}
