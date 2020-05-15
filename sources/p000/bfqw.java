package p000;

import android.location.GpsSatellite;
import java.util.Iterator;

/* renamed from: bfqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqw implements bhbh, bhbp {

    /* renamed from: a */
    public final bhbi f114951a;

    /* renamed from: b */
    public final bhbr f114952b;

    /* renamed from: c */
    public final Object f114953c = new Object();

    /* renamed from: d */
    public int f114954d = 0;

    /* renamed from: e */
    public boolean f114955e;

    /* renamed from: f */
    public boolean f114956f;

    /* renamed from: g */
    public boolean f114957g;

    public bfqw(bhbi bhbi) {
        this.f114951a = bhbi;
        this.f114952b = null;
    }

    /* renamed from: a */
    public final void mo61257a(bfkr bfkr) {
        int i = 0;
        for (int i2 = 0; i2 < bfkr.mo61839a(); i2++) {
            if (bfkr.mo61846f(i2)) {
                i++;
            }
        }
        synchronized (this.f114953c) {
            this.f114954d = i;
        }
    }

    public bfqw(bhbr bhbr) {
        this.f114952b = bhbr;
        this.f114951a = null;
    }

    /* renamed from: a */
    public final void mo62152a(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((GpsSatellite) it.next()).usedInFix()) {
                i++;
            }
        }
        synchronized (this.f114953c) {
            this.f114954d = i;
        }
    }
}
