package p000;

import android.util.Log;

/* renamed from: aujr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujr extends auke {

    /* renamed from: a */
    private final auju f91954a = new auju();

    /* renamed from: a */
    public final int mo50597a() {
        return 27530;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        if (objArr.length > 1) {
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                mo50603a(objArr, 2);
                if (this.f91954a.mo50601a(str)) {
                    bxvd b = auji.mo50591b();
                    bkb bkb = bkb.NOTIFICATION_ITEM;
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bzzx bzzx = (bzzx) b.f164949b;
                    bzzx bzzx2 = bzzx.f172237al;
                    bzzx.f172275d = bkb.f4944CA;
                    int i = bzzx.f172265a | 2;
                    bzzx.f172265a = i;
                    bzzx.f172274c = 5;
                    int i2 = 1 | i;
                    bzzx.f172265a = i2;
                    int i3 = i2 | 32;
                    bzzx.f172265a = i3;
                    bzzx.f172278g = intValue;
                    auju auju = this.f91954a;
                    String str2 = auju.f91957a;
                    str2.getClass();
                    int i4 = i3 | 16;
                    bzzx.f172265a = i4;
                    bzzx.f172277f = str2;
                    int i5 = auju.f91958b;
                    int i6 = i4 | 512;
                    bzzx.f172265a = i6;
                    bzzx.f172282k = i5;
                    String str3 = auju.f91959c;
                    str3.getClass();
                    int i7 = i6 | 1024;
                    bzzx.f172265a = i7;
                    bzzx.f172283l = str3;
                    bzzx.f172265a = i7 | 4;
                    bzzx.f172276e = j;
                    mo50602a(b);
                    auji.mo50588a(b);
                } else if (c) {
                    String valueOf = String.valueOf(str);
                    Log.e("NotificationCanceledPsr", valueOf.length() == 0 ? new String("unable to parse key: ") : "unable to parse key: ".concat(valueOf));
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationCanceledPsr", "unexpected operand type: ", e);
                }
            }
        }
    }
}
