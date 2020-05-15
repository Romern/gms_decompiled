package p000;

import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* renamed from: obt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obt extends dck implements IInterface {

    /* renamed from: a */
    private final WeakReference f37140a;

    public obt() {
        super("com.google.android.gms.car.input.ICarProjectionInputServiceCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        nlq nlq = (nlq) this.f37140a.get();
        if (nlq != null) {
            Handler handler = nlq.f35956b;
            nlq.getClass();
            handler.post(new nlp(nlq));
        }
        parcel2.writeNoException();
        return true;
    }

    public obt(nlq nlq) {
        super("com.google.android.gms.car.input.ICarProjectionInputServiceCallback");
        this.f37140a = new WeakReference(nlq);
    }
}
