package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesSettingsChimeraActivity;

/* renamed from: auyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyt implements auxc {

    /* renamed from: a */
    final /* synthetic */ TrustedPlacesSettingsChimeraActivity f92798a;

    public auyt(TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity) {
        this.f92798a = trustedPlacesSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo51003a(String[] strArr) {
        if (strArr.length == 3) {
            auyk j = this.f92798a.mo59591j();
            if (!j.f92776c.mo2005i()) {
                j.f92776c.mo1981a(true);
            }
            j.f92780h = true;
            String[] strArr2 = {strArr[0], strArr[1]};
            TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity = this.f92798a;
            if (!trustedPlacesSettingsChimeraActivity.f109314h || trustedPlacesSettingsChimeraActivity.f109316j.equals(strArr2[0])) {
                TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity2 = this.f92798a;
                if (trustedPlacesSettingsChimeraActivity2.f109313g) {
                    trustedPlacesSettingsChimeraActivity2.mo59591j().mo51056b(strArr2);
                } else {
                    trustedPlacesSettingsChimeraActivity2.mo59591j().mo51057c(strArr2);
                }
            } else {
                if (this.f92798a.f109315i == bogq.PLACE_LURE) {
                    TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity3 = this.f92798a;
                    auyj.m78079a(strArr2[0], strArr2[1], trustedPlacesSettingsChimeraActivity3.getString(C0126R.string.places_lure_confirmation_title), trustedPlacesSettingsChimeraActivity3.getString(C0126R.string.places_lure_confirmation_brief), trustedPlacesSettingsChimeraActivity3.getString(C0126R.string.auth_trust_agent_trusted_places_note_radius, new Object[]{80}), null, trustedPlacesSettingsChimeraActivity3.getString(C0126R.string.places_lure_confirmation_enable), trustedPlacesSettingsChimeraActivity3.getString(C0126R.string.common_cancel)).show(trustedPlacesSettingsChimeraActivity3.mo59591j().getFragmentManager(), "TrustedPlaceConfirmationDialogFragment");
                    trustedPlacesSettingsChimeraActivity3.mo59587a(22);
                } else if (this.f92798a.f109315i == bogq.HOME_ADDRESS_CHANGE) {
                    TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity4 = this.f92798a;
                    auyj.m78079a(strArr2[0], strArr2[1], trustedPlacesSettingsChimeraActivity4.getString(C0126R.string.address_change_confirmation_title), trustedPlacesSettingsChimeraActivity4.getString(C0126R.string.address_change_confirmation_brief), null, trustedPlacesSettingsChimeraActivity4.getString(C0126R.string.address_change_confirmation_question), trustedPlacesSettingsChimeraActivity4.getString(C0126R.string.address_change_confirmation_enable), trustedPlacesSettingsChimeraActivity4.getString(C0126R.string.address_change_confirmation_disable)).show(trustedPlacesSettingsChimeraActivity4.mo59591j().getFragmentManager(), "TrustedPlaceConfirmationDialogFragment");
                    trustedPlacesSettingsChimeraActivity4.mo59587a(22);
                } else {
                    this.f92798a.mo59591j().mo51053a(strArr2);
                }
                this.f92798a.f109316j = strArr2[0];
            }
            TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity5 = this.f92798a;
            trustedPlacesSettingsChimeraActivity5.f109313g = false;
            trustedPlacesSettingsChimeraActivity5.f109314h = false;
            trustedPlacesSettingsChimeraActivity5.f109317k = null;
            return;
        }
        TrustedPlacesSettingsChimeraActivity.f109309c.mo50711a("Receive invalid home info.", new Object[0]).mo50708c();
    }
}
