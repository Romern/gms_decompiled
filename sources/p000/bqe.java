package p000;

/* renamed from: bqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqe {
    TIMER_EXPIRED(1001, "Timer Expired"),
    PAYMENT_FAILED(1002, "Payment Failed"),
    NO_SUCH_CARD(1004, "Card not available"),
    PAYMENT_KEY_NOT_AVAILABLE(1005, "Payment Key Not available"),
    INTERNAL_ERROR(1007, "Internal Error"),
    INVALID_CVM(1008, "Invalid CVM"),
    NO_NFC_ADAPTER_FOUND(1009, "NFC Adapter is not found"),
    NFC_ADAPTER_DISABLED(1010, "NFC Adapter is disabled"),
    DECLINED(1011, "Transaction is declined by card"),
    CDCVM_REQUIRED(1012, "Consumer Device CVM is required"),
    NFC_LINK_LOST(1013, "NFC link is lost"),
    UNKNOWN_AID(1014, "AID is unknown"),
    PAYMENT_TERMINATED(1015, "Payment terminated"),
    ERROR_INVALID_INPUT(1016, "Error invalid input"),
    ERROR_STATE(1017, "Error state"),
    DISABLED_CARD(1018, "Disabled card"),
    THRESHOLD_EXCEEDED_1(1019, "Threshold 1 exceeded"),
    THRESHOLD_EXCEEDED_2(1020, "Threshold 2 exceeded");
    

    /* renamed from: s */
    private final int f5362s;

    /* renamed from: t */
    private final String f5363t;

    private bqe(int i, String str) {
        this.f5362s = i;
        this.f5363t = str;
    }

    public final String toString() {
        int i = this.f5362s;
        String str = this.f5363t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
