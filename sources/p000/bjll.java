package p000;

import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import com.google.android.chimera.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: bjll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjll extends bjjn {

    /* renamed from: p */
    BottomSheetBehavior f122933p;

    /* renamed from: q */
    private bwms f122934q;

    /* renamed from: r */
    private bhfj f122935r;

    public bjll(bjgv bjgv) {
        super(bjgv, bjlg.class);
    }

    /* renamed from: J */
    private final void m103835J() {
        BottomSheetBehavior bottomSheetBehavior = this.f122933p;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo71024a(((float) this.f122934q.f160311c) / 100.0f);
            BottomSheetBehavior bottomSheetBehavior2 = this.f122933p;
            Point point = new Point();
            ((WindowManager) this.f122676a.f122692a.f122727d.getSystemService("window")).getDefaultDisplay().getSize(point);
            bottomSheetBehavior2.mo71025a(Math.round(((float) point.y) * (((float) this.f122934q.f160312d) / 100.0f)));
            this.f122933p.mo71035b(((bjlh) ((bjhy) ((bjlg) ((bjjm) this).f122830n)).f122754m).f122927f);
            this.f122933p.mo71037c(mo65368I());
            this.f122933p.mo71030a(false);
            this.f122933p.mo71029a(this.f122935r);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m103835J();
    }

    /* renamed from: I */
    public final int mo65368I() {
        bwmu bwmu = ((bjlh) ((bjhy) ((bjlg) ((bjjm) this).f122830n)).f122754m).f122925d;
        bwmu bwmu2 = bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
        int ordinal = bwmu.ordinal();
        if (ordinal == 0) {
            mo65169b("BottomSheetPositionState cannot be unknown");
            return 5;
        } else if (ordinal == 1) {
            return 4;
        } else {
            if (ordinal != 2) {
                return ordinal != 3 ? 5 : 3;
            }
            return 6;
        }
    }

    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        bjkh.m103770a(bjgt.f122686k, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Fragment mo65308b(bwxl bwxl) {
        int i;
        bjlj bjlj = (bjlj) mo65307F();
        if (bjlj == null) {
            if ((bwxl.f161385a & 32) != 0) {
                bxbb bxbb = bwxl.f161391g;
                if (bxbb == null) {
                    bxbb = bxbb.f161772d;
                }
                i = bxbb.f161774a;
            } else {
                i = 0;
            }
            long j = bwxl.f161386b;
            bjlj bjlj2 = new bjlj();
            bjlj2.setArguments(bjlx.m103882a(i, j));
            bjlj = bjlj2;
        }
        bjlj.f122929a = this;
        bhfq bhfq = bjlj.f122930b;
        if (bhfq != null) {
            mo65369a(bhfq.mo63666a());
        }
        return bjlj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        bxvj bxvj = bwms.f160307f;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122934q = (bwms) b;
        super.mo65162a(bwxl, bwxl2);
        bjgv bjgv = this.f122676a;
        bjgy bjgy = bjgv.f122694c;
        bwxl bwxl3 = this.f122934q.f160310b;
        if (bwxl3 == null) {
            bwxl3 = bwxl.f161383i;
        }
        mo65160a(bjgy.mo65206a(bjgv, bwxl3));
        this.f122935r = new bjlk(this);
        m103835J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkk bjkk = this.f122686k;
        bjjz bjjz = bjkk.f122859d;
        bjkp.m103791a(bjkk, bjjz.mo65320b(), view);
        bjka a = bjjz.mo65318a();
        bjkp.m103793b(bjkk, a, view);
        bjkp.m103792a(bjkk, a, view, true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65369a(BottomSheetBehavior bottomSheetBehavior) {
        this.f122933p = bottomSheetBehavior;
        m103835J();
    }
}
