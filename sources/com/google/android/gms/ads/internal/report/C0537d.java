package com.google.android.gms.ads.internal.report;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0405r;
import com.google.android.gms.ads.internal.util.client.C0626a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.C0637l;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.ads.internal.report.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0537d implements C0539f {

    /* renamed from: a */
    public static final Object f8567a = new Object();

    /* renamed from: b */
    public static C0539f f8568b = null;

    /* renamed from: c */
    static C0539f f8569c = null;

    /* renamed from: d */
    private final Object f8570d = new Object();

    /* renamed from: e */
    private final Context f8571e;

    /* renamed from: f */
    private final WeakHashMap f8572f = new WeakHashMap();

    /* renamed from: g */
    private final ExecutorService f8573g = adzl.f62962b.mo25874a();

    /* renamed from: h */
    private final VersionInfoParcel f8574h;

    public C0537d(Context context, VersionInfoParcel versionInfoParcel) {
        this.f8571e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8574h = versionInfoParcel;
    }

    /* renamed from: a */
    public static C0539f m5524a(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (f8567a) {
            if (f8569c == null) {
                if (!((Boolean) C0405r.f8361d.mo6621a()).booleanValue() || ((Boolean) C0371o.f8222aI.mo6604a()).booleanValue()) {
                    f8569c = new C0538e();
                } else {
                    C0537d dVar = new C0537d(context, versionInfoParcel);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (dVar.f8570d) {
                            dVar.f8572f.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new C0536c(dVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C0535b(dVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f8569c = dVar;
                }
            }
        }
        return f8569c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6711a(Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (C0626a.m5639b(stackTraceElement.getClassName())) {
                        z = true;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        z2 = true;
                    }
                }
            }
            if (z && !z2) {
                mo6712a(th, "");
            }
        }
    }

    /* renamed from: a */
    public final void mo6712a(Throwable th, String str) {
        mo6713a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo6713a(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (C0626a.m5637a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            bqye.m113760a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList arrayList = new ArrayList();
                try {
                    z = svr.m36484b(this.f8571e).mo26173a();
                } catch (Throwable th2) {
                    C0633h.m5669b("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f8571e.getPackageName();
                } catch (Throwable th3) {
                    C0633h.m5672d("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f8574h.f8949a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", C0371o.m5338a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "306758586").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", C0341h.m5277d()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(C0405r.f8359b.mo6621a())).toString());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f8573g.execute(new C0534a(new C0637l(null), (String) arrayList.get(i2)));
                }
            }
        }
    }
}
