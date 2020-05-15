package p000;

import android.util.Log;
import com.google.android.gms.reminders.AccountState;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.gms.reminders.service.RemindersChimeraService;
import java.util.Collections;
import java.util.List;

/* renamed from: aouy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aouy extends aosv implements aaai {

    /* renamed from: a */
    final String f83653a;

    /* renamed from: b */
    final String f83654b;

    /* renamed from: c */
    final RemindersChimeraService f83655c;

    /* renamed from: d */
    final aaag f83656d;

    public aouy(RemindersChimeraService remindersChimeraService, aaag aaag, String str, String str2) {
        this.f83655c = remindersChimeraService;
        this.f83656d = aaag;
        this.f83654b = str;
        this.f83653a = str2;
    }

    /* renamed from: a */
    public final void mo46833a() {
        this.f83656d.mo16659a(this.f83655c, new aovl(this, this.f83653a));
    }

    /* renamed from: b */
    public final void mo46845b(aost aost) {
        this.f83656d.mo16659a(this.f83655c, new aovs(aost, this.f83653a));
    }

    /* renamed from: c */
    public final void mo46850c(aost aost) {
        this.f83656d.mo16659a(this.f83655c, new aovr(aost, this.f83653a));
    }

    /* renamed from: d */
    public final void mo46853d(aost aost) {
        this.f83656d.mo16659a(this.f83655c, new aovq(aost, this.f83653a));
    }

    /* renamed from: a */
    public final void mo46834a(aost aost) {
        this.f83656d.mo16659a(this.f83655c, new aovf(this, aost, this.f83653a));
    }

    /* renamed from: b */
    public final void mo46846b(aost aost, ReindexDueDatesOptions reindexDueDatesOptions) {
        this.f83656d.mo16659a(this.f83655c, new aovw(aost, this.f83653a, this.f83654b, reindexDueDatesOptions));
    }

    /* renamed from: c */
    public final void mo46851c(aost aost, TaskEntity taskEntity) {
        this.f83656d.mo16659a(this.f83655c, new aovm(aost, this.f83653a, this.f83654b, taskEntity));
    }

    /* renamed from: d */
    public final void mo46854d(aost aost, TaskEntity taskEntity) {
        this.f83656d.mo16659a(this.f83655c, new aovv(aost, this.f83653a, this.f83654b, taskEntity));
    }

    /* renamed from: a */
    public final void mo46835a(aost aost, AccountState accountState) {
        this.f83656d.mo16659a(this.f83655c, new aovx(aost, this.f83653a, accountState));
    }

    /* renamed from: b */
    public final void mo46847b(aost aost, TaskEntity taskEntity) {
        mo46844a(aost, Collections.singletonList(taskEntity));
    }

    /* renamed from: c */
    public final void mo46852c(aost aost, String str, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions) {
        this.f83656d.mo16659a(this.f83655c, new aovu(aost, this.f83653a, this.f83654b, str, taskEntity, updateRecurrenceOptions));
    }

    /* renamed from: b */
    public final void mo46848b(aost aost, TaskIdEntity taskIdEntity) {
        this.f83656d.mo16659a(this.f83655c, new aovi(aost, this.f83653a, this.f83654b, taskIdEntity));
    }

    /* renamed from: a */
    public final void mo46836a(aost aost, LoadRemindersOptions loadRemindersOptions) {
        try {
            this.f83656d.mo16659a(this.f83655c, new aovt(aost, this.f83653a, loadRemindersOptions));
        } catch (NullPointerException e) {
            throw new NullPointerException(Log.getStackTraceString(e));
        }
    }

    /* renamed from: b */
    public final void mo46849b(aost aost, String str, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions) {
        this.f83656d.mo16659a(this.f83655c, new aovj(aost, this.f83653a, this.f83654b, str, taskEntity, updateRecurrenceOptions));
    }

    /* renamed from: a */
    public final void mo46837a(aost aost, ReindexDueDatesOptions reindexDueDatesOptions) {
        this.f83656d.mo16659a(this.f83655c, new aovk(aost, this.f83653a, reindexDueDatesOptions));
    }

    /* renamed from: a */
    public final void mo46838a(aost aost, CustomizedSnoozePresetEntity customizedSnoozePresetEntity) {
        this.f83656d.mo16659a(this.f83655c, new aovy(aost, this.f83653a, this.f83654b, customizedSnoozePresetEntity));
    }

    /* renamed from: a */
    public final void mo46839a(aost aost, TaskEntity taskEntity) {
        mo46840a(aost, taskEntity, CreateReminderOptionsInternal.f107033a);
    }

    /* renamed from: a */
    public final void mo46840a(aost aost, TaskEntity taskEntity, CreateReminderOptionsInternal createReminderOptionsInternal) {
        this.f83656d.mo16659a(this.f83655c, new aovn(aost, this.f83653a, this.f83654b, taskEntity, createReminderOptionsInternal));
    }

    /* renamed from: a */
    public final void mo46841a(aost aost, TaskIdEntity taskIdEntity) {
        this.f83656d.mo16659a(this.f83655c, new aovp(aost, this.f83653a, this.f83654b, taskIdEntity));
    }

    /* renamed from: a */
    public final void mo46842a(aost aost, String str, UpdateRecurrenceOptions updateRecurrenceOptions) {
        this.f83656d.mo16659a(this.f83655c, new aovo(aost, this.f83653a, this.f83654b, str, updateRecurrenceOptions));
    }

    /* renamed from: a */
    public final void mo46843a(aost aost, String str, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions) {
        this.f83656d.mo16659a(this.f83655c, new aovz(aost, this.f83653a, this.f83654b, str, taskEntity, updateRecurrenceOptions));
    }

    /* renamed from: a */
    public final void mo46844a(aost aost, List list) {
        this.f83656d.mo16659a(this.f83655c, new aovh(aost, this.f83653a, this.f83654b, list));
    }
}
