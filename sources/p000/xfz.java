package p000;

import android.content.Context;
import android.database.Cursor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: xfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfz {

    /* renamed from: a */
    public static final adcb f52155a = adca.m50151b(xfx.f52153a);

    /* renamed from: c */
    public static final Logger f52156c = new Logger(new String[]{"PreferredTransportDataStore"}, (short[]) null);

    /* renamed from: b */
    public final xwt f52157b;

    public xfz(Context context) {
        this.f52157b = xwt.m43582a(context);
    }

    /* renamed from: b */
    public static DateFormat m42843b() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
    }

    /* renamed from: a */
    public final bmxv mo29713a() {
        Cursor query = this.f52157b.getReadableDatabase().query("successful_ceremony_metadata", null, null, null, null, null, "usage_timestamp DESC");
        bmxv bmxv = bmvz.f131120a;
        try {
            if (query.moveToFirst()) {
                bmxv = bmxv.m108566b(new xfy(query).f52154a);
            }
        } catch (ParseException | xhk e) {
            f52156c.mo25414c("getting preferred transport failed due to database read failure.", new Object[0]);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        return bmxv;
    }

    /* renamed from: a */
    public final bmxv mo29714a(String str, byte[] bArr) {
        Cursor query = this.f52157b.getReadableDatabase().query("successful_ceremony_metadata", null, "rp_id = ? AND key_handle =  ?", new String[]{str, boan.f132470d.mo68794a(bArr)}, null, null, "usage_timestamp DESC");
        bmxv bmxv = bmvz.f131120a;
        try {
            if (query.moveToFirst()) {
                bmxv = bmxv.m108566b(new xfy(query).f52154a);
            }
        } catch (ParseException | xhk e) {
            f52156c.mo25414c("getting preferred transport failed due to database read failure.", new Object[0]);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        return bmxv;
    }
}
