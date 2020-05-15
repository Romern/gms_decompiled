package p000;

import android.util.Log;

/* renamed from: aujp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujp extends auke {

    /* renamed from: a */
    private final auju f91952a = new auju();

    /* renamed from: a */
    public final int mo50597a() {
        return 27521;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        if (length > 1) {
            try {
                if (this.f91952a.mo50601a((String) objArr[0])) {
                    int intValue = ((Integer) objArr[1]).intValue();
                    mo50603a(objArr, 2);
                    bxvd b = auji.mo50591b();
                    bkb bkb = bkb.NOTIFICATION_ITEM_ACTION;
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bzzx bzzx = (bzzx) b.f164949b;
                    bzzx bzzx2 = bzzx.f172237al;
                    bzzx.f172275d = bkb.f4944CA;
                    int i = 2 | bzzx.f172265a;
                    bzzx.f172265a = i;
                    bzzx.f172274c = 4;
                    int i2 = 1 | i;
                    bzzx.f172265a = i2;
                    auju auju = this.f91952a;
                    String str = auju.f91957a;
                    str.getClass();
                    int i3 = i2 | 16;
                    bzzx.f172265a = i3;
                    bzzx.f172277f = str;
                    int i4 = auju.f91958b;
                    int i5 = i3 | 512;
                    bzzx.f172265a = i5;
                    bzzx.f172282k = i4;
                    String str2 = auju.f91959c;
                    str2.getClass();
                    int i6 = i5 | 1024;
                    bzzx.f172265a = i6;
                    bzzx.f172283l = str2;
                    int i7 = i6 | 32;
                    bzzx.f172265a = i7;
                    bzzx.f172278g = intValue;
                    bzzx.f172265a = i7 | 4;
                    bzzx.f172276e = j;
                    mo50602a(b);
                    auji.mo50588a(b);
                } else if (c) {
                    Log.e("NotificationActionClick", "unable to parse key.");
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationActionClick", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("NotificationActionClick", sb.toString());
        }
    }
}
