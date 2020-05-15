package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.nio.channels.WritableByteChannel;

/* renamed from: oid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oid extends dck implements oie {

    /* renamed from: a */
    final /* synthetic */ ohm f37688a;

    public oid() {
        super("com.google.android.gms.car.senderprotocol.IReader");
    }

    /* renamed from: a */
    public final void mo22176a() {
        synchronized (this.f37688a.f37645b) {
            this.f37688a.f37646c = null;
        }
    }

    /* renamed from: a */
    public final void mo22177a(ohy ohy) {
        this.f37688a.f37647d = ohy;
    }

    /* renamed from: c */
    public final oib mo22179c() {
        synchronized (this.f37688a.f37645b) {
            this.f37688a.f37644a = false;
            this.f37688a.interrupt();
            this.f37688a.f37645b.notify();
        }
        return ojq.m28926a(this.f37688a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oid(ohm ohm) {
        super("com.google.android.gms.car.senderprotocol.IReader");
        this.f37688a = ohm;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        oib oib = null;
        ohy ohy = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
                if (queryLocalInterface instanceof oib) {
                    oib = (oib) queryLocalInterface;
                } else {
                    oib = new ohz(readStrongBinder);
                }
            }
            boolean a = mo22178a(oib);
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        } else if (i == 2) {
            mo22176a();
            parcel2.writeNoException();
        } else if (i == 3) {
            oib c = mo22179c();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, c);
        } else if (i == 4) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
                if (queryLocalInterface2 instanceof oib) {
                    oib oib2 = (oib) queryLocalInterface2;
                } else {
                    new ohz(readStrongBinder2);
                }
            }
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
                if (queryLocalInterface3 instanceof ohy) {
                    ohy = (ohy) queryLocalInterface3;
                } else {
                    ohy = new ohw(readStrongBinder3);
                }
            }
            mo22177a(ohy);
            parcel2.writeNoException();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo22178a(oib oib) {
        synchronized (this.f37688a.f37645b) {
            ohm ohm = this.f37688a;
            if (ohm.f37646c != null) {
                throw new IllegalStateException("Setting channel while already set");
            } else if (!ohm.f37644a) {
                return false;
            } else {
                this.f37688a.f37646c = (WritableByteChannel) oja.m28891a(oib);
                this.f37688a.f37645b.notify();
                return true;
            }
        }
    }
}
