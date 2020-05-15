package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.IOException;

/* renamed from: avlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlm extends avkc implements aaai {

    /* renamed from: a */
    private static final sek f93312a = avpq.m79015b("SystemUpdateApiStub");

    /* renamed from: b */
    private final avmx f93313b = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: c */
    private final aaag f93314c;

    /* renamed from: d */
    private final avmn f93315d = ((avmn) avmn.f93396b.mo51589b());

    /* renamed from: e */
    private final Context f93316e;

    public avlm(Context context, aaag aaag) {
        this.f93316e = context;
        this.f93314c = aaag;
    }

    /* renamed from: a */
    public final SystemUpdateStatus mo51315a() {
        f93312a.mo25409a("getSystemUpdateStatus()", new Object[0]);
        return this.f93313b.mo51414d();
    }

    /* renamed from: b */
    public final void mo51321b(avkj avkj) {
        f93312a.mo25409a("unregisterUpdateStatusCallback()", new Object[0]);
        avmx avmx = this.f93313b;
        synchronized (avmx.f93470i) {
            avmx.f93474m.remove(avkj.asBinder());
        }
    }

    /* renamed from: c */
    public final void mo51324c() {
        f93312a.mo25409a("pauseDownload()", new Object[0]);
        this.f93313b.mo51408b();
    }

    /* renamed from: d */
    public final void mo51325d() {
        f93312a.mo25409a("resetStatus()", new Object[0]);
        this.f93313b.mo51401a();
    }

    /* renamed from: e */
    public final void mo51326e() {
        f93312a.mo25409a("pauseAbInstallation()", new Object[0]);
        this.f93313b.mo51412c();
    }

    /* renamed from: f */
    public final void mo51327f() {
        f93312a.mo25409a("checkForUpdate()", new Object[0]);
        this.f93313b.mo51416f();
    }

    /* renamed from: g */
    public final boolean mo51328g() {
        f93312a.mo25409a("approveRebootTonight()", new Object[0]);
        try {
            this.f93313b.mo51411b(true);
            return true;
        } catch (IOException e) {
            f93312a.mo25417e("approveRebootTonight() failed.", e, new Object[0]);
            return false;
        }
    }

    /* renamed from: h */
    public final long mo51329h() {
        Context context;
        rex a;
        qfo qfo;
        f93312a.mo25409a("getLastConfigUpdateTime()", new Object[0]);
        if (cfrx.m142746b()) {
            return ((Long) this.f93315d.f93403d.mo51607b(avmn.f93395a)).longValue();
        }
        try {
            context = this.f93316e;
            sdo.m34973b("Calling this from your main thread can lead to deadlock.");
            a = qdf.m31914a(context);
            IBinder a2 = a.mo24567a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
                qfo = !(queryLocalInterface instanceof qfo) ? new qfm(a2) : (qfo) queryLocalInterface;
            } else {
                qfo = null;
            }
            long c = qfo.mo24014c();
            try {
                skh.m35531a().mo25689a(context, a);
            } catch (IllegalArgumentException e) {
                Log.i("CheckinServiceClient", "unbind failed: ", e);
            }
            return c;
        } catch (RemoteException e2) {
            Log.i("CheckinServiceClient", "GMS remote exception: ", e2);
            throw new IOException("Remote exception.");
        } catch (InterruptedException e3) {
            throw new IOException("Interrupted exception.");
        } catch (IOException | rfv | rfw e4) {
            f93312a.mo25417e("Error when getting last successful checkin time.", e4, new Object[0]);
            return -1;
        } catch (Throwable th) {
            try {
                skh.m35531a().mo25689a(context, a);
            } catch (IllegalArgumentException e5) {
                Log.i("CheckinServiceClient", "unbind failed: ", e5);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo51316a(avkj avkj) {
        f93312a.mo25409a("registerSystemUpdateCallback()", new Object[0]);
        avmx avmx = this.f93313b;
        synchronized (avmx.f93470i) {
            avmx.f93474m.put(avkj.asBinder(), avkj);
        }
    }

    /* renamed from: b */
    public final void mo51322b(DownloadOptions downloadOptions) {
        f93312a.mo25409a("resumeDownload(%s)", downloadOptions);
        this.f93313b.mo51409b(downloadOptions);
    }

    /* renamed from: a */
    public final void mo51317a(ActivityStatus activityStatus) {
        f93312a.mo25409a("setActivityStatus(%s)", activityStatus);
        this.f93313b.mo51404a(activityStatus);
    }

    /* renamed from: b */
    public final void mo51323b(InstallationOptions installationOptions) {
        f93312a.mo25409a("resumeAbInstallation(%s)", installationOptions);
        this.f93313b.mo51410b(installationOptions);
    }

    /* renamed from: a */
    public final void mo51318a(DownloadOptions downloadOptions) {
        f93312a.mo25409a("approveDownload(%s)", downloadOptions);
        this.f93313b.mo51405a(downloadOptions);
    }

    /* renamed from: a */
    public final void mo51319a(InstallationOptions installationOptions) {
        f93312a.mo25409a("approveReboot(%s)", installationOptions);
        this.f93313b.mo51406a(installationOptions);
    }

    /* renamed from: a */
    public final void mo51320a(rnt rnt, ConfigUpdateOptions configUpdateOptions) {
        f93312a.mo25409a("checkForConfigUpdate(%s)", configUpdateOptions);
        this.f93314c.mo16658a(new avln(rnt, configUpdateOptions));
    }
}
