package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.UUID;

/* renamed from: awef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awef extends awcb implements bjfx, bjhl {

    /* renamed from: a */
    public final bjgo f94200a = new bjlf();

    /* renamed from: b */
    public final deu f94201b;

    /* renamed from: c */
    bjhm f94202c;

    /* renamed from: d */
    public CoordinatorLayout f94203d;

    /* renamed from: e */
    public final bjfi f94204e;

    /* renamed from: f */
    public awei f94205f;

    /* renamed from: g */
    public bjsj f94206g;

    /* renamed from: h */
    public boolean f94207h = false;

    /* renamed from: i */
    public final aweg f94208i = new aweg();

    /* renamed from: j */
    public final bjle f94209j = new bjle();

    /* renamed from: k */
    private int f94210k;

    /* renamed from: l */
    private BuyFlowConfig f94211l;

    public awef(deu deu) {
        this.f94201b = deu;
        this.f94204e = new bjfi(deu);
    }

    /* renamed from: a */
    public static Intent m79686a(Context context, int i, BuyFlowConfig buyFlowConfig, long j) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.firstparty.ACTION_BENDER3");
        intent.setClassName(context, "com.google.android.gms.wallet.activity.GenericDelegatorInternalActivity");
        intent.putExtra("widgetType", i);
        intent.putExtra("buyflowConfig", buyFlowConfig);
        intent.putExtra("com.google.android.gms.wallet.intentBuildTimeMs", j);
        return intent;
    }

    /* renamed from: b */
    public final void mo51848b() {
        this.f94202c.mo65293z();
    }

    /* renamed from: c */
    public final void mo51850c() {
        this.f94202c.mo65280A();
        this.f94205f.mo65280A();
    }

    /* renamed from: d */
    public final void mo51852d() {
        this.f94202c.mo65281B();
        this.f94205f.mo65281B();
    }

    /* renamed from: e */
    public final void mo51853e() {
        this.f94202c.mo65282C();
    }

    /* renamed from: f */
    public final void mo51854f() {
        this.f94202c.mo65283D();
        this.f94205f.mo65283D();
    }

    /* renamed from: g */
    public final void mo52013g() {
        this.f94206g = new bjsj(this.f94201b, C1133kh.m17846d(this.f94201b), new awee(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d  */
    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        WalletCustomTheme walletCustomTheme;
        if (chfk.f188562a.mo6606a().mo85196a()) {
            awcf.m79640a(this.f94201b);
        }
        int i3 = 0;
        this.f94210k = this.f94201b.getIntent().getIntExtra("widgetType", 0);
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) this.f94201b.getIntent().getParcelableExtra("buyflowConfig");
        this.f94211l = buyFlowConfig;
        deu deu = this.f94201b;
        if (cheu.m148617b()) {
            z = awia.m79999b(deu, buyFlowConfig);
        } else {
            z = false;
        }
        deu.setTheme(!z ? C0126R.style.Theme_Wallet_Bender3_Light_NoActionBar : C0126R.style.Theme_Wallet_Bender3_Dark_NoActionBar);
        deu.getTheme().applyStyle(C0126R.style.Theme_Wallet_Bender3_Common, true);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.f94201b);
        this.f94203d = coordinatorLayout;
        coordinatorLayout.setFitsSystemWindows(true);
        this.f94201b.setContentView(this.f94203d);
        awpq.m80645a((dnx) this.f94201b);
        bjfy.m103327b(this.f94201b).f122632f = this;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("widgetControllerState");
            bjhm bjhm = new bjhm(this.f94201b, (WidgetConfig) bundle2.getParcelable("widgetConfig"), bundle2.getLong("clientSessionId"), this, bundle2);
            this.f94202c = bjhm;
            this.f94205f = awej.m79707a(this.f94201b, bjhm, bundle.getBundle("widgetAdapterState"));
            boolean z2 = bundle.getBoolean("biometricInProgressKey");
            this.f94207h = z2;
            if (z2) {
                mo52013g();
                return;
            }
            return;
        }
        deu deu2 = this.f94201b;
        BuyFlowConfig buyFlowConfig2 = this.f94211l;
        WidgetConfig widgetConfig = new WidgetConfig();
        widgetConfig.f151760a = buyFlowConfig2.f110418b.f110407b;
        widgetConfig.f151762c = this.f94210k;
        widgetConfig.f151763d = awft.m79871a(this.f94201b);
        widgetConfig.f151764e = C0126R.style.Theme_Wallet_Bender3_Strings;
        ApplicationParameters applicationParameters = buyFlowConfig2.f110418b;
        int i4 = applicationParameters.f110406a;
        widgetConfig.f151761b = i4 != 0 ? i4 != 1 ? i4 != 3 ? 22 : 2 : 1 : 0;
        int i5 = applicationParameters.f110416k;
        int i6 = this.f94210k;
        if (i5 != 1) {
            if (i5 == 2) {
                i = 2;
            } else if (i6 == 1 || i6 == 2) {
                i = 2;
            }
            widgetConfig.f151767h = i;
            i2 = applicationParameters.f110410e;
            if (i2 != 2) {
                i3 = 1;
            } else if (i2 == 3) {
                i3 = 2;
            }
            widgetConfig.f151769j = i3;
            walletCustomTheme = applicationParameters.f110411f;
            if (walletCustomTheme != null) {
                String str = walletCustomTheme.f110170c;
                if (TextUtils.isEmpty(str)) {
                    widgetConfig.f151766g = buyFlowConfig2.f110419c;
                } else {
                    widgetConfig.f151766g = str;
                }
                int i7 = buyFlowConfig2.f110418b.f110411f.f110168a;
                if (i7 != 0) {
                    widgetConfig.f151765f = i7;
                }
            }
            widgetConfig.f151768i = this.f94201b.getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0);
            bjhm bjhm2 = new bjhm(deu2, widgetConfig, UUID.randomUUID().getLeastSignificantBits(), this, null);
            this.f94202c = bjhm2;
            awei a = awej.m79707a(this.f94201b, bjhm2, null);
            this.f94205f = a;
            a.mo52008a();
        }
        i = 1;
        widgetConfig.f151767h = i;
        i2 = applicationParameters.f110410e;
        if (i2 != 2) {
        }
        widgetConfig.f151769j = i3;
        walletCustomTheme = applicationParameters.f110411f;
        if (walletCustomTheme != null) {
        }
        widgetConfig.f151768i = this.f94201b.getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0);
        bjhm bjhm22 = new bjhm(deu2, widgetConfig, UUID.randomUUID().getLeastSignificantBits(), this, null);
        this.f94202c = bjhm22;
        awei a2 = awej.m79707a(this.f94201b, bjhm22, null);
        this.f94205f = a2;
        a2.mo52008a();
    }

    /* renamed from: c */
    public final void mo51851c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.f94202c.mo65288b(bundle2);
        bundle.putBundle("widgetControllerState", bundle2);
        Bundle bundle3 = new Bundle();
        this.f94205f.mo65288b(bundle3);
        bundle.putBundle("widgetAdapterState", bundle3);
        bundle.putBoolean("biometricInProgressKey", this.f94207h);
    }

    /* renamed from: a */
    public final void mo51843a() {
        this.f94202c.mo65292y();
    }

    /* renamed from: a */
    public final void mo51844a(int i, String[] strArr, int[] iArr) {
        if (i == 700) {
            bjfy b = bjfy.m103327b(this.f94201b);
            int i2 = 0;
            Intent a = bjfd.m103295a(0);
            if (!(strArr.length == 0 && iArr.length == 0)) {
                a.putExtra("permissionsRequested", strArr);
                a.putExtra("requestedPermissionsGrantResults", iArr);
                i2 = -1;
            }
            a.putExtra("resultCode", i2);
            b.mo65074a(new bjfd(a));
        }
    }

    /* renamed from: a */
    public final void mo52012a(Intent intent) {
        this.f94201b.setResult(2, intent);
        this.f94201b.finish();
    }

    /* renamed from: a */
    public final boolean mo51846a(int i, int i2, Intent intent) {
        if (i != 600) {
            return false;
        }
        bjfy b = bjfy.m103327b(this.f94201b);
        Intent a = bjfd.m103295a(0);
        a.putExtra("resultCode", i2);
        if (intent != null) {
            a.putExtra("resultData", intent);
        }
        b.mo65074a(new bjfd(a));
        return true;
    }
}
