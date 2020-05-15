package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;

/* renamed from: whi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whi extends acm {

    /* renamed from: s */
    AvatarReferenceImageView f50642s;

    /* renamed from: t */
    ImageView f50643t;

    /* renamed from: u */
    final TextView f50644u;

    public whi(View view, boolean z) {
        super(view);
        if (cdsz.m134909b()) {
            this.f50643t = (ImageView) view.findViewById(C0126R.C0129id.fm_item_avatar);
        } else {
            this.f50642s = (AvatarReferenceImageView) view.findViewById(C0126R.C0129id.fm_item_avatar_reference);
        }
        this.f50644u = (TextView) view.findViewById(C0126R.C0129id.fm_item_primary_text);
        if (z) {
            ((ImageView) view.findViewById(C0126R.C0129id.fm_item_icon)).setImageResource(C0126R.C0127drawable.quantum_ic_error_red_24);
        } else {
            view.findViewById(C0126R.C0129id.fm_item_icon).setVisibility(8);
        }
    }
}
