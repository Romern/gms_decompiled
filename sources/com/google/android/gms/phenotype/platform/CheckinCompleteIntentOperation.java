package com.google.android.gms.phenotype.platform;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckinCompleteIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String[] f82130a = {"DUMMYLOGSOURCE"};

    /* renamed from: b */
    private static final srn f82131b = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: c */
    private static final int[] f82132c = new int[0];

    /* renamed from: d */
    private Context f82133d;

    /* renamed from: e */
    private aney f82134e;

    /* renamed from: f */
    private qxq f82135f;

    /* renamed from: g */
    private qxq f82136g;

    /* renamed from: a */
    private final int[] m68248a() {
        int i = 0;
        Map a = aymn.m84266a(this.f82133d.getContentResolver(), "checkin_expid_");
        if (a.isEmpty()) {
            return f82132c;
        }
        int[] iArr = new int[a.size()];
        for (Map.Entry entry : a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null && !str2.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(str.substring(14));
                    iArr[i] = parseInt;
                    i++;
                    try {
                        this.f82135f.mo24385d("CheckinExpId").mo24367a(parseInt);
                        this.f82136g.mo24385d("CheckinExpIdFlushed").mo24367a(parseInt);
                    } catch (NumberFormatException e) {
                    }
                } catch (NumberFormatException e2) {
                    this.f82135f.mo24383c("BadCheckinExpId").mo24359a();
                    this.f82136g.mo24383c("BadCheckinExpIdFlushed").mo24359a();
                    bnsl bnsl = (bnsl) f82131b.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.phenotype.platform.CheckinCompleteIntentOperation", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Received gservices flag with bad format: %s", str);
                }
            }
        }
        return i != a.size() ? Arrays.copyOf(iArr, i) : iArr;
    }

    public final void onCreate() {
        aney a = anef.m64089a(this);
        qxq qxq = new qxq(anfd.m64146a(), "PHENOTYPE_COUNTERS", 1024);
        qxq qxq2 = new qxq(anfd.m64146a(), "PHENOTYPE_COUNTERS", 1024);
        this.f82133d = this;
        this.f82134e = a;
        this.f82135f = qxq;
        this.f82136g = qxq2;
    }

    public final void onDestroy() {
        this.f82135f.mo24388e();
    }

    public final void onHandleIntent(Intent intent) {
        int[] iArr;
        if (intent != null) {
            String action = intent.getAction();
            if (!"com.google.android.checkin.CHECKIN_COMPLETE".equals(action)) {
                bnsl bnsl = (bnsl) f82131b.mo68388c();
                bnsl.mo68432a("com.google.android.gms.phenotype.platform.CheckinCompleteIntentOperation", "onHandleIntent", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Received unknown action: %s", action);
            } else if (intent.getBooleanExtra("success", true)) {
                int i = 0;
                Map a = aymn.m84266a(this.f82133d.getContentResolver(), "checkin_expid_");
                if (!a.isEmpty()) {
                    iArr = new int[a.size()];
                    for (Map.Entry entry : a.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str2 != null && !str2.isEmpty()) {
                            try {
                                int parseInt = Integer.parseInt(str.substring(14));
                                iArr[i] = parseInt;
                                i++;
                                try {
                                    this.f82135f.mo24385d("CheckinExpId").mo24367a(parseInt);
                                    this.f82136g.mo24385d("CheckinExpIdFlushed").mo24367a(parseInt);
                                } catch (NumberFormatException e) {
                                }
                            } catch (NumberFormatException e2) {
                                this.f82135f.mo24383c("BadCheckinExpId").mo24359a();
                                this.f82136g.mo24383c("BadCheckinExpIdFlushed").mo24359a();
                                bnsl bnsl2 = (bnsl) f82131b.mo68388c();
                                bnsl2.mo68432a("com.google.android.gms.phenotype.platform.CheckinCompleteIntentOperation", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("Received gservices flag with bad format: %s", str);
                            }
                        }
                    }
                    if (i != a.size()) {
                        iArr = Arrays.copyOf(iArr, i);
                    }
                } else {
                    iArr = f82132c;
                }
                Arrays.toString(iArr);
                try {
                    aucu.m76783a(this.f82134e.mo25235a("com.google.android.gms.checkin.binary", 1, f82130a, iArr), cgec.m144831f(), TimeUnit.MILLISECONDS);
                    this.f82135f.mo24383c("CheckinExpIdWeakRegisterSuccess").mo24359a();
                    this.f82136g.mo24383c("CheckinExpIdWeakRegisterSuccessFlushed").mo24359a();
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    this.f82135f.mo24383c("CheckinExpIdWeakRegisterFailure").mo24359a();
                    this.f82136g.mo24383c("CheckinExpIdWeakRegisterFailureFlushed").mo24359a();
                }
                if (cgem.f186663a.mo6606a().mo83562s()) {
                    anij.m64478a(this, 19, (String) null);
                }
                this.f82136g.mo24388e().mo9456a(1, TimeUnit.SECONDS);
            }
        }
    }
}
