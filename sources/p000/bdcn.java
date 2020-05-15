package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.Iterator;

/* renamed from: bdcn */
public final /* synthetic */ class bdcn implements Runnable {

    /* renamed from: a */
    private final AccountParticleDisc f105335a;

    /* renamed from: b */
    private final Object f105336b;

    public bdcn(AccountParticleDisc accountParticleDisc, Object obj) {
        this.f105335a = accountParticleDisc;
        this.f105336b = obj;
    }

    public final void run() {
        bmvz bmvz;
        AccountParticleDisc accountParticleDisc = this.f105335a;
        Object obj = this.f105336b;
        bmxy.m108601b(accountParticleDisc.mo60579b(), "initialize must be called first");
        if (obj != accountParticleDisc.f111381h) {
            accountParticleDisc.mo60581d();
            ImageView imageView = accountParticleDisc.f111374a;
            int i = accountParticleDisc.f111380g;
            imageView.setPadding(i, i, i, i);
            bddk bddk = accountParticleDisc.f111378e;
            if (bddk != null) {
                beel.m91855b();
                bddk.f105365a.setImageDrawable(null);
            }
        }
        accountParticleDisc.f111381h = obj;
        bddf bddf = accountParticleDisc.f111377d;
        beel.m91855b();
        for (bdcx bdcx : bddf.f105357a) {
            if (bddf.f105358b != null) {
                bdcv a = bdcx.m90590a();
                a.f105346a.remove(bddf.f105359c);
            }
            bddf.mo57889a(obj);
        }
        bddf.f105358b = obj;
        beel.m91855b();
        if (accountParticleDisc.f111379f) {
            bddf bddf2 = accountParticleDisc.f111377d;
            beel.m91855b();
            if (bddf2.f105358b != null) {
                for (bdcx bdcx2 : bddf2.f105357a) {
                    Object obj2 = bddf2.f105358b;
                    bdcx.m90590a();
                }
            }
            bmvz = bmvz.f131120a;
        } else {
            bmvz = bmvz.f131120a;
        }
        accountParticleDisc.f111382i = bmvz;
        accountParticleDisc.mo60578a(obj, accountParticleDisc.f111374a);
        accountParticleDisc.post(new bdcp(accountParticleDisc));
        beel.m91855b();
        bddk bddk2 = accountParticleDisc.f111378e;
        if (bddk2 != null) {
            bmxv bmxv = accountParticleDisc.f111382i;
            beel.m91855b();
            if (!bmxv.equals(bddk2.f105368d)) {
                bddk2.f105368d = bmxv;
                bngs j = bngx.m109377j();
                if (bddk2.f105365a.getDrawable() != null) {
                    ObjectAnimator duration = ObjectAnimator.ofInt(bddk2.f105365a, bddk.f105364f, bddk2.f105367c, 0).setDuration(200L);
                    duration.addListener(new bddg(bddk2));
                    j.mo67668c(duration);
                }
                if (bmxv.mo66813a()) {
                    ObjectAnimator duration2 = ObjectAnimator.ofInt(bddk2.f105365a, bddk.f105364f, 0, bddk2.f105367c).setDuration(200L);
                    duration2.addListener(new bddh(bddk2, bmxv));
                    j.mo67668c(duration2);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(j.mo67664a());
                animatorSet.addListener(new bddi(bddk2));
                AnimatorSet animatorSet2 = bddk2.f105369e;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                bddk2.f105369e = animatorSet;
                bddk2.f105369e.start();
            }
        }
        Iterator it = accountParticleDisc.f111376c.iterator();
        while (it.hasNext()) {
            ((bdcs) it.next()).mo57880a();
        }
    }
}
