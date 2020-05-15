package p000;

import android.content.Context;
import com.google.android.gms.reminders.model.CustomizedSnoozePreset;
import com.google.android.gms.reminders.model.Time;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* renamed from: aowr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowr {

    /* renamed from: a */
    public static final List f83779a = Arrays.asList(16, 4, 3, 5, 7, 13, 14, 12);

    @Deprecated
    /* renamed from: a */
    public static int m69713a(int i) {
        if (i == 1) {
            return ((Integer) aoss.f83549h.mo58455c()).intValue();
        }
        if (i == 2) {
            return ((Integer) aoss.f83550i.mo58455c()).intValue();
        }
        if (i == 3) {
            return ((Integer) aoss.f83551j.mo58455c()).intValue();
        }
        if (i != 4) {
            return 0;
        }
        return ((Integer) aoss.f83552k.mo58455c()).intValue();
    }

    /* renamed from: b */
    public static Calendar m69721b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        instance.clear();
        instance.set(i, i2, i3, 0, 0, 0);
        return instance;
    }

    /* renamed from: c */
    public static String m69723c(int i) {
        if (i != 3) {
            if (i == 4) {
                return (String) aoss.f83558q.mo58455c();
            }
            if (i != 5) {
                if (i != 7) {
                    if (i != 16) {
                        switch (i) {
                            case 12:
                            case 14:
                                return (String) aoss.f83561t.mo58455c();
                            case 13:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return (String) aoss.f83560s.mo58455c();
            }
        }
        return (String) aoss.f83559r.mo58455c();
    }

    /* renamed from: d */
    private static Time m69724d(int i) {
        boolean z = i >= 0 && i < 24;
        StringBuilder sb = new StringBuilder(29);
        sb.append("Invalid hourOfDay:");
        sb.append(i);
        sdo.m34975b(z, sb.toString());
        aoue aoue = new aoue();
        aoue.f83627a = Integer.valueOf(i);
        aoue.f83628b = 0;
        aoue.f83629c = 0;
        return aoue.mo46905a();
    }

    /* renamed from: b */
    public static boolean m69722b(int i) {
        return f83779a.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static long m69714a(long j) {
        Calendar b = m69721b(j);
        b.add(5, 1);
        return b.getTimeInMillis();
    }

    /* renamed from: a */
    public static long m69715a(long j, int i, boolean z) {
        sdo.m34974b(true);
        return !z ? j & ((1 << i) ^ -1) : j | (1 << i);
    }

    /* renamed from: a */
    public static Time m69716a(Context context, CustomizedSnoozePreset customizedSnoozePreset, Integer num) {
        if (!aowz.m69769a(context) || customizedSnoozePreset == null) {
            return m69724d(m69713a(num.intValue()));
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return customizedSnoozePreset.mo58745a();
        }
        if (intValue == 2) {
            return customizedSnoozePreset.mo58746b();
        }
        if (intValue == 3) {
            return customizedSnoozePreset.mo58747c();
        }
        if (intValue != 4) {
            return m69724d(0);
        }
        return m69724d(((Integer) aoss.f83556o.mo58455c()).intValue());
    }

    /* renamed from: a */
    public static Long m69717a(Context context, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l, CustomizedSnoozePreset customizedSnoozePreset) {
        if (l != null) {
            return l;
        }
        if (num == null || num2 == null || num3 == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        instance.clear();
        if (num4 != null && num5 != null && num6 != null) {
            instance.set(num.intValue(), num2.intValue() - 1, num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue());
        } else if (num7 != null) {
            Time a = m69716a(context, customizedSnoozePreset, num7);
            instance.set(num.intValue(), num2.intValue() - 1, num3.intValue(), a.mo58724c().intValue(), a.mo58725d().intValue(), a.mo58727f().intValue());
        } else {
            instance.set(num.intValue(), num2.intValue() - 1, num3.intValue(), 0, 0, 0);
        }
        return Long.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: a */
    public static String m69718a(CharSequence charSequence, List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            if (!z) {
                sb.append(charSequence);
            }
            sb.append(longValue);
            i++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m69719a(long j, int i) {
        sdo.m34974b(true);
        return (j & (1 << i)) != 0;
    }

    /* renamed from: a */
    public static int[] m69720a(List list) {
        if (list == null) {
            return null;
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }
}
