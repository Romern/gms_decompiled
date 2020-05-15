package p000;

import java.util.ArrayList;

/* renamed from: aalz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalz extends aamb {

    /* renamed from: a */
    final /* synthetic */ aajt f28431a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f28432b;

    /* renamed from: c */
    final /* synthetic */ StringBuilder f28433c;

    /* renamed from: d */
    final /* synthetic */ aand f28434d;

    public aalz(aajt aajt, ArrayList arrayList, StringBuilder sb, aand aand) {
        this.f28431a = aajt;
        this.f28432b = arrayList;
        this.f28433c = sb;
        this.f28434d = aand;
    }

    /* renamed from: a */
    public final void mo16993a(long j, blmp blmp) {
        aajt aajt = this.f28431a;
        if (blmp.f126877l != 0) {
            if (System.currentTimeMillis() > blmp.f126878m + ((long) (blmp.f126877l * 1000))) {
                aajt.mo16914a(blmp, "SERVICE_NOT_AVAILABLE");
            } else {
                StringBuilder sb = this.f28433c;
                sb.append(blmp.f126867b);
                sb.append(",");
                aand aand = this.f28434d;
                bxvd bxvd = (bxvd) blmp.mo74142c(5);
                bxvd.mo73625a((bxvk) blmp);
                aand.mo17091a(bxvd);
                return;
            }
        }
        this.f28432b.add(blmp.f126873h);
    }
}
