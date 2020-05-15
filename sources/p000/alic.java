package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: alic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alic extends Fragment implements C0013ak, alig {

    /* renamed from: a */
    public alif f73529a;

    /* renamed from: b */
    private final C0015am f73530b = new C0015am(this);

    /* renamed from: a */
    public void mo40361a() {
    }

    /* renamed from: b */
    public final alif mo40362b() {
        return this.f73529a;
    }

    public final C0008af getLifecycle() {
        return this.f73530b;
    }

    public void onAttach(Activity activity) {
        alif alif;
        boolean z = activity instanceof alig;
        bmxy.m108589a(z, "Cannot use an AccountAwareFragment without an Activity that implements AccountScopedComponentProvider. If you're not using this with PayChimera Activity... why not?");
        if (z) {
            alif = ((alig) activity).mo40362b();
        } else {
            alif = null;
        }
        this.f73529a = alif;
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73530b.mo1023a(C0005ad.ON_CREATE);
    }

    public void onDestroy() {
        this.f73530b.mo1023a(C0005ad.ON_DESTROY);
        super.onDestroy();
    }

    public final void onDetach() {
        this.f73529a = null;
        super.onDetach();
    }

    public void onPause() {
        this.f73530b.mo1023a(C0005ad.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f73530b.mo1023a(C0005ad.ON_RESUME);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f73530b.mo1023a(C0005ad.ON_STOP);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f73530b.mo1023a(C0005ad.ON_START);
    }

    public final void onStop() {
        this.f73530b.mo1023a(C0005ad.ON_STOP);
        super.onStop();
    }
}
