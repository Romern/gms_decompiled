package p000;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: vvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvh extends aaab {

    /* renamed from: a */
    private final rnt f50023a;

    /* renamed from: b */
    private final boolean f50024b;

    /* renamed from: c */
    private final int f50025c;

    public vvh(rnt rnt, int i, boolean z) {
        super(184, "StartDrivingModeSetupOperation");
        this.f50023a = rnt;
        this.f50024b = z;
        this.f50025c = i;
    }

    /* renamed from: b */
    public static final vrb m41455b(Context context) {
        return new vrb(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        vsj vsj = new vsj(context);
        try {
            vsi vsi = vsj.f49905a;
            z = true;
            if (vsi.f49901c.mo28887i()) {
                if (!ccra.m131314f()) {
                    if (this.f50024b) {
                        vsi.mo28786c(vuu.m41423a(this.f50025c));
                        z = false;
                    } else {
                        z = false;
                    }
                    vsj.close();
                    if (z) {
                        vsk vsk = new vsk();
                        vsk.f49906a = this.f50024b;
                        vsk.f49907b = this.f50025c;
                        Intent putExtra = new Intent().setComponent(vqx.m41082c()).putExtra("frx_immediate_start", vsk.f49906a).putExtra("client_trigger_reason", vsk.f49907b).putExtra("com.google.android.location.activity.DRIVING_MODE_NOTIFICATION", false);
                        putExtra.addFlags(268435456);
                        context.startActivity(putExtra);
                        m41455b(context).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_START_DRIVING_MODE_SETUP_SHOW_FRX);
                    }
                    m41455b(context).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_START_DRIVING_MODE_SETUP);
                    this.f50023a.mo11797a(Status.f30107a);
                }
            }
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        } catch (Throwable th) {
            try {
                vsj.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        vsj.close();
        if (z) {
        }
        m41455b(context).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_START_DRIVING_MODE_SETUP);
        this.f50023a.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f50023a.mo11797a(status);
    }
}
