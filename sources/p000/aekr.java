package p000;

import com.google.android.gms.location.persistent.LocationPersistentChimeraService;

/* renamed from: aekr */
public final /* synthetic */ class aekr implements Runnable {

    /* renamed from: a */
    private final LocationPersistentChimeraService f63473a;

    /* renamed from: b */
    private final String f63474b;

    /* renamed from: c */
    private final aeks f63475c;

    public aekr(LocationPersistentChimeraService locationPersistentChimeraService, String str, aeks aeks) {
        this.f63473a = locationPersistentChimeraService;
        this.f63474b = str;
        this.f63475c = aeks;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = (p000.aeks) r0.f79448b.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1.mo34270a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2.mo34271a(r0);
     */
    public final void run() {
        LocationPersistentChimeraService locationPersistentChimeraService = this.f63473a;
        String str = this.f63474b;
        aeks aeks = this.f63475c;
        synchronized (LocationPersistentChimeraService.class) {
            if (LocationPersistentChimeraService.f79447a.get() != locationPersistentChimeraService) {
            }
        }
    }
}
