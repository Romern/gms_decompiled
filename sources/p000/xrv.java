package p000;

/* renamed from: xrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum xrv {
    MULTI_TRANSPORT("multiple_transports"),
    NFC("nfc_instructions"),
    NFC_ENABLE("nfc_enable"),
    BLE("ble_instructions"),
    BLE_ENABLE("ble_enable"),
    BLE_PAIR("ble_pair_device"),
    BLE_PROCESS_REQUEST("ble_processing"),
    BLE_SELECT("ble_select_device"),
    USB("usb_instructions"),
    INTERNAL_TRANSPORT_USER_SELECTED("internal_transport_user_selected"),
    INTERNAL_TRANSPORT_CHALLENGE("internal_transport_challenge"),
    INTERNAL_TRANSPORT_CHALLENGE_COMPLETED("internal_transport_challenge_completed"),
    REQUEST_VALIDATION("request_validation");
    

    /* renamed from: n */
    public final String f53000n;

    private xrv(String str) {
        this.f53000n = str;
    }

    public final String toString() {
        return this.f53000n;
    }
}
