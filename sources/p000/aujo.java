package p000;

import android.util.Log;

/* renamed from: aujo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujo extends auke {

    /* renamed from: a */
    public static final bkb[] f91951a = {bkb.VIEW_UNKNOWN, bkb.ACTION_LS_UNLOCK, bkb.ACTION_LS_SHADE, bkb.ACTION_LS_HINT, bkb.ACTION_LS_CAMERA, bkb.ACTION_LS_DIALER, bkb.ACTION_LS_LOCK, bkb.ACTION_LS_NOTE, bkb.ACTION_LS_QS, bkb.ACTION_SHADE_QS_PULL, bkb.ACTION_SHADE_QS_TAP};

    /* renamed from: a */
    public final int mo50597a() {
        return 36021;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        if (objArr.length > 0) {
            try {
                int intValue = ((Integer) objArr[0]).intValue();
                bkb bkb = bkb.VIEW_UNKNOWN;
                if (intValue < f91951a.length) {
                    bkb = f91951a[intValue];
                }
                if (bkb != bkb.VIEW_UNKNOWN) {
                    bxvd b = auji.mo50591b();
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bzzx bzzx = (bzzx) b.f164949b;
                    bzzx bzzx2 = bzzx.f172237al;
                    bzzx.f172275d = bkb.f4944CA;
                    int i = bzzx.f172265a | 2;
                    bzzx.f172265a = i;
                    bzzx.f172274c = 4;
                    int i2 = i | 1;
                    bzzx.f172265a = i2;
                    bzzx.f172265a = i2 | 4;
                    bzzx.f172276e = j;
                    auji.mo50588a(b);
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("LockscreenGestureParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: 0");
            Log.w("LockscreenGestureParser", sb.toString());
        }
    }
}
