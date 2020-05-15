package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/* renamed from: avzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzr {
    /* renamed from: a */
    public static File m79552a(Context context, String str) {
        File a = avzc.m79539a(context);
        if (a == null) {
            new Object[1][0] = str;
            return null;
        }
        if (!a.exists()) {
            a.mkdir();
            avye.m79530a(a);
        }
        return new File(a, String.valueOf(str).concat("_start"));
    }

    /* renamed from: a */
    public static void m79553a(File file) {
        if (!file.exists()) {
            String l = Long.toString(System.currentTimeMillis());
            try {
                PrintStream printStream = new PrintStream(file);
                printStream.print(l);
                printStream.close();
            } catch (IOException e) {
                avxz.m79526a(e, "Failed to write file: %s", file.getAbsolutePath());
            }
        }
    }
}
