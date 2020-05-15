package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: adfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adfj {

    /* renamed from: a */
    public final String f61558a;

    public adfj(short[][] sArr) {
        this("stopWatchingMode");
    }

    public adfj() {
        this("allowApiAccess");
    }

    /* renamed from: a */
    public Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        return new Bundle();
    }

    public adfj(String str) {
        this.f61558a = str;
    }

    public adfj(byte[] bArr) {
        this("checkAppPackage");
    }

    public adfj(char[] cArr) {
        this("checkOpNoThrow");
    }

    public adfj(float[] fArr) {
        this("noteOpNoThrow");
    }

    public adfj(int[] iArr) {
        this("hasPermission");
    }

    public adfj(short[] sArr) {
        this("packageHasPermission");
    }

    public adfj(boolean[] zArr) {
        this("finishOpNoThrow");
    }

    public adfj(byte[][] bArr) {
        this("queryIntentActivities");
    }

    public adfj(char[][] cArr) {
        this("startOpNoThrow");
    }

    public adfj(int[][] iArr) {
        this("startWatchingMode");
    }
}
