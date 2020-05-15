package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: atsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atsc extends alic {

    /* renamed from: b */
    public static final srn f90752b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public alih f90753c;

    /* renamed from: d */
    Account f90754d;

    /* renamed from: e */
    public LottieAnimationView f90755e;

    /* renamed from: f */
    public bepr f90756f;

    /* renamed from: g */
    private Button f90757g;

    /* renamed from: h */
    private TextView f90758h;

    /* renamed from: i */
    private CardView f90759i;

    /* renamed from: a */
    static final /* synthetic */ void m76264a(Throwable th) {
        bnsl bnsl = (bnsl) f90752b.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68432a("atsc", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Could not load the animation");
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f90753c == null) {
            atrr atrr = new atrr();
            alif alif = this.f73529a;
            cazf.m127594a(alif);
            atrr.f90736a = alif;
            cazf.m127595a(atrr.f90736a, alif.class);
            this.f90753c = new atrs(atrr.f90736a);
        }
        Account c = ((atrs) this.f90753c).f90737a.mo40365c();
        cazf.m127593a(c, "Cannot return null from a non-@Nullable component method");
        this.f90754d = c;
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
        inflate.findViewById(C0126R.C0129id.OobeResultSubTitle).setVisibility(8);
        this.f90757g = (Button) inflate.findViewById(C0126R.C0129id.OobeResultNextButton);
        this.f90758h = (TextView) inflate.findViewById(C0126R.C0129id.OobeResultTitle);
        this.f90759i = (CardView) inflate.findViewById(C0126R.C0129id.OobeResultCard);
        this.f90755e = (LottieAnimationView) inflate.findViewById(C0126R.C0129id.Animation);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.OobeResultCardImage);
        CardInfo cardInfo = (CardInfo) getArguments().get("extra_card_info");
        if (cardInfo != null) {
            this.f90756f = asju.m74252a(new asjs(getActivity(), this.f90754d.name), cardInfo, imageView);
        }
        if (atyg.m76554a(getContext())) {
            str = cgxc.f187953a.mo6606a().mo84666e();
        } else {
            str = cgxc.f187953a.mo6606a().mo84665d();
        }
        ayx a = aye.m2428a(getContext(), str);
        a.mo2916b(new atrz(this));
        a.mo2912a(atsa.f90750a);
        this.f90757g.setOnClickListener(new atsb(this));
        this.f90759i.setVisibility(8);
        this.f90757g.setVisibility(0);
        this.f90755e.setVisibility(0);
        this.f90758h.setText((int) C0126R.string.tp_oobe_unlock_to_pay);
        this.f90755e.mo4042a();
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo50150a(axw axw) {
        ayp ayp = (ayp) axw.f2508b.get("image_0");
        this.f90755e.mo4048a(axw);
        bnsl bnsl = (bnsl) f90752b.mo68390d();
        bnsl.mo68432a("atsc", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("The lottie animation has been loaded.");
        if (ayp != null && this.f90756f != null) {
            Bitmap createBitmap = Bitmap.createBitmap(ayp.f2566a, ayp.f2567b, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            this.f90756f.setBounds(0, 0, ayp.f2566a, ayp.f2567b);
            this.f90756f.draw(canvas);
            this.f90755e.f7171c.mo2877a("image_0", createBitmap);
        }
    }
}
