package p000;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.maps.internal.CreatorImpl;

/* renamed from: afht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afht extends dck implements afhu {

    /* renamed from: a */
    public afhu f64246a;

    /* renamed from: b */
    public final /* synthetic */ CreatorImpl f64247b;

    public afht() {
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: a */
    public final vzr mo34875a() {
        return this.f64247b.mo43852a(new afdg(this));
    }

    /* renamed from: b */
    public final vzr mo34880b(String str) {
        return this.f64247b.mo43852a(new afdf(this, str));
    }

    /* renamed from: c */
    public final vzr mo34881c(String str) {
        return this.f64247b.mo43852a(new afdj(this, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afht(CreatorImpl creatorImpl) {
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        this.f64247b = creatorImpl;
        this.f64246a = null;
    }

    /* renamed from: a */
    public final vzr mo34876a(float f) {
        return this.f64247b.mo43852a(new afdh(this, f));
    }

    /* renamed from: a */
    public final vzr mo34877a(int i) {
        return this.f64247b.mo43852a(new afdd(this, i));
    }

    /* renamed from: a */
    public final vzr mo34878a(Bitmap bitmap) {
        return this.f64247b.mo43852a(new afdi(this, bitmap));
    }

    /* renamed from: a */
    public final vzr mo34879a(String str) {
        return this.f64247b.mo43852a(new afde(this, str));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                vzr a = mo34877a(parcel.readInt());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a);
                return true;
            case 2:
                vzr a2 = mo34879a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a2);
                return true;
            case 3:
                vzr b = mo34880b(parcel.readString());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, b);
                return true;
            case 4:
                vzr a3 = mo34875a();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a3);
                return true;
            case 5:
                vzr a4 = mo34876a(parcel.readFloat());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a4);
                return true;
            case 6:
                vzr a5 = mo34878a((Bitmap) dcl.m8163a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a5);
                return true;
            case 7:
                vzr c = mo34881c(parcel.readString());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, c);
                return true;
            default:
                return false;
        }
    }
}
