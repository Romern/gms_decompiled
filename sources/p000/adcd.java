package p000;

import android.os.Bundle;

/* renamed from: adcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adcd extends bhfr implements C0013ak {

    /* renamed from: a */
    private final C0015am f61363a = new C0015am(this);

    public final C0008af getLifecycle() {
        return this.f61363a;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((adci) getChildFragmentManager().findFragmentByTag("ViewModelHolderFragment")) == null) {
            getChildFragmentManager().beginTransaction().add(new adci(), "ViewModelHolderFragment").commitNow();
        }
        this.f61363a.mo1023a(C0005ad.ON_CREATE);
    }

    public final void onDestroy() {
        this.f61363a.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    public final void onPause() {
        this.f61363a.mo1023a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f61363a.mo1023a(C0005ad.ON_RESUME);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f61363a.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f61363a.mo1023a(C0005ad.ON_START);
    }

    public final void onStop() {
        this.f61363a.mo1023a(C0005ad.ON_STOP);
        super.onStop();
    }
}
