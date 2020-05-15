package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: fbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fbv extends Fragment implements C0013ak {

    /* renamed from: l */
    public final C0015am f16237l = new C0015am(this);

    public final C0008af getLifecycle() {
        return this.f16237l;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16237l.mo1024a(C0007ae.CREATED);
    }

    public final void onDestroy() {
        this.f16237l.mo1024a(C0007ae.DESTROYED);
        super.onDestroy();
    }

    public void onPause() {
        this.f16237l.mo1024a(C0007ae.STARTED);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f16237l.mo1024a(C0007ae.RESUMED);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f16237l.mo1024a(C0007ae.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f16237l.mo1024a(C0007ae.STARTED);
    }

    public final void onStop() {
        this.f16237l.mo1024a(C0007ae.CREATED);
        super.onStop();
    }
}
