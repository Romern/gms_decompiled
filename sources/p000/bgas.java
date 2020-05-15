package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.internal.LocationHistoryUpgradeNotificationIntentOperation;

/* renamed from: bgas */
public final /* synthetic */ class bgas implements aubw {

    /* renamed from: a */
    private final LocationHistoryUpgradeNotificationIntentOperation f115930a;

    /* renamed from: b */
    private final Account f115931b;

    /* renamed from: c */
    private final Context f115932c;

    public bgas(LocationHistoryUpgradeNotificationIntentOperation locationHistoryUpgradeNotificationIntentOperation, Account account, Context context) {
        this.f115930a = locationHistoryUpgradeNotificationIntentOperation;
        this.f115931b = account;
        this.f115932c = context;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        this.f115930a.mo70876a(this.f115931b, this.f115932c, (ReportingState) obj);
    }
}
