package p000;

import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: aoux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoux extends aouv {

    /* renamed from: b */
    private final List f83652b;

    public aoux(Recurrence recurrence) {
        super(recurrence);
        this.f83652b = Collections.unmodifiableList(new ArrayList(m69581a(((RecurrenceEntity) recurrence).f107165h)));
    }

    /* renamed from: a */
    private static SortedSet m69581a(YearlyPattern yearlyPattern) {
        TreeSet treeSet = new TreeSet();
        for (Integer num : yearlyPattern.mo58733d()) {
            treeSet.add(Integer.valueOf(num.intValue()));
        }
        return treeSet;
    }

    /* renamed from: b */
    public final DateTime mo46922b(DateTime dateTime) {
        SortedSet a = m69581a(((RecurrenceEntity) this.f83646a).f107165h);
        while (true) {
            if ((!a.contains(dateTime.mo58631d()) || !aous.m69564a(((RecurrenceEntity) this.f83646a).f107165h.mo58732c(), dateTime)) && mo46924c(dateTime)) {
                dateTime = aouq.m69547a(dateTime, 1);
            }
        }
        return dateTime;
    }

    /* renamed from: a */
    public final DateTime mo46920a(DateTime dateTime) {
        DateTime a;
        DateTime d = aouq.m69555d(dateTime);
        int intValue = dateTime.mo58633f().intValue();
        while (true) {
            DateTime a2 = aous.m69562a(((RecurrenceEntity) this.f83646a).f107165h.mo58732c(), d, intValue);
            if (a2 != null) {
                return a2;
            }
            Iterator it = this.f83652b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aotm aotm = new aotm(d);
                    aotm.f83588b = (Integer) this.f83652b.get(0);
                    DateTime a3 = aotm.mo46874a();
                    int b = mo46923b();
                    Calendar f = aouq.m69557f(a3);
                    f.add(1, b);
                    a = aouq.m69548a(f);
                    break;
                }
                int intValue2 = ((Integer) it.next()).intValue();
                if (intValue2 > d.mo58631d().intValue()) {
                    aotm aotm2 = new aotm(d);
                    aotm2.f83588b = Integer.valueOf(intValue2);
                    a = aotm2.mo46874a();
                    break;
                }
            }
            d = a;
            intValue = 0;
        }
    }

    /* renamed from: a */
    public final void mo46921a() {
        boolean z;
        if (((RecurrenceEntity) this.f83646a).f107158a.intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(((RecurrenceEntity) this.f83646a).f107165h);
        YearlyPatternEntity yearlyPatternEntity = ((RecurrenceEntity) this.f83646a).f107165h;
        sdo.m34959a(yearlyPatternEntity.mo58732c());
        sdo.m34959a(yearlyPatternEntity.mo58733d());
        sdo.m34974b(true ^ yearlyPatternEntity.mo58733d().isEmpty());
        aous.m69563a(yearlyPatternEntity.mo58732c());
    }
}
