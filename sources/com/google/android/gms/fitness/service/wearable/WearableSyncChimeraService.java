package com.google.android.gms.fitness.service.wearable;

import android.content.Intent;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableSyncChimeraService extends rpx {

    /* renamed from: b */
    private static final srn f32433b = zvt.m46581a();

    public WearableSyncChimeraService() {
        super(WearableSyncChimeraService.class.getSimpleName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17286a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("initialize", false);
        int intExtra = intent.getIntExtra("sync_source", 0);
        sre.m36089i(this);
        bnsl bnsl = (bnsl) f32433b.mo68387b();
        bnsl.mo68432a("com.google.android.gms.fitness.service.wearable.WearableSyncChimeraService", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("WearableSyncChimeraService called from a non-watch: [initialize=%s, syncSourceNumber=%s]", bryx.m114908a(Boolean.valueOf(booleanExtra)), bryx.m114908a(Integer.valueOf(intExtra)));
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        zvj.m46566b(printWriter);
    }
}
