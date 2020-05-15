package com.google.android.gms.wallet.p081ib;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.p084ow.ShowLockScreenChimeraActivity;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: com.google.android.gms.wallet.ib.LockScreenForFullWalletChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockScreenForFullWalletChimeraActivity extends FragmentActivity {

    /* renamed from: c */
    public static final /* synthetic */ int f110233c = 0;

    /* renamed from: d */
    private static final String f110234d = awhg.m79946a("lockScreenForFullWallet");

    /* renamed from: a */
    LoadFullWalletServiceRequest f110235a;

    /* renamed from: b */
    int f110236b = 1;

    /* renamed from: e */
    private BuyFlowConfig f110237e;

    /* renamed from: f */
    private boolean f110238f;

    /* renamed from: g */
    private int f110239g;

    /* renamed from: h */
    private awhg f110240h;

    /* renamed from: i */
    private final awpc f110241i = new awmk(this);

    /* renamed from: a */
    public static Intent m93993a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.ib.LockScreenForFullWalletActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        return intent2;
    }

    /* renamed from: b */
    private final void m93997b() {
        if (this.f110239g == -1) {
            this.f110239g = mo59939a().f94357a.mo52395a(this.f110241i);
        }
    }

    /* renamed from: c */
    private final void m93998c() {
        m93995a(4, -1, 1);
        m93996a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 501) {
            this.f110236b = 4;
            if (i2 == -1) {
                mo59939a().f94357a.mo52423a(this.f110235a);
            } else if (i2 != 0) {
                this.f110236b = 5;
                mo59940a(1013);
            } else {
                this.f110236b = 3;
                m93998c();
            }
        } else if (i != 502) {
            super.onActivityResult(i, i2, intent);
        } else {
            m93996a(i2, intent);
        }
    }

    public final void onBackPressed() {
        m93998c();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f110237e = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        this.f110235a = (LoadFullWalletServiceRequest) intent.getParcelableExtra("loadFullWalletServiceRequest");
        sdo.checkIfNull(this.f110237e, "Buyflow config is required!");
        sdo.checkIfNull(this.f110235a, "request is required!");
        if (bundle != null) {
            this.f110238f = bundle.getBoolean("startedLockscreenActivity");
            this.f110239g = bundle.getInt("serviceConnectionSavePoint");
            this.f110236b = bpij.m111956a(bundle.getInt("lockscreenStatus"));
        } else {
            this.f110238f = false;
            this.f110239g = -1;
            this.f110236b = 1;
        }
        if (mo59939a() == null) {
            BuyFlowConfig buyFlowConfig = this.f110237e;
            this.f110240h = awhg.m79945a(8, buyFlowConfig, buyFlowConfig.f110418b.f110407b);
            getSupportFragmentManager().beginTransaction().add(this.f110240h, f110234d).commit();
        }
        setFinishOnTouchOutside(false);
    }

    public final void onPause() {
        super.onPause();
        m93997b();
    }

    public final void onResume() {
        super.onResume();
        mo59939a().f94357a.mo52397a(this.f110241i, this.f110239g);
        this.f110239g = -1;
        if (!this.f110238f) {
            startActivityForResult(ShowLockScreenChimeraActivity.m94076a(this.f110237e), 501);
            this.f110238f = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m93997b();
        bundle.putInt("serviceConnectionSavePoint", this.f110239g);
        bundle.putBoolean("startedLockscreenActivity", this.f110238f);
        int i = this.f110236b;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("lockscreenStatus", i2);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static Intent m93994a(BuyFlowConfig buyFlowConfig, LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        sdo.checkIfNull(buyFlowConfig, "buyFlowConfig is required");
        sdo.checkIfNull(loadFullWalletServiceRequest, "request is required");
        Intent intent = new Intent("com.google.android.gms.wallet.ib.ACTION_LOCK_SCREEN_FOR_FULL_WALLET");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent.putExtra("loadFullWalletServiceRequest", loadFullWalletServiceRequest);
        return intent;
    }

    /* renamed from: a */
    private final void m93995a(int i, int i2, int i3) {
        Account account = this.f110237e.f110418b.f110407b;
        String str = account != null ? account.name : null;
        BuyFlowConfig buyFlowConfig = this.f110237e;
        int i4 = i3 - 1;
        int i5 = this.f110236b;
        int i6 = i5 - 1;
        if (i5 != 0) {
            OwFullWalletRequestedEvent.m93832a(this, buyFlowConfig, i, i2, i4, 0, 0, i6, str, this.f110235a.f110346b.f109795a);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    private final void m93996a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final awhg mo59939a() {
        if (this.f110240h == null) {
            this.f110240h = (awhg) getSupportFragmentManager().findFragmentByTag(f110234d);
        }
        return this.f110240h;
    }

    /* renamed from: a */
    public final void mo59940a(int i) {
        ReportErrorChimeraIntentOperation.m94035a(this.f110237e, this.f110235a.f110346b.f109795a, 5, 8, i - 1, this);
        m93995a(5, 8, i);
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8);
        awap a = FullWallet.m93786a();
        a.mo51790a(this.f110235a.f110346b.f109795a);
        a.mo51791b(this.f110235a.f110346b.f109796b);
        intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", a.f94139a);
        m93996a(1, intent);
    }

    /* renamed from: a */
    public final void mo59941a(LoadFullWalletServiceResponse loadFullWalletServiceResponse) {
        PendingIntent pendingIntent;
        int i;
        Bundle bundle = loadFullWalletServiceResponse.f110348a;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(loadFullWalletServiceResponse.f110350c, pendingIntent);
        if (connectionResult.mo17670a()) {
            try {
                connectionResult.mo17669a(getContainerActivity(), 502);
            } catch (IntentSender.SendIntentException e) {
                mo59940a(1014);
            }
        } else {
            Intent intent = new Intent();
            Bundle bundle2 = loadFullWalletServiceResponse.f110348a;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            FullWallet fullWallet = loadFullWalletServiceResponse.f110349b;
            if (fullWallet != null) {
                intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            }
            int i2 = loadFullWalletServiceResponse.f110350c;
            if (i2 != 0) {
                intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i2);
            }
            if (loadFullWalletServiceResponse.f110350c == 0) {
                i = -1;
            } else {
                i = 1;
            }
            m93996a(i, intent);
        }
    }
}
