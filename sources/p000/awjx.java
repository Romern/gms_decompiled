package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awjx {

    /* renamed from: a */
    public Intent f94574a;

    /* renamed from: b */
    protected Bundle f94575b;

    /* renamed from: c */
    private awyb f94576c;

    /* renamed from: d */
    private awxz f94577d;

    /* renamed from: e */
    private final boolean f94578e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, java.lang.String, int]
     candidates:
      awjx.<init>(java.lang.String, java.lang.String, boolean, android.content.Intent):void
      awjx.<init>(android.content.Context, java.lang.String, java.lang.String, boolean):void */
    public awjx(Context context, String str, String str2) {
        this(context, str, str2, true);
    }

    /* renamed from: a */
    public final Intent mo52186a() {
        awyb awyb = this.f94576c;
        awyb.mo52749a(this.f94577d.f95270a);
        BuyFlowConfig a = awyb.mo52748a();
        this.f94574a.putExtra("com.google.android.gms.wallet.buyFlowConfig", a);
        if (this.f94578e) {
            Account account = a.f110418b.f110407b;
            sdo.m34966a(account, "Buyer account is required");
            this.f94574a.putExtra("com.google.android.gms.wallet.account", account);
        }
        if (this.f94574a.getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0) == 0) {
            this.f94574a.putExtra("com.google.android.gms.wallet.intentBuildTimeMs", SystemClock.elapsedRealtime());
        }
        Intent intent = this.f94574a;
        mo52189a(intent);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52189a(Intent intent) {
        throw null;
    }

    /* renamed from: b */
    public final void mo52191b() {
        this.f94577d.mo52738a(0);
    }

    public awjx(Context context, String str, String str2, boolean z) {
        this(context, str, str2, z, null);
    }

    /* renamed from: b */
    public final void mo52192b(int i) {
        this.f94577d.mo52745c(i);
    }

    public awjx(Context context, String str, String str2, boolean z, Intent intent) {
        Intent intent2 = intent == null ? new Intent() : new Intent(intent);
        this.f94574a = intent2;
        intent2.setPackage("com.google.android.gms");
        this.f94574a.setAction(str);
        if (intent != null) {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
            ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
            this.f94575b = applicationParameters.f110408c;
            this.f94577d = ApplicationParameters.m94174a(applicationParameters);
            awyb a = BuyFlowConfig.m94176a(buyFlowConfig);
            a.mo52752c(str2);
            this.f94576c = a;
        } else {
            this.f94575b = new Bundle();
            awxz a2 = ApplicationParameters.m94173a();
            a2.mo52740a(this.f94575b);
            this.f94577d = a2;
            awyb a3 = BuyFlowConfig.m94175a();
            a3.mo52751b(context.getPackageName());
            a3.mo52752c(str2);
            this.f94576c = a3;
        }
        this.f94578e = z;
    }

    /* renamed from: a */
    public final void mo52187a(int i) {
        this.f94577d.mo52744b(i);
    }

    /* renamed from: a */
    public final void mo52188a(Account account) {
        this.f94577d.mo52739a(account);
    }

    public awjx(String str, String str2, boolean z, Intent intent) {
        this(null, str, str2, z, intent);
    }

    /* renamed from: a */
    public final void mo52190a(WalletCustomTheme walletCustomTheme) {
        this.f94577d.mo52741a(walletCustomTheme);
    }
}
