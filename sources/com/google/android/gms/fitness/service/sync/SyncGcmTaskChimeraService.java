package com.google.android.gms.fitness.service.sync;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    static final bnhe f32419a = bnhe.m109410a(zoy.SKIPPED, "com.google.android.gms.fitness.sync.SKIPPED", zoy.SUCCESS, "com.google.android.gms.fitness.sync.SUCCESS", zoy.FAILURE, "com.google.android.gms.fitness.sync.FAILED");

    /* renamed from: b */
    public static final /* synthetic */ int f32420b = 0;

    /* renamed from: c */
    private static final srn f32421c = zvt.m46581a();

    /* renamed from: d */
    private static final yuw f32422d = yuq.m44881a(zou.f55636a, zov.f55637a);

    /* renamed from: e */
    private static final Map f32423e = new C1223np();

    /* renamed from: a */
    static int m23798a(String str) {
        return ((Integer) zvs.m46580a(f32423e, str, -1)).intValue();
    }

    /* renamed from: b */
    public static bnhe m23800b(String str) {
        bnha h = bnhe.m109414h();
        try {
            for (Map.Entry entry : zvr.m46577a(str).entrySet()) {
                h.mo67695b(Integer.valueOf((String) entry.getKey()), Long.valueOf((String) entry.getValue()));
            }
            return h.mo67618b();
        } catch (IllegalArgumentException e) {
            return bnoj.f131912b;
        }
    }

    /* renamed from: a */
    static void m23799a(String str, int i) {
        synchronized (f32423e) {
            f32423e.put(str, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        Bundle bundle = aecc.f63129b;
        if (bundle == null) {
            bnsl bnsl = (bnsl) f32421c.mo68387b();
            bnsl.mo68432a("com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SyncGcmTaskChimeraService should never be triggered with null bundle");
        } else {
            final String string = bundle.getString("account");
            if (string == null) {
                bnsl bnsl2 = (bnsl) f32421c.mo68387b();
                bnsl2.mo68432a("com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("SyncGcmTaskChimeraService should never be triggered with null account");
            } else if (cdyu.m135386d() && !yzq.m45107a(this).mo30874b().mo30715b().contains(string)) {
                bnsl bnsl3 = (bnsl) f32421c.mo68387b();
                bnsl3.mo68432a("com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("SyncGcmTaskChimeraService should never be triggered with a non fit account");
            } else if (ceab.m135734g()) {
                boolean a = zpa.m45930a(this);
                boolean z = bundle.getBoolean("post_app_callback", false);
                if (a && !z) {
                    final Bundle bundle2 = new Bundle(bundle);
                    bundle2.putBoolean("post_app_callback", true);
                    bnhe bnhe = (bnhe) f32422d.mo30787a();
                    int i = bundle.getInt("sync_source", 0);
                    Long l = (Long) bnhe.get(Integer.valueOf(i));
                    if (l == null) {
                        l = (Long) zvs.m46580a(bnhe, 0, 0L);
                    }
                    mo19175a(this, bundle2, string, l.longValue());
                    final Context applicationContext = getApplicationContext();
                    C15691 r3 = new ResultReceiver() {
                        /* class com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService.C15691 */

                        public final void onReceiveResult(int i, Bundle bundle) {
                            int i2 = SyncGcmTaskChimeraService.f32420b;
                            SyncGcmTaskChimeraService.this.mo19175a(r1, r0, r3, 0);
                        }
                    };
                    Parcel obtain = Parcel.obtain();
                    r3.writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    Bundle bundle3 = new Bundle();
                    SharedPreferences d = zuw.m46538d(this, string);
                    bundle3.putLong("passive_session_window_start", Math.min(d.getLong("sync_time", -1), d.getLong("oldest_wear", Long.MAX_VALUE)));
                    zpa.m45929a(this, string, "com.google.android.gms.fitness.sync.PRESYNC", resultReceiver, i, bundle3);
                } else {
                    yvq.m44915h(this);
                    zow zow = new zow(this);
                    int i2 = bundle.getInt("sync_source", 0);
                    cadu a2 = cadu.m126522a(i2);
                    try {
                        zoy a3 = zoz.m45926a(this, string, zow, a2);
                        String str = (String) f32419a.get(a3);
                        if (str != null) {
                            zpa.m45929a(this, string, str, null, i2, null);
                        }
                        if (a3 == zoy.SUCCESS) {
                            if (cdyu.f181962a.mo6606a().mo78522z() && !cadu.PERIODIC.equals(a2)) {
                                sre.m36089i(this);
                                zvm.m46573b(this, string, a2);
                            }
                        }
                        int a4 = yvq.m44908a(this);
                        int a5 = m23798a(string);
                        if (!zuq.m46520c(string) || a5 != a4) {
                            zuq.m46513a(this, string);
                            m23799a(string, a4);
                        }
                    } catch (Throwable th) {
                        int a6 = yvq.m44908a(this);
                        int a7 = m23798a(string);
                        if (!zuq.m46520c(string) || a7 != a6) {
                            zuq.m46513a(this, string);
                            m23799a(string, a6);
                        }
                        throw th;
                    }
                }
            } else if (cdyu.f181962a.mo6606a().mo78512p()) {
                zvm.m46571a(this, string);
                zuq.m46519b(this, string);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19174a(Context context, aecc aecc) {
        Bundle bundle = aecc.f63129b;
        if (bundle == null) {
            bnsl bnsl = (bnsl) f32421c.mo68387b();
            bnsl.mo68432a("com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SyncGcmTaskChimeraService should never be triggered with null bundle");
            return;
        }
        final String string = bundle.getString("account");
        if (string == null) {
            bnsl bnsl2 = (bnsl) f32421c.mo68387b();
            bnsl2.mo68432a("com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("SyncGcmTaskChimeraService should never be triggered with null account");
        } else if (cdyu.m135386d() && !yzq.m45107a(context).mo30874b().mo30715b().contains(string)) {
            bnsl bnsl3 = (bnsl) f32421c.mo68387b();
            bnsl3.mo68432a("com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("SyncGcmTaskChimeraService should never be triggered with a non fit account");
        } else if (ceab.m135734g()) {
            boolean a = zpa.m45930a(context);
            boolean z = bundle.getBoolean("post_app_callback", false);
            if (a && !z) {
                final Bundle bundle2 = new Bundle(bundle);
                bundle2.putBoolean("post_app_callback", true);
                bnhe bnhe = (bnhe) f32422d.mo30787a();
                int i = bundle.getInt("sync_source", 0);
                Long l = (Long) bnhe.get(Integer.valueOf(i));
                if (l == null) {
                    l = (Long) zvs.m46580a(bnhe, 0, 0L);
                }
                mo19175a(context, bundle2, string, l.longValue());
                final Context applicationContext = context.getApplicationContext();
                C15691 r4 = new ResultReceiver() {
                    /* class com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService.C15691 */

                    public final void onReceiveResult(int i, Bundle bundle) {
                        int i2 = SyncGcmTaskChimeraService.f32420b;
                        SyncGcmTaskChimeraService.this.mo19175a(applicationContext, bundle2, string, 0);
                    }
                };
                Parcel obtain = Parcel.obtain();
                r4.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                Bundle bundle3 = new Bundle();
                SharedPreferences d = zuw.m46538d(context, string);
                bundle3.putLong("passive_session_window_start", Math.min(d.getLong("sync_time", -1), d.getLong("oldest_wear", Long.MAX_VALUE)));
                zpa.m45929a(context, string, "com.google.android.gms.fitness.sync.PRESYNC", resultReceiver, i, bundle3);
                return;
            }
            yvq.m44915h(context);
            zow zow = new zow(context);
            int i2 = bundle.getInt("sync_source", 0);
            cadu a2 = cadu.m126522a(i2);
            try {
                zoy a3 = zoz.m45926a(context, string, zow, a2);
                String str = (String) f32419a.get(a3);
                if (str != null) {
                    zpa.m45929a(context, string, str, null, i2, null);
                }
                if (a3 == zoy.SUCCESS) {
                    if (cdyu.f181962a.mo6606a().mo78522z() && !cadu.PERIODIC.equals(a2)) {
                        sre.m36089i(context);
                        zvm.m46573b(context, string, a2);
                    }
                }
                int a4 = yvq.m44908a(context);
                int a5 = m23798a(string);
                if (!zuq.m46520c(string) || a5 != a4) {
                    zuq.m46513a(context, string);
                    m23799a(string, a4);
                }
            } catch (Throwable th) {
                int a6 = yvq.m44908a(context);
                int a7 = m23798a(string);
                if (!zuq.m46520c(string) || a7 != a6) {
                    zuq.m46513a(context, string);
                    m23799a(string, a6);
                }
                throw th;
            }
        } else if (cdyu.f181962a.mo6606a().mo78512p()) {
            zvm.m46571a(context, string);
            zuq.m46519b(context, string);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo19175a(Context context, Bundle bundle, String str, long j) {
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.fitness.sync.SyncGcmTaskService";
        aebi.f63099k = zuq.m46512a(str);
        aebi.mo34027b(1);
        aebi.mo34023a(0);
        aebi.f63107s = bundle;
        aebi.mo34004a(j, 5 + j);
        a.mo33984a(aebi.mo33974b());
    }
}
