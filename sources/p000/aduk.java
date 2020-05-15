package p000;

import android.os.Bundle;

/* renamed from: aduk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aduk extends deu implements C0013ak {

    /* renamed from: c */
    public final C0015am f62770c = new C0015am(this);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final adun mo33832e() {
        return (adun) getSupportFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }

    public final C0008af getLifecycle() {
        return this.f62770c;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo33832e() == null) {
            getSupportFragmentManager().beginTransaction().add(new adun(), "ViewModelHolderFragment").commitNow();
        }
        this.f62770c.mo1023a(C0005ad.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f62770c.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f62770c.mo1023a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f62770c.mo1023a(C0005ad.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f62770c.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f62770c.mo1023a(C0005ad.ON_START);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f62770c.mo1023a(C0005ad.ON_STOP);
        super.onStop();
    }
}
