package p000;

import com.google.android.gms.trustlet.onbody.internal.ModuleInitializationIntentOperation;

/* renamed from: auvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auvp implements bqfp {

    /* renamed from: a */
    final /* synthetic */ String f92614a;

    /* renamed from: b */
    final /* synthetic */ ModuleInitializationIntentOperation f92615b;

    public auvp(ModuleInitializationIntentOperation moduleInitializationIntentOperation, String str) {
        this.f92615b = moduleInitializationIntentOperation;
        this.f92614a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            try {
                aunx aunx = ModuleInitializationIntentOperation.f109248a;
                Object[] objArr = new Object[2];
                objArr[0] = !bool.booleanValue() ? "Disabling" : "Enabling";
                objArr[1] = this.f92614a;
                aunx.mo50711a("%s %s", objArr);
                spn.m35856a(this.f92615b.getApplicationContext(), this.f92614a, bool.booleanValue());
            } catch (IllegalArgumentException e) {
                ModuleInitializationIntentOperation.f109248a.mo50711a("Package %s not found", this.f92614a);
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        ModuleInitializationIntentOperation.f109248a.mo50711a("Failed to read shouldEnable() of component %s", this.f92614a, th).mo50709d();
    }
}
