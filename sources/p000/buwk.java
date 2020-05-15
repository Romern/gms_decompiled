package p000;

import com.google.android.gms.beacon.BleSighting;

/* renamed from: buwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwk extends buya {

    /* renamed from: a */
    final /* synthetic */ buwo f155148a;

    public buwk(buwo buwo) {
        this.f155148a = buwo;
    }

    /* renamed from: a */
    public final void mo13774a(int i, BleSighting bleSighting) {
        this.f155148a.f155157d.mo72987c(new buwh(this, "BackgroundBleScanner_onScanResult", bleSighting));
    }

    /* renamed from: b */
    public final void mo73176b(int i) {
        this.f155148a.f155157d.mo72987c(new buwj(this, "BackgroundBleScanner_onScanModeUpdate", i));
    }

    /* renamed from: a */
    public final void mo20523a(String str) {
        this.f155148a.f155157d.mo72987c(new buwi(this, "BackgroundBleScanner_onDeviceLost", str));
    }
}
