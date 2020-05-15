package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajiv */
public final /* synthetic */ class ajiv implements aubw {

    /* renamed from: a */
    private final ContactSelectChimeraActivity f70725a;

    public ajiv(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70725a = contactSelectChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70725a;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            contactSelectChimeraActivity.f80863g.findViewById(C0126R.C0129id.divider).setVisibility(8);
            contactSelectChimeraActivity.f80863g.findViewById(C0126R.C0129id.reachable_contacts_explain_footer).setVisibility(8);
            contactSelectChimeraActivity.f80865i.findViewById(C0126R.C0129id.reachable_contacts_description).setVisibility(8);
        } else {
            contactSelectChimeraActivity.f80863g.findViewById(C0126R.C0129id.divider).setVisibility(0);
            contactSelectChimeraActivity.f80863g.findViewById(C0126R.C0129id.reachable_contacts_explain_footer).setVisibility(0);
            contactSelectChimeraActivity.f80865i.findViewById(C0126R.C0129id.reachable_contacts_description).setVisibility(0);
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            String quantityString = contactSelectChimeraActivity.getResources().getQuantityString(C0126R.plurals.sharing_contact_select_unreachable_description, intValue, Integer.valueOf(intValue));
            ((TextView) contactSelectChimeraActivity.f80863g.findViewById(C0126R.C0129id.reachable_contacts_explain_footer)).setText(quantityString);
            ((TextView) contactSelectChimeraActivity.f80865i.findViewById(C0126R.C0129id.reachable_contacts_description)).setText(quantityString);
        }
    }
}
