package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.io.IOException;

/* renamed from: wrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrg extends DialogFragment {

    /* renamed from: a */
    public String f51170a;

    /* renamed from: b */
    public String f51171b;

    /* renamed from: c */
    public boolean f51172c;

    /* renamed from: d */
    public wrf f51173d;

    /* renamed from: e */
    public WalletCustomTheme f51174e;

    /* renamed from: f */
    public boolean f51175f;

    /* renamed from: g */
    public int f51176g = 1;

    /* renamed from: h */
    private LinearLayout f51177h;

    /* renamed from: a */
    public final void mo9306a() {
        LinearLayout linearLayout = this.f51177h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo29310b() {
        mo9306a();
        this.f51173d.mo18467x();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getWindow().addFlags(8192);
        if (bundle != null) {
            this.f51175f = bundle.getBoolean("paymentsChallengeFlowStarted", false);
        }
        if (!this.f51175f) {
            String string = getResources().getString(C0126R.string.fm_just_a_sec_message);
            if (getDialog() != null) {
                getDialog().setCanceledOnTouchOutside(false);
            }
            ((TextView) this.f51177h.findViewById(C0126R.C0129id.fm_verify_cvc_progress_bar_text)).setText(string);
            this.f51177h.setVisibility(0);
            getLoaderManager().initLoader(0, null, new wre(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i);
            wgn.m41926f("UpgradePreconditionsFragment", sb.toString(), new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("PM Flow Done: ");
        sb2.append(i2);
        sb2.toString();
        sbw sbw = wgn.f50624a;
        if (i2 == -1) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            if (byteArrayExtra != null) {
                try {
                    bwer bwer = (bwer) GeneratedMessageLite.m124016a(bwer.f159019c, byteArrayExtra, bxus.m123744c());
                    int a = bweq.m121888a(bwer.f159021a);
                    if (a != 0 && a == 3) {
                        this.f51173d.mo18448d(this.f51172c);
                        return;
                    }
                    String valueOf = String.valueOf(bwer.f159022b);
                    if (valueOf.length() == 0) {
                        new String("Instrument challenge not successful: ");
                    } else {
                        "Instrument challenge not successful: ".concat(valueOf);
                    }
                    this.f51173d.mo18468y();
                } catch (IOException e) {
                    wgn.m41926f("UpgradePreconditionsFragment", "Failure parsing RequestChallengeResponse proto.", new Object[0]);
                    mo29310b();
                }
            } else {
                wgn.m41926f("UpgradePreconditionsFragment", "No RequestChallengeResponse found in data.", new Object[0]);
                mo29310b();
            }
        } else {
            this.f51173d.mo18468y();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51173d = (wrf) wgq.m41934a(wrf.class, getActivity());
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f51173d.mo18468y();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51170a = getArguments().getString("accountName");
        this.f51171b = getArguments().getString("referencePcid");
        int a = brck.m113873a(getArguments().getInt("pcidType"));
        if (a == 0) {
            a = 1;
        }
        this.f51176g = a;
        this.f51172c = getArguments().getBoolean("headless");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_upgrade_preconditions, viewGroup, false);
        this.f51177h = (LinearLayout) inflate.findViewById(C0126R.C0129id.fm_verify_cvc_progress_bar);
        int a = wgp.m41930a(getActivity().getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.f110168a = qkj.m32287a(getActivity(), a);
        this.f51174e = walletCustomTheme;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51173d = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("paymentsChallengeFlowStarted", this.f51175f);
    }
}
