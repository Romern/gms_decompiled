package p000;

import android.content.ContentValues;
import android.database.SQLException;

/* renamed from: bdtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdtm {

    /* renamed from: a */
    public final bmxv f106418a;

    /* renamed from: b */
    public final bngx f106419b;

    /* renamed from: c */
    final /* synthetic */ bdtn f106420c;

    /* renamed from: d */
    private final long f106421d;

    public bdtm(bdtn bdtn, bmxv bmxv, bngx bngx, long j) {
        this.f106420c = bdtn;
        this.f106418a = bmxv;
        this.f106419b = bngx;
        this.f106421d = j;
    }

    /* renamed from: a */
    public final void mo58353a(bmxv bmxv) {
        bmxy.m108600b(this.f106420c.f106424c.isOpen());
        try {
            this.f106420c.f106424c.beginTransaction();
            if (!this.f106419b.isEmpty()) {
                this.f106420c.mo58354a(this.f106421d);
            }
            this.f106420c.f106424c.delete("continuation_token", null, null);
            if (bmxv.mo66813a()) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("token", ((bxtx) bmxv.mo66814b()).mo73780k());
                this.f106420c.f106424c.insertOrThrow("continuation_token", null, contentValues);
            }
            this.f106420c.f106424c.setTransactionSuccessful();
            this.f106420c.f106424c.endTransaction();
        } catch (SQLException e) {
            throw new bdvx(e);
        } catch (Throwable th) {
            this.f106420c.f106424c.endTransaction();
            throw th;
        }
    }
}
