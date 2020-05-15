package p000;

import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: amxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amxv extends amxj {
    public amxv(anaz anaz, amyq amyq, amyr amyr, amyp amyp, amvm amvm, amvt amvt, amwr amwr, amyf amyf, amyk amyk, bmxv bmxv) {
        super(ammz.UPDATE, amyq, amyr, amyp, anaz, amvm, amvt, amwr, amyf, amyk, bmxv);
    }

    /* renamed from: a */
    private static bzkv m63703a(String str, String str2) {
        bxvd da = bzkv.f170476g.mo74144da();
        bxvd da2 = bzkq.f170460c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzkq bzkq = (bzkq) da2.f164949b;
        str.getClass();
        bzkq.f170462a |= 1;
        bzkq.f170463b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzkv bzkv = (bzkv) da.f164949b;
        bzkq bzkq2 = (bzkq) da2.mo74062i();
        bzkq2.getClass();
        bzkv.f170479b = bzkq2;
        bzkv.f170478a |= 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzkv bzkv2 = (bzkv) da.f164949b;
        str2.getClass();
        int i = bzkv2.f170478a | 4;
        bzkv2.f170478a = i;
        bzkv2.f170480c = str2;
        bzkv2.f170483f = 3;
        bzkv2.f170478a = i | 32;
        return (bzkv) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo41541b(List list) {
        amwr amwr = this.f76288h;
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        bxvd da = bteq.f148550e.mo74144da();
        List asList = Arrays.asList(amwv.m63578a(list));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bteq bteq = (bteq) da.f164949b;
        if (!bteq.f148552a.mo73666a()) {
            bteq.f148552a = GeneratedMessageLite.m124021a(bteq.f148552a);
        }
        bxsy.m123078a(asList, bteq.f148552a);
        if (ancm.m64009a((bzks[]) Collections.unmodifiableList(((bteq) da.f164949b).f148552a).toArray(new bzks[0]))) {
            return Collections.emptyList();
        }
        btdi a = amwr.m63562a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bteq bteq2 = (bteq) da.f164949b;
        a.getClass();
        bteq2.f148553b = a;
        btea btea = amwr.f76218f;
        btea.getClass();
        bteq2.f148554c = btea;
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82920K()).booleanValue()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bteq) da.f164949b).f148555d = 2;
        }
        amwr.f76216d.mo41626a();
        ampm ampm = amwr.f76214b;
        ClientContext clientContext = amwr.f76213a;
        bteq bteq3 = (bteq) da.mo74062i();
        try {
            ampl ampl = ampm.f75684b;
            long j = (long) ampm.f75683a;
            if (ampl.f75673h == null) {
                ampl.f75673h = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/UpdateContactGroups", ciie.m150370a(bteq.f148550e), ciie.m150370a(bter.f148556b));
            }
            bter bter = (bter) ampl.f75682a.mo25553a(ampl.f75673h, clientContext, bteq3, j, TimeUnit.MILLISECONDS);
            amwr.f76216d.mo41628a("FSA_updateContactGroups", list.size(), amwy.m63594a(bter));
            if (bter != null) {
                amwr.m63564a(bter.f148558a, list.size());
                return bter.f148558a;
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
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f76281a.mo41571a(((amvr) list.get(i)).mo41400g());
        }
        mo41544d(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bmxv mo41534a(amvr amvr) {
        bmxv bmxv;
        String j = amvr.mo41404j();
        if (!bmxx.m108577a(j)) {
            if (anan.m63842b(j)) {
                bmxv = bmxv.m108566b(m63703a(j, "Group ID cannot belong to a system group."));
            } else {
                bmxv = !anan.m63841a(j) ? bmxv.m108566b(m63703a(j, "Invalid group ID.")) : bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
                return bmxv;
            }
            String l = amvr.mo41406l();
            if (bmxx.m108577a(l)) {
                throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Request contains an invalid argument."));
            } else if (l.trim().isEmpty()) {
                return bmxv.m108566b(m63703a(amvr.mo41404j(), "Name is missing."));
            } else {
                return ((long) l.length()) >= cfxs.f186075a.mo6606a().mo83052b() ? bmxv.m108566b(m63703a(amvr.mo41404j(), "Name is too long.")) : bmvz.f131120a;
            }
        } else {
            throw new chuw(chuv.m149607a(chus.INVALID_ARGUMENT).mo85687a("Request contains an invalid argument."));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != 6) goto L_0x0062;
     */
    /* renamed from: a */
    public final void mo41537a(amvr amvr, bzkv bzkv) {
        try {
            mo41536a(amww.m63582a(bzkv), amvr);
        } catch (chuw e) {
            chus chus = chus.OK;
            int ordinal = e.f189236a.f189233s.ordinal();
            if (ordinal != 3) {
                if (!(ordinal == 9 || ordinal == 12 || ordinal == 15)) {
                    if (ordinal == 5) {
                        this.f76281a.mo41572b(amvr.mo41400g());
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
