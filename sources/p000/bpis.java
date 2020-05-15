package p000;

/* renamed from: bpis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpis implements bxvp {
    FLOW_TYPE_UNKNOWN(0),
    FLOW_TYPE_BUYFLOW(1),
    FLOW_TYPE_INSTRUMENT_MANAGER(2),
    FLOW_TYPE_PURCHASE_MANAGER(3),
    FLOW_TYPE_ADD_INSTRUMENT(4),
    FLOW_TYPE_PAYMENT_METHODS(5),
    FLOW_TYPE_ADDRESS_SELECTOR(6),
    FLOW_TYPE_CUSTOMER_SELECTOR(7),
    FLOW_TYPE_IDENTITY_CREDIT(8),
    FLOW_TYPE_FIX_INSTRUMENT(9),
    FLOW_TYPE_GENERIC_SELECTOR(10),
    FLOW_TYPE_SETUPWIZARD(11),
    FLOW_TYPE_EMBEDDED_LANDING_PAGE(12),
    FLOW_TYPE_TIMELINE_VIEW(13),
    FLOW_TYPE_EMBEDDED_SETTINGS(14),
    FLOW_TYPE_USER_MANAGEMENT(15),
    FLOW_TYPE_INVOICE_SUMMARY(16),
    FLOW_TYPE_STATEMENTS_VIEW(17),
    FLOW_TYPE_BOOTSTRAP_WIDGET(18),
    FLOW_TYPE_WEB_VIEW_WIDGET(19);
    

    /* renamed from: u */
    public final int f137811u;

    private bpis(int i) {
        this.f137811u = i;
    }

    /* renamed from: a */
    public static bpis m111965a(int i) {
        switch (i) {
            case 0:
                return FLOW_TYPE_UNKNOWN;
            case 1:
                return FLOW_TYPE_BUYFLOW;
            case 2:
                return FLOW_TYPE_INSTRUMENT_MANAGER;
            case 3:
                return FLOW_TYPE_PURCHASE_MANAGER;
            case 4:
                return FLOW_TYPE_ADD_INSTRUMENT;
            case 5:
                return FLOW_TYPE_PAYMENT_METHODS;
            case 6:
                return FLOW_TYPE_ADDRESS_SELECTOR;
            case 7:
                return FLOW_TYPE_CUSTOMER_SELECTOR;
            case 8:
                return FLOW_TYPE_IDENTITY_CREDIT;
            case 9:
                return FLOW_TYPE_FIX_INSTRUMENT;
            case 10:
                return FLOW_TYPE_GENERIC_SELECTOR;
            case 11:
                return FLOW_TYPE_SETUPWIZARD;
            case 12:
                return FLOW_TYPE_EMBEDDED_LANDING_PAGE;
            case 13:
                return FLOW_TYPE_TIMELINE_VIEW;
            case 14:
                return FLOW_TYPE_EMBEDDED_SETTINGS;
            case 15:
                return FLOW_TYPE_USER_MANAGEMENT;
            case 16:
                return FLOW_TYPE_INVOICE_SUMMARY;
            case 17:
                return FLOW_TYPE_STATEMENTS_VIEW;
            case 18:
                return FLOW_TYPE_BOOTSTRAP_WIDGET;
            case 19:
                return FLOW_TYPE_WEB_VIEW_WIDGET;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111966b() {
        return bpir.f137789a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137811u;
    }

    public final String toString() {
        return Integer.toString(this.f137811u);
    }
}
