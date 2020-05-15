package p000;

import android.content.Intent;
import com.google.android.chimera.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: avik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avik implements avil {

    /* renamed from: a */
    private final WeakReference f93232a;

    public avik(Fragment fragment) {
        this.f93232a = new WeakReference(fragment);
    }

    /* renamed from: a */
    public final boolean mo51272a(Intent intent) {
        Fragment fragment = (Fragment) this.f93232a.get();
        if (fragment == null) {
            return false;
        }
        fragment.startActivityForResult(intent, 1);
        return true;
    }
}
