package p000;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: aevu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevu extends aewb {

    /* renamed from: s */
    public final View f63926s;

    /* renamed from: t */
    public final ImageView f63927t;

    public aevu(View view) {
        super(view);
        this.f63926s = view.findViewById(C0126R.C0129id.selector_container);
        this.f63927t = (ImageView) view.findViewById(C0126R.C0129id.contact_method);
    }

    /* renamed from: a */
    public final void mo34617a(Context context, aevz aevz) {
        super.mo34617a(context, aevz);
        boolean c = aexk.m52648c((AudienceMember) aevz.f63929d);
        boolean d = aexk.m52649d((AudienceMember) aevz.f63929d);
        if (c) {
            ((ImageView) this.f63926s.findViewById(C0126R.C0129id.selector)).setImageResource(C0126R.C0127drawable.quantum_ic_message_white_24);
            this.f63927t.setImageResource(C0126R.C0127drawable.location_sharing_ic_message_grey600_36_crop);
            this.f63927t.setVisibility(0);
        } else if (d) {
            ((ImageView) this.f63926s.findViewById(C0126R.C0129id.selector)).setImageResource(C0126R.C0127drawable.quantum_ic_email_white_24);
            this.f63927t.setImageResource(C0126R.C0127drawable.location_sharing_ic_email_grey600_36_crop);
            this.f63927t.setVisibility(0);
        } else {
            this.f63927t.setVisibility(8);
        }
        mo34618a(context, (AudienceMember) aevz.f63929d, false);
        this.f201a.setOnClickListener(null);
        this.f201a.setOnClickListener(new aevt(this, c, d, aevz));
    }

    /* renamed from: a */
    public final void mo34618a(Context context, AudienceMember audienceMember, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(audienceMember.f30296f);
        if (aexk.m52648c(audienceMember)) {
            sb.append(" ");
            sb.append(context.getString(C0126R.string.locationsharing_content_description_sms));
            sb.append(" ");
            sb.append(PhoneNumberUtils.formatNumber(aexk.m52645a(audienceMember)));
        } else if (aexk.m52649d(audienceMember)) {
            sb.append(" ");
            sb.append(context.getString(C0126R.string.locationsharing_content_description_email));
            sb.append(" ");
            sb.append(aexk.m52645a(audienceMember));
        }
        if (!z) {
            sb.append(" ");
            sb.append(context.getString(C0126R.string.locationsharing_recipient_not_selected));
        }
        this.f201a.setContentDescription(sb.toString());
    }
}
