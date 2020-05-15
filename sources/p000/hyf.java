package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyf {

    /* renamed from: a */
    public final sek f20556a = new sek("ConsentPromptRequestHandler");

    /* renamed from: b */
    public final hzs f20557b = new hzj();

    /* renamed from: c */
    public final Map f20558c = new HashMap();

    /* renamed from: d */
    public final hzh f20559d = new hyd(this);

    /* renamed from: e */
    public final hzl f20560e;

    /* renamed from: f */
    public final hzk f20561f;

    /* renamed from: g */
    public final hzq f20562g;

    /* renamed from: h */
    private final hyc f20563h;

    /* renamed from: i */
    private final hye f20564i;

    public hyf(hzl hzl, hzk hzk, hzq hzq, hyc hyc) {
        hye hye = new hye(this);
        this.f20564i = hye;
        this.f20560e = hzl;
        this.f20561f = hzk;
        this.f20562g = hzq;
        this.f20563h = hyc;
        hyc.f20552a = hye != null ? new WeakReference(hye) : null;
    }

    /* renamed from: b */
    public static long m15008b() {
        return ccdy.m129349b() * 1000;
    }

    /* renamed from: c */
    public static long m15009c() {
        return ccdy.f178810a.mo6606a().mo75815c() * 1000;
    }

    /* renamed from: d */
    public static long m15010d() {
        return ccdy.f178810a.mo6606a().mo75813a() * 1000;
    }

    /* renamed from: a */
    public static String m15007a(String str) {
        return bmxx.m108577a(str) ? "" : str;
    }

    /* renamed from: b */
    public final hyk mo12809b(String str) {
        hyk hyk = (hyk) this.f20558c.get(str);
        if (hyk != null) {
            return hyk;
        }
        hyk hyk2 = new hyk();
        this.f20558c.put(str, hyk2);
        return hyk2;
    }

    /* renamed from: a */
    public final void mo12806a(long j) {
        bnre i = bngx.m109368a((Collection) this.f20558c.keySet()).listIterator();
        while (i.hasNext()) {
            String str = (String) i.next();
            hyk hyk = (hyk) this.f20558c.get(str);
            if (hyk != null) {
                long d = j - m15010d();
                bnrd a = bnic.m109495a((Collection) hyk.f20570e.keySet()).iterator();
                while (a.hasNext()) {
                    String str2 = (String) a.next();
                    hyj hyj = (hyj) hyk.f20570e.get(str2);
                    if (hyj == null || hyj.mo12799a() <= d) {
                        hyk.f20570e.remove(str2);
                    }
                }
                this.f20556a.mo25412b("clearTimeoutNotifiedPackages at %d", Long.valueOf(j));
                long c = j - m15009c();
                bngs j2 = bngx.m109377j();
                bnrd a2 = bnic.m109495a((Collection) hyk.f20569d.mo67316o()).iterator();
                while (a2.hasNext()) {
                    long longValue = ((Long) a2.next()).longValue();
                    if (longValue <= c) {
                        for (hyi hyi : hyk.f20569d.mo67126b(Long.valueOf(longValue))) {
                            j2.mo67668c(hyi.mo12794a());
                        }
                    }
                }
                bngx a3 = j2.mo67664a();
                if (!a3.isEmpty()) {
                    this.f20561f.mo12832a(a3);
                    bnre i2 = a3.listIterator();
                    while (i2.hasNext()) {
                        String str3 = (String) i2.next();
                        this.f20556a.mo25412b("Notified request timeout: %s", str3);
                        this.f20561f.mo12831a(ibh.m15187e(str3));
                    }
                }
                this.f20556a.mo25412b("clearTimeoutAwaitingRequests at %d", Long.valueOf(j));
                long b = j - m15008b();
                bngs j3 = bngx.m109377j();
                Iterator it = hyk.f20568c.mo67315n().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Long) entry.getValue()).longValue() <= b) {
                        j3.mo67668c((String) entry.getKey());
                        it.remove();
                    }
                }
                bngx a4 = j3.mo67664a();
                if (!a4.isEmpty()) {
                    this.f20561f.mo12832a(a4);
                    bnre i3 = a4.listIterator();
                    while (i3.hasNext()) {
                        String str4 = (String) i3.next();
                        this.f20556a.mo25412b("Request timeout: %s", str4);
                        this.f20561f.mo12831a(ibh.m15182c(str4));
                    }
                }
                if (hyk.mo12814a()) {
                    this.f20558c.remove(str);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo12807a(bngx bngx, String str, long j) {
        if (!bngx.isEmpty()) {
            hyc hyc = this.f20563h;
            VerificationToken verificationToken = new iaa().f20621a;
            verificationToken.f10278b = str;
            verificationToken.f10277a = j;
            Context a = hyc.f20553b.f20600g.mo12841a();
            if (a != null) {
                spn.m35856a(a, "com.google.android.gms.auth.api.phone.ui.UserConsentPromptActivity", true);
            }
            int size = bngx.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) bngx.get(i);
                if (str2 != null) {
                    hzu hzu = hyc.f20553b.f20600g;
                    Intent intent = new Intent("com.google.android.gms.auth.api.phone.ACTION_USER_CONSENT").setPackage("com.google.android.gms");
                    sef.m35071a(verificationToken, intent, "com.google.android.gms.auth.api.phone.extra.verification_token");
                    hzu.mo12842a(hxw.m14998a(str2, Status.f30107a).putExtra("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", intent));
                }
            }
            bnre i2 = bngx.listIterator();
            while (i2.hasNext()) {
                this.f20561f.mo12831a(ibh.m15185d((String) i2.next()));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12808a() {
        for (hyk hyk : this.f20558c.values()) {
            if (!hyk.mo12814a()) {
                return false;
            }
        }
        return true;
    }
}
