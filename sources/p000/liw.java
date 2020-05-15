package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: liw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class liw extends Fragment {

    /* renamed from: a */
    final liv f26176a = new liv();

    /* renamed from: a */
    public static liv m19221a(deu deu) {
        FragmentManager supportFragmentManager = deu.getSupportFragmentManager();
        liw liw = (liw) supportFragmentManager.findFragmentByTag("FutureManagerRetainedFragment");
        if (liw == null) {
            liw = new liw();
            supportFragmentManager.beginTransaction().add(liw, "FutureManagerRetainedFragment").commitNow();
        }
        return liw.f26176a;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f26176a.mo15187a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f26176a.mo15187a();
    }

    public final void onDestroy() {
        liv liv = this.f26176a;
        liv.mo15192c();
        for (liu liu : liv.f26173a.values()) {
            liu.cancel(true);
        }
        liv.f26173a.clear();
        super.onDestroy();
    }

    public final void onDetach() {
        this.f26176a.mo15192c();
        super.onDetach();
    }

    public final void onPause() {
        this.f26176a.mo15190b();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f26176a.mo15187a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f26176a.mo15190b();
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f26176a.mo15187a();
    }

    public final void onStop() {
        this.f26176a.mo15190b();
        super.onStop();
    }
}
