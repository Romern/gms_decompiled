package p000;

import android.app.ActivityManager;
import java.util.concurrent.Callable;

/* renamed from: abiw */
final /* synthetic */ class abiw implements Callable {

    /* renamed from: a */
    private final abjd f57557a;

    /* renamed from: b */
    private final bsmc f57558b;

    /* renamed from: c */
    private final String f57559c;

    public abiw(abjd abjd, bsmc bsmc, String str) {
        this.f57557a = abjd;
        this.f57558b = bsmc;
        this.f57559c = str;
    }

    public final Object call() {
        abjd abjd = this.f57557a;
        bsmc bsmc = this.f57558b;
        String str = this.f57559c;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) abjd.f57571a.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        bslz bslz = bsmc.f144998a;
        if (bslz == null) {
            bslz = bslz.f144984c;
        }
        return abjd.m47787a(bslz).mo6527a(Long.valueOf((j / 1024) / 1024)) ? abjc.m47783c() : abjc.m47781a(str);
    }
}
