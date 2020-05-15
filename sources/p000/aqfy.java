package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: aqfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfy {

    /* renamed from: a */
    private static final String f86017a = aqfy.class.getSimpleName();

    /* renamed from: b */
    private static final String[] f86018b = {"hE2BTMCxuBEvjaOw7ITSmg", "3WAplyqNxuINc6KTWk0Vpa"};

    /* renamed from: c */
    private static final Map f86019c = new HashMap();

    static {
        "0123456789abcdef".toCharArray();
    }

    aqfy() {
    }

    /* renamed from: a */
    static int m71552a(Context context, String str) {
        try {
            int i = context.getPackageManager().getApplicationInfo(str, 0).uid;
            try {
                Object systemService = context.getSystemService("appops");
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(systemService, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), str})).intValue() == 0 ? 1 : 2;
            } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                return 0;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m71562b() {
        return ((Integer) UserHandle.class.getMethod("myUserId", new Class[0]).invoke(UserHandle.class, new Object[0])).intValue();
    }

    /* renamed from: c */
    static String m71565c(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
                sb.append(readLine);
            }
        } catch (IOException e) {
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    static byte[] m71567d(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            try {
                fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        fileInputStream.close();
                        return instance.digest();
                    }
                    instance.update(bArr, 0, read);
                }
            } catch (IOException e) {
                return null;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            throw th;
        } catch (NoSuchAlgorithmException e2) {
            System.out.println("No algo");
            return null;
        }
    }

    /* renamed from: b */
    static String m71563b(String str) {
        return m71565c(new File(str));
    }

    /* renamed from: b */
    static byte[] m71564b(File file) {
        BufferedInputStream bufferedInputStream;
        byte[] bArr = new byte[((int) file.length())];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    if (i2 >= ((int) file.length())) {
                        break;
                    }
                    i = bufferedInputStream.read(bArr, i2, ((int) file.length()) - i2);
                    i2 += i;
                }
                bufferedInputStream.close();
                fileInputStream.close();
                return bArr;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            return null;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    /* renamed from: a */
    static File m71553a(String str, Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return new File(applicationInfo.sourceDir);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: c */
    static String m71566c(String str) {
        byte[] decode = Base64.decode(f86018b[0], 0);
        byte[] decode2 = Base64.decode(f86018b[1], 0);
        int length = decode.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < decode2.length; i++) {
            bArr[i] = (byte) (decode[i] ^ decode2[i]);
        }
        byte[] decode3 = Base64.decode(str, 0);
        for (int i2 = 0; i2 < decode3.length; i2++) {
            decode3[i2] = (byte) (bArr[i2 % length] ^ decode3[i2]);
        }
        return new String(decode3);
    }

    /* renamed from: a */
    static void m71554a(Context context, byte[] bArr) {
        File file = new File(context.getApplicationInfo().dataDir, "snet");
        file.mkdirs();
        if (file.exists()) {
            File file2 = new File(file, "tmp_watchlist_report.proto");
            file2.delete();
            if (bArr != null) {
                m71558a(bArr, file2);
            }
        }
    }

    /* renamed from: a */
    static boolean m71555a() {
        return "user".equals(Build.TYPE);
    }

    /* renamed from: a */
    public static boolean m71556a(int i, int i2) {
        int i3;
        try {
            Method method = UserHandle.class.getMethod("getUserId", Integer.TYPE);
            return ((Integer) method.invoke(UserHandle.class, new Object[]{Integer.valueOf(i)})).intValue() == ((Integer) method.invoke(UserHandle.class, new Object[]{Integer.valueOf(i2)})).intValue();
        } catch (Exception e) {
            try {
                i3 = UserHandle.class.getField("PER_USER_RANGE").getInt(UserHandle.class);
            } catch (Exception e2) {
                i3 = 100000;
            }
            return i / i3 == i2 / i3;
        }
    }

    /* renamed from: a */
    static boolean m71557a(String str, String str2) {
        if (str != null) {
            return str.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US));
        }
        return false;
    }

    /* renamed from: a */
    static boolean m71558a(byte[] bArr, File file) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (IOException e) {
            Log.e(f86017a, "IOException", e);
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    static byte[] m71559a(Context context) {
        File file = new File(context.getApplicationInfo().dataDir, "snet");
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "tmp_watchlist_report.proto");
        if (file2.exists()) {
            return m71564b(file2);
        }
        return null;
    }

    /* renamed from: a */
    static byte[] m71560a(File file) {
        if (f86019c.containsKey(file)) {
            return (byte[]) f86019c.get(file);
        }
        byte[] d = m71567d(file);
        f86019c.put(file, d);
        return d;
    }

    /* renamed from: a */
    static byte[] m71561a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }
}
