package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TaskEntity extends AbstractSafeParcelable implements Task {
    public static final Parcelable.Creator CREATOR = new aoub();

    /* renamed from: a */
    public final TaskIdEntity f107171a;

    /* renamed from: b */
    public final Integer f107172b;

    /* renamed from: c */
    public final String f107173c;

    /* renamed from: d */
    public final Long f107174d;

    /* renamed from: e */
    public final Long f107175e;

    /* renamed from: f */
    public final Boolean f107176f;

    /* renamed from: g */
    public final Boolean f107177g;

    /* renamed from: h */
    public final Boolean f107178h;

    /* renamed from: i */
    public final Boolean f107179i;

    /* renamed from: j */
    public final Long f107180j;

    /* renamed from: k */
    public final DateTimeEntity f107181k;

    /* renamed from: l */
    public final DateTimeEntity f107182l;

    /* renamed from: m */
    public final LocationEntity f107183m;

    /* renamed from: n */
    public final LocationGroupEntity f107184n;

    /* renamed from: o */
    public final Long f107185o;

    /* renamed from: p */
    public final byte[] f107186p;

    /* renamed from: q */
    public final RecurrenceInfoEntity f107187q;

    /* renamed from: r */
    public final byte[] f107188r;

    /* renamed from: s */
    public final Integer f107189s;

    /* renamed from: t */
    public final ExternalApplicationLinkEntity f107190t;

    /* renamed from: u */
    public final Long f107191u;

    /* renamed from: v */
    public final Long f107192v;

    public TaskEntity(Task task) {
        this(task.mo58701c(), task.mo58702d(), task.mo58704f(), task.mo58705g(), task.mo58706h(), task.mo58707i(), task.mo58708j(), task.mo58709k(), task.mo58710l(), task.mo58711m(), task.mo58712n(), task.mo58713o(), task.mo58714p(), task.mo58715q(), task.mo58716r(), task.mo58717u(), task.mo58718v(), task.mo58719w(), task.mo58721x(), task.mo58722y(), task.mo58723z(), task.mo58700A(), false);
    }

    /* renamed from: a */
    public static int m92178a(Task task) {
        return Arrays.hashCode(new Object[]{task.mo58701c(), task.mo58702d(), task.mo58704f(), task.mo58705g(), task.mo58706h(), task.mo58707i(), task.mo58708j(), task.mo58709k(), task.mo58710l(), task.mo58711m(), task.mo58712n(), task.mo58713o(), task.mo58714p(), task.mo58715q(), task.mo58716r(), task.mo58717u(), task.mo58718v(), task.mo58719w(), task.mo58721x(), task.mo58722y(), task.mo58723z()});
    }

    /* renamed from: A */
    public final Long mo58700A() {
        return this.f107192v;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final TaskId mo58701c() {
        return this.f107171a;
    }

    /* renamed from: d */
    public final Integer mo58702d() {
        return this.f107172b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        if (this != obj) {
            return m92179a(this, (Task) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58704f() {
        return this.f107173c;
    }

    /* renamed from: g */
    public final Long mo58705g() {
        return this.f107174d;
    }

    /* renamed from: h */
    public final Long mo58706h() {
        return this.f107175e;
    }

    public final int hashCode() {
        return m92178a(this);
    }

    /* renamed from: i */
    public final Boolean mo58707i() {
        return this.f107176f;
    }

    /* renamed from: j */
    public final Boolean mo58708j() {
        return this.f107177g;
    }

    /* renamed from: k */
    public final Boolean mo58709k() {
        return this.f107178h;
    }

    /* renamed from: l */
    public final Boolean mo58710l() {
        return this.f107179i;
    }

    /* renamed from: m */
    public final Long mo58711m() {
        return this.f107180j;
    }

    /* renamed from: n */
    public final DateTime mo58712n() {
        return this.f107181k;
    }

    /* renamed from: o */
    public final DateTime mo58713o() {
        return this.f107182l;
    }

    /* renamed from: p */
    public final Location mo58714p() {
        return this.f107183m;
    }

    /* renamed from: q */
    public final LocationGroup mo58715q() {
        return this.f107184n;
    }

    /* renamed from: r */
    public final Long mo58716r() {
        return this.f107185o;
    }

    /* renamed from: u */
    public final byte[] mo58717u() {
        return this.f107186p;
    }

    /* renamed from: v */
    public final RecurrenceInfo mo58718v() {
        return this.f107187q;
    }

    /* renamed from: w */
    public final byte[] mo58719w() {
        return this.f107188r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoub.m69520a(this, parcel, i);
    }

    /* renamed from: x */
    public final Integer mo58721x() {
        return this.f107189s;
    }

    /* renamed from: y */
    public final ExternalApplicationLink mo58722y() {
        return this.f107190t;
    }

    /* renamed from: z */
    public final Long mo58723z() {
        return this.f107191u;
    }

    public TaskEntity(TaskId taskId, Integer num, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l3, DateTime dateTime, DateTime dateTime2, Location location, LocationGroup locationGroup, Long l4, byte[] bArr, RecurrenceInfo recurrenceInfo, byte[] bArr2, Integer num2, ExternalApplicationLink externalApplicationLink, Long l5, Long l6, boolean z) {
        TaskIdEntity taskIdEntity;
        DateTimeEntity dateTimeEntity;
        DateTimeEntity dateTimeEntity2;
        LocationEntity locationEntity;
        LocationGroupEntity locationGroupEntity;
        RecurrenceInfoEntity recurrenceInfoEntity;
        TaskId taskId2 = taskId;
        DateTime dateTime3 = dateTime;
        DateTime dateTime4 = dateTime2;
        Location location2 = location;
        LocationGroup locationGroup2 = locationGroup;
        RecurrenceInfo recurrenceInfo2 = recurrenceInfo;
        ExternalApplicationLink externalApplicationLink2 = externalApplicationLink;
        this.f107172b = num;
        this.f107173c = str;
        this.f107174d = l;
        this.f107175e = l2;
        this.f107176f = bool;
        this.f107177g = bool2;
        this.f107178h = bool3;
        this.f107179i = bool4;
        this.f107180j = l3;
        this.f107185o = l4;
        this.f107186p = bArr;
        this.f107188r = bArr2;
        this.f107189s = num2;
        this.f107191u = l5;
        this.f107192v = l6;
        if (z) {
            this.f107171a = (TaskIdEntity) taskId2;
            this.f107181k = (DateTimeEntity) dateTime3;
            this.f107182l = (DateTimeEntity) dateTime4;
            this.f107183m = (LocationEntity) location2;
            this.f107184n = (LocationGroupEntity) locationGroup2;
            this.f107187q = (RecurrenceInfoEntity) recurrenceInfo2;
            this.f107190t = (ExternalApplicationLinkEntity) externalApplicationLink2;
            return;
        }
        ExternalApplicationLinkEntity externalApplicationLinkEntity = null;
        if (taskId2 != null) {
            taskIdEntity = new TaskIdEntity(taskId);
        } else {
            taskIdEntity = null;
        }
        this.f107171a = taskIdEntity;
        if (dateTime3 != null) {
            dateTimeEntity = new DateTimeEntity(dateTime3);
        } else {
            dateTimeEntity = null;
        }
        this.f107181k = dateTimeEntity;
        if (dateTime4 != null) {
            dateTimeEntity2 = new DateTimeEntity(dateTime4);
        } else {
            dateTimeEntity2 = null;
        }
        this.f107182l = dateTimeEntity2;
        if (location2 != null) {
            locationEntity = new LocationEntity(location2);
        } else {
            locationEntity = null;
        }
        this.f107183m = locationEntity;
        if (locationGroup2 != null) {
            locationGroupEntity = new LocationGroupEntity(locationGroup2);
        } else {
            locationGroupEntity = null;
        }
        this.f107184n = locationGroupEntity;
        if (recurrenceInfo2 != null) {
            recurrenceInfoEntity = new RecurrenceInfoEntity(recurrenceInfo2);
        } else {
            recurrenceInfoEntity = null;
        }
        this.f107187q = recurrenceInfoEntity;
        this.f107190t = externalApplicationLink2 != null ? new ExternalApplicationLinkEntity(externalApplicationLink2) : externalApplicationLinkEntity;
    }

    /* renamed from: a */
    public static boolean m92179a(Task task, Task task2) {
        return sdg.m34949a(task.mo58701c(), task2.mo58701c()) && sdg.m34949a(task.mo58702d(), task2.mo58702d()) && sdg.m34949a(task.mo58704f(), task2.mo58704f()) && sdg.m34949a(task.mo58705g(), task2.mo58705g()) && sdg.m34949a(task.mo58706h(), task2.mo58706h()) && sdg.m34949a(task.mo58707i(), task2.mo58707i()) && sdg.m34949a(task.mo58708j(), task2.mo58708j()) && sdg.m34949a(task.mo58709k(), task2.mo58709k()) && sdg.m34949a(task.mo58710l(), task2.mo58710l()) && sdg.m34949a(task.mo58711m(), task2.mo58711m()) && sdg.m34949a(task.mo58712n(), task2.mo58712n()) && sdg.m34949a(task.mo58713o(), task2.mo58713o()) && sdg.m34949a(task.mo58714p(), task2.mo58714p()) && sdg.m34949a(task.mo58715q(), task2.mo58715q()) && sdg.m34949a(task.mo58716r(), task2.mo58716r()) && sdg.m34949a(task.mo58717u(), task2.mo58717u()) && sdg.m34949a(task.mo58718v(), task2.mo58718v()) && sdg.m34949a(task.mo58719w(), task2.mo58719w()) && sdg.m34949a(task.mo58721x(), task2.mo58721x()) && sdg.m34949a(task.mo58722y(), task2.mo58722y()) && sdg.m34949a(task.mo58723z(), task2.mo58723z());
    }

    public TaskEntity(TaskIdEntity taskIdEntity, Integer num, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l3, DateTimeEntity dateTimeEntity, DateTimeEntity dateTimeEntity2, LocationEntity locationEntity, LocationGroupEntity locationGroupEntity, Long l4, byte[] bArr, RecurrenceInfoEntity recurrenceInfoEntity, byte[] bArr2, Integer num2, ExternalApplicationLinkEntity externalApplicationLinkEntity, Long l5, Long l6) {
        this.f107171a = taskIdEntity;
        this.f107172b = num;
        this.f107173c = str;
        this.f107174d = l;
        this.f107175e = l2;
        this.f107176f = bool;
        this.f107177g = bool2;
        this.f107178h = bool3;
        this.f107179i = bool4;
        this.f107180j = l3;
        this.f107181k = dateTimeEntity;
        this.f107182l = dateTimeEntity2;
        this.f107183m = locationEntity;
        this.f107184n = locationGroupEntity;
        this.f107185o = l4;
        this.f107186p = bArr;
        this.f107187q = recurrenceInfoEntity;
        this.f107188r = bArr2;
        this.f107189s = num2;
        this.f107190t = externalApplicationLinkEntity;
        this.f107191u = l5;
        this.f107192v = l6;
    }
}
