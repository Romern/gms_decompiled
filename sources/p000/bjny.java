package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Locale;

/* renamed from: bjny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjny extends bjjk {

    /* renamed from: o */
    private int f123040o = 1;

    public bjny(bjgv bjgv) {
        super(bjgv, bjnz.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final ViewGroup mo65299E() {
        ViewGroup viewGroup = ((bjjk) this).f122827m;
        int i = this.f123040o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int i3 = this.f123040o;
            int i4 = i3 - 1;
            if (i3 != 0) {
                objArr[0] = Integer.valueOf(i4);
                mo65169b(String.format(locale, "Unsupported Container layout mode: %s", objArr));
                return viewGroup;
            }
            throw null;
        } else if (i2 == 1) {
            return new FrameLayout(this.f122676a.f122692a.f122732i);
        } else {
            if (i2 == 2) {
                return new FlexboxLayout(this.f122676a.f122692a.f122732i);
            }
            if (i2 != 3) {
                return viewGroup;
            }
            return new GridLayout(this.f122676a.f122692a.f122732i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1.mo65338a(r5, 2) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r7 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        if (r7 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* renamed from: a */
    public final void mo65212a(bjgt bjgt, View view) {
        boolean z;
        GridLayout.LayoutParams layoutParams;
        boolean z2;
        boolean z3;
        bwwy a;
        bwwy a2;
        int i = this.f123040o;
        int i2 = i - 1;
        if (i != 0) {
            boolean z4 = false;
            if (i2 == 0) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int i3 = this.f123040o;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    objArr[0] = Integer.valueOf(i4);
                    mo65169b(String.format(locale, "Unsupported Container layout mode: %s", objArr));
                } else {
                    throw null;
                }
            } else if (i2 == 1) {
                bjkh.m103770a(bjgt.f122686k, view);
            } else if (i2 == 2) {
                bjkg.m103768a(bjgt.f122686k, view);
            } else if (i2 == 3) {
                bjkk bjkk = bjgt.f122686k;
                bjka b = bjkk.f122859d.mo65320b();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof GridLayout.LayoutParams) {
                    layoutParams = (GridLayout.LayoutParams) layoutParams2;
                    z = false;
                } else {
                    layoutParams = new GridLayout.LayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    z = true;
                }
                if (bjko.m103789a(bjkk, b, layoutParams)) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                bjka a3 = b.mo65323a(13);
                if (a3 != null) {
                    int i5 = bjkk.f122860e;
                    boolean a4 = bjkk.mo65338a(a3, 3);
                    if (!a4) {
                        if (!bjkk.mo65338a(a3, 1)) {
                            z3 = false;
                            if (!a4) {
                            }
                            z4 = true;
                            if (a4 || z3 || z4) {
                                bwwz bwwz = (bwwz) a3.mo65324a(3, i5, bwwz.class);
                                if (a4 || z3) {
                                    a2 = bwwy.m122385a(bwwz.f161311b);
                                    if (a2 == null) {
                                        a2 = bwwy.ALIGNMENT_UNKNOWN;
                                    }
                                    layoutParams.rowSpec = bjki.m103771a(a2, (bwxf) a3.mo65324a(1, i5, bwxf.class));
                                }
                                if (a4 || z4) {
                                    a = bwwy.m122385a(bwwz.f161312c);
                                    if (a == null) {
                                        a = bwwy.ALIGNMENT_UNKNOWN;
                                    }
                                    layoutParams.columnSpec = bjki.m103771a(a, (bwxf) a3.mo65324a(2, i5, bwxf.class));
                                }
                            }
                        }
                    }
                    z3 = true;
                    if (!a4) {
                    }
                    z4 = true;
                    if (a4) {
                    }
                    bwwz bwwz2 = (bwwz) a3.mo65324a(3, i5, bwwz.class);
                    a2 = bwwy.m122385a(bwwz2.f161311b);
                    if (a2 == null) {
                    }
                    layoutParams.rowSpec = bjki.m103771a(a2, (bwxf) a3.mo65324a(1, i5, bwxf.class));
                    a = bwwy.m122385a(bwwz2.f161312c);
                    if (a == null) {
                    }
                    layoutParams.columnSpec = bjki.m103771a(a, (bwxf) a3.mo65324a(2, i5, bwxf.class));
                }
                view.setLayoutParams(layoutParams);
            }
            super.mo65212a(bjgt, view);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        int i = this.f123040o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 2) {
            bjkg.m103769a(this.f122686k, (FlexboxLayout) view);
        } else if (i2 != 3) {
            super.mo65166b(view);
        } else {
            bjkk bjkk = this.f122686k;
            GridLayout gridLayout = (GridLayout) view;
            bjkp.m103790a(bjkk, gridLayout);
            bjka a = bjkk.f122859d.mo65320b().mo65323a(15);
            if (a != null) {
                int i3 = bjkk.f122860e;
                if (bjkk.mo65338a(a, 1) && a.mo65327a(1, i3)) {
                    gridLayout.setRowCount(a.mo65330c(1, i3));
                }
                if (bjkk.mo65338a(a, 2) && a.mo65327a(2, i3)) {
                    gridLayout.setColumnCount(a.mo65330c(2, i3));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        bxvj bxvj = bwsv.f160917e;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        bwsv bwsv = (bwsv) b;
        int a = bwsu.m122273a(bwsv.f160921c);
        if (a == 0) {
            a = 1;
        }
        this.f123040o = a;
        super.mo65162a(bwxl, bwxl2);
        bxwc bxwc = bwsv.f160920b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bjgv bjgv = this.f122676a;
            mo65160a(bjgv.f122694c.mo65206a(bjgv, (bwxl) bxwc.get(i)));
        }
    }
}
