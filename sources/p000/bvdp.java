package p000;

import java.io.IOException;

/* renamed from: bvdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvdp implements bvbr {

    /* renamed from: a */
    final /* synthetic */ bvdq f155665a;

    public bvdp(bvdq bvdq) {
        this.f155665a = bvdq;
    }

    /* renamed from: a */
    public final void mo73116a() {
    }

    public final void run() {
        try {
            bvdq bvdq = this.f155665a;
            bvbw bvbw = bvdq.f155667b;
            buzq buzq = bvdq.f155666a.f155491c;
            if (buzq == null) {
                buzq = buzq.f155418c;
            }
            bvbw.mo73142a(buzq.f155421b.getKey());
        } catch (IOException e) {
            throw new RuntimeException("Error sending payload.", e);
        }
    }
}
