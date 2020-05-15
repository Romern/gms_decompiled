package p000;

import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;

/* renamed from: aiwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwl extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f69940a;

    /* renamed from: b */
    final /* synthetic */ CopresenceBroadcastReceiver f69941b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiwl(CopresenceBroadcastReceiver copresenceBroadcastReceiver, String str, String str2) {
        super(str);
        this.f69941b = copresenceBroadcastReceiver;
        this.f69940a = str2;
    }

    public final void run() {
        CopresenceBroadcastReceiver copresenceBroadcastReceiver = this.f69941b;
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(this.f69940a)) {
            srn srn = ahfq.f67120a;
            ajat ajat = copresenceBroadcastReceiver.f80671a;
            byyg c = ajat.mo38417c();
            if (c != null) {
                ajat.f70277e = c;
                ajat.mo38416b();
            }
        }
    }
}
