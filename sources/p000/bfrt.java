package p000;

import android.location.Location;
import android.os.Build;
import com.google.android.gms.location.LocationAvailability;
import java.util.List;

/* renamed from: bfrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfrt implements bfrv, bfrb {

    /* renamed from: a */
    public final bfrc f115072a;

    /* renamed from: b */
    public final bfrs f115073b;

    /* renamed from: c */
    public boolean f115074c = false;

    /* renamed from: d */
    public boolean f115075d = false;

    /* renamed from: e */
    public Location f115076e = null;

    /* renamed from: f */
    public bfrb f115077f;

    /* renamed from: g */
    private final bfrw f115078g;

    public bfrt(bfrc bfrc, bfrw bfrw) {
        this.f115072a = bfrc;
        this.f115078g = bfrw;
        bfrc.mo62071a(this);
        this.f115073b = new bfrs(this);
    }

    /* renamed from: a */
    public final void mo62121a(LocationAvailability locationAvailability) {
        bfrb bfrb;
        if (this.f115074c && !this.f115075d && (bfrb = this.f115077f) != null) {
            bfrb.mo62121a(locationAvailability);
        }
    }

    /* renamed from: e */
    public final void mo62160e() {
        mo62190a(false);
    }

    /* renamed from: f */
    public final void mo62122f(List list) {
        bfrb bfrb;
        if (this.f115074c && !this.f115075d && (bfrb = this.f115077f) != null) {
            bfrb.mo62122f(list);
        }
    }

    /* renamed from: a */
    public final void mo62190a(boolean z) {
        if (z != this.f115075d) {
            this.f115075d = z;
            this.f115076e = null;
            if (!z) {
                bfrw bfrw = this.f115078g;
                synchronized (bfrw.f115081b) {
                    if (bfrw.f115082c != null) {
                        bfrw.f115082c = null;
                        int i = Build.VERSION.SDK_INT;
                        bfrw.f115080a.mo25957a(bfrw);
                    }
                }
                if (this.f115074c) {
                    this.f115072a.mo62058a();
                    return;
                }
                return;
            }
            this.f115078g.mo62192a(this);
            this.f115072a.mo62061b();
        }
    }
}
