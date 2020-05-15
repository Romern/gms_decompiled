package p000;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* renamed from: dnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dnx extends FragmentActivity implements C0013ak {

    /* renamed from: a */
    public final C0015am f13656a = new C0015am(this);

    public C0008af getLifecycle() {
        return this.f13656a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13656a.mo1024a(C0007ae.CREATED);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f13656a.mo1024a(C0007ae.DESTROYED);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f13656a.mo1024a(C0007ae.STARTED);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f13656a.mo1024a(C0007ae.RESUMED);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f13656a.mo1024a(C0007ae.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f13656a.mo1024a(C0007ae.STARTED);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f13656a.mo1024a(C0007ae.CREATED);
        super.onStop();
    }
}
