package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: bfhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhd {

    /* renamed from: a */
    public int f113878a = 0;

    /* renamed from: b */
    public int f113879b = 0;

    /* renamed from: c */
    public int f113880c;

    /* renamed from: d */
    public int f113881d;

    /* renamed from: e */
    public int f113882e;

    /* renamed from: f */
    private final boolean f113883f;

    public bfhd(boolean z) {
        this.f113883f = z;
    }

    /* renamed from: a */
    public static int m96750a(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        if (readLine != null) {
            return Integer.parseInt(readLine);
        }
        throw new IOException("missing data");
    }

    /* renamed from: b */
    public static File m96751b(String str) {
        return new File(str, "sessionSummary");
    }

    /* renamed from: a */
    public final synchronized int mo61688a() {
        return this.f113878a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo61689a(int i) {
        this.f113882e = i;
    }

    /* renamed from: b */
    public final synchronized int mo61692b() {
        return this.f113879b;
    }

    /* renamed from: c */
    public final synchronized boolean mo61693c() {
        return this.f113883f;
    }

    public final String toString() {
        int i = this.f113878a;
        int i2 = this.f113880c;
        int i3 = this.f113881d;
        int i4 = this.f113879b;
        boolean z = this.f113883f;
        StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_CARD_NOT_CACHED);
        sb.append("SessionSummary [gpsCount=");
        sb.append(i);
        sb.append(", gpsMeasurementsCount=");
        sb.append(i2);
        sb.append(", gpsNavigationMessagesCount=");
        sb.append(i3);
        sb.append(", wifiScanCount=");
        sb.append(i4);
        sb.append(", forceUpload=");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo61690a(bsax bsax) {
        int j = bsax.mo70138j(4);
        if (j > 0) {
            for (int i = 0; i < j; i++) {
                bsax f = bsax.mo70131f(4, i);
                if (f.mo70137i(9)) {
                    bsax e = f.mo70129e(9);
                    int i2 = this.f113878a;
                    int j2 = e.mo70138j(8);
                    int i3 = 0;
                    for (int i4 = 0; i4 < j2; i4++) {
                        bsax f2 = e.mo70131f(8, i4);
                        if (f2.mo70137i(8)) {
                            if (f2.mo70114b(8) == 0) {
                                i3++;
                            }
                        }
                    }
                    this.f113878a = i2 + i3;
                    this.f113879b += e.mo70138j(7);
                    int i5 = this.f113880c;
                    int j3 = e.mo70138j(19);
                    int i6 = 0;
                    for (int i7 = 0; i7 < j3; i7++) {
                        if (e.mo70131f(19, i7).mo70137i(3)) {
                            i6++;
                        }
                    }
                    this.f113880c = i5 + i6;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo61691a(String str) {
        PrintWriter printWriter = new PrintWriter(m96751b(str));
        printWriter.println(4);
        printWriter.println(this.f113878a);
        printWriter.println(this.f113879b);
        printWriter.println(!this.f113883f ? "0" : "1");
        printWriter.println(this.f113880c);
        printWriter.println(this.f113881d);
        printWriter.println(this.f113882e);
        printWriter.close();
    }
}
