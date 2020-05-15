package p000;

import android.content.Context;
import android.nfc.NfcManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.material.button.MaterialButton;

/* renamed from: atsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atsx extends alic {

    /* renamed from: b */
    public static final srn f90798b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public ImageView f90799c;

    /* renamed from: d */
    public alih f90800d;

    /* renamed from: e */
    String f90801e;

    /* renamed from: f */
    rjx f90802f;

    /* renamed from: g */
    private TextView f90803g;

    /* renamed from: h */
    private TextView f90804h;

    /* renamed from: i */
    private TextView f90805i;

    /* renamed from: j */
    private MaterialButton f90806j;

    /* renamed from: k */
    private ImageView f90807k;

    /* renamed from: a */
    static final /* synthetic */ void m76280a(Throwable th) {
        bnsl bnsl = (bnsl) f90798b.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68432a("atsx", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Could not load the animation.");
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f90800d == null) {
            atrx atrx = new atrx();
            alif alif = this.f73529a;
            cazf.m127594a(alif);
            atrx.f90746b = alif;
            asiz asiz = new asiz(activity);
            cazf.m127594a(asiz);
            atrx.f90745a = asiz;
            cazf.m127595a(atrx.f90745a, asiz.class);
            cazf.m127595a(atrx.f90746b, alif.class);
            this.f90800d = new atry(atrx.f90745a, atrx.f90746b);
        }
        atry atry = (atry) this.f90800d;
        this.f90802f = aton.m76233a(asja.m74205a(atry.f90747a));
        String b = atry.f90748b.mo40364b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable component method");
        this.f90801e = b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_oobe_tokenization_result_screen, viewGroup, false);
        this.f90803g = (TextView) inflate.findViewById(C0126R.C0129id.OobeResultTitle);
        this.f90804h = (TextView) inflate.findViewById(C0126R.C0129id.OobeResultSubTitle);
        this.f90805i = (TextView) inflate.findViewById(C0126R.C0129id.OobeResultBottomInfo);
        this.f90806j = (MaterialButton) inflate.findViewById(C0126R.C0129id.OobeAddAnotherCard);
        this.f90807k = (ImageView) inflate.findViewById(C0126R.C0129id.OobeResultCardImage);
        this.f90799c = (ImageView) inflate.findViewById(C0126R.C0129id.RedPathNfcView);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.OobeResultNextButton);
        button.setVisibility(0);
        button.setOnClickListener(new atss(this));
        CardInfo cardInfo = (CardInfo) getArguments().get("extra_card_info");
        if (cardInfo == null) {
            bnsl bnsl = (bnsl) f90798b.mo68387b();
            bnsl.mo68432a("atsx", "onCreateView", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not find card info.");
            this.f90803g.setText(getString(C0126R.string.tp_oobe_ready_to_pay, ""));
            this.f90804h.setText((int) C0126R.string.tp_oobe_ready_to_pay_apps_and_web);
            this.f90807k.setImageDrawable(C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.tp_gray_card_116x72));
            this.f90805i.setVisibility(0);
            this.f90805i.setText((int) C0126R.string.tp_oobe_try_different_card_to_pay_with_phone);
            this.f90807k.setImageDrawable(C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.tp_gray_card_116x72));
            this.f90806j.setVisibility(0);
            this.f90806j.setOnClickListener(new atsu(this));
            return inflate;
        }
        NfcManager nfcManager = (NfcManager) getContext().getSystemService("nfc");
        if (getArguments().getInt("tokenization_result_code", 0) == 15) {
            this.f90803g.setText((int) C0126R.string.tp_oobe_not_supported_by_bank);
            this.f90804h.setText(getString(C0126R.string.tp_oobe_no_contactless_payment, cardInfo.f108343d));
            this.f90805i.setVisibility(0);
            this.f90805i.setText((int) C0126R.string.tp_oobe_try_different_card_to_pay_with_phone);
            this.f90807k.setImageDrawable(C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.tp_gray_card_116x72));
            this.f90806j.setVisibility(0);
            this.f90806j.setOnClickListener(new atst(this));
        } else if (nfcManager == null || nfcManager.getDefaultAdapter() == null) {
            this.f90803g.setText(getString(C0126R.string.tp_oobe_ready_to_pay, cardInfo.f108343d));
            this.f90804h.setText((int) C0126R.string.tp_oobe_ready_to_pay_apps_and_web);
            asju.m74252a(new asjs(getActivity(), this.f90801e), cardInfo, this.f90807k);
        } else {
            this.f90803g.setText(getString(C0126R.string.tp_oobe_ready_to_pay, cardInfo.f108343d));
            this.f90804h.setText((int) C0126R.string.tp_oobe_ready_to_pay_apps_and_web);
            asju.m74252a(new asjs(getActivity(), this.f90801e), cardInfo, this.f90807k);
            this.f90805i.setVisibility(0);
            this.f90805i.setText((int) C0126R.string.tp_oobe_contact_bank_for_contactless_payment);
            Context context = getContext();
            if (atyg.m76554a(getContext())) {
                str = cgxc.f187953a.mo6606a().mo84664c();
            } else {
                str = cgxc.f187953a.mo6606a().mo84663b();
            }
            ayx a = aye.m2428a(context, str);
            a.mo2916b(new atsv(this));
            a.mo2912a(atsw.f90797a);
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo50161a(byte[] bArr) {
        rjx rjx = this.f90802f;
        android.app.Activity containerActivity = getActivity().getContainerActivity();
        asxx asxx = new asxx();
        asxx.mo49649a(bArr);
        rjx.mo24717a(containerActivity, 18, asxx);
    }
}
