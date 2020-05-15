package p000;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.function.BiConsumer;

/* renamed from: auxk */
final /* synthetic */ class auxk implements BiConsumer {

    /* renamed from: a */
    private final auxl f92714a;

    public auxk(auxl auxl) {
        this.f92714a = auxl;
    }

    public final void accept(Object obj, Object obj2) {
        auxl auxl = this.f92714a;
        auyw auyw = (auyw) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        String str = auyw.f92802a;
        if (!auxl.f92718c.containsKey(str)) {
            aunx aunx = auxl.f92715a;
            String valueOf = String.valueOf(str);
            aunx.mo50711a(valueOf.length() == 0 ? new String("Adding: ") : "Adding: ".concat(valueOf), new Object[0]).mo50708c();
            auxl.f92718c.put(str, auyw);
        }
        if (booleanValue) {
            aehm aehm = new aehm();
            boolean a = chaf.f188187a.mo6606a().mo84867a();
            int i = 0;
            for (auyw auyw2 : auxl.f92718c.values()) {
                String str2 = auyw2.f92802a;
                aunx aunx2 = auxl.f92715a;
                String valueOf2 = String.valueOf(str2);
                aunx2.mo50711a(valueOf2.length() == 0 ? new String("enabling: ") : "enabling: ".concat(valueOf2), new Object[0]).mo50708c();
                if (!a || (!TextUtils.isEmpty(str2) && str2.length() <= 99)) {
                    aehf aehf = new aehf();
                    LatLng latLng = auyw2.f92804c;
                    aehf.mo34146a(latLng.f79894a, latLng.f79895b, 80.0f);
                    aehf.f63388a = str2;
                    aehf.mo34147b();
                    aehf.f63389b = 3;
                    aehm.mo34150a(aehf.mo34145a());
                } else {
                    aunx aunx3 = auxl.f92715a;
                    String valueOf3 = String.valueOf(str2);
                    aunx3.mo50711a(valueOf3.length() == 0 ? new String("Skipping Geofence with invalid request id: ") : "Skipping Geofence with invalid request id: ".concat(valueOf3), new Object[0]).mo50706a();
                    i++;
                }
            }
            int size = auxl.f92718c.size() - i;
            if (size != 0) {
                aehm.mo34153b(5);
                aehm.mo34151a("auth");
                auxl.f92719d.mo24684a(aehm.mo34149a(), auxl.mo51027b());
                auxl.mo51023a(size);
                auxl.f92718c.clear();
            }
        }
    }
}
