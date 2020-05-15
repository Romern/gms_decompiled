package p000;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: yrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yrb extends shd {

    /* renamed from: a */
    public final sgv f54472a;

    public yrb(sgv sgv) {
        this.f54472a = sgv;
        sgv.mo25521a(3328);
    }

    /* renamed from: a */
    public final cacb mo30683a(ClientContext clientContext, caca caca) {
        sgv sgv = this.f54472a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(caca.f172504d));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 36);
        sb2.append("/users/");
        sb2.append(a);
        sb2.append(":exchangeSyncTokens?alt=proto");
        sb.append(sb2.toString());
        return (cacb) sgv.mo25513a(clientContext, 1, sb.toString(), caca.mo73642k(), cacb.f172505d);
    }

    /* renamed from: a */
    public final cacg mo30684a(ClientContext clientContext, cacf cacf) {
        sgv sgv = this.f54472a;
        StringBuilder sb = new StringBuilder();
        String a = shd.m35267a(String.valueOf(cacf.f172539b));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 41);
        sb2.append("/users/");
        sb2.append(a);
        sb2.append("/dataPointMutations:list?alt=proto");
        sb.append(sb2.toString());
        return (cacg) sgv.mo25513a(clientContext, 1, sb.toString(), cacf.mo73642k(), cacg.f172542d);
    }
}
