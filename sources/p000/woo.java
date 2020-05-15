package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.p042v2.model.PageData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: woo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class woo implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wot f51040a;

    public woo(wot wot) {
        this.f51040a = wot;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51040a.getActivity();
        wot wot = this.f51040a;
        return new wnn(activity, wot.f51049d, wot.f51048c.mo18479k(), this.f51040a.f51048c.mo18478j());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        PageData pageData;
        String str;
        String str2;
        int i;
        int i2;
        bxwc bxwc;
        String str3;
        String str4;
        String str5;
        Long l;
        boolean z;
        int i3;
        why why = (why) obj;
        if (why.f50696b) {
            this.f51040a.f51046a.setVisibility(0);
            wot wot = this.f51040a;
            brdc brdc = (brdc) why.f50695a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str6 = brdc.f142478b;
            bxwc bxwc2 = brdc.f142484h;
            int size = bxwc2.size();
            int i4 = 0;
            while (i4 < size) {
                brch brch = (brch) bxwc2.get(i4);
                if ((brch.f142368a & 8) == 0) {
                    String valueOf = String.valueOf(brch.f142369b);
                    if (valueOf.length() == 0) {
                        new String("Member profile is null for member: ");
                    } else {
                        "Member profile is null for member: ".concat(valueOf);
                    }
                    sbw sbw = wgn.f50624a;
                    bxwc = bxwc2;
                    i2 = size;
                } else {
                    brci brci = brch.f142371d;
                    if (brci == null) {
                        brci = brci.f142378g;
                    }
                    String str7 = brci.f142383d;
                    if (!TextUtils.isEmpty(str7)) {
                        str3 = str7;
                    } else {
                        brci brci2 = brch.f142371d;
                        if (brci2 == null) {
                            brci2 = brci.f142378g;
                        }
                        str3 = brci2.f142384e;
                    }
                    brci brci3 = brch.f142371d;
                    if (brci3 == null) {
                        brci3 = brci.f142378g;
                    }
                    if (brci3.f142381b.isEmpty()) {
                        brci brci4 = brch.f142371d;
                        if (brci4 == null) {
                            brci4 = brci.f142378g;
                        }
                        str4 = brci4.f142385f;
                    } else {
                        brci brci5 = brch.f142371d;
                        if (brci5 == null) {
                            brci5 = brci.f142378g;
                        }
                        str4 = brci5.f142381b;
                    }
                    brci brci6 = brch.f142371d;
                    if (brci6 == null) {
                        brci6 = brci.f142378g;
                    }
                    if (!brci6.f142382c.isEmpty()) {
                        brci brci7 = brch.f142371d;
                        if (brci7 == null) {
                            brci7 = brci.f142378g;
                        }
                        str5 = brci7.f142382c;
                    } else {
                        str5 = str4;
                    }
                    brcm a = brcm.m113875a(brch.f142370c);
                    if (a == null) {
                        a = brcm.UNKNOWN_FAMILY_ROLE;
                    }
                    if (a == brcm.UNCONFIRMED_MEMBER) {
                        breh breh = brch.f142375i;
                        if (breh == null) {
                            breh = breh.f142612b;
                        }
                        l = Long.valueOf(breh.f142614a);
                    } else {
                        l = 0L;
                    }
                    String str8 = brch.f142369b;
                    brci brci8 = brch.f142371d;
                    if (brci8 == null) {
                        brci8 = brci.f142378g;
                    }
                    String str9 = brci8.f142385f;
                    String str10 = brch.f142372e;
                    brcm a2 = brcm.m113875a(brch.f142370c);
                    if (a2 == null) {
                        a2 = brcm.UNKNOWN_FAMILY_ROLE;
                    }
                    int i5 = a2.f142395g;
                    brcm a3 = brcm.m113875a(brch.f142370c);
                    if (a3 == null) {
                        a3 = brcm.UNKNOWN_FAMILY_ROLE;
                    }
                    bxwc = bxwc2;
                    if (a3 != brcm.PARENT) {
                        i2 = size;
                        Iterator it = new bxvv(brch.f142373f, brch.f142365g).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((brcm) it.next()) == brcm.PARENT) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        i2 = size;
                        z = true;
                    }
                    brdv brdv = brch.f142376j;
                    if (brdv == null) {
                        brdv = brdv.f142566b;
                    }
                    if (!brdv.f142568a) {
                        brdw brdw = brch.f142374h;
                        if (brdw == null) {
                            brdw = brdw.f142570b;
                        }
                        if (!brdw.f142572a) {
                            i3 = 1;
                            arrayList.add(new MemberDataModel(str8, str9, str4, str5, str3, str10, i5, z, i3, l));
                        }
                    }
                    i3 = 2;
                    arrayList.add(new MemberDataModel(str8, str9, str4, str5, str3, str10, i5, z, i3, l));
                }
                i4++;
                bxwc2 = bxwc;
                size = i2;
            }
            bxwc bxwc3 = brdc.f142485i;
            int size2 = bxwc3.size();
            int i6 = 0;
            while (i6 < size2) {
                brdk brdk = (brdk) bxwc3.get(i6);
                brdm brdm = brdk.f142519c;
                if (brdm == null) {
                    brdm = brdm.f142533d;
                }
                if ((brdk.f142517a & 4) != 0) {
                    brci brci9 = brdk.f142520d;
                    if (brci9 == null) {
                        brci9 = brci.f142378g;
                    }
                    String str11 = brci9.f142383d;
                    if (TextUtils.isEmpty(str11)) {
                        brci brci10 = brdk.f142520d;
                        if (brci10 == null) {
                            brci10 = brci.f142378g;
                        }
                        str11 = brci10.f142384e;
                    }
                    brci brci11 = brdk.f142520d;
                    if (brci11 == null) {
                        brci11 = brci.f142378g;
                    }
                    str = str11;
                    str2 = brci11.f142381b;
                } else {
                    str2 = null;
                    str = null;
                }
                String str12 = brdk.f142518b;
                String str13 = brdm.f142537c;
                String str14 = brdm.f142536b;
                int a4 = brdj.m113900a(brdk.f142525i);
                if (a4 != 0) {
                    i = a4;
                } else {
                    i = 1;
                }
                arrayList2.add(new InvitationDataModel(str12, str2, str13, str14, str, i, Long.valueOf(brdk.f142522f)));
                i6++;
                size2 = size2;
                bxwc3 = bxwc3;
            }
            if ((brdc.f142477a & 32) != 0) {
                bree bree = brdc.f142482f;
                if (bree == null) {
                    bree = bree.f142590e;
                }
                pageData = new PageData(bree);
            } else {
                pageData = null;
            }
            int i7 = brdc.f142483g;
            int a5 = brcc.m113865a(brdc.f142481e);
            int i8 = a5 == 0 ? 1 : a5;
            brcm brcm = brcm.UNKNOWN_FAMILY_ROLE;
            wot.f51053h = new wic(arrayList, arrayList2, i7, i8, str6, brdc.f142479c, pageData);
            this.f51040a.mo29250c();
            return;
        }
        this.f51040a.mo29251d();
        bhnh a6 = bhnh.m101201a(this.f51040a.getView(), (int) C0126R.string.fm_get_family_error, -2);
        a6.mo64030a((int) C0126R.string.common_retry, new won(this));
        a6.mo64020c();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
