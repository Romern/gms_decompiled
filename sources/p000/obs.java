package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.inputmethod.EditorInfo;

/* renamed from: obs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obs extends dcj implements IInterface {
    public obs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarProjectionInputService");
    }

    /* renamed from: a */
    public final void mo21951a() {
        mo8530c(2, mo8529bj());
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
    public final void mo21952a(obu obu, EditorInfo editorInfo) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, obu);
        dcl.m8165a(bj, editorInfo);
        dcl.m8166a(bj, false);
        mo8530c(1, bj);
    }
}
