package p000;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;

/* renamed from: aowd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aowd {

    /* renamed from: a */
    public final aosi f83729a;

    /* renamed from: b */
    private final Context f83730b;

    /* renamed from: c */
    private final ContentResolver f83731c;

    public aowd(Context context, aosi aosi) {
        this.f83730b = context;
        this.f83731c = context.getContentResolver();
        this.f83729a = aosi;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ContentProviderOperation mo46949a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("deleted", (Boolean) true);
        return ContentProviderOperation.newUpdate(aotd.f83574a).withSelection(aowt.m69729a("account_id=?", "dirty_sync_bit=1"), new String[]{String.valueOf(this.f83729a.f83507a)}).withValues(contentValues).build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final blrk mo46953b() {
        return aowf.m69690a(this.f83730b, null, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ContentProviderOperation mo46950a(blox blox) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("deleted", (Integer) 1);
        return ContentProviderOperation.newUpdate(aotd.f83574a).withSelection("account_id=? AND client_assigned_id=?", new String[]{String.valueOf(this.f83729a.f83507a), blox.f127163b.toString()}).withValues(contentValues).build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ContentProviderOperation mo46951a(blrj blrj) {
        ContentValues contentValues = new ContentValues();
        aowy.m69767a(contentValues, blrj);
        contentValues.put("account_id", Long.valueOf(this.f83729a.f83507a));
        return ContentProviderOperation.newInsert(aotd.f83575b).withValues(contentValues).build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo46952a(ArrayList arrayList) {
        arrayList.add(0, ContentProviderOperation.newAssertQuery(aota.f83571a).withSelection("account_id=?", new String[]{String.valueOf(this.f83729a.f83507a)}).withExpectedCount(0).build());
        return sgq.m35236a(this.f83731c, arrayList, "RemindersSync");
    }
}
