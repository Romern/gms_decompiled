package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: azao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azao extends aaab {

    /* renamed from: a */
    private final String f98859a;

    /* renamed from: b */
    private final String f98860b;

    /* renamed from: c */
    private final azph f98861c;

    /* renamed from: d */
    private final fzt f98862d;

    public azao(fzt fzt, String str, String str2, azph azph) {
        super(146, "MarkMessagesAsImported");
        this.f98862d = fzt;
        this.f98859a = str2;
        this.f98860b = str;
        this.f98861c = azph;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        SQLiteDatabase writableDatabase;
        String a = azdl.m85412a(context).mo54738a();
        Object[] objArr = {this.f98859a, a};
        try {
            if (TextUtils.isEmpty(this.f98860b) || TextUtils.isEmpty(this.f98859a)) {
                fzt fzt = this.f98862d;
                String str = this.f98860b;
                String str2 = this.f98859a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Invalid packageName=");
                sb.append(str);
                sb.append(" or sessionId=");
                sb.append(str2);
                fzt.mo11566a(new Status(8, sb.toString()));
                this.f98861c.mo55147a(427, this.f98860b);
                return;
            }
            String[] split = this.f98859a.split(":");
            if (split.length != 2 || !TextUtils.equals(split[0], a)) {
                fzt fzt2 = this.f98862d;
                String valueOf = String.valueOf(this.f98859a);
                fzt2.mo11566a(new Status(8, valueOf.length() == 0 ? new String("Invalid sessionId=") : "Invalid sessionId=".concat(valueOf)));
                this.f98861c.mo55147a(427, this.f98860b);
                return;
            }
            long parseLong = Long.parseLong(split[1]);
            long y = cfeo.m138894y() + parseLong;
            writableDatabase = azcl.m85289a(context).getWritableDatabase();
            writableDatabase.beginTransaction();
            writableDatabase.delete("messages", "timestamp_ms BETWEEN ? AND ?", new String[]{String.valueOf(parseLong), String.valueOf(y)});
            this.f98862d.mo11566a(Status.f30107a);
            this.f98861c.mo55147a(426, this.f98860b);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            azcm.m85300a(context).mo54660c();
        } catch (SQLiteException e) {
        } catch (RemoteException e2) {
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        try {
            this.f98862d.mo11566a(Status.f30109c);
            this.f98861c.mo55147a(427, this.f98860b);
        } catch (RemoteException e) {
        }
    }
}
