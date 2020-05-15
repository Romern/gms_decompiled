package p000;

import java.io.PrintWriter;

/* renamed from: bgeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgeg extends bfop {

    /* renamed from: a */
    final /* synthetic */ bfnb f116232a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgeg(bfos bfos, long j, int i, int i2, int i3, bfnb bfnb) {
        super(bfos, j, null, null, i, i2, i3);
        this.f116232a = bfnb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        bfnb bfnb = this.f116232a;
        printWriter.print("NetworkLocation [\n bestResult=");
        bfmz bfmz = bfnb.f114456a;
        if (bfmz == null) {
            printWriter.print("null");
        } else if (bfmz == bfnb.f114457b) {
            printWriter.print("WIFI");
        } else if (bfmz == bfnb.f114458c) {
            printWriter.print("CELL");
        }
        printWriter.print("\n wifiResult=");
        bfns bfns = bfnb.f114457b;
        if (bfns == null) {
            printWriter.print("null");
        } else {
            printWriter.print(bfns.toString());
        }
        printWriter.print("\n cellResult=");
        bfml bfml = bfnb.f114458c;
        StringBuilder sb = new StringBuilder();
        bfml.m97251a(sb, bfml);
        printWriter.print(sb);
        printWriter.print("\n isLowPower=");
        printWriter.print(bfnb.f114459d);
        printWriter.print("\n]");
    }
}
