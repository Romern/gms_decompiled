package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ExecutorService;

/* renamed from: axtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axtl extends sbm {

    /* renamed from: a */
    public final ExecutorService f96315a;

    /* renamed from: b */
    private final axsb f96316b = new axsb();

    /* renamed from: c */
    private final axsb f96317c = new axsb();

    /* renamed from: d */
    private final axsb f96318d = new axsb();

    /* renamed from: e */
    private final axsb f96319e = new axsb();

    /* renamed from: f */
    private final axsb f96320f = new axsb();

    /* renamed from: g */
    private final axsb f96321g = new axsb();

    /* renamed from: h */
    private final axsb f96322h = new axsb();

    /* renamed from: i */
    private final axsb f96323i = new axsb();

    /* renamed from: j */
    private final axto f96324j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axtl(Context context, Looper looper, rjz rjz, rka rka, sat sat) {
        super(context, looper, 14, sat, rjz, rka);
        ExecutorService a = adzl.f62962b.mo25874a();
        axto a2 = axto.m83185a(context);
        sdo.m34959a(a);
        this.f96315a = a;
        this.f96324j = a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof axry) {
            return (axry) queryLocalInterface;
        }
        return new axrw(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 8600000;
    }

    /* renamed from: r */
    public final boolean mo25303r() {
        return !this.f96324j.mo53534a("com.google.android.wearable.app.cn");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo25306v() {
        return !this.f96324j.mo53534a("com.google.android.wearable.app.cn") ? "com.google.android.gms" : "com.google.android.wearable.app.cn";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
            Log.v("WearableClient", sb.toString());
        }
        if (i == 0) {
            this.f96316b.mo53510a(iBinder);
            this.f96317c.mo53510a(iBinder);
            this.f96318d.mo53510a(iBinder);
            this.f96319e.mo53510a(iBinder);
            this.f96320f.mo53510a(iBinder);
            this.f96321g.mo53510a(iBinder);
            this.f96322h.mo53510a(iBinder);
            this.f96323i.mo53510a(iBinder);
        }
        super.mo16780a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public final void mo53531a(rlf rlf, axot axot) {
        axsb axsb = this.f96320f;
        synchronized (axsb.f96291a) {
            axtn axtn = (axtn) axsb.f96291a.remove(axot);
            if (axtn != null) {
                axtn.mo53533a();
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(axot);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("service.removeListener: ");
                    sb.append(valueOf);
                    Log.v("WearableClient", sb.toString());
                }
                ((axry) mo25289B()).mo53473a(new axsa(axsb.f96291a, axot, rlf), new RemoveListenerRequest(axtn));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(axot);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                sb2.append("remove Listener unknown: ");
                sb2.append(valueOf2);
                Log.v("WearableClient", sb2.toString());
            }
            rlf.mo9482a((Object) new Status(4002));
        }
    }

    /* renamed from: a */
    public final void mo53532a(rlf rlf, axot axot, rod rod, IntentFilter[] intentFilterArr) {
        axsb axsb = this.f96320f;
        axtn axtn = new axtn(intentFilterArr);
        sdo.m34959a(rod);
        axtn.f96326a = rod;
        synchronized (axsb.f96291a) {
            if (axsb.f96291a.get(axot) == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(axot);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                    sb.append("new listener: ");
                    sb.append(valueOf);
                    Log.v("WearableClient", sb.toString());
                }
                axsb.f96291a.put(axot, axtn);
                try {
                    ((axry) mo25289B()).mo53471a(new axrz(axsb.f96291a, axot, rlf), new AddListenerRequest(axtn));
                } catch (RemoteException e) {
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf2 = String.valueOf(axot);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                        sb2.append("addListener failed, removing listener: ");
                        sb2.append(valueOf2);
                        Log.d("WearableClient", sb2.toString());
                    }
                    axsb.f96291a.remove(axot);
                    throw e;
                }
            } else {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf3 = String.valueOf(axot);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                    sb3.append("duplicate listener: ");
                    sb3.append(valueOf3);
                    Log.v("WearableClient", sb3.toString());
                }
                rlf.mo9482a((Object) new Status(4001));
            }
        }
    }

    /* renamed from: a */
    public final void mo25296a(sag sag) {
        int i;
        if (!mo25303r()) {
            try {
                Bundle bundle = this.f43948r.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i = 0;
                }
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(82);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    Log.w("WearableClient", sb.toString());
                    Context context = this.f43948r;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    mo25297a(sag, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (PackageManager.NameNotFoundException e) {
                mo25297a(sag, 16, (PendingIntent) null);
                return;
            }
        }
        super.mo25296a(sag);
    }
}
