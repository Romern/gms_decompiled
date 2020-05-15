package p000;

import android.os.IInterface;
import com.google.android.gms.reminders.AccountState;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.List;

/* renamed from: aosw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aosw extends IInterface {
    /* renamed from: a */
    void mo46833a();

    /* renamed from: a */
    void mo46834a(aost aost);

    /* renamed from: a */
    void mo46835a(aost aost, AccountState accountState);

    /* renamed from: a */
    void mo46836a(aost aost, LoadRemindersOptions loadRemindersOptions);

    /* renamed from: a */
    void mo46837a(aost aost, ReindexDueDatesOptions reindexDueDatesOptions);

    /* renamed from: a */
    void mo46838a(aost aost, CustomizedSnoozePresetEntity customizedSnoozePresetEntity);

    /* renamed from: a */
    void mo46839a(aost aost, TaskEntity taskEntity);

    /* renamed from: a */
    void mo46840a(aost aost, TaskEntity taskEntity, CreateReminderOptionsInternal createReminderOptionsInternal);

    /* renamed from: a */
    void mo46841a(aost aost, TaskIdEntity taskIdEntity);

    /* renamed from: a */
    void mo46842a(aost aost, String str, UpdateRecurrenceOptions updateRecurrenceOptions);

    /* renamed from: a */
    void mo46843a(aost aost, String str, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions);

    /* renamed from: a */
    void mo46844a(aost aost, List list);

    /* renamed from: b */
    void mo46845b(aost aost);

    /* renamed from: b */
    void mo46846b(aost aost, ReindexDueDatesOptions reindexDueDatesOptions);

    /* renamed from: b */
    void mo46847b(aost aost, TaskEntity taskEntity);

    /* renamed from: b */
    void mo46848b(aost aost, TaskIdEntity taskIdEntity);

    /* renamed from: b */
    void mo46849b(aost aost, String str, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions);

    /* renamed from: c */
    void mo46850c(aost aost);

    /* renamed from: c */
    void mo46851c(aost aost, TaskEntity taskEntity);

    /* renamed from: c */
    void mo46852c(aost aost, String str, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions);

    /* renamed from: d */
    void mo46853d(aost aost);

    /* renamed from: d */
    void mo46854d(aost aost, TaskEntity taskEntity);
}
