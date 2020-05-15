package p000;

import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: oan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oan extends dck implements IInterface {

    /* renamed from: a */
    public volatile CarDisplay f37079a;

    /* renamed from: b */
    private final noe f37080b;

    /* renamed from: c */
    private final Set f37081c;

    public oan() {
        super("com.google.android.gms.car.display.manager.ICarDisplay");
    }

    /* renamed from: a */
    public final void mo21906a(oab oab) {
        noe noe = this.f37080b;
        CarDisplayId carDisplayId = noe.f36140a;
        int i = noe.f36145f;
        int i2 = i - 1;
        if (i != 0) {
            this.f37079a = new CarDisplay(carDisplayId, i2, oab.f37029g, new Point(oab.f37033k.getWidth(), oab.f37033k.getHeight()));
            return;
        }
        throw null;
    }

    public oan(noe noe) {
        super("com.google.android.gms.car.display.manager.ICarDisplay");
        this.f37081c = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f37080b = noe;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            nve nve = ((nvk) this.f37080b.f36142c).f36660f;
            parcel2.writeNoException();
            dcl.m8164a(parcel2, nve);
            return true;
        } else if (i != 3) {
            nss nss = null;
            if (i == 4) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    if (queryLocalInterface instanceof nss) {
                        nss = (nss) queryLocalInterface;
                    } else {
                        nss = new nss(readStrongBinder);
                    }
                }
                this.f37081c.add(nss);
                parcel2.writeNoException();
                return true;
            } else if (i != 5) {
                return false;
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    if (queryLocalInterface2 instanceof nss) {
                        nss = (nss) queryLocalInterface2;
                    } else {
                        nss = new nss(readStrongBinder2);
                    }
                }
                this.f37081c.remove(nss);
                parcel2.writeNoException();
                return true;
            }
        } else {
            ccux.m131754c();
            throw new IllegalStateException("Unsupported Display#getCarUiInfo API usage.");
        }
    }
}
