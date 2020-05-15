package p000;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buuz implements bvdc {

    /* renamed from: a */
    public final AtomicBoolean f155016a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f155017b = new CountDownLatch(1);

    /* renamed from: c */
    public final bvbv f155018c;

    /* renamed from: d */
    public buzk f155019d;

    /* renamed from: e */
    public bvbw f155020e;

    /* renamed from: f */
    public bvbw f155021f;

    public buuz(Context context, buzk buzk) {
        this.f155018c = (bvbv) ahgz.m55754a(context, bvbv.class);
        this.f155019d = buzk;
    }

    /* renamed from: a */
    public final bvbr mo73118a(bvat bvat) {
        return new buuy(this, bvat);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bvbw mo73119a(buzt buzt);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73121a(bvbw bvbw);

    /* renamed from: b */
    public final buzl mo73124b() {
        bxvd da = buzl.f155397g.mo74144da();
        bvbw bvbw = this.f155021f;
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
            buzo e = this.f155021f.mo73147e();
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

    /* renamed from: a */
    public final void mo73120a() {
        srn srn = bvcm.f155598a;
        this.f155018c.mo73293b(this.f155021f);
        if (this.f155016a.compareAndSet(false, true)) {
            mo73121a(this.f155020e);
        }
        this.f155017b.countDown();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo73125c() {
        return buzl.f155397g;
    }

    /* renamed from: a */
    public final void mo73122a(bvda bvda) {
        mo73120a();
        bvda.mo73126a();
    }

    /* renamed from: a */
    public final boolean mo73123a(bvcy bvcy) {
        while (this.f155017b.getCount() > 0 && bvcy.mo73332k()) {
            try {
                this.f155017b.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("buuz", "a", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("ConnectionStatusCheck interrupted");
            }
            if (this.f155016a.get()) {
                return false;
            }
        }
        bvcy.mo73331j();
        return true;
    }
}
