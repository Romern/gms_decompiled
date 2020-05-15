package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleAccountAvatar extends AccountParticleDisc {

    /* renamed from: j */
    private akhz f81148j;

    public GoogleAccountAvatar(Context context) {
        super(context);
        setWillNotDraw(false);
        m67621a(context);
    }

    /* renamed from: a */
    private final void m67621a(Context context) {
        soc soc = new soc(1, 9);
        bdej bdej = new bdej(soc);
        mo60576a(bdej, bddo.class);
        Context applicationContext = context.getApplicationContext();
        bddp bddp = new bddp();
        Context applicationContext2 = context.getApplicationContext();
        allp allp = new allp();
        allp.f73626a = 80;
        AccountParticleDisc.m94876a(applicationContext, bdej, soc, bddp, new bddr(applicationContext2, soc, allp.mo40491a()), bddo.class);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        akhz akhz = this.f81148j;
        if (akhz != null) {
            akia.m59782a(canvas, akhz);
        }
    }

    public GoogleAccountAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        m67621a(context);
    }

    public GoogleAccountAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        m67621a(context);
    }

    /* renamed from: a */
    public final void mo44652a() {
        int a = akim.m59828a(getContext(), 2);
        int a2 = akim.m59828a(getContext(), -16);
        int a3 = akim.m59828a(getContext(), -4);
        int a4 = akim.m59828a(getContext(), 2);
        int a5 = akim.m59828a(getContext(), 1);
        akhy k = akhz.m59766k();
        k.mo39481a(getContext());
        k.f72038a = akia.m59780a(getContext());
        k.mo39482b(getWidth());
        k.mo39480a(getHeight());
        k.mo39485e(a);
        k.mo39483c(a2);
        k.mo39484d(a3);
        k.mo39487g(a4);
        k.mo39486f(a5);
        this.f81148j = k.mo39479a();
    }
}
