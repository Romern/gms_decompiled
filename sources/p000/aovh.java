package p000;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aovh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovh extends aovg {

    /* renamed from: i */
    private static final blrt f83676i;

    /* renamed from: h */
    private final List f83677h;

    static {
        blrq blrq = (blrq) blrt.f127524b.mo74144da();
        blrq.mo66690a(blrs.TITLE);
        blrq.mo66690a(blrs.ARCHIVED);
        blrq.mo66690a(blrs.DUE_DATE);
        blrq.mo66690a(blrs.EVENT_DATE);
        blrq.mo66690a(blrs.LOCATION);
        blrq.mo66690a(blrs.LOCATION_GROUP);
        blrq.mo66690a(blrs.LOCATION_SNOOZED_UNTIL_MS);
        blrq.mo66690a(blrs.EXTENSIONS);
        blrq.mo66690a(blrs.ARCHIVED_TIME_MS);
        blrq.mo66690a(blrs.ASSISTANCE);
        blrq.mo66690a(blrs.DELETED);
        blrq.mo66690a(blrs.PINNED);
        blrq.mo66690a(blrs.SNOOZED);
        blrq.mo66690a(blrs.SNOOZED_TIME_MILLIS);
        f83676i = (blrt) blrq.mo74062i();
    }

    public aovh(aost aost, String str, String str2, List list) {
        super(aost, str, str2, "BatchUpdateReminder");
        this.f83677h = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6002;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        if (((Boolean) aoss.f83522A.mo58455c()).booleanValue()) {
            bxvd da = blpd.f127200d.mo74144da();
            for (int i = 0; i < this.f83677h.size(); i++) {
                bxvd da2 = blpc.f127193e.mo74144da();
                blrj a = aoww.m69746a((TaskEntity) this.f83677h.get(i));
                if (a != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    blpc blpc = (blpc) da2.f164949b;
                    a.getClass();
                    blpc.f127198d = a;
                    blpc.f127195a |= 4;
                }
                blrj blrj = ((blpc) da2.f164949b).f127198d;
                if (blrj == null) {
                    blrj = blrj.f127456w;
                }
                blox blox = blrj.f127459b;
                if (blox == null) {
                    blox = blox.f127160d;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blpc blpc2 = (blpc) da2.f164949b;
                blox.getClass();
                blpc2.f127196b = blox;
                blpc2.f127195a |= 1;
                blrt blrt = f83676i;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blpc blpc3 = (blpc) da2.f164949b;
                blrt.getClass();
                blpc3.f127197c = blrt;
                blpc3.f127195a |= 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blpd blpd = (blpd) da.f164949b;
                blpc blpc4 = (blpc) da2.mo74062i();
                blpc4.getClass();
                if (!blpd.f127204c.mo73666a()) {
                    blpd.f127204c = bxvk.m124021a(blpd.f127204c);
                }
                blpd.f127204c.add(blpc4);
            }
            blrk b = mo46944b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpd blpd2 = (blpd) da.f164949b;
            b.getClass();
            blpd2.f127203b = b;
            blpd2.f127202a |= 1;
            arrayList.add(mo46934a(10, (blpd) da.mo74062i()));
            return;
        }
        for (int i2 = 0; i2 < this.f83677h.size(); i2++) {
            bxvd da3 = blru.f127527g.mo74144da();
            blrj a2 = aoww.m69746a((TaskEntity) this.f83677h.get(i2));
            if (a2 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blru blru = (blru) da3.f164949b;
                a2.getClass();
                blru.f127534f = a2;
                blru.f127529a |= 64;
            }
            blrj blrj2 = ((blru) da3.f164949b).f127534f;
            if (blrj2 == null) {
                blrj2 = blrj.f127456w;
            }
            blox blox2 = blrj2.f127459b;
            if (blox2 == null) {
                blox2 = blox.f127160d;
            }
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            blru blru2 = (blru) da3.f164949b;
            blox2.getClass();
            blru2.f127531c = blox2;
            blru2.f127529a |= 2;
            blrk b2 = mo46944b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            blru blru3 = (blru) da3.f164949b;
            b2.getClass();
            blru3.f127530b = b2;
            blru3.f127529a |= 1;
            blrt blrt2 = f83676i;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            blru blru4 = (blru) da3.f164949b;
            blrt2.getClass();
            blru4.f127532d = blrt2;
            int i3 = blru4.f127529a | 8;
            blru4.f127529a = i3;
            blru4.f127529a = i3 | 16;
            blru4.f127533e = false;
            arrayList.add(mo46934a(5, (blru) da3.mo74062i()));
        }
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
    public final void mo46936a(ArrayList arrayList) {
        for (TaskEntity taskEntity : this.f83677h) {
            TaskIdEntity taskIdEntity = taskEntity.f107171a;
            ContentValues a = aowv.m69737a(taskEntity);
            a.remove("client_assigned_id");
            a.remove("client_assigned_thread_id");
            a.remove("task_list");
            a.remove("created_time_millis");
            a.put("snoozed", Boolean.valueOf(mo46941a((Task) taskEntity, false)));
            String[] a2 = mo46942a(taskIdEntity);
            arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", a2).withExpectedCount(1).build());
            arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection(aowt.m69729a("client_assigned_id=? AND account_id=? AND deleted=0", "recurrence_master=1"), a2).withExpectedCount(0).build());
            arrayList.add(ContentProviderOperation.newUpdate(aotd.f83577d).withValues(a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", a2).build());
        }
    }
}
