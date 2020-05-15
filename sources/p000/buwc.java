package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwc implements bvdc {

    /* renamed from: a */
    public final CountDownLatch f155121a;

    /* renamed from: b */
    public final buwe f155122b;

    /* renamed from: c */
    public final bvbv f155123c;

    /* renamed from: d */
    public final buxb f155124d;

    /* renamed from: e */
    public final buzk f155125e;

    /* renamed from: f */
    public final AtomicBoolean f155126f = new AtomicBoolean(false);

    /* renamed from: g */
    public buwd f155127g;

    /* renamed from: h */
    public bvbw f155128h;

    /* renamed from: i */
    public int f155129i;

    public buwc(Context context, buzk buzk) {
        this.f155123c = (bvbv) ahgz.m55754a(context, bvbv.class);
        this.f155122b = (buwe) ahgz.m55754a(context, buwe.class);
        this.f155124d = (buxb) ahgz.m55754a(context, buxb.class);
        this.f155125e = buzk;
        int a = buzs.m120815a(buzk.f155396d);
        this.f155129i = a == 0 ? 1 : a;
        this.f155121a = new CountDownLatch(1);
    }

    /* renamed from: a */
    public static void m120564a(Context context, buzk buzk) {
        int i = Build.VERSION.SDK_INT;
        int a = buzs.m120815a(buzk.f155396d);
        if (a != 0 && a == 2 && ((buzk.f155393a & 2) == 0 || buzk.f155395c.mo73744a() == 0)) {
            throw new bvdj("Secret key not set for SPAKE connection");
        }
        buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
        if (buxb == null || !buxb.mo73224a()) {
            throw new bvdl(buxb.class, buwc.class);
        }
    }

    /* renamed from: b */
    public final buzl mo73125c() {
        bxvd da = buzl.f155397g.mo74144da();
        bvbw bvbw = this.f155128h;
        if (bvbw == null || !bvbw.mo73146d()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzl buzl = (buzl) da.f164949b;
            buzl.f155401c = 1;
            buzl.f155399a |= 2;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzl buzl2 = (buzl) da.f164949b;
            buzl2.f155401c = 2;
            buzl2.f155399a = 2 | buzl2.f155399a;
            buzo e = this.f155128h.mo73147e();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzl buzl3 = (buzl) da.f164949b;
            e.getClass();
            buzl3.f155402d = e;
            buzl3.f155399a |= 4;
        }
        return (buzl) da.mo74062i();
    }

    /* renamed from: d */
    public final void mo73168d() {
        this.f155123c.mo73293b(this.f155128h);
        if (this.f155126f.compareAndSet(false, true)) {
            this.f155121a.countDown();
            buwd buwd = this.f155127g;
            if (buwd != null) {
                this.f155122b.mo73281c(buwd);
            }
        }
    }

    /* renamed from: a */
    public final bvbr mo73118a(bvat bvat) {
        return new buwb(this, bvat);
    }

    /* renamed from: a */
    public final void mo73165a() {
        bvbw bvbw = this.f155128h;
        if (bvbw != null && (bvbw instanceof bvcy)) {
            bvcy bvcy = (bvcy) bvbw;
            if (bvcy.mo73332k()) {
                bvcy.mo73331j();
                try {
                    bvcy.mo73329h();
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buwc", "a", 233, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Fail to send confirm message");
                }
                this.f155121a.countDown();
                return;
            }
            return;
        }
        bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
        bnsl2.mo68432a("buwc", "a", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("No connection ready to confirm");
    }

    /* renamed from: a */
    public final void mo73122a(bvda bvda) {
        mo73168d();
        this.f155124d.mo73225b(bvda);
    }

    /* renamed from: a */
    public final boolean mo73166a(bvcy bvcy, bvat bvat) {
        try {
            String i = bvcy.mo73330i();
            bxvd da = buzl.f155397g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzl buzl = (buzl) da.f164949b;
            buzl.f155401c = 5;
            int i2 = buzl.f155399a | 2;
            buzl.f155399a = i2;
            i.getClass();
            buzl.f155399a = i2 | 16;
            buzl.f155404f = i;
            bvat.mo36284a((buzl) da.mo74062i());
            if (!bvcy.mo73328g()) {
                return false;
            }
            while (!bvcy.mo73146d() && bvcy.mo73332k()) {
                try {
                    this.f155121a.await(500, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buwc", "a", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("ConnectionStatusCheck interrupted");
                }
                if (this.f155126f.get()) {
                    return false;
                }
            }
            return bvcy.mo73146d();
        } catch (IOException e2) {
            srn srn = bvcm.f155598a;
            return false;
        }
    }
}
