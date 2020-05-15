package p000;

import android.content.pm.PackageManager;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: aajh */
final /* synthetic */ class aajh implements aals {

    /* renamed from: a */
    private final aajt f28279a;

    public aajh(aajt aajt) {
        this.f28279a = aajt;
    }

    /* renamed from: a */
    public final void mo16900a(aalr aalr) {
        Integer num;
        aajt aajt = this.f28279a;
        String string = aalr.f28415d.getString("google.message_id");
        GcmChimeraService.m24303a("Acked %s %s", aalr.f28414c, string);
        aamn aamn = aajt.f28305h;
        aamh aamh = aalr.f28414c;
        if (aamn.f28469a) {
            aamk aamk = aamn.f28471c;
            aaml aaml = aamn.f28470b;
            try {
                int d = aamk.m21520d(aamh);
                synchronized (aamk) {
                    Integer num2 = (Integer) aamk.f28464b.get(aamh);
                    if (num2 != null) {
                        if (num2.intValue() == d) {
                        }
                    }
                    aamk.f28464b.put(aamh, Integer.valueOf(d));
                    aanz aanz = aamk.f28463a;
                    bxvd f = aamk.mo17030f(aamh);
                    if (f.f164950c) {
                        f.mo74035c();
                        f.f164950c = false;
                    }
                    aajw aajw = (aajw) f.f164949b;
                    aajw aajw2 = aajw.f28320h;
                    aajw.f28322a |= 4;
                    aajw.f28325d = d;
                    aanz.mo17161a((aajw) f.mo74062i());
                    if (num2 == null) {
                        aaml.mo17035a("CLIENT_QUEUE_NEW_SUPPORTED_APP_INSTANCE");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            aamn.f28472d.mo17048a(aamh, string);
            aamn.mo17037a();
            aaml aaml2 = aamn.f28470b;
            synchronized (aaml2) {
                num = (Integer) aaml2.f28467b.remove(string);
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == -1) {
                    aaml2.mo17036b(aamh, string, 4, 0);
                    aaml2.mo17035a("CLIENT_QUEUE_ACKED_RETRY_ON_RESTART");
                } else if (intValue != 0) {
                    aaml2.mo17036b(aamh, string, 3, num.intValue());
                    if (cecz.m136062j()) {
                        aaml2.f28466a.f28364a.mo24385d("CLIENT_QUEUE_ACKED_RETRY_WITH_BACKOFF").mo24367a(num.intValue());
                    }
                } else {
                    aaml2.mo17036b(aamh, string, 2, 0);
                    aaml2.mo17035a("CLIENT_QUEUE_ACKED_INITIAL_BROADCAST");
                }
            } else {
                aaml2.mo17036b(aamh, string, 1, 0);
            }
        }
    }
}
