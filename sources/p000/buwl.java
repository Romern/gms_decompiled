package p000;

import android.content.Intent;
import com.google.location.nearby.direct.bluetooth.state.BackgroundBleScanner$3;

/* renamed from: buwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwl extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f155149a;

    /* renamed from: b */
    final /* synthetic */ BackgroundBleScanner$3 f155150b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buwl(BackgroundBleScanner$3 backgroundBleScanner$3, String str, Intent intent) {
        super(str);
        this.f155150b = backgroundBleScanner$3;
        this.f155149a = intent;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void run() {
        char c;
        buwo buwo = this.f155150b.f191758a;
        String action = this.f155149a.getAction();
        srn srn = bvcm.f155598a;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -737417248:
                if (action.equals("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 360422632:
                if (action.equals("android.bluetooth.adapter.action.BLE_STATE_CHANGED")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 575967096:
                if (action.equals("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 880469964:
                if (action.equals("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1524764930:
                if (action.equals("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                buwo.f155162i = true;
            case 2:
                buwo.f155161h = true;
                break;
            case 3:
            case 4:
                buwo.f155162i = false;
                buwo.f155161h = false;
                break;
            case 5:
                buwo.mo73183b();
                break;
            case 6:
            case 7:
                break;
            default:
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("buwo", "a", 631, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("BackgroundBleScanner: Unexpected action=%s", action);
                break;
        }
        buwo.mo73185d();
    }
}
