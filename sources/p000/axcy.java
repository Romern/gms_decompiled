package p000;

import com.google.android.gms.wallet.analytics.events.ReauthApiEvent;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import java.util.UUID;

/* renamed from: axcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axcy extends awpc {

    /* renamed from: a */
    final /* synthetic */ axcz f95800a;

    public axcy(axcz axcz) {
        this.f95800a = axcz;
    }

    /* renamed from: a */
    public final void mo51894a() {
        axcz axcz = this.f95800a;
        int i = axcz.f95801l;
        axcz.mo53027a(100);
    }

    /* renamed from: b */
    public final void mo51897b() {
        axcz axcz = this.f95800a;
        int i = axcz.f95801l;
        axcz.mo53027a(-1);
    }

    /* renamed from: a */
    public final void mo52025a(ReauthProofTokenResponse reauthProofTokenResponse) {
        axcz axcz = this.f95800a;
        ReauthApiEvent.m93841a(axcz.f94160a, ReauthApiEvent.m93842b(reauthProofTokenResponse.f110398b), reauthProofTokenResponse.f110399c, axcz.f95806f, UUID.randomUUID().toString());
        int a = ReauthApiEvent.m93840a(reauthProofTokenResponse.f110398b);
        bjst.m104524a(axcz.f94161b, axcz.f95805e, a == 0 ? 2 : 5, a, null, null, 1);
        if (reauthProofTokenResponse.f110398b == 0) {
            awgc a2 = awgc.m79888a(axcz, "doAnimateSuccess");
            a2.f94286a.putString("encodedPreauthProofToken", reauthProofTokenResponse.f110397a);
            axcz.f95808h.postDelayed(a2, axcz.f95809i.mo60136a());
            return;
        }
        awgc a3 = awgc.m79888a(axcz, "doAnimateError");
        a3.f94286a.putInt("errorCode", reauthProofTokenResponse.f110398b);
        axcz.f95808h.postDelayed(a3, axcz.f95809i.mo60136a());
    }
}
