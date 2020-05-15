package p000;

import java.io.PrintWriter;

/* renamed from: bfxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxd extends bfwz {

    /* renamed from: c */
    private final boolean f115577c;

    /* renamed from: d */
    private final String f115578d;

    public bfxd(int i, boolean z, String str) {
        super(i);
        this.f115577c = z;
        this.f115578d = str;
    }

    /* renamed from: a */
    public final void mo62393a(PrintWriter printWriter) {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = mo62409a();
        objArr[1] = Integer.valueOf(this.f115567a);
        objArr[2] = this.f115578d;
        if (!this.f115577c) {
            str = "disconnected";
        } else {
            str = "connected";
        }
        objArr[3] = str;
        printWriter.printf("%s WifiConnectionChanged(%08x): %s %s%n", objArr);
    }
}
