package p000;

import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aukb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aukb extends auke {
    /* renamed from: a */
    public int mo50597a() {
        return AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean z;
        boolean c = cgzf.m147724c();
        try {
            int i = -1;
            String str = null;
            if (objArr.length > 1) {
                String str2 = (String) objArr[1];
                if (str2.equals("true")) {
                    z = true;
                    i = 1;
                } else if (str2.equals("false")) {
                    z = true;
                    i = 0;
                } else if (!str2.matches("^-?\\d+$")) {
                    str = str2;
                    z = false;
                } else {
                    try {
                        i = Integer.parseInt(str2);
                        z = true;
                    } catch (NumberFormatException e) {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            if (objArr.length > 0) {
                bkb a = bkb.m3247a(((Integer) objArr[0]).intValue());
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
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bzzx bzzx3 = (bzzx) b.f164949b;
                bzzx bzzx4 = bzzx.f172237al;
                bzzx3.f172274c = 4;
                int i2 = 1 | bzzx3.f172265a;
                bzzx3.f172265a = i2;
                int i3 = 4 | i2;
                bzzx3.f172265a = i3;
                bzzx3.f172276e = j;
                if (str != null) {
                    str.getClass();
                    i3 |= 16;
                    bzzx3.f172265a = i3;
                    bzzx3.f172277f = str;
                }
                if (z) {
                    bzzx3.f172265a = i3 | 32;
                    bzzx3.f172278g = i;
                }
                auji.mo50588a(b);
            }
        } catch (ClassCastException e2) {
            if (c) {
                Log.e("SysuiActionParser", "unexpected operand type: ", e2);
            }
        }
    }
}
