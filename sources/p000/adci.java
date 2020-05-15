package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: adci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adci extends Fragment {

    /* renamed from: a */
    private C0061bs f61369a;

    /* renamed from: a */
    public final C0060br mo33312a() {
        Activity activity = getActivity();
        if (activity != null) {
            return mo33313a(new C0055bm(activity.getApplication()));
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f61369a = new C0061bs();
    }

    public final void onDestroy() {
        super.onDestroy();
        C0061bs bsVar = this.f61369a;
        if (bsVar != null) {
            bsVar.mo3468a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0060br mo33313a(C0056bn bnVar) {
        return new C0060br(this.f61369a, bnVar);
    }
}
