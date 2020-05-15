package p000;

import android.content.ContentValues;

/* renamed from: bbzk */
final /* synthetic */ class bbzk implements Runnable {

    /* renamed from: a */
    private final bcas f103800a;

    /* renamed from: b */
    private final ContentValues f103801b;

    /* renamed from: c */
    private final bctr f103802c;

    /* renamed from: d */
    private final long f103803d;

    public bbzk(bcas bcas, ContentValues contentValues, bctr bctr, long j) {
        this.f103800a = bcas;
        this.f103801b = contentValues;
        this.f103802c = bctr;
        this.f103803d = j;
    }

    public final void run() {
        bcas bcas = this.f103800a;
        ContentValues contentValues = this.f103801b;
        bctr bctr = this.f103802c;
        long j = this.f103803d;
        bcrt bcrt = (bcrt) bctr;
        bcas.f103908c.mo54674a(bcas.mo56655d("messages"), contentValues, "message_id = ?", new String[]{bcrt.f104743a});
        long c = bcas.mo56650c(bcrt.f104745c);
        if (c != -1) {
            bcas.mo56620a(c, Long.valueOf(j));
        } else {
            bbos.m88294d("SQLiteMessagingStore", "Message time updated for non existent conversation");
        }
    }
}
