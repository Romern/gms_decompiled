package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: alw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alw {

    /* renamed from: a */
    static alt f893a;

    /* renamed from: b */
    final Context f894b;

    /* renamed from: c */
    final ArrayList f895c = new ArrayList();

    public alw(Context context) {
        this.f894b = context;
    }

    /* renamed from: a */
    public static alw m1050a(Context context) {
        m1051a();
        if (f893a == null) {
            alt alt = new alt(context.getApplicationContext());
            f893a = alt;
            alt.mo986a(alt.f856h);
            alt.f857i = new amx(alt.f849a, alt);
            amx amx = alt.f857i;
            if (!amx.f948c) {
                amx.f948c = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                amx.f946a.registerReceiver(amx.f949d, intentFilter, null, amx.f947b);
                amx.f947b.post(amx.f950e);
            }
        }
        alt alt2 = f893a;
        int size = alt2.f850b.size();
        while (true) {
            size--;
            if (size < 0) {
                alw alw = new alw(context);
                alt2.f850b.add(new WeakReference(alw));
                return alw;
            }
            alw alw2 = (alw) ((WeakReference) alt2.f850b.get(size)).get();
            if (alw2 == null) {
                alt2.f850b.remove(size);
            } else if (alw2.f894b == context) {
                return alw2;
            }
        }
    }

    /* renamed from: b */
    private final int m1052b(alm alm) {
        int size = this.f895c.size();
        for (int i = 0; i < size; i++) {
            if (((aln) this.f895c.get(i)).f842b == alm) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static void m1051a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* renamed from: a */
    public final void mo1005a(all all, alm alm, int i) {
        aln aln;
        boolean z;
        if (all == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (alm != null) {
            m1051a();
            int b = m1052b(alm);
            if (b < 0) {
                aln = new aln(this, alm);
                this.f895c.add(aln);
            } else {
                aln = (aln) this.f895c.get(b);
            }
            int i2 = aln.f844d;
            if (((i2 ^ -1) & i) != 0) {
                aln.f844d = i2 | i;
                z = true;
            } else {
                z = false;
            }
            all all2 = aln.f843c;
            all2.mo975b();
            all.mo975b();
            if (!all2.f840b.containsAll(all.f840b)) {
                alk alk = new alk(aln.f843c);
                alk.mo972a(all);
                aln.f843c = alk.mo971a();
            } else if (!z) {
                return;
            }
            f893a.mo991b();
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    /* renamed from: a */
    public final void mo1006a(alm alm) {
        if (alm != null) {
            m1051a();
            int b = m1052b(alm);
            if (b >= 0) {
                this.f895c.remove(b);
                f893a.mo991b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
