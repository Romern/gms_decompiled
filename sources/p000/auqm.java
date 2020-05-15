package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.trustagent.internal.ParcelableTrustAgentEvent;

/* renamed from: auqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auqm extends dck implements auqn {

    /* renamed from: a */
    private final auou f92299a;

    public auqm() {
        super("com.google.android.gms.trustagent.internal.ITrustletService");
    }

    /* renamed from: a */
    public final synchronized void mo50798a(long j) {
        auou auou = this.f92299a;
        auou.f92221e.mo50711a("onDeviceUnlockLockout. %s: timeoutMs: %s", auou.mo50770o(), Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized void mo50802b(ParcelableTrustAgentEvent parcelableTrustAgentEvent) {
        this.f92299a.mo50759a(parcelableTrustAgentEvent.mo59554a());
    }

    /* renamed from: c */
    public final synchronized boolean mo50803c() {
        return this.f92299a.mo50767l();
    }

    /* renamed from: d */
    public final synchronized boolean mo50804d() {
        return this.f92299a.mo50772q();
    }

    /* renamed from: e */
    public final synchronized boolean mo50805e() {
        return this.f92299a.mo50766k();
    }

    /* renamed from: f */
    public final synchronized boolean mo50806f() {
        return this.f92299a.mo50771p();
    }

    /* renamed from: g */
    public final synchronized Bundle mo50807g() {
        return this.f92299a.mo50773r();
    }

    /* renamed from: h */
    public final synchronized void mo50808h() {
        this.f92299a.mo50777u();
    }

    public auqm(auou auou) {
        super("com.google.android.gms.trustagent.internal.ITrustletService");
        this.f92299a = auou;
    }

    /* renamed from: a */
    public final synchronized void mo50799a(auqq auqq) {
        auou auou = this.f92299a;
        sdo.m34959a(auqq);
        auou.f92221e.mo50711a("registerCallback", new Object[0]);
        synchronized (auou.f92226f) {
            auou.f92227g = auqq;
        }
        auou.mo50780w();
    }

    /* renamed from: a */
    public final synchronized void mo50800a(ParcelableTrustAgentEvent parcelableTrustAgentEvent) {
        this.f92299a.mo50764b(parcelableTrustAgentEvent.mo59554a());
    }

    /* renamed from: a */
    public final synchronized boolean mo50801a() {
        return this.f92299a.mo50768m();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        auqq auqq;
        switch (i) {
            case 1:
                boolean a = mo50801a();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 2:
                boolean c = mo50803c();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, c);
                return true;
            case 3:
                boolean d = mo50804d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                return true;
            case 4:
                boolean e = mo50805e();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, e);
                return true;
            case 5:
                boolean f = mo50806f();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, f);
                return true;
            case 6:
                mo50800a((ParcelableTrustAgentEvent) dcl.m8163a(parcel, ParcelableTrustAgentEvent.CREATOR));
                return true;
            case 7:
                mo50802b((ParcelableTrustAgentEvent) dcl.m8163a(parcel, ParcelableTrustAgentEvent.CREATOR));
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.trustagent.internal.ITrustletServiceCallback");
                    auqq = queryLocalInterface instanceof auqq ? (auqq) queryLocalInterface : new auqo(readStrongBinder);
                } else {
                    auqq = null;
                }
                mo50799a(auqq);
                return true;
            case 9:
                Bundle g = mo50807g();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, g);
                return true;
            case 10:
                mo50808h();
                return true;
            case 11:
                mo50798a(parcel.readLong());
                return true;
            default:
                return false;
        }
    }
}
