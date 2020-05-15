package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: adcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adcf extends Fragment implements C0013ak {

    /* renamed from: a */
    private final C0015am f61365a = new C0015am(this);

    /* renamed from: g */
    public final adci mo33311g() {
        return (adci) getChildFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }

    public final C0008af getLifecycle() {
        return this.f61365a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo33311g() == null) {
            getChildFragmentManager().beginTransaction().add(new adci(), "ViewModelHolderFragment").commitNow();
        }
        this.f61365a.mo1023a(C0005ad.ON_CREATE);
    }

    public void onDestroy() {
        this.f61365a.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    public void onPause() {
        this.f61365a.mo1023a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f61365a.mo1023a(C0005ad.ON_RESUME);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f61365a.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f61365a.mo1023a(C0005ad.ON_START);
    }

    public void onStop() {
        this.f61365a.mo1023a(C0005ad.ON_STOP);
        super.onStop();
    }
}
