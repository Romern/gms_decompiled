package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: auzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzh extends sji {

    /* renamed from: a */
    private static final aunx f92823a = new aunx("TrustAgent", "SetVoiceUnlockEnabledOperation");

    /* renamed from: d */
    private final boolean f92824d;

    /* renamed from: e */
    private final asea f92825e;

    public auzh(asea asea, boolean z) {
        super(52, "SetVoiceUnlockEnabledOperation");
        this.f92825e = asea;
        this.f92824d = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asea.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      asea.a(com.google.android.gms.common.api.Status, com.google.android.gms.speech.VoiceUnlockState):void
      dcj.a(int, android.os.Parcel):android.os.Parcel
      asea.a(com.google.android.gms.common.api.Status, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        f92823a.mo50711a("execute", new Object[0]);
        auzb auzb = auzc.f92814a.f92815b;
        if (auzb != null) {
            auzb.mo51072b(this.f92824d);
        }
        this.f92825e.mo49081a(Status.f30107a, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asea.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      asea.a(com.google.android.gms.common.api.Status, com.google.android.gms.speech.VoiceUnlockState):void
      dcj.a(int, android.os.Parcel):android.os.Parcel
      asea.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        f92823a.mo50711a("onFailure", new Object[0]);
        this.f92825e.mo49081a(status, false);
    }
}
