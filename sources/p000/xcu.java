package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: xcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcu extends aaab {

    /* renamed from: d */
    private static final Logger f51968d = new Logger(new String[]{"IncrementAndGetCounterOperation"}, (short[]) null);

    /* renamed from: a */
    private final xcm f51969a = ((xcm) xcm.f51937d.mo33309a());

    /* renamed from: b */
    private final xnc f51970b;

    /* renamed from: c */
    private final String f51971c;

    public xcu(xnc xnc, String str) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "IncrementAndGetCounter");
        this.f51970b = xnc;
        this.f51971c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        try {
            String str = this.f51971c;
            bmxy.m108582a(str, "keyStorageIdentifier cannot be null");
            bmxy.m108589a(!str.trim().isEmpty(), "keyStorageIdentifier cannot be empty");
            Logger Logger = f51968d;
            String valueOf = String.valueOf(str);
            Logger.mo25412b(valueOf.length() == 0 ? new String("incrementAndGetCounter with keyStorageIdentifier ") : "incrementAndGetCounter with keyStorageIdentifier ".concat(valueOf), new Object[0]);
            xcm xcm = this.f51969a;
            bmxy.m108582a(str, "identifier cannot be null");
            xcm.f51938e.mo25412b("Incrementing the counter of the registered key", new Object[0]);
            xcl c = xcm.mo29637c(str);
            if (c != null) {
                SQLiteDatabase b = xcm.mo29635b();
                String[] strArr = {str};
                j = c.f51930b + 1;
                ContentValues contentValues = new ContentValues();
                contentValues.put("counter", Long.valueOf(j));
                if (b.update("registered_credentials", contentValues, "id = ?", strArr) != 1) {
                    adbd a = adbe.m50105a();
                    a.f61234c = 8;
                    a.f61232a = "Error incrementing the counter of the key in the SQLite database";
                    throw a.mo33301a();
                }
            } else {
                j = -1;
            }
            this.f51970b.mo29957a(Status.f30107a, j);
        } catch (adbe e) {
            this.f51970b.mo29957a(e.mo33302b(), -1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f51970b.mo29957a(status, -1);
    }
}
