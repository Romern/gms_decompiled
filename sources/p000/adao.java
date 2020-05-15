package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: adao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adao extends Fragment {

    /* renamed from: a */
    public final adan f61217a = new adan();

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDetach() {
        super.onDetach();
        for (adas adas : this.f61217a.f61215a.values()) {
            adas.mo33298d();
        }
    }
}
