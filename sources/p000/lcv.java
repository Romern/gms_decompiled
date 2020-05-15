package p000;

import android.service.autofill.FillCallback;
import android.service.autofill.FillEventHistory;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;
import java.util.concurrent.TimeUnit;

/* renamed from: lcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lcv implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bmza f25801a;

    /* renamed from: b */
    final /* synthetic */ FillCallback f25802b;

    /* renamed from: c */
    final /* synthetic */ boolean f25803c;

    /* renamed from: d */
    final /* synthetic */ String f25804d;

    /* renamed from: e */
    final /* synthetic */ ClientState f25805e;

    /* renamed from: f */
    final /* synthetic */ leh f25806f;

    /* renamed from: g */
    final /* synthetic */ kuw f25807g;

    /* renamed from: h */
    final /* synthetic */ FillEventHistory f25808h;

    /* renamed from: i */
    final /* synthetic */ lcx f25809i;

    /* renamed from: j */
    final /* synthetic */ int f25810j;

    public lcv(lcx lcx, bmza bmza, FillCallback fillCallback, boolean z, String str, ClientState clientState, leh leh, int i, kuw kuw, FillEventHistory fillEventHistory) {
        this.f25809i = lcx;
        this.f25801a = bmza;
        this.f25802b = fillCallback;
        this.f25803c = z;
        this.f25804d = str;
        this.f25805e = clientState;
        this.f25806f = leh;
        this.f25810j = i;
        this.f25807g = kuw;
        this.f25808h = fillEventHistory;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        lei lei = (lei) obj;
        bmza bmza = this.f25801a;
        bmza.mo66931e();
        long a = bmza.mo66928a(TimeUnit.MILLISECONDS);
        try {
            lcx lcx = this.f25809i;
            FillCallback fillCallback = this.f25802b;
            bmxv bmxv = lei.f25879d;
            boolean z = this.f25803c;
            bmxv b = bmxv.m108566b(this.f25804d);
            bmxv bmxv2 = lei.f25884i;
            bmxv a2 = lrb.m19568a(this.f25805e);
            srn srn = lcx.f25813a;
            lcx.mo14987a(fillCallback, bmxv, z, b, bmxv2, a2);
            bxvd da = lan.f25571j.mo74144da();
            int i = this.f25806f.f25871a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lan lan = (lan) da.f164949b;
            lan.f25574b = i;
            lan.f25575c = a;
            lan.f25576d = lei.f25880e;
            lan.f25577e = lei.f25881f;
            lan.f25580h = lei.f25882g;
            lan.f25581i = lei.f25883h;
            lan.f25578f = lam.m18854a(this.f25810j);
            lan lan2 = (lan) da.mo74062i();
            if (this.f25809i.f25816b.mo14831f().mo15089i()) {
                kwe a3 = kwe.m18646a(this.f25809i.getApplicationContext());
                a3.mo14893d(this.f25806f.f25871a);
                a3.mo14884a(a);
                a3.mo14891b(lei.f25880e);
                a3.mo14889a(lei.f25882g);
                a3.mo14883a(lam.m18854a(this.f25810j));
                bmxv c = bmxv.m108567c(this.f25805e.f11673e);
                if (c.mo66813a()) {
                    MetricsContext metricsContext = (MetricsContext) c.mo66814b();
                    kwe a4 = kwe.m18646a(this.f25809i.getApplicationContext());
                    a4.mo14894e(metricsContext.mo7953a());
                    a4.mo14886a(metricsContext.mo7956b().f25496a, metricsContext.mo7956b().f25497b);
                    a4.mo14885a(metricsContext.mo7957c().f25727a);
                }
                this.f25809i.mo14985a();
            }
            lcx.m18936a(lan2, bmxv.m108567c(this.f25805e.f11673e), this.f25807g.mo14863a());
            this.f25807g.mo14866d().mo15018a(this.f25808h);
        } catch (Throwable th) {
            bxvd da2 = lan.f25571j.mo74144da();
            int i2 = this.f25806f.f25871a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            lan lan3 = (lan) da2.f164949b;
            lan3.f25574b = i2;
            lan3.f25575c = a;
            lan3.f25576d = lei.f25880e;
            lan3.f25577e = lei.f25881f;
            lan3.f25580h = lei.f25882g;
            lan3.f25581i = lei.f25883h;
            lan3.f25578f = lam.m18854a(this.f25810j);
            lan lan4 = (lan) da2.mo74062i();
            lcx lcx2 = this.f25809i;
            srn srn2 = lcx.f25813a;
            if (lcx2.f25816b.mo14831f().mo15089i()) {
                kwe a5 = kwe.m18646a(this.f25809i.getApplicationContext());
                a5.mo14893d(this.f25806f.f25871a);
                a5.mo14884a(a);
                a5.mo14891b(lei.f25880e);
                a5.mo14889a(lei.f25882g);
                a5.mo14883a(lam.m18854a(this.f25810j));
                bmxv c2 = bmxv.m108567c(this.f25805e.f11673e);
                if (c2.mo66813a()) {
                    MetricsContext metricsContext2 = (MetricsContext) c2.mo66814b();
                    kwe a6 = kwe.m18646a(this.f25809i.getApplicationContext());
                    a6.mo14894e(metricsContext2.mo7953a());
                    a6.mo14886a(metricsContext2.mo7956b().f25496a, metricsContext2.mo7956b().f25497b);
                    a6.mo14885a(metricsContext2.mo7957c().f25727a);
                }
                this.f25809i.mo14985a();
            }
            lcx.m18936a(lan4, bmxv.m108567c(this.f25805e.f11673e), this.f25807g.mo14863a());
            this.f25807g.mo14866d().mo15018a(this.f25808h);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bmza bmza = this.f25801a;
        bmza.mo66931e();
        long a = bmza.mo66928a(TimeUnit.MILLISECONDS);
        try {
            bnsl bnsl = (bnsl) lcx.f25813a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("lcv", "a", 396, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68448m();
            this.f25809i.mo14987a(this.f25802b, bmvz.f131120a, this.f25803c, bmxv.m108566b(this.f25804d), bmvz.f131120a, lrb.m19568a(this.f25805e));
        } finally {
            bxvd da = lan.f25571j.mo74144da();
            int i = this.f25806f.f25871a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lan lan = (lan) da.f164949b;
            lan.f25574b = i;
            lan.f25575c = a;
            lan.f25576d = false;
            lan.f25577e = false;
            lan.f25578f = lam.m18854a(this.f25810j);
            lcx.m18936a((lan) da.mo74062i(), bmxv.m108567c(this.f25805e.f11673e), this.f25807g.mo14863a());
            this.f25807g.mo14866d().mo15018a(this.f25808h);
            if (this.f25809i.f25816b.mo14831f().mo15089i()) {
                kwe a2 = kwe.m18646a(this.f25809i.getApplicationContext());
                a2.mo14893d(this.f25806f.f25871a);
                a2.mo14884a(a);
                a2.mo14891b(false);
                a2.mo14883a(lam.m18854a(this.f25810j));
                bmxv c = bmxv.m108567c(this.f25805e.f11673e);
                if (c.mo66813a()) {
                    MetricsContext metricsContext = (MetricsContext) c.mo66814b();
                    kwe a3 = kwe.m18646a(this.f25809i.getApplicationContext());
                    a3.mo14894e(metricsContext.mo7953a());
                    a3.mo14886a(metricsContext.mo7956b().f25496a, metricsContext.mo7956b().f25497b);
                    a3.mo14885a(metricsContext.mo7957c().f25727a);
                }
                this.f25809i.mo14985a();
            }
        }
    }
}
