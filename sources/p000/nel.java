package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.beacon.BleSighting;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: nel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nel extends nej implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final nfv f35405a;

    /* renamed from: b */
    public final IBinder f35406b;

    /* renamed from: c */
    final /* synthetic */ nfx f35407c;

    public nel(nfx nfx, IBinder iBinder) {
        nfv nfv;
        this.f35407c = nfx;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.beacon.internal.IBleListener");
            nfv = queryLocalInterface instanceof nfv ? (nfv) queryLocalInterface : new nft(iBinder);
        } else {
            nfv = null;
        }
        this.f35405a = nfv;
        this.f35406b = iBinder;
        nfv.asBinder().linkToDeath(this, 0);
    }

    /* renamed from: b */
    private final void m26034b() {
        this.f35407c.mo20579a(this);
        mo20530a();
        try {
            this.f35405a.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
        }
    }

    /* renamed from: a */
    public final void mo20530a() {
        this.f35407c.f35471e.remove(this.f35406b);
        Integer num = (Integer) this.f35407c.f35472f.remove(this);
        if (num != null) {
            ngz.m26240a(num.intValue());
            this.f35407c.f35468b.mo20549a(num);
        }
    }

    public final void binderDied() {
        m26034b();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35406b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("Listener=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo13773a(int i) {
        try {
            this.f35405a.mo20572a(i);
            m26034b();
        } catch (RemoteException e) {
            m26034b();
        }
    }

    /* renamed from: a */
    public final void mo13774a(int i, BleSighting bleSighting) {
        try {
            this.f35405a.mo20573a(i, bleSighting);
        } catch (RemoteException e) {
            m26034b();
        }
    }

    /* renamed from: a */
    public final void mo20523a(String str) {
        try {
            this.f35405a.mo20574a(str);
        } catch (RemoteException e) {
            m26034b();
        }
    }

    /* renamed from: a */
    public final void mo20524a(List list) {
        try {
            this.f35405a.mo20575a(list);
        } catch (RemoteException e) {
            m26034b();
        }
    }
}
