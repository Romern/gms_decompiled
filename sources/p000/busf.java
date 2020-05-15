package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: busf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busf extends dck implements IInterface, ayqh {

    /* renamed from: a */
    private final aics f154810a;

    /* renamed from: b */
    private final IBinder.DeathRecipient f154811b;

    /* renamed from: c */
    private busg f154812c;

    public busf() {
        super("com.google.location.nearby.common.fastpair.IPairingService");
    }

    /* renamed from: a */
    public final synchronized void mo73080a() {
        busg busg = this.f154812c;
        if (busg != null) {
            busg.f12819a.unlinkToDeath(this.f154811b, 1);
        }
        this.f154812c = null;
    }

    /* renamed from: a */
    public final synchronized void mo37372a(int i, String str) {
        busg busg = this.f154812c;
        if (busg != null) {
            int i2 = i - 1;
            try {
                Parcel bj = busg.mo8529bj();
                bj.writeInt(i2);
                bj.writeString(str);
                busg.mo8530c(1, bj);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("PairingServiceBinder.onPairingProgressUpdating meet exception!");
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("PairingServiceBinder.onPairingProgressUpdating failed because callback is null!");
        }
    }

    public busf(aics aics) {
        super("com.google.location.nearby.common.fastpair.IPairingService");
        this.f154811b = new aibd(this);
        this.f154810a = aics;
    }

    /* renamed from: a */
    public final synchronized void mo73081a(String str, String str2, busg busg) {
        this.f154812c = busg;
        try {
            busg.f12819a.linkToDeath(this.f154811b, 1);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("DiscoveryService failed to register.");
        }
        mo37372a(1, "");
        aics aics = this.f154810a;
        aics.f68704a.mo72987c(new aick(aics, "pairWithRemoteProgressListener", str, this, str2));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        busg busg;
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IPairingServiceCallback");
                busg = queryLocalInterface instanceof busg ? (busg) queryLocalInterface : new busg(readStrongBinder);
            } else {
                busg = null;
            }
            mo73081a(readString, readString2, busg);
        } else if (i != 2) {
            return false;
        } else {
            mo73080a();
        }
        return true;
    }
}
