package p000;

import android.location.Location;
import android.util.Log;
import com.google.android.gms.trustlet.place.internal.GeofenceLogsChimeraService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: auww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auww extends soa {

    /* renamed from: a */
    final List f92672a = new ArrayList();

    /* renamed from: b */
    final /* synthetic */ Location f92673b;

    /* renamed from: c */
    final /* synthetic */ Set f92674c;

    /* renamed from: d */
    final /* synthetic */ GeofenceLogsChimeraService f92675d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auww(GeofenceLogsChimeraService geofenceLogsChimeraService, Location location, Set set) {
        super(10);
        this.f92675d = geofenceLogsChimeraService;
        this.f92673b = location;
        this.f92674c = set;
    }

    /* JADX WARN: Type inference failed for: r11v0, assign insn: 0x005a: CONST  (r11v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int], assign insn: PHI: (r11v1 ?) = (r11v0 ?), (r11v2 ?) binds: [B:14:0x0095, B:34:0x0190] */
    /* JADX WARN: Type inference failed for: r11v2, assign insn: 0x0196: CONST  (r11v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    public final void run() {
        float[] fArr;
        aeli aeli;
        boolean z;
        ArrayList arrayList = new ArrayList();
        float[] fArr2 = new float[2];
        if (Log.isLoggable("Coffee-GeofenceService", 4)) {
            double latitude = this.f92673b.getLatitude();
            double longitude = this.f92673b.getLongitude();
            float accuracy = this.f92673b.getAccuracy();
            StringBuilder sb = new StringBuilder(115);
            sb.append("GeofenceLogService: Current Location: ");
            sb.append(latitude);
            sb.append(", ");
            sb.append(longitude);
            sb.append(", Accuracy: ");
            sb.append(accuracy);
            Log.i("Coffee-GeofenceService", sb.toString());
        }
        int i = 1;
        ? r11 = 0;
        if (((Boolean) this.f92675d.f109271d.mo6606a()).booleanValue()) {
            auza auza = new auza(this.f92675d.getApplicationContext());
            int i2 = 0;
            for (String str : this.f92674c) {
                i2++;
                if (i2 >= this.f92674c.size()) {
                    z = true;
                } else {
                    z = false;
                }
                auza.mo51070a(str, Boolean.valueOf(z), new auwt(this));
            }
            return;
        }
        for (String str2 : this.f92674c) {
            rjo rjo = aema.f63501a;
            rkb rkb = this.f92675d.f109268a;
            String[] strArr = new String[i];
            strArr[r11] = str2;
            aeli aeli2 = (aeli) aenc.m52185a(rkb, strArr).mo9456a(10, TimeUnit.SECONDS);
            if (!aeli2.f63490b.mo17710c() || aeli2.mo24660a() <= 0) {
                aeli = aeli2;
                fArr = fArr2;
            } else {
                bxvd da = boes.f132830d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = r11;
                }
                boes.m111127a((boes) da.f164949b);
                aelh b = aeli2.mo24661a(r11);
                fArr = fArr2;
                bxvd bxvd = da;
                String str3 = str2;
                aeli = aeli2;
                Location.distanceBetween(this.f92673b.getLatitude(), this.f92673b.getLongitude(), b.mo8010d().f79894a, b.mo8010d().f79895b, fArr);
                float f = fArr[0];
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boes boes = (boes) bxvd.f164949b;
                boes.f132832a |= 2;
                boes.f132833b = f;
                boolean contains = this.f92675d.f109270c.contains(str3);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boes boes2 = (boes) bxvd.f164949b;
                boes2.f132832a |= 4;
                boes2.f132834c = contains;
                arrayList.add((boes) bxvd.mo74062i());
                if (Log.isLoggable("Coffee-GeofenceService", 4)) {
                    float f2 = fArr[0];
                    boolean contains2 = this.f92675d.f109270c.contains(str3);
                    StringBuilder sb2 = new StringBuilder(117);
                    sb2.append("GeofenceLogService:GeofencingEvent Trigger: Radius:");
                    sb2.append(80.0f);
                    sb2.append(", Distance between:");
                    sb2.append(f2);
                    sb2.append(", isTrigger:");
                    sb2.append(contains2);
                    Log.i("Coffee-GeofenceService", sb2.toString());
                }
            }
            aeli.mo12460c();
            fArr2 = fArr;
            r11 = 0;
            i = 1;
        }
        Collections.sort(arrayList, auwu.f92670a);
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133072b = 6;
        bohi.f133071a |= 1;
        bogj.mo68909a(arrayList);
        aupk.m77567a(this.f92675d, (bohi) bogj.mo74062i());
        this.f92675d.mo59578a();
    }
}
