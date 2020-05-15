package com.google.android.gms.wallet.p088ui.common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.analytics.events.OverlayActivityActionEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.ui.common.OverlayChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OverlayChimeraActivity extends awce {

    /* renamed from: i */
    int f110449i;

    /* renamed from: j */
    PageDetails f110450j;

    /* renamed from: k */
    private boolean f110451k;

    /* renamed from: a */
    public final void mo51858a(int i) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.m93830a(getApplicationContext(), this.f94163b, 9, 5, i);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        mo51859a(1, intent);
    }

    /* renamed from: c */
    public final void mo51874c(int i) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.m93830a(getApplicationContext(), this.f94163b, i, 4, -1);
        mo51859a(0, intent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.ui.common.OverlayChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        awzk awzk;
        Intent intent = getIntent();
        this.f110450j = (PageDetails) intent.getParcelableExtra("pageDetails");
        this.f110449i = intent.getIntExtra("overlayType", 0);
        this.f94163b = intent.getStringExtra("sessionId");
        if (bundle == null) {
            this.f94164c = (LogContext) intent.getParcelableExtra("logContext");
        } else {
            this.f94164c = (LogContext) bundle.getParcelable("logContext");
        }
        bjst.m104516a(new awfj(getApplicationContext(), awia.m79985a(this)), this.f94164c.mo71783b());
        this.f94167f = intent.getByteArrayExtra("ephemeralPrivateKey");
        this.f94168g = intent.getByteArrayExtra("cReqSessionKey");
        boolean z = intent.getIntExtra("overlayStyle", 1) == 2;
        this.f110451k = z;
        awia.m79981a((Activity) this, mo51881h(), z ? awia.f94384f : awia.f94383e, false);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.wallet_activity_overlay);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.overlay_toolbar));
        mo8628aW().mo15853b(!this.f110451k);
        this.f94166e = (ProgressSpinnerView) findViewById(C0126R.C0129id.progress_spinner_container);
        if (mo51879e() == null) {
            BuyFlowConfig h = mo51881h();
            switch (this.f110449i) {
                case 1:
                    String str = this.f94163b;
                    PageDetails pageDetails = this.f110450j;
                    LogContext logContext = this.f94164c;
                    awzk = new awcj();
                    awzk.setArguments(awzk.m81652a(h, str, pageDetails, logContext));
                    break;
                case 2:
                    String str2 = this.f94163b;
                    PageDetails pageDetails2 = this.f110450j;
                    LogContext logContext2 = this.f94164c;
                    awmv awmv = new awmv();
                    Bundle a = awzk.m81652a(h, str2, pageDetails2, logContext2);
                    a.putBoolean("isDialog", false);
                    a.putBoolean("showCancelButton", false);
                    awmv.setArguments(a);
                    awzk = awmv;
                    break;
                case 3:
                    String str3 = this.f94163b;
                    PageDetails pageDetails3 = this.f110450j;
                    LogContext logContext3 = this.f94164c;
                    awzk = new awma();
                    awzk.setArguments(awzk.m81652a(h, str3, pageDetails3, logContext3));
                    break;
                case 4:
                    PageDetails pageDetails4 = this.f110450j;
                    String str4 = this.f94163b;
                    LogContext logContext4 = this.f94164c;
                    awzk = new awer();
                    awzk.setArguments(awzk.m81652a(h, str4, pageDetails4, logContext4));
                    break;
                case 5:
                    PageDetails pageDetails5 = this.f110450j;
                    String str5 = this.f94163b;
                    LogContext logContext5 = this.f94164c;
                    awzk = new awmq();
                    awzk.setArguments(awzk.m81652a(h, str5, pageDetails5, logContext5));
                    break;
                case 6:
                    PageDetails pageDetails6 = this.f110450j;
                    String str6 = this.f94163b;
                    LogContext logContext6 = this.f94164c;
                    awzk = new awyl();
                    awzk.setArguments(awzk.m81652a(h, str6, pageDetails6, logContext6));
                    break;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported overlay type: %d", Integer.valueOf(this.f110449i)));
            }
            mo51866a(awzk, (int) C0126R.C0129id.overlay_container);
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo51889p() {
        return true;
    }

    /* renamed from: a */
    public final void mo51859a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo51864a(Parcelable parcelable, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("pageDetails", mo51879e().f95398ak);
        OverlayActivityActionEvent.m93830a(getApplicationContext(), this.f94163b, 2, 2, -1);
        mo51859a(-1, intent);
    }
}
