package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LifecycleCallback {

    /* renamed from: e */
    public final rnx f30135e;

    protected LifecycleCallback(rnx rnx) {
        this.f30135e = rnx;
    }

    /* renamed from: a */
    public static rnx m22509a(Activity activity) {
        return m22511a(new rnw(activity));
    }

    private static rnx getChimeraLifecycleFragmentImpl(rnw rnw) {
        rls rls;
        com.google.android.chimera.Activity activity = (com.google.android.chimera.Activity) rnw.f43417a;
        WeakReference weakReference = (WeakReference) rls.f43243a.get(activity);
        if (weakReference == null || (rls = (rls) weakReference.get()) == null) {
            try {
                rls = (rls) activity.getSupportFragmentManager().findFragmentByTag("ChimeraLifecycleFragmentImpl");
                if (rls == null || rls.isRemoving()) {
                    rls = new rls();
                    activity.getSupportFragmentManager().beginTransaction().add(rls, "ChimeraLifecycleFragmentImpl").commitAllowingStateLoss();
                }
                rls.f43243a.put(activity, new WeakReference(rls));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag ChimeraLifecycleFragmentImpl is not a ChimeraLifecycleFragmentImpl", e);
            }
        }
        return rls;
    }

    /* renamed from: a */
    public void mo17722a() {
    }

    /* renamed from: a */
    public void mo17723a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo17724a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo17725a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo17726b() {
    }

    /* renamed from: b */
    public void mo17727b(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo17728e() {
    }

    /* renamed from: f */
    public final Activity mo17729f() {
        return this.f30135e.mo24869a();
    }

    /* renamed from: a */
    public static rnx m22510a(com.google.android.chimera.Activity activity) {
        return m22511a(new rnw(activity));
    }

    /* renamed from: a */
    public static rnx m22511a(rnw rnw) {
        row row;
        rnz rnz;
        Object obj = rnw.f43417a;
        if (obj instanceof C1021gj) {
            C1021gj gjVar = (C1021gj) obj;
            WeakReference weakReference = (WeakReference) row.f43466a.get(gjVar);
            if (weakReference == null || (row = (row) weakReference.get()) == null) {
                try {
                    row = (row) gjVar.mo11924aK().mo12515a("SupportLifecycleFragmentImpl");
                    if (row == null || row.isRemoving()) {
                        row = new row();
                        C1058hr a = gjVar.mo11924aK().mo12516a();
                        a.mo12686a(row, "SupportLifecycleFragmentImpl");
                        a.mo11295g();
                    }
                    row.f43466a.put(gjVar, new WeakReference(row));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            return row;
        } else if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            WeakReference weakReference2 = (WeakReference) rnz.f43421a.get(activity);
            if (weakReference2 == null || (rnz = (rnz) weakReference2.get()) == null) {
                try {
                    rnz = (rnz) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (rnz == null || rnz.isRemoving()) {
                        rnz = new rnz();
                        activity.getFragmentManager().beginTransaction().add(rnz, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    rnz.f43421a.put(activity, new WeakReference(rnz));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            return rnz;
        } else if (obj instanceof com.google.android.chimera.Activity) {
            return getChimeraLifecycleFragmentImpl(rnw);
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }
}
