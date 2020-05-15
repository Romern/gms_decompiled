package p000;

import android.database.sqlite.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atgz */
final /* synthetic */ class atgz implements Runnable {

    /* renamed from: a */
    private final athb f90347a;

    /* renamed from: b */
    private final brep f90348b;

    /* renamed from: c */
    private final JSONObject f90349c;

    public atgz(athb athb, brep brep, JSONObject jSONObject) {
        this.f90347a = athb;
        this.f90348b = brep;
        this.f90349c = jSONObject;
    }

    public final void run() {
        String str;
        athb athb = this.f90347a;
        brep brep = this.f90348b;
        JSONObject jSONObject = this.f90349c;
        srn srn = atgf.f90279a;
        try {
            if (!jSONObject.isNull("dynamicCardData")) {
                str = ((JSONObject) jSONObject.get("dynamicCardData")).getString("cardId");
            } else {
                str = jSONObject.getString("cid");
            }
            SQLiteDatabase writableDatabase = athb.mo49978a().getWritableDatabase();
            writableDatabase.beginTransaction();
            writableDatabase.delete("Cards", "cardId = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            brep.mo49932a((Object) null);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("JSON error occurred ");
            sb.append(valueOf);
            sb.toString();
            brep.mo49931a(new bres(atgv.APTEST_JSON_ERROR));
        }
    }
}
