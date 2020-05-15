package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TaskIdRef extends aotf implements TaskId {
    public TaskIdRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new TaskIdEntity(this);
    }

    /* renamed from: c */
    public final String mo58696c() {
        return mo25151d(mo46858k("client_assigned_id"));
    }

    /* renamed from: d */
    public final String mo58697d() {
        return mo25151d(mo46858k("client_assigned_thread_id"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this != obj) {
            return TaskIdEntity.m92206a(this, (TaskId) obj);
        }
        return true;
    }

    public final int hashCode() {
        return TaskIdEntity.m92205a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoud.m69521a(new TaskIdEntity(this), parcel);
    }
}
