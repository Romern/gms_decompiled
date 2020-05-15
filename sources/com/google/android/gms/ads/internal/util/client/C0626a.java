package com.google.android.gms.ads.internal.util.client;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.doubleclick.C0239a;
import com.google.android.gms.ads.doubleclick.C0240b;
import com.google.android.gms.ads.internal.flag.C0405r;
import com.google.android.gms.ads.search.C0875a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.ads.internal.util.client.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0626a {

    /* renamed from: a */
    private float f8954a = -1.0f;

    static {
        new adzt(Looper.getMainLooper());
        fho.class.getName();
        fij.class.getName();
        C0239a.class.getName();
        C0240b.class.getName();
        C0875a.class.getName();
        fhm.class.getName();
    }

    /* renamed from: a */
    public static String m5636a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, instance.digest()));
            } catch (NoSuchAlgorithmException e) {
                i++;
            } catch (ArithmeticException e2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m5638b() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    /* renamed from: c */
    public final boolean mo6808c(Context context) {
        return rfj.f42872d.mo24590b(context) == 0;
    }

    /* renamed from: a */
    public static Throwable m5637a(Throwable th) {
        if (!((Boolean) C0405r.f8362e.mo6621a()).booleanValue()) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            th = null;
            while (!linkedList.isEmpty()) {
                Throwable th2 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th2.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th2.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (m5639b(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z) {
                    if (th != null) {
                        th = new Throwable(th2.getMessage(), th);
                    } else {
                        th = new Throwable(th2.getMessage());
                    }
                    th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        return th;
    }

    /* renamed from: b */
    public static boolean m5639b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith((String) C0405r.f8360c.mo6621a());
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6807b(Context context) {
        return mo6808c(context);
    }

    /* renamed from: a */
    public final int mo6803a(Context context, int i) {
        if (this.f8954a < 0.0f) {
            synchronized (this) {
                if (this.f8954a < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f8954a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f8954a);
    }

    /* renamed from: a */
    public final int mo6804a(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    public final String mo6805a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            return Settings.Secure.getString(contentResolver, "android_id");
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo6806a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
