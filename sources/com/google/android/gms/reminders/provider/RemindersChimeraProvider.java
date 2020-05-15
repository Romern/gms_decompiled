package com.google.android.gms.reminders.provider;

import android.accounts.OnAccountsUpdateListener;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CustomizedSnoozePreset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemindersChimeraProvider extends sgo {

    /* renamed from: b */
    private static final UriMatcher f107205b = new UriMatcher(-1);

    /* renamed from: c */
    private static final Map f107206c = new HashMap();

    /* renamed from: d */
    private static final Map f107207d = new HashMap();

    /* renamed from: e */
    private static final Map f107208e = new HashMap();

    /* renamed from: f */
    private static final Map f107209f = new HashMap();

    /* renamed from: g */
    private static final Map f107210g = new HashMap();

    /* renamed from: h */
    private static final Map f107211h = new HashMap();

    /* renamed from: i */
    private static final Map f107212i = new HashMap();

    /* renamed from: q */
    private static final String[] f107213q;

    /* renamed from: j */
    private SQLiteDatabase f107214j;

    /* renamed from: k */
    private final ArrayList f107215k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f107216l = new ArrayList();

    /* renamed from: m */
    private final ArrayList f107217m = new ArrayList();

    /* renamed from: n */
    private boolean f107218n;

    /* renamed from: o */
    private boolean f107219o;

    /* renamed from: p */
    private final ThreadPoolExecutor f107220p = new soc(1, 9);

    static {
        char c = 'd';
        f107205b.addURI("com.google.android.gms.reminders", "account", 100);
        f107205b.addURI("com.google.android.gms.reminders", "account/#", 101);
        f107205b.addURI("com.google.android.gms.reminders", "reminders", BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        f107205b.addURI("com.google.android.gms.reminders", "reminders/#", ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
        f107205b.addURI("com.google.android.gms.reminders", "reminders/upsert", 202);
        f107205b.addURI("com.google.android.gms.reminders", "reminders/refresh_due_date", 203);
        f107205b.addURI("com.google.android.gms.reminders", "reminders/mark_exceptional", 204);
        f107205b.addURI("com.google.android.gms.reminders", "reminders/update_fired/#", 205);
        f107205b.addURI("com.google.android.gms.reminders", "reminders/update_bumped", BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR);
        f107205b.addURI("com.google.android.gms.reminders", "notification", 300);
        f107205b.addURI("com.google.android.gms.reminders", "notification/#", ErrorInfo.TYPE_FSC_HTTP_ERROR);
        f107205b.addURI("com.google.android.gms.reminders", "reminder_notifications", 302);
        f107205b.addURI("com.google.android.gms.reminders", "reminder_events", 400);
        f107205b.addURI("com.google.android.gms.reminders", "operations", 600);
        f107205b.addURI("com.google.android.gms.reminders", "operations/#", 601);
        f107205b.addURI("com.google.android.gms.reminders", "place_aliases", 700);
        f107205b.addURI("com.google.android.gms.reminders", "place_aliases/#", 701);
        int i = 10;
        int i2 = 0;
        char c2 = 1;
        String[] strArr = {"_id", "account_name", "storage_version", "sync_status", "morning_customized_time", "afternoon_customized_time", "evening_customized_time", "account_state", "need_sync_snooze_preset", "was_last_sync_error"};
        int i3 = 0;
        while (i3 < i) {
            String str = strArr[i3];
            Map map = f107206c;
            String valueOf = String.valueOf(str);
            map.put(str, valueOf.length() == 0 ? new String("account.") : "account.".concat(valueOf));
            i3++;
            i = 10;
            i2 = 0;
            c = 'd';
            c2 = 1;
        }
        String[] strArr2 = new String[124];
        strArr2[i2] = "_id";
        strArr2[c2] = "account_id";
        strArr2[2] = "reminder_type";
        strArr2[3] = "client_assigned_id";
        strArr2[4] = "server_assigned_id";
        strArr2[5] = "client_assigned_thread_id";
        strArr2[6] = "task_list";
        strArr2[7] = "title";
        strArr2[8] = "created_time_millis";
        strArr2[9] = "archived_time_ms";
        strArr2[i] = "archived";
        strArr2[11] = "deleted";
        strArr2[12] = "pinned";
        strArr2[13] = "snoozed";
        strArr2[14] = "snoozed_time_millis";
        strArr2[15] = "location_snoozed_until_ms";
        strArr2[16] = "due_date_year";
        strArr2[17] = "due_date_month";
        strArr2[18] = "due_date_day";
        strArr2[19] = "due_date_hour";
        strArr2[20] = "due_date_minute";
        strArr2[21] = "due_date_second";
        strArr2[22] = "due_date_period";
        strArr2[23] = "due_date_absolute_time_ms";
        strArr2[24] = "due_date_date_range";
        strArr2[25] = "due_date_unspecified_future_time";
        strArr2[26] = "due_date_all_day";
        strArr2[27] = "due_date_millis";
        strArr2[28] = "event_date_year";
        strArr2[29] = "event_date_month";
        strArr2[30] = "event_date_day";
        strArr2[31] = "event_date_hour";
        strArr2[32] = "event_date_minute";
        strArr2[33] = "event_date_second";
        strArr2[34] = "event_date_period";
        strArr2[35] = "event_date_absolute_time_ms";
        strArr2[36] = "event_date_date_range";
        strArr2[37] = "event_date_unspecified_future_time";
        strArr2[38] = "event_date_all_day";
        strArr2[39] = "lat";
        strArr2[40] = "lng";
        strArr2[41] = "name";
        strArr2[42] = "radius_meters";
        strArr2[43] = "location_type";
        strArr2[44] = "display_address";
        strArr2[45] = "address_country";
        strArr2[46] = "address_locality";
        strArr2[47] = "address_region";
        strArr2[48] = "address_street_address";
        strArr2[49] = "address_street_number";
        strArr2[50] = "address_street_name";
        strArr2[51] = "address_postal_code";
        strArr2[52] = "address_name";
        strArr2[53] = "location_cell_id";
        strArr2[54] = "location_fprint";
        strArr2[55] = "location_alias_id";
        strArr2[56] = "location_query";
        strArr2[57] = "location_query_type";
        strArr2[58] = "chain_id_cell_id";
        strArr2[59] = "chain_id_fprint";
        strArr2[60] = "chain_name";
        strArr2[61] = "category_id";
        strArr2[62] = "display_name";
        strArr2[63] = "recurrence_id";
        strArr2[64] = "recurrence_master";
        strArr2[65] = "recurrence_exceptional";
        strArr2[66] = "recurrence_frequency";
        strArr2[67] = "recurrence_every";
        strArr2[68] = "recurrence_start_year";
        strArr2[69] = "recurrence_start_month";
        strArr2[70] = "recurrence_start_day";
        strArr2[71] = "recurrence_start_hour";
        strArr2[72] = "recurrence_start_minute";
        strArr2[73] = "recurrence_start_second";
        strArr2[74] = "recurrence_start_period";
        strArr2[75] = "recurrence_start_absolute_time_ms";
        strArr2[76] = "recurrence_start_date_range";
        strArr2[77] = "recurrence_start_unspecified_future_time";
        strArr2[78] = "recurrence_start_all_day";
        strArr2[79] = "recurrence_end_year";
        strArr2[80] = "recurrence_end_month";
        strArr2[81] = "recurrence_end_day";
        strArr2[82] = "recurrence_end_hour";
        strArr2[83] = "recurrence_end_minute";
        strArr2[84] = "recurrence_end_second";
        strArr2[85] = "recurrence_end_period";
        strArr2[86] = "recurrence_end_absolute_time_ms";
        strArr2[87] = "recurrence_end_date_range";
        strArr2[88] = "recurrence_end_unspecified_future_time";
        strArr2[89] = "recurrence_end_all_day";
        strArr2[90] = "recurrence_end_num_occurrences";
        strArr2[91] = "recurrence_end_auto_renew";
        strArr2[92] = "recurrence_end_auto_renew_until_year";
        strArr2[93] = "recurrence_end_auto_renew_until_month";
        strArr2[94] = "recurrence_end_auto_renew_until_day";
        strArr2[95] = "recurrence_end_auto_renew_until_hour";
        strArr2[96] = "recurrence_end_auto_renew_until_minute";
        strArr2[97] = "recurrence_end_auto_renew_until_second";
        strArr2[98] = "recurrence_end_auto_renew_until_period";
        strArr2[99] = "recurrence_end_auto_renew_until_absolute_time_ms";
        strArr2[c] = "recurrence_end_auto_renew_until_date_range";
        strArr2[101] = "recurrence_end_auto_renew_until_unspecified_future_time";
        strArr2[102] = "recurrence_end_auto_renew_until_all_day";
        strArr2[103] = "daily_pattern_hour";
        strArr2[104] = "daily_pattern_minute";
        strArr2[105] = "daily_pattern_second";
        strArr2[106] = "daily_pattern_period";
        strArr2[107] = "daily_pattern_all_day";
        strArr2[108] = "weekly_pattern_weekday";
        strArr2[109] = "monthly_pattern_month_day";
        strArr2[110] = "monthly_pattern_week_day";
        strArr2[111] = "monthly_pattern_week_day_number";
        strArr2[112] = "yearly_pattern_year_month";
        strArr2[113] = "yearly_pattern_monthly_pattern_month_day";
        strArr2[114] = "yearly_pattern_monthly_pattern_week_day";
        strArr2[115] = "yearly_pattern_monthly_pattern_week_day_number";
        strArr2[116] = "experiment";
        strArr2[117] = "extensions";
        strArr2[118] = "assistance";
        strArr2[119] = "link_application";
        strArr2[120] = "link_id";
        strArr2[121] = "fired_time_millis";
        strArr2[122] = "dirty_sync_bit";
        strArr2[123] = "place_types";
        f107213q = strArr2;
        int length = strArr2.length;
        int i4 = 0;
        while (i4 < length) {
            String str2 = strArr2[i4];
            Map map2 = f107207d;
            String valueOf2 = String.valueOf(str2);
            map2.put(str2, valueOf2.length() == 0 ? new String("reminders.") : "reminders.".concat(valueOf2));
            i4++;
            i2 = 0;
            c2 = 1;
        }
        f107207d.put("_count", "COUNT(*)");
        String[] strArr3 = new String[7];
        strArr3[i2] = "_id";
        strArr3[c2] = "trigger_time";
        strArr3[2] = "create_time";
        strArr3[3] = "schedule_time";
        strArr3[4] = "fire_time";
        strArr3[5] = "snooze_time";
        strArr3[6] = "dismiss_time";
        for (int i5 = 0; i5 < 7; i5++) {
            String str3 = strArr3[i5];
            Map map3 = f107208e;
            String valueOf3 = String.valueOf(str3);
            map3.put(str3, valueOf3.length() == 0 ? new String("notification.") : "notification.".concat(valueOf3));
        }
        String[] strArr4 = f107213q;
        int length2 = strArr4.length;
        while (i2 < length2) {
            String str4 = strArr4[i2];
            Map map4 = f107209f;
            String valueOf4 = String.valueOf(str4);
            map4.put(str4, valueOf4.length() == 0 ? new String("reminders.") : "reminders.".concat(valueOf4));
            i2++;
        }
        f107209f.putAll(f107208e);
        f107210g.putAll(f107207d);
        f107210g.put("_id", "reminders._id");
        f107210g.put("account_name", "account.account_name");
        f107211h.put("_id", "operation._id");
        f107211h.put("operation_api", "operation.operation_api");
        f107211h.put("operation_request", "operation.operation_request");
        f107211h.put("error_count", "operation.error_count");
        f107212i.put("_id", "place_alias._id");
        f107212i.put("account_id", "place_alias.account_id");
        f107212i.put("alias_id", "place_alias.alias_id");
        f107212i.put("alias_name", "place_alias.alias_name");
        f107212i.put("place_id", "place_alias.place_id");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final int m92235a(ContentValues contentValues, String str, String[] strArr) {
        String[] strArr2 = strArr;
        m92242c(contentValues);
        int i = 0;
        Cursor query = this.f107214j.query("reminders", new String[]{"_id"}, str, strArr, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    this.f107215k.add(Long.valueOf(query.getLong(0)));
                } finally {
                    query.close();
                }
            }
        }
        Cursor query2 = this.f107214j.query(true, "reminders", new String[]{"account_id"}, str, strArr, null, null, null, null);
        if (query2 == null) {
            return 0;
        }
        C1225nr nrVar = new C1225nr();
        while (query2.moveToNext()) {
            try {
                nrVar.add(Integer.valueOf(query2.getInt(0)));
            } catch (Throwable th) {
                query2.close();
                throw th;
            }
        }
        query2.close();
        Iterator it = nrVar.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            contentValues.remove("due_date_millis");
            m92240a(Integer.valueOf(intValue), contentValues);
            StringBuilder sb = new StringBuilder(22);
            sb.append("account_id=");
            sb.append(intValue);
            String a = aowt.m69729a(str, sb.toString());
            if (Boolean.TRUE.equals(contentValues.getAsBoolean("archived")) && contentValues.getAsLong("archived_time_ms") == null) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("archived_time_ms", Long.valueOf(System.currentTimeMillis()));
                this.f107214j.update("reminders", contentValues2, aowt.m69729a(a, "archived=0"), strArr2);
                contentValues.remove("archived_time_ms");
            }
            i += this.f107214j.update("reminders", contentValues, a, strArr2);
        }
        return i;
    }

    /* renamed from: b */
    private final Uri m92241b(ContentValues contentValues) {
        m92242c(contentValues);
        Integer asInteger = contentValues.getAsInteger("account_id");
        if (asInteger != null) {
            m92240a(asInteger, contentValues);
            if (contentValues.getAsLong("created_time_millis") == null) {
                contentValues.put("created_time_millis", Long.valueOf(System.currentTimeMillis()));
            }
            Uri a = m92237a("reminders", aotd.f83574a, contentValues);
            if (a != null) {
                this.f107215k.add(Long.valueOf(ContentUris.parseId(a)));
            }
            return a;
        }
        throw new IllegalStateException("Missing accountId when creating reminders");
    }

    /* renamed from: c */
    private static final void m92242c(ContentValues contentValues) {
        if (!(contentValues.getAsInteger("due_date_hour") == null && contentValues.getAsInteger("due_date_minute") == null && contentValues.getAsInteger("due_date_second") == null)) {
            m92239a(contentValues, "due_date_hour");
            m92239a(contentValues, "due_date_minute");
            m92239a(contentValues, "due_date_second");
        }
        if (contentValues.getAsInteger("event_date_hour") != null || contentValues.getAsInteger("event_date_minute") != null || contentValues.getAsInteger("event_date_second") != null) {
            m92239a(contentValues, "event_date_hour");
            m92239a(contentValues, "event_date_minute");
            m92239a(contentValues, "event_date_second");
        }
    }

    /* renamed from: g */
    private final C1223np m92243g() {
        Cursor query = this.f107214j.query("account", new String[]{"_id", "morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, null, null, null, null, null);
        C1223np npVar = new C1223np();
        if (query == null) {
            return npVar;
        }
        while (query.moveToNext()) {
            try {
                aotj aotj = new aotj();
                aotj.mo46869c(aosd.m69443a(query.getLong(1)));
                aotj.mo46867a(aosd.m69443a(query.getLong(2)));
                aotj.mo46868b(aosd.m69443a(query.getLong(3)));
                npVar.put(Integer.valueOf(query.getInt(0)), aotj.mo46866a());
            } finally {
                query.close();
            }
        }
        return npVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AssetFileDescriptor mo7300a(Uri uri, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7303a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7304b() {
        return "reminders.db";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo25495d() {
        this.f107215k.clear();
        this.f107216l.clear();
        this.f107217m.clear();
        this.f107218n = false;
        this.f107219o = false;
    }

    public final String getType(Uri uri) {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void
     arg types: [aosh, ?[OBJECT, ARRAY], int]
     candidates:
      adyd.a(android.accounts.Account, java.util.ArrayList, java.lang.String[]):android.content.Intent
      adyd.a(android.accounts.Account, java.lang.String[], android.accounts.AccountManagerCallback):android.accounts.AccountManagerFuture
      adyd.a(android.accounts.Account, java.lang.String, int):boolean
      adyd.a(android.accounts.Account, java.lang.String, android.os.Bundle):boolean
      adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void */
    public final boolean onCreate() {
        Context context = getContext();
        adyd.m51363a(context).mo33912a((OnAccountsUpdateListener) new aosh(context), (Handler) null, true);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo25496e() {
        aosq aosq;
        aoun aoun;
        Context context = getContext();
        if (this.f107219o) {
            aoun = new aoun(context, context.getContentResolver().query(aosz.f83570b, aoun.f83637b, aowt.m69728a(), null, null));
            aosq = !this.f107218n ? new aosq(context, sgq.m35237b(context, aotc.f83573a, null, aowt.m69728a(), null, null)) : null;
        } else if (!this.f107215k.isEmpty()) {
            aoun = aoun.m69533a(context, this.f107215k);
            if (!this.f107218n) {
                String a = aowr.m69718a(",", this.f107215k);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 19);
                sb.append("reminders._id IN (");
                sb.append(a);
                sb.append(")");
                aosq = new aosq(context, sgq.m35237b(context, aotc.f83573a, null, sb.toString(), null, null));
            } else {
                aosq = null;
            }
        } else {
            aoun = null;
            aosq = null;
        }
        if (aoun != null) {
            this.f107220p.execute(aoun);
        }
        if (aosq != null) {
            this.f107220p.execute(aosq);
        }
        if (!this.f107218n) {
            if (this.f107216l.size() > 1) {
                aowu.m69733a("RemindersProvider", "Firing more than one task in a single transaction.", new Object[0]);
            }
            if (!this.f107216l.isEmpty()) {
                ArrayList arrayList = this.f107216l;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(sgq.m35237b(context, aotc.f83573a, null, "reminders._id=?", new String[]{String.valueOf((Long) arrayList.get(i))}, null));
                }
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    this.f107220p.execute(new aoso(context, (DataHolder) arrayList2.get(i2)));
                }
            }
        }
        if (!this.f107218n && !this.f107217m.isEmpty()) {
            String a2 = aowr.m69718a(",", this.f107217m);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 17);
            sb2.append("account._id IN (");
            sb2.append(a2);
            sb2.append(")");
            this.f107220p.execute(new aosm(context, sgq.m35237b(context, aosy.f83568a, new String[]{"account_name", "morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, sb2.toString(), null, null)));
        }
        if (!this.f107215k.isEmpty()) {
            mo7299a(this.f107214j, aotd.f83574a, "deleted=1", null);
        }
        int size3 = this.f107215k.size();
        int size4 = this.f107216l.size();
        int size5 = this.f107217m.size();
        boolean z = this.f107219o;
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append("End transaction, changedTasks: ");
        sb3.append(size3);
        sb3.append(", firedTasks:");
        sb3.append(size4);
        sb3.append(", changeSnoozePresetAccounts:");
        sb3.append(size5);
        sb3.append(", refreshDueDate:");
        sb3.append(z);
        sb3.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SQLiteOpenHelper mo7305c() {
        Context context = getContext();
        if (aoup.f83643a == null) {
            synchronized (aoup.f83644b) {
                if (aoup.f83643a == null) {
                    aoup.f83643a = new aoup(context, "reminders.db");
                }
            }
        }
        return aoup.f83643a;
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
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0128, code lost:
        throw r0;
     */
    /* renamed from: a */
    private final int m92236a(String str, String[] strArr) {
        boolean z;
        String string;
        String str2;
        String str3 = "due_date_absolute_time_ms";
        int i = 0;
        Cursor query = this.f107214j.query("reminders", new String[]{"recurrence_id", "recurrence_exceptional", "due_date_millis", "account_id"}, str, strArr, null, null, null);
        if (query != null) {
            while (query.moveToNext() && (string = query.getString(i)) != null && query.getInt(1) != 1) {
                try {
                    long j = query.getLong(2);
                    String string2 = query.getString(3);
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("due_date_millis>");
                    sb.append(j);
                    String[] strArr2 = {string, string2};
                    query = this.f107214j.query("reminders", new String[]{"due_date_year", "due_date_month", "due_date_day", "due_date_hour", "due_date_minute", "due_date_second", "due_date_period", str3}, aowt.m69729a(aowt.m69729a("recurrence_id=? AND account_id=?", sb.toString()), "recurrence_exceptional IS NULL OR recurrence_exceptional!=1"), strArr2, null, null, "due_date_millis ASC", "1");
                    if (query != null) {
                        if (query.moveToFirst()) {
                            query.moveToFirst();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("due_date_year", aows.m69726b(query, 0));
                            contentValues.put("due_date_month", aows.m69726b(query, 1));
                            contentValues.put("due_date_day", aows.m69726b(query, 2));
                            contentValues.put("due_date_hour", aows.m69726b(query, 3));
                            contentValues.put("due_date_minute", aows.m69726b(query, 4));
                            contentValues.put("due_date_second", aows.m69726b(query, 5));
                            contentValues.put("due_date_period", aows.m69726b(query, 6));
                            str2 = str3;
                            contentValues.put(str2, aows.m69725a(query, 7));
                            m92235a(contentValues, aowt.m69729a("recurrence_id=? AND account_id=?", "recurrence_master=1"), strArr2);
                            query.close();
                        } else {
                            str2 = str3;
                        }
                        str3 = str2;
                        i = 0;
                    } else {
                        i = 0;
                    }
                } finally {
                }
            }
            query.close();
            z = false;
        } else {
            z = false;
            aowu.m69733a("RemindersProvider", "Fired reminders not found in the provider.", new Object[0]);
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("snoozed", Boolean.valueOf(z));
        contentValues2.put("pinned", (Boolean) true);
        contentValues2.put("fired_time_millis", Long.valueOf(System.currentTimeMillis()));
        return m92235a(contentValues2, str, strArr);
    }

    /* renamed from: a */
    private final Uri m92237a(String str, Uri uri, ContentValues contentValues) {
        long insert = this.f107214j.insert(str, null, contentValues);
        if (insert != -1) {
            return ContentUris.withAppendedId(uri, insert);
        }
        return null;
    }

    /* renamed from: a */
    private final void m92238a(ContentValues contentValues) {
        if (contentValues != null && contentValues.containsKey("silent_change")) {
            if (Boolean.TRUE.equals(contentValues.getAsBoolean("silent_change"))) {
                this.f107218n = true;
            }
            contentValues.remove("silent_change");
        }
        if (((Boolean) aoss.f83565x.mo58455c()).booleanValue() && ((Boolean) aoss.f83567z.mo58455c()).booleanValue()) {
            this.f107218n = true;
        }
        boolean z = this.f107218n;
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
    /* renamed from: a */
    private static final void m92239a(ContentValues contentValues, String str) {
        if (contentValues.getAsInteger(str) == null) {
            contentValues.put(str, (Integer) 0);
        }
    }

    /* renamed from: a */
    private final void m92240a(Integer num, ContentValues contentValues) {
        ContentValues contentValues2 = contentValues;
        if (contentValues2.containsKey("due_date_year") || contentValues2.containsKey("due_date_month") || contentValues2.containsKey("due_date_day") || contentValues2.containsKey("due_date_hour") || contentValues2.containsKey("due_date_minute") || contentValues2.containsKey("due_date_second") || contentValues2.containsKey("due_date_period") || contentValues2.containsKey("due_date_absolute_time_ms")) {
            Long a = aowr.m69717a(getContext(), contentValues2.getAsInteger("due_date_year"), contentValues2.getAsInteger("due_date_month"), contentValues2.getAsInteger("due_date_day"), contentValues2.getAsInteger("due_date_hour"), contentValues2.getAsInteger("due_date_minute"), contentValues2.getAsInteger("due_date_second"), contentValues2.getAsInteger("due_date_period"), contentValues2.getAsLong("due_date_absolute_time_ms"), (CustomizedSnoozePreset) m92243g().get(num));
            if (a == null) {
                contentValues2.putNull("due_date_millis");
            } else {
                contentValues2.put("due_date_millis", a);
            }
        }
    }

    /* JADX INFO: finally extract failed */
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
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014e, code lost:
        if (r4.booleanValue() == false) goto L_0x0150;
     */
    /* renamed from: a */
    public final int mo7298a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Cursor query;
        Long l;
        long j;
        boolean z;
        ContentValues contentValues2 = contentValues;
        String str2 = str;
        String[] strArr2 = strArr;
        this.f107214j = sQLiteDatabase;
        m92238a(contentValues2);
        int match = f107205b.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr2 = new String[]{uri.getLastPathSegment()};
                str2 = "_id=?";
            }
            int update = this.f107214j.update("account", contentValues2, str2, strArr2);
            if ((contentValues2.containsKey("morning_customized_time") || contentValues2.containsKey("afternoon_customized_time") || contentValues2.containsKey("evening_customized_time")) && (query = this.f107214j.query("account", new String[]{"_id"}, str2, strArr2, null, null, null)) != null) {
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    try {
                        arrayList.add(Long.valueOf(query.getLong(0)));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                if (!arrayList.isEmpty()) {
                    this.f107217m.addAll(arrayList);
                }
            }
            return update;
        } else if (match == 200 || match == 201) {
            if (match == 201) {
                strArr2 = new String[]{uri.getLastPathSegment()};
                str2 = "_id=?";
            }
            return m92235a(contentValues2, str2, strArr2);
        } else if (match == 300 || match == 301) {
            if (match == 301) {
                strArr2 = new String[]{uri.getLastPathSegment()};
                str2 = "_id=?";
            }
            if (contentValues2.containsKey("state")) {
                contentValues2.remove("state");
            }
            if (contentValues.size() != 0) {
                return this.f107214j.update("notification", contentValues2, str2, strArr2);
            }
            return 0;
        } else if (match == 600 || match == 601) {
            if (match == 601) {
                strArr2 = new String[]{uri.getLastPathSegment()};
                str2 = "_id=?";
            }
            return this.f107214j.update("operation", contentValues2, str2, strArr2);
        } else {
            String str3 = "due_date_millis";
            switch (match) {
                case 203:
                    String str4 = str3;
                    this.f107219o = true;
                    int i = 5;
                    int i2 = 6;
                    int i3 = 7;
                    Cursor query2 = this.f107214j.query("reminders", new String[]{"_id", "account_id", "due_date_year", "due_date_month", "due_date_day", "due_date_hour", "due_date_minute", "due_date_second", "due_date_period", "due_date_absolute_time_ms"}, null, null, null, null, null);
                    if (query2 == null) {
                        return 0;
                    }
                    C1223np g = m92243g();
                    int i4 = 0;
                    while (query2.moveToNext()) {
                        try {
                            long j2 = query2.getLong(0);
                            Long a = aowr.m69717a(getContext(), aows.m69726b(query2, 2), aows.m69726b(query2, 3), aows.m69726b(query2, 4), aows.m69726b(query2, i), aows.m69726b(query2, i2), aows.m69726b(query2, i3), aows.m69726b(query2, 8), aows.m69725a(query2, 9), (CustomizedSnoozePreset) g.get(Integer.valueOf(query2.getInt(1))));
                            ContentValues contentValues3 = new ContentValues();
                            if (a != null) {
                                contentValues3.put(str4, a);
                            } else {
                                contentValues3.putNull(str4);
                            }
                            String valueOf = String.valueOf(a);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                            sb.append("Re-index reminder ");
                            sb.append(j2);
                            sb.append(" to new time:");
                            sb.append(valueOf);
                            sb.toString();
                            i4 += this.f107214j.update("reminders", contentValues3, "_id=?", new String[]{String.valueOf(j2)});
                            i = 5;
                            i2 = 6;
                            i3 = 7;
                        } catch (Throwable th2) {
                            query2.close();
                            throw th2;
                        }
                    }
                    query2.close();
                    return i4;
                case 204:
                    Boolean asBoolean = contentValues2.getAsBoolean("recurrence_exceptional");
                    if (asBoolean == null || !asBoolean.booleanValue()) {
                        String str5 = str3;
                        String str6 = "recurrence_exceptional";
                        Cursor query3 = this.f107214j.query("reminders", null, str, strArr, null, null, null);
                        if (query3 != null) {
                            try {
                                if (query3.getCount() == 1) {
                                    query3.moveToFirst();
                                    String str7 = str6;
                                    if (!(query3.getInt(query3.getColumnIndex(str7)) == 1 || query3.getString(query3.getColumnIndex("recurrence_id")) == null || query3.getInt(query3.getColumnIndex("recurrence_master")) == 1)) {
                                        Boolean asBoolean2 = contentValues2.getAsBoolean("due_date_unspecified_future_time");
                                        if (asBoolean2 != null) {
                                            break;
                                        }
                                        Long asLong = contentValues2.getAsLong(str5);
                                        if (asLong == null || asLong.longValue() < System.currentTimeMillis()) {
                                            String[] strArr3 = f107213q;
                                            int length = strArr3.length;
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 < length) {
                                                    String str8 = strArr3[i5];
                                                    if (!str8.equals(str7) && !str8.equals("recurrence_id") && !str8.equals("recurrence_master") && !str8.equals("archived") && !str8.equals("archived_time_ms") && !str8.equals("deleted")) {
                                                        int columnIndex = query3.getColumnIndex(str8);
                                                        int type = query3.getType(columnIndex);
                                                        if (type != 0) {
                                                            if (type == 1) {
                                                                Object obj = contentValues2.get(str8);
                                                                if (obj == null || !(obj instanceof Boolean)) {
                                                                    l = contentValues2.getAsLong(str8);
                                                                } else {
                                                                    if (!((Boolean) obj).booleanValue()) {
                                                                        j = 0;
                                                                    } else {
                                                                        j = 1;
                                                                    }
                                                                    l = Long.valueOf(j);
                                                                }
                                                                if (l != null && !l.equals(Long.valueOf(query3.getLong(columnIndex)))) {
                                                                }
                                                            } else if (type == 2) {
                                                                Float asFloat = contentValues2.getAsFloat(str8);
                                                                if (asFloat != null && !asFloat.equals(Float.valueOf(query3.getFloat(columnIndex)))) {
                                                                }
                                                            } else if (type == 3) {
                                                                String asString = contentValues2.getAsString(str8);
                                                                if (asString != null && !asString.equals(query3.getString(columnIndex))) {
                                                                }
                                                            } else if (type == 4) {
                                                                byte[] asByteArray = contentValues2.getAsByteArray(str8);
                                                                if (asByteArray != null && Arrays.equals(asByteArray, query3.getBlob(columnIndex))) {
                                                                }
                                                            }
                                                        } else if (contentValues2.get(str8) != null) {
                                                        }
                                                    }
                                                    i5++;
                                                }
                                            }
                                        }
                                        contentValues2.put(str7, (Boolean) true);
                                    }
                                }
                            } finally {
                                query3.close();
                            }
                        }
                    }
                    return m92235a(contentValues2, str2, strArr2);
                case 205:
                    String lastPathSegment = uri.getLastPathSegment();
                    Cursor query4 = this.f107214j.query("reminders LEFT OUTER JOIN notification ON reminders._id = notification._id", new String[]{"state"}, "notification._id=?", new String[]{lastPathSegment}, null, null, null);
                    if (query4 != null) {
                        try {
                            if (query4.moveToFirst()) {
                                Integer b = aows.m69726b(query4, 0);
                                if (b == null || b.intValue() != 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    String[] strArr4 = {lastPathSegment};
                                    ContentValues contentValues4 = new ContentValues();
                                    contentValues4.put("state", (Integer) 2);
                                    contentValues4.put("fire_time", Long.valueOf(System.currentTimeMillis()));
                                    this.f107214j.update("notification", contentValues4, "_id=?", strArr4);
                                    this.f107216l.add(Long.valueOf(lastPathSegment));
                                    return m92236a("_id=?", strArr4);
                                }
                            } else {
                                query4.close();
                            }
                        } finally {
                            query4.close();
                        }
                    }
                    String valueOf2 = String.valueOf(lastPathSegment);
                    aowu.m69736c("RemindersProvider", valueOf2.length() == 0 ? new String("Asked to fire a reminder that should not be fired, id=") : "Asked to fire a reminder that should not be fired, id=".concat(valueOf2), new Object[0]);
                    return 0;
                case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                    return m92236a(str2, strArr2);
                default:
                    return 0;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7299a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        this.f107214j = sQLiteDatabase;
        int match = f107205b.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.f107214j.delete("account", str, strArr);
        } else if (match == 200 || match == 201) {
            if (match == 201) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            sdo.checkIfNull((Object) str, (Object) "Cannot delete reminders with null selection");
            return this.f107214j.delete("reminders", str, strArr);
        } else if (match == 300 || match == 301) {
            if (match == 301) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.f107214j.delete("notification", str, strArr);
        } else if (match == 600 || match == 601) {
            if (match == 601) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.f107214j.delete("operation", str, strArr);
        } else if (match != 700 && match != 701) {
            return 0;
        } else {
            if (match == 701) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.f107214j.delete("place_alias", str, strArr);
        }
    }

    /* renamed from: a */
    public final Cursor mo7301a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        String[] strArr5;
        String str5;
        String[] strArr6;
        String str6;
        String[] strArr7;
        String str7;
        int match = f107205b.match(uri);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        int i = Build.VERSION.SDK_INT;
        sQLiteQueryBuilder.setStrict(true);
        if (match == 100 || match == 101) {
            if (match == 101) {
                str3 = "_id=?";
                strArr3 = new String[]{uri.getLastPathSegment()};
            } else {
                str3 = str;
                strArr3 = strArr2;
            }
            sQLiteQueryBuilder.setTables("account");
            sQLiteQueryBuilder.setProjectionMap(f107206c);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str3, strArr3, null, null, str2);
        } else if (match == 200 || match == 201) {
            if (match == 201) {
                str4 = "reminders._id=?";
                strArr4 = new String[]{uri.getLastPathSegment()};
            } else {
                str4 = str;
                strArr4 = strArr2;
            }
            sQLiteQueryBuilder.setTables("reminders");
            sQLiteQueryBuilder.setProjectionMap(f107207d);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str4, strArr4, null, null, str2);
        } else if (match == 400) {
            sQLiteQueryBuilder.setTables("reminders LEFT OUTER JOIN account ON reminders.account_id = account._id");
            sQLiteQueryBuilder.setProjectionMap(f107210g);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, null);
        } else if (match == 600 || match == 601) {
            if (match == 601) {
                str5 = "_id=?";
                strArr5 = new String[]{uri.getLastPathSegment()};
            } else {
                str5 = str;
                strArr5 = strArr2;
            }
            sQLiteQueryBuilder.setTables("operation");
            sQLiteQueryBuilder.setProjectionMap(f107211h);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str5, strArr5, null, null, str2);
        } else if (match == 700 || match == 701) {
            if (match == 701) {
                str6 = "_id=?";
                strArr6 = new String[]{uri.getLastPathSegment()};
            } else {
                str6 = str;
                strArr6 = strArr2;
            }
            sQLiteQueryBuilder.setTables("place_alias");
            sQLiteQueryBuilder.setProjectionMap(f107212i);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str6, strArr6, null, null, str2);
        } else {
            switch (match) {
                case 300:
                case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                    if (match == 301) {
                        str7 = "notification._id=?";
                        strArr7 = new String[]{uri.getLastPathSegment()};
                    } else {
                        str7 = str;
                        strArr7 = strArr2;
                    }
                    sQLiteQueryBuilder.setTables("notification");
                    sQLiteQueryBuilder.setProjectionMap(f107208e);
                    return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str7, strArr7, null, null, str2);
                case 302:
                    sQLiteQueryBuilder.setTables("reminders LEFT OUTER JOIN notification ON reminders._id = notification._id");
                    sQLiteQueryBuilder.setProjectionMap(f107209f);
                    return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
                default:
                    return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo7302a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        Uri uri2;
        this.f107214j = sQLiteDatabase;
        m92238a(contentValues);
        int match = f107205b.match(uri);
        if (match == 100) {
            return m92237a("account", uri, contentValues);
        }
        if (match == 200) {
            return m92241b(contentValues);
        }
        if (match == 202) {
            sdo.m34975b(contentValues.containsKey("account_id"), "Missing account_id when upserting reminder");
            sdo.m34975b(contentValues.containsKey("client_assigned_id"), "Missing client_assigned_id when upserting reminder");
            String[] strArr = {contentValues.getAsString("client_assigned_id"), String.valueOf(contentValues.getAsInteger("account_id"))};
            Cursor query = this.f107214j.query("reminders", new String[]{"_id"}, "client_assigned_id=? AND account_id=?", strArr, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        long j = query.getLong(0);
                        m92235a(contentValues, "_id=?", new String[]{String.valueOf(j)});
                        uri2 = ContentUris.withAppendedId(aotd.f83574a, j);
                        query.close();
                        return uri2;
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            uri2 = m92241b(contentValues);
            query.close();
            return uri2;
        } else if (match != 600) {
            return null;
        } else {
            return m92237a("operation", uri, contentValues);
        }
    }
}
