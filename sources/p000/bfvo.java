package p000;

import android.os.SystemClock;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bfvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfvo {

    /* renamed from: a */
    private long f115426a = 0;

    /* renamed from: b */
    private boolean f115427b = false;

    /* renamed from: u */
    public boolean f115428u = false;

    /* renamed from: v */
    public boolean f115429v = true;

    /* renamed from: w */
    public Collection f115430w = Collections.emptyList();

    /* renamed from: x */
    public boolean f115431x = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62293a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62307a(StringBuilder sb) {
        sb.append("requested=");
        sb.append(this.f115428u);
        sb.append(", enabled=");
        sb.append(this.f115429v);
        if (this.f115426a != 0) {
            sb.append(", start(ERT)=");
            sb.append(this.f115426a);
            sb.append("ms");
        }
        sb.append(", clients=");
        sb.append(this.f115430w);
    }

    /* renamed from: b */
    public void mo62309b() {
        if (!this.f115428u) {
            this.f115428u = true;
            this.f115426a = SystemClock.elapsedRealtime();
            mo62325g();
        }
        mo62324f();
    }

    /* renamed from: e */
    public final void mo62323e() {
        if (this.f115428u) {
            this.f115428u = false;
            mo62325g();
        }
        mo62324f();
    }

    /* renamed from: f */
    public final void mo62324f() {
        if (this.f115427b) {
            this.f115427b = false;
            mo62293a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo62325g() {
        this.f115427b = true;
    }

    /* renamed from: b */
    public final void mo62322b(boolean z) {
        if (this.f115431x != z) {
            this.f115431x = z;
            mo62325g();
        }
    }

    /* renamed from: a */
    public final void mo62320a(Collection collection) {
        Collection collection2 = this.f115430w;
        if ((collection2 != null && !collection2.equals(collection)) || (collection != null && !collection.equals(this.f115430w))) {
            this.f115430w = collection;
            mo62325g();
        }
    }

    /* renamed from: a */
    public final void mo62321a(boolean z) {
        if (this.f115429v != z) {
            this.f115429v = z;
            mo62325g();
        }
    }
}
