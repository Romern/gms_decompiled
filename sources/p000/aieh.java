package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.util.Set;

/* renamed from: aieh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aieh extends sbm {

    /* renamed from: a */
    public final Set f68829a = new C1225nr();

    /* renamed from: b */
    public final Set f68830b = new C1225nr();

    /* renamed from: c */
    public final Set f68831c = new C1225nr();

    /* renamed from: d */
    public aiib f68832d;

    /* renamed from: e */
    private final long f68833e = ((long) hashCode());

    /* renamed from: f */
    private final String f68834f;

    /* renamed from: c */
    public static Status m57074c(int i) {
        return new Status(i, ahih.m55828a(i));
    }

    /* renamed from: o */
    private final void m57075o() {
        for (aidx aidx : this.f68829a) {
            aidx.mo37453a();
        }
        for (aied aied : this.f68830b) {
            aied.mo37456a();
        }
        for (aids aids : this.f68831c) {
            aids.mo37452a();
        }
        this.f68829a.clear();
        this.f68830b.clear();
        this.f68831c.clear();
        aiib aiib = this.f68832d;
        if (aiib != null) {
            aiib.f68911c = true;
            aiib.f68909a.shutdownNow();
            srz.m36171a((Closeable) aiib.f68910b);
            this.f68832d = null;
        }
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{ahca.f66971b};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (queryLocalInterface instanceof aigl) {
            return (aigl) queryLocalInterface;
        }
        return new aigj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.f68833e);
        String str = this.f68834f;
        if (str != null) {
            bundle.putString("zeroPartyIdentifier", str);
        }
        return bundle;
    }

    /* renamed from: j */
    public final void mo14032j() {
        if (mo25301p()) {
            try {
                ((aigl) mo25289B()).mo36592a(new aidk().f68799a);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        m57075o();
        super.mo14032j();
    }

    /* renamed from: n */
    public final void mo37457n() {
        ((aigl) mo25289B()).mo36600a(new aiio().f68918a);
    }

    /* renamed from: r */
    public final boolean mo25303r() {
        return ahcb.m55443d(this.f43948r);
    }

    public aieh(Context context, Looper looper, sat sat, ahig ahig, rjz rjz, rka rka) {
        super(context, looper, 54, sat, rjz, rka);
        this.f68834f = ahig != null ? ahig.f67237a : null;
    }

    /* renamed from: a */
    public final void mo25292a(int i) {
        if (i == 1) {
            m57075o();
        }
        super.mo25292a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16781a(IInterface iInterface) {
        super.mo16781a((aigl) iInterface);
        this.f68832d = new aiib();
    }
}
