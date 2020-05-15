package p000;

import android.os.Bundle;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: jwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jwy extends deu implements jxe, jyb {

    /* renamed from: b */
    private ims f23426b;

    /* renamed from: c */
    private jyc f23427c;

    /* renamed from: bb */
    public final boolean mo14094bb() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo7917e();

    /* renamed from: g */
    public final ims mo14202g() {
        ims ims = this.f23426b;
        if (ims != null) {
            return ims;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23426b = jxj.m17464a(this, bundle);
        jyc a = jyc.m17496a(this, this, this);
        this.f23427c = a;
        a.mo14219a(mo7917e());
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(this).getCurrentModule();
            this.f23427c.mo14221b(currentModule.moduleVersion);
            this.f23427c.mo14222b(currentModule.moduleId);
        } catch (IllegalStateException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            this.f23427c.mo14223c();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f23427c.mo14217a();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        this.f23427c.mo14220b();
        jxj.m17466a(this.f23426b, bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (isFinishing()) {
            this.f23427c.mo14223c();
        }
        super.onStop();
    }
}
