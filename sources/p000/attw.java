package p000;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: attw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attw extends atue {

    /* renamed from: a */
    public static final srn f90890a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    final awkh f90891b;

    public attw(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
        this.f90891b = tokenizePanChimeraActivity.f108913j;
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            if (intent.hasExtra("output_add_token")) {
                atsy.f90813E = intent.getByteArrayExtra("output_add_token");
                byte[] bArr = atsy.f90813E;
                if (bArr == null || bArr.length <= 0) {
                    this.f90898f.f108909f = true;
                    return;
                }
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("output_untokenized_card");
            if (byteArrayExtra != null) {
                try {
                    if (atsy.f90818J != null) {
                        bxvd da = btjq.f149162e.mo74144da();
                        da.mo73635b(byteArrayExtra, bxus.m123744c());
                        byte[] bArr2 = (byte[]) atsy.f90818J.get(((btjq) da.f164949b).f149164a);
                        if (bArr2 != null) {
                            bxtx a = bxtx.m123261a(bArr2);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            a.getClass();
                            ((btjq) da.f164949b).f149166c = a;
                            byteArrayExtra = ((btjq) da.mo74062i()).mo73642k();
                        }
                    }
                    atsy.f90812D = byteArrayExtra;
                } catch (bxwf e) {
                    this.f90898f.f108909f = true;
                    return;
                }
            } else {
                atsy.f90812D = null;
            }
            mo50175a(atsy, 6);
            return;
        }
        mo50187b(i2, 8);
        mo50178a();
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        this.f90898f.mo59476a((Drawable) null);
        if (atsy.f90811C != null || atsy.f90812D != null || atsy.f90821M || (atsy.mo50166d() && !atsy.f90862y)) {
            mo50175a(atsy, 6);
            return;
        }
        boolean z = atsy.f90852o;
        atow.m76241a(this.f90891b.mo52198a(new GetClientTokenRequest(atvh.m76455a(this.f90898f))), 12, TimeUnit.SECONDS).mo50374a(this.f90898f, new attt(this, atsy));
    }

    /* renamed from: a */
    public final void mo50175a(atsy atsy, int i) {
        atsy.f90818J = null;
        mo50180a(i, atsy);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo50176a(atsy atsy, aucb aucb) {
        if (aucb.mo50384b()) {
            byte[] bArr = (byte[]) aucb.mo50386d();
            atsy.f90809A = bArr;
            if (atsy.mo50164b() || atsy.mo50165c()) {
                mo50175a(atsy, 20);
            } else if (atsy.f90862y) {
                mo50175a(atsy, 6);
            } else if (atsy.f90811C == null && atsy.f90812D == null) {
                askf askf = new askf(atsy.f90857t, askc.m74272b(), this.f90898f);
                bxvd da = btjf.f149105c.mo74144da();
                bxtx a = bxtx.m123261a(bArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((btjf) da.f164949b).f149107a = a;
                atff.m75765a(askf, "t/untokenizedcards/list", (btjf) da.mo74062i(), btjg.f149109e, new attv(this, askf, atsy, bArr), this);
            }
        } else {
            bnsl bnsl = (bnsl) f90890a.mo68388c();
            bnsl.mo68437a(aucb.mo50387e());
            bnsl.mo68432a("attw", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get client token");
            mo50184a(mo50186b(C0126R.string.common_something_went_wrong), mo50186b(C0126R.string.tp_generic_error_content));
        }
    }
}
