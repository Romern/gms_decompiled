package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TaskRef extends aotf implements Task {

    /* renamed from: f */
    private boolean f107090f = false;

    /* renamed from: g */
    private TaskIdRef f107091g;

    /* renamed from: h */
    private boolean f107092h = false;

    /* renamed from: i */
    private DateTimeRef f107093i;

    /* renamed from: j */
    private boolean f107094j = false;

    /* renamed from: k */
    private DateTimeRef f107095k;

    /* renamed from: l */
    private boolean f107096l = false;

    /* renamed from: m */
    private LocationRef f107097m;

    /* renamed from: n */
    private boolean f107098n = false;

    /* renamed from: o */
    private LocationGroupRef f107099o;

    /* renamed from: p */
    private boolean f107100p = false;

    /* renamed from: q */
    private RecurrenceInfoRef f107101q;

    /* renamed from: r */
    private boolean f107102r = false;

    /* renamed from: s */
    private ExternalApplicationLinkRef f107103s;

    /* renamed from: A */
    public final Long mo58700A() {
        return mo46855h(mo46858k("due_date_millis"));
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new TaskEntity(this);
    }

    /* renamed from: c */
    public final TaskId mo58701c() {
        if (!this.f107090f) {
            this.f107090f = true;
            DataHolder dataHolder = this.f43672a;
            int i = this.f43673b;
            int i2 = this.f83582e;
            String str = this.f83581d;
            this.f107091g = (!dataHolder.mo17773f(aotf.m69487b(str, "client_assigned_id"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "client_assigned_thread_id"), i, i2)) ? new TaskIdRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107091g;
    }

    /* renamed from: d */
    public final Integer mo58702d() {
        return mo46856i(mo46858k("task_list"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        if (this != obj) {
            return TaskEntity.m92179a(this, (Task) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58704f() {
        return mo25151d(mo46858k("title"));
    }

    /* renamed from: g */
    public final Long mo58705g() {
        return mo46855h(mo46858k("created_time_millis"));
    }

    /* renamed from: h */
    public final Long mo58706h() {
        return mo46855h(mo46858k("archived_time_ms"));
    }

    public final int hashCode() {
        return TaskEntity.m92178a(this);
    }

    /* renamed from: i */
    public final Boolean mo58707i() {
        return Boolean.valueOf(mo25150c(mo46858k("archived")));
    }

    /* renamed from: j */
    public final Boolean mo58708j() {
        return Boolean.valueOf(mo25150c(mo46858k("deleted")));
    }

    /* renamed from: k */
    public final Boolean mo58709k() {
        return Boolean.valueOf(mo25150c(mo46858k("pinned")));
    }

    /* renamed from: l */
    public final Boolean mo58710l() {
        return Boolean.valueOf(mo25150c(mo46858k("snoozed")));
    }

    /* renamed from: m */
    public final Long mo58711m() {
        return mo46855h(mo46858k("snoozed_time_millis"));
    }

    /* renamed from: n */
    public final DateTime mo58712n() {
        if (!this.f107092h) {
            this.f107092h = true;
            this.f107093i = !DateTimeRef.m91883a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("due_date_")) ? new DateTimeRef(this.f43672a, this.f43673b, this.f83581d.concat("due_date_")) : null;
        }
        return this.f107093i;
    }

    /* renamed from: o */
    public final DateTime mo58713o() {
        if (!this.f107094j) {
            this.f107094j = true;
            this.f107095k = !DateTimeRef.m91883a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("event_date_")) ? new DateTimeRef(this.f43672a, this.f43673b, this.f83581d.concat("event_date_")) : null;
        }
        return this.f107095k;
    }

    /* renamed from: p */
    public final Location mo58714p() {
        if (!this.f107096l) {
            this.f107096l = true;
            DataHolder dataHolder = this.f43672a;
            int i = this.f43673b;
            int i2 = this.f83582e;
            String str = this.f83581d;
            if (!dataHolder.mo17773f(aotf.m69487b(str, "lat"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "lng"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "name"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "radius_meters"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "location_type"), i, i2) || !FeatureIdProtoRef.m91897a(dataHolder, i, i2, str.concat("location_")) || !dataHolder.mo17773f(aotf.m69487b(str, "display_address"), i, i2) || !AddressRef.m91859a(dataHolder, i, i2, str.concat("address_")) || !dataHolder.mo17773f(aotf.m69487b(str, "location_alias_id"), i, i2)) {
                this.f107097m = new LocationRef(this.f43672a, this.f43673b, this.f83581d);
            } else {
                this.f107097m = null;
            }
        }
        return this.f107097m;
    }

    /* renamed from: q */
    public final LocationGroup mo58715q() {
        if (!this.f107098n) {
            this.f107098n = true;
            DataHolder dataHolder = this.f43672a;
            int i = this.f43673b;
            int i2 = this.f83582e;
            String str = this.f83581d;
            this.f107099o = (!dataHolder.mo17773f(aotf.m69487b(str, "location_query"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "location_query_type"), i, i2) || !ChainInfoRef.m91874a(dataHolder, i, i2, str) || !CategoryInfoRef.m91869a(dataHolder, i, i2, str)) ? new LocationGroupRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107099o;
    }

    /* renamed from: r */
    public final Long mo58716r() {
        return mo46855h(mo46858k("location_snoozed_until_ms"));
    }

    /* renamed from: u */
    public final byte[] mo58717u() {
        return mo25152e(mo46858k("extensions"));
    }

    /* renamed from: v */
    public final RecurrenceInfo mo58718v() {
        if (!this.f107100p) {
            this.f107100p = true;
            DataHolder dataHolder = this.f43672a;
            int i = this.f43673b;
            int i2 = this.f83582e;
            String str = this.f83581d;
            this.f107101q = (!RecurrenceRef.m91932a(dataHolder, i, i2, str) || !dataHolder.mo17773f(aotf.m69487b(str, "recurrence_id"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "recurrence_master"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "recurrence_exceptional"), i, i2)) ? new RecurrenceInfoRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107101q;
    }

    /* renamed from: w */
    public final byte[] mo58719w() {
        return mo25152e(mo46858k("assistance"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoub.m69520a(new TaskEntity(this), parcel, i);
    }

    /* renamed from: x */
    public final Integer mo58721x() {
        return mo46856i(mo46858k("experiment"));
    }

    /* renamed from: y */
    public final ExternalApplicationLink mo58722y() {
        if (!this.f107102r) {
            this.f107102r = true;
            DataHolder dataHolder = this.f43672a;
            int i = this.f43673b;
            int i2 = this.f83582e;
            String str = this.f83581d;
            this.f107103s = (!dataHolder.mo17773f(aotf.m69487b(str, "link_application"), i, i2) || !dataHolder.mo17773f(aotf.m69487b(str, "link_id"), i, i2)) ? new ExternalApplicationLinkRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107103s;
    }

    /* renamed from: z */
    public final Long mo58723z() {
        return mo46855h(mo46858k("fired_time_millis"));
    }

    public TaskRef(DataHolder dataHolder, int i) {
        super(dataHolder, i, "");
    }
}
