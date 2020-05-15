package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;

/* renamed from: wlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wlj implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wlp f50830a;

    public wlj(wlp wlp) {
        this.f50830a = wlp;
    }

    /* renamed from: a */
    private final void m41995a() {
        wgm.m41916a(this.f50830a.getActivity(), new wlh(this), new wli(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        brcm brcm;
        brcm a = brcm.m113875a(this.f50830a.f50838d);
        if (a != null) {
            brcm = a;
        } else {
            brcm = brcm.UNKNOWN_FAMILY_ROLE;
        }
        Activity activity = this.f50830a.getActivity();
        wlp wlp = this.f50830a;
        return new wmm(activity, wlp.f50836b, wlp.f50835a.mo18479k(), this.f50830a.f50835a.mo18478j(), brcm, this.f50830a.f50841g);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            brcp brcp = (brcp) why.f50695a;
            if ((brcp.f142408a & 2) != 0) {
                brao brao = brcp.f142411d;
                if (brao == null) {
                    brao = brao.f142163b;
                }
                int a = bran.m113824a(brao.f142165a);
                if (a != 0 && a == 3) {
                    wgm.m41919b(this.f50830a.getActivity(), new wlf(this)).show();
                    return;
                }
            }
            if (!((brcp) why.f50695a).f142412e.isEmpty()) {
                C1349sg a2 = wgm.m41918a((Context) this.f50830a.getActivity());
                a2.mo15900a(((brcp) why.f50695a).f142412e);
                a2.mo15906b((int) C0126R.string.common_got_it, new wlg(this));
                a2.mo15904b().show();
            } else if (((brcp) why.f50695a).f142410c.size() == 0) {
                m41995a();
            } else {
                this.f50830a.f50839e = new PageDataMap();
                bxwc bxwc = ((brcp) why.f50695a).f142410c;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    bree bree = (bree) bxwc.get(i);
                    PageDataMap pageDataMap = this.f50830a.f50839e;
                    int a3 = bred.m113924a(bree.f142592a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    pageDataMap.mo18559a(a3 - 1, new PageData(bree));
                }
                wlp wlp = this.f50830a;
                wlp.f50835a.mo18473a(wlp.f50839e);
                brdl brdl = ((brcp) why.f50695a).f142413f;
                if (brdl == null) {
                    brdl = brdl.f142529c;
                }
                if ((brdl.f142531a & 2) != 0) {
                    wlp wlp2 = this.f50830a;
                    brdl brdl2 = ((brcp) why.f50695a).f142413f;
                    if (brdl2 == null) {
                        brdl2 = brdl.f142529c;
                    }
                    brbh brbh = brdl2.f142532b;
                    if (brbh == null) {
                        brbh = brbh.f142250j;
                    }
                    wlp2.f50842h = new ContactPickerOptionsData(brbh);
                    wlp wlp3 = this.f50830a;
                    wlp3.f50835a.mo18472a(wlp3.f50842h);
                    this.f50830a.mo29188a();
                    return;
                }
                m41995a();
            }
        } else {
            this.f50830a.f50835a.mo18443b().mo29111a(3, 22, "InvitationIntroFragment");
            m41995a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
