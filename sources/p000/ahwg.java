package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.nearby.discovery.fastpair.autotest.AutoTestBroadcastReceiver;

/* renamed from: ahwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwg extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68221a;

    /* renamed from: b */
    final /* synthetic */ AutoTestBroadcastReceiver f68222b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwg(AutoTestBroadcastReceiver autoTestBroadcastReceiver, String str, Intent intent) {
        super(str);
        this.f68222b = autoTestBroadcastReceiver;
        this.f68221a = intent;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void run() {
        char c;
        AutoTestBroadcastReceiver autoTestBroadcastReceiver = this.f68222b;
        Intent intent = this.f68221a;
        autoTestBroadcastReceiver.f80499b.mo72984b();
        if (TextUtils.isEmpty(intent.getAction())) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTestReceiver: Receive unknown intent!");
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairAutoTestReceiver: Received action %s", intent.getAction());
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -2055695898:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1832302012:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_CONSENT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1267455128:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_TEAR_DOWN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 515039796:
                if (action.equals("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_DELETE_LOCAL_CACHE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ((burh) ahgz.m55754a(autoTestBroadcastReceiver.f80500c, burh.class)).mo73035a(true);
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTestReceiver: setAutoTestRunning to true");
            ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairAutoTestReceiver: %s", "fast pair auto tester device UI test supported!");
        } else if (c == 1) {
            ((burh) ahgz.m55754a(autoTestBroadcastReceiver.f80500c, burh.class)).mo73035a(false);
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTestReceiver: setAutoTestRunning to false");
        } else if (c != 2) {
            if (c == 3) {
                autoTestBroadcastReceiver.f80501d = SystemClock.elapsedRealtime();
            }
        } else if (intent.hasExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS")) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairAutoTestReceiver: Delete local cache for auto test subsequence pairing.");
            String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS");
            ((ahst) ahgz.m55754a(autoTestBroadcastReceiver.f80500c, ahst.class)).mo37049c(stringExtra);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                defaultAdapter.getRemoteDevice(stringExtra).removeBond();
            }
        }
    }
}
