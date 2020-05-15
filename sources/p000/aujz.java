package p000;

import android.util.Log;

/* renamed from: aujz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujz extends auke {
    /* renamed from: a */
    public final int mo50597a() {
        return 2728;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        int i = 2;
        if (length >= 2) {
            try {
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                bxvd b = auji.mo50591b();
                bkb bkb = bkb.SCREEN;
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
                bzzx.f172278g = intValue2;
                if (intValue != 1) {
                    i = 3;
                }
                bzzx.f172274c = i - 1;
                int i4 = i3 | 1;
                bzzx.f172265a = i4;
                bzzx.f172265a = i4 | 4;
                bzzx.f172276e = j;
                auji.mo50588a(b);
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("PowerScreenStateParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("PowerScreenStateParser", sb.toString());
        }
    }
}
