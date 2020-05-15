package p000;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: jgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jgy extends aeaa {

    /* renamed from: a */
    final /* synthetic */ jhb f22458a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jgy(jhb jhb, String str) {
        super(str);
        this.f22458a = jhb;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        sek sek = jhb.f22465a;
        String valueOf = String.valueOf(componentName.toShortString());
        sek.mo25412b(valueOf.length() == 0 ? new String("onServiceDisconnected ") : "onServiceDisconnected ".concat(valueOf), new Object[0]);
        this.f22458a.f22472g = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        eml eml;
        sek sek = jhb.f22465a;
        String valueOf = String.valueOf(componentName.toShortString());
        sek.mo25412b(valueOf.length() == 0 ? new String("onServiceConnected ") : "onServiceConnected ".concat(valueOf), new Object[0]);
        jhb jhb = this.f22458a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            eml = queryLocalInterface instanceof eml ? (eml) queryLocalInterface : new eml(iBinder);
        } else {
            eml = null;
        }
        jhb.f22472g = eml;
        try {
            jhb jhb2 = this.f22458a;
            Bundle bundle = new Bundle();
            bundle.putInt("network_type", 1);
            bundle.putBoolean("charging", false);
            bundle.putBoolean("idle", false);
            Bundle a = jhb2.f22472g.mo10276a(jhb2.getContext().getPackageName(), jhb2.f22470e, bundle);
            int i = a.getInt("status_code", -4);
            int i2 = -3;
            if (i == -4) {
                Bundle bundle2 = a.getBundle("error");
                String string = bundle2.getString("reason");
                String string2 = bundle2.getString("exception_type");
                sek sek2 = jhb.f22465a;
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 91 + String.valueOf(string2).length());
                sb.append("starting DPC installation failed with STATUS_CODE_REQUEST_FAILED reason = ");
                sb.append(string);
                sb.append(" exceptionType = ");
                sb.append(string2);
                sek2.mo25418e(sb.toString(), new Object[0]);
                if ("transient".equals(string)) {
                    i2 = -2;
                }
                jhb2.mo13730a(Integer.valueOf(i2));
            } else if (i == -3) {
                sek sek3 = jhb.f22465a;
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("starting DPC installation failed with status code ");
                sb2.append(i);
                sek3.mo25418e(sb2.toString(), new Object[0]);
                if (((Long) spn.f44933b.mo25081c()).longValue() == 0) {
                    i2 = -2;
                }
                jhb2.mo13730a(Integer.valueOf(i2));
            } else if (i == -2 || i == -1) {
                sek sek4 = jhb.f22465a;
                StringBuilder sb3 = new StringBuilder(61);
                sb3.append("starting DPC installation failed with status code ");
                sb3.append(i);
                sek4.mo25418e(sb3.toString(), new Object[0]);
                jhb2.mo13730a(-3);
            } else if (i != 0) {
                sek sek5 = jhb.f22465a;
                StringBuilder sb4 = new StringBuilder(77);
                sb4.append("Unknown status code ");
                sb4.append(i);
                sb4.append(" returned by PlayInstallService#installPackage");
                sek5.mo25418e(sb4.toString(), new Object[0]);
                jhb2.mo13730a(-2);
            } else {
                jhb.f22465a.mo25412b("DPC installation successfully requested", new Object[0]);
            }
        } catch (RemoteException e) {
            jhb.f22465a.mo25417e("DPC installation failed - couldn't connect to the install service", e, new Object[0]);
            this.f22458a.mo13730a(-2);
        }
    }
}
