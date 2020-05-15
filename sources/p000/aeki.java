package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeki {

    /* renamed from: a */
    public final Context f63464a;

    /* renamed from: b */
    public final Map f63465b = new HashMap();

    /* renamed from: c */
    public final Map f63466c = new HashMap();

    /* renamed from: d */
    public final Map f63467d = new HashMap();

    /* renamed from: e */
    public final aejb f63468e;

    public aeki(Context context, aejb aejb) {
        this.f63464a = context;
        this.f63468e = aejb;
    }

    /* renamed from: a */
    public final void mo34246a(LocationRequestInternal locationRequestInternal) {
        ModuleManager.ModuleInfo currentModule;
        if (sqr.m35998a()) {
            try {
                if (locationRequestInternal.f79426h == null && ModuleContext.getModuleContext(this.f63464a) != null && (currentModule = ModuleManager.get(this.f63464a).getCurrentModule()) != null) {
                    locationRequestInternal.f79426h = currentModule.moduleId;
                }
            } catch (IllegalStateException e) {
                Log.e("LocationClientHelper", "exception when setting module id", e);
            }
        }
    }
}
