package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;

/* renamed from: agjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f65728a;

    /* renamed from: b */
    final /* synthetic */ aghp f65729b;

    public agjk(aghp aghp, AppMetadata appMetadata) {
        this.f65729b = aghp;
        this.f65728a = appMetadata;
    }

    public final void run() {
        this.f65729b.f65526a.mo35701y();
        agmn agmn = this.f65729b.f65526a;
        AppMetadata appMetadata = this.f65728a;
        if (agmn.f65960n != null) {
            agmn.f65961o = new ArrayList();
            agmn.f65961o.addAll(agmn.f65960n);
        }
        agdl h = agmn.mo35684h();
        String str = appMetadata.f80098a;
        sdo.m34977c(str);
        h.mo35241h();
        h.mo35659q();
        try {
            SQLiteDatabase e = h.mo35360e();
            String[] strArr = {str};
            int delete = e.delete("apps", "app_id=?", strArr) + e.delete("events", "app_id=?", strArr) + e.delete("user_attributes", "app_id=?", strArr) + e.delete("conditional_properties", "app_id=?", strArr) + e.delete("raw_events", "app_id=?", strArr) + e.delete("raw_events_metadata", "app_id=?", strArr) + e.delete("queue", "app_id=?", strArr) + e.delete("audience_filter_values", "app_id=?", strArr) + e.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                h.mo35497E().f65572k.mo35437a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            h.mo35497E().f65564c.mo35437a("Error resetting analytics data. appId, error", agid.m54288a(str), e2);
        }
        if (appMetadata.f80105h) {
            agmn.mo35667a(appMetadata);
        }
    }
}
