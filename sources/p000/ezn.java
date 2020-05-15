package p000;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;
import com.google.android.material.button.MaterialButton;

/* renamed from: ezn */
final /* synthetic */ class ezn implements C0038ax {

    /* renamed from: a */
    private final ezr f16113a;

    public ezn(ezr ezr) {
        this.f16113a = ezr;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ezr ezr = this.f16113a;
        bmxv bmxv = (bmxv) obj;
        sdo.m34959a(ezr.f16120c);
        ViewGroup viewGroup = (ViewGroup) ezr.getView().findViewById(C0126R.C0129id.content);
        if (!bmxv.mo66813a()) {
            viewGroup.setVisibility(4);
            return;
        }
        evk evk = (evk) bmxv.mo66814b();
        viewGroup.setVisibility(0);
        String str = evk.f15878a;
        String str2 = evk.f15879b;
        boolean a = evk.mo10529a();
        bswh bswh = evk.f15881d;
        String str3 = evk.f15880c;
        ezq ezq = new ezq(ezr, evk);
        FadeInImageView fadeInImageView = (FadeInImageView) viewGroup.findViewById(C0126R.C0129id.error_image);
        MaterialButton materialButton = (MaterialButton) viewGroup.findViewById(C0126R.C0129id.error_button);
        evi.m11180a((TextView) viewGroup.findViewById(C0126R.C0129id.error_title), str);
        evi.m11180a((TextView) viewGroup.findViewById(C0126R.C0129id.error_summary), str2);
        if (str3 != null) {
            materialButton.setVisibility(0);
            materialButton.setText(str3);
            materialButton.setOnClickListener(ezq);
        } else {
            materialButton.setVisibility(8);
        }
        evi.m11184a(ezr.f16120c, fadeInImageView, a, bswh);
        C1329rn.m20096a(fadeInImageView, ColorStateList.valueOf(adyg.m51405b(ezr.getContext(), C0126R.attr.colorOnSurfaceVariant, C0126R.color.google_grey700)));
    }
}
