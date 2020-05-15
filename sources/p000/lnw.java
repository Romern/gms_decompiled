package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: lnw */
final /* synthetic */ class lnw implements Runnable {

    /* renamed from: a */
    private final lnz f26474a;

    /* renamed from: b */
    private final int f26475b;

    /* renamed from: c */
    private final int f26476c;

    public lnw(lnz lnz, int i, int i2) {
        this.f26474a = lnz;
        this.f26475b = i;
        this.f26476c = i2;
    }

    public final void run() {
        Fragment fragment;
        lnz lnz = this.f26474a;
        int i = this.f26475b;
        int i2 = this.f26476c;
        C1341rz aW = lnz.f26159a.mo8628aW();
        if (i == 1) {
            fragment = new lnt();
            if (aW != null) {
                aW.mo15845a("🐞 Detection Instrumentation");
            }
        } else if (i == 2) {
            fragment = new lnq();
            if (aW != null) {
                aW.mo15845a("🐞 Data Source Instrumentation");
            }
        } else if (i == 3) {
            fragment = new lnu();
            if (aW != null) {
                aW.mo15845a("🐞 Fill Instrumentation");
            }
        } else {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("position", i2);
        fragment.setArguments(bundle);
        FragmentTransaction beginTransaction = lnz.f26159a.getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C0126R.C0129id.footer, fragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }
}
