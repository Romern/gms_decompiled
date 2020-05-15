package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* renamed from: qku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qku extends dfl {

    /* renamed from: b */
    private static final LifecycleSynchronizer f41623b = new qkr();

    /* renamed from: c */
    private LifecycleSynchronizer f41624c = f41623b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final BoundService mo8855a(Context context, String str) {
        BoundService a = super.mo8855a(context, str);
        if (a != null) {
            return new qkt(a);
        }
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8856a(BoundService boundService, Context context) {
        BoundService boundService2;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            context = new qks(this, context);
        }
        if (boundService instanceof qkt) {
            boundService2 = ((qkt) boundService).f41621a;
            boundService2.setModuleContext(context);
        } else {
            boundService2 = boundService;
        }
        boundService.setModuleContext(context);
        if (boundService2 instanceof ILifecycleSynchronizerRequired) {
            ILifecycleSynchronizerRequired iLifecycleSynchronizerRequired = (ILifecycleSynchronizerRequired) boundService2;
            if (this.f41624c == f41623b && !spn.m35873c()) {
                this.f41624c = new LifecycleSynchronizer(this);
            }
            iLifecycleSynchronizerRequired.setLifecycleSynchronizer(this.f41624c);
        }
    }
}
