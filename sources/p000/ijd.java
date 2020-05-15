package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* renamed from: ijd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ijd {

    /* renamed from: e */
    private static final sek f21088e = new sek("AuthzenGcmDeviceInfoBuilder");

    /* renamed from: a */
    public final Context f21089a;

    /* renamed from: b */
    private final igh f21090b;

    /* renamed from: c */
    private final ijf f21091c;

    /* renamed from: d */
    private final ijc f21092d;

    public ijd(Context context) {
        igh igh = new igh(context);
        ijf ijf = new ijf(context);
        ijc ijc = new ijc(context);
        this.f21089a = context;
        this.f21090b = igh;
        this.f21091c = ijf;
        this.f21092d = ijc;
    }

    /* renamed from: a */
    public final bynz mo13058a() {
        boolean z;
        boolean z2;
        String str;
        ije a = this.f21091c.mo13060a();
        bxvd da = bynz.f167151u.mo74144da();
        String str2 = Build.VERSION.CODENAME;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz = (bynz) da.f164949b;
        str2.getClass();
        bynz.f167153a |= 16;
        bynz.f167158f = str2;
        String str3 = Build.VERSION.RELEASE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz2 = (bynz) da.f164949b;
        str3.getClass();
        bynz2.f167153a |= 8;
        bynz2.f167157e = str3;
        String str4 = Build.DISPLAY;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz3 = (bynz) da.f164949b;
        str4.getClass();
        bynz3.f167153a |= 2;
        bynz3.f167155c = str4;
        long j = (long) Build.VERSION.SDK_INT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz4 = (bynz) da.f164949b;
        int i = bynz4.f167153a | 4;
        bynz4.f167153a = i;
        bynz4.f167156d = j;
        "20.15.15 (120300-{{cl}})".getClass();
        int i2 = i | 32;
        bynz4.f167153a = i2;
        bynz4.f167159g = "20.15.15 (120300-{{cl}})";
        bynz4.f167153a = i2 | 64;
        bynz4.f167160h = 201515033;
        boolean b = this.f21090b.mo12994b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz5 = (bynz) da.f164949b;
        bynz5.f167153a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bynz5.f167162j = b;
        boolean z3 = rrs.m34317a() != null;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz6 = (bynz) da.f164949b;
        bynz6.f167153a |= 2048;
        bynz6.f167165m = z3;
        rrs a2 = rrs.m34317a();
        if (a2 != null) {
            z = a2.mo25052b();
        } else {
            z = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz7 = (bynz) da.f164949b;
        bynz7.f167153a |= 4096;
        bynz7.f167166n = z;
        int i3 = Build.VERSION.SDK_INT;
        boolean hasSystemFeature = this.f21089a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz8 = (bynz) da.f164949b;
        bynz8.f167153a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        bynz8.f167169q = hasSystemFeature;
        boolean a3 = ifr.m15375a(this.f21092d.f21087a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz9 = (bynz) da.f164949b;
        bynz9.f167153a |= 8192;
        bynz9.f167167o = a3;
        ijc ijc = this.f21092d;
        if (((Boolean) igt.f20957g.mo58455c()).booleanValue()) {
            z2 = ifr.m15376b(ijc.f21087a);
        } else {
            z2 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz10 = (bynz) da.f164949b;
        bynz10.f167153a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bynz10.f167168p = z2;
        boolean f = sre.m36086f(this.f21089a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz11 = (bynz) da.f164949b;
        bynz11.f167153a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bynz11.f167170r = f;
        boolean hasSystemFeature2 = this.f21089a.getPackageManager().hasSystemFeature("org.chromium.arc");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz12 = (bynz) da.f164949b;
        int i4 = bynz12.f167153a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        bynz12.f167153a = i4;
        bynz12.f167171s = hasSystemFeature2;
        boolean z4 = a.f21093a;
        int i5 = i4 | 512;
        bynz12.f167153a = i5;
        bynz12.f167163k = z4;
        boolean z5 = a.f21094b;
        bynz12.f167153a = i5 | 1024;
        bynz12.f167164l = z5;
        if (!((Boolean) igt.f20945A.mo58455c()).booleanValue()) {
            str = Locale.getDefault().toString();
        } else {
            int i6 = Build.VERSION.SDK_INT;
            str = Locale.getDefault().toLanguageTag();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bynz bynz13 = (bynz) da.f164949b;
        str.getClass();
        bynz13.f167153a = 1 | bynz13.f167153a;
        bynz13.f167154b = str;
        Boolean b2 = mo13059b();
        if (b2 != null) {
            boolean booleanValue = b2.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bynz bynz14 = (bynz) da.f164949b;
            bynz14.f167153a |= 128;
            bynz14.f167161i = booleanValue;
        }
        return (bynz) da.mo74062i();
    }

    /* renamed from: b */
    public final Boolean mo13059b() {
        int i = Build.VERSION.SDK_INT;
        AppOpsManager appOpsManager = (AppOpsManager) this.f21089a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f21089a.getApplicationInfo();
        String packageName = this.f21089a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            boolean z = true;
            if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e) {
            f21088e.mo25415d("Exception while finding whether notifications are enabled for GmsCore", e, new Object[0]);
            return null;
        }
    }
}
