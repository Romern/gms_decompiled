package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

/* renamed from: bkmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkmg implements bkno {

    /* renamed from: a */
    final /* synthetic */ bkmi f124879a;

    public bkmg(bkmi bkmi) {
        this.f124879a = bkmi;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66110a(Object obj) {
        bkvo bkvo;
        ubu ubu;
        bkmi bkmi = this.f124879a;
        bkvo bkvo2 = ((bkvm) obj).f125332a;
        synchronized (bkmi.f124881a) {
            bkvo = (bkvo) bkmi.f124881a.put(bkvo2.f125334a, bkvo2);
        }
        if (bkvo == null && (ubu = bkmi.f124882b) != null) {
            try {
                vjj vjj = ubu.f47194a;
                ParcelableCollaborator a = ubw.m38032a(bkvo2);
                Parcel bj = vjj.mo8529bj();
                dcl.m8165a(bj, a);
                vjj.mo8528b(1, bj);
            } catch (RemoteException e) {
            }
        }
    }
}
