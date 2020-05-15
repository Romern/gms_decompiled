package p000;

import java.io.PrintWriter;
import java.util.Collections;

/* renamed from: bfzd */
final /* synthetic */ class bfzd implements Runnable {

    /* renamed from: a */
    private final bfze f115761a;

    /* renamed from: b */
    private final bfys f115762b;

    public bfzd(bfze bfze, bfys bfys) {
        this.f115761a = bfze;
        this.f115762b = bfys;
    }

    public final void run() {
        String str;
        String str2;
        bfze bfze = this.f115761a;
        bfys bfys = this.f115762b;
        Object obj = bfys.f115740d;
        bfyq bfyq = bfze.f115763b.f115753k;
        PrintWriter printWriter = (PrintWriter) obj;
        printWriter.print("\nDump of CHRE hardware geofencing:");
        int i = bfyq.f115712g;
        StringBuilder sb = new StringBuilder(61);
        sb.append("\n    Class is BlockingChreGeofenceHardware, limit=");
        sb.append(i);
        printWriter.print(sb.toString());
        boolean b = ceub.m138247b();
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("\n    Enabled on this device=");
        sb2.append(b);
        printWriter.print(sb2.toString());
        printWriter.print("\n    Registered geofences:");
        synchronized (bfyq.f115706a) {
            if (bfyq.f115712g <= 0) {
                ((PrintWriter) obj).print("\n    <none>");
            } else {
                for (int i2 = 0; i2 < bfyq.f115706a.size(); i2++) {
                    bfwf bfwf = (bfwf) bfyq.f115706a.get(i2);
                    if (bfwf == null) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("\n        id=");
                        sb3.append(i2);
                        sb3.append(" <unused>");
                        ((PrintWriter) obj).print(sb3.toString());
                    } else if (bfwf == bfyq.f115717l) {
                        Object[] objArr = new Object[7];
                        objArr[0] = Integer.valueOf(((bues) bfyq.f115729y.f164949b).f153639g);
                        double d = (double) ((bues) bfyq.f115729y.f164949b).f153634b;
                        Double.isNaN(d);
                        objArr[1] = Double.valueOf(d / 1.0E7d);
                        double d2 = (double) ((bues) bfyq.f115729y.f164949b).f153635c;
                        Double.isNaN(d2);
                        objArr[2] = Double.valueOf(d2 / 1.0E7d);
                        objArr[3] = Integer.valueOf(((bues) bfyq.f115729y.f164949b).f153636d);
                        objArr[4] = Integer.valueOf(((bues) bfyq.f115729y.f164949b).f153637e);
                        objArr[5] = Integer.valueOf(((bues) bfyq.f115729y.f164949b).f153638f);
                        objArr[6] = Integer.valueOf(((bues) bfyq.f115729y.f164949b).f153641i);
                        String format = String.format("[CIRCLE id:sentinel transitions:%d %f %f %dm, resp=%ds, dwell=%ds] it=%d", objArr);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(format).length() + 34);
                        sb4.append("\n        id=");
                        sb4.append(i2);
                        sb4.append(" <Sentinel>");
                        sb4.append(format);
                        ((PrintWriter) obj).print(sb4.toString());
                    } else {
                        String valueOf = String.valueOf(bfwf);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        sb5.append("\n        id=");
                        sb5.append(i2);
                        sb5.append(" ");
                        sb5.append(valueOf);
                        ((PrintWriter) obj).print(sb5.toString());
                    }
                    if (bfyq.f115722q >= 131072) {
                        bufe bufe = bfyq.f115709d[i2];
                        ((PrintWriter) obj).print(" chreState=");
                        if (bufe == null) {
                            ((PrintWriter) obj).print("null");
                        } else {
                            int a = bufd.m119401a(bufe.f153682b);
                            if (a == 0) {
                                a = 1;
                            }
                            if (a != 1) {
                                str = a != 2 ? a != 3 ? "UNCERTAIN" : "OUTSIDE" : "INSIDE";
                            } else {
                                str = "INITIAL";
                            }
                            int a2 = bufb.m119399a(bufe.f153683c);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            if (a2 != 1) {
                                str2 = a2 != 2 ? a2 != 3 ? "DWELL" : "EXIT" : "ENTER";
                            } else {
                                str2 = "NONE";
                            }
                            int i3 = bufe.f153684d;
                            boolean z = bufe.f153685e;
                            StringBuilder sb6 = new StringBuilder(str.length() + 67 + str2.length());
                            sb6.append("(location=");
                            sb6.append(str);
                            sb6.append(",transition=");
                            sb6.append(str2);
                            sb6.append(",dwellCheckStart=");
                            sb6.append(i3);
                            sb6.append(",hasExited=");
                            sb6.append(z);
                            sb6.append(")");
                            ((PrintWriter) obj).print(sb6.toString());
                        }
                    }
                }
                Collections.sort(bfyq.f115708c);
                String valueOf2 = String.valueOf(bfyq.f115708c);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                sb7.append("\nAvailable slots: ");
                sb7.append(valueOf2);
                ((PrintWriter) obj).print(sb7.toString());
            }
        }
        printWriter.print("\n");
        bfys.mo62449a((Object) null);
    }
}
