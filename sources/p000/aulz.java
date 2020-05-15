package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: aulz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aulz extends aulu implements aumc {

    /* renamed from: a */
    static final ComponentName f92062a = new ComponentName("com.google.android.apps.unlock", "com.google.android.apps.unlock.state.UnlockTrustStateService");

    /* renamed from: b */
    public static final Object f92063b = new Object();

    /* renamed from: c */
    public static aulz f92064c;

    /* renamed from: e */
    private static final Intent f92065e = new Intent().setComponent(f92062a);

    /* renamed from: d */
    public volatile aulw f92066d;

    /* renamed from: f */
    private final bqgy f92067f = bqgy.m112818c();

    /* renamed from: g */
    private final bqgy f92068g = bqgy.m112818c();

    public aulz() {
        skh.m35531a().mo25690a(rpr.m34216b(), f92065e, new auly(this), 1);
    }

    /* renamed from: a */
    public final aups mo50665a() {
        long j;
        long j2 = -1;
        try {
            aulw aulw = this.f92066d;
            if (aulw != null) {
                Parcel a = aulw.mo8526a(2, aulw.mo8529bj());
                long readLong = a.readLong();
                a.recycle();
                j2 = readLong;
            } else {
                Log.w("Coffee-RemoteTrustState", "The trust state service has not connected yet.");
            }
            j = j2;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("Coffee-RemoteTrustState", valueOf.length() == 0 ? new String("Cannot get last time since unlock: ") : "Cannot get last time since unlock: ".concat(valueOf));
            j = -1;
        }
        return new aups(Status.f30107a, ((Boolean) bqga.m112784b(this.f92067f)).booleanValue(), ((Boolean) bqga.m112784b(this.f92068g)).booleanValue(), j);
    }

    /* renamed from: b */
    public final void mo50664b(boolean z) {
        this.f92068g.mo69138b(Boolean.valueOf(z));
        rpr.m34216b().sendBroadcast(new Intent().setAction("com.google.android.gms.trustagent.TRUST_STATE_CHANGED").putExtra("is_configured", z), "com.google.android.gms.trustagent.permission.TRUSTAGENT_STATE");
    }

    /* renamed from: a */
    public final void mo50663a(boolean z) {
        this.f92067f.mo69138b(Boolean.valueOf(z));
        rpr.m34216b().sendBroadcast(new Intent().setAction("com.google.android.gms.trustagent.TRUST_STATE_CHANGED").putExtra("is_trusted", z), "com.google.android.gms.trustagent.permission.TRUSTAGENT_STATE");
    }
}
