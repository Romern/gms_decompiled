package com.google.android.gms.netrec.scoring.client;

import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkScorerApiChimeraService extends zzx {
    /* JADX WARNING: Illegal instructions before constructor call */
    public NetworkScorerApiChimeraService() {
        super(137, "com.google.android.gms.netrec.scoring.service.START", r4, 1, 10);
        bnon bnon;
        if (cfpd.f185332a.mo6606a().mo82444i()) {
            bnon = bnon.f131923a;
        } else {
            bnon = sft.m35178d();
        }
        int i = eoa.f15378a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (!akmq.m60023a(this)) {
            eoa.m10828c("NetRec", "Device does not support scoring, exiting", new Object[0]);
            aaac.mo16650a(16, (Bundle) null);
            return;
        }
        aaac.mo16652a(new akkw(this, aaag.m21013a()));
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
    }
}
