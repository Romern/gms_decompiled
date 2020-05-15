package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import java.io.PrintWriter;

/* renamed from: airo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class airo {

    /* renamed from: a */
    private final ahfk f69568a;

    /* renamed from: b */
    private boolean f69569b;

    /* renamed from: c */
    private ahfj f69570c;

    /* renamed from: g */
    public int f69571g;

    /* renamed from: h */
    public volatile boolean f69572h;

    public airo(int i) {
        this(i, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo37899a(int i) {
        this.f69571g = i;
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37566a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo37568b() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo37901c(int i) {
        mo37566a();
    }

    /* renamed from: d */
    public final String mo37902d() {
        int i = this.f69571g;
        if (i == 1) {
            return "BT_RADIO_OFF";
        }
        if (i == 2) {
            return "BT_RADIO_TOGGLE";
        }
        if (i == 11) {
            return "WIFI_RADIO_OFF";
        }
        if (i == 12) {
            return "WIFI_RADIO_TOGGLE";
        }
        switch (i) {
            case 21:
                return "BT_CLASSIC_ADVERTISING";
            case 22:
                return "BT_CLASSIC_SCANNING";
            case 23:
                return "BT_CLASSIC_CONNECTING";
            case 24:
                return "BT_CLASSIC_CONNECTED";
            default:
                switch (i) {
                    case 31:
                        return "BLE_ADVERTISING";
                    case 32:
                        return "BLE_SERVER_SOCKET_OPENED";
                    case 33:
                        return "BLE_L2CAP_SERVER_SOCKET_OPENED";
                    case 34:
                        return "BLE_ADVERTISEMENT_GATT_SERVER_STARTED";
                    case 35:
                        return "BLE_SCANNING";
                    case 36:
                        return "BLE_FETCH_ADVERTISEMENT";
                    case FelicaException.TYPE_NOT_CLOSED:
                        return "BLE_CONNECTING";
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        return "BLE_CONNECTED";
                    default:
                        switch (i) {
                            case 41:
                                return "WIFI_LAN_ADVERTISING";
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                                return "WIFI_LAN_SCANNING";
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                return "WIFI_LAN_CONNECTING";
                            case FelicaException.TYPE_RESET_FAILED:
                                return "WIFI_LAN_CONNECTED";
                            default:
                                switch (i) {
                                    case 51:
                                        return "WIFI_AWARE_ADVERTISING";
                                    case 52:
                                        return "WIFI_AWARE_SCANNING";
                                    case 53:
                                        return "WIFI_AWARE_CONNECTING";
                                    case 54:
                                        return "WIFI_AWARE_CONNECTED";
                                    default:
                                        switch (i) {
                                            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                                return "WIFI_HOTSPOT_HOSTING_WIFI_DIRECT";
                                            case 62:
                                                return "WIFI_HOTSPOT_HOSTING_LOCAL_ONLY";
                                            case 63:
                                                return "WIFI_HOTSPOT_HOSTING_SOFT_AP";
                                            case 64:
                                                return "WIFI_HOTSPOT_AP_CONNECTED";
                                            case KeyInformation.AES128_DES56:
                                                return "WIFI_HOTSPOT_SOCKET_CONNECTED";
                                            default:
                                                switch (i) {
                                                    case 71:
                                                        return "WIFI_DIRECT_HOST_GROUP";
                                                    case 72:
                                                        return "WIFI_DIRECT_CONNECTING";
                                                    case 73:
                                                        return "WIFI_DIRECT_CONNECTED";
                                                    default:
                                                        return "UNKNOWN";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final synchronized boolean mo37903e() {
        return this.f69569b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return r0;
     */
    /* renamed from: f */
    public final synchronized int mo37904f() {
        int b;
        if (mo37903e()) {
            return 2;
        }
        ahfk ahfk = this.f69568a;
        if (ahfk == null || !ahfk.mo36401b()) {
            if (this.f69568a != null) {
                airn airn = new airn(this, Thread.currentThread());
                this.f69570c = airn;
                this.f69568a.mo36399a(airn);
            }
            b = mo37568b();
            ahfk ahfk2 = this.f69568a;
            if (ahfk2 != null) {
                ahfk2.mo36400b(this.f69570c);
                if (this.f69572h) {
                    Thread.interrupted();
                    this.f69572h = false;
                }
            }
            if (b != 2) {
                if (b == 5) {
                }
            }
            this.f69569b = true;
        } else {
            b = 3;
        }
    }

    public airo(int i, ahfk ahfk) {
        this.f69569b = false;
        this.f69572h = false;
        this.f69571g = i;
        this.f69568a = ahfk;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo37900b(int i) {
        if (mo37903e()) {
            mo37901c(i);
            this.f69569b = false;
        }
    }

    /* renamed from: a */
    public void mo37567a(PrintWriter printWriter) {
        printWriter.write(String.format("  Medium Operation: %s\n", mo37902d()));
        ahfk ahfk = this.f69568a;
        if (ahfk != null) {
            printWriter.write(String.format("  Cancelled: %s\n", Boolean.valueOf(ahfk.mo36401b())));
        }
        printWriter.flush();
    }
}
