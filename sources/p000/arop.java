package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: arop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class arop implements arok {

    /* renamed from: a */
    public final FragmentManager f88021a;

    protected arop(FragmentManager fragmentManager) {
        this.f88021a = fragmentManager;
    }

    /* renamed from: a */
    public abstract int mo48711a();

    /* renamed from: a */
    public abstract void mo48712a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48717a(Fragment fragment) {
        this.f88021a.beginTransaction().add(C0126R.C0129id.fragment_container, fragment, "instruction").commit();
    }

    /* renamed from: a */
    public abstract void mo48713a(boolean z);

    /* renamed from: a */
    public abstract boolean mo48714a(int i);

    /* renamed from: b */
    public void mo48715b() {
        this.f88021a.popBackStack();
    }

    /* renamed from: c */
    public boolean mo48716c() {
        return this.f88021a.getBackStackEntryCount() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48718b(Fragment fragment) {
        FragmentTransaction beginTransaction = this.f88021a.beginTransaction();
        beginTransaction.setCustomAnimations(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out, C0126R.anim.slide_back_in, C0126R.anim.slide_back_out);
        beginTransaction.replace(C0126R.C0129id.fragment_container, fragment).addToBackStack("instruction").commit();
    }
}
