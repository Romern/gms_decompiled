package com.google.android.gms.backup.p032g1.backup;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* renamed from: com.google.android.gms.backup.g1.backup.G1BackupApiChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class G1BackupApiChimeraService extends zzx {
    public G1BackupApiChimeraService() {
        super(182, "com.google.android.gms.backup.G1_BACKUP", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        sdo.m34959a(getServiceRequest);
        aaac.mo16652a(new mnr(this, aaag, getServiceRequest));
    }
}
