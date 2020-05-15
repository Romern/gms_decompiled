package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;

/* renamed from: aaei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaei extends dck implements IInterface {
    public aaei() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    /* renamed from: a */
    public PopupLocationInfoParcelable mo16777a() {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1001) {
            return false;
        }
        PopupLocationInfoParcelable a = mo16777a();
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
