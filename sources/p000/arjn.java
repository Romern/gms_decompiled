package p000;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: arjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arjn extends adzt {

    /* renamed from: a */
    final /* synthetic */ arip f87797a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arjn(arip arip, Looper looper) {
        super(looper);
        this.f87797a = arip;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i != 0) {
                int i2 = 1;
                if (i == 1) {
                    arar arar = this.f87797a.f87782a;
                    ((arla) arar).f87838b.mo48364n("source-bootstrap-api");
                    arar arar2 = ((arla) arar).f87837a;
                    arxy.f88430a.mo25409a("Target disconnected", new Object[0]);
                    ((arxk) arar2).f88410a.f88431b.mo48909d();
                } else if (i == 2) {
                    ((arxk) ((arla) this.f87797a.f87782a).f87837a).f88410a.f88431b.mo48905a((String) message.obj);
                } else if (i == 3) {
                    arar arar3 = this.f87797a.f87782a;
                    int intValue = ((Integer) message.obj).intValue();
                    ((arla) arar3).f87838b.mo48364n("source-bootstrap-api");
                    arar arar4 = ((arla) arar3).f87837a;
                    sek sek = arxy.f88430a;
                    String valueOf = String.valueOf(araj.m72321a(intValue));
                    sek.mo25418e(valueOf.length() == 0 ? new String("Bootstrap error: ") : "Bootstrap error: ".concat(valueOf), new Object[0]);
                    if (intValue == 10557 || intValue == 10584) {
                        i2 = 3;
                    } else if (intValue == 10595) {
                        i2 = 8;
                    }
                    ((arxk) arar4).f88410a.f88431b.mo48908c(i2);
                } else if (i == 4) {
                    ((arxk) ((arla) this.f87797a.f87782a).f87837a).f88410a.f88431b.mo48904a((VerificationInfo) message.obj);
                } else {
                    int i3 = message.what;
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unrecognized message: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                arar arar5 = ((arla) this.f87797a.f87782a).f87837a;
                ((arxk) arar5).f88410a.f88436g = (BootstrapOptions) message.obj;
                if (!cgpa.m146406g() && ((arxk) arar5).f88410a.f88436g.mo59056c()) {
                    Activity activity = ((arxk) arar5).f88410a.getActivity();
                    if (activity == null) {
                        arxy.f88430a.mo25416d("no activity", new Object[0]);
                        return;
                    } else if (asbs.m73758a(activity).mo33916a("com.google").length == 0) {
                        ((arxk) arar5).f88410a.f88431b.mo48908c(7);
                        return;
                    }
                }
                ((arxk) arar5).f88410a.f88431b.mo48907c();
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
