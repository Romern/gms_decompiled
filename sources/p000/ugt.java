package p000;

import com.google.android.gms.drive.DriveId;

/* renamed from: ugt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugt {

    /* renamed from: a */
    public final uey f47562a;

    /* renamed from: b */
    public final String f47563b;

    /* renamed from: c */
    public final boolean f47564c;

    /* renamed from: d */
    public final DriveId f47565d;

    /* renamed from: e */
    public final long f47566e;

    /* renamed from: f */
    public final String f47567f;

    /* renamed from: g */
    public String f47568g;

    /* renamed from: h */
    public final Integer f47569h;

    /* renamed from: i */
    private final uhn f47570i;

    /* renamed from: j */
    private final uff f47571j;

    /* renamed from: k */
    private final uyy f47572k;

    /* renamed from: l */
    private final long f47573l;

    /* renamed from: m */
    private final ukp f47574m;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    private ugt(String str, uey uey, boolean z, DriveId driveId, long j, String str2, uhn uhn, uff uff, long j2, ukp ukp, String str3, Integer num, uyy uyy) {
        sdo.m34966a((Object) str, (Object) "Null metadata json provided in upload request.");
        this.f47563b = str;
        this.f47562a = uey;
        this.f47564c = z;
        this.f47565d = driveId;
        this.f47566e = j;
        this.f47568g = str2;
        this.f47570i = uhn;
        this.f47571j = uff;
        this.f47573l = j2;
        this.f47574m = ukp;
        this.f47567f = str3;
        this.f47569h = num;
        sdo.m34966a(uyy, "Null MIME type provided in upload request.");
        this.f47572k = uyy;
    }

    /* renamed from: a */
    public static ugt m38373a(ujx ujx, vpu vpu, long j, String str, String str2, boolean z, uey uey, Integer num, uyy uyy) {
        DriveId driveId;
        vpu vpu2 = vpu;
        sdo.m34959a(uyy);
        String i = ujx.mo27616i();
        DriveId driveId2 = null;
        if (z) {
            driveId = null;
        } else {
            if (i != null) {
                driveId2 = ujx.mo27610g();
            }
            driveId = driveId2;
        }
        uhn uhn = vpu2.f49757d;
        ulz e = uhn.mo27438e(j);
        ukp d = uhn.mo27434d(e.f48174a);
        return new ugt(str2, uey, z, driveId, d.f48038f, e.f48176c, uhn, vpu2.f49764k, j, d, str, num, uyy);
    }

    /* renamed from: b */
    public final String mo27350b() {
        return this.f47572k.f48723a;
    }

    /* renamed from: a */
    public final vpz mo27348a() {
        return this.f47571j.mo27284b(this.f47574m.f48033a);
    }

    /* renamed from: a */
    public final void mo27349a(String str) {
        this.f47568g = str;
        ulz e = this.f47570i.mo27438e(this.f47573l);
        e.f48176c = this.f47568g;
        e.mo27725t();
    }
}
