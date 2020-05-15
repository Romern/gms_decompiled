package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: fip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fip extends fik {

    /* renamed from: i */
    private static List f16671i = new ArrayList();

    /* renamed from: c */
    public boolean f16672c;

    /* renamed from: d */
    public final Set f16673d = new HashSet();

    /* renamed from: e */
    public boolean f16674e;

    /* renamed from: j */
    private volatile boolean f16675j;

    public fip(fkm fkm) {
        super(fkm);
    }

    /* renamed from: a */
    public static fip m11765a(Context context) {
        return fkm.m11883a(context).mo10960d();
    }

    /* renamed from: b */
    public final fkh mo10856b() {
        return this.f16658a.mo10959c();
    }

    /* renamed from: c */
    public final void mo10857c() {
    }

    /* renamed from: a */
    public static void m11766a() {
        synchronized (fip.class) {
            if (f16671i != null) {
                for (Runnable runnable : f16671i) {
                    runnable.run();
                }
                f16671i = null;
            }
        }
    }

    /* renamed from: a */
    public final fjk mo10855a(String str) {
        fjk fjk;
        synchronized (this) {
            fjk = new fjk(this.f16658a, str);
            fjk.mo10955u();
        }
        return fjk;
    }
}
