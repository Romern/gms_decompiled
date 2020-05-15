package com.google.android.gms.westworld;

import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InitOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        rjx rjx;
        boolean z;
        if (!aykg.m84157a() && (i & 14) != 0) {
            rpr b = rpr.m34216b();
            bymq bymq = null;
            if (choh.m149231b()) {
                rjx = avtz.m79336a(rpr.m34216b(), new avty());
            } else {
                bymq = aykk.m84163a(rpr.m34216b());
                rjx = null;
            }
            aykk.m84186g(b);
            qxq f = aykk.m84185f(b);
            f.mo24383c("InitOperationEnter").mo24359a();
            if (aykk.m84174a(bymq, rjx)) {
                f.mo24383c("InitOperationEnabled").mo24359a();
                z = ayka.m84139a(b);
                aykk.m84166a(chpw.m149307f(), b);
            } else {
                z = false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (!z) {
                    DataAlarmOperation.m94460a(b, Long.valueOf(chpg.f188938a.mo6606a().mo85485b()), f, bkn.UNKNOWN_PERIOD, false);
                }
                MetadataAlarmOperation.m94467a(b, f);
            } finally {
                f.mo24388e();
            }
        }
    }
}
