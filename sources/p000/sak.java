package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: sak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sak extends sab {

    /* renamed from: g */
    public final IBinder f43925g;

    /* renamed from: h */
    final /* synthetic */ sam f43926h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sak(sam sam, int i, IBinder iBinder, Bundle bundle) {
        super(sam, i, bundle);
        this.f43926h = sam;
        this.f43925g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25279a(ConnectionResult connectionResult) {
        sad sad = this.f43926h.f43931B;
        if (sad != null) {
            sad.mo6637a(connectionResult);
        }
        this.f43926h.mo16782a(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25281a() {
        try {
            String interfaceDescriptor = this.f43925g.getInterfaceDescriptor();
            if (!this.f43926h.mo6464b().equals(interfaceDescriptor)) {
                String b = this.f43926h.mo6464b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(b);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface a = this.f43926h.mo6462a(this.f43925g);
            if (a == null || (!this.f43926h.mo25299a(2, 4, a) && !this.f43926h.mo25299a(3, 4, a))) {
                return false;
            }
            sam sam = this.f43926h;
            sam.f43932C = null;
            Bundle m = sam.mo16784m();
            sac sac = this.f43926h.f43930A;
            if (sac == null) {
                return true;
            }
            sac.mo6636a(m);
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
