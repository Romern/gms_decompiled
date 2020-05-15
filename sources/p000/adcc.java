package p000;

import android.os.Bundle;

/* renamed from: adcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adcc extends deu implements C0013ak {

    /* renamed from: o */
    public final C0015am f61362o = new C0015am(this);

    public final C0008af getLifecycle() {
        return this.f61362o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final adci mo33310h() {
        return (adci) getSupportFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo33310h() == null) {
            getSupportFragmentManager().beginTransaction().add(new adci(), "ViewModelHolderFragment").commitNow();
        }
        this.f61362o.mo1023a(C0005ad.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f61362o.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f61362o.mo1023a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f61362o.mo1023a(C0005ad.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f61362o.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f61362o.mo1023a(C0005ad.ON_START);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f61362o.mo1023a(C0005ad.ON_STOP);
        super.onStop();
    }
}
