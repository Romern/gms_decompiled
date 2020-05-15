package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: adki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adki extends sji {

    /* renamed from: a */
    private static final adfs f62019a = new adfs("GetLaunchDataOperation");

    /* renamed from: d */
    private final adfd f62020d;

    /* renamed from: e */
    private final adgc f62021e;

    /* renamed from: f */
    private final adkd f62022f;

    /* renamed from: g */
    private final adkn f62023g;

    /* renamed from: h */
    private final String f62024h;

    /* renamed from: i */
    private final adjx f62025i;

    /* renamed from: j */
    private final String f62026j;

    /* renamed from: k */
    private final int f62027k;

    /* renamed from: l */
    private final adik f62028l;

    public adki(adfd adfd, adgc adgc, adkd adkd, adkn adkn, String str, adjx adjx, String str2, int i, adik adik) {
        super(121, "GetLaunchDataOperation");
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        this.f62020d = adfd;
        this.f62021e = adgc;
        this.f62022f = adkd;
        this.f62023g = adkn;
        this.f62024h = str;
        this.f62025i = adjx;
        this.f62026j = str2;
        this.f62027k = i;
        this.f62028l = adik;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        String str;
        String str2;
        Status status;
        Intent intent;
        BitmapTeleporter bitmapTeleporter;
        adfd adfd = this.f62020d;
        adfd.mo33414a(this.f62026j, 0);
        adfb a = adfd.mo33411a();
        adkz adkz = new adkz();
        RoutingOptions routingOptions = new RoutingOptions();
        routingOptions.f79196a = true;
        adke a2 = this.f62022f.mo33597a(this.f62024h, true, routingOptions, adkz, false);
        int i = a2.f61993a;
        LaunchData launchData = null;
        if (a2.f61996d == 3) {
            str = "User prefers browser";
            str2 = "GetLaunchDataOperation.UserPrefersBrowser";
        } else if (i == 1) {
            str = "User not opted in";
            str2 = "GetLaunchDataOperation.DestinationOptIn";
        } else if (i == 0) {
            str = "Not an instant app";
            str2 = "GetLaunchDataOperation.DestinationNotInstantApp";
        } else if (i == 4) {
            str = "Runtime not available";
            str2 = "GetLaunchDataOperation.SupervisorNotAvailable";
        } else if (i == 3) {
            str = "Need to restore runtime";
            str2 = "GetLaunchDataOperation.WillNotReinstallSupervisor";
        } else if (i != 2) {
            str = null;
            str2 = null;
        } else {
            try {
                if (this.f62027k == 0) {
                    intent = adfo.m50309a(this.f62024h, this.f62026j, System.currentTimeMillis());
                } else {
                    intent = adfo.m50308a(this.f62024h);
                }
                this.f62025i.mo33594a(intent);
                if (this.f62023g.mo33600a() != null) {
                    AppInfo appInfo = a2.f61994b;
                    if (appInfo != null) {
                        Bitmap e = this.f62028l.mo33537e(appInfo.f79142a);
                        if (e != null) {
                            bitmapTeleporter = new BitmapTeleporter(e);
                            bitmapTeleporter.mo17760a(context.getCacheDir());
                        } else {
                            bitmapTeleporter = null;
                        }
                        LaunchData launchData2 = new LaunchData(intent, appInfo.f79142a, appInfo.f79143b, bitmapTeleporter);
                        str2 = null;
                        launchData = launchData2;
                        str = null;
                    } else {
                        throw new adfn("Missing app info");
                    }
                } else {
                    throw new adfn("Missing opt in account");
                }
            } catch (adjw e2) {
                throw new adfn(e2);
            } catch (adfn e3) {
                f62019a.mo33424a(e3);
                str = null;
                str2 = null;
            }
        }
        if (launchData != null) {
            status = Status.f30107a;
            str2 = "GetLaunchDataOperation.IntentReturned";
        } else if (str == null) {
            status = Status.f30109c;
            str2 = "GetLaunchDataOperation.ERROR";
        } else {
            status = new Status(19500, str);
        }
        adkh adkh = new adkh(status, launchData, str2);
        this.f62021e.mo33444a(adkh.f62016a, adkh.f62017b);
        a.mo33409a(adkh.f62018c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f62021e.mo33444a(Status.f30109c, (LaunchData) null);
    }
}
