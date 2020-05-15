package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.chimera.Fragment;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.SelectionFragmentOptions;
import java.util.List;

@Deprecated
/* renamed from: fxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxc {

    /* renamed from: a */
    public fwx f17494a;

    public fxc(Context context, Fragment fragment) {
        try {
            fwx a = m12581a(context);
            this.f17494a = a;
            a.mo7285a(vzs.m41642a(fragment));
        } catch (RemoteException | wam e) {
            bqye.m113758a(e);
        }
    }

    /* renamed from: a */
    private static final fwx m12581a(Context context) {
        IBinder a = waq.m41676a(context, waq.f50353a, "com.google.android.gms.appinvite").mo29007a("com.google.android.gms.appinvite.ui.context.SelectionFragmentHolderImpl");
        if (a == null) {
            return null;
        }
        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.appinvite.ui.context.ISelectionFragmentHolder");
        if (queryLocalInterface instanceof fwx) {
            return (fwx) queryLocalInterface;
        }
        return new fwv(a);
    }

    public fxc(Context context, SelectionFragmentOptions selectionFragmentOptions) {
        try {
            fwx a = m12581a(context);
            this.f17494a = a;
            a.mo7282a(selectionFragmentOptions);
        } catch (RemoteException | wam e) {
            bqye.m113758a(e);
        }
    }

    /* renamed from: a */
    public final List mo11451a() {
        try {
            return this.f17494a.mo7289c();
        } catch (RemoteException e) {
            bqye.m113758a(e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo11452a(ContactPerson contactPerson) {
        try {
            this.f17494a.mo7281a(contactPerson);
        } catch (RemoteException e) {
            bqye.m113758a(e);
        }
    }
}
