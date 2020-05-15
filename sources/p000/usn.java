package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.DisconnectRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: usn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class usn extends sbm {

    /* renamed from: g */
    public static final /* synthetic */ int f48600g = 0;

    /* renamed from: a */
    public volatile DriveId f48601a;

    /* renamed from: b */
    public volatile boolean f48602b = false;

    /* renamed from: c */
    final Map f48603c = new HashMap();

    /* renamed from: d */
    final Map f48604d = new HashMap();

    /* renamed from: e */
    final Map f48605e = new HashMap();

    /* renamed from: f */
    final Map f48606f = new HashMap();

    /* renamed from: h */
    private final String f48607h;

    /* renamed from: i */
    private final Bundle f48608i;

    /* renamed from: j */
    private volatile DriveId f48609j;

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        if (queryLocalInterface instanceof utl) {
            return (utl) queryLocalInterface;
        }
        return new utj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        String packageName = this.f43948r.getPackageName();
        sdo.m34959a((Object) packageName);
        sdo.m34970a(!this.f44003H.f43965c.isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.f48607h)) {
            bundle.putString("proxy_package_name", this.f48607h);
        }
        bundle.putAll(this.f48608i);
        return bundle;
    }

    /* renamed from: g */
    public final boolean mo12787g() {
        return !this.f43948r.getPackageName().equals(this.f48607h) || !str.m36310a(this.f43948r, Process.myUid());
    }

    /* renamed from: j */
    public final void mo14032j() {
        if (mo25301p()) {
            try {
                ((utl) mo25289B()).mo27126a(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.mo14032j();
        synchronized (this.f48603c) {
            this.f48603c.clear();
        }
        synchronized (this.f48604d) {
            this.f48604d.clear();
        }
        synchronized (this.f48605e) {
            this.f48605e.clear();
        }
        synchronized (this.f48606f) {
            this.f48606f.clear();
        }
    }

    /* renamed from: n */
    public final utl mo27951n() {
        return (utl) mo25289B();
    }

    public usn(Context context, Looper looper, sat sat, rjz rjz, rka rka, Bundle bundle) {
        super(context, looper, 11, sat, rjz, rka);
        this.f48607h = sat.f43967e;
        this.f48608i = bundle;
        Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        int size = queryIntentServices.size();
        if (size == 0) {
            return;
        }
        if (size == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (!serviceInfo.exported) {
                String str = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
                sb.append("Drive event service ");
                sb.append(str);
                sb.append(" must be exported in AndroidManifest.xml");
                throw new IllegalStateException(sb.toString());
            }
            return;
        }
        String action = intent.getAction();
        StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 72);
        sb2.append("AndroidManifest.xml can only define one service that handles the ");
        sb2.append(action);
        sb2.append(" action");
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f48601a = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.f48609j = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.f48602b = true;
        }
        super.mo16780a(i, iBinder, bundle, i2);
    }
}
