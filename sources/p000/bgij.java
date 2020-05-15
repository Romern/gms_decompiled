package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: bgij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bgij {
    /* renamed from: a */
    public static bsax m99010a(Context context, Locale locale) {
        String str;
        String str2;
        if (locale != null) {
            str = locale.toString();
        } else {
            str = null;
        }
        bsax bsax = new bsax(bgox.f117038ae);
        bsax.mo70118b(1, Integer.toString(stu.m36316b()));
        if (Build.FINGERPRINT != null) {
            String valueOf = String.valueOf(Build.FINGERPRINT);
            str2 = valueOf.length() == 0 ? new String("android/") : "android/".concat(valueOf);
        } else {
            str2 = "android";
        }
        bsax.mo70118b(2, str2);
        if (str != null) {
            bsax.mo70118b(5, str);
        }
        String b = m99013b(context);
        if (!TextUtils.isEmpty(b)) {
            bsax.mo70118b(3, b);
        }
        return bsax;
    }

    /* renamed from: b */
    public static synchronized String m99013b(Context context) {
        String b;
        synchronized (bgij.class) {
            b = bgif.m98995b(context);
        }
        return b;
    }

    /* renamed from: a */
    public abstract void mo62864a(bsax bsax);

    /* renamed from: a */
    public abstract void mo62865a(bsax bsax, int i, bgmj bgmj, bgmn bgmn);

    /* renamed from: a */
    public abstract void mo62866a(bsax bsax, bglz bglz);

    /* renamed from: a */
    public static synchronized void m99011a(Context context) {
        synchronized (bgij.class) {
            bgif.m98993a(context);
        }
    }

    /* renamed from: a */
    public static synchronized void m99012a(Context context, String str) {
        synchronized (bgij.class) {
            bgif.m98994a(context, str);
        }
    }
}
