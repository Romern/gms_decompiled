package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import java.util.Map;

/* renamed from: arwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwk {

    /* renamed from: a */
    private static final Logger f88360a = ascp.m73787a("Setup", "Accounts", "Utils", "DeviceRiskSignalsUtils");

    /* renamed from: b */
    private final Context f88361b;

    /* renamed from: c */
    private final vvq f88362c;

    /* renamed from: d */
    private final Map f88363d;

    /* renamed from: e */
    private final boolean f88364e;

    public arwk(Context context, vvq vvq, Map map, boolean z) {
        bmxy.m108582a(context, "context cannot be null.");
        this.f88361b = context;
        bmxy.m108582a(vvq, "droidGuardHandle cannot be null");
        this.f88362c = vvq;
        bmxy.m108582a(map, "droidGuardArgs cannot be null");
        this.f88363d = map;
        this.f88364e = z;
    }

    /* renamed from: a */
    public final DeviceRiskSignals mo48875a() {
        long j;
        long j2;
        iyv iyv;
        long j3;
        long a = spn.getAndroidId(this.f88361b);
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        boolean a2 = ascb.m73766a(this.f88361b);
        int i2 = !a2 ? 1 : 10;
        boolean z = this.f88364e;
        if (a2) {
            rex rex = new rex();
            try {
                skh.m35531a().mo25690a(this.f88361b, new Intent().setClassName(this.f88361b, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), rex, 1);
                IBinder a3 = rex.mo24567a();
                if (a3 != null) {
                    IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                    iyv = !(queryLocalInterface instanceof iyv) ? new iyt(a3) : (iyv) queryLocalInterface;
                } else {
                    iyv = null;
                }
                long a4 = iyv.mo13498a();
                long c = iyv.mo13499c();
                if (a4 != -1) {
                    j3 = SystemClock.elapsedRealtime() - a4;
                } else {
                    j3 = -1;
                }
                long j4 = -1;
                if (c != -1) {
                    j4 = c;
                }
                skh.m35531a().mo25689a(this.f88361b, rex);
                j = j3;
                j2 = j4;
            } catch (RemoteException | InterruptedException e) {
                f88360a.mo25415d("Could not get device signals. Setting to insecure.", e, new Object[0]);
                skh.m35531a().mo25689a(this.f88361b, rex);
                j2 = -1;
                j = -1;
            } catch (Throwable th) {
                skh.m35531a().mo25689a(this.f88361b, rex);
                throw th;
            }
        } else {
            j2 = -1;
            j = -1;
        }
        Logger Logger = f88360a;
        StringBuilder sb = new StringBuilder(50);
        sb.append("elapsedTimeSinceUnlockMillis: ");
        sb.append(j);
        Logger.mo25412b(sb.toString(), new Object[0]);
        Logger logger2 = f88360a;
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("screenlockSettingsAgeMillis: ");
        sb2.append(j2);
        logger2.mo25412b(sb2.toString(), new Object[0]);
        return new DeviceRiskSignals(a, str, str2, (long) i, new ScreenlockState(a2, i2, j2, j, z), new StarguardData(this.f88362c.mo28905a(this.f88363d)));
    }
}
