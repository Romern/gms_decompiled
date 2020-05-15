package p000;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.CustomizedSnoozePreset;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.gms.reminders.model.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: aovg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aovg extends aove {

    /* renamed from: b */
    protected final String f83670b;

    /* renamed from: c */
    protected final String f83671c;

    /* renamed from: d */
    protected aosi f83672d;

    /* renamed from: e */
    protected CustomizedSnoozePreset f83673e;

    /* renamed from: f */
    protected Context f83674f;

    /* renamed from: g */
    protected final aost f83675g;

    public aovg(aost aost, String str, String str2, String str3) {
        super(aost, str3);
        this.f83675g = aost;
        this.f83670b = str;
        this.f83671c = str2;
    }

    /* renamed from: a */
    protected static final String m69616a(UpdateRecurrenceOptions updateRecurrenceOptions) {
        int i = updateRecurrenceOptions.f107053a;
        String str = "account_id=? AND recurrence_id=?";
        if (updateRecurrenceOptions.f107054b) {
            str = aowt.m69729a(str, "recurrence_exceptional=?");
        }
        return i == 1 ? aowt.m69729a(str, "due_date_millis>=?") : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo46933a() {
        return 13;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo46936a(ArrayList arrayList);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final blrk mo46944b() {
        bxvd da = blrk.f127482d.mo74144da();
        String str = this.f83671c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blrk blrk = (blrk) da.f164949b;
        str.getClass();
        blrk.f127484a |= 2;
        blrk.f127486c = str;
        return (blrk) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo46945b(ArrayList arrayList);

    /* renamed from: a */
    protected static void m69617a(bxvd bxvd) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blrj blrj = (blrj) bxvd.f164949b;
        blrj blrj2 = blrj.f127456w;
        blrj.f127476s = null;
        int i = blrj.f127458a & -262145;
        blrj.f127458a = i;
        blrj.f127459b = null;
        int i2 = i & -2;
        blrj.f127458a = i2;
        blrj.f127461d = null;
        int i3 = i2 & -5;
        blrj.f127458a = i3;
        blrj.f127470m = null;
        int i4 = i3 & -4097;
        blrj.f127458a = i4;
        blrj.f127472o = null;
        int i5 = i4 & -16385;
        blrj.f127458a = i5;
        blrj.f127458a = i5 & -129;
        blrj.f127466i = false;
    }

    /* renamed from: a */
    private final boolean m69618a(DateTime dateTime) {
        DateTime a = aouq.m69546a(System.currentTimeMillis(), TimeZone.getDefault());
        if (dateTime.mo58634g() == null && dateTime.mo58635h() != null) {
            aotm aotm = new aotm(dateTime);
            aotm.mo46875a(aowr.m69716a(this.f83674f, this.f83673e, dateTime.mo58635h()));
            dateTime = aotm.mo46874a();
        }
        return aouq.m69552b(dateTime, a);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean
     arg types: [com.google.android.gms.reminders.model.Task, int]
     candidates:
      aovg.a(int, bxxc):android.content.ContentProviderOperation
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskEntity):java.lang.String
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskId):void
      aovg.a(java.util.ArrayList, java.lang.String):void
      aovg.a(android.content.Context, boolean):boolean
      aovg.a(java.lang.String, com.google.android.gms.reminders.UpdateRecurrenceOptions):java.lang.String[]
      aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46946b(ArrayList arrayList, TaskEntity taskEntity) {
        RecurrenceEnd recurrenceEnd;
        Iterator it;
        double d;
        ArrayList arrayList2 = arrayList;
        TaskEntity taskEntity2 = taskEntity;
        Long l = taskEntity2.f107174d;
        Task task = taskEntity2;
        if (l == null) {
            aoua aoua = new aoua(taskEntity2);
            aoua.f83607b = Long.valueOf(System.currentTimeMillis());
            task = aoua.mo46899a();
        }
        Recurrence c = task.mo58718v().mo58677c();
        aott aott = new aott(c);
        sdo.m34959a(c);
        sdo.m34959a(c.mo58686f());
        sdo.m34959a(c.mo58686f().mo58693c());
        RecurrenceEnd g = c.mo58687g();
        if (g == null || g.mo58672d() == null) {
            DateTime a = aouq.m69547a(c.mo58686f().mo58693c(), aout.m69570a(c.mo58683c().intValue()));
            if (!(g == null || g.mo58671c() == null || aouq.m69544a(c.mo58687g().mo58671c(), a) >= 0)) {
                a = c.mo58687g().mo58671c();
            }
            aotv aotv = new aotv();
            aotv.f83604a = a != null ? (DateTime) a.mo7556bF() : null;
            recurrenceEnd = aotv.mo46891a();
        } else {
            aotv aotv2 = new aotv();
            int intValue = g.mo58672d().intValue();
            int intValue2 = c.mo58683c().intValue();
            if (intValue2 == 0) {
                d = 1.0d;
            } else if (intValue2 == 1) {
                d = 7.0d;
            } else if (intValue2 == 2) {
                d = 31.0d;
            } else if (intValue2 == 3) {
                d = 365.0d;
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Unrecognized frequency: ");
                sb.append(intValue2);
                throw new IllegalStateException(sb.toString());
            }
            double a2 = (double) aout.m69570a(intValue2);
            Double.isNaN(a2);
            aotv2.f83605b = Integer.valueOf(Math.min(intValue, (int) (a2 / d)));
            recurrenceEnd = aotv2.mo46891a();
        }
        aott.f83599d = recurrenceEnd;
        RecurrenceEntity recurrenceEntity = new RecurrenceEntity(aott.f83596a, aott.f83597b, aott.f83598c, aott.f83599d, aott.f83600e, aott.f83601f, aott.f83602g, aott.f83603h, true);
        sdo.m34959a(recurrenceEntity);
        sdo.m34959a(recurrenceEntity.f107158a);
        int intValue3 = recurrenceEntity.f107158a.intValue();
        if (intValue3 == 0) {
            it = new aour(recurrenceEntity);
        } else if (intValue3 == 1) {
            it = new aouw(recurrenceEntity);
        } else if (intValue3 == 2) {
            it = new aous(recurrenceEntity);
        } else if (intValue3 == 3) {
            it = new aoux(recurrenceEntity);
        } else {
            String valueOf = String.valueOf(recurrenceEntity.f107158a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb2.append("Unrecognized frequency: ");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        ArrayList arrayList3 = new ArrayList();
        while (it.hasNext()) {
            DateTime dateTime = (DateTime) it.next();
            if (m69618a(dateTime)) {
                String d2 = task.mo58718v().mo58678d();
                aotm aotm = new aotm(dateTime);
                aotm.f83590d = null;
                if (Boolean.TRUE.equals(dateTime.mo58639l())) {
                    aotm.mo46875a((Time) null);
                    aotm.mo46876a((Integer) null);
                }
                long a3 = aouq.m69545a(aotm.mo46874a());
                StringBuilder sb3 = new StringBuilder(String.valueOf(d2).length() + 21);
                sb3.append(d2);
                sb3.append("/");
                sb3.append(a3);
                String sb4 = sb3.toString();
                aoua aoua2 = new aoua(task);
                aouc aouc = new aouc();
                aouc.f83626a = sb4;
                aoua2.f83606a = new TaskIdEntity(aouc.f83626a, null);
                aoua2.mo46900a(dateTime);
                ContentValues a4 = aowv.m69737a(new TaskEntity(aoua2.mo46899a()));
                a4.put("account_id", Long.valueOf(this.f83672d.f83507a));
                a4.put("snoozed", Boolean.valueOf(mo46941a(task, true)));
                arrayList2.add(ContentProviderOperation.newInsert(aotd.f83574a).withValues(a4).build());
                arrayList3.add(dateTime);
            }
        }
        if (!arrayList3.isEmpty()) {
            aoua aoua3 = new aoua(task);
            aoua3.mo46900a((DateTime) arrayList3.get(0));
            Task a5 = aoua3.mo46899a();
            TaskEntity taskEntity3 = (TaskEntity) a5;
            String d3 = taskEntity3.f107187q.mo58678d();
            String a6 = aouu.m69571a(d3);
            ContentValues a7 = aowv.m69737a(taskEntity3);
            a7.put("account_id", Long.valueOf(this.f83672d.f83507a));
            a7.put("snoozed", Boolean.valueOf(mo46941a(a5, true)));
            a7.put("client_assigned_id", a6);
            aowv.m69738a(a7, "recurrence_master", Boolean.TRUE);
            mo46938a(arrayList2, d3);
            arrayList2.add(ContentProviderOperation.newInsert(aotd.f83574a).withValues(a7).build());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ContentProviderOperation mo46934a(int i, bxxc bxxc) {
        return ContentProviderOperation.newInsert(aota.f83571a).withValue("account_id", Long.valueOf(this.f83672d.f83507a)).withValue("operation_api", Integer.valueOf(i)).withValue("operation_request", bxxc.mo73642k()).build();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean
     arg types: [com.google.android.gms.reminders.model.TaskEntity, int]
     candidates:
      aovg.a(int, bxxc):android.content.ContentProviderOperation
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskEntity):java.lang.String
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskId):void
      aovg.a(java.util.ArrayList, java.lang.String):void
      aovg.a(android.content.Context, boolean):boolean
      aovg.a(java.lang.String, com.google.android.gms.reminders.UpdateRecurrenceOptions):java.lang.String[]
      aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo46935a(ArrayList arrayList, TaskEntity taskEntity) {
        ContentValues a = aowv.m69737a(taskEntity);
        String asString = a.getAsString("client_assigned_id");
        if (TextUtils.isEmpty(asString)) {
            asString = UUID.randomUUID().toString();
            a.put("client_assigned_id", asString);
        }
        a.put("account_id", Long.valueOf(this.f83672d.f83507a));
        a.put("snoozed", Boolean.valueOf(mo46941a((Task) taskEntity, false)));
        if (a.getAsLong("created_time_millis") == null) {
            a.put("created_time_millis", Long.valueOf(System.currentTimeMillis()));
        }
        arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=? AND deleted=?", new String[]{asString, String.valueOf(this.f83672d.f83507a), "0"}).withExpectedCount(0).build());
        arrayList.add(ContentProviderOperation.newInsert(aotd.f83574a).withValues(a).build());
        return asString;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aovg.a(android.content.Context, boolean):boolean
     arg types: [android.content.Context, int]
     candidates:
      aovg.a(int, bxxc):android.content.ContentProviderOperation
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskEntity):java.lang.String
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskId):void
      aovg.a(java.util.ArrayList, java.lang.String):void
      aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean
      aovg.a(java.lang.String, com.google.android.gms.reminders.UpdateRecurrenceOptions):java.lang.String[]
      aovg.a(android.content.Context, boolean):boolean */
    /* renamed from: a */
    public void mo6502a(Context context) {
        mo46940a(context, true);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f83675g.mo46830a(status);
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
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46937a(ArrayList arrayList, TaskId taskId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("deleted", (Integer) 1);
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withValues(contentValues).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", mo46942a(taskId)).build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46938a(ArrayList arrayList, String str) {
        String a = aouu.m69571a(str);
        arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=? AND deleted=?", new String[]{a, String.valueOf(this.f83672d.f83507a), "0"}).withExpectedCount(0).build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46939a(ArrayList arrayList, String str, UpdateRecurrenceOptions updateRecurrenceOptions) {
        if (updateRecurrenceOptions.f107053a != 0 && updateRecurrenceOptions.f107055c != null) {
            DateTime a = aouq.m69546a(updateRecurrenceOptions.f107055c.longValue(), TimeZone.getDefault());
            String[] strArr = {String.valueOf(this.f83672d.f83507a), str, "1", "0"};
            ContentValues contentValues = new ContentValues();
            aowy.m69756a(contentValues, aoww.m69741a(a), "recurrence_end_");
            arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withValues(contentValues).withSelection("account_id=? AND recurrence_id=? AND recurrence_master=? AND deleted=?", strArr).build());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo46940a(Context context, boolean z) {
        int i;
        new Object[1][0] = this;
        this.f83674f = context;
        aosi a = aosf.m69445a(context, this.f83670b);
        this.f83672d = a;
        if (a == null) {
            this.f83675g.mo46830a(new Status(6000));
            return false;
        }
        String str = this.f83670b;
        Cursor query = context.getContentResolver().query(aosy.f83568a, new String[]{"morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, "account_name=?", new String[]{str}, null);
        CustomizedSnoozePreset customizedSnoozePreset = null;
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    aotj aotj = new aotj();
                    aotj.mo46869c(aosd.m69443a(query.getLong(0)));
                    aotj.mo46867a(aosd.m69443a(query.getLong(1)));
                    aotj.mo46868b(aosd.m69443a(query.getLong(2)));
                    customizedSnoozePreset = aotj.mo46866a();
                }
            } finally {
                query.close();
            }
        }
        this.f83673e = customizedSnoozePreset;
        ArrayList arrayList = new ArrayList();
        mo46936a(arrayList);
        mo46945b(arrayList);
        if (!sgq.m35236a(this.f83674f.getContentResolver(), arrayList, "RemindersApiOp")) {
            i = mo46933a();
        } else {
            i = 0;
        }
        this.f83675g.mo46830a(new Status(i));
        if (z && i == 0) {
            aowf.m69693a(this.f83672d);
        } else if (i != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo46941a(Task task, boolean z) {
        if (task.mo58710l() != null) {
            return task.mo58710l().booleanValue();
        }
        if (task.mo58707i() != null && task.mo58707i().booleanValue()) {
            return false;
        }
        if (task.mo58708j() != null && task.mo58708j().booleanValue()) {
            return false;
        }
        if (!z) {
            boolean z2 = task.mo58712n() != null && m69618a(task.mo58712n());
            boolean z3 = (task.mo58714p() == null && task.mo58715q() == null) ? false : true;
            if (z2 || z3) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo46942a(TaskId taskId) {
        return new String[]{taskId.mo58696c(), String.valueOf(this.f83672d.f83507a)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo46943a(String str, UpdateRecurrenceOptions updateRecurrenceOptions) {
        long j;
        int i = updateRecurrenceOptions.f107053a;
        if (i == 1) {
            j = aoww.m69748b(updateRecurrenceOptions);
        } else {
            j = 0;
        }
        String[] strArr = {String.valueOf(this.f83672d.f83507a), str};
        if (updateRecurrenceOptions.f107054b) {
            strArr = aowt.m69731a(strArr, new String[]{"0"});
        }
        if (i != 1) {
            return strArr;
        }
        return aowt.m69731a(strArr, new String[]{String.valueOf(j)});
    }
}
