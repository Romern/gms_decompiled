package p000;

import android.bluetooth.le.ScanResult;

/* renamed from: ahwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahwy extends buqn {

    /* renamed from: a */
    final /* synthetic */ ahyw f68267a;

    /* renamed from: b */
    final /* synthetic */ ScanResult f68268b;

    /* renamed from: c */
    final /* synthetic */ ahxa f68269c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwy(ahxa ahxa, String str, ahyw ahyw, ScanResult scanResult) {
        super(str);
        this.f68269c = ahxa;
        this.f68267a = ahyw;
        this.f68268b = scanResult;
    }

    public final void run() {
        this.f68269c.mo37251a(this.f68267a, this.f68268b);
    }
}
