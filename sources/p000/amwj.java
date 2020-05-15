package p000;

import android.content.SharedPreferences;

/* renamed from: amwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwj {

    /* renamed from: a */
    public final alsj f76181a;

    /* renamed from: b */
    public final anaz f76182b;

    /* renamed from: c */
    public final String f76183c;

    public amwj(alsj alsj, anaz anaz, String str) {
        this.f76181a = alsj;
        this.f76182b = anaz;
        this.f76183c = str;
    }

    /* renamed from: a */
    public final void mo41483a(int i) {
        int o = this.f76181a.mo40711o(this.f76183c);
        long currentTimeMillis = System.currentTimeMillis();
        alsj alsj = this.f76181a;
        String str = this.f76183c;
        SharedPreferences sharedPreferences = alsj.f74200a;
        String valueOf = String.valueOf(str);
        long j = sharedPreferences.getLong(valueOf.length() == 0 ? new String("focus_first_full_sync_status_last_log_timestamp_") : "focus_first_full_sync_status_last_log_timestamp_".concat(valueOf), 0);
        if (o != i || (currentTimeMillis - j) / 1000 >= cfyk.f186101a.mo6606a().mo83111o()) {
            anaz anaz = this.f76182b;
            alsj alsj2 = this.f76181a;
            String str2 = this.f76183c;
            SharedPreferences sharedPreferences2 = alsj2.f74200a;
            String valueOf2 = String.valueOf(str2);
            long j2 = sharedPreferences2.getLong(valueOf2.length() == 0 ? new String("focus_first_full_sync_initial_timestamp_") : "focus_first_full_sync_initial_timestamp_".concat(valueOf2), 0);
            alsj alsj3 = this.f76181a;
            String str3 = this.f76183c;
            SharedPreferences sharedPreferences3 = alsj3.f74200a;
            String valueOf3 = String.valueOf(str3);
            long j3 = sharedPreferences3.getLong(valueOf3.length() == 0 ? new String("focus_first_full_sync_start_timestamp_") : "focus_first_full_sync_start_timestamp_".concat(valueOf3), 0);
            alsj alsj4 = this.f76181a;
            String str4 = this.f76183c;
            SharedPreferences sharedPreferences4 = alsj4.f74200a;
            String valueOf4 = String.valueOf(str4);
            long j4 = sharedPreferences4.getLong(valueOf4.length() == 0 ? new String("focus_first_full_sync_finish_timestamp_") : "focus_first_full_sync_finish_timestamp_".concat(valueOf4), 0);
            bxvd da = amnd.f75435f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnd amnd = (amnd) da.f164949b;
            int i2 = o - 1;
            if (o != 0) {
                amnd.f75438b = i2;
                int i3 = amnd.f75437a | 1;
                amnd.f75437a = i3;
                int i4 = i3 | 2;
                amnd.f75437a = i4;
                amnd.f75439c = j2;
                int i5 = i4 | 4;
                amnd.f75437a = i5;
                amnd.f75440d = j3;
                amnd.f75437a = i5 | 8;
                amnd.f75441e = j4;
                ((anbh) anaz).f76561u = (amnd) da.mo74062i();
                alsj alsj5 = this.f76181a;
                String str5 = this.f76183c;
                sdo.m34973b((String) null);
                SharedPreferences.Editor edit = alsj5.f74200a.edit();
                String valueOf5 = String.valueOf(str5);
                edit.putLong(valueOf5.length() == 0 ? new String("focus_first_full_sync_status_last_log_timestamp_") : "focus_first_full_sync_status_last_log_timestamp_".concat(valueOf5), currentTimeMillis).commit();
                return;
            }
            throw null;
        }
    }
}
