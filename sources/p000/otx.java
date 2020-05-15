package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: otx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class otx extends dcj implements otz {
    public otx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ICarData");
    }

    /* renamed from: a */
    public final void mo22642a() {
        mo8528b(1, mo8529bj());
    }

    /* renamed from: c */
    public final void mo22647c() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: d */
    public final List mo22648d() {
        Parcel a = mo8526a(3, mo8529bj());
        ArrayList createTypedArrayList = a.createTypedArrayList(CarInfoInternal.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: e */
    public final List mo22649e() {
        Parcel a = mo8526a(4, mo8529bj());
        ArrayList createTypedArrayList = a.createTypedArrayList(CarInfoInternal.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: f */
    public final void mo22650f() {
        mo8528b(7, mo8529bj());
    }

    /* renamed from: a */
    public final void mo22643a(CarInfoInternal carInfoInternal) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carInfoInternal);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo22644a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo22645a(String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        mo8528b(5, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo22646a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        mo8528b(9, bj);
    }
}
