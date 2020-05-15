package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bdyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdyh {
    /* renamed from: a */
    public static final bmxv m91579a(Context context) {
        bmxv bmxv;
        BufferedReader bufferedReader;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        if ((!str.equals("eng") && !str.equals("userdebug")) || ((!str3.equals("goldfish") && !str3.equals("ranchu") && !str3.equals("robolectric")) || (!str2.contains("dev-keys") && !str2.contains("test-keys")))) {
            return bmvz.f131120a;
        }
        Context d = aytw.m84817d(context);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(d.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                bmxv = bmxv.m108566b(file);
            } else {
                bmxv = bmvz.f131120a;
            }
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            bmxv = bmvz.f131120a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (!bmxv.mo66813a()) {
            return bmvz.f131120a;
        }
        File file2 = (File) bmxv.mo66814b();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf);
                    Log.i("HermeticFileOverrides", sb.toString());
                    bdyg bdyg = new bdyg(hashMap);
                    bufferedReader.close();
                    return bmxv.m108566b(bdyg);
                }
                String[] split = readLine.split(" ", 3);
                if (split.length == 3) {
                    String str4 = split[0];
                    String decode = Uri.decode(split[1]);
                    String decode2 = Uri.decode(split[2]);
                    if (!hashMap.containsKey(str4)) {
                        hashMap.put(str4, new HashMap());
                    }
                    ((Map) hashMap.get(str4)).put(decode, decode2);
                } else {
                    Log.e("HermeticFileOverrides", readLine.length() == 0 ? new String("Invalid: ") : "Invalid: ".concat(readLine));
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
