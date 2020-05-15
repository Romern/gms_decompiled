package p000;

import android.content.ContentValues;
import com.google.android.gms.reminders.model.TaskEntity;

/* renamed from: aowv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowv {
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
    /* renamed from: a */
    public static ContentValues m69737a(TaskEntity taskEntity) {
        ContentValues contentValues = new ContentValues();
        aowy.m69767a(contentValues, aoww.m69746a(taskEntity));
        contentValues.remove("due_date_millis");
        contentValues.remove("fired_time_millis");
        contentValues.put("dirty_sync_bit", (Boolean) false);
        return contentValues;
    }

    /* renamed from: a */
    public static void m69738a(ContentValues contentValues, String str, Boolean bool) {
        contentValues.put(str, Integer.valueOf(Boolean.TRUE.equals(bool) ? 1 : 0));
    }
}
