package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;

/* renamed from: wms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wms implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wmu f50916a;

    public wms(wmu wmu) {
        this.f50916a = wmu;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        brcm brcm;
        brcm a = brcm.m113875a(this.f50916a.getArguments().getInt("inviteeRole"));
        if (a != null) {
            brcm = a;
        } else {
            brcm = brcm.UNKNOWN_FAMILY_ROLE;
        }
        Activity activity = this.f50916a.getActivity();
        String string = this.f50916a.getArguments().getString("accountName");
        wgh k = this.f50916a.f50917a.mo18479k();
        Context context = this.f50916a.getContext();
        awbt awbt = new awbt();
        awbt.mo51835a(1);
        awkh a2 = awbv.m79579a(context, awbt.mo51834a());
        wmu wmu = this.f50916a;
        return new wnl(activity, string, k, a2, wmu.f50919c, wmu.f50917a.mo18478j(), brcm);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            wgn.m41926f("InvitationsPreconditionsFragment", "CanAddMemberLoader failure.", new Object[0]);
            this.f50916a.mo9306a();
            return;
        }
        brat brat = (brat) why.f50695a;
        String valueOf = String.valueOf(brat);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("CanAddMember response: ");
        sb.append(valueOf);
        sb.toString();
        sbw sbw = wgn.f50624a;
        if (brat.f142185b.size() != 0 && brat.f142185b.size() == 1 && ((brej) brat.f142181c.mo14948a(Integer.valueOf(brat.f142185b.mo74151b(0)))) == brej.CVN_CHALLENGE_REQUIRED) {
            awlh awlh = new awlh(this.f50916a.getActivity());
            awlh.mo52187a(cdsw.m134870c() ^ true ? 1 : 0);
            awlh.mo52190a(this.f50916a.f50919c);
            awlh.mo52188a(new Account(this.f50916a.getArguments().getString("accountName"), "com.google"));
            awlh.mo52235a(new SecurePaymentsPayload(brat.f142186d.getKey(), new SecurePaymentsData[0]));
            Intent a = awlh.mo52186a();
            this.f50916a.f50918b.setVisibility(8);
            this.f50916a.startActivityForResult(a, 1);
            this.f50916a.f50920d = true;
        } else if (!brat.f142184a) {
            wgn.m41926f("InvitationsPreconditionsFragment", "CanAddMember false without CVN Verification precondition", new Object[0]);
            this.f50916a.mo9306a();
        } else {
            wmu wmu = this.f50916a;
            wmu.f50917a.mo18471a(wmu.getArguments().getInt("maxAvailableSlots"), this.f50916a.getArguments().getInt("inviteeRole"));
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
