package p000;

import android.util.Log;

/* renamed from: aujw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujw extends auke {
    /* renamed from: a */
    public final int mo50597a() {
        return 27500;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        boolean c = cgzf.m147724c();
        if (objArr.length > 0) {
            try {
                auji.mo50592b("tron_notification_load", ((Integer) objArr[0]).intValue());
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationPanelRvled", "unexpected operand type: ", e);
                }
            }
        }
        bxvd b = auji.mo50591b();
        bkb bkb = bkb.NOTIFICATION_PANEL;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bzzx bzzx = (bzzx) b.f164949b;
        bzzx bzzx2 = bzzx.f172237al;
        bzzx.f172275d = bkb.f4944CA;
        int i = bzzx.f172265a | 2;
        bzzx.f172265a = i;
        bzzx.f172274c = 1;
        int i2 = i | 1;
        bzzx.f172265a = i2;
        bzzx.f172265a = i2 | 4;
        bzzx.f172276e = j;
        auji.mo50588a(b);
    }
}
