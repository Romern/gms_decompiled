package p000;

import android.location.Location;
import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.function.BiConsumer;

/* renamed from: auwt */
final /* synthetic */ class auwt implements BiConsumer {

    /* renamed from: a */
    private final auww f92669a;

    public auwt(auww auww) {
        this.f92669a = auww;
    }

    public final void accept(Object obj, Object obj2) {
        auww auww = this.f92669a;
        auyw auyw = (auyw) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        float[] fArr = new float[2];
        bxvd da = boes.f132830d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boes.m111127a((boes) da.f164949b);
        double latitude = auww.f92673b.getLatitude();
        double longitude = auww.f92673b.getLongitude();
        LatLng latLng = auyw.f92804c;
        float[] fArr2 = fArr;
        Location.distanceBetween(latitude, longitude, latLng.f79894a, latLng.f79895b, fArr2);
        float f = fArr2[0];
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boes boes = (boes) da.f164949b;
        boes.f132832a = 2 | boes.f132832a;
        boes.f132833b = f;
        boolean contains = auww.f92675d.f109270c.contains(auyw.f92802a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boes boes2 = (boes) da.f164949b;
        boes2.f132832a |= 4;
        boes2.f132834c = contains;
        auww.f92672a.add((boes) da.mo74062i());
        if (Log.isLoggable("Coffee-GeofenceService", 4)) {
            float f2 = fArr2[0];
            boolean contains2 = auww.f92675d.f109270c.contains(auyw.f92802a);
            StringBuilder sb = new StringBuilder(114);
            sb.append("GeofenceLogService: NearbyAlert Trigger: Radius:");
            sb.append(80.0f);
            sb.append(", Distance between:");
            sb.append(f2);
            sb.append(", isTrigger:");
            sb.append(contains2);
            Log.i("Coffee-GeofenceService", sb.toString());
        }
        if (booleanValue) {
            Collections.sort(auww.f92672a, auwv.f92671a);
            bogj bogj = (bogj) bohi.f133070z.mo74144da();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi = (bohi) bogj.f164949b;
            bohi.f133072b = 6;
            bohi.f133071a |= 1;
            bogj.mo68909a(auww.f92672a);
            aupk.m77567a(auww.f92675d, (bohi) bogj.mo74062i());
            auww.f92675d.mo59578a();
        }
    }
}
