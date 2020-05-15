package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: qew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qew implements qeu {

    /* renamed from: a */
    private static final Logger f41097a = qgn.m32143a("CheckinApiCallback");

    /* renamed from: b */
    private final rnt f41098b;

    public qew(rnt rnt) {
        this.f41098b = rnt;
    }

    /* renamed from: a */
    public final void mo23992a() {
        try {
            this.f41098b.mo11797a(new Status(21021));
        } catch (RemoteException e) {
            f41097a.mo25416d("Remote object lost", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo23993b() {
        try {
            this.f41098b.mo11797a(new Status(21041));
        } catch (RemoteException e) {
            f41097a.mo25416d("Remote object lost", new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo23994c() {
        try {
            this.f41098b.mo11797a(new Status(21042));
        } catch (RemoteException e) {
            f41097a.mo25416d("Remote object lost", new Object[0]);
        }
    }
}
