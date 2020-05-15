package p000;

import android.content.Context;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.common.Feature;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: lgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgr implements lgd {

    /* renamed from: c */
    public static final /* synthetic */ int f26050c = 0;

    /* renamed from: a */
    public final Context f26051a;

    /* renamed from: b */
    public final lic f26052b;

    /* renamed from: d */
    private final keg f26053d;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public lgr(Context context, keg keg) {
        lic lic = new lic(context);
        this.f26051a = context;
        this.f26053d = keg;
        this.f26052b = lic;
    }

    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        bmxv bmxv;
        kbz kbz;
        try {
            FillForm fillForm = lgc.f26027c;
            if (fillForm.mo7949a(kpb.OTP_FULL) || fillForm.mo7949a(kpb.OTP_1)) {
                String packageName = lgc.f26025a.f25872b.getActivityComponent().getPackageName();
                lic lic = this.f26052b;
                hxu hxu = lic.f26138b;
                sdo.m34959a((Object) packageName);
                sdo.m34975b(!packageName.isEmpty(), "The package name cannot be empty.");
                roz b = rpa.m34196b();
                b.f43473b = new Feature[]{kax.f23671a};
                b.f43472a = new hzb(packageName);
                bqgg a = lqv.m19545a(((rjx) hxu).mo24701a(b.mo24977a()));
                hxu hxu2 = lic.f26138b;
                roz b2 = rpa.m34196b();
                b2.f43473b = new Feature[]{kax.f23671a};
                b2.f43472a = new hza();
                bqgg a2 = lqv.m19545a(((rjx) hxu2).mo24701a(b2.mo24977a()));
                bqgg a3 = bqdx.m112674a(bqga.m112786c(a, a2).mo69214a(new lia(a, a2), bqfb.INSTANCE), new lgn(this), bqfb.INSTANCE);
                if (lgc.f26029e.mo66813a()) {
                    bmxv = bmxv.m108566b(Integer.valueOf(((MetricsContext) lgc.f26029e.mo66814b()).mo7958d()));
                } else {
                    bmxv = bmvz.f131120a;
                }
                kbz = null;
                lib lib = (lib) a3.get();
                if (lib.mo15149b() == 0) {
                    FillForm fillForm2 = lgc.f26027c;
                    String a4 = lib.mo15148a();
                    bmxv a5 = lgc.mo15061a();
                    if (a4 != null) {
                        kby a6 = kbz.m17615a();
                        bxvd da = kdk.f23890c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        kdk kdk = (kdk) da.f164949b;
                        a4.getClass();
                        kdk.f23892a = 1 | kdk.f23892a;
                        kdk.f23893b = a4;
                        for (Map.Entry entry : this.f26053d.mo14409a((kdk) da.mo74062i(), fillForm2).entrySet()) {
                            kqc kqc = (kqc) entry.getValue();
                            FillField fillField = (FillField) entry.getKey();
                            a6.mo14355a(fillField.f11631a, kqk.m18329a(fillField, kqc.f24786a), lbj.m18887a(this.f26051a, kqc.f24787b, kqc.f24788c, kqc.f24789d), a5.mo66810a((bmxj) new lgq(this, kqc)));
                        }
                        if (bmxv.mo66813a()) {
                            String valueOf = String.valueOf(bmxv.mo66814b());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                            sb.append(valueOf);
                            a6.mo14357a(sb.toString());
                        }
                        kbz = a6.mo14352a();
                    }
                } else {
                    kbz = lrf.m19575a(this.f26051a, lgc.f26027c, bmxv, lgc.mo15061a());
                }
                if (kbz != null) {
                    lbe lbe = lbe.SMS_OTP;
                    bxvd da2 = lba.f25675f.mo74144da();
                    int intValue = ((Integer) bmxv.mo66812a((Object) 0)).intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((lba) da2.f164949b).f25677a = intValue;
                    laz laz = laz.OTP;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((lba) da2.f164949b).f25678b = laz.mo3214a();
                    da2.mo73933A((Iterable) lgc.f26027c.f11641a.stream().filter(lgo.f26046a).map(lgp.f26047a).collect(Collectors.toList()));
                    bngx a7 = bngx.m109356a(new lgb(kbz, lbe, bmxv.m108566b((lba) da2.mo74062i())));
                    this.f26052b.mo15157a();
                    return a7;
                }
            }
        } catch (CancellationException e) {
        } catch (InterruptedException | ExecutionException e2) {
            kbz = lrf.m19575a(this.f26051a, lgc.f26027c, bmxv, lgc.mo15061a());
        } catch (Throwable th) {
            this.f26052b.mo15157a();
            throw th;
        }
        this.f26052b.mo15157a();
        return bngx.m109376e();
    }
}
