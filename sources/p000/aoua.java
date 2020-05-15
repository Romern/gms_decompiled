package p000;

import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationEntity;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.LocationGroupEntity;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;

/* renamed from: aoua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoua {

    /* renamed from: a */
    public TaskId f83606a;

    /* renamed from: b */
    public Long f83607b;

    /* renamed from: c */
    private Integer f83608c;

    /* renamed from: d */
    private String f83609d;

    /* renamed from: e */
    private Long f83610e;

    /* renamed from: f */
    private Boolean f83611f;

    /* renamed from: g */
    private Boolean f83612g;

    /* renamed from: h */
    private Boolean f83613h;

    /* renamed from: i */
    private Boolean f83614i;

    /* renamed from: j */
    private Long f83615j;

    /* renamed from: k */
    private DateTime f83616k;

    /* renamed from: l */
    private DateTime f83617l;

    /* renamed from: m */
    private Location f83618m;

    /* renamed from: n */
    private LocationGroup f83619n;

    /* renamed from: o */
    private Long f83620o;

    /* renamed from: p */
    private byte[] f83621p;

    /* renamed from: q */
    private RecurrenceInfo f83622q;

    /* renamed from: r */
    private byte[] f83623r;

    /* renamed from: s */
    private Integer f83624s;

    /* renamed from: t */
    private ExternalApplicationLink f83625t;

    public aoua() {
    }

    /* renamed from: a */
    public final Task mo46899a() {
        return new TaskEntity(this.f83606a, this.f83608c, this.f83609d, this.f83607b, this.f83610e, this.f83611f, this.f83612g, this.f83613h, this.f83614i, this.f83615j, this.f83616k, this.f83617l, this.f83618m, this.f83619n, this.f83620o, this.f83621p, this.f83622q, this.f83623r, this.f83624s, this.f83625t, null, null, true);
    }

    public aoua(Task task) {
        TaskIdEntity taskIdEntity;
        DateTimeEntity dateTimeEntity;
        DateTimeEntity dateTimeEntity2;
        LocationEntity locationEntity;
        LocationGroupEntity locationGroupEntity;
        RecurrenceInfoEntity recurrenceInfoEntity;
        ExternalApplicationLinkEntity externalApplicationLinkEntity = null;
        if (task.mo58701c() != null) {
            taskIdEntity = new TaskIdEntity(task.mo58701c());
        } else {
            taskIdEntity = null;
        }
        this.f83606a = taskIdEntity;
        this.f83608c = task.mo58702d();
        this.f83609d = task.mo58704f();
        this.f83607b = task.mo58705g();
        this.f83610e = task.mo58706h();
        this.f83611f = task.mo58707i();
        this.f83612g = task.mo58708j();
        this.f83613h = task.mo58709k();
        this.f83614i = task.mo58710l();
        this.f83615j = task.mo58711m();
        if (task.mo58712n() != null) {
            dateTimeEntity = new DateTimeEntity(task.mo58712n());
        } else {
            dateTimeEntity = null;
        }
        this.f83616k = dateTimeEntity;
        if (task.mo58713o() != null) {
            dateTimeEntity2 = new DateTimeEntity(task.mo58713o());
        } else {
            dateTimeEntity2 = null;
        }
        this.f83617l = dateTimeEntity2;
        if (task.mo58714p() != null) {
            locationEntity = new LocationEntity(task.mo58714p());
        } else {
            locationEntity = null;
        }
        this.f83618m = locationEntity;
        if (task.mo58715q() != null) {
            locationGroupEntity = new LocationGroupEntity(task.mo58715q());
        } else {
            locationGroupEntity = null;
        }
        this.f83619n = locationGroupEntity;
        this.f83620o = task.mo58716r();
        this.f83621p = task.mo58717u();
        if (task.mo58718v() != null) {
            recurrenceInfoEntity = new RecurrenceInfoEntity(task.mo58718v());
        } else {
            recurrenceInfoEntity = null;
        }
        this.f83622q = recurrenceInfoEntity;
        this.f83623r = task.mo58719w();
        this.f83624s = task.mo58721x();
        this.f83625t = task.mo58722y() != null ? new ExternalApplicationLinkEntity(task.mo58722y()) : externalApplicationLinkEntity;
    }

    /* renamed from: a */
    public final void mo46900a(DateTime dateTime) {
        this.f83616k = dateTime != null ? (DateTime) dateTime.mo7556bF() : null;
    }
}
