package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.speech.VoiceUnlockScoreInfo;

/* renamed from: auzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzg extends sji {

    /* renamed from: d */
    private static final aunx f92820d = new aunx("TrustAgent", "ReportVoiceUnlockScoreOperation");

    /* renamed from: a */
    private final VoiceUnlockScoreInfo f92821a;

    /* renamed from: e */
    private final asea f92822e;

    public auzg(asea asea, VoiceUnlockScoreInfo voiceUnlockScoreInfo) {
        super(52, "ReportVoiceUnlockScoreOperation");
        this.f92822e = asea;
        this.f92821a = voiceUnlockScoreInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        f92820d.mo50711a("execute", new Object[0]);
        auzb auzb = auzc.f92814a.f92815b;
        if (auzb != null) {
            f92820d.mo50711a("Voice unlock is available. Handle voice unlock.", new Object[0]);
            auzb.mo51071a(this.f92821a.f108276d);
        } else {
            f92820d.mo50711a("Voice unlock is not available.", new Object[0]).mo50708c();
        }
        this.f92822e.mo49079a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        f92820d.mo50711a("onFailure", new Object[0]);
        this.f92822e.mo49079a(status);
    }
}
