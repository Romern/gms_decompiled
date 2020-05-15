package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: qfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfs {

    /* renamed from: a */
    public static final qgc f41128a = new qfr();

    /* renamed from: b */
    private final Object f41129b = new Object();

    /* renamed from: c */
    private final rtj f41130c;

    public qfs(Context context) {
        this.f41130c = qey.m32045a(context, "checkin_scheduled_checkin_storage");
    }

    /* renamed from: a */
    public final void mo24016a() {
        synchronized (this.f41129b) {
            SharedPreferences.Editor edit = this.f41130c.edit();
            edit.clear();
            edit.commit();
        }
    }

    /* renamed from: b */
    public final bmxv mo24018b() {
        Bundle bundle;
        synchronized (this.f41129b) {
            if (this.f41130c.contains("key_scheduled_checkin_time")) {
                long j = this.f41130c.getLong("key_scheduled_checkin_time", -1);
                synchronized (this.f41129b) {
                    bundle = new Bundle();
                    if (this.f41130c.contains("CheckinService_fetchSystemUpdates")) {
                        bundle.putBoolean("CheckinService_fetchSystemUpdates", this.f41130c.getBoolean("CheckinService_fetchSystemUpdates", false));
                    }
                    if (this.f41130c.contains("CheckinService_forceCheckin")) {
                        bundle.putBoolean("CheckinService_forceCheckin", this.f41130c.getBoolean("CheckinService_forceCheckin", false));
                    }
                    if (this.f41130c.contains("CheckinService_logUploadPolicy")) {
                        bundle.putString("CheckinService_logUploadPolicy", this.f41130c.getString("CheckinService_logUploadPolicy", ""));
                    }
                    if (this.f41130c.contains("checkin_source_package")) {
                        bundle.putString("checkin_source_package", this.f41130c.getString("checkin_source_package", ""));
                    }
                    if (this.f41130c.contains("checkin_source_class")) {
                        bundle.putString("checkin_source_class", this.f41130c.getString("checkin_source_class", ""));
                    }
                    if (this.f41130c.contains("checkin_source_force")) {
                        bundle.putBoolean("checkin_source_force", this.f41130c.getBoolean("checkin_source_force", false));
                    }
                    if (this.f41130c.contains("checkin_task_tag")) {
                        bundle.putString("checkin_task_tag", this.f41130c.getString("checkin_task_tag", ""));
                    }
                    if (this.f41130c.contains("CheckinService_onStart_checkinReason")) {
                        bundle.putInt("CheckinService_onStart_checkinReason", this.f41130c.getInt("CheckinService_onStart_checkinReason", 0));
                    }
                }
                bmxv b = bmxv.m108566b(new qfq(j, bundle));
                return b;
            }
            bmvz bmvz = bmvz.f131120a;
            return bmvz;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24017a(qfq qfq) {
        synchronized (this.f41129b) {
            SharedPreferences.Editor edit = this.f41130c.edit();
            edit.putLong("key_scheduled_checkin_time", qfq.f41126a);
            edit.commit();
            Bundle bundle = qfq.f41127b;
            synchronized (this.f41129b) {
                SharedPreferences.Editor edit2 = this.f41130c.edit();
                if (bundle.containsKey("CheckinService_fetchSystemUpdates")) {
                    edit2.putBoolean("CheckinService_fetchSystemUpdates", bundle.getBoolean("CheckinService_fetchSystemUpdates"));
                }
                if (bundle.containsKey("CheckinService_forceCheckin")) {
                    edit2.putBoolean("CheckinService_forceCheckin", bundle.getBoolean("CheckinService_forceCheckin"));
                }
                if (bundle.containsKey("CheckinService_logUploadPolicy")) {
                    edit2.putString("CheckinService_logUploadPolicy", bundle.getString("CheckinService_logUploadPolicy"));
                }
                if (bundle.containsKey("checkin_source_package")) {
                    edit2.putString("checkin_source_package", bundle.getString("checkin_source_package"));
                }
                if (bundle.containsKey("checkin_source_class")) {
                    edit2.putString("checkin_source_class", bundle.getString("checkin_source_class"));
                }
                if (bundle.containsKey("checkin_source_force")) {
                    edit2.putBoolean("checkin_source_force", bundle.getBoolean("checkin_source_force"));
                }
                if (bundle.containsKey("checkin_task_tag")) {
                    edit2.putString("checkin_task_tag", bundle.getString("checkin_task_tag"));
                }
                if (bundle.containsKey("CheckinService_onStart_checkinReason")) {
                    edit2.putInt("CheckinService_onStart_checkinReason", bundle.getInt("CheckinService_onStart_checkinReason"));
                }
                edit2.commit();
            }
        }
    }
}
