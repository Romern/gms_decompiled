package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.util.ChimeraResource;

/* renamed from: qkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qkj {
    /* renamed from: a */
    public static int m32287a(Context context, int i) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext == null) {
            return i;
        }
        Resources containerResources = moduleContext.getContainerResources();
        Resources resources = context.getResources();
        ClassLoader classLoader = moduleContext.getContainerContext().getClass().getClassLoader();
        bmzs.m108696a(classLoader);
        return ChimeraResource.getResourceId(classLoader, containerResources, resources, i);
    }
}
