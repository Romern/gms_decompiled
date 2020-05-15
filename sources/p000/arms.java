package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.Build;

/* renamed from: arms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arms {

    /* renamed from: a */
    private final Context f87931a;

    /* renamed from: b */
    private final bxvd f87932b = bouw.f134960h.mo74144da();

    public arms(Context context) {
        bmxy.m108581a(context);
        this.f87931a = context;
    }

    /* renamed from: a */
    public final bouw mo48675a() {
        return (bouw) this.f87932b.mo74062i();
    }

    /* renamed from: b */
    public final void mo48676b() {
        ascy ascy;
        PackageManager packageManager = this.f87931a.getPackageManager();
        ascv a = ascv.m73797a();
        if (a == null) {
            bxvd bxvd = this.f87932b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bouw bouw = (bouw) bxvd.f164949b;
            bouw bouw2 = bouw.f134960h;
            bouw.f134963b = 1;
            bouw.f134962a |= 1;
            bxvd bxvd2 = this.f87932b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bouw bouw3 = (bouw) bxvd2.f164949b;
            bouw3.f134964c = 1;
            bouw3.f134962a |= 2;
        } else if (a.mo49047b()) {
            bxvd bxvd3 = this.f87932b;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bouw bouw4 = (bouw) bxvd3.f164949b;
            bouw bouw5 = bouw.f134960h;
            bouw4.f134963b = 3;
            bouw4.f134962a |= 1;
        } else {
            bxvd bxvd4 = this.f87932b;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bouw bouw6 = (bouw) bxvd4.f164949b;
            bouw bouw7 = bouw.f134960h;
            bouw6.f134963b = 2;
            bouw6.f134962a |= 1;
        }
        if (a != null) {
            if (!packageManager.hasSystemFeature("android.hardware.bluetooth_le")) {
                bxvd bxvd5 = this.f87932b;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bouw bouw8 = (bouw) bxvd5.f164949b;
                bouw8.f134964c = 1;
                bouw8.f134962a |= 2;
            } else if (a.mo49047b()) {
                bxvd bxvd6 = this.f87932b;
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                bouw bouw9 = (bouw) bxvd6.f164949b;
                bouw9.f134964c = 3;
                bouw9.f134962a |= 2;
            } else {
                bxvd bxvd7 = this.f87932b;
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                bouw bouw10 = (bouw) bxvd7.f164949b;
                bouw10.f134964c = 2;
                bouw10.f134962a |= 2;
            }
        }
        Context context = this.f87931a;
        aqxm.m72204e();
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            ascy = new ascy(defaultAdapter);
        } else {
            ascy = null;
        }
        if (ascy == null) {
            bxvd bxvd8 = this.f87932b;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bouw bouw11 = (bouw) bxvd8.f164949b;
            bouw11.f134965d = 1;
            bouw11.f134962a |= 4;
        } else if (ascy.f88719a.isEnabled()) {
            bxvd bxvd9 = this.f87932b;
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            bouw bouw12 = (bouw) bxvd9.f164949b;
            bouw12.f134965d = 3;
            bouw12.f134962a |= 4;
        } else {
            bxvd bxvd10 = this.f87932b;
            if (bxvd10.f164950c) {
                bxvd10.mo74035c();
                bxvd10.f164950c = false;
            }
            bouw bouw13 = (bouw) bxvd10.f164949b;
            bouw13.f134965d = 2;
            bouw13.f134962a |= 4;
        }
        WifiManager wifiManager = (WifiManager) this.f87931a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            bxvd bxvd11 = this.f87932b;
            if (bxvd11.f164950c) {
                bxvd11.mo74035c();
                bxvd11.f164950c = false;
            }
            bouw bouw14 = (bouw) bxvd11.f164949b;
            bouw14.f134966e = 1;
            bouw14.f134962a |= 8;
        } else if (wifiManager.isWifiEnabled()) {
            bxvd bxvd12 = this.f87932b;
            if (bxvd12.f164950c) {
                bxvd12.mo74035c();
                bxvd12.f164950c = false;
            }
            bouw bouw15 = (bouw) bxvd12.f164949b;
            bouw15.f134966e = 3;
            bouw15.f134962a |= 8;
        } else {
            bxvd bxvd13 = this.f87932b;
            if (bxvd13.f164950c) {
                bxvd13.mo74035c();
                bxvd13.f164950c = false;
            }
            bouw bouw16 = (bouw) bxvd13.f164949b;
            bouw16.f134966e = 2;
            bouw16.f134962a |= 8;
        }
        int i = Build.VERSION.SDK_INT;
        FingerprintManager fingerprintManager = (FingerprintManager) this.f87931a.getSystemService("fingerprint");
        if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
            bxvd bxvd14 = this.f87932b;
            if (bxvd14.f164950c) {
                bxvd14.mo74035c();
                bxvd14.f164950c = false;
            }
            bouw bouw17 = (bouw) bxvd14.f164949b;
            bouw17.f134968g = 1;
            bouw17.f134962a |= 32;
        } else if (fingerprintManager.hasEnrolledFingerprints()) {
            bxvd bxvd15 = this.f87932b;
            if (bxvd15.f164950c) {
                bxvd15.mo74035c();
                bxvd15.f164950c = false;
            }
            bouw bouw18 = (bouw) bxvd15.f164949b;
            bouw18.f134968g = 3;
            bouw18.f134962a |= 32;
        } else {
            bxvd bxvd16 = this.f87932b;
            if (bxvd16.f164950c) {
                bxvd16.mo74035c();
                bxvd16.f164950c = false;
            }
            bouw bouw19 = (bouw) bxvd16.f164949b;
            bouw19.f134968g = 2;
            bouw19.f134962a |= 32;
        }
        LocationManager locationManager = (LocationManager) this.f87931a.getSystemService("location");
        if (locationManager == null) {
            bxvd bxvd17 = this.f87932b;
            if (bxvd17.f164950c) {
                bxvd17.mo74035c();
                bxvd17.f164950c = false;
            }
            bouw bouw20 = (bouw) bxvd17.f164949b;
            bouw20.f134967f = 1;
            bouw20.f134962a |= 16;
        } else if (locationManager.isProviderEnabled("gps")) {
            bxvd bxvd18 = this.f87932b;
            if (bxvd18.f164950c) {
                bxvd18.mo74035c();
                bxvd18.f164950c = false;
            }
            bouw bouw21 = (bouw) bxvd18.f164949b;
            bouw21.f134967f = 4;
            bouw21.f134962a |= 16;
        } else if (locationManager.isProviderEnabled("network")) {
            bxvd bxvd19 = this.f87932b;
            if (bxvd19.f164950c) {
                bxvd19.mo74035c();
                bxvd19.f164950c = false;
            }
            bouw bouw22 = (bouw) bxvd19.f164949b;
            bouw22.f134967f = 3;
            bouw22.f134962a |= 16;
        } else {
            bxvd bxvd20 = this.f87932b;
            if (bxvd20.f164950c) {
                bxvd20.mo74035c();
                bxvd20.f164950c = false;
            }
            bouw bouw23 = (bouw) bxvd20.f164949b;
            bouw23.f134967f = 2;
            bouw23.f134962a |= 16;
        }
    }
}
