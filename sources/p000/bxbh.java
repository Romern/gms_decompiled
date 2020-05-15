package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

/* renamed from: bxbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbh {
    /* renamed from: a */
    public static Location m122518a(Intent intent) {
        return (Location) intent.getParcelableExtra("location");
    }

    /* renamed from: a */
    public static String m122519a(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getString("networkLocationType");
        }
        return null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m122520a(Location location, boolean z) {
        char c;
        if (location != null) {
            Bundle extras = location.getExtras();
            Bundle bundle = new Bundle();
            boolean z2 = !z;
            for (String str : extras.keySet()) {
                switch (str.hashCode()) {
                    case -1999896571:
                        if (str.equals("locationSubtype")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1769498147:
                        if (str.equals("networkLocationType")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1340647630:
                        if (str.equals("wifiScan")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -83901198:
                        if (str.equals("newWifiScan")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1924902543:
                        if (str.equals("verticalAccuracy")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c == 3) {
                                bundle.putString("networkLocationType", extras.getString("networkLocationType"));
                            } else if (c == 4 && z2) {
                                bundle.putInt("locationSubtype", extras.getInt("locationSubtype"));
                            }
                        } else if (z2) {
                            bundle.putFloat("verticalAccuracy", extras.getFloat("verticalAccuracy"));
                        }
                    } else if (z2) {
                        bundle.putByteArray("wifiScan", extras.getByteArray("wifiScan"));
                    }
                } else if (z2) {
                    bundle.putByteArray("newWifiScan", extras.getByteArray("newWifiScan"));
                }
            }
            location.setExtras(bundle);
        }
    }
}
