package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletRequestedEvent;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awri {

    /* renamed from: a */
    public final Context f94914a;

    /* renamed from: b */
    public final awsz f94915b;

    /* renamed from: c */
    public final Bundle f94916c;

    /* renamed from: d */
    public final String f94917d;

    /* renamed from: e */
    public final String f94918e;

    /* renamed from: f */
    public BuyFlowConfig f94919f;

    /* renamed from: g */
    public String f94920g;

    /* renamed from: h */
    public int f94921h = 1;

    public awri(Context context, Bundle bundle, String str, String str2, awsz awsz) {
        this.f94914a = context;
        this.f94915b = awsz;
        this.f94916c = bundle;
        this.f94917d = str;
        this.f94918e = str2;
    }

    /* renamed from: a */
    public final LoadMaskedWalletServiceResponse mo52503a(int i) {
        this.f94921h = i;
        awbb a = MaskedWallet.m93790a();
        a.mo51808a(this.f94917d);
        a.mo51809b(this.f94918e);
        return new LoadMaskedWalletServiceResponse(Bundle.EMPTY, a.f94143a, 410);
    }

    /* renamed from: a */
    public final void mo52504a() {
        boolean z;
        String str;
        boolean z2 = false;
        if (this.f94919f == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f94920g == null) {
            z2 = true;
        }
        sdo.m34970a(z2);
        BuyFlowConfig a = awrt.m80827a(this.f94916c, this.f94917d);
        this.f94919f = a;
        Account account = a.f110418b.f110407b;
        Context context = this.f94914a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.f94920g = OwMaskedWalletRequestedEvent.m93834a(context, str, this.f94919f, true);
    }
}
