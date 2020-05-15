package p000;

import android.util.Log;

/* renamed from: aukd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukd extends auke {
    /* renamed from: a */
    public final int mo50597a() {
        return 524287;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        int i = 2;
        if (length >= 2) {
            try {
                bkb a = bkb.m3247a(((Integer) objArr[0]).intValue());
                int intValue = ((Integer) objArr[1]).intValue();
                bxvd b = auji.mo50591b();
                if (a != null) {
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bzzx bzzx = (bzzx) b.f164949b;
                    bzzx bzzx2 = bzzx.f172237al;
                    bzzx.f172275d = a.f4944CA;
                    bzzx.f172265a |= 2;
                }
                if (intValue == 0) {
                    i = 3;
                }
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bzzx bzzx3 = (bzzx) b.f164949b;
                bzzx bzzx4 = bzzx.f172237al;
                bzzx3.f172274c = i - 1;
                int i2 = bzzx3.f172265a | 1;
                bzzx3.f172265a = i2;
                bzzx3.f172265a = i2 | 4;
                bzzx3.f172276e = j;
                auji.mo50588a(b);
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("SysuiViewVisParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("SysuiViewVisParser", sb.toString());
        }
    }
}
