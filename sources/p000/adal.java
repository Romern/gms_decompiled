package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: adal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adal extends Fragment {

    /* renamed from: a */
    public adam f61211a;

    public final void onActivityResult(int i, int i2, Intent intent) {
        bqgy bqgy = (bqgy) this.f61211a.f61213b.get(i);
        if (bqgy != null) {
            bqgy.mo69138b(new adak(i2, intent));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
