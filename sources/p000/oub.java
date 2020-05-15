package p000;

import android.os.Parcel;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: oub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oub extends dck implements ouc {

    /* renamed from: a */
    final /* synthetic */ CarSetupServiceImpl f38459a;

    public oub() {
        super("com.google.android.gms.carsetup.ICarSetupBinder");
    }

    /* renamed from: a */
    public final nrp mo22651a() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38459a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        if (carSetupServiceImpl.f29565D == null) {
            this.f38459a.f29565D = new ofn();
            CarSetupServiceImpl carSetupServiceImpl2 = this.f38459a;
            ojq ojq = carSetupServiceImpl2.f29589f;
            if (ojq != null) {
                ojq.mo22217a((ofo) carSetupServiceImpl2.f29565D);
            }
        }
        return this.f38459a.f29565D;
    }

    /* renamed from: c */
    public final void mo22652c() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38459a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        ojq ojq = carSetupServiceImpl.f29589f;
        if (ojq != null) {
            ojq.mo22217a((ofo) null);
        }
        this.f38459a.f29565D = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oub(CarSetupServiceImpl carSetupServiceImpl) {
        super("com.google.android.gms.carsetup.ICarSetupBinder");
        this.f38459a = carSetupServiceImpl;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            nrp a = mo22651a();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, a);
        } else if (i == 2) {
            mo22652c();
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            CarSetupServiceImpl carSetupServiceImpl = this.f38459a;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            if (carSetupServiceImpl.f29592i.f38282c == 0) {
                this.f38459a.f29592i.mo22542a();
            }
            int i2 = this.f38459a.f29592i.f38282c;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }
}
