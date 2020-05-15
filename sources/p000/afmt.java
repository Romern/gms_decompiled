package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.concurrent.Executor;

/* renamed from: afmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmt extends dck implements afmu {

    /* renamed from: a */
    public volatile boolean f64402a;

    /* renamed from: b */
    public final basu f64403b;

    /* renamed from: c */
    private final Executor f64404c;

    public afmt() {
        super("com.google.android.gms.mdh.internal.ILatestFootprintListener");
    }

    /* renamed from: a */
    public final void mo32719a(rnt rnt, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        if (this.f64402a) {
            this.f64404c.execute(new afmf(this, latestFootprintFilter, mdhFootprintListSafeParcelable));
        }
        rnt.mo11797a(Status.f30107a);
    }

    public afmt(Executor executor, basu basu) {
        super("com.google.android.gms.mdh.internal.ILatestFootprintListener");
        this.f64402a = true;
        this.f64404c = executor;
        this.f64403b = basu;
    }

    /* renamed from: a */
    public final void mo32720a(rnt rnt, SyncStatus syncStatus) {
        if (this.f64402a) {
            this.f64404c.execute(new afmi(this, syncStatus));
        }
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo32721a(rnt rnt, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        if (this.f64402a) {
            this.f64404c.execute(new afmg(this, mdhFootprintListSafeParcelable));
        }
        rnt.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface instanceof rnt) {
                    rnt = (rnt) queryLocalInterface;
                } else {
                    rnt = new rnr(readStrongBinder);
                }
            }
            mo32719a(rnt, (LatestFootprintFilter) dcl.m8163a(parcel, LatestFootprintFilter.CREATOR), (MdhFootprintListSafeParcelable) dcl.m8163a(parcel, MdhFootprintListSafeParcelable.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
            }
            mo32721a(rnt, (MdhFootprintListSafeParcelable) dcl.m8163a(parcel, MdhFootprintListSafeParcelable.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface3 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface3;
                } else {
                    rnt = new rnr(readStrongBinder3);
                }
            }
            parcel.createByteArray();
            if (this.f64402a) {
                this.f64404c.execute(new afmh(this));
            }
            rnt.mo11797a(Status.f30107a);
        } else if (i != 5) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface4 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface4;
                } else {
                    rnt = new rnr(readStrongBinder4);
                }
            }
            mo32720a(rnt, (SyncStatus) dcl.m8163a(parcel, SyncStatus.CREATOR));
        }
        return true;
    }
}
