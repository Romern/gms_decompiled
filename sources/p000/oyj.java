package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: oyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oyj extends Fragment implements C0013ak {

    /* renamed from: a */
    private final C0015am f38615a = new C0015am(this);

    public final C0008af getLifecycle() {
        return this.f38615a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38615a.mo1023a(C0005ad.ON_CREATE);
    }

    public final void onDestroy() {
        this.f38615a.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    public final void onPause() {
        this.f38615a.mo1023a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f38615a.mo1023a(C0005ad.ON_RESUME);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f38615a.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f38615a.mo1023a(C0005ad.ON_START);
    }

    public final void onStop() {
        this.f38615a.mo1023a(C0005ad.ON_STOP);
        super.onStop();
    }
}
