package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: almx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almx {

    /* renamed from: f */
    public static final almv f73804f = new almv(null, null, 8);

    /* renamed from: g */
    private static almx f73805g;

    /* renamed from: a */
    public final Object f73806a = new Object();

    /* renamed from: b */
    public final Context f73807b;

    /* renamed from: c */
    public final ArrayList f73808c = sqc.m35954a();

    /* renamed from: d */
    public final ContentObserver f73809d = new almu(this, "people", "Cp2Observer");

    /* renamed from: e */
    public boolean f73810e;

    /* renamed from: h */
    private final ArrayList f73811h = sqc.m35954a();

    private almx(Context context) {
        this.f73807b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized almx m61368a(Context context) {
        almx almx;
        synchronized (almx.class) {
            if (f73805g == null) {
                f73805g = new almx(context);
            }
            almx = f73805g;
        }
        return almx;
    }

    /* renamed from: b */
    public final void mo40599b() {
        synchronized (this.f73806a) {
            try {
                Iterator it = this.f73811h.iterator();
                while (it.hasNext()) {
                    mo40597a((almv) it.next());
                }
                this.f73811h.clear();
            } catch (Throwable th) {
                this.f73811h.clear();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo40596a() {
        if (this.f73810e) {
            synchronized (this.f73806a) {
                int i = 0;
                while (i < this.f73808c.size()) {
                    if ((((almw) this.f73808c.get(i)).f73802c & 8) == 0) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f73807b.getContentResolver().unregisterContentObserver(this.f73809d);
                this.f73810e = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40597a(almv almv) {
        String str;
        String str2 = almv.f73800a;
        String str3 = almv.f73801b;
        synchronized (this.f73806a) {
            Bundle bundle = null;
            int i = 0;
            boolean z = false;
            while (i < this.f73808c.size()) {
                almw almw = (almw) this.f73808c.get(i);
                if ((almw.f73802c & almv.f73802c) != 0) {
                    String str4 = almw.f73800a;
                    if (str4 == null || (str = almv.f73800a) == null || (bmxi.m108538a(str4, str) && bmxi.m108538a(almw.f73801b, almv.f73801b))) {
                        if (bundle == null) {
                            bundle = new Bundle();
                            bundle.putInt("scope", almv.f73802c);
                            bundle.putString("account", almv.f73800a);
                            bundle.putString("pagegaiaid", almv.f73801b);
                        }
                        try {
                            almw.f73803d.mo40528a(0, (Bundle) null, bundle);
                        } catch (Exception e) {
                            this.f73808c.remove(i);
                            i--;
                            z = true;
                        }
                    }
                }
                i++;
            }
            if (z) {
                mo40596a();
            }
        }
    }

    /* renamed from: a */
    public final void mo40598a(String str, String str2, int i) {
        synchronized (this.f73806a) {
            Iterator it = this.f73811h.iterator();
            while (it.hasNext()) {
                almv almv = (almv) it.next();
                if (bmxi.m108538a(almv.f73800a, str) && bmxi.m108538a(almv.f73801b, str2)) {
                    almv.f73802c |= i;
                    return;
                }
            }
            this.f73811h.add(new almv(str, str2, i));
        }
    }
}
