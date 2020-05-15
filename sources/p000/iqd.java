package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: iqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqd {

    /* renamed from: a */
    public final ipw f21545a;

    /* renamed from: b */
    public final sek f21546b = new sek(new String[]{"DeviceMetadataFetcher"}, (byte[]) null);

    /* renamed from: c */
    private final ipq f21547c;

    /* renamed from: d */
    private final isx f21548d;

    public iqd(Context context, ipw ipw, ipq ipq) {
        this.f21545a = ipw;
        this.f21547c = ipq;
        this.f21548d = isw.m16064a(context, new isn(context));
    }

    /* renamed from: a */
    public final List mo13257a(String str, Account account, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bqld bqld = (bqld) it.next();
            hashMap.put(bqld.f141083a, bqld);
        }
        ehx a = this.f21547c.mo10153a(str, account.name);
        if (a == null) {
            sek sek = this.f21546b;
            String valueOf = String.valueOf(str);
            sek.mo25416d(valueOf.length() == 0 ? new String("Couldn't retrieve group key: ") : "Couldn't retrieve group key: ".concat(valueOf), new Object[0]);
            return new ArrayList();
        } else if (a.f15027d == null) {
            sek sek2 = this.f21546b;
            String valueOf2 = String.valueOf(str);
            sek2.mo25418e(valueOf2.length() == 0 ? new String("Retrieved group key doesn't have a private key: ") : "Retrieved group key doesn't have a private key: ".concat(valueOf2), new Object[0]);
            return new ArrayList();
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                bqlc bqlc = (bqlc) it2.next();
                String str2 = bqlc.f141079a;
                bqld bqld2 = (bqld) hashMap.get(str2);
                if (bqld2 == null) {
                    sek sek3 = this.f21546b;
                    String valueOf3 = String.valueOf(str2);
                    sek3.mo25416d(valueOf3.length() == 0 ? new String("Missing device metadata packet for associated feature status ") : "Missing device metadata packet for associated feature status ".concat(valueOf3), new Object[0]);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    bxwc bxwc = bqlc.f141080b;
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        bqlb bqlb = (bqlb) bxwc.get(i);
                        arrayList2.add(new DeviceFeatureStatus(bqlb.f141074a, bqlb.f141075b));
                    }
                    try {
                        arrayList.add(new DeviceMetadata(1, str2, this.f21548d.mo13324a(a.f15027d, account, bqld2.f141084b.mo73780k()).f10551c, bqld2.f141087e, arrayList2, account.name));
                    } catch (iqs e) {
                        this.f21546b.mo25417e("Couldn't decrypt device metadata", e, new Object[0]);
                    }
                }
            }
            return arrayList;
        }
    }
}
