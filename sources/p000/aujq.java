package p000;

import android.util.Log;

/* renamed from: aujq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujq extends auke {

    /* renamed from: a */
    private final auju f91953a = new auju();

    /* renamed from: a */
    public final int mo50597a() {
        return 27532;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        int i;
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        if (length > 3) {
            int i2 = 0;
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                int i3 = 2;
                int intValue2 = ((Integer) objArr[2]).intValue();
                int intValue3 = ((Integer) objArr[3]).intValue();
                if (this.f91953a.mo50601a(str)) {
                    bxvd b = auji.mo50591b();
                    bkb bkb = bkb.NOTIFICATION_ALERT;
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bzzx bzzx = (bzzx) b.f164949b;
                    bzzx bzzx2 = bzzx.f172237al;
                    bzzx.f172275d = bkb.f4944CA;
                    int i4 = bzzx.f172265a | 2;
                    bzzx.f172265a = i4;
                    bzzx.f172274c = 1;
                    int i5 = i4 | 1;
                    bzzx.f172265a = i5;
                    if (intValue == 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (intValue2 != 1) {
                        i3 = 0;
                    }
                    int i6 = i | i3;
                    if (intValue3 == 1) {
                        i2 = 4;
                    }
                    int i7 = i6 | i2;
                    int i8 = i5 | 32;
                    bzzx.f172265a = i8;
                    bzzx.f172278g = i7;
                    auju auju = this.f91953a;
                    String str2 = auju.f91957a;
                    str2.getClass();
                    int i9 = i8 | 16;
                    bzzx.f172265a = i9;
                    bzzx.f172277f = str2;
                    int i10 = auju.f91958b;
                    int i11 = i9 | 512;
                    bzzx.f172265a = i11;
                    bzzx.f172282k = i10;
                    String str3 = auju.f91959c;
                    str3.getClass();
                    int i12 = i11 | 1024;
                    bzzx.f172265a = i12;
                    bzzx.f172283l = str3;
                    bzzx.f172265a = i12 | 4;
                    bzzx.f172276e = j;
                    mo50602a(b);
                    auji.mo50588a(b);
                } else if (c) {
                    String valueOf = String.valueOf(str);
                    Log.e("NotificationAlertParser", valueOf.length() == 0 ? new String("unable to parse key: ") : "unable to parse key: ".concat(valueOf));
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationAlertParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("NotificationAlertParser", sb.toString());
        }
    }
}
