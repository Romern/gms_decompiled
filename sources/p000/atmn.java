package p000;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atmn extends acm {

    /* renamed from: v */
    public static final /* synthetic */ int f90489v = 0;

    /* renamed from: s */
    public final View f90490s;

    /* renamed from: t */
    public final View f90491t;

    /* renamed from: u */
    public final LottieAnimationView f90492u;

    public atmn(View view) {
        super(view);
        this.f90490s = view.findViewById(C0126R.C0129id.Header_Without_ActiveToken);
        this.f90491t = view.findViewById(C0126R.C0129id.Header_With_ActiveToken);
        this.f90492u = (LottieAnimationView) view.findViewById(C0126R.C0129id.NfcLogo);
    }
}
