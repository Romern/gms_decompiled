package p000;

import android.database.Cursor;

/* renamed from: acnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acnb extends acmq implements acmp {

    /* renamed from: a */
    private final Cursor f60215a;

    /* renamed from: b */
    private final acmi f60216b;

    /* renamed from: c */
    private final acmz f60217c = new acmz();

    /* renamed from: d */
    private final int f60218d;

    /* renamed from: e */
    private final int f60219e;

    /* renamed from: f */
    private final int f60220f;

    /* renamed from: g */
    private final int f60221g;

    /* renamed from: h */
    private final int f60222h;

    /* renamed from: i */
    private final int f60223i;

    /* renamed from: j */
    private final int f60224j;

    /* renamed from: k */
    private long f60225k;

    /* renamed from: l */
    private long f60226l;

    /* renamed from: m */
    private boolean f60227m;

    public acnb(Cursor cursor, acmi acmi) {
        sdo.m34959a(cursor);
        this.f60215a = cursor;
        this.f60216b = acmi;
        acmi.f60154c = cursor;
        acmi.f60155d = cursor.getColumnIndex("mimetype");
        this.f60218d = cursor.getColumnIndex("contact_id");
        this.f60224j = cursor.getColumnIndex("lookup");
        this.f60219e = cursor.getColumnIndex("photo_thumb_uri");
        this.f60220f = cursor.getColumnIndex("display_name");
        this.f60221g = cursor.getColumnIndex("phonetic_name");
        this.f60222h = cursor.getColumnIndex("times_contacted");
        this.f60223i = cursor.getColumnIndex("last_time_contacted");
        this.f60225k = -1;
        this.f60227m = true;
    }

    /* renamed from: a */
    public final void mo32887a() {
        this.f60215a.close();
    }

    /* renamed from: b */
    public final long mo32888b() {
        return this.f60226l;
    }

    /* renamed from: c */
    public final boolean mo32889c() {
        return this.f60227m;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo32890d() {
        boolean z;
        acmo acmo = null;
        while (acmo == null) {
            try {
                if (!this.f60215a.moveToNext()) {
                    break;
                }
                this.f60226l += acov.m49640a(this.f60215a);
                long j = this.f60215a.getLong(this.f60218d);
                long j2 = this.f60225k;
                if (j != j2) {
                    if (j2 != -1) {
                        acmo = this.f60217c.mo32900b();
                        try {
                            this.f60217c.mo32899a();
                        } catch (IllegalStateException e) {
                            e = e;
                            acnv.m49544a(e, "moveToNext or getLong threw an exception", new Object[0]);
                            this.f60227m = false;
                            return acmo != null ? acmo : acmo;
                        }
                    }
                    this.f60225k = j;
                    acmz acmz = this.f60217c;
                    acmz.f60214f = j;
                    acmz.f60209a.f60198h = j;
                    acmz.f60209a.f60199i = this.f60215a.getString(this.f60224j);
                    this.f60217c.f60209a.f60200j = this.f60215a.getString(this.f60219e);
                    this.f60217c.f60209a.f60201k = this.f60215a.getString(this.f60220f);
                    this.f60217c.f60209a.f60202l = this.f60215a.getString(this.f60221g);
                    long j3 = this.f60215a.getLong(this.f60222h);
                    acmz acmz2 = this.f60217c;
                    acmz2.f60209a.f60203m = 1 + j3;
                    acmz2.f60210b.f60205a = j3;
                    acmz2.f60210b.f60206b = this.f60215a.getLong(this.f60223i);
                }
                acmi acmi = this.f60216b;
                acmz acmz3 = this.f60217c;
                if (acmi.f60154c != null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34971a(z, (Object) "Cursor must be set");
                aclz aclz = (aclz) acmi.f60152a.get(acmi.f60154c.getString(acmi.f60155d));
                if (aclz != null) {
                    aclz.mo32878a(acmz3, acmi.f60154c);
                }
            } catch (IllegalStateException e2) {
                e = e2;
                acnv.m49544a(e, "moveToNext or getLong threw an exception", new Object[0]);
                this.f60227m = false;
                if (acmo != null) {
                }
            }
        }
        if (acmo != null || !this.f60215a.isAfterLast() || this.f60225k == -1) {
            return acmo;
        }
        acmo b = this.f60217c.mo32900b();
        this.f60217c.mo32899a();
        this.f60225k = -1;
        return b;
    }
}
