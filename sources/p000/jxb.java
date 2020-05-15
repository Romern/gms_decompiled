package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: jxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jxb extends Fragment {

    /* renamed from: a */
    private ims f23440a;

    /* renamed from: b */
    public final ims mo14207b() {
        ims ims = this.f23440a;
        if (ims != null) {
            return ims;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23440a = jxj.m17465a(this, bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        jxj.m17466a(this.f23440a, bundle);
        super.onSaveInstanceState(bundle);
    }
}
