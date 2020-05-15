package p000;

import android.os.Parcel;
import com.google.android.gms.backup.ParcelableDevice;
import java.util.List;

/* renamed from: moo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class moo extends dck implements mop {

    /* renamed from: a */
    final /* synthetic */ aucf f34075a;

    public moo() {
        super("com.google.android.gms.backup.internal.IGmsRestoreCallback");
    }

    /* renamed from: a */
    public final void mo20219a(List list) {
        this.f34075a.mo50391a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public moo(aucf aucf) {
        super("com.google.android.gms.backup.internal.IGmsRestoreCallback");
        this.f34075a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo20219a(parcel.createTypedArrayList(ParcelableDevice.CREATOR));
        return true;
    }
}
