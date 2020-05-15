package p000;

import android.content.ContentValues;

/* renamed from: bemf */
final /* synthetic */ class bemf implements benr {

    /* renamed from: a */
    private final bbgr f111818a;

    public bemf(bbgr bbgr) {
        this.f111818a = bbgr;
    }

    /* renamed from: a */
    public final Object mo56134a(bens bens) {
        byte[] bArr;
        bbgr bbgr = this.f111818a;
        bbgt bbgt = bbgr.f102603a;
        bngx a = bbhf.m88013a(bbgr.f102604b, bbgr.f102605c.mo56107a());
        long a2 = bbgt.f102608a.mo54417a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bbhf bbhf = (bbhf) a.get(i);
            if (((bbfz) bbhf.mo56139b()).mo56113c() != 3) {
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("key_data", ((ByteString) bbhf.mo56138a()).getKey());
                int c = ((bbfz) bbhf.mo56139b()).mo56113c();
                if (c != 0) {
                    contentValues.put("value_state_data", Integer.valueOf(c - 2));
                    ByteString bxtx = (ByteString) ((bbfz) bbhf.mo56139b()).mo56111a().mo66815c();
                    if (bxtx != null) {
                        bArr = bxtx.getKey();
                    } else {
                        bArr = null;
                    }
                    contentValues.put("value_data", bArr);
                    Long valueOf = Long.valueOf(a2);
                    contentValues.put("write_ms", valueOf);
                    contentValues.put("access_ms", valueOf);
                    bens.m95324a();
                    bljb a3 = blkh.m107282a("INSERT WITH ON CONFLICT infinite_data_cache", blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    try {
                        bens.f111891b.insertWithOnConflict("infinite_data_cache", null, contentValues, 5);
                        if (a3 != null) {
                            a3.close();
                        }
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                } else {
                    throw null;
                }
            }
        }
        return null;
        throw th;
    }
}
