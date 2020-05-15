package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Request;

/* renamed from: aprc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aprc extends dck implements aprd {
    public aprc() {
        super("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apra apra = null;
        if (i == 2) {
            GetCorpusHandlesRegisteredForIMECall$Request getCorpusHandlesRegisteredForIMECall$Request = (GetCorpusHandlesRegisteredForIMECall$Request) dcl.m8163a(parcel, GetCorpusHandlesRegisteredForIMECall$Request.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks");
                if (queryLocalInterface instanceof apra) {
                    apra = (apra) queryLocalInterface;
                } else {
                    apra = new apra(readStrongBinder);
                }
            }
            mo47543a(apra);
        } else if (i != 3) {
            return false;
        } else {
            GetIMEUpdatesCall$Request getIMEUpdatesCall$Request = (GetIMEUpdatesCall$Request) dcl.m8163a(parcel, GetIMEUpdatesCall$Request.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks");
                if (queryLocalInterface2 instanceof apra) {
                    apra = (apra) queryLocalInterface2;
                } else {
                    apra = new apra(readStrongBinder2);
                }
            }
            mo47544b(apra);
        }
        parcel2.writeNoException();
        return true;
    }
}
