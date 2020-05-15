package p000;

import android.animation.Animator;

/* renamed from: azws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azws extends azwq {

    /* renamed from: a */
    protected final Animator f100131a;

    /* renamed from: b */
    public final Runnable f100132b;

    /* renamed from: c */
    public final int f100133c;

    /* renamed from: d */
    public int f100134d;

    /* renamed from: e */
    private final azwv f100135e = new azwr(this);

    private azws(Animator animator, Runnable runnable) {
        this.f100131a = animator;
        this.f100133c = -1;
        this.f100132b = runnable;
    }

    /* renamed from: a */
    public static void m86303a(Animator animator, Runnable runnable) {
        animator.addListener(new azws(animator, runnable));
    }

    public final void onAnimationEnd(Animator animator) {
        if (!mo55336a(animator)) {
            azwx.m86308a().mo55344a(this.f100135e);
        }
    }
}
