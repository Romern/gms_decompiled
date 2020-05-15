package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: agvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum agvg {
    DATA_BALANCE_UPDATES(bszx.GCORE_MSG_TYPE_PLAN_STATUS_UPDATED, "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE", C0126R.string.notification_data_balance_channel, C0126R.string.notification_description_low_balance),
    DATA_OFFERS(bszx.GCORE_MSG_TYPE_UPSELL_OFFER, "com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER", C0126R.string.notification_upsell_channel, C0126R.string.notification_description_upsell_offer),
    ACCOUNT_ALERTS(bszx.GCORE_MSG_TYPE_ACCOUNT_ALERT, "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT", C0126R.string.notification_account_alert_channel, C0126R.string.notification_description_account_alert),
    OUT_OF_DATA(bszx.GCORE_MSG_TYPE_OUT_OF_DATA, "com.google.android.gms.mobiledataplan.NOTIFICATION.OUT_OF_DATA", C0126R.string.notification_out_of_data_channel, C0126R.string.notification_description_out_of_data),
    EXPIRATION_REMINDERS(bszx.GCORE_MSG_TYPE_EXPIRATION_REMINDER, "com.google.android.gms.mobiledataplan.NOTIFICATION.EXPIRATION_REMINDER", C0126R.string.notification_expiration_channel, C0126R.string.notification_description_expiration_reminder),
    ACCOUNT_BALANCE_TOP_UPS(bszx.GCORE_MSG_TYPE_BALANCE_UPDATE, "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_BALANCE_UPDATE", C0126R.string.notification_account_balance_channel, C0126R.string.notification_description_account_balance),
    PURCHASES(bszx.GCORE_MSG_TYPE_PURCHASE, "com.google.android.gms.mobiledataplan.NOTIFICATION.PURCHASE", C0126R.string.notification_purchase_channel, C0126R.string.notification_description_purchase),
    NETWORK_SETUP(bszx.GCORE_MSG_TYPE_SETUP, "com.google.android.gms.mobiledataplan.NOTIFICATION.NETWORK_SETUP", C0126R.string.notification_network_setup_channel, C0126R.string.notification_description_network_setup),
    DAILY_UPDATE(bszx.GCORE_MSG_TYPE_DAILY_UPDATE, "com.google.android.gms.mobiledataplan.NOTIFICATION.DAILY_UPDATE", C0126R.string.notification_daily_update_channel, C0126R.string.notification_description_daily_update),
    PAY_AS_YOU_GO(bszx.GCORE_MSG_TYPE_PAYGO, "com.google.android.gms.mobiledataplan.NOTIFICATION.PAY_AS_YOU_GO", C0126R.string.notification_paygo_channel, C0126R.string.notification_description_paygo),
    OTHER(bszx.GCORE_MSG_TYPE_OTHER, "com.google.android.gms.mobiledataplan.NOTIFICATION.OTHER", C0126R.string.notification_other_channel, C0126R.string.notification_description_other);
    

    /* renamed from: l */
    public final String f66645l;

    /* renamed from: m */
    public final int f66646m;

    /* renamed from: n */
    public final int f66647n;

    /* renamed from: o */
    private final bszx f66648o;

    private agvg(bszx bszx, String str, int i, int i2) {
        this.f66648o = bszx;
        this.f66645l = str;
        this.f66646m = i;
        this.f66647n = i2;
    }

    /* renamed from: a */
    public final boolean mo36129a() {
        boolean z;
        if (!agrq.m55005a(this.f66648o)) {
            return false;
        }
        switch (ordinal()) {
            case 0:
                z = cfnf.f184517a.mo6606a().mo81613A();
                break;
            case 1:
                z = cfnf.f184517a.mo6606a().mo81619G();
                break;
            case 2:
                z = cfnf.f184517a.mo6606a().mo81640g();
                break;
            case 3:
                z = cfnf.f184517a.mo6606a().mo81655v();
                break;
            case 4:
                z = cfnf.f184517a.mo6606a().mo81649p();
                break;
            case 5:
                z = cfnf.f184517a.mo6606a().mo81643j();
                break;
            case 6:
                z = cfnf.f184517a.mo6606a().mo81615C();
                break;
            case 7:
                z = cfnf.f184517a.mo6606a().mo81617E();
                break;
            case 8:
                z = cfnf.f184517a.mo6606a().mo81645l();
                break;
            case 9:
                z = cfnf.f184517a.mo6606a().mo81657x();
                break;
            case 10:
                z = cfnf.f184517a.mo6606a().mo81653t();
                break;
            default:
                return false;
        }
        return z;
    }
}
