package p000;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: aabh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabh extends scj {

    /* renamed from: a */
    public sni f27882a;

    /* renamed from: b */
    private final sck f27883b;

    public aabh(sck sck) {
        this.f27883b = sck;
    }

    /* renamed from: a */
    private final blji m21050a() {
        sni sni = this.f27882a;
        if (sni == null) {
            return null;
        }
        this.f27882a = null;
        return sni.mo25772b();
    }

    /* renamed from: a */
    public final void mo16677a(int i, Bundle bundle) {
        blji a = m21050a();
        try {
            this.f27883b.mo16677a(i, bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo16678a(int i, IBinder iBinder, Bundle bundle) {
        blji a = m21050a();
        try {
            this.f27883b.mo16678a(i, iBinder, bundle);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo16679a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        blji a = m21050a();
        try {
            if (aaay.m21038a(connectionInfo.f30225c) != 0) {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                sdo.m34959a((Object) interfaceDescriptor);
                iBinder = new aaba(interfaceDescriptor, iBinder);
            }
            this.f27883b.mo16679a(i, iBinder, connectionInfo);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
