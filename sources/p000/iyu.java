package p000;

import android.content.Context;
import android.os.Parcel;

/* renamed from: iyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyu extends dck implements iyv {

    /* renamed from: a */
    private final juu f21937a;

    public iyu() {
        super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
    }

    /* renamed from: b */
    private static void m16359b() {
        if (!spn.m35869b()) {
            throw new SecurityException("Calling pkg not zero party.");
        }
    }

    /* renamed from: a */
    public final long mo13498a() {
        long j;
        m16359b();
        juu juu = this.f21937a;
        synchronized (juu.f23272b) {
            j = -1;
            if (juu.mo14120b()) {
                j = juu.f23271a.getLong("lastSecureUnlockTime", -1);
            }
        }
        return j;
    }

    /* renamed from: c */
    public final long mo13499c() {
        long j;
        m16359b();
        juu juu = this.f21937a;
        synchronized (juu.f23272b) {
            j = -1;
            if (juu.mo14120b()) {
                j = juu.f23271a.getLong("lockScreenSecureDuration", -1);
            }
        }
        return j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iyu(Context context) {
        super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
        juu a = juu.m17357a(context);
        this.f21937a = a;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            long a = mo13498a();
            parcel2.writeNoException();
            parcel2.writeLong(a);
        } else if (i != 2) {
            return false;
        } else {
            long c = mo13499c();
            parcel2.writeNoException();
            parcel2.writeLong(c);
        }
        return true;
    }
}
