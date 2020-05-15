package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: bhrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhrl {

    /* renamed from: a */
    private final aeno f119387a;

    /* renamed from: b */
    private PlacePhotoResult f119388b;

    /* renamed from: c */
    private Status f119389c;

    /* renamed from: d */
    private boolean f119390d = false;

    public bhrl(aeno aeno) {
        this.f119387a = aeno;
    }

    /* renamed from: a */
    private final void m101388a() {
        PlacePhotoResult placePhotoResult;
        if (!this.f119390d) {
            Status status = this.f119389c;
            if (status != null && !status.mo17710c()) {
                m101389b(new PlacePhotoResult(this.f119389c, null));
                return;
            }
            PlacePhotoResult placePhotoResult2 = this.f119388b;
            if (placePhotoResult2 != null && !placePhotoResult2.f79483a.mo17710c()) {
                m101389b(new PlacePhotoResult(this.f119388b.f79483a, null));
            } else if (this.f119389c != null && (placePhotoResult = this.f119388b) != null) {
                m101389b(placePhotoResult);
            }
        }
    }

    /* renamed from: b */
    private final void m101389b(PlacePhotoResult placePhotoResult) {
        this.f119390d = true;
        try {
            this.f119387a.mo34378a(placePhotoResult);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final synchronized void mo64186a(Status status) {
        this.f119389c = status;
        m101388a();
    }

    /* renamed from: a */
    public final synchronized void mo64187a(PlacePhotoResult placePhotoResult) {
        this.f119388b = placePhotoResult;
        m101388a();
    }
}
