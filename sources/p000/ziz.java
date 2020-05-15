package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: ziz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ziz implements yqf {

    /* renamed from: a */
    private static final srn f55181a = zvt.m46581a();

    /* renamed from: b */
    private static final caah f55182b = bzzn.f172102ao;

    /* renamed from: c */
    private static final caah f55183c = bzzn.f172069I;

    /* renamed from: d */
    private final yix f55184d;

    /* renamed from: e */
    private final caae f55185e;

    public ziz(Context context, yix yix) {
        this.f55184d = yix;
        yyc a = yyd.m44987a();
        a.mo30856a(caad.DERIVED);
        a.mo30857a(f55183c);
        a.mo30855a(yxy.f54800b);
        a.mo30858a(zvn.m46574a(context));
        a.mo30859a("live_distance_from_steps");
        this.f55185e = a.mo30854a();
    }

    /* renamed from: b */
    private static boolean m45569b(cadn cadn) {
        if (f55182b.equals(yyk.m45008a(cadn))) {
            return true;
        }
        bnsl bnsl = (bnsl) f55181a.mo68387b();
        bnsl.mo68432a("ziz", "b", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("%s is required, but got %s", bzzn.m126362a(f55182b), yyk.m45023b(cadn));
        return false;
    }

    /* renamed from: a */
    public final caah mo30661a() {
        return f55182b;
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return f55183c;
    }

    /* renamed from: c */
    public final caae mo30664c() {
        return this.f55185e;
    }

    /* renamed from: d */
    public final void mo30665d() {
    }

    /* renamed from: a */
    public final Collection mo30662a(cadn cadn) {
        if (!f55182b.equals(yyk.m45008a(cadn))) {
            bnsl bnsl = (bnsl) f55181a.mo68387b();
            bnsl.mo68432a("ziz", "b", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s is required, but got %s", bzzn.m126362a(f55182b), yyk.m45023b(cadn));
            return bngx.m109376e();
        }
        int c = yyk.m45024c(cadn, bzzj.f172029au, f55182b);
        long j = cadn.f172703c;
        long j2 = cadn.f172702b;
        float f = (float) c;
        float a = this.f55184d.mo30550a(yix.f53892a.intValue(), f / (((float) (j2 - j)) / ((float) TimeUnit.SECONDS.toNanos(1))));
        return bnic.m109489a(yyk.m45011a(this.f55185e, j, j2, TimeUnit.NANOSECONDS, yyp.m45046a((double) (a * f))));
    }
}
