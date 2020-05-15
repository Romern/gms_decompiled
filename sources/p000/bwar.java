package p000;

import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Scanner;

/* renamed from: bwar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwar {

    /* renamed from: a */
    public static final bwar f158672a = new bwar();

    /* renamed from: b */
    private static final String f158673b = bwar.class.getSimpleName();

    private bwar() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final String mo73413a(String str, String str2) {
        String property = System.getProperty(str);
        String str3 = null;
        if (property == null) {
            try {
                Process exec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str});
                StrictMode.ThreadPolicy a = bwap.f158670a.mo73410a();
                try {
                    Scanner useDelimiter = new Scanner(exec.getInputStream(), "UTF-8").useDelimiter("\n");
                    if (useDelimiter.hasNext()) {
                        str3 = useDelimiter.next();
                    }
                    useDelimiter.close();
                    bwap.f158670a.mo73411a(a);
                    property = str3;
                } catch (Throwable th) {
                    bwap.f158670a.mo73411a(a);
                    throw th;
                }
            } catch (IOException e) {
                if (bwam.m121655a(f158673b, 5)) {
                    Log.w(f158673b, "Unable to retrieve system property.");
                    property = null;
                } else {
                    property = null;
                }
            }
        }
        return property != null ? property : str2;
    }
}
