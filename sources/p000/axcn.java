package p000;

import android.os.Bundle;
import android.os.Message;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.wallet.p084ow.ShowLockScreenChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;

/* renamed from: axcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcn extends bkjm {

    /* renamed from: c */
    public static final /* synthetic */ int f95777c = 0;

    /* renamed from: m */
    private static final String f95778m = awhg.m79946a("TPConsumerVerifFrag");

    /* renamed from: a */
    public final awpc f95779a = new axcm(this);

    /* renamed from: b */
    int f95780b;

    /* renamed from: n */
    private BuyFlowConfig f95781n;

    /* renamed from: o */
    private awhg f95782o;

    /* renamed from: C */
    private final void m82315C() {
        if (this.f95780b == -1) {
            this.f95780b = mo53013t().f94357a.mo52395a(this.f95779a);
        }
    }

    /* renamed from: a */
    static final awhg m82316a(Activity activity) {
        return (awhg) activity.getSupportFragmentManager().findFragmentByTag(f95778m);
    }

    /* renamed from: b */
    public static void m82319b(Fragment fragment) {
        axcn a = m82317a(fragment);
        if (a != null) {
            a.mo52947bY();
            fragment.getChildFragmentManager().beginTransaction().remove(a).commit();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo53012m() {
        getActivity().getApplicationContext();
        startActivityForResult(ShowLockScreenChimeraActivity.m94076a(this.f95781n), 501);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95781n = (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig");
        if (bundle == null) {
            this.f95780b = -1;
            awhg a = m82316a(getActivity());
            if (a != null) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(a).commit();
            }
            this.f95782o = awhg.m79945a(4, this.f95781n, mo51878cn());
            getActivity().getSupportFragmentManager().beginTransaction().add(this.f95782o, f95778m).commit();
            return;
        }
        this.f95780b = bundle.getInt("serviceConnectionSavePoint");
    }

    public final void onPause() {
        super.onPause();
        mo66083B().removeCallbacksAndMessages(null);
        m82315C();
    }

    public final void onResume() {
        super.onResume();
        axcl axcl = new axcl(this);
        if (mo53013t().f94358b) {
            axcl.run();
        } else {
            mo66083B().post(axcl);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m82315C();
        bundle.putInt("serviceConnectionSavePoint", this.f95780b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final awhg mo53013t() {
        if (this.f95782o == null) {
            this.f95782o = m82316a(getActivity());
        }
        return this.f95782o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo53014u() {
        return mo53013t() != null && mo53013t().f94358b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo53015v() {
        awpb awpb = mo53013t().f94357a;
        Message.obtain(((awou) awpb).f94784u, 60, new TapAndPayConsumerVerificationRequest((bmkl) this.f124069w, this.f124430h)).sendToTarget();
    }

    /* renamed from: a */
    public static axcn m82317a(Fragment fragment) {
        return (axcn) fragment.getChildFragmentManager().findFragmentByTag("GcoreTapAndPayConsumerVerificationFragment");
    }

    /* renamed from: a */
    public static axcn m82318a(Fragment fragment, bmkl bmkl, LogContext logContext, BuyFlowConfig buyFlowConfig) {
        m82319b(fragment);
        axcn axcn = new axcn();
        sdo.m34975b(!bmkl.f129851c.isEmpty(), "clientInstrumentId cannot be null or empty!");
        Bundle a = bkdx.m105383a((int) C0126R.style.WalletEmptyStyle, bmkl, logContext);
        a.putParcelable("buyFlowConfig", buyFlowConfig);
        axcn.setArguments(a);
        fragment.getChildFragmentManager().beginTransaction().add(axcn, "GcoreTapAndPayConsumerVerificationFragment").commit();
        return axcn;
    }
}
