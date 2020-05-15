package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: vum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vum {

    /* renamed from: a */
    private final C1341rz f49992a;

    /* renamed from: b */
    private final Activity f49993b;

    /* renamed from: c */
    private final FragmentManager f49994c;

    public vum(Activity activity, C1341rz rzVar) {
        this.f49993b = activity;
        this.f49994c = activity.getSupportFragmentManager();
        this.f49992a = rzVar;
        if (rzVar != null) {
            rzVar.mo15853b(true);
        }
    }

    /* renamed from: a */
    private final void m41332a(Fragment fragment, boolean z) {
        Bundle b = ((vul) this.f49993b).mo18366b();
        if (fragment.getArguments() != null) {
            b.putAll(fragment.getArguments());
        }
        fragment.setArguments(b);
        FragmentTransaction beginTransaction = this.f49994c.beginTransaction();
        beginTransaction.replace(16908290, fragment);
        if (z) {
            beginTransaction.addToBackStack(fragment.toString());
        }
        beginTransaction.commit();
    }

    /* renamed from: b */
    public final void mo28865b(Fragment fragment) {
        this.f49994c.popBackStack((String) null, 1);
        m41332a(fragment, false);
    }

    /* renamed from: c */
    public final void mo28866c(Fragment fragment) {
        boolean z;
        if (this.f49994c.findFragmentById(16908290) != null) {
            z = true;
        } else {
            z = false;
        }
        m41332a(fragment, z);
    }

    /* renamed from: a */
    public final void mo28863a(int i) {
        String string = this.f49993b.getString(i);
        C1341rz rzVar = this.f49992a;
        if (rzVar != null) {
            rzVar.mo15845a(string);
            this.f49992a.mo15859d();
        }
    }

    /* renamed from: a */
    public final void mo28864a(Fragment fragment) {
        if (this.f49994c.findFragmentById(16908290) == null) {
            mo28865b(fragment);
        }
    }
}
