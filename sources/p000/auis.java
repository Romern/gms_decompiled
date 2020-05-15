package p000;

import android.location.Location;
import android.util.Log;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: auis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auis implements bqfp {

    /* renamed from: a */
    final /* synthetic */ auit f91912a;

    public auis(auit auit) {
        this.f91912a = auit;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        List list = (List) obj;
        if (list.size() == 1) {
            this.f91912a.f91919h = 0;
            if (auho.m77070a()) {
                Log.d("Thunderbird", "constellation phone number verified");
            }
            String str = ((PhoneNumberInfo) list.get(0)).f30475b;
            List list2 = this.f91912a.f91916e;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                auiq auiq = (auiq) list2.get(i);
                if (auiq.f91900f < 4) {
                    EmergencyInfo emergencyInfo = auiq.f91899e;
                    if (emergencyInfo.f109087b.size() == 1) {
                        DeviceState deviceState = (DeviceState) emergencyInfo.f109087b.get(0);
                        if (deviceState.f109081e == null) {
                            auhk auhk = new auhk(deviceState);
                            auhk.f91818a = str;
                            auhk.f91819b = false;
                            emergencyInfo = new EmergencyInfo(emergencyInfo.f109086a, bngx.m109356a(auhk.mo50527a()));
                        }
                    }
                    auiq.f91899e = emergencyInfo;
                    auiq.mo50560b((Location) null);
                }
            }
            return;
        }
        this.f91912a.f91919h = 10;
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (!(th instanceof CancellationException) && !(th instanceof InterruptedException)) {
            Log.w("Thunderbird", "constellation failure", th);
            if (th instanceof rjp) {
                this.f91912a.f91919h = ((rjp) th).mo24655a();
                int i = this.f91912a.f91919h;
                if (i == 5001 || i == 5002 || i == 5005) {
                    return;
                }
            }
            auho.m77074b(this.f91912a.f91915d, th);
        }
    }
}
