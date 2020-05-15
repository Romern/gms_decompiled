package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdif {

    /* renamed from: a */
    final List f105690a = new ArrayList();

    /* renamed from: b */
    public volatile boolean f105691b;

    /* renamed from: a */
    public final synchronized void mo58065a() {
        if (!this.f105691b) {
            this.f105691b = true;
            synchronized (this.f105690a) {
                for (bdig bdig : this.f105690a) {
                    try {
                        bdig.mo58031b();
                    } catch (RuntimeException e) {
                    }
                }
                this.f105690a.clear();
            }
        }
    }

    /* renamed from: b */
    public final void mo58069b(bdig bdig) {
        if (!mo58068a(bdig)) {
            bdig.mo58031b();
        }
    }

    /* renamed from: a */
    public final void mo58066a(Context context, bmzi bmzi) {
        bdit bdit = new bdit(context);
        mo58067a(bdit);
        if (!this.f105691b) {
            context.registerReceiver(new bdis(this, bdit, bmzi), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
    }

    /* renamed from: a */
    public final void mo58067a(bmzi bmzi) {
        if (!this.f105691b && ((Boolean) bmzi.mo6606a()).booleanValue()) {
            mo58065a();
        }
    }

    /* renamed from: a */
    public final boolean mo58068a(bdig bdig) {
        synchronized (this.f105690a) {
            if (this.f105691b) {
                return false;
            }
            List list = this.f105690a;
            bmxy.m108581a(bdig);
            list.add(bdig);
            return true;
        }
    }
}
