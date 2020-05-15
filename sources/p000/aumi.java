package p000;

import android.content.Context;
import com.google.android.gms.trustagent.common.framework.ModuleInitializer;

/* renamed from: aumi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumi implements bqfp {

    /* renamed from: a */
    final /* synthetic */ String f92080a;

    /* renamed from: b */
    final /* synthetic */ ModuleInitializer f92081b;

    public aumi(ModuleInitializer moduleInitializer, String str) {
        this.f92081b = moduleInitializer;
        this.f92080a = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.trustagent.common.framework.ModuleInitializer, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            try {
                aunx aunx = ModuleInitializer.f109144a;
                Object[] objArr = new Object[2];
                objArr[0] = !bool.booleanValue() ? "Disabling" : "Enabling";
                objArr[1] = this.f92080a;
                aunx.mo50711a("%s %s", objArr);
                spn.m35856a((Context) this.f92081b, this.f92080a, bool.booleanValue());
            } catch (IllegalArgumentException e) {
                ModuleInitializer.f109144a.mo50711a("Package %s not found", this.f92080a);
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        ModuleInitializer.f109144a.mo50711a("Failed to read shouldEnable() of component %s", this.f92080a, th).mo50709d();
    }
}
