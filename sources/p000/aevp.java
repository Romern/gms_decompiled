package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;

/* renamed from: aevp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevp extends aesx {

    /* renamed from: b */
    private final String f63913b;

    /* renamed from: c */
    private final SharingCondition f63914c;

    public aevp(Context context, String str, String str2, SharingCondition sharingCondition) {
        super(context, str);
        this.f63913b = str2;
        this.f63914c = sharingCondition;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bzni bzni;
        int a;
        String str = ((aesx) this).f63753a;
        Context context = getContext();
        String str2 = this.f63913b;
        SharingCondition sharingCondition = this.f63914c;
        aeuf aeuf = new aeuf(str, context);
        bznd bznd = (bznd) bznf.f170700h.mo74144da();
        bzmf a2 = aexp.m52655a(aeuf.f63812c, aeuf.f63811b);
        if (bznd.f164950c) {
            bznd.mo74035c();
            bznd.f164950c = false;
        }
        bznf bznf = (bznf) bznd.f164949b;
        a2.getClass();
        bznf.f170707f = a2;
        bznf.f170702a |= 8;
        bxvd da = bzly.f170589d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzly bzly = (bzly) da.f164949b;
        bzly.f170593c = 1;
        bzly.f170591a |= 2;
        bxvd da2 = bzlr.f170559j.mo74144da();
        if (str2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzlr bzlr = (bzlr) da2.f164949b;
            str2.getClass();
            int i = bzlr.f170561a | 16;
            bzlr.f170561a = i;
            bzlr.f170566f = str2;
            str2.getClass();
            bzlr.f170561a = i | 8;
            bzlr.f170565e = str2;
        } else {
            String string = aeuf.f63812c.getString(C0126R.string.location_sharing_link_name);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzlr bzlr2 = (bzlr) da2.f164949b;
            string.getClass();
            bzlr2.f170561a |= 16;
            bzlr2.f170566f = string;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzly bzly2 = (bzly) da.f164949b;
        bzlr bzlr3 = (bzlr) da2.mo74062i();
        bzlr3.getClass();
        bzly2.f170592b = bzlr3;
        bzly2.f170591a |= 1;
        bznd.mo74550a(aexx.m52666a(sharingCondition));
        if (bznd.f164950c) {
            bznd.mo74035c();
            bznd.f164950c = false;
        }
        bznf bznf2 = (bznf) bznd.f164949b;
        bzly bzly3 = (bzly) da.mo74062i();
        bzly3.getClass();
        if (!bznf2.f170703b.mo73666a()) {
            bznf2.f170703b = bxvk.m124021a(bznf2.f170703b);
        }
        bznf2.f170703b.add(bzly3);
        bxvd da3 = bzme.f170605c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bzme bzme = (bzme) da3.f164949b;
        bzme.f170608b = 1;
        bzme.f170607a |= 1;
        if (bznd.f164950c) {
            bznd.mo74035c();
            bznd.f164950c = false;
        }
        bznf bznf3 = (bznf) bznd.f164949b;
        bzme bzme2 = (bzme) da3.mo74062i();
        bzme2.getClass();
        bznf3.f170708g = bzme2;
        bznf3.f170702a |= 16;
        try {
            bzni = (bzni) aeuf.mo34565a((bznf) bznd.mo74062i(), bzni.f170710d, "updateshares");
        } catch (Exception e) {
            bqye.m113758a(e);
            bzni = null;
        }
        if (bzni == null || (a = bznh.m125955a(bzni.f170712a)) == 0 || a != 2) {
            return null;
        }
        Context context2 = aeuf.f63812c;
        String str3 = aeuf.f63811b;
        bzmb bzmb = bzni.f170714c;
        if (bzmb == null) {
            bzmb = bzmb.f170600c;
        }
        aexp.m52656a(context2, str3, bzmb);
        if (bzni.f170713b.size() <= 0) {
            return null;
        }
        bzlx bzlx = (bzlx) bzni.f170713b.get(0);
        SharingCondition a3 = aexx.m52669a((bzll) bzlx.f170587f.get(0), null);
        String str4 = bzlx.f170584c;
        bzly bzly4 = bzlx.f170583b;
        if (bzly4 == null) {
            bzly4 = bzly.f170589d;
        }
        bzlr bzlr4 = bzly4.f170592b;
        if (bzlr4 == null) {
            bzlr4 = bzlr.f170559j;
        }
        bzmq bzmq = bzlr4.f170567g;
        if (bzmq == null) {
            bzmq = bzmq.f170630f;
        }
        return LocationShare.m66988a(ShareTarget.m67009a(str4, bzmq.f170633b, bzlx.f170586e), a3);
    }
}
