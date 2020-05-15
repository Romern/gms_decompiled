package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.List;

/* renamed from: anaa */
final /* synthetic */ class anaa implements anab {

    /* renamed from: a */
    private final List f76460a;

    public anaa(List list) {
        this.f76460a = list;
    }

    /* renamed from: a */
    public final void mo41584a(ContentValues contentValues, ContentValues contentValues2) {
        List list = this.f76460a;
        if (anac.m63810a(contentValues2)) {
            if (!TextUtils.equals(contentValues2.getAsString("data_sync2"), contentValues.getAsString("data_sync2"))) {
                contentValues.put("data_sync1", amwx.m63589a(contentValues2.getAsString("data_sync1"), amwx.m63592b(contentValues.getAsString("data_sync1"))));
            } else {
                return;
            }
        }
        list.add(new anae(contentValues, contentValues2));
    }
}
