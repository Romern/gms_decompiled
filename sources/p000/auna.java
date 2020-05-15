package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import java.util.Map;

/* renamed from: auna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auna {

    /* renamed from: a */
    protected final Context f92124a;

    /* renamed from: b */
    protected final aumm f92125b;

    public auna(Context context, aumm aumm) {
        sdo.m34959a(context);
        this.f92124a = context;
        sdo.m34959a(aumm);
        this.f92125b = aumm;
    }

    /* renamed from: a */
    public abstract Cursor mo50690a(String str);

    /* renamed from: a */
    public abstract Cursor mo50691a(Map map);

    /* renamed from: a */
    public final void mo50692a(int i, String str) {
        Intent intent = new Intent("com.google.android.gms.trustagent.framework.model.action.DATA_CHANGE_NOTIFICATION");
        intent.putExtra("data_operation", i);
        intent.putExtra("model_type", this.f92125b.mo50668a());
        intent.putExtra("model_id", str);
        this.f92124a.sendBroadcast(intent, "com.google.android.gms.trustagent.framework.model.DATA_CHANGE_NOTIFICATION");
    }

    /* renamed from: a */
    public abstract void mo50693a(String str, ContentValues contentValues);

    /* renamed from: b */
    public abstract void mo50694b(String str);
}
