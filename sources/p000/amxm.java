package p000;

import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: amxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amxm extends amxj {
    public amxm(anaz anaz, amyq amyq, amyr amyr, amyp amyp, amvm amvm, amvt amvt, amwr amwr, amyf amyf, amyk amyk, bmxv bmxv) {
        super(ammz.REMOVE, amyq, amyr, amyp, anaz, amvm, amvt, amwr, amyf, amyk, bmxv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo41541b(List list) {
        amwr amwr = this.f76288h;
        if (ancm.m64008a((Collection) list)) {
            return Collections.emptyList();
        }
        bxvd da = btcg.f148266d.mo74144da();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            amvr amvr = (amvr) list.get(i);
            if (!(amvr == null || amvr.mo41404j() == null)) {
                String j = amvr.mo41404j();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btcg btcg = (btcg) da.f164949b;
                j.getClass();
                if (!btcg.f148268a.mo73666a()) {
                    btcg.f148268a = GeneratedMessageLite.m124021a(btcg.f148268a);
                }
                btcg.f148268a.add(j);
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btcg btcg2 = (btcg) da.f164949b;
        btcg2.f148269b = false;
        btea btea = amwr.f76218f;
        btea.getClass();
        btcg2.f148270c = btea;
        btcg btcg3 = (btcg) da.mo74062i();
        amwr.f76216d.mo41626a();
        ampm ampm = amwr.f76214b;
        ClientContext clientContext = amwr.f76213a;
        try {
            ampl ampl = ampm.f75684b;
            long j2 = (long) ampm.f75683a;
            if (ampl.f75674i == null) {
                ampl.f75674i = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/DeleteContactGroups", ciie.m150370a(btcg.f148266d), ciie.m150370a(btch.f148271b));
            }
            btch btch = (btch) ampl.f75682a.mo25553a(ampl.f75674i, clientContext, btcg3, j2, TimeUnit.MILLISECONDS);
            amwr.f76216d.mo41628a("FSA_deleteContactGroups", list.size(), amwy.m63594a(btch));
            if (btch != null) {
                amwr.m63564a(btch.f148273a, list.size());
                return btch.f148273a;
            }
            throw new amxx(1);
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41543c(List list) {
        mo41544d(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bmxv mo41534a(amvr amvr) {
        if (amvr.mo41404j() == null) {
            throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Request contains an invalid argument."));
        } else if (amvr.mo41404j().isEmpty()) {
            throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Entry #1: Group ID is missing."));
        } else if (amvr.mo41404j().trim().isEmpty()) {
            throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Entry #1: Invalid group ID."));
        } else if (anan.m63842b(amvr.mo41404j())) {
            throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Entry #1: Group ID cannot belong to a system group."));
        } else if (anan.m63841a(amvr.mo41404j())) {
            return bmvz.f131120a;
        } else {
            throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Entry #1: Invalid group ID."));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 != 6) goto L_0x0073;
     */
    /* renamed from: a */
    public final void mo41537a(amvr amvr, bzkv bzkv) {
        try {
            amww.m63587b(bzkv);
            this.f76281a.mo41572b(amvr.mo41400g());
        } catch (chuw e) {
            chus chus = chus.OK;
            int ordinal = e.f189236a.f189233s.ordinal();
            if (ordinal != 3) {
                if (!(ordinal == 9 || ordinal == 12 || ordinal == 15)) {
                    if (ordinal == 5) {
                        this.f76281a.mo41572b(amvr.mo41400g());
                        this.f76283c.mo41636a(this.f76287g, amjf.GROUP, false, 3, 1);
                        return;
                    }
                }
                ((anbh) this.f76283c).f76541a.stats.numParseExceptions++;
                m63646a(e, bngx.m109356a(amvr));
                mo41538a(e, e.f189236a.f189233s.name(), 1);
                mo41542b(amvr);
            }
            amig.m62939a();
            if (((Boolean) amfr.f74868a.mo41191a()).booleanValue()) {
                ((anbh) this.f76283c).f76541a.stats.numParseExceptions++;
                m63646a(e, bngx.m109356a(amvr));
                mo41538a(e, e.f189236a.f189233s.name(), 1);
                mo41542b(amvr);
            }
            ((anbh) this.f76283c).f76541a.stats.numIoExceptions++;
            m63646a(e, bngx.m109356a(amvr));
            mo41538a(e, e.f189236a.f189233s.name(), 1);
            mo41542b(amvr);
        }
    }
}
