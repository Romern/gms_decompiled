package p000;

import com.google.android.gms.auth.proximity.BleBackgroundAdvertiser$WakeUpBroadcastReceiver;

/* renamed from: jit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jit implements jir {

    /* renamed from: a */
    final /* synthetic */ asfb f22566a;

    /* renamed from: b */
    final /* synthetic */ BleBackgroundAdvertiser$WakeUpBroadcastReceiver f22567b;

    public jit(BleBackgroundAdvertiser$WakeUpBroadcastReceiver bleBackgroundAdvertiser$WakeUpBroadcastReceiver, asfb asfb) {
        this.f22567b = bleBackgroundAdvertiser$WakeUpBroadcastReceiver;
        this.f22566a = asfb;
    }

    /* renamed from: a */
    public final void mo13767a() {
        this.f22566a.mo49120c();
    }

    /* renamed from: a */
    public final void mo13768a(String str) {
        sek sek = jiu.f22568a;
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        sek.mo25418e("Advertisement rotation failed: %s", objArr);
        this.f22567b.f11093a.mo13772c();
        this.f22566a.mo49120c();
    }
}
