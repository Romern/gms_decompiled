package com.google.android.gms.westworld;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        rjx rjx;
        if (!aykg.m84157a() && "com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && "com.google.android.westworld".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            rpr b = rpr.m34216b();
            aykk.m84186g(b);
            bymq bymq = null;
            if (choh.m149231b()) {
                rjx = avtz.m79336a(rpr.m34216b(), new avty());
            } else {
                bymq = aykk.m84163a(rpr.m34216b());
                rjx = null;
            }
            qxq f = aykk.m84185f(b);
            try {
                f.mo24383c("ConfigOperationAttempt").mo24359a();
                if (aykk.m84174a(bymq, rjx)) {
                    f.mo24383c("ConfigOperationCanRun").mo24359a();
                    ayka.m84139a(b);
                    aykk.m84166a(chpw.m149307f(), b);
                }
            } finally {
                f.mo24388e();
            }
        }
    }
}
