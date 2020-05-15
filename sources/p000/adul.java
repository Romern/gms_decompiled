package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Fragment;

/* renamed from: adul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adul extends Fragment implements C0013ak {

    /* renamed from: a */
    private final C0015am f62771a = new C0015am(this);

    /* renamed from: b */
    private aduj f62772b = new aduj();

    /* renamed from: a */
    private final void m51216a(C0005ad adVar) {
        if (getView() != null) {
            this.f62772b.mo33831a();
            C0015am amVar = this.f62772b.f62769a;
            bmxy.m108581a(amVar);
            amVar.mo1023a(adVar);
        } else if (this.f62772b.f62769a != null) {
            throw new IllegalStateException("View lifecycle owner was accessed but onCreateView() returned null.");
        }
    }

    /* renamed from: c */
    public final adun mo33833c() {
        return (adun) getChildFragmentManager().findFragmentByTag("ViewModelHolderFragment");
    }

    public final C0008af getLifecycle() {
        return this.f62771a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo33833c() == null) {
            getChildFragmentManager().beginTransaction().add(new adun(), "ViewModelHolderFragment").commitNow();
        }
        this.f62771a.mo1023a(C0005ad.ON_CREATE);
    }

    public final void onDestroy() {
        this.f62771a.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    public void onDestroyView() {
        m51216a(C0005ad.ON_DESTROY);
        this.f62772b = new aduj();
        super.onDestroyView();
    }

    public final void onPause() {
        this.f62771a.mo1023a(C0005ad.ON_PAUSE);
        m51216a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        m51216a(C0005ad.ON_RESUME);
        this.f62771a.mo1023a(C0005ad.ON_RESUME);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f62771a.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        m51216a(C0005ad.ON_START);
        this.f62771a.mo1023a(C0005ad.ON_START);
    }

    public final void onStop() {
        this.f62771a.mo1023a(C0005ad.ON_STOP);
        m51216a(C0005ad.ON_STOP);
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51216a(C0005ad.ON_CREATE);
    }
}
