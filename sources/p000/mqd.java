package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.d2d.component.D2dMigrateHelperChimeraService;
import com.google.android.gms.backup.migrate.helper.ParcelableBrokerRequest;
import com.google.android.gms.backup.migrate.helper.ParcelableBrokerResponse;

/* renamed from: mqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqd extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ D2dMigrateHelperChimeraService f34229a;

    public mqd() {
        super("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBroker");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        mqe mqe;
        if (i != 1) {
            return false;
        }
        ParcelableBrokerRequest parcelableBrokerRequest = (ParcelableBrokerRequest) dcl.m8163a(parcel, ParcelableBrokerRequest.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBrokerCallbacks");
            mqe = queryLocalInterface instanceof mqe ? (mqe) queryLocalInterface : new mqe(readStrongBinder);
        } else {
            mqe = null;
        }
        D2dMigrateHelperChimeraService.f29015a.mo25409a("ID2dMigrateHelperBroker.requestD2dMigrateHelper() was called.", new Object[0]);
        bxvd da = mpy.f34225c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpy mpy = (mpy) da.f164949b;
        mpy.f34227a = 1;
        try {
            bxwf bxwf = parcelableBrokerRequest.f29059b;
            if (bxwf == null) {
                if (parcelableBrokerRequest.f29058a.f34224a != 1) {
                    mpy.f34228b = mpx.m25499a(4);
                    mqe.mo20225a(new ParcelableBrokerResponse((mpy) da.mo74062i()), (mqc) null);
                } else {
                    try {
                        D2dMigrateHelperChimeraService d2dMigrateHelperChimeraService = this.f34229a;
                        String a = mpv.m25497a(d2dMigrateHelperChimeraService);
                        spn.m35872c(d2dMigrateHelperChimeraService, a);
                        rfz.m33557a(d2dMigrateHelperChimeraService).mo24605a(a);
                        D2dMigrateHelperChimeraService.f29015a.mo25409a("Broker checks passed.", new Object[0]);
                        mqe.mo20225a(new ParcelableBrokerResponse((mpy) da.mo74062i()), new meq(this.f34229a));
                    } catch (SecurityException e) {
                        D2dMigrateHelperChimeraService.f29015a.mo25417e("Client failed security check.", e, new Object[0]);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((mpy) da.f164949b).f34228b = mpx.m25499a(5);
                        mqe.mo20225a(new ParcelableBrokerResponse((mpy) da.mo74062i()), (mqc) null);
                    }
                }
                return true;
            }
            throw bxwf;
        } catch (bxwf e2) {
            D2dMigrateHelperChimeraService.f29015a.mo25417e("Unable to parse broker request request.", e2, new Object[0]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((mpy) da.f164949b).f34228b = mpx.m25499a(3);
            mqe.mo20225a(new ParcelableBrokerResponse((mpy) da.mo74062i()), (mqc) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mqd(D2dMigrateHelperChimeraService d2dMigrateHelperChimeraService) {
        super("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBroker");
        this.f34229a = d2dMigrateHelperChimeraService;
    }
}
