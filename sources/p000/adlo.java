package p000;

import android.content.ComponentName;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.chimera.Activity;
import java.util.Locale;

/* renamed from: adlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adlo extends aeaa {

    /* renamed from: a */
    final /* synthetic */ adlp f62122a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adlo(adlp adlp, String str) {
        super(str);
        this.f62122a = adlp;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        adfs adfs = adlp.f62123a;
        new Object[1][0] = componentName;
        this.f62122a.f62126c = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        eml eml;
        adfs adfs = adlp.f62123a;
        new Object[1][0] = componentName;
        adlp adlp = this.f62122a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            eml = queryLocalInterface instanceof eml ? (eml) queryLocalInterface : new eml(iBinder);
        } else {
            eml = null;
        }
        adlp.f62126c = eml;
        try {
            adlp adlp2 = this.f62122a;
            if (adlp2.f62126c != null) {
                Activity activity = adlp2.getActivity();
                if (activity != null) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        adlp2.mo33637a("InstallSupervisorFragment.Offline");
                        throw new RemoteException("Will not request install without Internet connection.");
                    }
                    String packageName = activity.getPackageName();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("show_completion", false);
                    Bundle a = adlp2.f62126c.mo10276a(packageName, "com.google.android.instantapps.supervisor", bundle);
                    if (a != null) {
                        int i = a.getInt("status_code", -4);
                        if (i != 0) {
                            String format = String.format(Locale.US, "The failure status_code: %d", Integer.valueOf(i));
                            Bundle bundle2 = a.getBundle("error");
                            if (bundle2 != null) {
                                String string = bundle2.getString("reason", "");
                                String string2 = bundle2.getString("exception_type", "");
                                String valueOf = String.valueOf(format);
                                String valueOf2 = String.valueOf(String.format(" Failure reason: %s, failure exception: %s", string, string2));
                                format = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                            }
                            throw new RemoteException(format);
                        }
                        adlp2.f62125b = true;
                        adlp2.mo33637a("InstallSupervisorFragment.InstallRequested");
                        return;
                    }
                    throw new RemoteException("Received null result from PlayInstallService");
                }
                throw new RemoteException("onServiceConnected without context");
            }
            throw new RemoteException("IPlayInstallService.Stub.asInterface returned null");
        } catch (RemoteException e) {
            adlp.f62123a.mo33424a(e);
            this.f62122a.mo33635a();
        }
    }
}
