package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: afzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afzi extends IntentOperation implements Response.ErrorListener, aehz {

    /* renamed from: a */
    public static final AtomicBoolean f65003a = new AtomicBoolean();

    /* renamed from: b */
    protected Semaphore f65004b;

    /* renamed from: c */
    public HandlerThread f65005c;

    /* renamed from: d */
    protected boolean f65006d = false;

    /* renamed from: e */
    protected rjx f65007e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35074a() {
        this.f65007e.mo24678a((aehz) this).mo50373a(new afzg(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35075a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35077a(cake cake, Location location, Response.Listener listener, Response.ErrorListener errorListener);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35079a(C1102je jeVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo35080b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo35081c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo35082d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo35083e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo35084f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo35085g();

    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("LocateService callbacks");
        this.f65005c = handlerThread;
        handlerThread.start();
        this.f65007e = aeie.m51878c(this);
    }

    public final void onDestroy() {
        HandlerThread handlerThread = this.f65005c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f65005c = null;
        }
        sex.m35104a(this).mo25444a("mdm.notification_persistent_location", 1);
        agaa a = agaa.m53787a();
        a.f65051a.clear();
        a.f65052b.set(null);
        f65003a.set(false);
    }

    public final void onErrorResponse(VolleyError volleyError) {
        agac.m53791a(volleyError, "Unable to send response", new Object[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afzi.a(java.lang.String, java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, java.lang.String, int]
     candidates:
      afzi.a(cake, android.location.Location, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener):void
      afzi.a(java.lang.String, java.lang.String, java.lang.String, boolean):void */
    public final void onHandleIntent(Intent intent) {
        try {
            if (!sre.m36080a(this)) {
                if (intent != null) {
                    mo35078a(getString(mo35082d()), getString(mo35083e()), "mdm.notification_persistent_location", true);
                    mo35075a(intent);
                } else {
                    intent = null;
                }
            }
        } finally {
            aseo.m73884b(this, intent);
            aaks.m21408a(this, intent);
        }
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        this.f65006d = true;
        agaa.m53787a().mo35128a(location);
        mo35077a(cake.SUCCESS, location, (Response.Listener) null, this);
        if (((double) location.getAccuracy()) < 25.0d) {
            int i = eoa.f15378a;
            mo35074a();
        }
    }

    /* renamed from: a */
    public final void mo35076a(cake cake) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            agac.m53794d("Don't call on the main thread", new Object[0]);
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        mo35077a(cake, (Location) null, newFuture, newFuture);
        try {
            newFuture.get();
        } catch (InterruptedException e) {
            agac.m53791a(e, "Unable to send response", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            agac.m53791a(e2, "Unable to send response", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35078a(String str, String str2, String str3, boolean z) {
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=device_manager_location")), 134217728);
        int a = qkj.m32287a(this, mo35084f());
        afzw.m53779b(this);
        int i = Build.VERSION.SDK_INT;
        C1102je jeVar = new C1102je(this, "find_my_device");
        if (z) {
            jeVar.mo13633b(true);
        } else {
            jeVar.mo13627a(true);
        }
        jeVar.mo13630b(a);
        jeVar.mo13640e(str);
        jeVar.mo13632b(str2);
        jeVar.f22254f = activity;
        jeVar.f22271w = C1133kh.m17843b(this, mo35085g());
        jeVar.f22269u = "recommendation";
        jeVar.f22272x = 1;
        C1101jd jdVar = new C1101jd();
        jdVar.mo13594b(str);
        jdVar.mo13593a(str2);
        jeVar.mo13626a(jdVar);
        mo35079a(jeVar);
        sex.m35104a(this).mo25445a(str3, 1, jeVar.mo13629b());
    }
}
