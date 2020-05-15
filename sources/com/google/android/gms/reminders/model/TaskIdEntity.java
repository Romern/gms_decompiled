package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TaskIdEntity extends AbstractSafeParcelable implements TaskId {
    public static final Parcelable.Creator CREATOR = new aoud();

    /* renamed from: a */
    public final String f107193a;

    /* renamed from: b */
    public final String f107194b;

    public TaskIdEntity(TaskId taskId) {
        this(taskId.mo58696c(), taskId.mo58697d());
    }

    /* renamed from: a */
    public static int m92205a(TaskId taskId) {
        return Arrays.hashCode(new Object[]{taskId.mo58696c(), taskId.mo58697d()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo58696c() {
        return this.f107193a;
    }

    /* renamed from: d */
    public final String mo58697d() {
        return this.f107194b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this != obj) {
            return m92206a(this, (TaskId) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92205a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoud.m69521a(this, parcel);
    }

    public TaskIdEntity(String str, String str2) {
        this.f107193a = str;
        this.f107194b = str2;
    }

    /* renamed from: a */
    public static boolean m92206a(TaskId taskId, TaskId taskId2) {
        return sdg.m34949a(taskId.mo58696c(), taskId2.mo58696c()) && sdg.m34949a(taskId.mo58697d(), taskId2.mo58697d());
    }
}
