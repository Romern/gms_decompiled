package p000;

import android.animation.AnimatorListenerAdapter;

/* renamed from: faf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class faf implements avq {

    /* renamed from: a */
    final /* synthetic */ AnimatorListenerAdapter f16145a;

    /* renamed from: b */
    final /* synthetic */ fak f16146b;

    public faf(fak fak, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f16146b = fak;
        this.f16145a = animatorListenerAdapter;
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        fak fak = this.f16146b;
        bswt bswt = fak.f16154b;
        int i2 = ((bswu) bswt.f147493c.get(fak.mo10635b(i))).f147502e;
        fak fak2 = this.f16146b;
        feq feq = fak2.f16153a;
        int i3 = fak2.f16160h;
        int i4 = feq.f16413e;
        if (i4 != i2) {
            feq.f16413e = i2;
            feq.f16412d.mo10742a(i3, i3, i4, i2, 8);
            feq.f16412d.mo10741a(i3, i3, i4, feq.f16413e);
        }
        if (cbro.m128198b() && this.f16146b.f16156d.isTouchExplorationEnabled()) {
            fak fak3 = this.f16146b;
            if (evi.m11187a(fak3.getContext())) {
                i = (this.f16146b.f16154b.f147493c.size() - 1) - i;
            }
            ffp.m11618a(fak3.f16158f.getChildAt(i), fak3.f16156d, fak3.mo10634a(i));
        }
    }

    /* renamed from: b */
    public final void mo1836b(int i) {
    }

    /* renamed from: a */
    public final void mo1835a(int i, float f) {
        if (!cbro.m128209m() || this.f16146b.f16161i) {
            this.f16146b.f16159g.mo4054b(this.f16145a);
            fai fai = this.f16146b.f16155c;
            int b = fai.f16149a.mo10635b(i);
            if (evi.m11187a(fai.f16149a.getContext())) {
                f = 1.0f - f;
            } else if (f > 0.0f) {
                b++;
            } else {
                f = 1.0f;
            }
            bsus bsus = ((bswu) fai.f16149a.f16154b.f147493c.get(b)).f147500c;
            if (bsus == null) {
                bsus = bsus.f147182c;
            }
            int i2 = bsus.f147185b;
            int i3 = bsus.f147184a;
            bsus bsus2 = ((bswu) fai.f16149a.f16154b.f147493c.get(b)).f147500c;
            if (bsus2 == null) {
                bsus2 = bsus.f147182c;
            }
            int i4 = bsus2.f147184a;
            fak fak = fai.f16149a;
            fak.f16159g.mo4052b(fak.f16155c.mo10632a(i4 + ((int) (f * ((float) (i2 - i3))))));
        }
    }
}
