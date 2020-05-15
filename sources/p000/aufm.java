package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.thunderbird.EmergencyLocationChimeraService;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.ArrayList;

/* renamed from: aufm */
public final /* synthetic */ class aufm implements Runnable {

    /* renamed from: a */
    private final EmergencyLocationChimeraService f91696a;

    /* renamed from: b */
    private final int f91697b;

    /* renamed from: c */
    private final Intent f91698c;

    public aufm(EmergencyLocationChimeraService emergencyLocationChimeraService, int i, Intent intent) {
        this.f91696a = emergencyLocationChimeraService;
        this.f91697b = i;
        this.f91698c = intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011a  */
    public final void run() {
        char c;
        auit auit;
        int size;
        EmergencyLocationChimeraService emergencyLocationChimeraService = this.f91696a;
        int i = this.f91697b;
        Intent intent = this.f91698c;
        emergencyLocationChimeraService.f109055g = i;
        EmergencyInfo emergencyInfo = (EmergencyInfo) sef.m35067a(intent, "thunderbird.intent.extra.EMERGENCY_INFO", EmergencyInfo.CREATOR);
        if (emergencyInfo != null) {
            if (auho.m77070a()) {
                String valueOf = String.valueOf(emergencyInfo.f109087b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("associated device states: ");
                sb.append(valueOf);
                Log.d("Thunderbird", sb.toString());
            }
            ArrayList a = bnkn.m109663a(aufz.m77007a().mo50503a(emergencyLocationChimeraService, emergencyInfo));
            if (auho.m77070a()) {
                String valueOf2 = String.valueOf(emergencyInfo.f109086a);
                String valueOf3 = String.valueOf(a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 11 + String.valueOf(valueOf3).length());
                sb2.append("[");
                sb2.append(valueOf2);
                sb2.append("] matches ");
                sb2.append(valueOf3);
                Log.d("Thunderbird", sb2.toString());
            } else {
                String valueOf4 = String.valueOf(emergencyInfo.f109086a);
                int size2 = a.size();
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 32);
                sb3.append("[");
                sb3.append(valueOf4);
                sb3.append("] matches ");
                sb3.append(size2);
                sb3.append(" config(s)");
                Log.i("Thunderbird", sb3.toString());
            }
            String b = emergencyInfo.mo59538b();
            int hashCode = b.hashCode();
            if (hashCode != 82233) {
                if (hashCode == 2060894 && b.equals("CALL")) {
                    c = 0;
                    if (c == 0) {
                        auit = new auij(emergencyLocationChimeraService.f109051c, emergencyInfo, a);
                    } else if (c == 1) {
                        auit = new auiy(emergencyLocationChimeraService.f109051c, emergencyInfo, a);
                    } else {
                        throw new IllegalArgumentException(emergencyInfo.mo59538b());
                    }
                    ArrayList arrayList = emergencyLocationChimeraService.f109054f;
                    size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        auit auit2 = (auit) arrayList.get(i2);
                        if (auit2.mo50561bL().f109073c == auit.mo50561bL().f109073c) {
                            auit2.mo50570a(auit);
                        }
                    }
                    emergencyLocationChimeraService.f109054f.add(auit);
                    snl.m35700a(bqdx.m112673a(auit.mo50551a(), new aufn(emergencyLocationChimeraService), emergencyLocationChimeraService.f109051c.f91796a));
                }
            } else if (b.equals("SMS")) {
                c = 1;
                if (c == 0) {
                }
                ArrayList arrayList2 = emergencyLocationChimeraService.f109054f;
                size = arrayList2.size();
                while (i2 < size) {
                }
                emergencyLocationChimeraService.f109054f.add(auit);
                snl.m35700a(bqdx.m112673a(auit.mo50551a(), new aufn(emergencyLocationChimeraService), emergencyLocationChimeraService.f109051c.f91796a));
            }
            c = 65535;
            if (c == 0) {
            }
            ArrayList arrayList22 = emergencyLocationChimeraService.f109054f;
            size = arrayList22.size();
            while (i2 < size) {
            }
            emergencyLocationChimeraService.f109054f.add(auit);
            snl.m35700a(bqdx.m112673a(auit.mo50551a(), new aufn(emergencyLocationChimeraService), emergencyLocationChimeraService.f109051c.f91796a));
        } else if (emergencyLocationChimeraService.f109054f.isEmpty()) {
            emergencyLocationChimeraService.stopSelf(emergencyLocationChimeraService.f109055g);
        }
    }
}
