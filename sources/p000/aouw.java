package p000;

import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.WeeklyPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: aouw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aouw extends aouv {

    /* renamed from: b */
    private final List f83651b;

    public aouw(Recurrence recurrence) {
        super(recurrence);
        this.f83651b = Collections.unmodifiableList(new ArrayList(m69577a(((RecurrenceEntity) recurrence).f107163f)));
    }

    /* renamed from: a */
    private static SortedSet m69577a(WeeklyPattern weeklyPattern) {
        TreeSet treeSet = new TreeSet();
        for (Integer num : weeklyPattern.mo58729c()) {
            treeSet.add(Integer.valueOf(num.intValue()));
        }
        return treeSet;
    }

    /* renamed from: b */
    public final DateTime mo46922b(DateTime dateTime) {
        SortedSet a = m69577a(((RecurrenceEntity) this.f83646a).f107163f);
        while (!a.contains(Integer.valueOf(aouq.m69550b(dateTime))) && mo46924c(dateTime)) {
            dateTime = aouq.m69547a(dateTime, 1);
        }
        return dateTime;
    }

    /* renamed from: a */
    public final DateTime mo46920a(DateTime dateTime) {
        boolean z;
        if (this.f83651b.size() == 1) {
            return aouq.m69551b(dateTime, mo46923b());
        }
        int b = aouq.m69550b(dateTime);
        int indexOf = this.f83651b.indexOf(Integer.valueOf(b));
        if (indexOf >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (indexOf == this.f83651b.size() - 1) {
            return aouq.m69547a(aouq.m69551b(dateTime, mo46923b()), -(b - ((Integer) this.f83651b.get(0)).intValue()));
        }
        return aouq.m69547a(dateTime, ((Integer) this.f83651b.get(indexOf + 1)).intValue() - b);
    }

    /* renamed from: a */
    public final void mo46921a() {
        sdo.m34974b(((RecurrenceEntity) this.f83646a).f107158a.intValue() == 1);
        sdo.m34959a(((RecurrenceEntity) this.f83646a).f107163f);
        sdo.m34959a(((RecurrenceEntity) this.f83646a).f107163f.mo58729c());
        sdo.m34974b(!((RecurrenceEntity) this.f83646a).f107163f.mo58729c().isEmpty());
    }
}
