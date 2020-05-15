package p000;

import android.os.RemoteException;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxe implements fxb {

    /* renamed from: a */
    final /* synthetic */ fwu f17496a;

    public fxe(fwu fwu) {
        this.f17496a = fwu;
    }

    /* renamed from: a */
    public final void mo7248a(ContactPerson contactPerson, boolean z) {
        try {
            this.f17496a.mo11449a(contactPerson, z);
        } catch (RemoteException e) {
            bqye.m113758a(e);
        }
    }
}
