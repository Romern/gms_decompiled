package p000;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: heg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class heg {

    /* renamed from: a */
    public final FragmentManager f19583a;

    /* renamed from: b */
    public BottomSheetBehavior f19584b;

    /* renamed from: c */
    public int f19585c = C0126R.C0129id.dialog_container_1;

    /* renamed from: d */
    public int f19586d;

    /* renamed from: e */
    private final View f19587e;

    /* renamed from: f */
    private final int f19588f;

    /* renamed from: g */
    private int f19589g = C0126R.C0129id.dialog_container_2;

    public heg(FragmentManager fragmentManager, View view, int i, Bundle bundle) {
        this.f19583a = fragmentManager;
        this.f19587e = view;
        this.f19588f = i;
        if (bundle != null) {
            this.f19585c = bundle.getInt("key_current_container_id");
            this.f19589g = bundle.getInt("key_next_container_id");
        }
    }

    /* renamed from: a */
    public final void mo12436a(int i) {
        int min = Math.min(i, (int) ((((long) this.f19588f) * cccr.f178761a.mo6606a().mo75775a()) / 100));
        Fragment findFragmentById = this.f19583a.findFragmentById(this.f19589g);
        Fragment findFragmentById2 = this.f19583a.findFragmentById(this.f19585c);
        if (findFragmentById2 != null && findFragmentById2.getView() != null) {
            findFragmentById2.getView().setAlpha(0.0f);
            this.f19587e.findViewById(this.f19585c).setVisibility(0);
            int i2 = this.f19586d;
            BottomSheetBehavior bottomSheetBehavior = this.f19584b;
            if (bottomSheetBehavior != null && i2 == 0) {
                i2 = bottomSheetBehavior.mo71032b();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, min);
            ofInt.addUpdateListener(new hed(this, findFragmentById, findFragmentById2));
            ofInt.setDuration(cccr.f178761a.mo6606a().mo75779e());
            ofInt.addListener(new hee(this, findFragmentById));
            ofInt.start();
        }
    }

    /* renamed from: a */
    public final void mo12437a(Bundle bundle) {
        bundle.putInt("key_current_container_id", this.f19585c);
        bundle.putInt("key_next_container_id", this.f19589g);
    }

    /* renamed from: a */
    public final void mo12438a(Fragment fragment, String str) {
        if (this.f19583a.findFragmentById(this.f19585c) != null) {
            this.f19587e.findViewById(this.f19589g).setVisibility(4);
        }
        BottomSheetBehavior bottomSheetBehavior = this.f19584b;
        if (bottomSheetBehavior != null) {
            int i = this.f19586d;
            if (i > 0) {
                bottomSheetBehavior.mo71025a(i);
            }
            this.f19584b.mo71037c(4);
        }
        FragmentTransaction beginTransaction = this.f19583a.beginTransaction();
        beginTransaction.add(this.f19589g, fragment, str);
        beginTransaction.commitNow();
        int i2 = this.f19585c;
        this.f19585c = this.f19589g;
        this.f19589g = i2;
    }

    /* renamed from: a */
    public final void mo12439a(BottomSheetBehavior bottomSheetBehavior) {
        this.f19584b = bottomSheetBehavior;
        bottomSheetBehavior.mo71034b(new hef(this, bottomSheetBehavior));
    }
}
