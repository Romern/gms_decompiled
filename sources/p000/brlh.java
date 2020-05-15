package p000;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: brlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brlh extends brpj {

    /* renamed from: a */
    final /* synthetic */ brli f142909a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public brlh(brli brli, brpj brpj) {
        super(brpj.f143129c, brpj.f143128b);
        this.f142909a = brli;
    }

    /* renamed from: a */
    public final void mo69680a(Status status) {
        brli.f142910a.mo25416d("onFailure", new Object[0]);
        brli.m114129a(this.f142909a.f142913d, new brlf(), status);
        this.f142909a.f142917h = 5;
    }

    /* renamed from: a */
    public final void mo69681a(String str) {
        brli.f142910a.mo25416d("onCodeSent", new Object[0]);
        brli brli = this.f142909a;
        brli.f142918i = str;
        brli.f142917h = 3;
        brli.mo69684b();
        brli brli2 = this.f142909a;
        if (brli2.f142914e && !TextUtils.isEmpty(brli2.f142919j)) {
            this.f142909a.mo69682a(false);
        }
        brli brli3 = this.f142909a;
        if (!brli3.f142915f || !brli3.f142914e) {
            brli3.mo69685c();
        }
    }
}
