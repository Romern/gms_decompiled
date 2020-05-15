package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;

/* renamed from: bcah */
final /* synthetic */ class bcah implements Runnable {

    /* renamed from: a */
    private final bcas f103869a;

    /* renamed from: b */
    private final bctr f103870b;

    /* renamed from: c */
    private final boolean f103871c;

    /* renamed from: d */
    private final ContentValues f103872d;

    public bcah(bcas bcas, bctr bctr, boolean z, ContentValues contentValues) {
        this.f103869a = bcas;
        this.f103870b = bctr;
        this.f103871c = z;
        this.f103872d = contentValues;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        if (r0.f103910e.contains(r5) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r12 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        r0.mo56622a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0067, code lost:
        if (r2 != null) goto L_0x006c;
     */
    public final void run() {
        bcas bcas = this.f103869a;
        bctr bctr = this.f103870b;
        boolean z = this.f103871c;
        ContentValues contentValues = this.f103872d;
        contentValues.put("conversation_row_id", Long.valueOf(bcas.mo56604a(bctr.mo57361c(), z ? bmxv.m108566b(bctr.mo57362d()) : bmvz.f131120a)));
        contentValues.put("sender_contact_row_id", Long.valueOf(bcas.mo56638b(bctr.mo57360b())));
        boolean z2 = true;
        Cursor a = bcas.f103908c.mo54677a(bcas.mo56655d("messages"), new String[]{"message_status"}, "message_id = ?", new String[]{bctr.mo57359a()}, null, null);
        try {
            bctk bctk = null;
            if (a.moveToFirst()) {
                bctk = bctk.m89929a(a.getInt(0));
            }
            a.close();
            if (bcas.f103908c.mo54676a(bcas.mo56655d("messages"), contentValues, 5) >= 0) {
                bcas.mo56653c(bctr.mo57359a());
                bcas.mo56660g(bctr.mo57361c());
                if (bctk == null || bctk.equals(bctr.mo57366g())) {
                    z2 = false;
                }
                if (!bcas.f103910e.contains(bctr.mo57366g())) {
                    if (z2) {
                    }
                    bcas.mo56622a(bctr.mo57366g());
                    return;
                }
                bcas.mo56661h(bctr.mo57361c());
            } else {
                throw new SQLiteException("Failed to save message.");
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
