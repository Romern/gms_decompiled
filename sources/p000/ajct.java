package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;

/* renamed from: ajct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajct extends sbm {

    /* renamed from: a */
    public final ajea f70358a = new ajea();

    /* renamed from: b */
    public final ClientAppContext f70359b;

    /* renamed from: c */
    private final int f70360c;

    /* renamed from: a */
    static int m58517a(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (!(context instanceof Application)) {
            return context instanceof Service ? 3 : 0;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo38503c(int i) {
        if (mo25301p()) {
            ((ajcj) mo25289B()).mo38483a(new HandleClientLifecycleEventRequest(1, null, i));
        }
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle f = super.mo12238f();
        f.putInt("NearbyPermissions", this.f70360c);
        f.putParcelable("ClientAppContext", this.f70359b);
        return f;
    }

    /* renamed from: j */
    public final void mo14032j() {
        try {
            mo38503c(2);
        } catch (RemoteException e) {
        }
        this.f70358a.f70409a.clear();
        super.mo14032j();
    }

    /* renamed from: r */
    public final boolean mo25303r() {
        return ahcb.m55443d(this.f43948r);
    }

    public ajct(Context context, Looper looper, rjz rjz, rka rka, sat sat, aixi aixi) {
        super(context, looper, 62, sat, rjz, rka);
        String str = sat.f43967e;
        int a = m58517a(context);
        if (aixi != null) {
            this.f70359b = new ClientAppContext(str, aixi.f69980a, aixi.f69981b, a);
            this.f70360c = aixi.f69982c;
        } else {
            this.f70359b = new ClientAppContext(str, null, false, a);
            this.f70360c = -1;
        }
        if (a == 1) {
            int i = Build.VERSION.SDK_INT;
            Activity activity = (Activity) context;
            activity.getApplication().registerActivityLifecycleCallbacks(new ajcs(activity, this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (queryLocalInterface instanceof ajcj) {
            return (ajcj) queryLocalInterface;
        }
        return new ajch(iBinder);
    }
}
