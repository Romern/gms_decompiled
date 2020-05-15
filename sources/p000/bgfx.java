package p000;

/* renamed from: bgfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfx {
    /* renamed from: a */
    public static void m98778a(bfor bfor, int i, long j, boolean z) {
        bfor.mo62047a(new bgfp(bfos.ALARM_RESET, bfor.mo62055b(), i, (int) j, z ^ true ? 1 : 0, i, j, z));
    }

    /* renamed from: b */
    public static void m98784b(bfor bfor, boolean z) {
        bfor.mo62056b(bfos.SCREEN_STATE_CHANGED, z);
    }

    /* renamed from: c */
    public static void m98785c(bfor bfor, boolean z) {
        bfor.mo62053a(bfos.WIFI_STATE_CHANGED, z);
    }

    /* renamed from: d */
    public static void m98786d(bfor bfor, boolean z) {
        bfor.mo62056b(bfos.POWER_SAVE_MODE_CHANGED, z);
    }

    /* renamed from: e */
    public static void m98787e(bfor bfor, boolean z) {
        bfor.mo62056b(bfos.DEEP_IDLE_MODE_CHANGED, z);
    }

    /* renamed from: a */
    public static void m98779a(bfor bfor, bfmn bfmn, int i) {
        long d = bfmn != null ? bfmn.mo61939d() : -1;
        bfor.mo62047a(new bfoq(bfos.CELL_SCAN_RESULTS, bfor.mo62055b(), null, bfmn, (int) (d >> 32), (int) d, i));
    }

    /* renamed from: a */
    public static void m98780a(bfor bfor, bfos bfos, boolean z, int i) {
        bfor.mo62047a(new bfop(bfos, bfor.mo62055b(), "success %2$d, size %3$d", null, z ? 1 : 0, i, -1));
    }

    /* renamed from: a */
    public static void m98781a(bfor bfor, bgjm bgjm) {
        bfor.mo62047a(new bfoq(bfos.GPS_LOCATION, bfor.mo62055b(), null, bgjm, ayuo.m84849b(bgjm.mo62896b()), ayuo.m84849b(bgjm.mo62897c()), Math.round(bgjm.mo62895a())));
    }

    /* renamed from: a */
    public static void m98782a(bfor bfor, boolean z) {
        bfor.mo62053a(bfos.AIRPLANE_MODE_CHANGED, z);
    }

    /* renamed from: a */
    public static void m98783a(bfor bfor, boolean z, boolean z2, int i) {
        bfor.mo62047a(new bgfl(bfos.NETWORK_CHANGED, bfor.mo62055b(), z ? 1 : 0, z2 ? 1 : 0, i, z, z2, i));
    }
}
