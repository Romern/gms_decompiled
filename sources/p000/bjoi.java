package p000;

import android.animation.Animator;
import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: bjoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjoi extends bjjm implements Animator.AnimatorListener {

    /* renamed from: m */
    private bwtq f123049m;

    /* renamed from: o */
    private ImageView f123050o;

    /* renamed from: p */
    private LottieAnimationView f123051p;

    /* renamed from: q */
    private boolean f123052q = false;

    public bjoi(bjgv bjgv) {
        super(bjgv, bjog.class);
    }

    /* renamed from: E */
    private final void m104154E() {
        bwtt bwtt;
        arg arg;
        int[] iArr;
        bwtj bwtj = ((bjog) ((bjjm) this).f122830n).f123047p.f160980b;
        if (bwtj == null) {
            bwtj = bwtj.f160961f;
        }
        int a = bwti.m122289a(bwtj.f160967e);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            ImageView imageView = this.f123050o;
            bwtq bwtq = this.f123049m;
            if (bwtq.f160989a == 1) {
                bwtt = (bwtt) bwtq.f160990b;
            } else {
                bwtt = bwtt.f160992e;
            }
            int i3 = ((bjoh) ((bjhy) ((bjog) ((bjjm) this).f122830n)).f122754m).f123048d;
            int a2 = bwts.m122299a(bwtt.f160995b);
            if (a2 != 0 && a2 == 2) {
                Context context = imageView.getContext();
                if (imageView.getDrawable() instanceof arg) {
                    arg = (arg) imageView.getDrawable();
                } else {
                    arg arg2 = new arg(context);
                    arg2.mo2328a();
                    if ((bwtt.f160994a & 2) != 0) {
                        bwya bwya = bwtt.f160997d;
                        if (bwya == null) {
                            bwya = bwya.f161433d;
                        }
                        arg2.mo2329a((float) bjkl.m103780a(bwya));
                    }
                    arg2.f2080a.f2072q = 0.0f;
                    arg2.invalidateSelf();
                    if (bwtt.f160996c.size() <= 0) {
                        iArr = new int[]{C1133kh.m17843b(context, C0126R.color.google_blue500), C1133kh.m17843b(context, C0126R.color.google_red500), C1133kh.m17843b(context, C0126R.color.google_yellow500), C1133kh.m17843b(context, C0126R.color.google_green500)};
                    } else {
                        bxvt bxvt = bwtt.f160996c;
                        int size = bxvt.size();
                        iArr = new int[size];
                        for (int i4 = 0; i4 < size; i4++) {
                            iArr[i4] = ((Integer) bxvt.get(i4)).intValue();
                        }
                    }
                    arg2.mo2332a(iArr);
                    imageView.setImageDrawable(arg2);
                    arg = arg2;
                }
                if (i3 != 3) {
                    arg.stop();
                } else {
                    arg.start();
                }
                this.f123050o.setContentDescription(bwtj.f160966d);
                return;
            }
            Object[] objArr = new Object[1];
            int a3 = bwts.m122299a(bwtt.f160995b);
            if (a3 != 0) {
                i = a3;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalStateException(String.format("Unsupported style %s", objArr));
        } else if (i2 != 3) {
            Object[] objArr2 = new Object[1];
            int a4 = bwti.m122289a(bwtj.f160967e);
            if (a4 != 0) {
                i = a4;
            }
            objArr2[0] = Integer.valueOf(i - 1);
            throw new IllegalStateException(String.format("Unsupported content type %s", objArr2));
        } else {
            int i5 = ((bjoh) ((bjhy) ((bjog) ((bjjm) this).f122830n)).f122754m).f123048d;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            } else if (i6 == 1) {
            } else {
                if (i6 == 2) {
                    this.f123052q = false;
                    this.f123051p.mo4042a();
                } else if (i6 != 3) {
                    mo65169b(String.format(Locale.US, "Unknown animated image state %s", Integer.valueOf(i6)));
                } else {
                    this.f123052q = true;
                    if (!this.f123051p.mo4058c()) {
                        this.f123051p.mo4052b(1.0f);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104154E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        bwtm bwtm;
        bwtm bwtm2;
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwtq.f160987d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123049m = (bwtq) b;
        bwtj bwtj = ((bjog) ((bjjm) this).f122830n).f123047p.f160980b;
        if (bwtj == null) {
            bwtj = bwtj.f160961f;
        }
        int a = bwti.m122289a(bwtj.f160967e);
        boolean z = true;
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            this.f123050o = new ImageView(this.f122676a.f122692a.f122732i);
        } else if (i2 != 3) {
            Object[] objArr = new Object[1];
            int a2 = bwti.m122289a(bwtj.f160967e);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalStateException(String.format("Unsupported content type %s", objArr));
        } else {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(this.f122676a.f122692a.f122732i);
            this.f123051p = lottieAnimationView;
            if (bwtj.f160964b == 4) {
                bwtm = (bwtm) bwtj.f160965c;
            } else {
                bwtm = bwtm.f160969c;
            }
            lottieAnimationView.mo4048a((axw) aye.m2425a(bwtm.f160971a).f2600a);
            LottieAnimationView lottieAnimationView2 = this.f123051p;
            if (bwtj.f160964b == 4) {
                bwtm2 = (bwtm) bwtj.f160965c;
            } else {
                bwtm2 = bwtm.f160969c;
            }
            int a3 = bwtl.m122292a(bwtm2.f160972b);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 != 3) {
                z = false;
            }
            lottieAnimationView2.mo4050a(z);
            this.f123051p.mo4047a(this);
            this.f123051p.setContentDescription(bwtj.f160966d);
        }
        m104154E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65304c(String str) {
        if (str == null) {
            bwtj bwtj = ((bjog) ((bjjm) this).f122830n).f123047p.f160980b;
            if (bwtj == null) {
                bwtj = bwtj.f160961f;
            }
            str = bwtj.f160966d;
        }
        super.mo65304c(str);
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ((bjoh) ((bjhy) ((bjog) ((bjjm) this).f122830n)).f122754m).mo65409b(4);
    }

    public final void onAnimationRepeat(Animator animator) {
        if (this.f123052q) {
            this.f123051p.mo4059d();
            this.f123052q = false;
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        bwtj bwtj = ((bjog) ((bjjm) this).f122830n).f123047p.f160980b;
        if (bwtj == null) {
            bwtj = bwtj.f160961f;
        }
        int a = bwti.m122289a(bwtj.f160967e);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            mo65177j(this.f123050o);
        } else if (i2 != 3) {
            Object[] objArr = new Object[1];
            int a2 = bwti.m122289a(bwtj.f160967e);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalStateException(String.format("Unsupported content type %s", objArr));
        } else {
            mo65177j(this.f123051p);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }
}
