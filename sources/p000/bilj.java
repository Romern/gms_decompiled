package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;
import java.util.Iterator;

/* renamed from: bilj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bilj implements rkl {

    /* renamed from: a */
    final /* synthetic */ bilk f120826a;

    /* renamed from: b */
    private final rkl f120827b;

    /* renamed from: c */
    private final int f120828c;

    /* renamed from: d */
    private final int f120829d;

    public bilj(bilk bilk, rkl rkl, int i, int i2) {
        this.f120826a = bilk;
        this.f120827b = rkl;
        this.f120828c = i;
        this.f120829d = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        aelt aelt;
        PlacePhotoMetadataResult placePhotoMetadataResult = (PlacePhotoMetadataResult) rkk;
        if (placePhotoMetadataResult.f79480a.mo17710c()) {
            aelu aelu = placePhotoMetadataResult.f79482c;
            if (aelu.mo24660a() == 0) {
                aelu.mo12460c();
                this.f120827b.mo9454a(new PlacePhotoResult(new Status(13, "No photos returned"), null));
                return;
            }
            Iterator it = aelu.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aelt = null;
                    break;
                }
                aelt aelt2 = (aelt) it.next();
                if (aelt2.mo34309a() >= this.f120828c && aelt2.mo34311b() >= this.f120829d) {
                    aelt = (aelt) aelt2.mo7556bF();
                    break;
                }
            }
            aelu.mo12460c();
            if (aelt == null) {
                this.f120827b.mo9454a(new PlacePhotoResult(new Status(13, "No suitable photos returned"), null));
                return;
            }
            rke a = aelt.mo34310a(this.f120826a.f120832c, this.f120828c, this.f120829d);
            a.mo9458a(this.f120827b);
            this.f120826a.f120840k = a;
            return;
        }
        this.f120827b.mo9454a(new PlacePhotoResult(placePhotoMetadataResult.f79480a, null));
    }
}
