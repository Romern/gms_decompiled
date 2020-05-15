package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.SelectionFragmentOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwv extends dcj implements fwx {
    public fwv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appinvite.ui.context.ISelectionFragmentHolder");
    }

    /* renamed from: a */
    public final vzr mo7279a() {
        vzr vzr;
        Parcel a = mo8526a(1, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        a.recycle();
        return vzr;
    }

    /* renamed from: b */
    public final void mo7287b(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(108, bj);
    }

    /* renamed from: c */
    public final List mo7289c() {
        Parcel a = mo8526a(101, mo8529bj());
        ArrayList createTypedArrayList = a.createTypedArrayList(ContactPerson.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: b */
    public final void mo7288b(ContactPerson contactPerson) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, contactPerson);
        mo8528b(106, bj);
    }

    /* renamed from: a */
    public final void mo7280a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(107, bj);
    }

    /* renamed from: a */
    public final void mo7281a(ContactPerson contactPerson) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, contactPerson);
        mo8528b(ErrorInfo.TYPE_SDU_MEMORY_FULL, bj);
    }

    /* renamed from: a */
    public final void mo7282a(SelectionFragmentOptions selectionFragmentOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, selectionFragmentOptions);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo7283a(fwr fwr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, fwr);
        mo8528b(102, bj);
    }

    /* renamed from: a */
    public final void mo7284a(fwu fwu) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, fwu);
        mo8528b(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, bj);
    }

    /* renamed from: a */
    public final void mo7285a(vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        mo8528b(2, bj);
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
    public final void mo7286a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        mo8528b(ErrorInfo.TYPE_SDU_FAILED, bj);
    }
}
