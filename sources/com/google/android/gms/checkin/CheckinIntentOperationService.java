package com.google.android.gms.checkin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckinIntentOperationService extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        if (cdci.m132554t()) {
            qfe qfe = (qfe) qfe.f41114a.mo24026b();
            qfe.f41118d.mo24016a();
            bnre i = qfe.f41119e.listIterator();
            while (i.hasNext()) {
                ((qfu) i.next()).mo24023b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(boolean, android.content.Context):void
     arg types: [int, com.google.android.gms.checkin.CheckinIntentOperationService]
     candidates:
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.SharedPreferences, java.lang.String):long
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.Context, boolean):void
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.SharedPreferences, android.content.Context):void
      aeah.a(aecc, aebu):bqgg
      aebd.a(aecc, aebu):bqgg
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(boolean, android.content.Context):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        CheckinChimeraService.m22346a(this);
        EventLogChimeraService.m22378a(false, (Context) this);
        CheckinChimeraService.m22348a(getBaseContext(), false, 2, false, false, null);
    }
}
