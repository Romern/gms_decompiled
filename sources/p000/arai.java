package p000;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/* renamed from: arai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arai {

    /* renamed from: a */
    public final Context f87197a;

    /* renamed from: b */
    public final Handler f87198b;

    /* renamed from: c */
    public final Object f87199c;

    /* renamed from: d */
    public final argv f87200d;

    /* renamed from: e */
    public final String f87201e;

    /* renamed from: f */
    public final aqxl f87202f;

    public arai(Context context, Handler handler, Object obj, argv argv) {
        this(context, handler, obj, argv, null);
    }

    /* renamed from: a */
    public static aqxl m72320a(Context context) {
        Application application;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        return new aqxl(snp.m35703a(1, 10), new beof(applicationContext, "STREAMZ_SMARTDEVICE"), application, "gmscore_smartdevice");
    }

    public arai(Context context, Handler handler, Object obj, argv argv, String str) {
        this.f87197a = context;
        this.f87198b = handler;
        this.f87199c = obj;
        this.f87200d = argv;
        this.f87201e = str;
        this.f87202f = m72320a(context);
    }
}
