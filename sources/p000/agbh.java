package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.List;

/* renamed from: agbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agbh implements IBinder.DeathRecipient, agbb {

    /* renamed from: a */
    final /* synthetic */ agbi f65122a;

    /* renamed from: b */
    private final agcc f65123b;

    /* renamed from: c */
    private final IBinder f65124c;

    public agbh(agbi agbi, agcc agcc) {
        this.f65122a = agbi;
        this.f65123b = agcc;
        IBinder asBinder = agcc.asBinder();
        this.f65124c = asBinder;
        asBinder.linkToDeath(this, 0);
    }

    /* renamed from: a */
    public final void mo23432a(int i) {
        try {
            this.f65123b.mo35215a(i);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: b */
    public final void mo23438b() {
        try {
            this.f65123b.mo35214a();
        } catch (RemoteException e) {
        }
    }

    public final void binderDied() {
        agbi.f65125a.mo35221a("Binder is dead.");
        this.f65124c.unlinkToDeath(this, 0);
        this.f65122a.f65128d.mo16658a(new agbg(this, "stopSearch"));
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof agbh) && this.f65124c.equals(((agbh) obj).f65124c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f65124c.hashCode();
    }

    /* renamed from: a */
    public final void mo23433a(int i, int i2) {
        try {
            this.f65123b.mo35216a(i, i2);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: b */
    public final void mo23439b(MdnsServiceInfo mdnsServiceInfo) {
        try {
            this.f65123b.mo35220b(mdnsServiceInfo);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo23435a(MdnsServiceInfo mdnsServiceInfo) {
        try {
            this.f65123b.mo35217a(mdnsServiceInfo);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo23436a(String str) {
        try {
            this.f65123b.mo35218a(str);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo23437a(List list, int i) {
        try {
            this.f65123b.mo35219a(list, i);
        } catch (RemoteException e) {
        }
    }
}
