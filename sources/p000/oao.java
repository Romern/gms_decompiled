package p000;

import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.ArrayList;

/* renamed from: oao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oao extends dck implements oap {

    /* renamed from: a */
    private final noj f37082a;

    public oao() {
        super("com.google.android.gms.car.display.manager.ICarDisplayManager");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            noj noj = this.f37082a;
            bnsn bnsn = noj.f36155b;
            noj.mo21317av();
            ArrayList arrayList = new ArrayList();
            for (noe noe : this.f37082a.f36236w) {
                CarDisplay carDisplay = noe.f36146g.f37079a;
                if (carDisplay != null) {
                    arrayList.add(carDisplay);
                } else {
                    throw new IllegalStateException("getCarDisplays called before displays are configured.");
                }
            }
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayList);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            CarDisplayId carDisplayId = (CarDisplayId) dcl.m8163a(parcel, CarDisplayId.CREATOR);
            noj noj2 = this.f37082a;
            bnsn bnsn2 = noj.f36155b;
            noj2.mo21317av();
            noe noe2 = (noe) bnjd.m109602h(this.f37082a.f36236w, new nnx(carDisplayId));
            if (noe2 != null) {
                oan oan = noe2.f36146g;
                parcel2.writeNoException();
                dcl.m8164a(parcel2, oan);
                return true;
            }
            int i2 = carDisplayId.f29493b;
            StringBuilder sb = new StringBuilder(54);
            sb.append("No CarDisplayService found for display id: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public oao(noj noj) {
        super("com.google.android.gms.car.display.manager.ICarDisplayManager");
        this.f37082a = noj;
    }
}
