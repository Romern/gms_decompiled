package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: avve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avve extends avuo {

    /* renamed from: a */
    private final String f93958a;

    /* renamed from: b */
    private final byte[] f93959b;

    /* renamed from: c */
    private final int[] f93960c;

    /* renamed from: d */
    private final int f93961d;

    /* renamed from: e */
    private final Context f93962e;

    /* renamed from: f */
    private final aucf f93963f;

    /* renamed from: g */
    private final qws f93964g;

    /* renamed from: a */
    private final boolean m79414a(ConsentInformation.AccountConsentInformation accountConsentInformation, int i, boolean z, boolean z2) {
        List a = accountConsentInformation.mo59686a();
        bxvd da = C1706call.f175148e.mo74144da();
        if (!a.isEmpty()) {
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) a.get(i2);
                if (num != null) {
                    bymk a2 = bymk.m124955a(num.intValue());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C1706call call = (C1706call) da.f164949b;
                    a2.getClass();
                    if (!call.f175152c.mo73666a()) {
                        call.f175152c = bxvk.m124019a(call.f175152c);
                    }
                    call.f175152c.mo74153d(a2.f167032d);
                }
            }
        }
        try {
            calo calo = (calo) bxvk.m124014a(calo.f175155l, accountConsentInformation.f109536b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C1706call call2 = (C1706call) da.f164949b;
            calo.getClass();
            call2.f175151b = calo;
            call2.f175150a |= 1;
            if (chdw.f188506a.mo6606a().mo85155b() && this.f93962e.getPackageName().equals("com.google.android.gms")) {
                int i3 = Build.VERSION.SDK_INT;
                UserManager userManager = (UserManager) this.f93962e.getSystemService("user");
                if (userManager != null) {
                    int userCount = userManager.getUserCount();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C1706call call3 = (C1706call) da.f164949b;
                    call3.f175150a |= 2;
                    call3.f175153d = userCount;
                }
            }
            qws qws = this.f93964g;
            if (z2) {
                qws = qws.m33019a(this.f93962e.getApplicationContext(), this.f93958a);
            }
            qwo a3 = qws.mo24335a(this.f93959b);
            a3.f42322f = cagz.m126622a(this.f93961d);
            a3.f42320d = this.f93958a;
            HashMap hashMap = new HashMap();
            hashMap.put("CONSENT_INFO", Base64.encodeToString(((C1706call) da.mo74062i()).mo73642k(), 0));
            hashMap.put("ACCOUNT_INDEX", Integer.toString(i));
            bxvf bxvf = a3.f42325i;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi = cagi.f173096t;
            ((cagi) bxvf.f164949b).f173105h = bxvk.m124030de();
            for (Map.Entry entry : hashMap.entrySet()) {
                bxvd da2 = cagj.f173117d.mo74144da();
                String str = (String) entry.getKey();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cagj cagj = (cagj) da2.f164949b;
                str.getClass();
                cagj.f173119a |= 1;
                cagj.f173120b = str;
                String str2 = (String) entry.getValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cagj cagj2 = (cagj) da2.f164949b;
                str2.getClass();
                cagj2.f173119a |= 2;
                cagj2.f173121c = str2;
                a3.f42325i.mo74128a((cagj) da2.mo74062i());
            }
            if (!z && !z2) {
                a3.mo24330c(accountConsentInformation.f109535a);
            }
            int[] iArr = this.f93960c;
            if (iArr != null && iArr.length > 0 && !z2) {
                a3.mo24326a(iArr);
            }
            a3.mo24327b();
            return true;
        } catch (bxwf e) {
            return false;
        }
    }

    public avve(String str, byte[] bArr, int[] iArr, int i, Context context, aucf aucf) {
        this.f93958a = str;
        this.f93959b = bArr;
        this.f93960c = iArr;
        this.f93961d = i;
        this.f93963f = aucf;
        this.f93962e = context;
        this.f93964g = new qws(context, null, null);
    }

    /* renamed from: a */
    public final void mo51621a(Status status, ConsentInformation consentInformation) {
        if (!status.mo17710c()) {
            rpc.m34201a(status, this.f93963f);
            return;
        }
        List a = consentInformation.mo59682a();
        if (!consentInformation.f109533c || a.isEmpty()) {
            if (!consentInformation.f109532b || a.isEmpty()) {
                int size = a.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (m79414a((ConsentInformation.AccountConsentInformation) a.get(i), i2, false, false)) {
                        i2++;
                        i++;
                    } else {
                        rpc.m34201a(Status.f30109c, this.f93963f);
                        return;
                    }
                }
            } else if (!m79414a((ConsentInformation.AccountConsentInformation) a.get(0), 0, true, false)) {
                rpc.m34201a(Status.f30109c, this.f93963f);
                return;
            }
        } else if (!m79414a((ConsentInformation.AccountConsentInformation) a.get(0), 0, false, true)) {
            rpc.m34201a(Status.f30109c, this.f93963f);
            return;
        }
        rpc.m34201a(Status.f30107a, this.f93963f);
    }
}
