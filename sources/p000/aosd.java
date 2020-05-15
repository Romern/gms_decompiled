package p000;

import com.google.android.gms.reminders.model.Time;

/* renamed from: aosd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aosd {
    /* renamed from: a */
    public static long m69442a(Time time) {
        return (((long) time.mo58724c().intValue()) * 3600000) + (((long) time.mo58725d().intValue()) * 60000) + (((long) time.mo58727f().intValue()) * 1000);
    }

    /* renamed from: a */
    public static Time m69443a(long j) {
        boolean z = false;
        if (j >= 0 && j < 86400000) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Invalid timestamp:");
        sb.append(j);
        sdo.m34975b(z, sb.toString());
        int i = (int) (j / 3600000);
        long j2 = j - (((long) i) * 3600000);
        int i2 = (int) (j2 / 60000);
        aoue aoue = new aoue();
        aoue.f83627a = Integer.valueOf(i);
        aoue.f83628b = Integer.valueOf(i2);
        aoue.f83629c = Integer.valueOf((int) ((j2 - (((long) i2) * 60000)) / 1000));
        return aoue.mo46905a();
    }
}
