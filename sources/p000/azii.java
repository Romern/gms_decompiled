package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.view.View;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import java.util.Map;

/* renamed from: azii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azii extends soa {

    /* renamed from: a */
    final /* synthetic */ View f99473a;

    /* renamed from: b */
    final /* synthetic */ azik f99474b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azii(azik azik, View view) {
        super(9);
        this.f99474b = azik;
        this.f99473a = view;
    }

    public final void run() {
        Map i = this.f99474b.f99481e.mo54596i();
        azcd.m85252a(this.f99474b.getContext());
        ContentResolver contentResolver = this.f99474b.getContext().getContentResolver();
        String str = this.f99474b.f99478b;
        Cursor query = contentResolver.query(DatabaseProvider.m94542f(str), new String[]{"string_id", "string_value"}, "app_id = ?", new String[]{str}, null, null);
        String str2 = null;
        if (query != null) {
            while (true) {
                if (query.moveToNext()) {
                    if (i.get(450) != null && ((long) query.getInt(query.getColumnIndex("string_id"))) == ((Long) i.get(450)).longValue()) {
                        str2 = query.getString(query.getColumnIndex("string_value"));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (query != null) {
            query.close();
        }
        stq.m36309a(new azih(this, str2));
    }
}
