package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: anzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzk extends Fragment {

    /* renamed from: a */
    public final anzl f77923a = new anzl();

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        anzl anzl = this.f77923a;
        if (!(activity instanceof anzi)) {
            String valueOf = String.valueOf(anzi.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        anzl.f77929f = (anzi) activity;
        anzl.f77930g = activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        anzl anzl = this.f77923a;
        Bundle arguments = getArguments();
        anzl.f77924a = arguments.getString("account_name");
        anzl.f77926c = arguments.getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
        PlusCommonExtras b = PlusCommonExtras.m68419b(arguments);
        anzl.f77925b = b.f82348b;
        anwk anwk = new anwk(anzl.f77930g);
        anwk.f77819a = anzl.f77924a;
        anwk.f77821c = anzl.f77926c;
        anwk.f77822d = new String[0];
        anwk.mo42334a(ankt.f77033c.f30106b);
        anwk.f77824f = b;
        anzl.f77928e = anzl.f77927d.mo42292a(anzl.f77930g, anwk.mo42333a(), anzl, anzl);
    }

    public final void onDestroy() {
        super.onDestroy();
        anzl anzl = this.f77923a;
        if (anzl.f77928e.mo24648p() || anzl.f77928e.mo24649q()) {
            anzl.f77928e.mo14032j();
        }
        anzl.f77928e = null;
    }

    public final void onDetach() {
        super.onDetach();
        anzl anzl = this.f77923a;
        anzl.f77929f = null;
        anzl.f77930g = null;
    }

    public final void onStart() {
        super.onStart();
        anzl anzl = this.f77923a;
        if (!anzl.f77928e.mo24648p() && !anzl.f77928e.mo24649q()) {
            if (anzl.f77932i == null || anzl.f77931h) {
                anzl.f77928e.mo42332x();
            }
        }
    }
}
