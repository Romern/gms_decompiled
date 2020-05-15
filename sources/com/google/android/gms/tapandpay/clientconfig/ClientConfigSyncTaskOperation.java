package com.google.android.gms.tapandpay.clientconfig;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClientConfigSyncTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108319a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final AtomicBoolean f108320b = new AtomicBoolean(false);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        String str = aecc.f63128a;
        if ("clientconfig.sync".equals(str) || "clientconfig.oneoffsync".equals(str)) {
            int i = 1;
            if (!f108320b.compareAndSet(false, true)) {
                return 1;
            }
            try {
                String b = askc.m74272b();
                List<AccountInfo> d = asix.m74203d(context, b);
                if (!d.isEmpty()) {
                    d.size();
                    for (AccountInfo accountInfo : d) {
                        askf askf = new askf(accountInfo, b, context);
                        try {
                            btnt btnt = (btnt) atff.m75759a(askf, "t/gmscoreclientconfiguration/get", btns.f149681a, btnt.f149683b);
                            List arrayList = new ArrayList();
                            btnu btnu = btnt.f149685a;
                            if (btnu != null) {
                                arrayList = btnu.f149688a;
                            }
                            aska.m74267a(arrayList, askf.f89123a, askf.f89126d, askf.f89125c);
                        } catch (atfh e) {
                        } catch (IOException e2) {
                        }
                    }
                    i = 0;
                } else {
                    i = 2;
                }
                if (cgwn.f187872a.mo6606a().mo84631l()) {
                    srn srn = atmx.f90520a;
                    List<btpn> a = aska.m74264a(context);
                    HashSet<String> hashSet = new HashSet();
                    for (btpn btpn : a) {
                        for (btpm btpm : btpn.f149869b) {
                            if (!btpm.f149864c.isEmpty()) {
                                hashSet.add(btpm.f149864c);
                            }
                        }
                    }
                    hashSet.size();
                    HashSet hashSet2 = new HashSet();
                    for (String str2 : hashSet) {
                        File a2 = asjo.m74246a(context, str2);
                        hashSet2.add(a2.toString());
                        if (!a2.exists()) {
                            try {
                                asmd.m74375a(str2, a2, context);
                            } catch (IOException e3) {
                                bnsl bnsl = (bnsl) atmx.f90520a.mo68387b();
                                bnsl.mo68437a(e3);
                                bnsl.mo68432a("atmx", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("Failed to download lottie file for url: %s", str2);
                            }
                        }
                    }
                    asmd.m74374a(asjo.m74245a(context), hashSet2);
                }
                atml atml = new atml(context);
                sdo.m34973b("Cannot make a network request from the main thread.");
                File a3 = atmi.m76178a(atml.f90487h, asmd.m74372a(atml.mo50041e()));
                if (!a3.exists()) {
                    atmk.m76180a(atml.f90487h, atml.mo50041e(), a3);
                }
                return i;
            } catch (asks e4) {
                bnsl bnsl2 = (bnsl) f108319a.mo68388c();
                bnsl2.mo68437a(e4);
                bnsl2.mo68432a("com.google.android.gms.tapandpay.clientconfig.ClientConfigSyncTaskOperation", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Error syncing client config");
                return 2;
            } finally {
                f108320b.set(false);
            }
        } else {
            bnsl bnsl3 = (bnsl) f108319a.mo68388c();
            bnsl3.mo68432a("com.google.android.gms.tapandpay.clientconfig.ClientConfigSyncTaskOperation", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Got an unexpected task service tag: %s", str);
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        asjy a = asjy.m74262a(cgvu.f187832a.mo6606a().mo84553a());
        atkm atkm = new atkm(context);
        boolean z = !a.equals(asjy.m74262a(atkm.f90420c.getString("periodic_task_params:clientconfig.sync", null)));
        aeat a2 = aeat.m51532a(context);
        aebl aebl = new aebl();
        aebl.f63099k = "clientconfig.sync";
        aebl.mo34029b(z);
        boolean z2 = a.f89103a;
        aebl.mo34024a(z2 ? 1 : 0, z2);
        aebl.f63070a = a.f89104b;
        aebl.f63071b = a.f89105c;
        aebl.mo34023a(a.f89106d);
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        a2.mo33984a(aebl.mo33974b());
        if (z) {
            atkm.f90420c.edit().putString("periodic_task_params:clientconfig.sync", a.toString()).apply();
        }
    }
}
