package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ayhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhj extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97592c;

    /* renamed from: d */
    final /* synthetic */ ayja f97593d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhj(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97593d = ayja;
        this.f97592c = axrs;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axue, android.net.Uri, boolean):com.google.android.gms.common.data.DataHolder
     arg types: [axue, ?[OBJECT, ARRAY], int]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void
      axxv.a(android.database.sqlite.SQLiteDatabase, axue, java.lang.String):boolean
      axxv.a(axxi, boolean, java.lang.String):axxr
      axxv.a(ssb, boolean, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      axxv.a(axue, android.net.Uri, boolean):com.google.android.gms.common.data.DataHolder */
    /* renamed from: a */
    public final void mo53991a() {
        DataHolder a;
        try {
            ayja ayja = this.f97593d;
            a = ayja.f97727f.mo53730a(ayja.f97726e, (Uri) null, false);
            this.f97592c.mo53438a(a);
            ayji.m84106a(a, this.f97592c);
        } catch (Exception e) {
            Log.e("WearableService", "getDataItems: exception during processing", e);
            this.f97592c.mo53438a(DataHolder.m22539b(8));
        } catch (Throwable th) {
            ayji.m84106a(a, this.f97592c);
            throw th;
        }
    }
}
