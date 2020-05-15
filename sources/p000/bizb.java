package p000;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: bizb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizb {
    @Deprecated
    /* renamed from: a */
    public static void m103017a(Window window) {
        int i = Build.VERSION.SDK_INT;
        m103018a(window, 5634);
        m103022c(window, 5634);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    /* renamed from: b */
    public static void m103021b(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = (i ^ -1) & attributes.systemUiVisibility;
        window.setAttributes(attributes);
    }

    /* renamed from: c */
    public static void m103022c(Window window, int i) {
        m103019a(window, new biyv(i));
    }

    /* renamed from: d */
    public static void m103023d(Window window, int i) {
        m103019a(window, new biyw(i));
    }

    /* renamed from: a */
    public static void m103018a(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = i | attributes.systemUiVisibility;
        window.setAttributes(attributes);
    }

    /* renamed from: a */
    private static void m103019a(Window window, biyz biyz) {
        biyy biyy = new biyy();
        biyy.f122352b = window;
        biyy.f122353c = 3;
        biyy.f122354d = biyz;
        biyy.f122355e.run();
    }

    /* renamed from: a */
    public static void m103020a(Window window, boolean z) {
        if (!z) {
            m103018a(window, 4194304);
            m103022c(window, 4194304);
            return;
        }
        m103021b(window, 4194304);
        m103023d(window, 4194304);
    }
}
