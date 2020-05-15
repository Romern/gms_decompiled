package p000;

import android.util.Log;

/* renamed from: auka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auka extends auke {
    /* renamed from: a */
    public final int mo50597a() {
        return 36004;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        if (length >= 6) {
            try {
                int intValue = ((Integer) objArr[0]).intValue();
                int i = 3;
                int intValue2 = ((Integer) objArr[3]).intValue();
                int intValue3 = ((Integer) objArr[4]).intValue();
                bkb bkb = bkb.LOCKSCREEN;
                if (intValue != 0) {
                    if (intValue2 == 1) {
                        bkb = bkb.BOUNCER;
                    }
                    i = 2;
                }
                bxvd b = auji.mo50591b();
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bzzx bzzx = (bzzx) b.f164949b;
                bzzx bzzx2 = bzzx.f172237al;
                bzzx.f172275d = bkb.f4944CA;
                int i2 = bzzx.f172265a | 2;
                bzzx.f172265a = i2;
                int i3 = i2 | 32;
                bzzx.f172265a = i3;
                bzzx.f172278g = intValue3;
                bzzx.f172274c = i - 1;
                int i4 = i3 | 1;
                bzzx.f172265a = i4;
                bzzx.f172265a = i4 | 4;
                bzzx.f172276e = j;
                auji.mo50588a(b);
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("StatusBarStateParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("StatusBarStateParser", sb.toString());
        }
    }
}
