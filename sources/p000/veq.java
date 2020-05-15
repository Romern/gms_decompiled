package p000;

import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: veq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class veq extends vfe {

    /* renamed from: h */
    public static final /* synthetic */ int f49131h = 0;

    /* renamed from: a */
    public final ves f49132a;

    /* renamed from: b */
    public Network f49133b = null;

    /* renamed from: c */
    public final vfk f49134c;

    /* renamed from: d */
    public txg f49135d = null;

    /* renamed from: e */
    public final vek f49136e;

    /* renamed from: f */
    public final vel f49137f;

    /* renamed from: g */
    public final vem f49138g;

    /* renamed from: j */
    private veb f49139j = null;

    public veq(ves ves) {
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        sdo.m34959a(ves);
        this.f49132a = ves;
        this.f49136e = new vek(this);
        this.f49137f = new vel(this);
        this.f49138g = new vem(this);
        this.f49134c = new ven(this);
    }

    /* renamed from: g */
    private final void m40247g() {
        txg txg;
        if (!mo28377e()) {
            boolean z = false;
            if (!(this.f49139j == null || (txg = this.f49135d) == null)) {
                ves ves = this.f49132a;
                ArrayList arrayList = new ArrayList();
                vev vev = (vev) ves;
                synchronized (vev.f49148c) {
                    for (Network network : ((vev) ves).f49149d) {
                        if (((vev) ves).mo28363a(network, txg)) {
                            arrayList.add(network);
                        }
                    }
                }
                Collections.sort(arrayList, vev.f49151f);
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                if (!unmodifiableList.isEmpty()) {
                    this.f49133b = (Network) unmodifiableList.get(0);
                    if (mo28361b(this.f49135d)) {
                        z = true;
                    }
                }
            }
            mo28373a(z);
        }
    }

    /* renamed from: a */
    public final vfk mo28357a() {
        return this.f49134c;
    }

    /* renamed from: b */
    public final synchronized void mo28360b() {
        m40247g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo28358a(txg txg) {
        if (!txg.equals(this.f49135d)) {
            this.f49135d = txg;
            m40247g();
        }
    }

    /* renamed from: b */
    public final boolean mo28361b(txg txg) {
        return txg.mo18219c() != 257 || this.f49139j.f49106a;
    }

    /* renamed from: a */
    public final synchronized void mo28359a(veb veb) {
        if (!veb.equals(this.f49139j)) {
            this.f49139j = veb;
            m40247g();
        }
    }
}
