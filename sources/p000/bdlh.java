package p000;

import android.app.Application;
import android.view.WindowManager;

/* renamed from: bdlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdlh {

    /* renamed from: a */
    private static volatile int f105889a;

    /* renamed from: b */
    private static volatile int f105890b;

    private bdlh() {
    }

    /* renamed from: a */
    public static int m91018a(Application application) {
        if (f105889a == 0) {
            synchronized (bdlh.class) {
                if (f105889a == 0) {
                    int b = m91019b(application);
                    if (b < 10) {
                        b = 60;
                    } else if (b > 60) {
                        b = 60;
                    }
                    double d = (double) b;
                    Double.isNaN(d);
                    f105889a = (int) Math.ceil(1000.0d / d);
                }
            }
        }
        return f105889a;
    }

    /* renamed from: b */
    public static int m91019b(Application application) {
        if (f105890b == 0) {
            synchronized (bdlh.class) {
                if (f105890b == 0) {
                    f105890b = Math.round(((WindowManager) application.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return f105890b;
    }
}
