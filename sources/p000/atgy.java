package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atgy */
final /* synthetic */ class atgy implements Runnable {

    /* renamed from: a */
    private final athb f90343a;

    /* renamed from: b */
    private final brep f90344b;

    /* renamed from: c */
    private final JSONObject f90345c;

    /* renamed from: d */
    private final boolean f90346d;

    public atgy(athb athb, brep brep, JSONObject jSONObject, boolean z) {
        this.f90343a = athb;
        this.f90344b = brep;
        this.f90345c = jSONObject;
        this.f90346d = z;
    }

    public final void run() {
        String str;
        athb athb = this.f90343a;
        brep brep = this.f90344b;
        JSONObject jSONObject = this.f90345c;
        boolean z = this.f90346d;
        try {
            srn srn = atgf.f90279a;
            JSONObject jSONObject2 = (JSONObject) jSONObject.get("dynamicCardData");
            int i = athb.f90353b;
            int i2 = i - 2;
            if (i != 0) {
                if (i2 == 5) {
                    str = "ID";
                } else if (i2 == 6) {
                    str = "QuicPay";
                } else {
                    String valueOf = String.valueOf(btod.m116977b(i));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Service provider ");
                    sb.append(valueOf);
                    sb.append(" is not supported for this SDK");
                    throw new UnsupportedOperationException(sb.toString());
                }
                bepl bepl = new bepl(str, jSONObject2.getString("cardId"), jSONObject2.getString("displayCardNumber"), jSONObject2.getInt("expirationMonth"), jSONObject2.getInt("expirationYear"), bmvz.f131120a);
                SQLiteDatabase writableDatabase = athb.mo49978a().getWritableDatabase();
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("network", bepl.f111986a);
                contentValues.put("cardId", bepl.f111987b);
                contentValues.put("displayCardNumber", bepl.f111988c);
                contentValues.put("expirationMonth", Integer.valueOf(bepl.f111989d));
                contentValues.put("expirationYear", Integer.valueOf(bepl.f111990e));
                writableDatabase.insert("Cards", null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                String str2 = bepl.f111987b;
                if (z) {
                    athb.mo49978a().mo60899a(str2);
                }
                brep.mo49932a(str2);
                return;
            }
            throw null;
        } catch (JSONException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("JSON error occurred ");
            sb2.append(valueOf2);
            sb2.toString();
            brep.mo49931a(new bres(atgv.APTEST_JSON_ERROR));
        }
    }
}
