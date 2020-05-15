package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: vlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vlh extends Fragment {
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BaseIsRestart", true);
        super.onSaveInstanceState(bundle);
    }
}
