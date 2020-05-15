package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ziu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ziu implements yqf {

    /* renamed from: a */
    private static final srn f55161a = zvt.m46581a();

    /* renamed from: b */
    private final SharedPreferences f55162b;

    /* renamed from: c */
    private final AtomicReference f55163c;

    /* renamed from: d */
    private final caae f55164d;

    public ziu(Context context) {
        this.f55162b = context.getSharedPreferences("last-step-count-cumulative", 0);
        yyc a = yyd.m44987a();
        a.mo30856a(caad.DERIVED);
        a.mo30857a(bzzn.f172102ao);
        a.mo30855a(yxy.f54800b);
        a.mo30858a(zvn.m46574a(context));
        a.mo30859a("live_step_deltas");
        this.f55164d = a.mo30854a();
        AtomicReference atomicReference = new AtomicReference();
        this.f55163c = atomicReference;
        cadn cadn = null;
        String string = this.f55162b.getString("last-step-count", null);
        if (string != null) {
            try {
                cadn = (cadn) GeneratedMessageLite.m124016a(cadn.f172699j, Base64.decode(string, 0), bxus.m123744c());
            } catch (bxwf e) {
            }
        }
        atomicReference.set(cadn);
    }

    /* renamed from: a */
    private final cadn m45538a(cadn cadn, boolean z) {
        cadn cadn2;
        do {
            cadn2 = (cadn) this.f55163c.get();
            if (z && cadn2 != null && cadn2.f172702b > cadn.f172702b) {
                bnsl bnsl = (bnsl) f55161a.mo68388c();
                bnsl.mo68432a("ziu", "a", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Out of order data point: %s is before %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                return null;
            }
        } while (!this.f55163c.compareAndSet(cadn2, cadn));
        this.f55162b.edit().putString("last-step-count", Base64.encodeToString(cadn.serializeToBytes(), 0)).apply();
        return cadn2;
    }

    /* renamed from: c */
    private static int m45539c(cadn cadn) {
        return yyk.m45024c(cadn, bzzj.f172029au, bzzn.f172101an);
    }

    /* renamed from: d */
    private static boolean m45540d(cadn cadn) {
        if (yyk.m45008a(cadn).equals(bzzn.f172101an)) {
            return true;
        }
        bnsl bnsl = (bnsl) f55161a.mo68387b();
        bnsl.mo68432a("ziu", "d", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Require cumulative step counts instead of: %s", yyk.m45023b(cadn));
        return false;
    }

    /* renamed from: c */
    public final caae mo30664c() {
        return this.f55164d;
    }

    /* renamed from: b */
    public final bngx mo31159b(cadn cadn) {
        cadn cadn2 = cadn;
        if (!yyk.m45008a(cadn).equals(bzzn.f172101an)) {
            bnsl bnsl = (bnsl) f55161a.mo68387b();
            bnsl.mo68432a("ziu", "d", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Require cumulative step counts instead of: %s", yyk.m45023b(cadn));
            return bngx.m109376e();
        }
        cadn a = m45538a(cadn2, true);
        if (a == null) {
            return bngx.m109376e();
        }
        if (a.f172702b <= cadn2.f172703c) {
            bnsl bnsl2 = (bnsl) f55161a.mo68388c();
            bnsl2.mo68432a("ziu", "b", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("%s does not intersect with %s", yyk.m45023b(cadn), yyk.m45023b(a));
            return bngx.m109356a(yyk.m45011a(this.f55164d, cadn2.f172703c, cadn2.f172702b, TimeUnit.NANOSECONDS, yyp.m45047a(m45539c(cadn))));
        }
        int c = m45539c(cadn) - m45539c(a);
        if (c > 0) {
            long j = a.f172702b;
            long j2 = cadn2.f172702b;
            if (j > j2) {
                bnsl bnsl3 = (bnsl) f55161a.mo68388c();
                bnsl3.mo68432a("ziu", "b", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68424a("prev is greater than current: %s\n%s", yyk.m45023b(a), yyk.m45023b(cadn));
                return bngx.m109376e();
            }
            return bngx.m109356a(yyk.m45011a(this.f55164d, j, j2, TimeUnit.NANOSECONDS, yyp.m45047a(c)));
        }
        m45538a(a, false);
        return bngx.m109376e();
    }

    /* renamed from: d */
    public final void mo30665d() {
        this.f55162b.edit().remove("last-step-count").apply();
    }

    /* renamed from: a */
    public final caah mo30661a() {
        return bzzn.f172101an;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo30662a(cadn cadn) {
        cadn cadn2 = cadn;
        if (!yyk.m45008a(cadn).equals(bzzn.f172101an)) {
            bnsl bnsl = (bnsl) f55161a.mo68387b();
            bnsl.mo68432a("ziu", "d", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Require cumulative step counts instead of: %s", yyk.m45023b(cadn));
            return bngx.m109376e();
        }
        cadn a = m45538a(cadn2, true);
        if (a == null) {
            return bngx.m109376e();
        }
        if (a.f172702b <= cadn2.f172703c) {
            bnsl bnsl2 = (bnsl) f55161a.mo68388c();
            bnsl2.mo68432a("ziu", "b", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("%s does not intersect with %s", yyk.m45023b(cadn), yyk.m45023b(a));
            return bngx.m109356a(yyk.m45011a(this.f55164d, cadn2.f172703c, cadn2.f172702b, TimeUnit.NANOSECONDS, yyp.m45047a(m45539c(cadn))));
        }
        int c = m45539c(cadn) - m45539c(a);
        if (c > 0) {
            long j = a.f172702b;
            long j2 = cadn2.f172702b;
            if (j > j2) {
                bnsl bnsl3 = (bnsl) f55161a.mo68388c();
                bnsl3.mo68432a("ziu", "b", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68424a("prev is greater than current: %s\n%s", yyk.m45023b(a), yyk.m45023b(cadn));
                return bngx.m109376e();
            }
            return bngx.m109356a(yyk.m45011a(this.f55164d, j, j2, TimeUnit.NANOSECONDS, yyp.m45047a(c)));
        }
        m45538a(a, false);
        return bngx.m109376e();
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return bzzn.f172102ao;
    }
}
