package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: bkfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfx extends Fragment {

    /* renamed from: a */
    public C0060br f124174a;

    /* renamed from: b */
    private C0061bs f124175b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.f124175b == null) {
            this.f124175b = new C0061bs();
            this.f124174a = new C0060br(this.f124175b, new C0055bm(getActivity().getApplication()));
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C0061bs bsVar = this.f124175b;
        if (bsVar != null) {
            bsVar.mo3468a();
            this.f124175b = null;
        }
        this.f124174a = null;
    }
}
