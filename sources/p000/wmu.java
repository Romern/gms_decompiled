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

/* renamed from: wmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmu extends DialogFragment {

    /* renamed from: a */
    public wmt f50917a;

    /* renamed from: b */
    public LinearLayout f50918b;

    /* renamed from: c */
    public WalletCustomTheme f50919c;

    /* renamed from: d */
    public boolean f50920d;

    /* renamed from: e */
    private View f50921e;

    /* renamed from: a */
    public static wmu m42044a(String str, int i, int i2) {
        Bundle bundle = new Bundle(3);
        bundle.putString("accountName", str);
        bundle.putInt("maxAvailableSlots", i);
        bundle.putInt("inviteeRole", i2);
        wmu wmu = new wmu();
        wmu.setArguments(bundle);
        return wmu;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!cdtf.m134919b()) {
            getActivity().getWindow().addFlags(8192);
        }
        if (bundle != null) {
            this.f50920d = bundle.getBoolean("paymentsChallengeFlowStarted", false);
        }
        if (!this.f50920d) {
            String string = getResources().getString(C0126R.string.fm_just_a_sec_message);
            if (getDialog() != null) {
                getDialog().setCanceledOnTouchOutside(false);
            }
            ((TextView) this.f50918b.findViewById(C0126R.C0129id.fm_verify_cvc_progress_bar_text)).setText(string);
            this.f50918b.setVisibility(0);
            getLoaderManager().initLoader(0, null, new wms(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i);
            wgn.m41926f("InvitationsPreconditionsFragment", sb.toString(), new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("PM Flow Done: ");
        sb2.append(i2);
        sb2.toString();
        sbw sbw = wgn.f50624a;
        if (i2 == -1) {
            this.f50917a.mo18443b().mo29115a(this.f50917a.mo18480l(), 8);
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            if (byteArrayExtra != null) {
                try {
                    bwer bwer = (bwer) bxvk.m124016a(bwer.f159019c, byteArrayExtra, bxus.m123744c());
                    int a = bweq.m121888a(bwer.f159021a);
                    if (a != 0 && a == 3) {
                        this.f50917a.mo18443b().mo29115a(this.f50917a.mo18480l(), 9);
                        this.f50917a.mo18471a(getArguments().getInt("maxAvailableSlots"), getArguments().getInt("inviteeRole"));
                        return;
                    }
                    this.f50917a.mo18443b().mo29115a(this.f50917a.mo18480l(), 11);
                    String valueOf = String.valueOf(bwer.f159022b);
                    if (valueOf.length() == 0) {
                        new String("Instrument challenge not successful: ");
                    } else {
                        "Instrument challenge not successful: ".concat(valueOf);
                    }
                    this.f50917a.mo18481m();
                } catch (IOException e) {
                    wgn.m41926f("InvitationsPreconditionsFragment", "Failure parsing RequestChallengeResponse proto.", new Object[0]);
                    mo9306a();
                }
            } else {
                wgn.m41926f("InvitationsPreconditionsFragment", "No RequestChallengeResponse found in data.", new Object[0]);
                mo9306a();
            }
        } else {
            this.f50917a.mo18443b().mo29115a(this.f50917a.mo18480l(), 7);
            this.f50917a.mo18481m();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50917a = (wmt) wgq.m41934a(wmt.class, getActivity());
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f50917a.mo18481m();
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
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_invitations_preconditions, viewGroup, false);
        this.f50921e = inflate;
        this.f50918b = (LinearLayout) inflate.findViewById(C0126R.C0129id.fm_verify_cvc_progress_bar);
        int a = wgp.m41930a(getActivity().getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.f110168a = qkj.m32287a(getActivity(), a);
        this.f50919c = walletCustomTheme;
        this.f50917a.mo18443b().mo29115a(this.f50917a.mo18480l(), 5);
        return this.f50921e;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50917a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("paymentsChallengeFlowStarted", this.f50920d);
    }

    /* renamed from: a */
    public final void mo9306a() {
        LinearLayout linearLayout = this.f50918b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f50917a.mo18482n();
    }
}
