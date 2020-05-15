package p000;

import android.content.ContentProviderOperation;
import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: amwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwa extends amvx {

    /* renamed from: b */
    public static final String[] f76155b = {"sourceid", "_id", "data_version", "data14", "data_sync2", "starred", "data_sync1"};

    /* renamed from: c */
    private final anaz f76156c;

    /* renamed from: d */
    private final amvm f76157d;

    /* renamed from: e */
    private final bmxv f76158e;

    /* renamed from: f */
    private final amwr f76159f;

    public amwa(Cursor cursor, amwr amwr, anaz anaz, amvm amvm, bmxv bmxv) {
        super(cursor);
        this.f76159f = amwr;
        this.f76156c = anaz;
        this.f76157d = amvm;
        this.f76158e = bmxv;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo41464b() {
        byte[] bArr;
        byte[] bArr2;
        int length;
        amig.m62939a();
        while (mo41469d()) {
            this.f76157d.mo41389a();
            long a = this.f76156c.mo41629a();
            String a2 = mo41465a("sourceid");
            long longValue = mo41466b("_id").longValue();
            long longValue2 = mo41466b("data_version").longValue();
            String a3 = mo41465a("data_sync2");
            String a4 = mo41465a("data_sync1");
            this.f76156c.mo41636a(ammz.UPDATE, amjf.PHOTO, true, 1, 1);
            SystemClock.elapsedRealtime();
            try {
                if (amwx.m63593c(a4)) {
                    if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82923N()).booleanValue()) {
                        this.f76156c.mo41636a(ammz.UPDATE, amjf.PHOTO_HIGH_RES, true, 1, 1);
                    }
                    bArr = this.f76159f.mo41502a(a2, 2);
                } else {
                    bArr = this.f76159f.mo41502a(a2, 1);
                }
            } catch (amxy | chuw | gid e) {
                amyg.m63718a(true, amjf.PHOTO, ammz.UPDATE, e, this.f76156c, 1);
                if ((e instanceof amxy) && !Boolean.valueOf(cfvk.f185780a.mo6606a().mo82972aj()).booleanValue()) {
                    bArr = null;
                }
            }
            if (bArr == null || (length = bArr.length) <= 800000) {
                bArr2 = bArr;
            } else {
                amdk.m62659b("FSA2_SyncDownPhotoCursor", "Contact %s photo too large {size=%d bytes}", a2, Integer.valueOf(length));
                this.f76156c.mo41632a(amjf.PHOTO, ammz.UPDATE, "IMAGE_TOO_LARGE", (Exception) null);
                this.f76156c.mo41636a(ammz.UPDATE, amjf.PHOTO, true, 2, 1);
                ((anbh) this.f76156c).f76541a.stats.numIoExceptions++;
                bArr2 = null;
            }
            SystemClock.elapsedRealtime();
            if (bArr2 != null) {
                int length2 = bArr2.length;
            }
            long j = longValue2 + 1;
            ContentProviderOperation.Builder a5 = amvz.m63510a(longValue, longValue2);
            a5.withValue("data_sync1", amwx.m63589a(a4, "REGENERATE_HASH_KEY"));
            long a6 = this.f76156c.mo41629a();
            if (this.f76158e.mo66813a() && ((Boolean) amgb.f74878a.mo41191a()).booleanValue() && a6 == a) {
                ((amxe) this.f76158e.mo66814b()).mo41524e(1);
            }
            return a5.withValue("data15", bArr2).withValue("data_sync3", a3).withValue("data_sync4", Long.valueOf(anau.m63867a(j))).withValue("data_version", Long.valueOf(j));
        }
        return null;
    }
}
