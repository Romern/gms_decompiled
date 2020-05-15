package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

/* renamed from: bkmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkmh implements bkno {

    /* renamed from: a */
    final /* synthetic */ bkmi f124880a;

    public bkmh(bkmi bkmi) {
        this.f124880a = bkmi;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66110a(Object obj) {
        bkvo bkvo;
        ubu ubu;
        bkmi bkmi = this.f124880a;
        String str = ((bkvn) obj).f125333a;
        synchronized (bkmi.f124881a) {
            bkvo = (bkvo) bkmi.f124881a.remove(str);
        }
        if (bkvo != null && (ubu = bkmi.f124882b) != null) {
            try {
                vjj vjj = ubu.f47194a;
                ParcelableCollaborator a = ubw.m38032a(bkvo);
                Parcel bj = vjj.mo8529bj();
                dcl.m8165a(bj, a);
                vjj.mo8528b(2, bj);
            } catch (RemoteException e) {
            }
        }
    }
}
