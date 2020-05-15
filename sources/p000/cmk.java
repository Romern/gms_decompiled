package p000;

import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: cmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmk {

    /* renamed from: a */
    public static volatile cmk f7062a;

    /* renamed from: d */
    private static final File f7063d = new File("/proc/self/fd");

    /* renamed from: b */
    public final boolean f7064b;

    /* renamed from: c */
    public final int f7065c;

    /* renamed from: e */
    private int f7066e;

    /* renamed from: f */
    private boolean f7067f = true;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public cmk() {
        char c;
        if (Build.MODEL != null && Build.MODEL.length() >= 7) {
            String substring = Build.MODEL.substring(0, 7);
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    break;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f7064b = true;
        int i3 = Build.VERSION.SDK_INT;
        this.f7065c = 0;
    }

    /* renamed from: a */
    public final synchronized boolean mo3974a() {
        boolean z = true;
        int i = this.f7066e + 1;
        this.f7066e = i;
        if (i >= 50) {
            this.f7066e = 0;
            int length = f7063d.list().length;
            if (length >= 20000) {
                z = false;
            }
            this.f7067f = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder(126);
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit 20000");
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f7067f;
    }
}
