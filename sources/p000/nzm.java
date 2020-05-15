package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: nzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzm {

    /* renamed from: a */
    private static final byte[] f37013a = "\n".getBytes();

    /* renamed from: b */
    private static void m28233b(String str, OutputStream outputStream) {
        m28231a(str.length() == 0 ? new String("dumpsys ") : "dumpsys ".concat(str), outputStream);
        m28229a(new String[]{"dumpsys", str}, outputStream);
        outputStream.write(f37013a);
    }

    /* renamed from: a */
    public static long m28228a(OutputStream outputStream, int i) {
        OutputStream outputStream2 = outputStream;
        int i2 = i;
        int i3 = Build.VERSION.SDK_INT;
        m28231a("logcat -b main,system,events,crash", outputStream2);
        String[] strArr = {"logcat", "-v", "threadtime", "-d", "-b", "main,system,events,crash"};
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder(11);
            sb.append(i2);
            strArr = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr, new String[]{"-t", sb.toString()}});
        }
        long a = m28229a(strArr, outputStream2);
        if (a > 100) {
            return a;
        }
        m28231a("logcat -b main,system,crash", outputStream2);
        String[] strArr2 = {"logcat", "-v", "threadtime", "-d"};
        if (i2 > 0) {
            StringBuilder sb2 = new StringBuilder(11);
            sb2.append((i2 * 4) / 5);
            strArr2 = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr2, new String[]{"-t", sb2.toString()}});
        }
        long a2 = a + m28229a(strArr2, outputStream2);
        m28231a("logcat -b events", outputStream2);
        String[] strArr3 = {"logcat", "-v", "threadtime", "-d", "-b", "events"};
        if (i2 > 0) {
            StringBuilder sb3 = new StringBuilder(11);
            sb3.append(i2 / 5);
            strArr3 = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr3, new String[]{"-t", sb3.toString()}});
        }
        return a2 + m28229a(strArr3, outputStream2);
    }

    /* renamed from: a */
    private static long m28229a(String[] strArr, OutputStream outputStream) {
        InputStream inputStream = Runtime.getRuntime().exec(strArr).getInputStream();
        long a = boav.m111013a(inputStream, outputStream);
        inputStream.close();
        return a;
    }

    /* renamed from: a */
    public static void m28230a(Context context, OutputStream outputStream) {
        if (npe.m27160b(context, "android.permission.DUMP") != 0) {
            outputStream.write("Missing dump permission".getBytes());
            return;
        }
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (!(applicationInfo.metaData == null || applicationInfo.metaData.get("com.google.android.gms.car.application") == null)) {
                arrayList.add(applicationInfo.packageName);
            }
        }
        if (!arrayList.contains("com.google.android.gms")) {
            arrayList.add("com.google.android.gms");
        }
        m28232a("", arrayList, outputStream);
        m28232a("services", arrayList, outputStream);
        m28232a("service", arrayList, outputStream);
        m28232a("provider", arrayList, outputStream);
        m28233b("meminfo", outputStream);
        m28233b("audio", outputStream);
        m28233b("media.audio_flinger", outputStream);
        m28233b("SurfaceFlinger", outputStream);
        m28233b("bluetooth_manager", outputStream);
        m28233b("usb", outputStream);
        m28233b("window", outputStream);
    }

    /* renamed from: a */
    private static void m28231a(String str, OutputStream outputStream) {
        outputStream.write(String.format(Locale.US, "---------- %s ----------\n", str).getBytes());
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static void m28232a(String str, Iterable r11, OutputStream outputStream) {
        m28231a(str.length() == 0 ? new String("dumpsys activity ") : "dumpsys activity ".concat(str), outputStream);
        int size = r11.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) r11.get(i);
            try {
                String[] strArr = !TextUtils.isEmpty(str) ? new String[]{"dumpsys", "activity", str, str2} : new String[]{"dumpsys", "activity", str2};
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                m28229a(strArr, byteArrayOutputStream);
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                if (!byteArrayOutputStream2.startsWith("Bad activity command")) {
                    outputStream.write(byteArrayOutputStream2.getBytes());
                }
            } catch (IOException e) {
            }
            outputStream.write(f37013a);
        }
    }
}
