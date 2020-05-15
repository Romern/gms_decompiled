package p000;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview.FifeNetworkImageView;

/* renamed from: axld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axld extends acm {

    /* renamed from: x */
    public static final /* synthetic */ int f96129x = 0;

    /* renamed from: s */
    public final RadioButton f96130s;

    /* renamed from: t */
    public final FifeNetworkImageView f96131t;

    /* renamed from: u */
    public final View f96132u;

    /* renamed from: v */
    public final TextView f96133v;

    /* renamed from: w */
    public final TextView f96134w;

    public axld(View view) {
        super(view);
        this.f96130s = (RadioButton) view.findViewById(C0126R.C0129id.instrument_radio_button);
        this.f96131t = (FifeNetworkImageView) view.findViewById(C0126R.C0129id.instrument_icon);
        this.f96132u = view;
        this.f96133v = (TextView) view.findViewById(C0126R.C0129id.instrument_subtitle);
        this.f96134w = (TextView) view.findViewById(C0126R.C0129id.instrument_title);
    }
}
