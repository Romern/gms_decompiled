package p000;

import android.content.Intent;
import com.google.android.gms.nearby.mediums.BluetoothClassic$ScanningOperation$1;

/* renamed from: aijf */
public final /* synthetic */ class aijf implements Runnable {

    /* renamed from: a */
    private final BluetoothClassic$ScanningOperation$1 f68951a;

    /* renamed from: b */
    private final Intent f68952b;

    /* renamed from: c */
    private final ahoi f68953c;

    public aijf(BluetoothClassic$ScanningOperation$1 bluetoothClassic$ScanningOperation$1, Intent intent, ahoi ahoi) {
        this.f68951a = bluetoothClassic$ScanningOperation$1;
        this.f68952b = intent;
        this.f68953c = ahoi;
    }

    public final void run() {
        BluetoothClassic$ScanningOperation$1 bluetoothClassic$ScanningOperation$1 = this.f68951a;
        Intent intent = this.f68952b;
        ahoi ahoi = this.f68953c;
        aijg aijg = bluetoothClassic$ScanningOperation$1.f80647a;
        aijg.mo37573a(intent, aijg.f68954a, ahoi);
    }
}
