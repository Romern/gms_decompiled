package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.speech.VoiceUnlockState;

/* renamed from: auzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzf extends sji {

    /* renamed from: a */
    private static final aunx f92818a = new aunx("TrustAgent", "GetVoiceUnlockStateOperation");

    /* renamed from: d */
    private final asea f92819d;

    public auzf(asea asea) {
        super(52, "GetVoiceUnlockStateOperation");
        this.f92819d = asea;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        boolean z = false;
        f92818a.mo50711a("execute", new Object[0]);
        auzb auzb = auzc.f92814a.f92815b;
        boolean z2 = auzb != null && auzb.mo51073f();
        if (auzb != null && auzb.mo51074h()) {
            z = true;
        }
        this.f92819d.mo49080a(Status.f30107a, new VoiceUnlockState(z2, z));
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        f92818a.mo50711a("onFailure", new Object[0]);
        this.f92819d.mo49080a(status, (VoiceUnlockState) null);
    }
}
