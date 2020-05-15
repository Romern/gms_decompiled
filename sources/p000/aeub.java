package p000;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import java.util.Locale;

/* renamed from: aeub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aeub {

    /* renamed from: a */
    private final ClientContext f63810a;

    /* renamed from: b */
    public final String f63811b;

    /* renamed from: c */
    public final Context f63812c;

    /* renamed from: d */
    private boolean f63813d;

    /* renamed from: e */
    private final sgv f63814e;

    public aeub(String str, Context context) {
        this.f63811b = str;
        this.f63812c = context;
        sdo.m34959a((Object) str);
        sdo.m34959a(context);
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        clientContext.mo17806d(cfaz.f183554a.mo6606a().mo80797t());
        this.f63810a = clientContext;
        sgv sgv = new sgv(context, cfaz.f183554a.mo6606a().mo80798u(), cfaz.f183554a.mo6606a().mo80780c(), false, false, cfaz.f183554a.mo6606a().mo80782e(), null);
        sgv.f44447g = 6404;
        this.f63814e = sgv;
    }

    /* renamed from: a */
    public final bxxc mo34565a(bxxc bxxc, bxxc bxxc2, String str) {
        if (!this.f63813d) {
            this.f63813d = true;
            return (bxxc) this.f63814e.mo25513a(this.f63810a, 1, str.toLowerCase(Locale.US), bxxc.mo73642k(), bxxc2);
        }
        throw new IllegalStateException("Can not call execute on Operation more than once.");
    }

    /* renamed from: a */
    public final boolean mo34566a(ShareTarget shareTarget, SharingCondition sharingCondition) {
        bzna bzna;
        bxvd da = bzmz.f170684d.mo74144da();
        int a = bzlk.m125905a(aexx.m52666a(sharingCondition).f170543b);
        if (a == 0) {
            a = 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzmz bzmz = (bzmz) da.f164949b;
        bzmz.f170688c = a - 1;
        bzmz.f170686a |= 2;
        bzly a2 = aexx.m52667a(shareTarget);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        bzlr bzlr = ((bzly) bxvd.f164949b).f170592b;
        if (bzlr == null) {
            bzlr = bzlr.f170559j;
        }
        bxvd bxvd2 = (bxvd) bzlr.mo74142c(5);
        bxvd2.mo73625a((bxvk) bzlr);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bzlr bzlr2 = (bzlr) bxvd2.f164949b;
        bzlr2.f170561a &= -17;
        bzlr2.f170566f = bzlr.f170559j.f170566f;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bzly bzly = (bzly) bxvd.f164949b;
        bzlr bzlr3 = (bzlr) bxvd2.mo74062i();
        bzly bzly2 = bzly.f170589d;
        bzlr3.getClass();
        bzly.f170592b = bzlr3;
        bzly.f170591a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzmz bzmz2 = (bzmz) da.f164949b;
        bzly bzly3 = (bzly) bxvd.mo74062i();
        bzly3.getClass();
        if (!bzmz2.f170687b.mo73666a()) {
            bzmz2.f170687b = bxvk.m124021a(bzmz2.f170687b);
        }
        bzmz2.f170687b.add(bzly3);
        try {
            bzna = (bzna) mo34565a((bzmz) da.mo74062i(), bzna.f170689b, "removeshares");
        } catch (Exception e) {
            bqye.m113758a(e);
            bzna = null;
        }
        if (bzna != null) {
            Context context = this.f63812c;
            String str = this.f63811b;
            bzmb bzmb = bzna.f170691a;
            if (bzmb == null) {
                bzmb = bzmb.f170600c;
            }
            aexp.m52656a(context, str, bzmb);
        }
        return bzna != null;
    }
}
