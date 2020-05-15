package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: auk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auk extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ aun f2268a;

    public auk(aun aun) {
        this.f2268a = aun;
    }

    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f2268a.f2275a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((auh) arrayList.get(i)).mo2525a(this.f2268a);
        }
    }

    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f2268a.f2275a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            auh auh = (auh) arrayList.get(i);
        }
    }
}
