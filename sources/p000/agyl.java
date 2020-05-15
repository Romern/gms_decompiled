package p000;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;

/* renamed from: agyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyl implements agya {

    /* renamed from: a */
    private final MdpDataPlanStatusResponse f66863a;

    /* renamed from: b */
    private final MdpCarrierPlanIdResponse f66864b;

    /* renamed from: c */
    private agxm f66865c;

    public agyl(MdpDataPlanStatusResponse mdpDataPlanStatusResponse, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        this.f66863a = mdpDataPlanStatusResponse;
        this.f66864b = mdpCarrierPlanIdResponse;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.update_info_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        long j;
        long j2;
        agxm agxm = (agxm) acm;
        this.f66865c = agxm;
        agxm.f66793u = this.f66864b;
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse = this.f66863a;
        long currentTimeMillis = System.currentTimeMillis();
        if (mdpDataPlanStatusResponse.mo44037a() != null) {
            j = bxzt.m124578a(mdpDataPlanStatusResponse.mo44037a());
        } else {
            j = currentTimeMillis;
        }
        if (j > currentTimeMillis) {
            agxm.f66790v.mo26019b(agyt.m55307c()).mo68417a("Snapshot time stamp %d is earlier than current Time %d. Set snapshot to current", j, currentTimeMillis);
            j2 = currentTimeMillis;
        } else {
            j2 = j;
        }
        CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(j2, currentTimeMillis, 60000, 0);
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = agxm.f66793u;
        String string = agxm.f66792t.getString(C0126R.string.provided_by, (mdpCarrierPlanIdResponse == null || TextUtils.isEmpty(mdpCarrierPlanIdResponse.f80153c)) ? agqg.m54849d() : agxm.f66793u.f80153c);
        String string2 = agxm.f66792t.getString(C0126R.string.update_info_viewholder_last_updated_at, relativeTimeSpanString);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
        sb.append(string);
        sb.append("\n");
        sb.append(string2);
        agxm.f66791s.setText(sb.toString());
    }
}
