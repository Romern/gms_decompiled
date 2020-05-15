package p000;

import android.content.ContentValues;

/* renamed from: smu */
final /* synthetic */ class smu implements sqh {

    /* renamed from: a */
    static final sqh f44775a = new smu();

    private smu() {
    }

    /* renamed from: a */
    public final void mo25757a(Object obj, ContentValues contentValues) {
        smt smt = (smt) obj;
        int i = smv.f44776c;
        contentValues.put("event_time_ms", Long.valueOf(smt.f44773a));
        contentValues.put("network_type", Integer.valueOf(smt.f44774b));
    }
}
