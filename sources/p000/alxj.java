package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: alxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alxj implements rtp {

    /* renamed from: a */
    final /* synthetic */ rle f74520a;

    /* renamed from: b */
    final /* synthetic */ alxn f74521b;

    /* renamed from: c */
    final /* synthetic */ alxa f74522c;

    public alxj(alxn alxn, alxa alxa, rle rle) {
        this.f74521b = alxn;
        this.f74522c = alxa;
        this.f74520a = rle;
    }

    /* renamed from: a */
    public final int mo24660a() {
        return this.f74522c.mo40836a();
    }

    /* renamed from: b */
    public final Bundle mo24662b() {
        return null;
    }

    /* renamed from: c */
    public final void mo12460c() {
        rle rle = this.f74520a;
        if (rle != null) {
            rle.mo9460b();
        }
        for (DataHolder dataHolder : this.f74521b.f74530b) {
            dataHolder.close();
        }
    }

    public final void close() {
        mo12460c();
    }

    public final Iterator iterator() {
        return new rtq(this);
    }

    /* renamed from: a */
    public final Object mo24661a(int i) {
        return this.f74522c.mo40837a(i);
    }
}
