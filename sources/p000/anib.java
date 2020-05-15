package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

/* renamed from: anib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anib extends angu {

    /* renamed from: a */
    private final angj f76922a;

    /* renamed from: b */
    private final byte[] f76923b;

    /* renamed from: c */
    private final cahw f76924c = ((cahw) cahz.f174610h.mo74144da());

    public anib(angj angj, byte[] bArr) {
        super("SetDogfoodsTokenOperationCall", caif.SET_DOGFOODS_TOKEN);
        sdo.m34959a(angj);
        this.f76922a = angj;
        this.f76923b = bArr;
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        return null;
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: c */
    public final cahz mo41830c() {
        return (cahz) this.f76924c.mo74062i();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76922a.mo41796f(status);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", (Integer) 0);
            contentValues.put("token", this.f76923b);
            writableDatabase.insertWithOnConflict("DogfoodsToken", null, contentValues, 5);
            writableDatabase.setTransactionSuccessful();
            try {
                HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = new HeterodyneSyncTaskChimeraService();
                heterodyneSyncTaskChimeraService.mo46523a(context);
                heterodyneSyncTaskChimeraService.mo46522a(10, null, this.f76924c, "Mobdog");
                this.f76922a.mo41796f(Status.f30107a);
            } catch (Exception e) {
                throw new anfy(29504, "Sync failed", e);
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
