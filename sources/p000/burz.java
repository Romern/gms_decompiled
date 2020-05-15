package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: burz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class burz extends dck implements busa {

    /* renamed from: a */
    public final DiscoveryChimeraService f154800a;

    /* renamed from: b */
    private final buqn f154801b = new aibf(this, "StubImpl.onRegister");

    /* renamed from: c */
    private final buqn f154802c = new aibg(this, "StubImpl.onUnregister");

    /* renamed from: d */
    private final IBinder.DeathRecipient f154803d = new aibe(this);

    /* renamed from: e */
    private final buqh f154804e;

    /* renamed from: f */
    private busd f154805f;

    /* renamed from: g */
    private final Object f154806g = new Object();

    /* renamed from: c */
    private final boolean m120359c(busd busd) {
        busd busd2 = this.f154805f;
        return (busd2 == null || busd2.asBinder() == busd.asBinder()) ? false : true;
    }

    /* renamed from: a */
    public void mo37353a() {
        throw null;
    }

    /* renamed from: b */
    public void mo37354b() {
        throw null;
    }

    /* renamed from: d */
    public final boolean mo73078d() {
        boolean z;
        synchronized (this.f154806g) {
            z = this.f154805f != null;
        }
        return z;
    }

    public burz(DiscoveryChimeraService discoveryChimeraService, buqh buqh) {
        super("com.google.location.nearby.common.fastpair.IDiscoveryService");
        this.f154800a = discoveryChimeraService;
        this.f154804e = buqh;
    }

    /* renamed from: a */
    public final void mo73076a(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DiscoveryListItem discoveryListItem = (DiscoveryListItem) it.next();
            bzbk bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
            int ordinal = discoveryListItem.f191746l.ordinal();
            if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                arrayList.add(discoveryListItem);
            }
        }
        synchronized (this.f154806g) {
            busd busd = this.f154805f;
            if (busd != null) {
                try {
                    busd.mo73079a(i, arrayList);
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("DiscoveryService failed to notify Service");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo73075b(busd busd) {
        synchronized (this.f154806g) {
            if (m120359c(busd)) {
                srn srn = ahsd.f67925a;
            } else {
                mo73077c();
            }
        }
    }

    /* renamed from: c */
    public final void mo73077c() {
        synchronized (this.f154806g) {
            busd busd = this.f154805f;
            if (busd != null) {
                busd.asBinder().unlinkToDeath(this.f154803d, 1);
            }
            this.f154805f = null;
        }
        this.f154804e.mo72987c(this.f154802c);
    }

    /* renamed from: a */
    public final void mo73074a(busd busd) {
        synchronized (this.f154806g) {
            if (m120359c(busd)) {
                srn srn = ahsd.f67925a;
                mo73077c();
            }
            this.f154805f = busd;
            try {
                busd.asBinder().linkToDeath(this.f154803d, 1);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("DiscoveryService failed to register.");
            }
        }
        this.f154804e.mo72987c(this.f154801b);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        busd busd = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
                if (queryLocalInterface instanceof busd) {
                    busd = (busd) queryLocalInterface;
                } else {
                    busd = new busb(readStrongBinder);
                }
            }
            mo73074a(busd);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
                if (queryLocalInterface2 instanceof busd) {
                    busd = (busd) queryLocalInterface2;
                } else {
                    busd = new busb(readStrongBinder2);
                }
            }
            mo73075b(busd);
        }
        return true;
    }
}
