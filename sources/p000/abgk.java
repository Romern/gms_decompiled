package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgk extends abch implements sjr {

    /* renamed from: a */
    private final bqgj f57408a = snp.m35702a(9);

    /* renamed from: b */
    private final GoogleHelpChimeraService f57409b;

    /* renamed from: c */
    private final String f57410c;

    /* renamed from: d */
    private final sjn f57411d;

    public abgk(GoogleHelpChimeraService googleHelpChimeraService, String str) {
        this.f57409b = googleHelpChimeraService;
        this.f57410c = str;
        this.f57411d = sjn.m35483a(googleHelpChimeraService, googleHelpChimeraService.f44565c, googleHelpChimeraService.f44566d);
    }

    /* renamed from: a */
    private final boolean m47671a() {
        return aayh.m47254a(this.f57410c, cehs.f182689a.mo6606a().mo79147c());
    }

    /* renamed from: b */
    public final void mo32017b(Bundle bundle, long j, GoogleHelp googleHelp, abcf abcf) {
        if (bundle != null) {
            this.f57411d.mo25649a(new abgt(this.f57409b, this.f57410c, abcf, j, bundle, googleHelp));
        }
    }

    /* renamed from: c */
    public final void mo32021c(GoogleHelp googleHelp, abcf abcf) {
        if (!aayh.m47254a(this.f57410c, cefb.m136703b())) {
            String valueOf = String.valueOf(this.f57410c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("getEscalationOptions failed. Package not whitelisted: ") : "getEscalationOptions failed. Package not whitelisted: ".concat(valueOf));
            abcf.mo32009g();
            return;
        }
        googleHelp.f78762e = this.f57410c;
        this.f57411d.mo25649a(new abgm(this.f57409b, this.f57410c, abcf, mo32085a(googleHelp), this.f57408a));
    }

    /* renamed from: d */
    public final void mo32022d(GoogleHelp googleHelp, abcf abcf) {
        if (!aayh.m47254a(this.f57410c, cefb.m136703b())) {
            String valueOf = String.valueOf(this.f57410c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("getRealtimeSupportStatus failed. Package not whitelisted: ") : "getRealtimeSupportStatus failed. Package not whitelisted: ".concat(valueOf));
            abcf.mo32010h();
            return;
        }
        googleHelp.f78762e = this.f57410c;
        this.f57411d.mo25649a(new abgn(this.f57409b, this.f57410c, abcf, mo32085a(googleHelp)));
    }

    /* renamed from: e */
    public final void mo32023e(GoogleHelp googleHelp, abcf abcf) {
        mo32086a(googleHelp, (String) null);
        this.f57411d.mo25649a(new abgp(this.f57409b, this.f57410c, abcf, googleHelp));
    }

    /* renamed from: b */
    public final void mo32018b(GoogleHelp googleHelp, abcf abcf) {
        if (!aayh.m47254a(this.f57410c, cefb.m136703b())) {
            String valueOf = String.valueOf(this.f57410c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("getSuggestions failed. Package not whitelisted: ") : "getSuggestions failed. Package not whitelisted: ".concat(valueOf));
            abcf.mo32008f();
            return;
        }
        googleHelp.f78762e = this.f57410c;
        this.f57411d.mo25649a(new abgo(this.f57409b, this.f57410c, abcf, mo32085a(googleHelp), this.f57408a));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.common.HelpConfig.a(boolean, long):void
     arg types: [int, long]
     candidates:
      com.google.android.gms.googlehelp.common.HelpConfig.a(com.google.android.gms.googlehelp.GoogleHelp, android.content.Context):com.google.android.gms.googlehelp.common.HelpConfig
      com.google.android.gms.googlehelp.common.HelpConfig.a(java.lang.String, android.content.Context):void
      com.google.android.gms.googlehelp.common.HelpConfig.a(boolean, long):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final HelpConfig mo32085a(GoogleHelp googleHelp) {
        HelpConfig a = HelpConfig.m66350a(googleHelp, this.f57409b);
        a.mo43220a(false, System.nanoTime());
        return a;
    }

    /* renamed from: a */
    public final void mo32011a(Bundle bundle, long j, GoogleHelp googleHelp, abcf abcf) {
        if (bundle != null) {
            this.f57411d.mo25649a(new abgu(this.f57409b, this.f57410c, abcf, j, bundle, googleHelp));
        }
    }

    /* renamed from: a */
    public final void mo32012a(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, abcf abcf) {
        if (feedbackOptions != null) {
            this.f57411d.mo25649a(new abgs(this.f57409b, this.f57410c, abcf, feedbackOptions, bundle, j, googleHelp));
        }
    }

    @Deprecated
    /* renamed from: b */
    public final void mo32019b(GoogleHelp googleHelp, String str, String str2, abcf abcf) {
        SupportRequestHelp a = SupportRequestHelp.m66346a(googleHelp);
        a.f78798d = str;
        a.f78797c = str2;
        mo32020b(a, abcf);
    }

    /* renamed from: a */
    public final void mo32013a(GoogleHelp googleHelp, abcf abcf) {
        mo32023e(googleHelp, abcf);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
     arg types: [com.google.android.gms.googlehelp.common.HelpConfig, int]
     candidates:
      com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(sjj, com.google.android.gms.common.internal.GetServiceRequest):void
      sjh.a(sjj, com.google.android.gms.common.internal.GetServiceRequest):void
      com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(com.google.android.gms.googlehelp.common.HelpConfig, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32086a(GoogleHelp googleHelp, String str) {
        googleHelp.f78762e = this.f57410c;
        HelpConfig a = mo32085a(googleHelp);
        a.f78821U = str;
        if (a.f78849x == 0 && (!a.mo43207B() || !aaya.m47228a(cefz.m136755c()))) {
            String str2 = a.f78821U;
            bqgj bqgj = this.f57408a;
            GoogleHelpChimeraService googleHelpChimeraService = this.f57409b;
            if (googleHelpChimeraService.f79001i == null) {
                googleHelpChimeraService.f79001i = new aaxx(googleHelpChimeraService);
            }
            abfb.m47606a(str2, bqgj, googleHelpChimeraService, a, googleHelpChimeraService.f79001i, this.f57409b.mo43374a());
        }
        if (!a.mo43207B()) {
            aatv.m46999a(this.f57408a, new abgi(this.f57409b), a, this.f57409b.mo43374a());
        }
        GoogleHelpChimeraService.m66614a(a, false);
        bqgj bqgj2 = this.f57408a;
        GoogleHelpChimeraService googleHelpChimeraService2 = this.f57409b;
        aarp.m46797a(bqgj2, googleHelpChimeraService2, googleHelpChimeraService2, a);
        this.f57409b.mo43375a(new abgj(a));
        new aare(googleHelp).mo31634a(a.f78830e);
    }

    /* renamed from: b */
    public final void mo32020b(SupportRequestHelp supportRequestHelp, abcf abcf) {
        if (!aayh.m47254a(this.f57410c, ceeg.m136405j())) {
            String valueOf = String.valueOf(this.f57410c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("requestC2cSupport failed. Package not whitelisted: ") : "requestC2cSupport failed. Package not whitelisted: ".concat(valueOf));
            abcf.mo32007e();
            return;
        }
        supportRequestHelp.f78795a.f78762e = this.f57410c;
        aazt.m47336a(this.f57409b);
        this.f57411d.mo25649a(new abgr(this.f57409b, this.f57410c, abcf, mo32085a(supportRequestHelp.f78795a), supportRequestHelp.f78798d, supportRequestHelp.f78797c, supportRequestHelp.f78799e));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo32014a(GoogleHelp googleHelp, String str, String str2, abcf abcf) {
        SupportRequestHelp a = SupportRequestHelp.m66346a(googleHelp);
        a.f78796b = str;
        a.f78797c = str2;
        mo32016a(a, abcf);
    }

    /* renamed from: a */
    public final void mo32015a(InProductHelp inProductHelp, abcf abcf) {
        if (!TextUtils.isEmpty(inProductHelp.f78786c) && !aayh.m47254a(this.f57410c, cefb.m136703b())) {
            String valueOf = String.valueOf(this.f57410c);
            Log.w("gH_GoogleHelpService", valueOf.length() == 0 ? new String("App not permitted to open to URL: ") : "App not permitted to open to URL: ".concat(valueOf));
            inProductHelp.f78786c = null;
        } else if (!TextUtils.isEmpty(inProductHelp.f78785b) && !aayh.m47254a(this.f57410c, cefb.m136703b())) {
            String valueOf2 = String.valueOf(this.f57410c);
            Log.w("gH_GoogleHelpService", valueOf2.length() == 0 ? new String("App not permitted to open to search: ") : "App not permitted to open to search: ".concat(valueOf2));
            inProductHelp.f78785b = null;
        } else if (aaya.m47228a(cehg.m136833b()) && inProductHelp.f78787d == 1) {
            if (!TextUtils.isEmpty(inProductHelp.f78788e)) {
                if (!m47671a()) {
                    String valueOf3 = String.valueOf(this.f57410c);
                    Log.w("gH_GoogleHelpService", valueOf3.length() == 0 ? new String("App not permitted to open to SJ step 3: ") : "App not permitted to open to SJ step 3: ".concat(valueOf3));
                    if (aaya.m47229b(ceih.m136917b())) {
                        inProductHelp.mo43200b();
                        inProductHelp.mo43199a();
                        inProductHelp.mo43201c();
                    } else {
                        inProductHelp.mo43200b();
                        inProductHelp.mo43201c();
                    }
                }
            } else if (!aayh.m47254a(this.f57410c, cefb.m136703b()) && !m47671a()) {
                String valueOf4 = String.valueOf(this.f57410c);
                Log.w("gH_GoogleHelpService", valueOf4.length() == 0 ? new String("App not permitted to open to SJ: ") : "App not permitted to open to SJ: ".concat(valueOf4));
                if (aaya.m47229b(ceih.m136917b())) {
                    inProductHelp.mo43200b();
                    inProductHelp.mo43199a();
                } else {
                    inProductHelp.mo43200b();
                }
            }
        }
        mo32086a(inProductHelp.f78784a, inProductHelp.f78785b);
        this.f57411d.mo25649a(new abgq(this.f57409b, this.f57410c, abcf, inProductHelp));
    }

    /* renamed from: a */
    public final void mo32016a(SupportRequestHelp supportRequestHelp, abcf abcf) {
        if (aayh.m47254a(this.f57410c, ceeg.m136405j())) {
            supportRequestHelp.f78795a.f78762e = this.f57410c;
            aazt.m47336a(this.f57409b);
            bxvd da = bzqm.f171030d.mo74144da();
            String str = supportRequestHelp.f78796b;
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzqm bzqm = (bzqm) da.f164949b;
                str.getClass();
                bzqm.f171032a |= 2;
                bzqm.f171034c = str;
            }
            bxvd da2 = bzqp.f171047j.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzqp bzqp = (bzqp) da2.f164949b;
            bzqm bzqm2 = (bzqm) da.mo74062i();
            bzqm2.getClass();
            bzqp.f171052d = bzqm2;
            bzqp.f171049a |= 4;
            HelpConfig a = mo32085a(supportRequestHelp.f78795a);
            a.mo43218a((bzqp) da2.mo74062i());
            a.f78850y = supportRequestHelp.f78797c;
            this.f57411d.mo25649a(new aaxr(this.f57409b, this.f57410c, abcf, a, supportRequestHelp.f78799e));
            return;
        }
        String valueOf = String.valueOf(this.f57410c);
        Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("requestChatSupport failed. Package not whitelisted: ") : "requestChatSupport failed. Package not whitelisted: ".concat(valueOf));
        abcf.mo32004c();
    }
}
