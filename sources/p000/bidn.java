package p000;

import android.content.Intent;
import com.google.android.places.Subscription;
import com.google.android.places.service.PlaceDetectionAsyncChimeraService;
import java.util.List;

/* renamed from: bidn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f120313a;

    /* renamed from: b */
    final /* synthetic */ PlaceDetectionAsyncChimeraService f120314b;

    public bidn(PlaceDetectionAsyncChimeraService placeDetectionAsyncChimeraService, Intent intent) {
        this.f120314b = placeDetectionAsyncChimeraService;
        this.f120313a = intent;
    }

    public final void run() {
        boolean z;
        bidv bidv = this.f120314b.f151368a;
        Intent intent = this.f120313a;
        bhri bhri = bidv.f120331f;
        int b = rsk.m34336b(intent);
        if (b == 4) {
            bhrc bhrc = bhri.f119382h;
            if (rsk.m34335a(intent)) {
                z = rsk.m34336b(intent) == 4;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            bhrc bhrc2 = bhri.f119382h;
            if (!bhrc2.f119368b) {
                bhrc2.f119367a.mo25070c(intent);
                bhrc2.f119368b = true;
                for (Subscription subscription : bhri.f119382h.mo64177a()) {
                    bhri.mo64185b(subscription);
                }
                List list = bhri.f119383i;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) list.get(i)).run();
                }
                bhri.f119383i.clear();
                bhri.f119381g.mo64176a(bhri.f119382h.mo64178b());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown cache type: ");
        sb.append(b);
        bioi.m102663d("Places", sb.toString());
    }
}
