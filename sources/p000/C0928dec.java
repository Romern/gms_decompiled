package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.service.chooser.ChooserTargetService;
import java.util.List;

/* renamed from: dec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0928dec extends ChooserTargetService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.ChooserTargetService f12971a;

    public C0928dec(com.google.android.chimera.ChooserTargetService chooserTargetService, Context context) {
        this.f12971a = chooserTargetService;
        attachBaseContext(context);
    }

    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        return this.f12971a.onGetChooserTargets(componentName, intentFilter);
    }
}
