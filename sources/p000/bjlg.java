package p000;

import android.os.Bundle;
import java.util.List;
import java.util.Locale;

/* renamed from: bjlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlg extends bjhy {
    public bjlg(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bwmx bwmx;
        bwmu bwmu;
        bwmw bwmw;
        bxvj bxvj = bwna.f160332e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwna.f160332e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwna bwna = (bwna) b;
            int a = bwmz.m122122a(bwna.f160336c);
            int i = 0;
            int i2 = 1;
            if (a != 0 && a == 2) {
                if (bwna.f160334a == 2) {
                    bwmx = (bwmx) bwna.f160335b;
                } else {
                    bwmx = bwmx.f160326c;
                }
                int i3 = bwmx.f160328a;
                if (i3 == 0) {
                    i = 3;
                } else if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                }
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i4 == 0) {
                    bjlh bjlh = (bjlh) ((bjhy) this).f122754m;
                    if (i3 == 1) {
                        bwmu = bwmu.m122115a(((Integer) bwmx.f160329b).intValue());
                        if (bwmu == null) {
                            bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
                        }
                    } else {
                        bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
                    }
                    bjlh.mo65365a(bwmu, (bjgf) null);
                } else if (i4 == 1) {
                    bjlh bjlh2 = (bjlh) ((bjhy) this).f122754m;
                    if (i3 == 2) {
                        bwmw = (bwmw) bwmx.f160329b;
                    } else {
                        bwmw = bwmw.f160323c;
                    }
                    bjlh2.mo65366a((List) new bxvv(bwmw.f160325a, bwmw.f160322b));
                } else if (i4 == 2) {
                    mo65114b("ResultingAction with type NewValue does not contain new value");
                }
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwmz.m122122a(bwna.f160336c);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                mo65114b(String.format(locale, "Unsupported ResultingAction: %s", objArr));
            }
        } else {
            super.mo65103a(bwoq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjlh bjlh = (bjlh) ((bjhy) this).f122754m;
        return bjlh == null ? new bjlh() : bjlh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        bwmu bwmu;
        bxvj bxvj = bwmn.f160290f;
        bwoi.mo74135a(bxvj);
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return super.mo65110a(bwoi);
        }
        bxvj bxvj2 = bwmn.f160290f;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        bwmn bwmn = (bwmn) b;
        int a = bwmm.m122106a(bwmn.f160295d);
        int i = 1;
        if (a != 0 && a == 2) {
            bwmu bwmu2 = ((bjlh) ((bjhy) this).f122754m).f122925d;
            if (bwmn.f160293b == 2) {
                bwmu = bwmu.m122115a(((Integer) bwmn.f160294c).intValue());
                if (bwmu == null) {
                    bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
                }
            } else {
                bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
            }
            if (bwmu2 != bwmu) {
                return false;
            }
            return true;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int a2 = bwmm.m122106a(bwmn.f160295d);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = Integer.valueOf(i - 1);
        mo65114b(String.format(locale, "Unknown BottomSheetCondition type: %s", objArr));
        return false;
    }
}
