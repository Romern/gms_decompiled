package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fws extends dcj implements fwu {
    public fws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appinvite.ui.context.ISelectionChangeListener");
    }

    /* renamed from: a */
    public final void mo11449a(ContactPerson contactPerson, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, contactPerson);
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
