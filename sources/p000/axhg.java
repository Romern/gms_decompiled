package p000;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhg implements axfh {

    /* renamed from: a */
    final /* synthetic */ axfi f95944a;

    /* renamed from: b */
    final /* synthetic */ CompleteMoneyTransferChimeraActivity f95945b;

    public axhg(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, axfi axfi) {
        this.f95945b = completeMoneyTransferChimeraActivity;
        this.f95944a = axfi;
    }

    /* renamed from: a */
    public final void mo53099a(int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        int i2 = i;
        byte[] bArr3 = bArr;
        if (!this.f95945b.isDestroyed()) {
            this.f95945b.mo60176l();
            this.f95945b.mo53238P(72);
            if (i2 == 1) {
                CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95945b;
                completeMoneyTransferChimeraActivity.mo53238P(90);
                completeMoneyTransferChimeraActivity.f110659b.mo60203a(aux.m2149a(completeMoneyTransferChimeraActivity.getResources(), C0126R.C0127drawable.quantum_ic_info_outline_vd_theme_24, completeMoneyTransferChimeraActivity.getTheme()), str, str2, completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_go_back), new axgf(completeMoneyTransferChimeraActivity), completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_provide_info), new axgg(completeMoneyTransferChimeraActivity));
                completeMoneyTransferChimeraActivity.f110661d.mo60211b(1);
            } else if (i2 == 2) {
                this.f95945b.mo60167a(str, str2);
            } else if (i2 == 3) {
                CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity2 = this.f95945b;
                completeMoneyTransferChimeraActivity2.mo53238P(82);
                completeMoneyTransferChimeraActivity2.f110659b.mo60203a(aux.m2149a(completeMoneyTransferChimeraActivity2.getResources(), C0126R.C0127drawable.quantum_ic_lock_outline_vd_theme_24, completeMoneyTransferChimeraActivity2.getTheme()), str, str2, completeMoneyTransferChimeraActivity2.getString(C0126R.string.walletp2p_go_back), new axfx(completeMoneyTransferChimeraActivity2), completeMoneyTransferChimeraActivity2.getString(C0126R.string.common_continue), new axfz(completeMoneyTransferChimeraActivity2));
                completeMoneyTransferChimeraActivity2.f110661d.mo60211b(1);
            } else if (i2 == 4) {
                CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity3 = this.f95945b;
                completeMoneyTransferChimeraActivity3.mo53238P(78);
                completeMoneyTransferChimeraActivity3.f110659b.mo60203a(aux.m2149a(completeMoneyTransferChimeraActivity3.getResources(), C0126R.C0127drawable.quantum_ic_credit_card_vd_theme_24, completeMoneyTransferChimeraActivity3.getTheme()), str, str2, completeMoneyTransferChimeraActivity3.getString(C0126R.string.walletp2p_go_back), new axft(completeMoneyTransferChimeraActivity3), completeMoneyTransferChimeraActivity3.getString(C0126R.string.walletp2p_confirm_cvn_action_button), new axfu(completeMoneyTransferChimeraActivity3));
                completeMoneyTransferChimeraActivity3.f110661d.mo60211b(1);
            } else if (bArr3 != null) {
                CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity4 = this.f95945b;
                completeMoneyTransferChimeraActivity4.f110669n = bArr2;
                completeMoneyTransferChimeraActivity4.mo53238P(141);
                completeMoneyTransferChimeraActivity4.f110659b.mo60203a(aux.m2149a(completeMoneyTransferChimeraActivity4.getResources(), C0126R.C0127drawable.quantum_ic_info_outline_vd_theme_24, completeMoneyTransferChimeraActivity4.getTheme()), str, str2, completeMoneyTransferChimeraActivity4.getString(C0126R.string.walletp2p_go_back), new axfv(completeMoneyTransferChimeraActivity4), completeMoneyTransferChimeraActivity4.getString(C0126R.string.common_continue), new axfw(completeMoneyTransferChimeraActivity4, bArr3));
                completeMoneyTransferChimeraActivity4.f110661d.mo60211b(1);
            } else {
                this.f95945b.mo53238P(143);
                this.f95945b.mo60174j();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity.a(android.content.Intent, java.lang.String, boolean):void
     arg types: [android.content.Intent, java.lang.String, int]
     candidates:
      com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity.a(long, java.lang.String, java.lang.String):void
      com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity.a(android.content.Intent, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo53100a(Bundle bundle, String str) {
        if (!this.f95945b.isDestroyed()) {
            this.f95945b.mo60176l();
            this.f95945b.mo53238P(71);
            axma m = this.f95945b.mo60177m();
            CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95945b;
            btsb btsb = completeMoneyTransferChimeraActivity.f110672q.f110643b;
            long j = btsb.f150177b;
            String str2 = btsb.f150178c;
            String a = axog.m82805a(completeMoneyTransferChimeraActivity.getIntent());
            String stringExtra = this.f95945b.getIntent().getStringExtra("transfer_idempotency_key");
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            if (a == null) {
                a = str3;
            }
            if (stringExtra != null) {
                str3 = stringExtra;
            }
            bxvd da = bwah.f158643i.mo74144da();
            String str4 = m.f96172a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwah bwah = (bwah) da.f164949b;
            str4.getClass();
            int i = bwah.f158645a | 2;
            bwah.f158645a = i;
            bwah.f158647c = str4;
            bwah.f158648d = 3;
            bwah.f158645a = i | 4;
            bxvd da2 = bwag.f158636f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwag bwag = (bwag) da2.f164949b;
            int i2 = bwag.f158638a | 1;
            bwag.f158638a = i2;
            bwag.f158639b = j;
            str2.getClass();
            int i3 = i2 | 2;
            bwag.f158638a = i3;
            bwag.f158640c = str2;
            a.getClass();
            int i4 = i3 | 8;
            bwag.f158638a = i4;
            bwag.f158642e = a;
            str3.getClass();
            bwag.f158638a = i4 | 4;
            bwag.f158641d = str3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwah bwah2 = (bwah) da.f164949b;
            bwag bwag2 = (bwag) da2.mo74062i();
            bwag2.getClass();
            bwah2.f158652h = bwag2;
            bwah2.f158645a |= 128;
            m.mo53239a((bwah) da.mo74062i(), stringExtra, 1);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity2 = this.f95945b;
            completeMoneyTransferChimeraActivity2.f110675t = intent;
            completeMoneyTransferChimeraActivity2.f110676u = str;
            completeMoneyTransferChimeraActivity2.f110674s = true;
            completeMoneyTransferChimeraActivity2.f110663f.announceForAccessibility(completeMoneyTransferChimeraActivity2.getString(C0126R.string.common_done));
            this.f95945b.mo60162a(intent, str, true);
        }
    }

    /* renamed from: a */
    public final void mo53101a(Status status, ErrorDetails errorDetails) {
        if (!this.f95945b.isDestroyed()) {
            this.f95945b.mo60176l();
            this.f95945b.mo53238P(73);
            if (status.f30115i == 7) {
                this.f95945b.mo60165a(new axhf(this, this.f95944a));
                return;
            }
            CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95945b;
            if (errorDetails == null) {
                completeMoneyTransferChimeraActivity.mo60174j();
            } else {
                completeMoneyTransferChimeraActivity.mo60164a(errorDetails);
            }
        }
    }
}
