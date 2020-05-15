package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: fae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fae extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ fak f16144a;

    public fae(fak fak) {
        this.f16144a = fak;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.airbnb.lottie.LottieAnimationView.a(float, float):void
     arg types: [int, int]
     candidates:
      com.airbnb.lottie.LottieAnimationView.a(int, int):void
      com.airbnb.lottie.LottieAnimationView.a(float, float):void */
    public final void onAnimationEnd(Animator animator) {
        this.f16144a.f16159g.mo4054b(this);
        if (cbro.m128209m()) {
            fak fak = this.f16144a;
            fak.f16161i = true;
            fak.f16159g.mo4044a(0.0f, 1.0f);
        }
        fak fak2 = this.f16144a;
        LottieAnimationView lottieAnimationView = fak2.f16159g;
        fai fai = fak2.f16155c;
        bsus bsus = ((bswu) fak2.f16154b.f147493c.get(0)).f147500c;
        if (bsus == null) {
            bsus = bsus.f147182c;
        }
        lottieAnimationView.mo4052b(fai.mo10632a(bsus.f147185b));
    }
}
