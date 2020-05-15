package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.p002v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: sk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1353sk {

    /* renamed from: a */
    public static int f27026a = -100;

    /* renamed from: b */
    public static final C1225nr f27027b = new C1225nr();

    /* renamed from: c */
    public static final Object f27028c = new Object();

    /* renamed from: a */
    public static C1353sk m20233a(Activity activity, C1352sj sjVar) {
        return new C1372tc(activity, null, sjVar, activity);
    }

    /* renamed from: n */
    public static void m20237n() {
        aed.f325a = true;
    }

    /* renamed from: o */
    public static void m20238o() {
        if (f27026a != -1) {
            f27026a = -1;
            synchronized (f27028c) {
                Iterator it = f27027b.iterator();
                while (it.hasNext()) {
                    C1353sk skVar = (C1353sk) ((WeakReference) it.next()).get();
                    if (skVar != null) {
                        skVar.mo15951j();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Context mo15932a(Context context) {
        throw null;
    }

    /* renamed from: a */
    public abstract C1341rz mo15933a();

    /* renamed from: a */
    public void mo15934a(int i) {
        throw null;
    }

    /* renamed from: a */
    public abstract void mo15935a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo15936a(View view);

    /* renamed from: a */
    public abstract void mo15937a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo15938a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo15939b();

    /* renamed from: b */
    public abstract View mo15940b(int i);

    /* renamed from: b */
    public abstract void mo15941b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo15942c();

    /* renamed from: c */
    public abstract void mo15943c(int i);

    /* renamed from: d */
    public abstract void mo15944d();

    /* renamed from: d */
    public abstract void mo15945d(int i);

    /* renamed from: e */
    public abstract void mo15946e();

    /* renamed from: f */
    public abstract void mo15947f();

    /* renamed from: g */
    public abstract void mo15948g();

    /* renamed from: h */
    public abstract void mo15949h();

    /* renamed from: i */
    public int mo15950i() {
        throw null;
    }

    /* renamed from: j */
    public abstract void mo15951j();

    /* renamed from: k */
    public abstract void mo15952k();

    /* renamed from: l */
    public abstract void mo15953l();

    /* renamed from: m */
    public abstract void mo15954m();

    /* renamed from: p */
    public abstract void mo15955p();

    /* renamed from: a */
    public static C1353sk m20234a(Dialog dialog, C1352sj sjVar) {
        return new C1372tc(dialog.getContext(), dialog.getWindow(), sjVar, dialog);
    }

    /* renamed from: a */
    public static C1353sk m20235a(Context context, Activity activity, C1352sj sjVar) {
        return new C1372tc(context, null, sjVar, activity);
    }

    /* renamed from: a */
    public static void m20236a(C1353sk skVar) {
        synchronized (f27028c) {
            Iterator it = f27027b.iterator();
            while (it.hasNext()) {
                C1353sk skVar2 = (C1353sk) ((WeakReference) it.next()).get();
                if (skVar2 != skVar) {
                    if (skVar2 != null) {
                    }
                }
                it.remove();
            }
        }
    }
}
