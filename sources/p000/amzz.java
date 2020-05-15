package p000;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import java.util.List;

/* renamed from: amzz */
final /* synthetic */ class amzz implements anab {

    /* renamed from: a */
    private final boolean f76457a;

    /* renamed from: b */
    private final List f76458b;

    /* renamed from: c */
    private final amvu f76459c;

    public amzz(amvu amvu, boolean z, List list) {
        this.f76459c = amvu;
        this.f76457a = z;
        this.f76458b = list;
    }

    /* renamed from: a */
    public final void mo41584a(ContentValues contentValues, ContentValues contentValues2) {
        amvu amvu = this.f76459c;
        boolean z = this.f76457a;
        List list = this.f76458b;
        if (!anac.m63810a(contentValues)) {
            long b = anac.m63812b(contentValues2);
            amvu.f76145b.mo41496a(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(amvu.f76144a, contentValues2.getAsLong("data_id").longValue())).withValue("data_sync4", Long.valueOf(anau.m63867a(b))).withValue("data_version", Long.valueOf(b)), false);
        }
        if (z) {
            if (!cfwa.m143263b()) {
                contentValues = contentValues2;
            }
            list.add(contentValues);
        }
    }
}
