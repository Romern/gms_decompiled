package p000;

import android.content.ContentValues;
import android.content.Context;

/* renamed from: azgm */
public final /* synthetic */ class azgm implements Runnable {

    /* renamed from: a */
    private final String f99280a;

    /* renamed from: b */
    private final Context f99281b;

    /* renamed from: c */
    private final String f99282c;

    public azgm(String str, Context context, String str2) {
        this.f99280a = str;
        this.f99281b = context;
        this.f99282c = str2;
    }

    public final void run() {
        String str = this.f99280a;
        Context context = this.f99281b;
        String str2 = this.f99282c;
        bxvd da = cbip.f177281c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((cbip) da.f164949b).f177284b = str;
        cbip cbip = (cbip) da.mo74062i();
        azcm a = azcm.m85300a(context);
        aznz a2 = aznz.m85891a(str2);
        if (!a.mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        a.f98996b.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sender_properties", cbip.mo73642k());
            a.f98996b.update("conversations", contentValues, "conversation_id = ? ", new String[]{a2.f99774a});
        } finally {
            a.f98996b.setTransactionSuccessful();
            a.f98996b.endTransaction();
        }
    }
}
