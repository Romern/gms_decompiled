package p000;

import android.content.Context;

/* renamed from: azgn */
public final /* synthetic */ class azgn implements Runnable {

    /* renamed from: a */
    private final Context f99283a;

    /* renamed from: b */
    private final String f99284b;

    public azgn(Context context, String str) {
        this.f99283a = context;
        this.f99284b = str;
    }

    public final void run() {
        Context context = this.f99283a;
        String str = this.f99284b;
        azcm a = azcm.m85300a(context);
        if (!a.mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            return;
        }
        a.f98996b.beginTransaction();
        try {
            a.f98996b.execSQL(String.format("DELETE FROM %s WHERE %s IN (SELECT %s FROM %s WHERE %s == '%s' AND %s == %d)", "mediaUpload", "message_id", "message_id", "messages", "conversation_id", str, "status", 40));
            a.f98996b.delete("messages", "conversation_id == ? AND status == ?", new String[]{str, Integer.toString(40)});
            a.f98996b.setTransactionSuccessful();
        } finally {
            a.f98996b.endTransaction();
        }
    }
}
