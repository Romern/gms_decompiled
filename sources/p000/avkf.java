package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ChimeraSystemUpdateService;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;

/* renamed from: avkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avkf extends dck implements avkg {

    /* renamed from: a */
    final /* synthetic */ ChimeraSystemUpdateService f93289a;

    /* renamed from: b */
    private final Context f93290b;

    public avkf() {
        super("com.google.android.gms.update.ISystemUpdateService");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo51330a() {
        if ((Binder.getCallingUid() != Process.myUid() || Binder.getCallingPid() != Process.myPid()) && !rfz.m33557a(this.f93289a).mo24608b(Binder.getCallingUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo51331b() {
        if (mo51330a()) {
            return ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109461c;
        }
        Log.w("SystemUpdateServiceImpl", "getStatus failed: Binder does not have the permission.");
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avkf(ChimeraSystemUpdateService chimeraSystemUpdateService, Context context) {
        super("com.google.android.gms.update.ISystemUpdateService");
        this.f93289a = chimeraSystemUpdateService;
        this.f93290b = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        long j;
        int i2 = -1;
        boolean z = false;
        switch (i) {
            case 2:
                int b = mo51331b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            case 3:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "whenIsMobileDownloadAllowed failed:Binder does not have the permission.");
                    j = -1;
                } else {
                    j = ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109472n + avlt.m78746a(this.f93290b);
                }
                parcel2.writeNoException();
                parcel2.writeLong(j);
                break;
            case 4:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getDownloadPercent failed: Binder does not have the permission.");
                } else {
                    double d = ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109464f;
                    if (d >= 0.0d) {
                        i2 = (int) (d * 100.0d);
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case 5:
                boolean a = dcl.m8167a(parcel);
                Log.i("SystemUpdateServiceImpl", "approveDownload");
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "approveDownload failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51405a(new DownloadOptions(a, false));
                }
                parcel2.writeNoException();
                break;
            case 6:
                boolean a2 = dcl.m8167a(parcel);
                Log.i("SystemUpdateServiceImpl", "approveInstall");
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "approveInstall failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51406a(new InstallationOptions(a2, false, false, false));
                }
                parcel2.writeNoException();
                break;
            case 7:
                Log.i("SystemUpdateServiceImpl", "getUrgency");
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getUrgency failed: Binder does not have the permission.");
                } else {
                    i2 = ChimeraSystemUpdateService.m93686a(this.f93290b);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case 8:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsActivityUp failed: Binder does not have the permission.");
                } else {
                    z = ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109476r.f109420a;
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, z);
                break;
            case 9:
                boolean a3 = dcl.m8167a(parcel);
                StringBuilder sb = new StringBuilder(21);
                sb.append("setIsActivityUp:");
                sb.append(a3);
                Log.i("SystemUpdateServiceImpl", sb.toString());
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "setIsActivityUp failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51404a(new ActivityStatus(a3, false));
                }
                parcel2.writeNoException();
                break;
            case 10:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getOtaBeingManagedByPolicy failed: Binder does not have the permission.");
                } else {
                    if (avmb.m78775a(this.f93290b, ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109472n).f93369a != 0) {
                        z = true;
                    }
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("getOtaBeingManagedByPolicy:");
                    sb2.append(z);
                    Log.i("SystemUpdateServiceImpl", sb2.toString());
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, z);
                break;
            case 11:
                Log.i("SystemUpdateServiceImpl", "rebootNow");
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "rebootNow failed: Binder does not have the permission.");
                } else if (mo51331b() == 528) {
                    ((PowerManager) this.f93290b.getSystemService("power")).reboot("rebootScheduledUpdate");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51406a(new InstallationOptions(false, false, false, false));
                }
                parcel2.writeNoException();
                break;
            case 12:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getBatteryState failed: Binder does not have the permission.");
                } else {
                    if (avls.m78735b(this.f93290b)) {
                        i2 = ((long) avls.m78736c(this.f93290b)) < ((Long) avlw.f93342c.mo51364a()).longValue() ? 1 : 0;
                    } else {
                        i2 = ((long) avls.m78736c(this.f93290b)) < ((Long) avlw.f93341b.mo51364a()).longValue() ? 2 : 0;
                    }
                    StringBuilder sb3 = new StringBuilder(28);
                    sb3.append("getBatteryState: ");
                    sb3.append(i2);
                    sb3.toString();
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case 13:
            default:
                return false;
            case 14:
                Log.i("SystemUpdateServiceImpl", "pauseDownload");
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "pauseDownload failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51408b();
                }
                parcel2.writeNoException();
                break;
            case 15:
                boolean a4 = dcl.m8167a(parcel);
                StringBuilder sb4 = new StringBuilder(20);
                sb4.append("resumeDownload:");
                sb4.append(a4);
                Log.i("SystemUpdateServiceImpl", sb4.toString());
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "resumeDownload failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51409b(new DownloadOptions(a4, false));
                }
                parcel2.writeNoException();
                break;
            case 16:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsAutoPauseDisabled failed: Binder does not have the permission.");
                } else {
                    z = ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109465g.f109446a;
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, z);
                break;
            case 17:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsStreaming failed: Binder does not have the permission.");
                } else {
                    z = ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109471m;
                }
                parcel2.writeNoException();
                dcl.m8166a(parcel2, z);
                break;
            case 18:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "resetUpdate failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51401a();
                }
                parcel2.writeNoException();
                break;
            case 19:
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsStreaming failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51412c();
                }
                parcel2.writeNoException();
                break;
            case 20:
                boolean a5 = dcl.m8167a(parcel);
                if (!mo51330a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsStreaming failed: Binder does not have the permission.");
                } else {
                    ((avmx) avmx.f93453h.mo51589b()).mo51410b(new InstallationOptions(a5, false, false, false));
                }
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
