package p000;

import java.io.PrintWriter;

/* renamed from: bgfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgfl extends bfop {

    /* renamed from: a */
    final /* synthetic */ boolean f116354a;

    /* renamed from: b */
    final /* synthetic */ boolean f116355b;

    /* renamed from: c */
    final /* synthetic */ int f116356c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfl(bfos bfos, long j, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        super(bfos, j, null, null, i, i2, i3);
        this.f116354a = z;
        this.f116355b = z2;
        this.f116356c = i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.printf("onWifi: %s, onCellular: %s, wifiNetworkId: %d", Boolean.valueOf(this.f116354a), Boolean.valueOf(this.f116355b), Integer.valueOf(this.f116356c));
    }
}
