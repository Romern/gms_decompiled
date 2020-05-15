package p000;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: em */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0963em {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m10654a(C0933dj djVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        Cursor a = djVar.mo9112a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                if (!a.moveToNext()) {
                    break;
                }
                arrayList.add(a.getString(0));
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str.startsWith("room_fts_content_sync_")) {
                djVar.mo9115b("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
