package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.ViewerDataModel;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;
import java.util.Iterator;

/* renamed from: woq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class woq implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wot f51042a;

    public woq(wot wot) {
        this.f51042a = wot;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51042a.getActivity();
        wot wot = this.f51042a;
        return new wno(activity, wot.f51049d, wot.f51048c.mo18479k(), this.f51042a.f51048c.mo18478j(), this.f51042a.f51050e);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Object obj2;
        PageData pageData;
        boolean z;
        brcm brcm;
        int i;
        why why = (why) obj;
        if (!why.f50696b || (obj2 = why.f50695a) == null) {
            this.f51042a.mo29251d();
            wgn.m41923c("FamilyDashboardFragment", "Response for getFamilyAppConfig is null", new Object[0]);
            bhnh a = bhnh.m101201a(this.f51042a.getView(), (int) C0126R.string.fm_get_family_error, -2);
            a.mo64030a((int) C0126R.string.common_retry, new wop(this));
            a.mo64020c();
            return;
        }
        wot wot = this.f51042a;
        brcf brcf = ((brcr) obj2).f142425c;
        if (brcf == null) {
            brcf = brcf.f142356i;
        }
        brcn brcn = brcf.f142361d;
        if (brcn == null) {
            brcn = brcn.f142396c;
        }
        if ((brcn.f142398a & 1) != 0) {
            brcn brcn2 = brcf.f142361d;
            if (brcn2 == null) {
                brcn2 = brcn.f142396c;
            }
            bree bree = brcn2.f142399b;
            if (bree == null) {
                bree = bree.f142590e;
            }
            pageData = new PageData(bree);
        } else {
            pageData = null;
        }
        if ((brcf.f142358a & 1) != 0) {
            brao brao = brcf.f142359b;
            if (brao == null) {
                brao = brao.f142163b;
            }
            int a2 = bran.m113824a(brao.f142165a);
            z = a2 == 0 ? false : a2 == 3;
        } else {
            z = false;
        }
        if (brcf.f142362e.size() > 0) {
            brcm = (brcm) brcf.f142355f.mo14948a(Integer.valueOf(brcf.f142362e.mo74151b(0)));
        } else {
            brcm = brcm.MEMBER;
        }
        bree[] breeArr = (bree[]) brcf.f142363g.toArray(new bree[0]);
        PageDataMap pageDataMap = new PageDataMap();
        if (breeArr != null) {
            for (bree bree2 : breeArr) {
                int a3 = bred.m113924a(bree2.f142592a);
                if (a3 == 0) {
                    a3 = 1;
                }
                pageDataMap.mo18559a(a3 - 1, new PageData(bree2));
            }
        }
        C1225nr nrVar = new C1225nr();
        C1225nr nrVar2 = new C1225nr();
        C1225nr nrVar3 = new C1225nr();
        ViewerDataModel viewerDataModel = new ViewerDataModel();
        if (brcf != null) {
            brdu brdu = brcf.f142360c;
            if (brdu == null) {
                brdu = brdu.f142562d;
            }
            if ((brcf.f142358a & 2) != 0) {
                for (brdp brdp : new bxvv(brdu.f142564a, brdu.f142561b)) {
                    brds brds = brds.UNKNOWN_CAPABILITY;
                    brdp brdp2 = brdp.UNKNOWN_MANAGE_FAMILY_CAPABILITY;
                    int ordinal = brdp.ordinal();
                    if (ordinal == 1) {
                        viewerDataModel.mo18432b(0);
                    } else if (ordinal == 2) {
                        viewerDataModel.mo18432b(1);
                    } else if (ordinal == 3) {
                        viewerDataModel.mo18432b(2);
                    } else if (ordinal == 4) {
                        viewerDataModel.mo18432b(3);
                    } else if (ordinal == 5) {
                        viewerDataModel.mo18432b(4);
                    }
                }
                bxwc bxwc = brdu.f142565c;
                int size = bxwc.size();
                int i2 = 0;
                while (i2 < size) {
                    brdt brdt = (brdt) bxwc.get(i2);
                    bxwc bxwc2 = bxwc;
                    int i3 = size;
                    Iterator it = new bxvv(brdt.f142559b, brdt.f142555c).iterator();
                    while (true) {
                        i = i2 + 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        brds brds2 = brds.UNKNOWN_CAPABILITY;
                        brdp brdp3 = brdp.UNKNOWN_MANAGE_FAMILY_CAPABILITY;
                        int ordinal2 = ((brds) it.next()).ordinal();
                        if (ordinal2 == 1) {
                            nrVar.add(brdt.f142558a);
                            nrVar2.add(brdt.f142558a);
                        } else if (ordinal2 == 2) {
                            nrVar2.add(brdt.f142558a);
                        } else if (ordinal2 == 3) {
                            nrVar3.add(brdt.f142558a);
                        }
                    }
                    i2 = i;
                    bxwc = bxwc2;
                    size = i3;
                }
                viewerDataModel.f31360a = nrVar2;
                viewerDataModel.f31361b = nrVar;
                viewerDataModel.f31362c = nrVar3;
            }
        }
        wot.f51054i = new DashboardDataModel(z, pageDataMap, viewerDataModel, brcm, pageData);
        brcf brcf2 = ((brcr) why.f50695a).f142425c;
        if (brcf2 == null) {
            brcf2 = brcf.f142356i;
        }
        if ((brcf2.f142358a & 8) != 0) {
            brcf brcf3 = ((brcr) why.f50695a).f142425c;
            if (brcf3 == null) {
                brcf3 = brcf.f142356i;
            }
            brdl brdl = brcf3.f142364h;
            if (brdl == null) {
                brdl = brdl.f142529c;
            }
            if ((brdl.f142531a & 2) != 0) {
                wor wor = this.f51042a.f51048c;
                brcf brcf4 = ((brcr) why.f50695a).f142425c;
                if (brcf4 == null) {
                    brcf4 = brcf.f142356i;
                }
                brdl brdl2 = brcf4.f142364h;
                if (brdl2 == null) {
                    brdl2 = brdl.f142529c;
                }
                brbh brbh = brdl2.f142532b;
                if (brbh == null) {
                    brbh = brbh.f142250j;
                }
                wor.mo18510a(new ContactPickerOptionsData(brbh));
                this.f51042a.mo29250c();
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
