package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import java.util.concurrent.Executor;

/* renamed from: avbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbe extends avas {

    /* renamed from: k */
    private static final bnsn f92897k = avex.m78396b();

    /* renamed from: l */
    private final avgn f92898l;

    /* renamed from: o */
    private final avfh f92899o;

    /* renamed from: p */
    private final ayte f92900p;

    /* renamed from: q */
    private long f92901q;

    public avbe(wfs wfs, ClientContext clientContext, avgm avgm, avgn avgn, avfh avfh, bbjm bbjm, Executor executor, FacsCacheCallOptions facsCacheCallOptions, aveu aveu, bdro bdro, ayte ayte, wfh wfh) {
        super("GetActivityControlsSettingsOperation", wfs, clientContext, avgm, bbjm, executor, facsCacheCallOptions, aveu, bdro, 1008, wfh);
        this.f92898l = avgn;
        this.f92899o = avfh;
        this.f92900p = ayte;
    }

    /* renamed from: d */
    private final bxpe m78184d() {
        bnsi d = f92897k.mo68390d();
        d.mo68432a("avbe", "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Forwarding operation '%s' to internal FACS API...", this.f27820m);
        try {
            bxus b = bxus.m123743b();
            return (bxpe) GeneratedMessageLite.m124016a(bxpe.f164247d, (byte[]) m78148a(this.f92870i.mo29076a(new FacsInternalSyncCallOptions(false))), b);
        } catch (bxwf e) {
            throw new aaaj(35002, "Failure parsing the bytes returned by the internal sync API call.", null, e);
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        bxpe bxpe;
        bxpe bxpe2;
        long j;
        int i;
        bxpe bxpe3;
        bnsi d = f92897k.mo68390d();
        String str = "avbe";
        d.mo68432a(str, "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Executing operation '%s'...", this.f27820m);
        this.f92901q = this.f92900p.mo54418b();
        mo51122a();
        mo51124a(chbh.f188248a.mo6606a().mo84966z());
        this.f92869h.mo58314a();
        auzj auzj = (auzj) avje.m78606a(bqdx.m112674a(this.f92898l.mo51196a(this.f92863b.f30213c, bqgs.m112810a()), avbd.f92896a, bqfb.INSTANCE));
        if (auzj != null) {
            bxpe = auzj.f92830b;
            if (bxpe == null) {
                bxpe = bxpe.f164247d;
            }
            z = false;
        } else {
            if (!chbh.m148009g()) {
                bxpe3 = mo51121a(avgl.EMPTY_CACHE);
            } else {
                bnsi d2 = f92897k.mo68390d();
                d2.mo68432a(str, "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68420a("Forwarding operation '%s' to internal FACS API...", this.f27820m);
                try {
                    bxpe3 = (bxpe) GeneratedMessageLite.m124016a(bxpe.f164247d, (byte[]) m78148a(this.f92870i.mo29076a(new FacsInternalSyncCallOptions(false))), bxus.m123743b());
                } catch (bxwf e) {
                    throw new aaaj(35002, "Failure parsing the bytes returned by the internal sync API call.", null, e);
                }
            }
            z = true;
        }
        if (this.f92899o.mo51192a()) {
            bxvd bxvd = (bxvd) bxpe.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bxpe);
            bxok b = this.f92899o.mo51193b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxpe bxpe4 = (bxpe) bxvd.f164949b;
            bxpe bxpe5 = bxpe.f164247d;
            b.getClass();
            bxpe4.f164251c = b;
            bxpe4.f164249a |= 1;
            bxpe = (bxpe) bxvd.mo74062i();
        }
        aveu aveu = this.f92868g;
        String b2 = mo51125b();
        long c = mo51126c();
        String str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        long b3 = this.f92900p.mo54418b() - this.f92901q;
        if (z) {
            bxpe2 = bxpe;
            j = 0;
        } else if ((auzj.f92829a & 2) != 0) {
            bxpe2 = bxpe;
            j = this.f92900p.mo54417a() - auzj.f92831c;
        } else {
            bxpe2 = bxpe;
            j = -1;
        }
        bxpe bxpe6 = bxpe2;
        bxwc bxwc = bxpe6.f164250b;
        bngs j2 = bngx.m109377j();
        int size = bxwc.size();
        int i2 = 0;
        while (i2 < size) {
            bxwc bxwc2 = bxwc;
            bxpd bxpd = (bxpd) bxwc.get(i2);
            int i3 = size;
            bxvd da = bxop.f164187e.mo74144da();
            bxpe bxpe7 = bxpe6;
            int i4 = bxpd.f164243b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxop bxop = (bxop) da.f164949b;
            int i5 = bxop.f164189a | 1;
            bxop.f164189a = i5;
            bxop.f164190b = i4;
            boolean z2 = bxpd.f164246e;
            int i6 = i5 | 4;
            bxop.f164189a = i6;
            bxop.f164192d = z2;
            boolean z3 = bxpd.f164244c;
            bxop.f164189a = i6 | 2;
            bxop.f164191c = z3;
            j2.mo67668c((bxop) da.mo74062i());
            i2++;
            bxpe6 = bxpe7;
            bxwc = bxwc2;
            size = i3;
            str = str;
        }
        String str3 = str;
        bxpe bxpe8 = bxpe6;
        long longValue = ((Long) aveu.f93039c.mo6606a()).longValue();
        if (aveu.f93040d.mo35048a(longValue)) {
            bxvd da2 = bxoq.f164193g.mo74144da();
            if (!da2.f164950c) {
                i = 0;
            } else {
                da2.mo74035c();
                i = 0;
                da2.f164950c = false;
            }
            bxoq bxoq = (bxoq) da2.f164949b;
            int i7 = bxoq.f164195a | 1;
            bxoq.f164195a = i7;
            bxoq.f164196b = i;
            bxoq.f164195a = i7 | 2;
            bxoq.f164197c = b3;
            bxvd da3 = bxoo.f164182d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxoo bxoo = (bxoo) da3.f164949b;
            b2.getClass();
            int i8 = bxoo.f164184a | 1;
            bxoo.f164184a = i8;
            bxoo.f164185b = b2;
            bxoo.f164184a = i8 | 2;
            bxoo.f164186c = c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxoq bxoq2 = (bxoq) da2.f164949b;
            bxoo bxoo2 = (bxoo) da3.mo74062i();
            bxoo2.getClass();
            bxoq2.f164198d = bxoo2;
            bxoq2.f164195a |= 4;
            bngx a = j2.mo67664a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxoq bxoq3 = (bxoq) da2.f164949b;
            if (!bxoq3.f164200f.mo73666a()) {
                bxoq3.f164200f = GeneratedMessageLite.m124021a(bxoq3.f164200f);
            }
            bxsy.m123078a(a, bxoq3.f164200f);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxoq bxoq4 = (bxoq) da2.f164949b;
            bxoq4.f164195a |= 8;
            bxoq4.f164199e = j;
            bxoq bxoq5 = (bxoq) da2.mo74062i();
            qws qws = (qws) aveu.f93038b.mo6606a();
            bxvd da4 = bxpw.f164324h.mo74144da();
            int i9 = (int) longValue;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw = (bxpw) da4.f164949b;
            bxpw.f164326a |= 64;
            bxpw.f164329d = i9;
            bxvd da5 = bxot.f164207c.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxot bxot = (bxot) da5.f164949b;
            bxoq5.getClass();
            bxot.f164210b = bxoq5;
            bxot.f164209a = 3;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw2 = (bxpw) da4.f164949b;
            bxot bxot2 = (bxot) da5.mo74062i();
            bxot2.getClass();
            bxpw2.f164328c = bxot2;
            bxpw2.f164327b = 3;
            bxvd da6 = bxpp.f164297d.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bxpp bxpp = (bxpp) da6.f164949b;
            "com.google.android.gms#udc-facs".getClass();
            bxpp.f164299a |= 1;
            bxpp.f164300b = "com.google.android.gms#udc-facs";
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxpw bxpw3 = (bxpw) da4.f164949b;
            bxpp bxpp2 = (bxpp) da6.mo74062i();
            bxpp2.getClass();
            bxpw3.f164330e = bxpp2;
            bxpw3.f164326a |= 128;
            qwo a2 = qws.mo24333a(da4.mo74062i());
            a2.mo24328b(1007);
            a2.mo24327b();
        }
        bnsi d3 = f92897k.mo68390d();
        d3.mo68432a(str3, "a", 131, str2);
        d3.mo68420a("Operation '%s' successful!", this.f27820m);
        this.f92862a.mo29069a(Status.f30107a, new GetActivityControlsSettingsResult(bxpe8.serializeToBytes()));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51123a(status.f30115i, this.f92900p.mo54418b() - this.f92901q);
        this.f92862a.mo29069a(status, (GetActivityControlsSettingsResult) null);
    }
}
