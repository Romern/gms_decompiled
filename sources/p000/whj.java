package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;

/* renamed from: whj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whj extends acm {

    /* renamed from: s */
    AvatarReferenceImageView f50645s;

    /* renamed from: t */
    ImageView f50646t;

    /* renamed from: u */
    final TextView f50647u;

    /* renamed from: v */
    final TextView f50648v;

    public whj(View view, boolean z) {
        super(view);
        if (cdsz.m134909b()) {
            this.f50646t = (ImageView) view.findViewById(C0126R.C0129id.fm_item_avatar);
        } else {
            this.f50645s = (AvatarReferenceImageView) view.findViewById(C0126R.C0129id.fm_item_avatar_reference);
        }
        this.f50647u = (TextView) view.findViewById(C0126R.C0129id.fm_item_primary_text);
        this.f50648v = (TextView) view.findViewById(C0126R.C0129id.fm_item_secondary_text);
        if (z) {
            ((ImageView) view.findViewById(C0126R.C0129id.fm_item_icon)).setImageResource(C0126R.C0127drawable.quantum_ic_error_red_24);
        } else {
            view.findViewById(C0126R.C0129id.fm_item_icon).setVisibility(8);
        }
    }
}
