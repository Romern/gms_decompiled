package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: amxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amxo extends amxj {
    protected amxo(anaz anaz, amyq amyq, amyr amyr, amyp amyp, amvm amvm, amvt amvt, amwr amwr, amyf amyf, amyk amyk, bmxv bmxv) {
        super(ammz.INSERT, amyq, amyr, amyp, anaz, amvm, amvt, amwr, amyf, amyk, bmxv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo41541b(List list) {
        amwr amwr = this.f76288h;
        bzks[] a = amwv.m63578a(list);
        if (ancm.m64009a(a)) {
            return Collections.emptyList();
        }
        bxvd da = btcc.f148250d.mo74144da();
        List asList = Arrays.asList(a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btcc btcc = (btcc) da.f164949b;
        if (!btcc.f148252a.mo73666a()) {
            btcc.f148252a = GeneratedMessageLite.m124021a(btcc.f148252a);
        }
        bxsy.m123078a(asList, btcc.f148252a);
        btdi a2 = amwr.m63562a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btcc btcc2 = (btcc) da.f164949b;
        a2.getClass();
        btcc2.f148253b = a2;
        btea btea = amwr.f76218f;
        btea.getClass();
        btcc2.f148254c = btea;
        btcc btcc3 = (btcc) da.mo74062i();
        amwr.f76216d.mo41626a();
        ampm ampm = amwr.f76214b;
        ClientContext clientContext = amwr.f76213a;
        try {
            ampl ampl = ampm.f75684b;
            long j = (long) ampm.f75683a;
            if (ampl.f75672g == null) {
                ampl.f75672g = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/CreateContactGroups", ciie.m150370a(btcc.f148250d), ciie.m150370a(btcd.f148255b));
            }
            btcd btcd = (btcd) ampl.f75682a.mo25553a(ampl.f75672g, clientContext, btcc3, j, TimeUnit.MILLISECONDS);
            amwr.f76216d.mo41628a("FSA_createContactGroups", btcc3.f148252a.size(), amwy.m63594a(btcd));
            if (btcd != null) {
                amwr.m63564a(btcd.f148257a, list.size());
                return btcd.f148257a;
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
        if (TextUtils.isEmpty(amvr.mo41406l())) {
            bxvd da = bzkv.f170476g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzkv bzkv = (bzkv) da.f164949b;
            bzkv.f170483f = 3;
            int i = bzkv.f170478a | 32;
            bzkv.f170478a = i;
            "Group type missing.".getClass();
            bzkv.f170478a = i | 4;
            bzkv.f170480c = "Group type missing.";
            return bmxv.m108566b((bzkv) da.mo74062i());
        } else if (!TextUtils.isEmpty(amvr.mo41406l().trim())) {
            return bmvz.f131120a;
        } else {
            bxvd da2 = bzkv.f170476g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzkv bzkv2 = (bzkv) da2.f164949b;
            bzkv2.f170483f = 3;
            int i2 = bzkv2.f170478a | 32;
            bzkv2.f170478a = i2;
            "Name is missing.".getClass();
            bzkv2.f170478a = i2 | 4;
            bzkv2.f170480c = "Name is missing.";
            return bmxv.m108566b((bzkv) da2.mo74062i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41537a(amvr amvr, bzkv bzkv) {
        try {
            mo41536a(amww.m63582a(bzkv), amvr);
        } catch (chuw e) {
            chus chus = chus.OK;
            int ordinal = e.f189236a.f189233s.ordinal();
            if (ordinal == 3) {
                amig.m62939a();
                if (((Boolean) amfr.f74868a.mo41191a()).booleanValue()) {
                    ((anbh) this.f76283c).f76541a.stats.numParseExceptions++;
                    m63646a(e, bngx.m109356a(amvr));
                    mo41538a(e, e.f189236a.f189233s.name(), 1);
                    mo41542b(amvr);
                }
            } else if (ordinal == 9 || ordinal == 12 || ordinal == 15 || ordinal == 5 || ordinal == 6) {
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
