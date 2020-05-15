package com.google.android.gms.netrec.module;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.netrec.scoring.receiver.BootCompletedOrAppUpdatedIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetrecModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f81180a = new String[0];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        int i2 = eoa.f15378a;
        if (akmq.m60023a(this)) {
            int i3 = i & 8;
            if ((i & 4) == 0 && i3 == 0) {
                BootCompletedOrAppUpdatedIntentOperation.m67656a(this, "com.google.android.gms.netrec.scoring.receiver.BOOT_COMPLETED");
                return;
            }
            aklx.m59991b(this);
            String[] strArr = f81180a;
            for (String str : strArr) {
                new Object[1][0] = str;
                aklx.m59988a(this, str);
            }
            aklx.m59992c(this);
            if (cfpa.f185327a.mo6606a().mo82404a()) {
                sex a = sex.m35104a(this);
                C1101jd jdVar = new C1101jd();
                jdVar.mo13594b("Experio Modulefood Updated");
                jdVar.mo13593a("We've updated the Experio (netrec) Module, send bugs to go/experiobug");
                int a2 = qkj.m32287a(this, C0126R.C0127drawable.ic_google);
                C1102je jeVar = new C1102je(this);
                jeVar.mo13630b(a2);
                jeVar.mo13640e("Experio Modulefood Updated");
                jeVar.mo13632b("We've updated the Experio (netrec) Module, send bugs to go/experiobug");
                jeVar.mo13626a(jdVar);
                jeVar.f22258j = -1;
                jeVar.f22268t = true;
                jeVar.mo13627a(true);
                a.mo25441a(0, jeVar.mo13629b());
            }
            BootCompletedOrAppUpdatedIntentOperation.m67656a(this, "com.google.android.gms.netrec.scoring.receiver.APP_UPDATED");
            return;
        }
        eoa.m10828c("NetRec", "Device does not support scoring, exiting", new Object[0]);
    }
}
