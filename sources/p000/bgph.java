package p000;

import android.content.Context;
import android.media.RingtoneManager;
import android.os.Vibrator;
import com.felicanetworks.mfc.C0126R;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: bgph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgph {

    /* renamed from: a */
    private static int f117195a = 0;

    /* renamed from: a */
    public static File m99701a(Context context) {
        File file = new File(context.getFilesDir(), "qaccelmonitor");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: a */
    private static void m99702a(Context context, String str) {
        PrintWriter printWriter = null;
        try {
            File a = m99701a(context);
            if (a != null) {
                try {
                    printWriter = new PrintWriter(new FileWriter(new File(a, String.valueOf(new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date())).concat(".txt")), true));
                } catch (IOException e) {
                }
            }
            if (printWriter != null) {
                try {
                    printWriter.printf("%s %s\n", new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SSS", Locale.getDefault()).format(new Date()), str);
                    printWriter.close();
                } catch (Throwable th) {
                    th = th;
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (printWriter != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    static void m99703a(Context context, String str, bgrz bgrz) {
        if (cezu.m138491l()) {
            bgrz a = bgrz.mo63125a(bgpt.m99738a(context), System.currentTimeMillis());
            m99702a(context, String.format(Locale.US, "%s rep:%d thr:%d dt:%d b:%d db:%d", str, Integer.valueOf(a.f117402g), Integer.valueOf(a.f117401f), Long.valueOf(a.f117398c), Integer.valueOf(a.f117399d), Integer.valueOf(a.f117400e)));
        }
    }

    /* renamed from: a */
    static void m99704a(Context context, boolean z) {
        if (cezu.f183534a.mo6606a().seismicDebugNotification() && z) {
            C1102je jeVar = new C1102je(context);
            String valueOf = String.valueOf(new Date());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("quake @");
            sb.append(valueOf);
            jeVar.mo13640e(sb.toString());
            jeVar.mo13627a(true);
            jeVar.mo13622a(RingtoneManager.getDefaultUri(2));
            jeVar.f22258j = 0;
            jeVar.mo13616a(4);
            jeVar.mo13630b(qkj.m32287a(context, C0126R.C0127drawable.ic_location_on));
            sey a = sey.m35126a(context);
            int i = f117195a;
            f117195a = i + 1;
            a.mo25459a("pRPjL/2tRYajMFexaPiqUA", i, jeVar.mo13629b());
            ((Vibrator) context.getSystemService("vibrator")).vibrate(new long[]{0, 250, 250, 250, 250, 250, 250}, -1);
        }
        if (cezu.m138491l()) {
            m99702a(context, String.format(Locale.US, "event (%b)", Boolean.valueOf(z)));
        }
    }
}
