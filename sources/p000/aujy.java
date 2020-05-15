package p000;

import android.util.Log;

/* renamed from: aujy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujy extends auke {

    /* renamed from: a */
    private final auju f91961a = new auju();

    /* renamed from: a */
    public final int mo50597a() {
        return 27531;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[Catch:{ ClassCastException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[Catch:{ ClassCastException -> 0x00b9 }] */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        int i;
        if (!auji.mo50594b("disable_old_visibility_logs")) {
            auji.mo50596d("disable_old_visibility_logs");
        }
        boolean c = cgzf.m147724c();
        int length = objArr.length;
        if (length > 1) {
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                int i2 = 2;
                mo50603a(objArr, 2);
                if (length > 5) {
                    Object obj = objArr[5];
                    if (obj instanceof Integer) {
                        i = ((Integer) obj).intValue();
                        if (!this.f91961a.mo50601a(str)) {
                            bxvd b = auji.mo50591b();
                            bkb bkb = bkb.NOTIFICATION_ITEM;
                            if (b.f164950c) {
                                b.mo74035c();
                                b.f164950c = false;
                            }
                            bzzx bzzx = (bzzx) b.f164949b;
                            bzzx bzzx2 = bzzx.f172237al;
                            bzzx.f172275d = bkb.f4944CA;
                            int i3 = bzzx.f172265a | 2;
                            bzzx.f172265a = i3;
                            if (intValue != 1) {
                                i2 = 3;
                            }
                            bzzx.f172274c = i2 - 1;
                            int i4 = 1 | i3;
                            bzzx.f172265a = i4;
                            auju auju = this.f91961a;
                            String str2 = auju.f91957a;
                            str2.getClass();
                            int i5 = i4 | 16;
                            bzzx.f172265a = i5;
                            bzzx.f172277f = str2;
                            int i6 = auju.f91958b;
                            int i7 = i5 | 512;
                            bzzx.f172265a = i7;
                            bzzx.f172282k = i6;
                            String str3 = auju.f91959c;
                            str3.getClass();
                            int i8 = i7 | 1024;
                            bzzx.f172265a = i8;
                            bzzx.f172283l = str3;
                            int i9 = i8 | 8192;
                            bzzx.f172265a = i9;
                            bzzx.f172286o = i;
                            bzzx.f172265a = i9 | 4;
                            bzzx.f172276e = j;
                            mo50602a(b);
                            auji.mo50588a(b);
                            return;
                        } else if (c) {
                            String valueOf = String.valueOf(str);
                            Log.e("NotificationVisParser", valueOf.length() == 0 ? new String("unable to parse key: ") : "unable to parse key: ".concat(valueOf));
                            return;
                        } else {
                            return;
                        }
                    }
                }
                i = 0;
                if (!this.f91961a.mo50601a(str)) {
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationVisParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("NotificationVisParser", sb.toString());
        }
    }
}
