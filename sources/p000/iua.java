package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: iua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iua extends aaab {

    /* renamed from: a */
    private final irz f21760a;

    /* renamed from: b */
    private final String f21761b;

    public iua(irz irz, String str) {
        super(129, "RetrieveDeviceSyncMetadataOperation");
        this.f21760a = irz;
        this.f21761b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayList arrayList;
        HashMap hashMap;
        if (ccfa.m129418b()) {
            iqd iqd = new iqd(context, new ipw(context), new ipq(context));
            String str = this.f21761b;
            ipv a = iqd.f21545a.mo13238a();
            try {
                Map a2 = a.mo13232a(str);
                synchronized (ipt.class) {
                    hashMap = new HashMap();
                    if (((ipt) a).mo13233a()) {
                        Context context2 = ((ipt) a).f21532b;
                        for (Account account : soz.m35801d(context2, context2.getPackageName())) {
                            List a3 = ((ipt) a).mo13231a(str, account);
                            if (a3 != null) {
                                hashMap.put(account.name, a3);
                            }
                        }
                    }
                }
                a.close();
                arrayList = new ArrayList();
                for (String str2 : a2.keySet()) {
                    if (!hashMap.containsKey(str2)) {
                        sek sek = iqd.f21546b;
                        String valueOf = String.valueOf(str);
                        sek.mo25416d(valueOf.length() == 0 ? new String("Missing device metadata packets for account with key ") : "Missing device metadata packets for account with key ".concat(valueOf), new Object[0]);
                    } else {
                        arrayList.addAll(iqd.mo13257a(str, new Account(str2, "com.google"), (List) hashMap.get(str2), (List) a2.get(str2)));
                    }
                }
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
                throw th;
            }
        } else {
            arrayList = null;
        }
        this.f21760a.mo13308a(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21760a.mo13307a(status);
    }
}
