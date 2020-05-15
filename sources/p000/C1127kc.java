package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* renamed from: kc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1127kc extends Activity implements C0013ak, C1257ow {

    /* renamed from: a */
    private final C0015am f23734a = new C0015am(this);

    public C1127kc() {
        new C1245ok();
    }

    /* renamed from: a */
    public final boolean mo14358a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            C1280ps.m19882a();
        }
        return C1258ox.m19818a(this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            C1280ps.m19882a();
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public C0008af getLifecycle() {
        return this.f23734a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0046be.m2751a(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f23734a.mo1024a(C0007ae.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
