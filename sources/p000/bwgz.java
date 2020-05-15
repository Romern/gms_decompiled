package p000;

/* renamed from: bwgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwgz implements bxvp {
    UNKNOWN_FLOW_INSTRUCTION(0),
    CONTINUE_FLOW_WITH_NEW_PAGE(1),
    CONTINUE_FLOW_WITH_CURRENT_PAGE(2),
    CONTINUE_FLOW_WITH_NEXT_WIDGET_AND_SUBMIT_FLOW_IF_WIDGET_IS_CLOSED(23),
    COMPLETE_FLOW_AFTER_DISPLAYING_NEXT_WIDGET(28),
    COMPLETE_FLOW_IMMEDIATELY(3),
    CANCEL_FLOW_IMMEDIATELY(27),
    SUBMIT_FLOW(15),
    COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE(4),
    COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY(12),
    HANDLE_UI_ERROR(5),
    CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY(6),
    CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY_AND_UPDATE_BASE_PAGE(11),
    CLOSE_OVERLAY_AND_CONTINUE_FLOW_IN_MAIN_PAGE(7),
    CLOSE_OVERLAY_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY(8),
    CLOSE_OVERLAY_AND_SUBMIT_MAIN_PAGE(30),
    CONTINUE_FLOW_BY_PARTIALLY_UPDATING_CURRENT_PAGE(10),
    CONTINUE_WITH_PROXY_FLOW(29),
    CONTINUE_FLOW_AND_SEND_CALLBACK_DATA_TO_INTEGRATOR(31),
    CONTINUE_FLOW_WITH_NEW_PAGE_AND_SEND_CALLBACK_DATA_TO_INTEGRATOR(33);
    

    /* renamed from: u */
    public final int f159484u;

    private bwgz(int i) {
        this.f159484u = i;
    }

    /* renamed from: a */
    public static bwgz m121952a(int i) {
        if (i == 15) {
            return SUBMIT_FLOW;
        }
        if (i == 23) {
            return CONTINUE_FLOW_WITH_NEXT_WIDGET_AND_SUBMIT_FLOW_IF_WIDGET_IS_CLOSED;
        }
        if (i == 33) {
            return CONTINUE_FLOW_WITH_NEW_PAGE_AND_SEND_CALLBACK_DATA_TO_INTEGRATOR;
        }
        switch (i) {
            case 0:
                return UNKNOWN_FLOW_INSTRUCTION;
            case 1:
                return CONTINUE_FLOW_WITH_NEW_PAGE;
            case 2:
                return CONTINUE_FLOW_WITH_CURRENT_PAGE;
            case 3:
                return COMPLETE_FLOW_IMMEDIATELY;
            case 4:
                return COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE;
            case 5:
                return HANDLE_UI_ERROR;
            case 6:
                return CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY;
            case 7:
                return CLOSE_OVERLAY_AND_CONTINUE_FLOW_IN_MAIN_PAGE;
            case 8:
                return CLOSE_OVERLAY_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY;
            default:
                switch (i) {
                    case 10:
                        return CONTINUE_FLOW_BY_PARTIALLY_UPDATING_CURRENT_PAGE;
                    case 11:
                        return CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY_AND_UPDATE_BASE_PAGE;
                    case 12:
                        return COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY;
                    default:
                        switch (i) {
                            case 27:
                                return CANCEL_FLOW_IMMEDIATELY;
                            case 28:
                                return COMPLETE_FLOW_AFTER_DISPLAYING_NEXT_WIDGET;
                            case 29:
                                return CONTINUE_WITH_PROXY_FLOW;
                            case 30:
                                return CLOSE_OVERLAY_AND_SUBMIT_MAIN_PAGE;
                            case 31:
                                return CONTINUE_FLOW_AND_SEND_CALLBACK_DATA_TO_INTEGRATOR;
                            default:
                                return null;
                        }
                }
        }
    }

    /* renamed from: b */
    public static bxvr m121953b() {
        return bwgy.f159462a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f159484u;
    }

    public final String toString() {
        return Integer.toString(this.f159484u);
    }
}
